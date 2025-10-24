package com.nokhoon.luckyitem;

public enum Crate {
	ARMOR("armor", "갑옷", 0),
	AXE("axe", "도끼", 1),
	BLOCK("block", "블록", 2),
	BOOTS("boots", "신발", 3),
	CHESTPLATE("chestplate", "상의", 4),
	COMBAT("combat", "전투", 5),
	COPPER("copper", "구리", 6),
	FOOD("food", "식료품", 7),
	HELMET("helmet", "헬멧", 8),
	HOE("hoe", "괭이", 9),
	LEGGINGS("leggings", "하의", 10),
	MATERIAL("material", "재료", 11),
	NATURE("nature", "자연", 12),
	NETHER("nether", "네더", 13),
	PICKAXE("pickaxe", "곡괭이", 14),
	POTION("potion", "물약", 15),
	PROJECTILE("projectile", "투사체", 16),
	REDSTONE("redstone", "레드스톤", 17),
	SHOVEL("shovel", "삽", 18),
	SWORD("sword", "칼", 19),
	TOOL("tool", "도구", 20),
	TRIM("trim", "장식", 21),
	WEAPON("weapon", "무기", 22);
	
	public static final int TYPES_OF_CRATES = 23;
	
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
