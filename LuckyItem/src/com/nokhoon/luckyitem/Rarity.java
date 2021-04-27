package com.nokhoon.luckyitem;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.NamedTextColor;

public enum Rarity {
	COMMON(15, Component.text("[일반] ").color(NamedTextColor.WHITE)),
	UNCOMMON(10, Component.text("[고급] ", NamedTextColor.GREEN)),
	RARE(6, Component.text("[희귀] ", NamedTextColor.BLUE)),
	EPIC(3, Component.text("[영웅] ", NamedTextColor.DARK_PURPLE)),
	LEGENDARY(1, Component.text("[전설] ", NamedTextColor.GOLD));
	
	private int weight;
	private TextComponent prefix;
	
	private Rarity(int chance, TextComponent text) {
		weight = chance;
		prefix = text;
	}
	
	public int getWeight() { return weight; }
	public TextComponent getPrefix() { return prefix; }
}
