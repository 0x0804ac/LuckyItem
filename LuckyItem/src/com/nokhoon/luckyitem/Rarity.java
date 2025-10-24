package com.nokhoon.luckyitem;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.NamedTextColor;

public enum Rarity {
	COMMON(32, Component.text("[일반] ").color(NamedTextColor.WHITE)),
	UNCOMMON(16, Component.text("[고급] ", NamedTextColor.GREEN)),
	RARE(8, Component.text("[희귀] ", NamedTextColor.BLUE)),
	EPIC(4, Component.text("[영웅] ", NamedTextColor.DARK_PURPLE)),
	LEGENDARY(2, Component.text("[전설] ", NamedTextColor.GOLD)),
	MYSTIC(1, Component.text("[신화] ", NamedTextColor.AQUA));
	
	private final int weight;
	private final TextComponent prefix;
	
	private Rarity(int chance, TextComponent text) {
		weight = chance;
		prefix = text;
	}
	
	public final int getWeight() { return weight; }
	public final TextComponent getPrefix() { return prefix; }
}
