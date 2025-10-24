package com.nokhoon.luckyitem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

import org.bukkit.Color;
import org.bukkit.DyeColor;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Material;
import org.bukkit.Tag;
import org.bukkit.block.DecoratedPot;
import org.bukkit.block.DecoratedPot.Side;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ArmorMeta;
import org.bukkit.inventory.meta.BlockStateMeta;
import org.bukkit.inventory.meta.CrossbowMeta;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.OminousBottleMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.inventory.meta.ShieldMeta;
import org.bukkit.inventory.meta.SuspiciousStewMeta;
import org.bukkit.inventory.meta.trim.ArmorTrim;
import org.bukkit.inventory.meta.trim.TrimMaterial;
import org.bukkit.inventory.meta.trim.TrimPattern;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

import io.papermc.paper.potion.SuspiciousEffectEntry;
import io.papermc.paper.registry.RegistryAccess;
import io.papermc.paper.registry.RegistryKey;

public class ItemPool extends HashMap<Material, Rarity> {
	private static final long serialVersionUID = 0x0804ac0804acL;
	private static final ArrayList<Enchantment> TREASURE_ENCHANTMENTS = new ArrayList<Enchantment>(8);
	private static final SuspiciousEffectEntry[] SUSPICIOUS_STEW_EFFECTS;
	
	private Random rng;
	private int total = Integer.MIN_VALUE;
	
	static {
		TREASURE_ENCHANTMENTS.add(Enchantment.BINDING_CURSE);
		TREASURE_ENCHANTMENTS.add(Enchantment.FROST_WALKER);
		TREASURE_ENCHANTMENTS.add(Enchantment.MENDING);
		TREASURE_ENCHANTMENTS.add(Enchantment.SOUL_SPEED);
		TREASURE_ENCHANTMENTS.add(Enchantment.SWIFT_SNEAK);
		TREASURE_ENCHANTMENTS.add(Enchantment.VANISHING_CURSE);
		TREASURE_ENCHANTMENTS.add(Enchantment.WIND_BURST);
		
		SUSPICIOUS_STEW_EFFECTS = new SuspiciousEffectEntry[] {
				SuspiciousEffectEntry.create(PotionEffectType.FIRE_RESISTANCE, 60), 
				SuspiciousEffectEntry.create(PotionEffectType.BLINDNESS, 220), 
				SuspiciousEffectEntry.create(PotionEffectType.SATURATION, 7), 
				SuspiciousEffectEntry.create(PotionEffectType.NAUSEA, 140), 
				SuspiciousEffectEntry.create(PotionEffectType.JUMP_BOOST, 100), 
				SuspiciousEffectEntry.create(PotionEffectType.POISON, 220), 
				SuspiciousEffectEntry.create(PotionEffectType.REGENERATION, 140), 
				SuspiciousEffectEntry.create(PotionEffectType.NIGHT_VISION, 100), 
				SuspiciousEffectEntry.create(PotionEffectType.WEAKNESS, 140), 
				SuspiciousEffectEntry.create(PotionEffectType.WITHER, 140), 
				SuspiciousEffectEntry.create(PotionEffectType.JUMP_BOOST, 160), 
				SuspiciousEffectEntry.create(PotionEffectType.BLINDNESS, 120), 
				SuspiciousEffectEntry.create(PotionEffectType.POISON, 280)
		};
	}
	
	public ItemPool(long seed) {
		super(12, 0.5F);
		rng = new Random(seed);
	}
	
	public int getTotalTier() {
		if(total > 0) return total;
		int sum = 0;
		for(Rarity r : values()) sum += r.getWeight();
		total = sum;
		return total;
	}
	
	public ItemStack getRandomItem() {
		ItemStack result = null;
		var entries = entrySet();
		int randomNumber = rng.nextInt(getTotalTier());
		int check = 0;
		for(var entry : entries) {
			Material key = entry.getKey();
			Rarity value = entry.getValue();
			check += value.getWeight();
			if(randomNumber < check) {
				//종류와 수량
				result = new ItemStack(key);
				int extra = rng.nextInt(value.getWeight());
				result.add(extra);
				
				ItemMeta meta = result.getItemMeta();
				//도자기 조각
				if(meta instanceof BlockStateMeta && key.equals(Material.DECORATED_POT) && rng.nextInt(2) == 0) {
					BlockStateMeta pot = (BlockStateMeta) meta;
					DecoratedPot state = (DecoratedPot) pot.getBlockState();
					state.setSherd(Side.FRONT, randomSherd(rng));
					state.setSherd(Side.BACK, randomSherd(rng));
					state.setSherd(Side.LEFT, randomSherd(rng));
					state.setSherd(Side.RIGHT, randomSherd(rng));
					pot.setBlockState(state);
					result.setItemMeta(pot);
					meta = result.getItemMeta();
				}
				//내구도
				if(meta instanceof Damageable) {
					Damageable d = (Damageable) meta;
					short max = key.getMaxDurability();
					if(max > 0) {
						d.setDamage(rng.nextInt(max));
						result.setItemMeta(meta);
						meta = result.getItemMeta();
					}
				}
				//인챈트
				ArrayList<Enchantment> candidates = new ArrayList<Enchantment>();
				Iterator<Enchantment> iterator = RegistryAccess.registryAccess().getRegistry(RegistryKey.ENCHANTMENT).iterator();
				while(iterator.hasNext()) {
					Enchantment ench = iterator.next();
					if(ench.canEnchantItem(result)) candidates.add(ench);
				}
				int size = candidates.size();
				if(size > 0) {
					var applied = new HashMap<Enchantment, Integer>(size * 2);
					boolean conflict = false;
					Collections.shuffle(candidates, rng);
					for(int i = rng.nextInt(size * 2); i < size; i++) {
						conflict = false;
						Enchantment ench = candidates.get(rng.nextInt(size));
						for(Enchantment e : applied.keySet()) {
							if(e.conflictsWith(ench)) {
								conflict = true;
								break;
							}
						}
						if(conflict || (TREASURE_ENCHANTMENTS.contains(ench) && rng.nextInt(16) != 0)) continue;
						applied.put(ench, rng.nextInt(1, ench.getMaxLevel() + 1));
					}
					result.addEnchantments(applied);
				}
				//석궁
				if(meta instanceof CrossbowMeta) {
					CrossbowMeta crossbow = (CrossbowMeta) meta;
					switch(rng.nextInt(10)) {
					case 3, 4, 5 -> { crossbow.addChargedProjectile(new ItemStack(Material.ARROW)); }
					case 6, 7 -> { crossbow.addChargedProjectile(new ItemStack(Material.SPECTRAL_ARROW)); }
					case 8 -> {
						ItemStack arrow = new ItemStack(Material.TIPPED_ARROW);
						PotionMeta arrowMeta = (PotionMeta) (arrow.getItemMeta());
						arrowMeta.setBasePotionType(randomPotionType(rng));
						arrow.setItemMeta(arrowMeta);
						crossbow.addChargedProjectile(arrow);
					}
					case 9 -> {
						ItemStack firework = new ItemStack(Material.FIREWORK_ROCKET);
						FireworkMeta fireworkMeta = (FireworkMeta) (firework.getItemMeta());
						for(int i = rng.nextInt(5); i < 3; i++) fireworkMeta.addEffect(randomFireworkEffect(rng));
						fireworkMeta.setPower(rng.nextInt(3) + 1);
						firework.setItemMeta(fireworkMeta);
						crossbow.addChargedProjectile(firework);
					}
					default -> { crossbow.setChargedProjectiles(null); }
					}
					result.setItemMeta(crossbow);
				}
				//물약
				else if(meta instanceof PotionMeta) {
					PotionMeta potion = (PotionMeta) meta;
					potion.setBasePotionType(randomPotionType(rng));
					result.setItemMeta(potion);
				}
				//폭죽
				else if(meta instanceof FireworkMeta) {
					FireworkMeta firework = (FireworkMeta) meta;
					for(int i = rng.nextInt(5); i < 3; i++) firework.addEffect(randomFireworkEffect(rng));
					firework.setPower(rng.nextInt(1, 4));
					result.setItemMeta(firework);
				}
				//수상한 스튜
				else if(meta instanceof SuspiciousStewMeta) {
					SuspiciousStewMeta stew = (SuspiciousStewMeta) meta;
					SuspiciousEffectEntry effect = SUSPICIOUS_STEW_EFFECTS[rng.nextInt(SUSPICIOUS_STEW_EFFECTS.length)];
					stew.addCustomEffect(effect, true);
					result.setItemMeta(stew);
				}
				//가죽 갑옷 염색
				else if(meta instanceof LeatherArmorMeta && rng.nextInt(2) == 0) {
					LeatherArmorMeta armor = (LeatherArmorMeta) meta;
					DyeColor[] dyes = randomDyes(rng);
					Color primary = dyes[0].getColor();
					int colors = dyes.length;
					if(colors > 1) {
						DyeColor[] secondary = new DyeColor[colors - 1];
						System.arraycopy(dyes, 1, secondary, 0, colors - 1);
						for(DyeColor dye : secondary) primary = primary.mixColors(dye.getColor());
					}
					armor.setColor(primary);
					result.setItemMeta(armor);
				}
				meta = result.getItemMeta();
				//갑옷 형판
				if(meta instanceof ArmorMeta && rng.nextInt(4) == 0) {
					ArmorMeta armor = (ArmorMeta) meta;
					armor.setTrim(randomArmorTrim(rng));
					result.setItemMeta(armor);
					meta = result.getItemMeta();
				}
				//흉조 물약
				else if(meta instanceof OminousBottleMeta) {
					OminousBottleMeta bottle = (OminousBottleMeta) meta;
					bottle.setAmplifier(rng.nextInt(5));
					result.setItemMeta(bottle);
					meta = result.getItemMeta();
				}
				//방패
				else if(meta instanceof ShieldMeta && rng.nextInt(2) == 0) {
					ShieldMeta shield = (ShieldMeta) meta;
					shield.setBaseColor(DyeColor.values()[rng.nextInt(DyeColor.values().length)]);
					result.setItemMeta(shield);
					meta = result.getItemMeta();
				}
				return result;
			}
		}
		return null;
	}
	
	public void updateSeed() {
		rng.setSeed(System.currentTimeMillis() ^ 0x0804acL);
	}
	
	private static PotionType randomPotionType(Random rng) {
		PotionType[] types = PotionType.values();
		PotionType type = types[rng.nextInt(types.length)];
		return rng.nextInt(2) == 0 ? PotionType.WATER : type;
	}
	
	private static FireworkEffect randomFireworkEffect(Random rng) {
		return FireworkEffect.builder().flicker(rng.nextInt(3) == 0).trail(rng.nextInt(5) == 0).with(switch(rng.nextInt(7)) {
		case 3 -> { yield Type.BALL_LARGE; }
		case 4 -> { yield Type.BURST; }
		case 5 -> { yield Type.CREEPER; }
		case 6 -> { yield Type.STAR; }
		default -> { yield Type.BALL; }
		}).withColor(dyesToFireworkColors(randomDyes(rng))).withFade(dyesToFireworkColors(randomDyes(rng))).build();
	}
	
	private static DyeColor[] randomDyes(Random rng) {
		DyeColor[] values = DyeColor.values();
		DyeColor[] dyes = new DyeColor[rng.nextInt(1, 4)];
		for(int i = 0; i < dyes.length; i++) {
			dyes[i] = values[rng.nextInt(values.length)];
		}
		return dyes;
	}
	
	private static Color[] dyesToFireworkColors(DyeColor[] dyes) {
		Color[] colors = new Color[dyes.length];
		for(int i = 0; i < colors.length; i++) colors[i] = dyes[i].getFireworkColor();
		return colors;
	}
	
	private static ArmorTrim randomArmorTrim(Random rng) {
		TrimMaterial material = null;
		TrimPattern pattern = null;
		int index = rng.nextInt(RegistryAccess.registryAccess().getRegistry(RegistryKey.TRIM_MATERIAL).size());
		Iterator<TrimMaterial> materialIterator = RegistryAccess.registryAccess().getRegistry(RegistryKey.TRIM_MATERIAL).iterator();
		int i;
		for(i = 0; i < index; i++) materialIterator.next();
		material = materialIterator.next();
		index = rng.nextInt(RegistryAccess.registryAccess().getRegistry(RegistryKey.TRIM_PATTERN).size());
		Iterator<TrimPattern> patternIterator = RegistryAccess.registryAccess().getRegistry(RegistryKey.TRIM_PATTERN).iterator();
		for(i = 0; i < index; i++) patternIterator.next();
		pattern = patternIterator.next();
		return new ArmorTrim(material, pattern);
	}
	
	private static Material randomSherd(Random rng) {
		if(rng.nextInt(2) == 0) return Material.BRICK;
		int index = rng.nextInt(Tag.ITEMS_DECORATED_POT_SHERDS.getValues().size());
		Iterator<Material> iterator = Tag.ITEMS_DECORATED_POT_SHERDS.getValues().iterator();
		for(int i = 0; i < index; i++) iterator.next();
		return iterator.next();
	}
}
