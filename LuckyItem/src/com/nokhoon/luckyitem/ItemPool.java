package com.nokhoon.luckyitem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

import org.bukkit.Color;
import org.bukkit.DyeColor;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.CrossbowMeta;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.inventory.meta.SuspiciousStewMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

public class ItemPool extends HashMap<Material, Rarity> {
	private static final long serialVersionUID = 0x0804ac0804acL;
	private static final PotionEffect[] SUSPICIOUS_STEW_EFFECTS;
	private Random rng;
	
	static {
		SUSPICIOUS_STEW_EFFECTS = new PotionEffect[] {
				new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 80, 0), 
				new PotionEffect(PotionEffectType.BLINDNESS, 160, 0), 
				new PotionEffect(PotionEffectType.SATURATION, 7, 0), 
				new PotionEffect(PotionEffectType.JUMP, 120, 0), 
				new PotionEffect(PotionEffectType.POISON, 240, 0), 
				new PotionEffect(PotionEffectType.REGENERATION, 160, 0), 
				new PotionEffect(PotionEffectType.NIGHT_VISION, 100, 0), 
				new PotionEffect(PotionEffectType.WEAKNESS, 180, 0), 
				new PotionEffect(PotionEffectType.WITHER, 160, 0), 
				new PotionEffect(PotionEffectType.JUMP, 160, 0), 
				new PotionEffect(PotionEffectType.WEAKNESS, 140, 0), 
				new PotionEffect(PotionEffectType.BLINDNESS, 120, 0), 
				new PotionEffect(PotionEffectType.POISON, 280, 0)
		};
	}
	
	public ItemPool(long seed) {
		super(12, 0.5F);
		rng = new Random(seed);
	}
	
	public int getTotalTier() {
		int sum = 0;
		for(Rarity r : values()) sum += r.getWeight();
		return sum;
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
				int extra = rng.nextInt(value.getWeight() + 1);
				result.add(extra);
				
				ItemMeta meta = result.getItemMeta();
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
				ArrayList<Enchantment> candidates = new ArrayList<Enchantment>(6);
				for(Enchantment ench : Enchantment.values()) if(ench.canEnchantItem(result)) candidates.add(ench);
				int size = candidates.size();
				if(size > 0) {
					var applied = new HashMap<Enchantment, Integer>(size * 2);
					boolean conflict = false;
					Collections.shuffle(candidates, rng);
					for(int i = rng.nextInt(size * 2); i < size; i++) {
						Enchantment ench = candidates.get(rng.nextInt(size));
						for(Enchantment e : applied.keySet()) {
							if(e.conflictsWith(ench)) {
								conflict = true;
								break;
							}
						}
						if(!conflict && (!ench.isTreasure() || rng.nextInt(10) == 0)) applied.put(ench, 1 + rng.nextInt(ench.getMaxLevel()));
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
						arrowMeta.setBasePotionData(randomPotionData(rng));
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
					potion.setBasePotionData(randomPotionData(rng));
					result.setItemMeta(potion);
				}
				//폭죽
				else if(meta instanceof FireworkMeta) {
					FireworkMeta firework = (FireworkMeta) meta;
					for(int i = rng.nextInt(5); i < 3; i++) firework.addEffect(randomFireworkEffect(rng));
					firework.setPower(rng.nextInt(3) + 1);
					result.setItemMeta(firework);
				}
				//수상한 스튜
				else if(meta instanceof SuspiciousStewMeta) {
					SuspiciousStewMeta stew = (SuspiciousStewMeta) meta;
					PotionEffect effect = SUSPICIOUS_STEW_EFFECTS[rng.nextInt(SUSPICIOUS_STEW_EFFECTS.length)];
					stew.addCustomEffect(effect, true);
					result.setItemMeta(stew);
				}
				//가죽 갑옷
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
				return result;
			}
		}
		return null;
	}
	
	public void updateSeed() {
		rng.setSeed(System.currentTimeMillis() ^ 0x0804acL);
	}
	
	private static PotionData randomPotionData(Random rng) {
		PotionType[] types = PotionType.values();
		PotionType type = types[rng.nextInt(types.length)];
		boolean isLong = false;
		boolean isStrong = false;
		switch(rng.nextInt(6)) {
		case 2, 3 -> isStrong = type.isUpgradeable();
		case 4, 5 -> isLong = type.isExtendable();
		}
		PotionData potion = new PotionData(type, isLong, isStrong);
		return potion;
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
		DyeColor[] dyes = new DyeColor[1 + rng.nextInt(3)];
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
}
