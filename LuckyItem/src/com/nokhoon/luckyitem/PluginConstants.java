package com.nokhoon.luckyitem;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.NamedTextColor;

public class PluginConstants {
	public static final TextComponent HEADER_ERROR = Component.text("[Error] ").color(NamedTextColor.DARK_RED);
	public static final TextComponent HEADER_WARNING = Component.text("[Warning] ", NamedTextColor.GOLD);
	public static final TextComponent HEADER_INFO = Component.text("[Info] ", NamedTextColor.DARK_GREEN);
	
	public static final TextComponent NO_PERMISSION = warning("권한이 없습니다.");
	public static final TextComponent PLAYER_COMMAND = warning("플레이어 전용 명령어입니다.");
	public static final TextComponent NOT_ENOUGH_SPACE = warning("인벤토리가 가득 찼습니다!");
	
	public static final TextComponent error(String message) {
		return HEADER_ERROR.append(Component.text(message, NamedTextColor.RED));
	}
	public static final TextComponent warning(String message) {
		return HEADER_WARNING.append(Component.text(message, NamedTextColor.YELLOW));
	}
	public static final TextComponent info(String message) {
		return HEADER_INFO.append(Component.text(message, NamedTextColor.GREEN));
	}
}
