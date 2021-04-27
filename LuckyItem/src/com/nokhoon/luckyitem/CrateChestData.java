package com.nokhoon.luckyitem;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;

public class CrateChestData {
	private static final ItemStack[] CHEST_ITEMSTACKS;
	private static final List<Component> CHEST_LORE;
	
	static {
		CHEST_LORE = Arrays.asList(Component.text("상자를 열려면 아이템을 들고 사용하세요.").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, false),
				Component.text("인벤토리가 가득 차면 사용할 수 없습니다!", NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
		ItemMeta ptr;
		CHEST_ITEMSTACKS = new ItemStack[Crate.TYPES_OF_CRATES];
		for(int i = 0; i < CHEST_ITEMSTACKS.length; i++) {
			CHEST_ITEMSTACKS[i] = new ItemStack(Material.CHEST);
			ptr = CHEST_ITEMSTACKS[i].getItemMeta();
			ptr.displayName(crateName(Crate.getByID(i)));
			ptr.lore(CHEST_LORE);
			CHEST_ITEMSTACKS[i].setItemMeta(ptr);
		}
	}
	
	public static final ItemStack[] getCrateChests() { return CHEST_ITEMSTACKS; }
	
	public static final ItemStack getRandomChest(long seed) {
		Random rng = new Random(seed);
		return CHEST_ITEMSTACKS[rng.nextInt(CHEST_ITEMSTACKS.length)];
	}
	
	private static Component crateName(Crate type) {
		return Component.text(type.getDisplayName() + " 상자", NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false);
	}
}
