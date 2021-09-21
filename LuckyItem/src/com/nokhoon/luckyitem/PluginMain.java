package com.nokhoon.luckyitem;

import java.util.function.Predicate;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;

public class PluginMain extends JavaPlugin implements Listener {
	private final ItemStack[] CRATE_CHEST = CrateChestData.getCrateChests();
	private final ItemPool[] CRATE_TABLE = CrateItemData.getCrateData();
	private BukkitTask supplyTask = null;
	
	private final Component CRATE_COMMAND_HELP = PluginConstants.error("사용법: /crate (이름/ID) [개수]");
	private Predicate<ItemStack> isCrateItem = item -> {
		for(ItemStack crate : CRATE_CHEST) {
			if(item.isSimilar(crate)) return true;
		}
		return false;
	};
	
	@Override
	public void onEnable() {
		startSupplyTask(getConfig().getInt("supply"));
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	@Override
	public void onDisable() {
		if(supplyTask != null) {
			supplyTask.cancel();
			supplyTask = null;
		}
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Audience audience = (Audience) sender;
		switch(label.toLowerCase()) {
		case "crate":
			if(args.length < 1 || args.length > 2) audience.sendMessage(CRATE_COMMAND_HELP);
			else {
				Crate crate = null;
				int id = -1;
				try {
					id = Integer.parseInt(args[0]);
					crate = Crate.getByID(id);
				} catch (NumberFormatException ne) {
					try {
						crate = Crate.valueOf(args[0].toUpperCase());
						id = crate.getID();
					} catch (IllegalArgumentException ae) {
						crate = null;
					}
				}
				if(crate == null) audience.sendMessage(PluginConstants.error("존재하지 않는 상자입니다."));
				else if(sender.isOp() && sender instanceof Player) {
					Player player = (Player) sender;
					int amount = 1;
					if(args.length == 2) try {
						amount = Integer.parseInt(args[1]);
					} catch (NumberFormatException e) {
						amount = 0;
					}
					if(amount < 1) audience.sendMessage(PluginConstants.error("개수는 자연수여야 합니다."));
					else {
						ItemStack item = new ItemStack(CRATE_CHEST[id]);
						item.setAmount(amount);
						if(player.getInventory().addItem(item).isEmpty()) audience.sendMessage(PluginConstants.info("성공적으로 지급되었습니다."));
						else audience.sendMessage(PluginConstants.warning("인벤토리 공간 부족으로 (일부) 아이템이 지급되지 않았습니다."));
					}
				} //상자 획득
				else {
					if(args.length == 1) {
						audience.sendMessage(CRATE_CHEST[id].getItemMeta().displayName());
						audience.sendMessage(Component.text(crate.getName(), NamedTextColor.YELLOW)
								.append(Component.text(" (ID: " + crate.getID() + ")", NamedTextColor.GRAY)));
					}
					else audience.sendMessage(PluginConstants.NO_PERMISSION);
				} //상자 정보
			}
			return true;
		case "rarity":
			if(args.length == 2) {
				Crate pool = null;
				Material target = null;
				try {
					target = Material.valueOf(args[1].toUpperCase());
					pool = Crate.getByID(Integer.parseInt(args[0]));
				} catch (NumberFormatException n) {
					try {
						pool = Crate.valueOf(args[0].toUpperCase());
					} catch (IllegalArgumentException i) {
						pool = null;
					}
				} catch (IllegalArgumentException i) {
					target = null;
				} finally {
					if(pool != null && target != null && target.isItem()) {
						ItemStack item = new ItemStack(target);
						Rarity rarity = CRATE_TABLE[pool.getID()].get(target);
						if(rarity == null) audience.sendMessage(PluginConstants.error("이 상자에 없는 아이템입니다. 정확한 이름을 입력하세요."));
						else audience.sendMessage(itemMessage(rarity, item));
					}
					else audience.sendMessage(PluginConstants.error("상자 또는 아이템이 없습니다. 정확한 이름을 입력하세요."));
				}
			}
			else audience.sendMessage(PluginConstants.error("사용법: /rarity (상자 이름/ID) (아이템)"));
			return true;
		case "supply":
			if(args.length > 1) audience.sendMessage(PluginConstants.error("사용법: /supply [초]"));
			else if(args.length == 1) {
				if(sender.isOp()) {
					try {
						int seconds = Integer.parseInt(args[0]);
						startSupplyTask(seconds);
						getConfig().set("supply", seconds);
						saveConfig();
						audience.sendMessage(PluginConstants.info("설정이 저장되었습니다."));
					} catch (NumberFormatException e) {
						audience.sendMessage(PluginConstants.error("시간을 초 단위로 입력하세요. 0 이하의 값은 보급품을 비활성화합니다."));
					}
				}
				else audience.sendMessage(PluginConstants.NO_PERMISSION);
			}
			else {
				int seconds = getConfig().getInt("supply");
				if(seconds > 0) audience.sendMessage(PluginConstants.info("보급품 지급 주기가 " + seconds + "초로 설정되어 있습니다."));
				else sender.sendMessage("보급품 지급이 비활성화되어 있습니다.");
			}
			return true;
		default: return false;
		}
	}
	
	@EventHandler
	public void openCrate(PlayerInteractEvent event) {
		Player player = event.getPlayer();
		Action action = event.getAction();
		Audience audience = (Audience) player;
		if(action != Action.RIGHT_CLICK_AIR && action != Action.RIGHT_CLICK_BLOCK) return;
		PlayerInventory inventory = player.getInventory();
		ItemStack selectedItem = inventory.getItem(event.getHand());
		Crate crate = null;
		ItemPool table = null;
		for(int i = 0; i < CRATE_CHEST.length; i++) {
			if(selectedItem.isSimilar(CRATE_CHEST[i])) {
				crate = Crate.getByID(i);
				table = CRATE_TABLE[i];
				break;
			}
		}
		if(crate == null) return;
		event.setCancelled(true);
		if(inventory.firstEmpty() == -1) {
			audience.sendMessage(PluginConstants.NOT_ENOUGH_SPACE);
			return;
		}
		table.updateSeed();
		ItemStack result = table.getRandomItem();
		Rarity rarity = table.get(result.getType());
		getServer().getScheduler().runTask(this, new Runnable() {
			public void run() {
				Component name = selectedItem.getItemMeta().displayName();
				selectedItem.subtract();
				inventory.addItem(result);
				switch(rarity) {
				case COMMON, UNCOMMON, RARE -> {
					audience.sendMessage(openMessage(name, result, rarity)
							.append(Component.text("개를 획득했습니다.", NamedTextColor.WHITE)));
					player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
				}
				case EPIC -> {
					((Audience) getServer()).sendMessage(broadcastMessage(player)
							.append(openMessage(name, result, rarity))
							.append(Component.text("개를 획득했습니다.", NamedTextColor.WHITE)));
					player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
				}
				case LEGENDARY -> {
					((Audience) getServer()).sendMessage(broadcastMessage(player)
							.append(openMessage(name, result, rarity)
							.append(Component.text("개를 획득했습니다!", NamedTextColor.WHITE))));
					player.getWorld().playSound(player.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 1.0F, 1.0F);
				}
				}
				player.updateInventory();
			}
		});
	}
	
	@EventHandler(ignoreCancelled = true)
	public void cancelCratePlacement(BlockPlaceEvent event) {
		if(isCrateItem.test(event.getItemInHand())) event.setBuild(false);
	}
	
	private void startSupplyTask(int seconds) {
		if(supplyTask != null) supplyTask.cancel();
		if(seconds > 0) supplyTask = getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
				int count = 0;
				for(Player player : getServer().getOnlinePlayers()) {
					if(player.isAfk() || player.getGameMode() == GameMode.SPECTATOR) continue;
					PlayerInventory inventory = player.getInventory();
					ItemStack item = CrateChestData.getRandomChest(System.currentTimeMillis() ^
							((long) player.getName().hashCode() + (long) player.getEntityId()));
					if(inventory.firstEmpty() == -1) player.getWorld().dropItem(player.getLocation(), item);
					else inventory.addItem(item);
					player.updateInventory();
					count++;
				}
				if(count > 0) ((Audience) getServer()).sendMessage(Component.text("보급품이 지급되었습니다!", NamedTextColor.AQUA));
			}
		}, seconds * 20L, seconds * 20L);
	}
	
	private Component broadcastMessage(Player player) {
		return Component.text(player.getName(), NamedTextColor.YELLOW).append(Component.text(" 님이 ", NamedTextColor.WHITE));
	}
	
	private Component itemMessage(Rarity rarity, ItemStack item) {
		Component prefix = rarity.getPrefix();
		return prefix.append(Component.translatable(item.getType().translationKey(), prefix.color()).hoverEvent(item));
	}
	
	private Component openMessage(Component crate, ItemStack item, Rarity rarity) {
		return crate
				.append(Component.text("에서 ", NamedTextColor.WHITE))
				.append(itemMessage(rarity, item))
				.append(Component.text(" " + item.getAmount(), NamedTextColor.YELLOW));
	}
}
