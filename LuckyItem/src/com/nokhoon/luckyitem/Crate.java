package com.nokhoon.luckyitem;

public enum Crate {
	ARMOR("armor", "갑옷", 0),
	AXE("axe", "도끼", 1),
	BLOCK("block", "블록", 2),
	BOOTS("boots", "신발", 3),
	CHESTPLATE("chestplate", "상의", 4),
	COMBAT("combat", "전투", 5),
	FOOD("food", "식료품", 6),
	HELMET("helmet", "헬멧", 7),
	HOE("hoe", "괭이", 8),
	LEGGINGS("leggings", "하의", 9),
	MATERIAL("material", "재료", 10),
	NATURE("nature", "자연", 11),
	NETHER("nether", "네더", 12),
	PICKAXE("pickaxe", "곡괭이", 13),
	POTION("potion", "물약", 14),
	PROJECTILE("projectile", "투사체", 15),
	REDSTONE("redstone", "레드스톤", 16),
	SHOVEL("shovel", "삽", 17),
	SWORD("sword", "칼", 18),
	TOOL("tool", "도구", 19),
	WEAPON("weapon", "무기", 20);
	
	public static final int TYPES_OF_CRATES = 21;
	
	private final String strID;
	private final String displayName;
	private final int numID;
	
	private Crate(String id, String name, int number) {
		strID = id;
		displayName = name;
		numID = number;
	}
	
	public final String getName() {
		return strID;
	}
	
	public final String getDisplayName() {
		return displayName;
	}
	
	public final int getID() {
		return numID;
	}
	
	public static Crate getByID(int id) {
		for(Crate c : Crate.values()) if(c.numID == id) return c;
		return null;
	}
}
