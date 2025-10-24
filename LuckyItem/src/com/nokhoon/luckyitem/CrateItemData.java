package com.nokhoon.luckyitem;

import org.bukkit.Material;

public class CrateItemData {
	private static final ItemPool[] CRATE_DATA;
	
	static {
		CRATE_DATA = new ItemPool[Crate.TYPES_OF_CRATES];
		for(int i = 0; i < CRATE_DATA.length; i++) CRATE_DATA[i] = new ItemPool(System.currentTimeMillis() - i);
		ItemPool ptr = null;
		ptr = CRATE_DATA[Crate.ARMOR.getID()];
		ptr.put(Material.LEATHER_HELMET, Rarity.COMMON);
		ptr.put(Material.LEATHER_CHESTPLATE, Rarity.COMMON);
		ptr.put(Material.LEATHER_LEGGINGS, Rarity.COMMON);
		ptr.put(Material.LEATHER_BOOTS, Rarity.COMMON); //end of Leather Armor
		ptr.put(Material.GOLDEN_HELMET, Rarity.UNCOMMON);
		ptr.put(Material.GOLDEN_CHESTPLATE, Rarity.UNCOMMON);
		ptr.put(Material.GOLDEN_LEGGINGS, Rarity.UNCOMMON);
		ptr.put(Material.GOLDEN_BOOTS, Rarity.UNCOMMON); //end of Golden Armor
		ptr.put(Material.CHAINMAIL_HELMET, Rarity.RARE);
		ptr.put(Material.CHAINMAIL_CHESTPLATE, Rarity.RARE);
		ptr.put(Material.CHAINMAIL_LEGGINGS, Rarity.RARE);
		ptr.put(Material.CHAINMAIL_BOOTS, Rarity.RARE); //end of Chainmail Armor
		ptr.put(Material.IRON_HELMET, Rarity.EPIC);
		ptr.put(Material.IRON_CHESTPLATE, Rarity.EPIC);
		ptr.put(Material.IRON_LEGGINGS, Rarity.EPIC);
		ptr.put(Material.IRON_BOOTS, Rarity.EPIC); //end of Iron Armor
		ptr.put(Material.TURTLE_HELMET, Rarity.LEGENDARY); //Turtle Helmet
		ptr.put(Material.DIAMOND_HELMET, Rarity.LEGENDARY);
		ptr.put(Material.DIAMOND_CHESTPLATE, Rarity.LEGENDARY);
		ptr.put(Material.DIAMOND_LEGGINGS, Rarity.LEGENDARY);
		ptr.put(Material.DIAMOND_BOOTS, Rarity.LEGENDARY); //end of Diamond Armor
		ptr.put(Material.NETHERITE_HELMET, Rarity.MYSTIC);
		ptr.put(Material.NETHERITE_CHESTPLATE, Rarity.MYSTIC);
		ptr.put(Material.NETHERITE_LEGGINGS, Rarity.MYSTIC);
		ptr.put(Material.NETHERITE_BOOTS, Rarity.MYSTIC); //end of Netherite Armor
		ptr.put(Material.COPPER_HELMET, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_CHESTPLATE, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_LEGGINGS, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_BOOTS, Rarity.UNCOMMON);
		ptr.put(Material.ELYTRA, Rarity.MYSTIC);
		//end of ARMOR
		ptr = CRATE_DATA[Crate.AXE.getID()];
		ptr.put(Material.WOODEN_AXE, Rarity.COMMON);
		ptr.put(Material.GOLDEN_AXE, Rarity.COMMON);
		ptr.put(Material.STONE_AXE, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_AXE, Rarity.RARE);
		ptr.put(Material.IRON_AXE, Rarity.EPIC);
		ptr.put(Material.DIAMOND_AXE, Rarity.LEGENDARY);
		ptr.put(Material.NETHERITE_AXE, Rarity.MYSTIC);
		//end of AXE
		ptr = CRATE_DATA[Crate.BLOCK.getID()];
		ptr.put(Material.ACACIA_PLANKS, Rarity.COMMON);
		ptr.put(Material.BIRCH_PLANKS, Rarity.COMMON);
		ptr.put(Material.DARK_OAK_PLANKS, Rarity.COMMON);
		ptr.put(Material.JUNGLE_PLANKS, Rarity.COMMON);
		ptr.put(Material.OAK_PLANKS, Rarity.COMMON);
		ptr.put(Material.SPRUCE_PLANKS, Rarity.COMMON);
		ptr.put(Material.MANGROVE_PLANKS, Rarity.COMMON); //end of Overworld Planks
		ptr.put(Material.ACACIA_STAIRS, Rarity.COMMON);
		ptr.put(Material.BIRCH_STAIRS, Rarity.COMMON);
		ptr.put(Material.DARK_OAK_STAIRS, Rarity.COMMON);
		ptr.put(Material.JUNGLE_STAIRS, Rarity.COMMON);
		ptr.put(Material.OAK_STAIRS, Rarity.COMMON);
		ptr.put(Material.SPRUCE_STAIRS, Rarity.COMMON);
		ptr.put(Material.MANGROVE_STAIRS, Rarity.COMMON); //end of Overworld Wooden Stairs
		ptr.put(Material.ACACIA_SLAB, Rarity.COMMON);
		ptr.put(Material.BIRCH_SLAB, Rarity.COMMON);
		ptr.put(Material.DARK_OAK_SLAB, Rarity.COMMON);
		ptr.put(Material.JUNGLE_SLAB, Rarity.COMMON);
		ptr.put(Material.OAK_SLAB, Rarity.COMMON);
		ptr.put(Material.SPRUCE_SLAB, Rarity.COMMON);
		ptr.put(Material.MANGROVE_SLAB, Rarity.COMMON); //end of Overworld Wooden Slab
		ptr.put(Material.ACACIA_LOG, Rarity.COMMON);
		ptr.put(Material.BIRCH_LOG, Rarity.COMMON);
		ptr.put(Material.DARK_OAK_LOG, Rarity.COMMON);
		ptr.put(Material.JUNGLE_LOG, Rarity.COMMON);
		ptr.put(Material.OAK_LOG, Rarity.COMMON);
		ptr.put(Material.SPRUCE_LOG, Rarity.COMMON);
		ptr.put(Material.MANGROVE_LOG, Rarity.COMMON); //end of Overworld Log
		ptr.put(Material.STRIPPED_ACACIA_LOG, Rarity.COMMON);
		ptr.put(Material.STRIPPED_BIRCH_LOG, Rarity.COMMON);
		ptr.put(Material.STRIPPED_DARK_OAK_LOG, Rarity.COMMON);
		ptr.put(Material.STRIPPED_JUNGLE_LOG, Rarity.COMMON);
		ptr.put(Material.STRIPPED_OAK_LOG, Rarity.COMMON);
		ptr.put(Material.STRIPPED_SPRUCE_LOG, Rarity.COMMON);
		ptr.put(Material.STRIPPED_MANGROVE_LOG, Rarity.COMMON); //end of Overworld Stripped Log
		ptr.put(Material.ACACIA_WOOD, Rarity.COMMON);
		ptr.put(Material.BIRCH_WOOD, Rarity.COMMON);
		ptr.put(Material.DARK_OAK_WOOD, Rarity.COMMON);
		ptr.put(Material.JUNGLE_WOOD, Rarity.COMMON);
		ptr.put(Material.OAK_WOOD, Rarity.COMMON);
		ptr.put(Material.SPRUCE_WOOD, Rarity.COMMON);
		ptr.put(Material.MANGROVE_WOOD, Rarity.COMMON); //end of Overworld Wood
		ptr.put(Material.STRIPPED_ACACIA_WOOD, Rarity.COMMON);
		ptr.put(Material.STRIPPED_BIRCH_WOOD, Rarity.COMMON);
		ptr.put(Material.STRIPPED_DARK_OAK_WOOD, Rarity.COMMON);
		ptr.put(Material.STRIPPED_JUNGLE_WOOD, Rarity.COMMON);
		ptr.put(Material.STRIPPED_OAK_WOOD, Rarity.COMMON);
		ptr.put(Material.STRIPPED_SPRUCE_WOOD, Rarity.COMMON);
		ptr.put(Material.STRIPPED_MANGROVE_WOOD, Rarity.COMMON); //end of Overworld Stripped Wood
		ptr.put(Material.ACACIA_FENCE, Rarity.COMMON);
		ptr.put(Material.BIRCH_FENCE, Rarity.COMMON);
		ptr.put(Material.DARK_OAK_FENCE, Rarity.COMMON);
		ptr.put(Material.JUNGLE_FENCE, Rarity.COMMON);
		ptr.put(Material.OAK_FENCE, Rarity.COMMON);
		ptr.put(Material.SPRUCE_FENCE, Rarity.COMMON);
		ptr.put(Material.MANGROVE_FENCE, Rarity.COMMON); //end of Overworld Fence
		ptr.put(Material.ANDESITE, Rarity.UNCOMMON);
		ptr.put(Material.ANDESITE_STAIRS, Rarity.UNCOMMON);
		ptr.put(Material.ANDESITE_SLAB, Rarity.UNCOMMON);
		ptr.put(Material.ANDESITE_WALL, Rarity.UNCOMMON);
		ptr.put(Material.POLISHED_ANDESITE, Rarity.UNCOMMON);
		ptr.put(Material.POLISHED_ANDESITE_STAIRS, Rarity.UNCOMMON);
		ptr.put(Material.POLISHED_ANDESITE_SLAB, Rarity.UNCOMMON); //end of Andesite
		ptr.put(Material.DIORITE, Rarity.UNCOMMON);
		ptr.put(Material.DIORITE_STAIRS, Rarity.UNCOMMON);
		ptr.put(Material.DIORITE_SLAB, Rarity.UNCOMMON);
		ptr.put(Material.DIORITE_WALL, Rarity.UNCOMMON);
		ptr.put(Material.POLISHED_DIORITE, Rarity.UNCOMMON);
		ptr.put(Material.POLISHED_DIORITE_STAIRS, Rarity.UNCOMMON);
		ptr.put(Material.POLISHED_DIORITE_SLAB, Rarity.UNCOMMON); //end of Diorite
		ptr.put(Material.GRANITE, Rarity.UNCOMMON);
		ptr.put(Material.GRANITE_STAIRS, Rarity.UNCOMMON);
		ptr.put(Material.GRANITE_SLAB, Rarity.UNCOMMON);
		ptr.put(Material.GRANITE_WALL, Rarity.UNCOMMON);
		ptr.put(Material.POLISHED_GRANITE, Rarity.UNCOMMON);
		ptr.put(Material.POLISHED_GRANITE_STAIRS, Rarity.UNCOMMON);
		ptr.put(Material.POLISHED_GRANITE_SLAB, Rarity.UNCOMMON); //end of Granite
		ptr.put(Material.BLACK_CARPET, Rarity.UNCOMMON);
		ptr.put(Material.BLUE_CARPET, Rarity.UNCOMMON);
		ptr.put(Material.BROWN_CARPET, Rarity.UNCOMMON);
		ptr.put(Material.CYAN_CARPET, Rarity.UNCOMMON);
		ptr.put(Material.GRAY_CARPET, Rarity.UNCOMMON);
		ptr.put(Material.GREEN_CARPET, Rarity.UNCOMMON);
		ptr.put(Material.LIGHT_BLUE_CARPET, Rarity.UNCOMMON);
		ptr.put(Material.LIGHT_GRAY_CARPET, Rarity.UNCOMMON);
		ptr.put(Material.LIME_CARPET, Rarity.UNCOMMON);
		ptr.put(Material.MAGENTA_CARPET, Rarity.UNCOMMON);
		ptr.put(Material.ORANGE_CARPET, Rarity.UNCOMMON);
		ptr.put(Material.PINK_CARPET, Rarity.UNCOMMON);
		ptr.put(Material.PURPLE_CARPET, Rarity.UNCOMMON);
		ptr.put(Material.RED_CARPET, Rarity.UNCOMMON);
		ptr.put(Material.WHITE_CARPET, Rarity.UNCOMMON);
		ptr.put(Material.YELLOW_CARPET, Rarity.UNCOMMON); //end of Carpet
		ptr.put(Material.BLACK_CONCRETE, Rarity.RARE);
		ptr.put(Material.BLUE_CONCRETE, Rarity.RARE);
		ptr.put(Material.BROWN_CONCRETE, Rarity.RARE);
		ptr.put(Material.CYAN_CONCRETE, Rarity.RARE);
		ptr.put(Material.GRAY_CONCRETE, Rarity.RARE);
		ptr.put(Material.GREEN_CONCRETE, Rarity.RARE);
		ptr.put(Material.LIGHT_BLUE_CONCRETE, Rarity.RARE);
		ptr.put(Material.LIGHT_GRAY_CONCRETE, Rarity.RARE);
		ptr.put(Material.LIME_CONCRETE, Rarity.RARE);
		ptr.put(Material.MAGENTA_CONCRETE, Rarity.RARE);
		ptr.put(Material.ORANGE_CONCRETE, Rarity.RARE);
		ptr.put(Material.PINK_CONCRETE, Rarity.RARE);
		ptr.put(Material.PURPLE_CONCRETE, Rarity.RARE);
		ptr.put(Material.RED_CONCRETE, Rarity.RARE);
		ptr.put(Material.WHITE_CONCRETE, Rarity.RARE);
		ptr.put(Material.YELLOW_CONCRETE, Rarity.RARE); //end of Concrete
		ptr.put(Material.TERRACOTTA, Rarity.UNCOMMON);
		ptr.put(Material.BLACK_TERRACOTTA, Rarity.RARE);
		ptr.put(Material.BLUE_TERRACOTTA, Rarity.RARE);
		ptr.put(Material.BROWN_TERRACOTTA, Rarity.RARE);
		ptr.put(Material.CYAN_TERRACOTTA, Rarity.RARE);
		ptr.put(Material.GRAY_TERRACOTTA, Rarity.RARE);
		ptr.put(Material.GREEN_TERRACOTTA, Rarity.RARE);
		ptr.put(Material.LIGHT_BLUE_TERRACOTTA, Rarity.RARE);
		ptr.put(Material.LIGHT_GRAY_TERRACOTTA, Rarity.RARE);
		ptr.put(Material.LIME_TERRACOTTA, Rarity.RARE);
		ptr.put(Material.MAGENTA_TERRACOTTA, Rarity.RARE);
		ptr.put(Material.ORANGE_TERRACOTTA, Rarity.RARE);
		ptr.put(Material.PINK_TERRACOTTA, Rarity.RARE);
		ptr.put(Material.PURPLE_TERRACOTTA, Rarity.RARE);
		ptr.put(Material.RED_TERRACOTTA, Rarity.RARE);
		ptr.put(Material.WHITE_TERRACOTTA, Rarity.RARE);
		ptr.put(Material.YELLOW_TERRACOTTA, Rarity.RARE);
		ptr.put(Material.BLACK_GLAZED_TERRACOTTA, Rarity.EPIC);
		ptr.put(Material.BLUE_GLAZED_TERRACOTTA, Rarity.EPIC);
		ptr.put(Material.BROWN_GLAZED_TERRACOTTA, Rarity.EPIC);
		ptr.put(Material.CYAN_GLAZED_TERRACOTTA, Rarity.EPIC);
		ptr.put(Material.GRAY_GLAZED_TERRACOTTA, Rarity.EPIC);
		ptr.put(Material.GREEN_GLAZED_TERRACOTTA, Rarity.EPIC);
		ptr.put(Material.LIGHT_BLUE_GLAZED_TERRACOTTA, Rarity.EPIC);
		ptr.put(Material.LIGHT_GRAY_GLAZED_TERRACOTTA, Rarity.EPIC);
		ptr.put(Material.LIME_GLAZED_TERRACOTTA, Rarity.EPIC);
		ptr.put(Material.MAGENTA_GLAZED_TERRACOTTA, Rarity.EPIC);
		ptr.put(Material.ORANGE_GLAZED_TERRACOTTA, Rarity.EPIC);
		ptr.put(Material.PINK_GLAZED_TERRACOTTA, Rarity.EPIC);
		ptr.put(Material.PURPLE_GLAZED_TERRACOTTA, Rarity.EPIC);
		ptr.put(Material.RED_GLAZED_TERRACOTTA, Rarity.EPIC);
		ptr.put(Material.WHITE_GLAZED_TERRACOTTA, Rarity.EPIC);
		ptr.put(Material.YELLOW_GLAZED_TERRACOTTA, Rarity.EPIC); //end of Terracotta
		ptr.put(Material.BONE_BLOCK, Rarity.UNCOMMON); //Bone Block
		ptr.put(Material.RAW_GOLD_BLOCK, Rarity.EPIC);
		ptr.put(Material.RAW_IRON_BLOCK, Rarity.RARE);
		ptr.put(Material.RAW_COPPER_BLOCK, Rarity.RARE);
		ptr.put(Material.COAL_BLOCK, Rarity.UNCOMMON);
		ptr.put(Material.DIAMOND_BLOCK, Rarity.LEGENDARY);
		ptr.put(Material.EMERALD_BLOCK, Rarity.EPIC);
		ptr.put(Material.GOLD_BLOCK, Rarity.EPIC);
		ptr.put(Material.IRON_BLOCK, Rarity.RARE);
		ptr.put(Material.REDSTONE_BLOCK, Rarity.EPIC);
		ptr.put(Material.LAPIS_BLOCK, Rarity.RARE);
		ptr.put(Material.NETHERITE_BLOCK, Rarity.MYSTIC); //end of Mineral
		ptr.put(Material.GLASS, Rarity.UNCOMMON);
		ptr.put(Material.BLACK_STAINED_GLASS, Rarity.RARE);
		ptr.put(Material.BLUE_STAINED_GLASS, Rarity.RARE);
		ptr.put(Material.BROWN_STAINED_GLASS, Rarity.RARE);
		ptr.put(Material.CYAN_STAINED_GLASS, Rarity.RARE);
		ptr.put(Material.GRAY_STAINED_GLASS, Rarity.RARE);
		ptr.put(Material.GREEN_STAINED_GLASS, Rarity.RARE);
		ptr.put(Material.LIGHT_BLUE_STAINED_GLASS, Rarity.RARE);
		ptr.put(Material.LIGHT_GRAY_STAINED_GLASS, Rarity.RARE);
		ptr.put(Material.LIME_STAINED_GLASS, Rarity.RARE);
		ptr.put(Material.MAGENTA_STAINED_GLASS, Rarity.RARE);
		ptr.put(Material.ORANGE_STAINED_GLASS, Rarity.RARE);
		ptr.put(Material.PINK_STAINED_GLASS, Rarity.RARE);
		ptr.put(Material.PURPLE_STAINED_GLASS, Rarity.RARE);
		ptr.put(Material.RED_STAINED_GLASS, Rarity.RARE);
		ptr.put(Material.WHITE_STAINED_GLASS, Rarity.RARE);
		ptr.put(Material.YELLOW_STAINED_GLASS, Rarity.RARE); //end of Glass 
		ptr.put(Material.GLASS_PANE, Rarity.UNCOMMON);
		ptr.put(Material.BLACK_STAINED_GLASS_PANE, Rarity.RARE);
		ptr.put(Material.BLUE_STAINED_GLASS_PANE, Rarity.RARE);
		ptr.put(Material.BROWN_STAINED_GLASS_PANE, Rarity.RARE);
		ptr.put(Material.CYAN_STAINED_GLASS_PANE, Rarity.RARE);
		ptr.put(Material.GRAY_STAINED_GLASS_PANE, Rarity.RARE);
		ptr.put(Material.GREEN_STAINED_GLASS_PANE, Rarity.RARE);
		ptr.put(Material.LIGHT_BLUE_STAINED_GLASS_PANE, Rarity.RARE);
		ptr.put(Material.LIGHT_GRAY_STAINED_GLASS_PANE, Rarity.RARE);
		ptr.put(Material.LIME_STAINED_GLASS_PANE, Rarity.RARE);
		ptr.put(Material.MAGENTA_STAINED_GLASS_PANE, Rarity.RARE);
		ptr.put(Material.ORANGE_STAINED_GLASS_PANE, Rarity.RARE);
		ptr.put(Material.PINK_STAINED_GLASS_PANE, Rarity.RARE);
		ptr.put(Material.PURPLE_STAINED_GLASS_PANE, Rarity.RARE);
		ptr.put(Material.RED_STAINED_GLASS_PANE, Rarity.RARE);
		ptr.put(Material.WHITE_STAINED_GLASS_PANE, Rarity.RARE);
		ptr.put(Material.YELLOW_STAINED_GLASS_PANE, Rarity.RARE); //end of Glass Pane
		ptr.put(Material.BLACK_WOOL, Rarity.UNCOMMON);
		ptr.put(Material.BLUE_WOOL, Rarity.UNCOMMON);
		ptr.put(Material.BROWN_WOOL, Rarity.UNCOMMON);
		ptr.put(Material.CYAN_WOOL, Rarity.UNCOMMON);
		ptr.put(Material.GRAY_WOOL, Rarity.UNCOMMON);
		ptr.put(Material.GREEN_WOOL, Rarity.UNCOMMON);
		ptr.put(Material.LIGHT_BLUE_WOOL, Rarity.UNCOMMON);
		ptr.put(Material.LIGHT_GRAY_WOOL, Rarity.UNCOMMON);
		ptr.put(Material.LIME_WOOL, Rarity.UNCOMMON);
		ptr.put(Material.MAGENTA_WOOL, Rarity.UNCOMMON);
		ptr.put(Material.ORANGE_WOOL, Rarity.UNCOMMON);
		ptr.put(Material.PINK_WOOL, Rarity.UNCOMMON);
		ptr.put(Material.PURPLE_WOOL, Rarity.UNCOMMON);
		ptr.put(Material.RED_WOOL, Rarity.UNCOMMON);
		ptr.put(Material.WHITE_WOOL, Rarity.UNCOMMON);
		ptr.put(Material.YELLOW_WOOL, Rarity.UNCOMMON); //end of Wool
		ptr.put(Material.BOOKSHELF, Rarity.RARE); //Bookshelf
		ptr.put(Material.BRICKS, Rarity.UNCOMMON);
		ptr.put(Material.BRICK_STAIRS, Rarity.UNCOMMON);
		ptr.put(Material.BRICK_SLAB, Rarity.UNCOMMON);
		ptr.put(Material.BRICK_WALL, Rarity.UNCOMMON); //end of Bricks
		ptr.put(Material.QUARTZ_BLOCK, Rarity.RARE);
		ptr.put(Material.QUARTZ_PILLAR, Rarity.RARE);
		ptr.put(Material.QUARTZ_SLAB, Rarity.RARE);
		ptr.put(Material.QUARTZ_STAIRS, Rarity.RARE);
		ptr.put(Material.QUARTZ_BRICKS, Rarity.RARE);
		ptr.put(Material.SMOOTH_QUARTZ, Rarity.RARE);
		ptr.put(Material.SMOOTH_QUARTZ_SLAB, Rarity.RARE);
		ptr.put(Material.SMOOTH_QUARTZ_STAIRS, Rarity.RARE);
		ptr.put(Material.CHISELED_QUARTZ_BLOCK, Rarity.RARE); //end of Quartz
		ptr.put(Material.RED_SAND, Rarity.COMMON);
		ptr.put(Material.RED_SANDSTONE, Rarity.UNCOMMON);
		ptr.put(Material.RED_SANDSTONE_SLAB, Rarity.UNCOMMON);
		ptr.put(Material.RED_SANDSTONE_STAIRS, Rarity.UNCOMMON);
		ptr.put(Material.RED_SANDSTONE_WALL, Rarity.UNCOMMON);
		ptr.put(Material.CUT_RED_SANDSTONE, Rarity.UNCOMMON);
		ptr.put(Material.CUT_RED_SANDSTONE_SLAB, Rarity.UNCOMMON);
		ptr.put(Material.CHISELED_RED_SANDSTONE, Rarity.UNCOMMON);
		ptr.put(Material.SMOOTH_RED_SANDSTONE, Rarity.UNCOMMON);
		ptr.put(Material.SMOOTH_RED_SANDSTONE_SLAB, Rarity.UNCOMMON);
		ptr.put(Material.SMOOTH_RED_SANDSTONE_STAIRS, Rarity.UNCOMMON); //end of Red Sand
		ptr.put(Material.SAND, Rarity.COMMON);
		ptr.put(Material.SANDSTONE, Rarity.UNCOMMON);
		ptr.put(Material.SANDSTONE_SLAB, Rarity.UNCOMMON);
		ptr.put(Material.SANDSTONE_STAIRS, Rarity.UNCOMMON);
		ptr.put(Material.SANDSTONE_WALL, Rarity.UNCOMMON);
		ptr.put(Material.CHISELED_SANDSTONE, Rarity.UNCOMMON);
		ptr.put(Material.SMOOTH_SANDSTONE, Rarity.UNCOMMON);
		ptr.put(Material.SMOOTH_SANDSTONE_SLAB, Rarity.UNCOMMON);
		ptr.put(Material.SMOOTH_SANDSTONE_STAIRS, Rarity.UNCOMMON); //end of Sand
		ptr.put(Material.STONE_BRICKS, Rarity.UNCOMMON);
		ptr.put(Material.STONE_BRICK_SLAB, Rarity.UNCOMMON);
		ptr.put(Material.STONE_BRICK_STAIRS, Rarity.UNCOMMON);
		ptr.put(Material.STONE_BRICK_WALL, Rarity.UNCOMMON);
		ptr.put(Material.CHISELED_STONE_BRICKS, Rarity.UNCOMMON);
		ptr.put(Material.CRACKED_STONE_BRICKS, Rarity.UNCOMMON); //end of Stone Bricks
		ptr.put(Material.DIRT, Rarity.COMMON);
		ptr.put(Material.COARSE_DIRT, Rarity.COMMON);
		ptr.put(Material.ROOTED_DIRT, Rarity.UNCOMMON); //end of Dirt
		ptr.put(Material.COBBLESTONE, Rarity.COMMON);
		ptr.put(Material.COBBLESTONE_SLAB, Rarity.COMMON);
		ptr.put(Material.COBBLESTONE_STAIRS, Rarity.COMMON);
		ptr.put(Material.COBBLESTONE_WALL, Rarity.COMMON); //end of Cobblestone
		ptr.put(Material.PRISMARINE, Rarity.EPIC);
		ptr.put(Material.PRISMARINE_SLAB, Rarity.EPIC);
		ptr.put(Material.PRISMARINE_STAIRS, Rarity.EPIC);
		ptr.put(Material.PRISMARINE_WALL, Rarity.EPIC);
		ptr.put(Material.PRISMARINE_BRICKS, Rarity.EPIC);
		ptr.put(Material.PRISMARINE_BRICK_SLAB, Rarity.EPIC);
		ptr.put(Material.PRISMARINE_BRICK_STAIRS, Rarity.EPIC);
		ptr.put(Material.DARK_PRISMARINE, Rarity.EPIC);
		ptr.put(Material.DARK_PRISMARINE_SLAB, Rarity.EPIC);
		ptr.put(Material.DARK_PRISMARINE_STAIRS, Rarity.EPIC); //end of Prismarine
		ptr.put(Material.END_ROD, Rarity.LEGENDARY);
		ptr.put(Material.END_STONE, Rarity.EPIC);
		ptr.put(Material.END_STONE_BRICKS, Rarity.EPIC);
		ptr.put(Material.END_STONE_BRICK_SLAB, Rarity.EPIC);
		ptr.put(Material.END_STONE_BRICK_STAIRS, Rarity.EPIC);
		ptr.put(Material.END_STONE_BRICK_WALL, Rarity.EPIC); //end of End Stone
		ptr.put(Material.CLAY, Rarity.COMMON);
		ptr.put(Material.GLOWSTONE, Rarity.RARE);
		ptr.put(Material.SHROOMLIGHT, Rarity.RARE);
		ptr.put(Material.GRAVEL, Rarity.COMMON);
		ptr.put(Material.HAY_BLOCK, Rarity.UNCOMMON);
		ptr.put(Material.HONEY_BLOCK, Rarity.RARE);
		ptr.put(Material.HONEYCOMB_BLOCK, Rarity.RARE); //beginning of Ice
		ptr.put(Material.ICE, Rarity.UNCOMMON);
		ptr.put(Material.PACKED_ICE, Rarity.RARE);
		ptr.put(Material.BLUE_ICE, Rarity.EPIC); //end of Ice
		ptr.put(Material.IRON_BARS, Rarity.RARE);
		ptr.put(Material.JACK_O_LANTERN, Rarity.RARE);
		ptr.put(Material.LADDER, Rarity.UNCOMMON);
		ptr.put(Material.MAGMA_BLOCK, Rarity.UNCOMMON); //
		ptr.put(Material.MOSSY_COBBLESTONE, Rarity.UNCOMMON);
		ptr.put(Material.MOSSY_COBBLESTONE_STAIRS, Rarity.UNCOMMON);
		ptr.put(Material.MOSSY_COBBLESTONE_SLAB, Rarity.UNCOMMON);
		ptr.put(Material.MOSSY_COBBLESTONE_WALL, Rarity.UNCOMMON); //end of Mossy Cobblestone
		ptr.put(Material.MOSSY_STONE_BRICKS, Rarity.UNCOMMON);
		ptr.put(Material.MOSSY_STONE_BRICK_STAIRS, Rarity.UNCOMMON);
		ptr.put(Material.MOSSY_STONE_BRICK_SLAB, Rarity.UNCOMMON);
		ptr.put(Material.MOSSY_STONE_BRICK_WALL, Rarity.UNCOMMON); //end of Mossy Stone Bricks
		ptr.put(Material.GRASS_BLOCK, Rarity.UNCOMMON);
		ptr.put(Material.MYCELIUM, Rarity.EPIC);
		ptr.put(Material.PODZOL, Rarity.RARE); //end of Grass Block
		ptr.put(Material.NETHERRACK, Rarity.UNCOMMON); //Netherrack
		ptr.put(Material.NETHER_BRICKS, Rarity.RARE);
		ptr.put(Material.NETHER_BRICK_STAIRS, Rarity.RARE);
		ptr.put(Material.NETHER_BRICK_SLAB, Rarity.RARE);
		ptr.put(Material.NETHER_BRICK_WALL, Rarity.RARE);
		ptr.put(Material.NETHER_BRICK_FENCE, Rarity.RARE);
		ptr.put(Material.CHISELED_NETHER_BRICKS, Rarity.RARE);
		ptr.put(Material.CRACKED_NETHER_BRICKS, Rarity.RARE); //end of Nether Bricks
		ptr.put(Material.NETHER_WART_BLOCK, Rarity.UNCOMMON);
		ptr.put(Material.WARPED_WART_BLOCK, Rarity.UNCOMMON); //end of Wart Block
		ptr.put(Material.NOTE_BLOCK, Rarity.RARE);
		ptr.put(Material.OBSIDIAN, Rarity.RARE);
		ptr.put(Material.CRYING_OBSIDIAN, Rarity.EPIC); //end of Obsidian
		ptr.put(Material.PURPUR_BLOCK, Rarity.LEGENDARY);
		ptr.put(Material.PURPUR_STAIRS, Rarity.LEGENDARY);
		ptr.put(Material.PURPUR_SLAB, Rarity.LEGENDARY);
		ptr.put(Material.PURPUR_PILLAR, Rarity.LEGENDARY); //end of Purpur
		ptr.put(Material.RED_NETHER_BRICKS, Rarity.RARE);
		ptr.put(Material.RED_NETHER_BRICK_STAIRS, Rarity.RARE);
		ptr.put(Material.RED_NETHER_BRICK_SLAB, Rarity.RARE);
		ptr.put(Material.RED_NETHER_BRICK_WALL, Rarity.RARE); //end of Red Nether Bricks
		ptr.put(Material.SEA_LANTERN, Rarity.EPIC);
		ptr.put(Material.SLIME_BLOCK, Rarity.RARE); //
		ptr.put(Material.SMOOTH_STONE, Rarity.UNCOMMON);
		ptr.put(Material.SMOOTH_STONE_SLAB, Rarity.UNCOMMON); //end of Smooth Stone
		ptr.put(Material.SNOW, Rarity.UNCOMMON);
		ptr.put(Material.SNOW_BLOCK, Rarity.UNCOMMON); //end of Snow
		ptr.put(Material.SOUL_SAND, Rarity.UNCOMMON);
		ptr.put(Material.SOUL_SOIL, Rarity.UNCOMMON); //end of Soul
		ptr.put(Material.SPONGE, Rarity.LEGENDARY);
		ptr.put(Material.WET_SPONGE, Rarity.LEGENDARY); //end of Sponge
		ptr.put(Material.STONE, Rarity.UNCOMMON);
		ptr.put(Material.STONE_STAIRS, Rarity.UNCOMMON);
		ptr.put(Material.STONE_SLAB, Rarity.UNCOMMON); //end of Stone
		ptr.put(Material.BROWN_MUSHROOM_BLOCK, Rarity.RARE);
		ptr.put(Material.RED_MUSHROOM_BLOCK, Rarity.RARE);
		ptr.put(Material.MUSHROOM_STEM, Rarity.RARE); //end of Mushroom
		ptr.put(Material.BASALT, Rarity.UNCOMMON);
		ptr.put(Material.POLISHED_BASALT, Rarity.UNCOMMON);
		ptr.put(Material.SMOOTH_BASALT, Rarity.UNCOMMON); //end of Basalt
		ptr.put(Material.BLACKSTONE, Rarity.UNCOMMON);
		ptr.put(Material.BLACKSTONE_SLAB, Rarity.UNCOMMON);
		ptr.put(Material.BLACKSTONE_STAIRS, Rarity.UNCOMMON);
		ptr.put(Material.BLACKSTONE_WALL, Rarity.UNCOMMON);
		ptr.put(Material.POLISHED_BLACKSTONE, Rarity.UNCOMMON);
		ptr.put(Material.CHISELED_POLISHED_BLACKSTONE, Rarity.UNCOMMON);
		ptr.put(Material.POLISHED_BLACKSTONE_SLAB, Rarity.UNCOMMON);
		ptr.put(Material.POLISHED_BLACKSTONE_STAIRS, Rarity.UNCOMMON);
		ptr.put(Material.POLISHED_BLACKSTONE_WALL, Rarity.UNCOMMON);
		ptr.put(Material.POLISHED_BLACKSTONE_BRICKS, Rarity.UNCOMMON);
		ptr.put(Material.POLISHED_BLACKSTONE_BRICK_SLAB, Rarity.UNCOMMON);
		ptr.put(Material.POLISHED_BLACKSTONE_BRICK_STAIRS, Rarity.UNCOMMON);
		ptr.put(Material.POLISHED_BLACKSTONE_BRICK_WALL, Rarity.UNCOMMON);
		ptr.put(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS, Rarity.UNCOMMON);
		ptr.put(Material.GILDED_BLACKSTONE, Rarity.EPIC); //end of Blackstone
		ptr.put(Material.IRON_CHAIN, Rarity.RARE); //Beginning of Nylium
		ptr.put(Material.CRIMSON_NYLIUM, Rarity.RARE);
		ptr.put(Material.WARPED_NYLIUM, Rarity.RARE); //end of Nylium
		ptr.put(Material.CRIMSON_FENCE, Rarity.UNCOMMON);
		ptr.put(Material.CRIMSON_HYPHAE, Rarity.UNCOMMON);
		ptr.put(Material.CRIMSON_PLANKS, Rarity.UNCOMMON);
		ptr.put(Material.CRIMSON_SLAB, Rarity.UNCOMMON);
		ptr.put(Material.CRIMSON_STAIRS, Rarity.UNCOMMON);
		ptr.put(Material.CRIMSON_STEM, Rarity.UNCOMMON);
		ptr.put(Material.STRIPPED_CRIMSON_HYPHAE, Rarity.UNCOMMON);
		ptr.put(Material.STRIPPED_CRIMSON_STEM, Rarity.UNCOMMON); //end of Crimson
		ptr.put(Material.WARPED_FENCE, Rarity.UNCOMMON);
		ptr.put(Material.WARPED_HYPHAE, Rarity.UNCOMMON);
		ptr.put(Material.WARPED_PLANKS, Rarity.UNCOMMON);
		ptr.put(Material.WARPED_ROOTS, Rarity.UNCOMMON);
		ptr.put(Material.WARPED_SLAB, Rarity.UNCOMMON);
		ptr.put(Material.WARPED_STAIRS, Rarity.UNCOMMON);
		ptr.put(Material.WARPED_STEM, Rarity.UNCOMMON);
		ptr.put(Material.STRIPPED_WARPED_HYPHAE, Rarity.UNCOMMON);
		ptr.put(Material.STRIPPED_WARPED_STEM, Rarity.UNCOMMON); //end of Warped
		ptr.put(Material.AMETHYST_BLOCK, Rarity.EPIC);
		ptr.put(Material.COPPER_BLOCK, Rarity.RARE);
		ptr.put(Material.CUT_COPPER, Rarity.RARE);
		ptr.put(Material.CUT_COPPER_STAIRS, Rarity.RARE);
		ptr.put(Material.CUT_COPPER_SLAB, Rarity.RARE);
		ptr.put(Material.EXPOSED_COPPER, Rarity.RARE);
		ptr.put(Material.EXPOSED_CUT_COPPER, Rarity.RARE);
		ptr.put(Material.EXPOSED_CUT_COPPER_STAIRS, Rarity.RARE);
		ptr.put(Material.EXPOSED_CUT_COPPER_SLAB, Rarity.RARE);
		ptr.put(Material.WEATHERED_COPPER, Rarity.RARE);
		ptr.put(Material.WEATHERED_CUT_COPPER, Rarity.RARE);
		ptr.put(Material.WEATHERED_CUT_COPPER_STAIRS, Rarity.RARE);
		ptr.put(Material.WEATHERED_CUT_COPPER_SLAB, Rarity.RARE);
		ptr.put(Material.OXIDIZED_COPPER, Rarity.RARE);
		ptr.put(Material.OXIDIZED_CUT_COPPER, Rarity.RARE);
		ptr.put(Material.OXIDIZED_CUT_COPPER_STAIRS, Rarity.RARE);
		ptr.put(Material.OXIDIZED_CUT_COPPER_SLAB, Rarity.RARE);
		ptr.put(Material.WAXED_COPPER_BLOCK, Rarity.RARE);
		ptr.put(Material.WAXED_CUT_COPPER, Rarity.RARE);
		ptr.put(Material.WAXED_CUT_COPPER_STAIRS, Rarity.RARE);
		ptr.put(Material.WAXED_CUT_COPPER_SLAB, Rarity.RARE);
		ptr.put(Material.WAXED_EXPOSED_COPPER, Rarity.RARE);
		ptr.put(Material.WAXED_EXPOSED_CUT_COPPER, Rarity.RARE);
		ptr.put(Material.WAXED_EXPOSED_CUT_COPPER_STAIRS, Rarity.RARE);
		ptr.put(Material.WAXED_EXPOSED_CUT_COPPER_SLAB, Rarity.RARE);
		ptr.put(Material.WAXED_WEATHERED_COPPER, Rarity.RARE);
		ptr.put(Material.WAXED_WEATHERED_CUT_COPPER, Rarity.RARE);
		ptr.put(Material.WAXED_WEATHERED_CUT_COPPER_STAIRS, Rarity.RARE);
		ptr.put(Material.WAXED_WEATHERED_CUT_COPPER_SLAB, Rarity.RARE);
		ptr.put(Material.WAXED_OXIDIZED_COPPER, Rarity.RARE);
		ptr.put(Material.WAXED_OXIDIZED_CUT_COPPER, Rarity.RARE);
		ptr.put(Material.WAXED_OXIDIZED_CUT_COPPER_STAIRS, Rarity.RARE);
		ptr.put(Material.WAXED_OXIDIZED_CUT_COPPER_SLAB, Rarity.RARE); //end of Copper
		ptr.put(Material.DEEPSLATE, Rarity.UNCOMMON);
		ptr.put(Material.COBBLED_DEEPSLATE, Rarity.COMMON);
		ptr.put(Material.COBBLED_DEEPSLATE_STAIRS, Rarity.COMMON);
		ptr.put(Material.COBBLED_DEEPSLATE_SLAB, Rarity.COMMON);
		ptr.put(Material.COBBLED_DEEPSLATE_WALL, Rarity.COMMON);
		ptr.put(Material.POLISHED_DEEPSLATE, Rarity.COMMON);
		ptr.put(Material.POLISHED_DEEPSLATE_STAIRS, Rarity.COMMON);
		ptr.put(Material.POLISHED_DEEPSLATE_SLAB, Rarity.COMMON);
		ptr.put(Material.POLISHED_DEEPSLATE_WALL, Rarity.COMMON);
		ptr.put(Material.DEEPSLATE_BRICKS, Rarity.COMMON);
		ptr.put(Material.DEEPSLATE_BRICK_STAIRS, Rarity.COMMON);
		ptr.put(Material.DEEPSLATE_BRICK_SLAB, Rarity.COMMON);
		ptr.put(Material.DEEPSLATE_BRICK_WALL, Rarity.COMMON);
		ptr.put(Material.DEEPSLATE_TILES, Rarity.COMMON);
		ptr.put(Material.DEEPSLATE_TILE_STAIRS, Rarity.COMMON);
		ptr.put(Material.DEEPSLATE_TILE_SLAB, Rarity.COMMON);
		ptr.put(Material.DEEPSLATE_TILE_WALL, Rarity.COMMON);
		ptr.put(Material.CHISELED_DEEPSLATE, Rarity.COMMON);
		ptr.put(Material.CRACKED_DEEPSLATE_BRICKS, Rarity.COMMON);
		ptr.put(Material.CRACKED_DEEPSLATE_TILES, Rarity.COMMON);
		ptr.put(Material.MOSS_BLOCK, Rarity.RARE);
		ptr.put(Material.MOSS_CARPET, Rarity.RARE);
		ptr.put(Material.TINTED_GLASS, Rarity.EPIC);
		ptr.put(Material.TUFF, Rarity.UNCOMMON);
		ptr.put(Material.TUFF_STAIRS, Rarity.UNCOMMON);
		ptr.put(Material.TUFF_SLAB, Rarity.UNCOMMON);
		ptr.put(Material.TUFF_WALL, Rarity.UNCOMMON);
		ptr.put(Material.POLISHED_TUFF, Rarity.UNCOMMON);
		ptr.put(Material.POLISHED_TUFF_STAIRS, Rarity.UNCOMMON);
		ptr.put(Material.POLISHED_TUFF_SLAB, Rarity.UNCOMMON);
		ptr.put(Material.POLISHED_TUFF_WALL, Rarity.UNCOMMON);
		ptr.put(Material.TUFF_BRICKS, Rarity.UNCOMMON);
		ptr.put(Material.TUFF_BRICK_STAIRS, Rarity.UNCOMMON);
		ptr.put(Material.TUFF_BRICK_SLAB, Rarity.UNCOMMON);
		ptr.put(Material.TUFF_BRICK_WALL, Rarity.UNCOMMON);
		ptr.put(Material.CHISELED_TUFF, Rarity.UNCOMMON);
		ptr.put(Material.CHISELED_TUFF_BRICKS, Rarity.UNCOMMON);
		ptr.put(Material.CALCITE, Rarity.RARE);
		ptr.put(Material.DRIPSTONE_BLOCK, Rarity.RARE);
		ptr.put(Material.POINTED_DRIPSTONE, Rarity.RARE);
		ptr.put(Material.OCHRE_FROGLIGHT, Rarity.EPIC);
		ptr.put(Material.PEARLESCENT_FROGLIGHT, Rarity.EPIC);
		ptr.put(Material.VERDANT_FROGLIGHT, Rarity.EPIC);
		ptr.put(Material.MANGROVE_ROOTS, Rarity.COMMON);
		ptr.put(Material.MUDDY_MANGROVE_ROOTS, Rarity.COMMON);
		ptr.put(Material.MUD, Rarity.COMMON);
		ptr.put(Material.PACKED_MUD, Rarity.UNCOMMON);
		ptr.put(Material.MUD_BRICKS, Rarity.UNCOMMON);
		ptr.put(Material.MUD_BRICK_STAIRS, Rarity.UNCOMMON);
		ptr.put(Material.MUD_BRICK_SLAB, Rarity.UNCOMMON);
		ptr.put(Material.MUD_BRICK_WALL, Rarity.UNCOMMON);
		ptr.put(Material.SCULK, Rarity.RARE);
		ptr.put(Material.SCULK_SENSOR, Rarity.RARE);
		ptr.put(Material.SCULK_CATALYST, Rarity.EPIC);
		ptr.put(Material.SCULK_SHRIEKER, Rarity.LEGENDARY);
		ptr.put(Material.BAMBOO_MOSAIC, Rarity.COMMON); //beginning of 1.20
		ptr.put(Material.BAMBOO_MOSAIC_STAIRS, Rarity.COMMON);
		ptr.put(Material.BAMBOO_MOSAIC_SLAB, Rarity.COMMON);
		ptr.put(Material.BAMBOO_PLANKS, Rarity.COMMON);
		ptr.put(Material.BAMBOO_STAIRS, Rarity.COMMON);
		ptr.put(Material.BAMBOO_SLAB, Rarity.COMMON);
		ptr.put(Material.BAMBOO_FENCE, Rarity.COMMON);
		ptr.put(Material.BAMBOO_BLOCK, Rarity.COMMON);
		ptr.put(Material.STRIPPED_BAMBOO_BLOCK, Rarity.COMMON);
		ptr.put(Material.CALIBRATED_SCULK_SENSOR, Rarity.EPIC);
		ptr.put(Material.CHERRY_LEAVES, Rarity.COMMON);
		ptr.put(Material.CHERRY_LOG, Rarity.COMMON);
		ptr.put(Material.STRIPPED_CHERRY_LOG, Rarity.COMMON);
		ptr.put(Material.CHERRY_WOOD, Rarity.COMMON);
		ptr.put(Material.STRIPPED_CHERRY_WOOD, Rarity.COMMON);
		ptr.put(Material.CHERRY_PLANKS, Rarity.COMMON);
		ptr.put(Material.CHERRY_STAIRS, Rarity.COMMON);
		ptr.put(Material.CHERRY_SLAB, Rarity.COMMON);
		ptr.put(Material.CHERRY_FENCE, Rarity.COMMON);
		ptr.put(Material.CHISELED_BOOKSHELF, Rarity.RARE);
		ptr.put(Material.ACACIA_HANGING_SIGN, Rarity.RARE);
		ptr.put(Material.BAMBOO_HANGING_SIGN, Rarity.RARE);
		ptr.put(Material.BIRCH_HANGING_SIGN, Rarity.RARE);
		ptr.put(Material.CHERRY_HANGING_SIGN, Rarity.RARE);
		ptr.put(Material.CRIMSON_HANGING_SIGN, Rarity.RARE);
		ptr.put(Material.DARK_OAK_HANGING_SIGN, Rarity.RARE);
		ptr.put(Material.JUNGLE_HANGING_SIGN, Rarity.RARE);
		ptr.put(Material.MANGROVE_HANGING_SIGN, Rarity.RARE);
		ptr.put(Material.OAK_HANGING_SIGN, Rarity.RARE);
		ptr.put(Material.SPRUCE_HANGING_SIGN, Rarity.RARE);
		ptr.put(Material.WARPED_HANGING_SIGN, Rarity.RARE); //end of 1.20
		ptr.put(Material.PALE_OAK_HANGING_SIGN, Rarity.RARE);
		ptr.put(Material.PALE_OAK_LEAVES, Rarity.COMMON);
		ptr.put(Material.PALE_OAK_LOG, Rarity.COMMON);
		ptr.put(Material.STRIPPED_PALE_OAK_LOG, Rarity.COMMON);
		ptr.put(Material.PALE_OAK_WOOD, Rarity.COMMON);
		ptr.put(Material.STRIPPED_PALE_OAK_WOOD, Rarity.COMMON);
		ptr.put(Material.PALE_OAK_PLANKS, Rarity.COMMON);
		ptr.put(Material.PALE_OAK_STAIRS, Rarity.COMMON);
		ptr.put(Material.PALE_OAK_SLAB, Rarity.COMMON);
		ptr.put(Material.PALE_OAK_FENCE, Rarity.COMMON);
		ptr.put(Material.CHISELED_COPPER, Rarity.RARE);
		ptr.put(Material.EXPOSED_CHISELED_COPPER, Rarity.RARE);
		ptr.put(Material.WEATHERED_CHISELED_COPPER, Rarity.RARE);
		ptr.put(Material.OXIDIZED_CHISELED_COPPER, Rarity.RARE);
		ptr.put(Material.WAXED_CHISELED_COPPER, Rarity.RARE);
		ptr.put(Material.WAXED_EXPOSED_CHISELED_COPPER, Rarity.RARE);
		ptr.put(Material.WAXED_WEATHERED_CHISELED_COPPER, Rarity.RARE);
		ptr.put(Material.WAXED_OXIDIZED_CHISELED_COPPER, Rarity.RARE);
		ptr.put(Material.COPPER_GRATE, Rarity.RARE);
		ptr.put(Material.EXPOSED_COPPER_GRATE, Rarity.RARE);
		ptr.put(Material.WEATHERED_COPPER_GRATE, Rarity.RARE);
		ptr.put(Material.OXIDIZED_COPPER_GRATE, Rarity.RARE);
		ptr.put(Material.WAXED_COPPER_GRATE, Rarity.RARE);
		ptr.put(Material.WAXED_EXPOSED_COPPER_GRATE, Rarity.RARE);
		ptr.put(Material.WAXED_WEATHERED_COPPER_GRATE, Rarity.RARE);
		ptr.put(Material.WAXED_OXIDIZED_COPPER_GRATE, Rarity.RARE);
		ptr.put(Material.PALE_MOSS_BLOCK, Rarity.COMMON);
		ptr.put(Material.PALE_MOSS_CARPET, Rarity.COMMON);
		ptr.put(Material.RESIN_BLOCK, Rarity.UNCOMMON);
		ptr.put(Material.RESIN_BRICKS, Rarity.UNCOMMON);
		ptr.put(Material.RESIN_BRICK_STAIRS, Rarity.UNCOMMON);
		ptr.put(Material.RESIN_BRICK_SLAB, Rarity.UNCOMMON);
		ptr.put(Material.RESIN_BRICK_WALL, Rarity.UNCOMMON);
		ptr.put(Material.CHISELED_RESIN_BRICKS, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_BARS, Rarity.RARE);
		ptr.put(Material.EXPOSED_COPPER_BARS, Rarity.RARE);
		ptr.put(Material.WEATHERED_COPPER_BARS, Rarity.RARE);
		ptr.put(Material.OXIDIZED_COPPER_BARS, Rarity.RARE);
		ptr.put(Material.WAXED_COPPER_BARS, Rarity.RARE);
		ptr.put(Material.WAXED_EXPOSED_COPPER_BARS, Rarity.RARE);
		ptr.put(Material.WAXED_WEATHERED_COPPER_BARS, Rarity.RARE);
		ptr.put(Material.WAXED_OXIDIZED_COPPER_BARS, Rarity.RARE);
		ptr.put(Material.COPPER_CHAIN, Rarity.RARE);
		ptr.put(Material.EXPOSED_COPPER_CHAIN, Rarity.RARE);
		ptr.put(Material.WEATHERED_COPPER_CHAIN, Rarity.RARE);
		ptr.put(Material.OXIDIZED_COPPER_CHAIN, Rarity.RARE);
		ptr.put(Material.WAXED_COPPER_CHAIN, Rarity.RARE);
		ptr.put(Material.WAXED_EXPOSED_COPPER_CHAIN, Rarity.RARE);
		ptr.put(Material.WAXED_WEATHERED_COPPER_CHAIN, Rarity.RARE);
		ptr.put(Material.WAXED_OXIDIZED_COPPER_CHAIN, Rarity.RARE);
		ptr.put(Material.FLOWER_POT, Rarity.UNCOMMON);
		ptr.put(Material.DECORATED_POT, Rarity.UNCOMMON);
		ptr.put(Material.ACACIA_LEAVES, Rarity.COMMON);
		ptr.put(Material.BIRCH_LEAVES, Rarity.COMMON);
		ptr.put(Material.DARK_OAK_LEAVES, Rarity.COMMON);
		ptr.put(Material.JUNGLE_LEAVES, Rarity.COMMON);
		ptr.put(Material.OAK_LEAVES, Rarity.COMMON);
		ptr.put(Material.SPRUCE_LEAVES, Rarity.COMMON);
		ptr.put(Material.AZALEA_LEAVES, Rarity.COMMON);
		ptr.put(Material.FLOWERING_AZALEA_LEAVES, Rarity.COMMON);
		ptr.put(Material.MANGROVE_LEAVES, Rarity.COMMON);
		ptr.put(Material.CREEPER_HEAD, Rarity.LEGENDARY);
		ptr.put(Material.DRAGON_HEAD, Rarity.MYSTIC);
		ptr.put(Material.PIGLIN_HEAD, Rarity.LEGENDARY);
		ptr.put(Material.SKELETON_SKULL, Rarity.LEGENDARY);
		ptr.put(Material.WITHER_SKELETON_SKULL, Rarity.EPIC);
		ptr.put(Material.ZOMBIE_HEAD, Rarity.LEGENDARY);
		//end of BLOCK
		ptr = CRATE_DATA[Crate.BOOTS.getID()];
		ptr.put(Material.LEATHER_BOOTS, Rarity.COMMON);
		ptr.put(Material.COPPER_BOOTS, Rarity.UNCOMMON);
		ptr.put(Material.GOLDEN_BOOTS, Rarity.UNCOMMON);
		ptr.put(Material.CHAINMAIL_BOOTS, Rarity.RARE);
		ptr.put(Material.IRON_BOOTS, Rarity.EPIC);
		ptr.put(Material.DIAMOND_BOOTS, Rarity.LEGENDARY);
		ptr.put(Material.NETHERITE_BOOTS, Rarity.MYSTIC);
		//end of BOOTS
		ptr = CRATE_DATA[Crate.CHESTPLATE.getID()];
		ptr.put(Material.LEATHER_CHESTPLATE, Rarity.COMMON);
		ptr.put(Material.COPPER_CHESTPLATE, Rarity.UNCOMMON);
		ptr.put(Material.GOLDEN_CHESTPLATE, Rarity.UNCOMMON);
		ptr.put(Material.CHAINMAIL_CHESTPLATE, Rarity.RARE);
		ptr.put(Material.IRON_CHESTPLATE, Rarity.EPIC);
		ptr.put(Material.DIAMOND_CHESTPLATE, Rarity.LEGENDARY);
		ptr.put(Material.NETHERITE_CHESTPLATE, Rarity.MYSTIC);
		ptr.put(Material.ELYTRA, Rarity.MYSTIC);
		//end of CHESTPLATE
		ptr = CRATE_DATA[Crate.COMBAT.getID()];
		ptr.put(Material.BOW, Rarity.UNCOMMON);
		ptr.put(Material.CROSSBOW, Rarity.UNCOMMON); //end of Bow
		ptr.put(Material.LEATHER_HELMET, Rarity.COMMON);
		ptr.put(Material.LEATHER_CHESTPLATE, Rarity.COMMON);
		ptr.put(Material.LEATHER_LEGGINGS, Rarity.COMMON);
		ptr.put(Material.LEATHER_BOOTS, Rarity.COMMON);
		ptr.put(Material.COPPER_HELMET, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_CHESTPLATE, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_LEGGINGS, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_BOOTS, Rarity.UNCOMMON);
		ptr.put(Material.GOLDEN_HELMET, Rarity.UNCOMMON);
		ptr.put(Material.GOLDEN_CHESTPLATE, Rarity.UNCOMMON);
		ptr.put(Material.GOLDEN_LEGGINGS, Rarity.UNCOMMON);
		ptr.put(Material.GOLDEN_BOOTS, Rarity.UNCOMMON);
		ptr.put(Material.CHAINMAIL_HELMET, Rarity.RARE);
		ptr.put(Material.CHAINMAIL_CHESTPLATE, Rarity.RARE);
		ptr.put(Material.CHAINMAIL_LEGGINGS, Rarity.RARE);
		ptr.put(Material.CHAINMAIL_BOOTS, Rarity.RARE);
		ptr.put(Material.IRON_HELMET, Rarity.EPIC);
		ptr.put(Material.IRON_CHESTPLATE, Rarity.EPIC);
		ptr.put(Material.IRON_LEGGINGS, Rarity.EPIC);
		ptr.put(Material.IRON_BOOTS, Rarity.EPIC);
		ptr.put(Material.TURTLE_HELMET, Rarity.LEGENDARY);
		ptr.put(Material.DIAMOND_HELMET, Rarity.LEGENDARY);
		ptr.put(Material.DIAMOND_CHESTPLATE, Rarity.LEGENDARY);
		ptr.put(Material.DIAMOND_LEGGINGS, Rarity.LEGENDARY);
		ptr.put(Material.DIAMOND_BOOTS, Rarity.LEGENDARY);
		ptr.put(Material.NETHERITE_HELMET, Rarity.MYSTIC);
		ptr.put(Material.NETHERITE_CHESTPLATE, Rarity.MYSTIC);
		ptr.put(Material.NETHERITE_LEGGINGS, Rarity.MYSTIC);
		ptr.put(Material.NETHERITE_BOOTS, Rarity.MYSTIC); //end of Armor
		ptr.put(Material.WOODEN_AXE, Rarity.COMMON);
		ptr.put(Material.GOLDEN_AXE, Rarity.COMMON);
		ptr.put(Material.STONE_AXE, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_AXE, Rarity.RARE);
		ptr.put(Material.IRON_AXE, Rarity.EPIC);
		ptr.put(Material.DIAMOND_AXE, Rarity.LEGENDARY);
		ptr.put(Material.NETHERITE_AXE, Rarity.MYSTIC); //end of Axe
		ptr.put(Material.WOODEN_SWORD, Rarity.COMMON);
		ptr.put(Material.GOLDEN_SWORD, Rarity.COMMON);
		ptr.put(Material.STONE_SWORD, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_SWORD, Rarity.RARE);
		ptr.put(Material.IRON_SWORD, Rarity.EPIC);
		ptr.put(Material.DIAMOND_SWORD, Rarity.LEGENDARY);
		ptr.put(Material.NETHERITE_SWORD, Rarity.MYSTIC); //end of Sword
		ptr.put(Material.SHIELD, Rarity.RARE);
		ptr.put(Material.TRIDENT, Rarity.MYSTIC);
		ptr.put(Material.FIRE_CHARGE, Rarity.RARE);
		ptr.put(Material.WIND_CHARGE, Rarity.RARE);
		ptr.put(Material.MACE, Rarity.MYSTIC);
		ptr.put(Material.SNOWBALL, Rarity.COMMON); //
		ptr.put(Material.ARROW, Rarity.COMMON);
		ptr.put(Material.SPECTRAL_ARROW, Rarity.RARE);
		ptr.put(Material.TIPPED_ARROW, Rarity.LEGENDARY); //end of Arrow
		ptr.put(Material.TNT, Rarity.RARE);
		ptr.put(Material.FLINT_AND_STEEL, Rarity.RARE);
		ptr.put(Material.END_CRYSTAL, Rarity.LEGENDARY);
		ptr.put(Material.FIREWORK_ROCKET, Rarity.EPIC);
		ptr.put(Material.ELYTRA, Rarity.MYSTIC);
		//end of COMBAT
		ptr = CRATE_DATA[Crate.COPPER.getID()];
		ptr.put(Material.COPPER_ORE, Rarity.EPIC);
		ptr.put(Material.DEEPSLATE_COPPER_ORE, Rarity.EPIC);
		ptr.put(Material.RAW_COPPER, Rarity.UNCOMMON);
		ptr.put(Material.RAW_COPPER_BLOCK, Rarity.RARE);
		ptr.put(Material.COPPER_NUGGET, Rarity.COMMON);
		ptr.put(Material.COPPER_INGOT, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_BLOCK, Rarity.RARE);
		ptr.put(Material.CUT_COPPER, Rarity.RARE);
		ptr.put(Material.CUT_COPPER_STAIRS, Rarity.RARE);
		ptr.put(Material.CUT_COPPER_SLAB, Rarity.RARE);
		ptr.put(Material.EXPOSED_COPPER, Rarity.RARE);
		ptr.put(Material.EXPOSED_CUT_COPPER, Rarity.RARE);
		ptr.put(Material.EXPOSED_CUT_COPPER_STAIRS, Rarity.RARE);
		ptr.put(Material.EXPOSED_CUT_COPPER_SLAB, Rarity.RARE);
		ptr.put(Material.WEATHERED_COPPER, Rarity.RARE);
		ptr.put(Material.WEATHERED_CUT_COPPER, Rarity.RARE);
		ptr.put(Material.WEATHERED_CUT_COPPER_STAIRS, Rarity.RARE);
		ptr.put(Material.WEATHERED_CUT_COPPER_SLAB, Rarity.RARE);
		ptr.put(Material.OXIDIZED_COPPER, Rarity.RARE);
		ptr.put(Material.OXIDIZED_CUT_COPPER, Rarity.RARE);
		ptr.put(Material.OXIDIZED_CUT_COPPER_STAIRS, Rarity.RARE);
		ptr.put(Material.OXIDIZED_CUT_COPPER_SLAB, Rarity.RARE);
		ptr.put(Material.WAXED_COPPER_BLOCK, Rarity.RARE);
		ptr.put(Material.WAXED_CUT_COPPER, Rarity.RARE);
		ptr.put(Material.WAXED_CUT_COPPER_STAIRS, Rarity.RARE);
		ptr.put(Material.WAXED_CUT_COPPER_SLAB, Rarity.RARE);
		ptr.put(Material.WAXED_EXPOSED_COPPER, Rarity.RARE);
		ptr.put(Material.WAXED_EXPOSED_CUT_COPPER, Rarity.RARE);
		ptr.put(Material.WAXED_EXPOSED_CUT_COPPER_STAIRS, Rarity.RARE);
		ptr.put(Material.WAXED_EXPOSED_CUT_COPPER_SLAB, Rarity.RARE);
		ptr.put(Material.WAXED_WEATHERED_COPPER, Rarity.RARE);
		ptr.put(Material.WAXED_WEATHERED_CUT_COPPER, Rarity.RARE);
		ptr.put(Material.WAXED_WEATHERED_CUT_COPPER_STAIRS, Rarity.RARE);
		ptr.put(Material.WAXED_WEATHERED_CUT_COPPER_SLAB, Rarity.RARE);
		ptr.put(Material.WAXED_OXIDIZED_COPPER, Rarity.RARE);
		ptr.put(Material.WAXED_OXIDIZED_CUT_COPPER, Rarity.RARE);
		ptr.put(Material.WAXED_OXIDIZED_CUT_COPPER_STAIRS, Rarity.RARE);
		ptr.put(Material.WAXED_OXIDIZED_CUT_COPPER_SLAB, Rarity.RARE);
		ptr.put(Material.COPPER_BULB, Rarity.EPIC);
		ptr.put(Material.EXPOSED_COPPER_BULB, Rarity.EPIC);
		ptr.put(Material.WEATHERED_COPPER_BULB, Rarity.EPIC);
		ptr.put(Material.OXIDIZED_COPPER_BULB, Rarity.EPIC);
		ptr.put(Material.WAXED_COPPER_BULB, Rarity.EPIC);
		ptr.put(Material.WAXED_EXPOSED_COPPER_BULB, Rarity.EPIC);
		ptr.put(Material.WAXED_WEATHERED_COPPER_BULB, Rarity.EPIC);
		ptr.put(Material.WAXED_OXIDIZED_COPPER_BULB, Rarity.EPIC);
		ptr.put(Material.CHISELED_COPPER, Rarity.RARE);
		ptr.put(Material.EXPOSED_CHISELED_COPPER, Rarity.RARE);
		ptr.put(Material.WEATHERED_CHISELED_COPPER, Rarity.RARE);
		ptr.put(Material.OXIDIZED_CHISELED_COPPER, Rarity.RARE);
		ptr.put(Material.WAXED_CHISELED_COPPER, Rarity.RARE);
		ptr.put(Material.WAXED_EXPOSED_CHISELED_COPPER, Rarity.RARE);
		ptr.put(Material.WAXED_WEATHERED_CHISELED_COPPER, Rarity.RARE);
		ptr.put(Material.WAXED_OXIDIZED_CHISELED_COPPER, Rarity.RARE);
		ptr.put(Material.COPPER_GRATE, Rarity.RARE);
		ptr.put(Material.EXPOSED_COPPER_GRATE, Rarity.RARE);
		ptr.put(Material.WEATHERED_COPPER_GRATE, Rarity.RARE);
		ptr.put(Material.OXIDIZED_COPPER_GRATE, Rarity.RARE);
		ptr.put(Material.WAXED_COPPER_GRATE, Rarity.RARE);
		ptr.put(Material.WAXED_EXPOSED_COPPER_GRATE, Rarity.RARE);
		ptr.put(Material.WAXED_WEATHERED_COPPER_GRATE, Rarity.RARE);
		ptr.put(Material.WAXED_OXIDIZED_COPPER_GRATE, Rarity.RARE);
		ptr.put(Material.TRIAL_KEY, Rarity.LEGENDARY);
		ptr.put(Material.OMINOUS_TRIAL_KEY, Rarity.MYSTIC);
		ptr.put(Material.BOLT_ARMOR_TRIM_SMITHING_TEMPLATE, Rarity.LEGENDARY);
		ptr.put(Material.COPPER_CHEST, Rarity.RARE);
		ptr.put(Material.EXPOSED_COPPER_CHEST, Rarity.RARE);
		ptr.put(Material.WEATHERED_COPPER_CHEST, Rarity.RARE);
		ptr.put(Material.OXIDIZED_COPPER_CHEST, Rarity.RARE);
		ptr.put(Material.WAXED_COPPER_CHEST, Rarity.RARE);
		ptr.put(Material.WAXED_EXPOSED_COPPER_CHEST, Rarity.RARE);
		ptr.put(Material.WAXED_WEATHERED_COPPER_CHEST, Rarity.RARE);
		ptr.put(Material.WAXED_OXIDIZED_COPPER_CHEST, Rarity.RARE);
		ptr.put(Material.COPPER_GOLEM_STATUE, Rarity.RARE);
		ptr.put(Material.EXPOSED_COPPER_GOLEM_STATUE, Rarity.RARE);
		ptr.put(Material.WEATHERED_COPPER_GOLEM_STATUE, Rarity.RARE);
		ptr.put(Material.OXIDIZED_COPPER_GOLEM_STATUE, Rarity.RARE);
		ptr.put(Material.WAXED_COPPER_GOLEM_STATUE, Rarity.RARE);
		ptr.put(Material.WAXED_EXPOSED_COPPER_GOLEM_STATUE, Rarity.RARE);
		ptr.put(Material.WAXED_WEATHERED_COPPER_GOLEM_STATUE, Rarity.RARE);
		ptr.put(Material.WAXED_OXIDIZED_COPPER_GOLEM_STATUE, Rarity.RARE);
		ptr.put(Material.LIGHTNING_ROD, Rarity.RARE);
		ptr.put(Material.EXPOSED_LIGHTNING_ROD, Rarity.RARE);
		ptr.put(Material.WEATHERED_LIGHTNING_ROD, Rarity.RARE);
		ptr.put(Material.OXIDIZED_LIGHTNING_ROD, Rarity.RARE);
		ptr.put(Material.WAXED_LIGHTNING_ROD, Rarity.RARE);
		ptr.put(Material.WAXED_EXPOSED_LIGHTNING_ROD, Rarity.RARE);
		ptr.put(Material.WAXED_WEATHERED_LIGHTNING_ROD, Rarity.RARE);
		ptr.put(Material.WAXED_OXIDIZED_LIGHTNING_ROD, Rarity.RARE);
		ptr.put(Material.COPPER_TORCH, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_LANTERN, Rarity.RARE);
		ptr.put(Material.EXPOSED_COPPER_LANTERN, Rarity.RARE);
		ptr.put(Material.WEATHERED_COPPER_LANTERN, Rarity.RARE);
		ptr.put(Material.OXIDIZED_COPPER_LANTERN, Rarity.RARE);
		ptr.put(Material.WAXED_COPPER_LANTERN, Rarity.RARE);
		ptr.put(Material.WAXED_EXPOSED_COPPER_LANTERN, Rarity.RARE);
		ptr.put(Material.WAXED_WEATHERED_COPPER_LANTERN, Rarity.RARE);
		ptr.put(Material.WAXED_OXIDIZED_COPPER_LANTERN, Rarity.RARE);
		ptr.put(Material.COPPER_BARS, Rarity.RARE);
		ptr.put(Material.EXPOSED_COPPER_BARS, Rarity.RARE);
		ptr.put(Material.WEATHERED_COPPER_BARS, Rarity.RARE);
		ptr.put(Material.OXIDIZED_COPPER_BARS, Rarity.RARE);
		ptr.put(Material.WAXED_COPPER_BARS, Rarity.RARE);
		ptr.put(Material.WAXED_EXPOSED_COPPER_BARS, Rarity.RARE);
		ptr.put(Material.WAXED_WEATHERED_COPPER_BARS, Rarity.RARE);
		ptr.put(Material.WAXED_OXIDIZED_COPPER_BARS, Rarity.RARE);
		ptr.put(Material.COPPER_CHAIN, Rarity.RARE);
		ptr.put(Material.EXPOSED_COPPER_CHAIN, Rarity.RARE);
		ptr.put(Material.WEATHERED_COPPER_CHAIN, Rarity.RARE);
		ptr.put(Material.OXIDIZED_COPPER_CHAIN, Rarity.RARE);
		ptr.put(Material.WAXED_COPPER_CHAIN, Rarity.RARE);
		ptr.put(Material.WAXED_EXPOSED_COPPER_CHAIN, Rarity.RARE);
		ptr.put(Material.WAXED_WEATHERED_COPPER_CHAIN, Rarity.RARE);
		ptr.put(Material.WAXED_OXIDIZED_COPPER_CHAIN, Rarity.RARE);
		ptr.put(Material.COPPER_HELMET, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_CHESTPLATE, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_LEGGINGS, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_BOOTS, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_SWORD, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_PICKAXE, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_AXE, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_SHOVEL, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_HOE, Rarity.UNCOMMON);
		//end of COPPER
		ptr = CRATE_DATA[Crate.FOOD.getID()];
		ptr.put(Material.APPLE, Rarity.UNCOMMON);
		ptr.put(Material.GOLDEN_APPLE, Rarity.LEGENDARY);
		ptr.put(Material.ENCHANTED_GOLDEN_APPLE, Rarity.MYSTIC); //end of Apple
		ptr.put(Material.MUSHROOM_STEW, Rarity.RARE);
		ptr.put(Material.RABBIT_STEW, Rarity.EPIC);
		ptr.put(Material.SUSPICIOUS_STEW, Rarity.EPIC);
		ptr.put(Material.BEETROOT_SOUP, Rarity.RARE); //end of Stew
		ptr.put(Material.CHORUS_FRUIT, Rarity.LEGENDARY);
		ptr.put(Material.BREAD, Rarity.UNCOMMON); //
		ptr.put(Material.COD, Rarity.COMMON);
		ptr.put(Material.COOKED_COD, Rarity.UNCOMMON);
		ptr.put(Material.SALMON, Rarity.COMMON);
		ptr.put(Material.COOKED_SALMON, Rarity.UNCOMMON);
		ptr.put(Material.TROPICAL_FISH, Rarity.UNCOMMON);
		ptr.put(Material.PUFFERFISH, Rarity.UNCOMMON); //end of Fish
		ptr.put(Material.CAKE, Rarity.RARE);
		ptr.put(Material.COOKIE, Rarity.UNCOMMON);
		ptr.put(Material.SWEET_BERRIES, Rarity.COMMON);
		ptr.put(Material.GLOW_BERRIES, Rarity.UNCOMMON); //end of Berries
		ptr.put(Material.WHEAT, Rarity.COMMON); //
		ptr.put(Material.CARROT, Rarity.COMMON);
		ptr.put(Material.GOLDEN_CARROT, Rarity.EPIC); //end of Carrot
		ptr.put(Material.POTATO, Rarity.COMMON);
		ptr.put(Material.BAKED_POTATO, Rarity.UNCOMMON);
		ptr.put(Material.POISONOUS_POTATO, Rarity.COMMON); //end of Potato
		ptr.put(Material.PUMPKIN_PIE, Rarity.RARE);
		ptr.put(Material.MELON_SLICE, Rarity.UNCOMMON);
		ptr.put(Material.BEETROOT, Rarity.COMMON);
		ptr.put(Material.DRIED_KELP, Rarity.COMMON); //
		ptr.put(Material.PORKCHOP, Rarity.COMMON);
		ptr.put(Material.COOKED_PORKCHOP, Rarity.RARE);
		ptr.put(Material.BEEF, Rarity.COMMON);
		ptr.put(Material.COOKED_BEEF, Rarity.RARE);
		ptr.put(Material.CHICKEN, Rarity.COMMON);
		ptr.put(Material.COOKED_CHICKEN, Rarity.UNCOMMON);
		ptr.put(Material.MUTTON, Rarity.COMMON);
		ptr.put(Material.COOKED_MUTTON, Rarity.UNCOMMON);
		ptr.put(Material.RABBIT, Rarity.COMMON);
		ptr.put(Material.COOKED_RABBIT, Rarity.UNCOMMON); //end of Meat
		ptr.put(Material.ROTTEN_FLESH, Rarity.COMMON);
		ptr.put(Material.SPIDER_EYE, Rarity.COMMON);
		ptr.put(Material.COCOA_BEANS, Rarity.UNCOMMON);
		ptr.put(Material.EGG, Rarity.UNCOMMON);
		ptr.put(Material.BLUE_EGG, Rarity.UNCOMMON);
		ptr.put(Material.BROWN_EGG, Rarity.UNCOMMON);
		ptr.put(Material.MILK_BUCKET, Rarity.RARE); //
		ptr.put(Material.BROWN_MUSHROOM, Rarity.UNCOMMON);
		ptr.put(Material.RED_MUSHROOM, Rarity.UNCOMMON); //end of Mushroom
		ptr.put(Material.SUGAR, Rarity.UNCOMMON);
		ptr.put(Material.HONEY_BOTTLE, Rarity.EPIC);
		//end of FOOD
		ptr = CRATE_DATA[Crate.HELMET.getID()];
		ptr.put(Material.LEATHER_HELMET, Rarity.COMMON);
		ptr.put(Material.COPPER_HELMET, Rarity.UNCOMMON);
		ptr.put(Material.GOLDEN_HELMET, Rarity.UNCOMMON);
		ptr.put(Material.CHAINMAIL_HELMET, Rarity.RARE);
		ptr.put(Material.IRON_HELMET, Rarity.EPIC);
		ptr.put(Material.TURTLE_HELMET, Rarity.LEGENDARY);
		ptr.put(Material.DIAMOND_HELMET, Rarity.LEGENDARY);
		ptr.put(Material.NETHERITE_HELMET, Rarity.MYSTIC);
		//end of HELMET
		ptr = CRATE_DATA[Crate.HOE.getID()];
		ptr.put(Material.WOODEN_HOE, Rarity.COMMON);
		ptr.put(Material.GOLDEN_HOE, Rarity.COMMON);
		ptr.put(Material.STONE_HOE, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_HOE, Rarity.RARE);
		ptr.put(Material.IRON_HOE, Rarity.EPIC);
		ptr.put(Material.DIAMOND_HOE, Rarity.LEGENDARY);
		ptr.put(Material.NETHERITE_HOE, Rarity.MYSTIC);
		//end of HOE
		ptr = CRATE_DATA[Crate.LEGGINGS.getID()];
		ptr.put(Material.LEATHER_LEGGINGS, Rarity.COMMON);
		ptr.put(Material.COPPER_LEGGINGS, Rarity.UNCOMMON);
		ptr.put(Material.GOLDEN_LEGGINGS, Rarity.UNCOMMON);
		ptr.put(Material.CHAINMAIL_LEGGINGS, Rarity.RARE);
		ptr.put(Material.IRON_LEGGINGS, Rarity.EPIC);
		ptr.put(Material.DIAMOND_LEGGINGS, Rarity.LEGENDARY);
		ptr.put(Material.NETHERITE_LEGGINGS, Rarity.MYSTIC);
		//end of LEGGINGS
		ptr = CRATE_DATA[Crate.MATERIAL.getID()];
		ptr.put(Material.BLACK_CONCRETE_POWDER, Rarity.RARE);
		ptr.put(Material.BLUE_CONCRETE_POWDER, Rarity.RARE);
		ptr.put(Material.BROWN_CONCRETE_POWDER, Rarity.RARE);
		ptr.put(Material.CYAN_CONCRETE_POWDER, Rarity.RARE);
		ptr.put(Material.GRAY_CONCRETE_POWDER, Rarity.RARE);
		ptr.put(Material.GREEN_CONCRETE_POWDER, Rarity.RARE);
		ptr.put(Material.LIGHT_BLUE_CONCRETE_POWDER, Rarity.RARE);
		ptr.put(Material.LIGHT_GRAY_CONCRETE_POWDER, Rarity.RARE);
		ptr.put(Material.LIME_CONCRETE_POWDER, Rarity.RARE);
		ptr.put(Material.MAGENTA_CONCRETE_POWDER, Rarity.RARE);
		ptr.put(Material.ORANGE_CONCRETE_POWDER, Rarity.RARE);
		ptr.put(Material.PINK_CONCRETE_POWDER, Rarity.RARE);
		ptr.put(Material.PURPLE_CONCRETE_POWDER, Rarity.RARE);
		ptr.put(Material.RED_CONCRETE_POWDER, Rarity.RARE);
		ptr.put(Material.WHITE_CONCRETE_POWDER, Rarity.RARE);
		ptr.put(Material.YELLOW_CONCRETE_POWDER, Rarity.RARE); //end of Concrete Powder
		ptr.put(Material.BLACK_WOOL, Rarity.UNCOMMON);
		ptr.put(Material.BLUE_WOOL, Rarity.UNCOMMON);
		ptr.put(Material.BROWN_WOOL, Rarity.UNCOMMON);
		ptr.put(Material.CYAN_WOOL, Rarity.UNCOMMON);
		ptr.put(Material.GRAY_WOOL, Rarity.UNCOMMON);
		ptr.put(Material.GREEN_WOOL, Rarity.UNCOMMON);
		ptr.put(Material.LIGHT_BLUE_WOOL, Rarity.UNCOMMON);
		ptr.put(Material.LIGHT_GRAY_WOOL, Rarity.UNCOMMON);
		ptr.put(Material.LIME_WOOL, Rarity.UNCOMMON);
		ptr.put(Material.MAGENTA_WOOL, Rarity.UNCOMMON);
		ptr.put(Material.ORANGE_WOOL, Rarity.UNCOMMON);
		ptr.put(Material.PINK_WOOL, Rarity.UNCOMMON);
		ptr.put(Material.PURPLE_WOOL, Rarity.UNCOMMON);
		ptr.put(Material.RED_WOOL, Rarity.UNCOMMON);
		ptr.put(Material.WHITE_WOOL, Rarity.UNCOMMON);
		ptr.put(Material.YELLOW_WOOL, Rarity.UNCOMMON); //end of Wool
		ptr.put(Material.COAL_ORE, Rarity.UNCOMMON);
		ptr.put(Material.DEEPSLATE_COAL_ORE, Rarity.RARE);
		ptr.put(Material.COAL, Rarity.COMMON);
		ptr.put(Material.CHARCOAL, Rarity.COMMON);
		ptr.put(Material.COAL_BLOCK, Rarity.UNCOMMON);
		ptr.put(Material.DIAMOND_ORE, Rarity.LEGENDARY);
		ptr.put(Material.DEEPSLATE_DIAMOND_ORE, Rarity.LEGENDARY);
		ptr.put(Material.DIAMOND, Rarity.EPIC);
		ptr.put(Material.DIAMOND_BLOCK, Rarity.LEGENDARY);
		ptr.put(Material.EMERALD_ORE, Rarity.EPIC);
		ptr.put(Material.DEEPSLATE_EMERALD_ORE, Rarity.LEGENDARY);
		ptr.put(Material.EMERALD, Rarity.RARE);
		ptr.put(Material.EMERALD_BLOCK, Rarity.EPIC);
		ptr.put(Material.GOLD_ORE, Rarity.RARE);
		ptr.put(Material.DEEPSLATE_GOLD_ORE, Rarity.EPIC);
		ptr.put(Material.NETHER_GOLD_ORE, Rarity.EPIC);
		ptr.put(Material.GILDED_BLACKSTONE, Rarity.LEGENDARY);
		ptr.put(Material.GOLD_NUGGET, Rarity.RARE);
		ptr.put(Material.GOLD_INGOT, Rarity.RARE);
		ptr.put(Material.RAW_GOLD, Rarity.EPIC);
		ptr.put(Material.GOLD_BLOCK, Rarity.EPIC);
		ptr.put(Material.RAW_GOLD_BLOCK, Rarity.EPIC);
		ptr.put(Material.IRON_ORE, Rarity.RARE);
		ptr.put(Material.DEEPSLATE_IRON_ORE, Rarity.RARE);
		ptr.put(Material.IRON_NUGGET, Rarity.UNCOMMON);
		ptr.put(Material.IRON_INGOT, Rarity.UNCOMMON);
		ptr.put(Material.RAW_IRON, Rarity.RARE);
		ptr.put(Material.IRON_BLOCK, Rarity.RARE);
		ptr.put(Material.RAW_IRON_BLOCK, Rarity.RARE);
		ptr.put(Material.COPPER_ORE, Rarity.RARE);
		ptr.put(Material.DEEPSLATE_COPPER_ORE, Rarity.RARE);
		ptr.put(Material.COPPER_NUGGET, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_INGOT, Rarity.UNCOMMON);
		ptr.put(Material.RAW_COPPER, Rarity.RARE);
		ptr.put(Material.COPPER_BLOCK, Rarity.RARE);
		ptr.put(Material.RAW_COPPER_BLOCK, Rarity.RARE);
		ptr.put(Material.LAPIS_ORE, Rarity.EPIC);
		ptr.put(Material.DEEPSLATE_LAPIS_ORE, Rarity.EPIC);
		ptr.put(Material.LAPIS_LAZULI, Rarity.RARE);
		ptr.put(Material.LAPIS_BLOCK, Rarity.EPIC);
		ptr.put(Material.REDSTONE_ORE, Rarity.EPIC);
		ptr.put(Material.DEEPSLATE_REDSTONE_ORE, Rarity.EPIC);
		ptr.put(Material.REDSTONE, Rarity.RARE);
		ptr.put(Material.REDSTONE_BLOCK, Rarity.EPIC);
		ptr.put(Material.NETHER_QUARTZ_ORE, Rarity.EPIC);
		ptr.put(Material.QUARTZ, Rarity.RARE);
		ptr.put(Material.ANCIENT_DEBRIS, Rarity.MYSTIC);
		ptr.put(Material.NETHERITE_SCRAP, Rarity.LEGENDARY);
		ptr.put(Material.NETHERITE_INGOT, Rarity.LEGENDARY);
		ptr.put(Material.NETHERITE_BLOCK, Rarity.MYSTIC); //end of Mineral
		ptr.put(Material.CLAY_BALL, Rarity.COMMON);
		ptr.put(Material.CLAY, Rarity.COMMON); //end of Clay
		ptr.put(Material.RED_SAND, Rarity.COMMON);
		ptr.put(Material.SAND, Rarity.COMMON); //end of Sand
		ptr.put(Material.COBWEB, Rarity.RARE);
		ptr.put(Material.STRING, Rarity.UNCOMMON); //end of Web
		ptr.put(Material.BLACKSTONE, Rarity.UNCOMMON);
		ptr.put(Material.END_STONE, Rarity.EPIC);
		ptr.put(Material.GLOWSTONE, Rarity.RARE);
		ptr.put(Material.GRAVEL, Rarity.COMMON);
		ptr.put(Material.ICE, Rarity.UNCOMMON);
		ptr.put(Material.NETHERRACK, Rarity.UNCOMMON); //beginning of Dye
		ptr.put(Material.BLACK_DYE, Rarity.UNCOMMON);
		ptr.put(Material.BLUE_DYE, Rarity.UNCOMMON);
		ptr.put(Material.BROWN_DYE, Rarity.UNCOMMON);
		ptr.put(Material.CYAN_DYE, Rarity.UNCOMMON);
		ptr.put(Material.GRAY_DYE, Rarity.UNCOMMON);
		ptr.put(Material.GREEN_DYE, Rarity.UNCOMMON);
		ptr.put(Material.LIGHT_BLUE_DYE, Rarity.UNCOMMON);
		ptr.put(Material.LIGHT_GRAY_DYE, Rarity.UNCOMMON);
		ptr.put(Material.LIME_DYE, Rarity.UNCOMMON);
		ptr.put(Material.MAGENTA_DYE, Rarity.UNCOMMON);
		ptr.put(Material.ORANGE_DYE, Rarity.UNCOMMON);
		ptr.put(Material.PINK_DYE, Rarity.UNCOMMON);
		ptr.put(Material.PURPLE_DYE, Rarity.UNCOMMON);
		ptr.put(Material.RED_DYE, Rarity.UNCOMMON);
		ptr.put(Material.WHITE_DYE, Rarity.UNCOMMON);
		ptr.put(Material.YELLOW_DYE, Rarity.UNCOMMON); //end of Dye
		ptr.put(Material.ACACIA_LOG, Rarity.COMMON);
		ptr.put(Material.BIRCH_LOG, Rarity.COMMON);
		ptr.put(Material.DARK_OAK_LOG, Rarity.COMMON);
		ptr.put(Material.JUNGLE_LOG, Rarity.COMMON);
		ptr.put(Material.OAK_LOG, Rarity.COMMON);
		ptr.put(Material.SPRUCE_LOG, Rarity.COMMON);
		ptr.put(Material.MANGROVE_LOG, Rarity.COMMON);
		ptr.put(Material.CHERRY_LOG, Rarity.COMMON);
		ptr.put(Material.BAMBOO_BLOCK, Rarity.COMMON);
		ptr.put(Material.PALE_OAK_LOG, Rarity.COMMON);
		ptr.put(Material.CRIMSON_STEM, Rarity.UNCOMMON);
		ptr.put(Material.WARPED_STEM, Rarity.UNCOMMON); //end of Log
		ptr.put(Material.SOUL_SAND, Rarity.UNCOMMON);
		ptr.put(Material.SOUL_SOIL, Rarity.UNCOMMON); //end of Soul
		ptr.put(Material.COBBLESTONE, Rarity.COMMON);
		ptr.put(Material.STONE, Rarity.COMMON);
		ptr.put(Material.DEEPSLATE, Rarity.UNCOMMON);
		ptr.put(Material.ANDESITE, Rarity.UNCOMMON);
		ptr.put(Material.DIORITE, Rarity.UNCOMMON);
		ptr.put(Material.GRANITE, Rarity.UNCOMMON);
		ptr.put(Material.TUFF, Rarity.UNCOMMON); //end of Stone
		ptr.put(Material.AMETHYST_SHARD, Rarity.EPIC);
		ptr.put(Material.DIRT, Rarity.COMMON);
		ptr.put(Material.MUD, Rarity.COMMON);
		ptr.put(Material.STICK, Rarity.COMMON);
		ptr.put(Material.RESIN_BLOCK, Rarity.RARE);
		ptr.put(Material.RESIN_CLUMP, Rarity.RARE);
		ptr.put(Material.RESIN_BRICK, Rarity.UNCOMMON);
		//end of MATERIAL
		ptr = CRATE_DATA[Crate.NATURE.getID()];
		ptr.put(Material.APPLE, Rarity.UNCOMMON);
		ptr.put(Material.BAMBOO, Rarity.UNCOMMON); //
		ptr.put(Material.BEETROOT_SEEDS, Rarity.UNCOMMON);
		ptr.put(Material.BEETROOT, Rarity.UNCOMMON); //end of Beetroot
		ptr.put(Material.CACTUS, Rarity.UNCOMMON);
		ptr.put(Material.CARROT, Rarity.UNCOMMON);
		ptr.put(Material.CHORUS_FLOWER, Rarity.LEGENDARY);
		ptr.put(Material.COCOA_BEANS, Rarity.UNCOMMON); //
		ptr.put(Material.FERN, Rarity.UNCOMMON);
		ptr.put(Material.LARGE_FERN, Rarity.UNCOMMON); //end of Fern
		ptr.put(Material.SHORT_GRASS, Rarity.UNCOMMON);
		ptr.put(Material.TALL_GRASS, Rarity.UNCOMMON); //end of Grass
		ptr.put(Material.DEAD_BUSH, Rarity.UNCOMMON);
		ptr.put(Material.LILY_PAD, Rarity.UNCOMMON); //
		ptr.put(Material.MELON_SEEDS, Rarity.UNCOMMON);
		ptr.put(Material.MELON_SLICE, Rarity.UNCOMMON);
		ptr.put(Material.MELON, Rarity.UNCOMMON); //end of Melon
		ptr.put(Material.NETHER_WART, Rarity.EPIC);
		ptr.put(Material.POTATO, Rarity.UNCOMMON); //
		ptr.put(Material.PUMPKIN_SEEDS, Rarity.UNCOMMON);
		ptr.put(Material.PUMPKIN, Rarity.UNCOMMON);
		ptr.put(Material.CARVED_PUMPKIN, Rarity.RARE); //end of Pumpkin
		ptr.put(Material.SEAGRASS, Rarity.COMMON);
		ptr.put(Material.SUGAR_CANE, Rarity.COMMON);
		ptr.put(Material.SWEET_BERRIES, Rarity.UNCOMMON);
		ptr.put(Material.GLOW_BERRIES, Rarity.RARE); //end of Berries
		ptr.put(Material.WHEAT_SEEDS, Rarity.COMMON);
		ptr.put(Material.WHEAT, Rarity.UNCOMMON);
		ptr.put(Material.HAY_BLOCK, Rarity.UNCOMMON); //end of Wheat
		ptr.put(Material.ACACIA_LEAVES, Rarity.COMMON);
		ptr.put(Material.BIRCH_LEAVES, Rarity.COMMON);
		ptr.put(Material.DARK_OAK_LEAVES, Rarity.COMMON);
		ptr.put(Material.JUNGLE_LEAVES, Rarity.COMMON);
		ptr.put(Material.OAK_LEAVES, Rarity.COMMON);
		ptr.put(Material.SPRUCE_LEAVES, Rarity.COMMON);
		ptr.put(Material.AZALEA_LEAVES, Rarity.COMMON);
		ptr.put(Material.FLOWERING_AZALEA_LEAVES, Rarity.COMMON);
		ptr.put(Material.MANGROVE_LEAVES, Rarity.COMMON); //end of Leaves
		ptr.put(Material.ACACIA_LOG, Rarity.COMMON);
		ptr.put(Material.BIRCH_LOG, Rarity.COMMON);
		ptr.put(Material.DARK_OAK_LOG, Rarity.COMMON);
		ptr.put(Material.JUNGLE_LOG, Rarity.COMMON);
		ptr.put(Material.OAK_LOG, Rarity.COMMON);
		ptr.put(Material.SPRUCE_LOG, Rarity.COMMON);
		ptr.put(Material.MANGROVE_LOG, Rarity.COMMON); //end of Log
		ptr.put(Material.ACACIA_WOOD, Rarity.UNCOMMON);
		ptr.put(Material.BIRCH_WOOD, Rarity.UNCOMMON);
		ptr.put(Material.DARK_OAK_WOOD, Rarity.UNCOMMON);
		ptr.put(Material.JUNGLE_WOOD, Rarity.UNCOMMON);
		ptr.put(Material.OAK_WOOD, Rarity.UNCOMMON);
		ptr.put(Material.SPRUCE_WOOD, Rarity.UNCOMMON);
		ptr.put(Material.MANGROVE_WOOD, Rarity.UNCOMMON); //end of Wood
		ptr.put(Material.STRIPPED_ACACIA_LOG, Rarity.COMMON);
		ptr.put(Material.STRIPPED_BIRCH_LOG, Rarity.COMMON);
		ptr.put(Material.STRIPPED_DARK_OAK_LOG, Rarity.COMMON);
		ptr.put(Material.STRIPPED_JUNGLE_LOG, Rarity.COMMON);
		ptr.put(Material.STRIPPED_OAK_LOG, Rarity.COMMON);
		ptr.put(Material.STRIPPED_SPRUCE_LOG, Rarity.COMMON);
		ptr.put(Material.STRIPPED_MANGROVE_LOG, Rarity.COMMON); //end of Stripped Log
		ptr.put(Material.STRIPPED_ACACIA_WOOD, Rarity.UNCOMMON);
		ptr.put(Material.STRIPPED_BIRCH_WOOD, Rarity.UNCOMMON);
		ptr.put(Material.STRIPPED_DARK_OAK_WOOD, Rarity.UNCOMMON);
		ptr.put(Material.STRIPPED_JUNGLE_WOOD, Rarity.UNCOMMON);
		ptr.put(Material.STRIPPED_OAK_WOOD, Rarity.UNCOMMON);
		ptr.put(Material.STRIPPED_SPRUCE_WOOD, Rarity.UNCOMMON);
		ptr.put(Material.STRIPPED_MANGROVE_WOOD, Rarity.UNCOMMON); //end of Stripped Wood
		ptr.put(Material.ACACIA_SAPLING, Rarity.COMMON);
		ptr.put(Material.BIRCH_SAPLING, Rarity.COMMON);
		ptr.put(Material.DARK_OAK_SAPLING, Rarity.COMMON);
		ptr.put(Material.JUNGLE_SAPLING, Rarity.COMMON);
		ptr.put(Material.OAK_SAPLING, Rarity.COMMON);
		ptr.put(Material.SPRUCE_SAPLING, Rarity.COMMON);
		ptr.put(Material.MANGROVE_PROPAGULE, Rarity.COMMON); //end of Sapling
		ptr.put(Material.DANDELION, Rarity.COMMON);
		ptr.put(Material.POPPY, Rarity.COMMON);
		ptr.put(Material.CORNFLOWER, Rarity.COMMON);
		ptr.put(Material.LILY_OF_THE_VALLEY, Rarity.COMMON);
		ptr.put(Material.BLUE_ORCHID, Rarity.COMMON);
		ptr.put(Material.ALLIUM, Rarity.COMMON);
		ptr.put(Material.AZURE_BLUET, Rarity.COMMON);
		ptr.put(Material.RED_TULIP, Rarity.COMMON);
		ptr.put(Material.ORANGE_TULIP, Rarity.COMMON);
		ptr.put(Material.WHITE_TULIP, Rarity.COMMON);
		ptr.put(Material.PINK_TULIP, Rarity.COMMON);
		ptr.put(Material.OXEYE_DAISY, Rarity.COMMON);
		ptr.put(Material.SUNFLOWER, Rarity.COMMON);
		ptr.put(Material.LILAC, Rarity.UNCOMMON);
		ptr.put(Material.ROSE_BUSH, Rarity.UNCOMMON);
		ptr.put(Material.PEONY, Rarity.UNCOMMON);
		ptr.put(Material.WITHER_ROSE, Rarity.MYSTIC); //end of Flower
		ptr.put(Material.BEE_NEST, Rarity.RARE);
		ptr.put(Material.EGG, Rarity.UNCOMMON);
		ptr.put(Material.BLUE_EGG, Rarity.UNCOMMON);
		ptr.put(Material.BROWN_EGG, Rarity.UNCOMMON);
		ptr.put(Material.BONE_MEAL, Rarity.UNCOMMON);
		ptr.put(Material.BONE_BLOCK, Rarity.UNCOMMON);
		ptr.put(Material.INK_SAC, Rarity.UNCOMMON);
		ptr.put(Material.GLOW_INK_SAC, Rarity.RARE); //end of Ink
		ptr.put(Material.STICK, Rarity.COMMON); //
		ptr.put(Material.MYCELIUM, Rarity.EPIC);
		ptr.put(Material.PODZOL, Rarity.RARE);
		ptr.put(Material.GRASS_BLOCK, Rarity.UNCOMMON); //end of Grass Block
		ptr.put(Material.DIRT, Rarity.COMMON);
		ptr.put(Material.COARSE_DIRT, Rarity.COMMON);
		ptr.put(Material.ROOTED_DIRT, Rarity.UNCOMMON); //end of Dirt
		ptr.put(Material.SAND, Rarity.COMMON);
		ptr.put(Material.RED_SAND, Rarity.COMMON); //end of Sand
		ptr.put(Material.GRAVEL, Rarity.COMMON);
		ptr.put(Material.STONE, Rarity.UNCOMMON); //
		ptr.put(Material.ANDESITE, Rarity.UNCOMMON);
		ptr.put(Material.DIORITE, Rarity.UNCOMMON);
		ptr.put(Material.GRANITE, Rarity.UNCOMMON);
		ptr.put(Material.CALCITE, Rarity.RARE);
		ptr.put(Material.DEEPSLATE, Rarity.UNCOMMON);
		ptr.put(Material.TUFF, Rarity.UNCOMMON); //end of Stone
		ptr.put(Material.TERRACOTTA, Rarity.UNCOMMON);
		ptr.put(Material.RED_TERRACOTTA, Rarity.UNCOMMON);
		ptr.put(Material.ORANGE_TERRACOTTA, Rarity.UNCOMMON);
		ptr.put(Material.YELLOW_TERRACOTTA, Rarity.UNCOMMON);
		ptr.put(Material.BROWN_TERRACOTTA, Rarity.UNCOMMON);
		ptr.put(Material.WHITE_TERRACOTTA, Rarity.UNCOMMON);
		ptr.put(Material.LIGHT_GRAY_TERRACOTTA, Rarity.UNCOMMON); //end of Terracotta
		ptr.put(Material.BRAIN_CORAL, Rarity.RARE);
		ptr.put(Material.BRAIN_CORAL_FAN, Rarity.RARE);
		ptr.put(Material.BRAIN_CORAL_BLOCK, Rarity.RARE);
		ptr.put(Material.BUBBLE_CORAL, Rarity.RARE);
		ptr.put(Material.BUBBLE_CORAL_FAN, Rarity.RARE);
		ptr.put(Material.BUBBLE_CORAL_BLOCK, Rarity.RARE);
		ptr.put(Material.FIRE_CORAL, Rarity.RARE);
		ptr.put(Material.FIRE_CORAL_FAN, Rarity.RARE);
		ptr.put(Material.FIRE_CORAL_BLOCK, Rarity.RARE);
		ptr.put(Material.HORN_CORAL, Rarity.RARE);
		ptr.put(Material.HORN_CORAL_FAN, Rarity.RARE);
		ptr.put(Material.HORN_CORAL_BLOCK, Rarity.RARE);
		ptr.put(Material.TUBE_CORAL, Rarity.RARE);
		ptr.put(Material.TUBE_CORAL_FAN, Rarity.RARE);
		ptr.put(Material.TUBE_CORAL_BLOCK, Rarity.RARE);
		ptr.put(Material.DEAD_BRAIN_CORAL, Rarity.RARE);
		ptr.put(Material.DEAD_BRAIN_CORAL_FAN, Rarity.RARE);
		ptr.put(Material.DEAD_BRAIN_CORAL_BLOCK, Rarity.RARE);
		ptr.put(Material.DEAD_BUBBLE_CORAL, Rarity.RARE);
		ptr.put(Material.DEAD_BUBBLE_CORAL_FAN, Rarity.RARE);
		ptr.put(Material.DEAD_BUBBLE_CORAL_BLOCK, Rarity.RARE);
		ptr.put(Material.DEAD_FIRE_CORAL, Rarity.RARE);
		ptr.put(Material.DEAD_FIRE_CORAL_FAN, Rarity.RARE);
		ptr.put(Material.DEAD_FIRE_CORAL_BLOCK, Rarity.RARE);
		ptr.put(Material.DEAD_HORN_CORAL, Rarity.RARE);
		ptr.put(Material.DEAD_HORN_CORAL_FAN, Rarity.RARE);
		ptr.put(Material.DEAD_HORN_CORAL_BLOCK, Rarity.RARE);
		ptr.put(Material.DEAD_TUBE_CORAL, Rarity.RARE);
		ptr.put(Material.DEAD_TUBE_CORAL_FAN, Rarity.RARE);
		ptr.put(Material.DEAD_TUBE_CORAL_BLOCK, Rarity.RARE); //end of Coral
		ptr.put(Material.BROWN_MUSHROOM, Rarity.UNCOMMON);
		ptr.put(Material.RED_MUSHROOM, Rarity.UNCOMMON);
		ptr.put(Material.BROWN_MUSHROOM_BLOCK, Rarity.RARE);
		ptr.put(Material.RED_MUSHROOM_BLOCK, Rarity.RARE);
		ptr.put(Material.MUSHROOM_STEM, Rarity.RARE);
		ptr.put(Material.CRIMSON_FUNGUS, Rarity.RARE);
		ptr.put(Material.WARPED_FUNGUS, Rarity.RARE); //end of Mushroom
		ptr.put(Material.CLAY, Rarity.COMMON); //
		ptr.put(Material.COBWEB, Rarity.RARE);
		ptr.put(Material.END_STONE, Rarity.EPIC);
		ptr.put(Material.GLOWSTONE, Rarity.RARE);
		ptr.put(Material.SHROOMLIGHT, Rarity.RARE);
		ptr.put(Material.KELP, Rarity.COMMON);
		ptr.put(Material.MAGMA_BLOCK, Rarity.UNCOMMON);
		ptr.put(Material.NETHERRACK, Rarity.UNCOMMON);
		ptr.put(Material.BASALT, Rarity.UNCOMMON);
		ptr.put(Material.SMOOTH_BASALT, Rarity.RARE); //end of Basalt
		ptr.put(Material.OBSIDIAN, Rarity.RARE); //
		ptr.put(Material.ICE, Rarity.UNCOMMON);
		ptr.put(Material.PACKED_ICE, Rarity.RARE);
		ptr.put(Material.BLUE_ICE, Rarity.EPIC); //end of Ice
		ptr.put(Material.PRISMARINE, Rarity.EPIC);
		ptr.put(Material.PRISMARINE_BRICKS, Rarity.EPIC);
		ptr.put(Material.DARK_PRISMARINE, Rarity.EPIC); //end of Prismarine
		ptr.put(Material.SEA_LANTERN, Rarity.EPIC);
		ptr.put(Material.SEA_PICKLE, Rarity.RARE); //
		ptr.put(Material.SNOW, Rarity.UNCOMMON);
		ptr.put(Material.SNOW_BLOCK, Rarity.UNCOMMON); //end of Snow
		ptr.put(Material.SOUL_SAND, Rarity.UNCOMMON);
		ptr.put(Material.SOUL_SOIL, Rarity.UNCOMMON); //end of Soul
		ptr.put(Material.TURTLE_EGG, Rarity.EPIC);
		ptr.put(Material.WET_SPONGE, Rarity.LEGENDARY); //
		ptr.put(Material.CRIMSON_NYLIUM, Rarity.RARE);
		ptr.put(Material.WARPED_NYLIUM, Rarity.RARE); //end of Nylium
		ptr.put(Material.CRIMSON_STEM, Rarity.UNCOMMON);
		ptr.put(Material.WARPED_STEM, Rarity.UNCOMMON);
		ptr.put(Material.CRIMSON_HYPHAE, Rarity.UNCOMMON);
		ptr.put(Material.WARPED_HYPHAE, Rarity.UNCOMMON); //end of Stem
		ptr.put(Material.STRIPPED_CRIMSON_STEM, Rarity.UNCOMMON);
		ptr.put(Material.STRIPPED_WARPED_STEM, Rarity.UNCOMMON);
		ptr.put(Material.STRIPPED_CRIMSON_HYPHAE, Rarity.UNCOMMON);
		ptr.put(Material.STRIPPED_WARPED_HYPHAE, Rarity.UNCOMMON); //end of Stripped Stem
		ptr.put(Material.NETHER_SPROUTS, Rarity.UNCOMMON);
		ptr.put(Material.CRIMSON_ROOTS, Rarity.UNCOMMON);
		ptr.put(Material.WARPED_ROOTS, Rarity.UNCOMMON); //end of Roots
		ptr.put(Material.VINE, Rarity.UNCOMMON);
		ptr.put(Material.TWISTING_VINES, Rarity.UNCOMMON);
		ptr.put(Material.WEEPING_VINES, Rarity.UNCOMMON); //end of Vines
		ptr.put(Material.SMALL_AMETHYST_BUD, Rarity.LEGENDARY);
		ptr.put(Material.MEDIUM_AMETHYST_BUD, Rarity.LEGENDARY);
		ptr.put(Material.LARGE_AMETHYST_BUD, Rarity.LEGENDARY);
		ptr.put(Material.AMETHYST_CLUSTER, Rarity.LEGENDARY);
		ptr.put(Material.AMETHYST_BLOCK, Rarity.EPIC); //end of Amethyst
		ptr.put(Material.AZALEA, Rarity.UNCOMMON);
		ptr.put(Material.FLOWERING_AZALEA, Rarity.UNCOMMON); //end of Azalea
		ptr.put(Material.SMALL_DRIPLEAF, Rarity.RARE);
		ptr.put(Material.BIG_DRIPLEAF, Rarity.RARE); //end of Dripleaf
		ptr.put(Material.DRIPSTONE_BLOCK, Rarity.RARE);
		ptr.put(Material.POINTED_DRIPSTONE, Rarity.RARE);
		ptr.put(Material.GLOW_LICHEN, Rarity.UNCOMMON);
		ptr.put(Material.HANGING_ROOTS, Rarity.RARE);
		ptr.put(Material.MOSS_BLOCK, Rarity.UNCOMMON);
		ptr.put(Material.MOSS_CARPET, Rarity.UNCOMMON);
		ptr.put(Material.SPORE_BLOSSOM, Rarity.EPIC);
		ptr.put(Material.MANGROVE_ROOTS, Rarity.COMMON);
		ptr.put(Material.MUDDY_MANGROVE_ROOTS, Rarity.COMMON);
		ptr.put(Material.MUD, Rarity.COMMON);
		ptr.put(Material.SCULK, Rarity.EPIC);
		ptr.put(Material.SCULK_CATALYST, Rarity.EPIC);
		ptr.put(Material.SCULK_SENSOR, Rarity.EPIC);
		ptr.put(Material.SCULK_SHRIEKER, Rarity.LEGENDARY);
		ptr.put(Material.SCULK_VEIN, Rarity.EPIC);
		ptr.put(Material.CHERRY_LEAVES, Rarity.COMMON); //beginning of 1.20
		ptr.put(Material.CHERRY_LOG, Rarity.COMMON);
		ptr.put(Material.CHERRY_WOOD, Rarity.COMMON);
		ptr.put(Material.STRIPPED_CHERRY_LOG, Rarity.COMMON);
		ptr.put(Material.STRIPPED_CHERRY_WOOD, Rarity.COMMON);
		ptr.put(Material.CHERRY_SAPLING, Rarity.COMMON);
		ptr.put(Material.PINK_PETALS, Rarity.COMMON);
		ptr.put(Material.PITCHER_PLANT, Rarity.LEGENDARY);
		ptr.put(Material.PITCHER_POD, Rarity.LEGENDARY);
		ptr.put(Material.SNIFFER_EGG, Rarity.MYSTIC);
		ptr.put(Material.TORCHFLOWER, Rarity.LEGENDARY);
		ptr.put(Material.TORCHFLOWER_SEEDS, Rarity.LEGENDARY); //end of 1.20
		ptr.put(Material.PALE_OAK_LOG, Rarity.COMMON);
		ptr.put(Material.PALE_OAK_WOOD, Rarity.COMMON);
		ptr.put(Material.STRIPPED_PALE_OAK_LOG, Rarity.COMMON);
		ptr.put(Material.STRIPPED_PALE_OAK_WOOD, Rarity.COMMON);
		ptr.put(Material.PALE_HANGING_MOSS, Rarity.UNCOMMON);
		ptr.put(Material.PALE_MOSS_BLOCK, Rarity.COMMON);
		ptr.put(Material.PALE_MOSS_CARPET, Rarity.COMMON);
		ptr.put(Material.PALE_OAK_LEAVES, Rarity.COMMON);
		ptr.put(Material.PALE_OAK_SAPLING, Rarity.COMMON);
		ptr.put(Material.OPEN_EYEBLOSSOM, Rarity.COMMON);
		ptr.put(Material.CLOSED_EYEBLOSSOM, Rarity.COMMON);
		ptr.put(Material.CREAKING_HEART, Rarity.RARE);
		ptr.put(Material.LEAF_LITTER, Rarity.COMMON);
		ptr.put(Material.WILDFLOWERS, Rarity.COMMON);
		ptr.put(Material.BUSH, Rarity.UNCOMMON);
		ptr.put(Material.FIREFLY_BUSH, Rarity.UNCOMMON);
		ptr.put(Material.CACTUS_FLOWER, Rarity.UNCOMMON);
		ptr.put(Material.SHORT_DRY_GRASS, Rarity.UNCOMMON);
		ptr.put(Material.TALL_DRY_GRASS, Rarity.UNCOMMON);
		//end of NATURE
		ptr = CRATE_DATA[Crate.NETHER.getID()];
		ptr.put(Material.ANCIENT_DEBRIS, Rarity.LEGENDARY);
		ptr.put(Material.NETHERITE_SCRAP, Rarity.EPIC);
		ptr.put(Material.NETHERITE_INGOT, Rarity.LEGENDARY);
		ptr.put(Material.NETHERITE_BLOCK, Rarity.MYSTIC); //end of Netherite
		ptr.put(Material.BASALT, Rarity.COMMON);
		ptr.put(Material.POLISHED_BASALT, Rarity.COMMON); //end of Basalt
		ptr.put(Material.BLACKSTONE, Rarity.COMMON);
		ptr.put(Material.BLACKSTONE_SLAB, Rarity.COMMON);
		ptr.put(Material.BLACKSTONE_STAIRS, Rarity.COMMON);
		ptr.put(Material.BLACKSTONE_WALL, Rarity.COMMON);
		ptr.put(Material.POLISHED_BLACKSTONE, Rarity.COMMON);
		ptr.put(Material.CHISELED_POLISHED_BLACKSTONE, Rarity.COMMON);
		ptr.put(Material.POLISHED_BLACKSTONE_SLAB, Rarity.COMMON);
		ptr.put(Material.POLISHED_BLACKSTONE_STAIRS, Rarity.COMMON);
		ptr.put(Material.POLISHED_BLACKSTONE_WALL, Rarity.COMMON);
		ptr.put(Material.POLISHED_BLACKSTONE_BRICKS, Rarity.COMMON);
		ptr.put(Material.POLISHED_BLACKSTONE_BRICK_SLAB, Rarity.COMMON);
		ptr.put(Material.POLISHED_BLACKSTONE_BRICK_STAIRS, Rarity.COMMON);
		ptr.put(Material.POLISHED_BLACKSTONE_BRICK_WALL, Rarity.COMMON);
		ptr.put(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS, Rarity.COMMON);
		ptr.put(Material.GILDED_BLACKSTONE, Rarity.RARE); //end of Blackstone
		ptr.put(Material.NETHER_BRICK, Rarity.UNCOMMON);
		ptr.put(Material.NETHER_BRICK_FENCE, Rarity.UNCOMMON);
		ptr.put(Material.NETHER_BRICK_SLAB, Rarity.UNCOMMON);
		ptr.put(Material.NETHER_BRICK_STAIRS, Rarity.UNCOMMON);
		ptr.put(Material.NETHER_BRICK_WALL, Rarity.UNCOMMON);
		ptr.put(Material.NETHER_BRICKS, Rarity.UNCOMMON);
		ptr.put(Material.CHISELED_NETHER_BRICKS, Rarity.UNCOMMON);
		ptr.put(Material.CRACKED_NETHER_BRICKS, Rarity.UNCOMMON); //end of Nether Bricks
		ptr.put(Material.NETHER_GOLD_ORE, Rarity.RARE);
		ptr.put(Material.NETHER_QUARTZ_ORE, Rarity.RARE); //end of Ore
		ptr.put(Material.IRON_CHAIN, Rarity.RARE);
		ptr.put(Material.NETHER_SPROUTS, Rarity.UNCOMMON);
		ptr.put(Material.NETHER_STAR, Rarity.MYSTIC);
		ptr.put(Material.NETHER_WART, Rarity.RARE); //
		ptr.put(Material.NETHER_WART_BLOCK, Rarity.UNCOMMON);
		ptr.put(Material.WARPED_WART_BLOCK, Rarity.UNCOMMON); //end of Wart Block
		ptr.put(Material.RED_NETHER_BRICK_SLAB, Rarity.RARE);
		ptr.put(Material.RED_NETHER_BRICK_STAIRS, Rarity.RARE);
		ptr.put(Material.RED_NETHER_BRICK_WALL, Rarity.RARE);
		ptr.put(Material.RED_NETHER_BRICKS, Rarity.RARE); //end of Red Nether Bricks
		ptr.put(Material.NETHERITE_AXE, Rarity.MYSTIC);
		ptr.put(Material.NETHERITE_BOOTS, Rarity.MYSTIC);
		ptr.put(Material.NETHERITE_CHESTPLATE, Rarity.MYSTIC);
		ptr.put(Material.NETHERITE_HELMET, Rarity.MYSTIC);
		ptr.put(Material.NETHERITE_HOE, Rarity.MYSTIC);
		ptr.put(Material.NETHERITE_LEGGINGS, Rarity.MYSTIC);
		ptr.put(Material.NETHERITE_PICKAXE, Rarity.MYSTIC);
		ptr.put(Material.NETHERITE_SHOVEL, Rarity.MYSTIC);
		ptr.put(Material.NETHERITE_SWORD, Rarity.MYSTIC); //end of Netherite Stuff
		ptr.put(Material.CRIMSON_NYLIUM, Rarity.UNCOMMON);
		ptr.put(Material.WARPED_NYLIUM, Rarity.UNCOMMON); //end of Nylium
		ptr.put(Material.CRIMSON_FENCE, Rarity.COMMON);
		ptr.put(Material.CRIMSON_HYPHAE, Rarity.COMMON);
		ptr.put(Material.CRIMSON_PLANKS, Rarity.COMMON);
		ptr.put(Material.CRIMSON_SLAB, Rarity.COMMON);
		ptr.put(Material.CRIMSON_STAIRS, Rarity.COMMON);
		ptr.put(Material.CRIMSON_STEM, Rarity.COMMON);
		ptr.put(Material.STRIPPED_CRIMSON_HYPHAE, Rarity.COMMON);
		ptr.put(Material.STRIPPED_CRIMSON_STEM, Rarity.COMMON);
		ptr.put(Material.CRIMSON_HANGING_SIGN, Rarity.RARE);
		ptr.put(Material.CRIMSON_SHELF, Rarity.COMMON); //end of Crimson
		ptr.put(Material.WARPED_FENCE, Rarity.COMMON);
		ptr.put(Material.WARPED_HYPHAE, Rarity.COMMON);
		ptr.put(Material.WARPED_PLANKS, Rarity.COMMON);
		ptr.put(Material.WARPED_SLAB, Rarity.COMMON);
		ptr.put(Material.WARPED_STAIRS, Rarity.COMMON);
		ptr.put(Material.WARPED_STEM, Rarity.COMMON);
		ptr.put(Material.STRIPPED_WARPED_HYPHAE, Rarity.COMMON);
		ptr.put(Material.STRIPPED_WARPED_STEM, Rarity.COMMON);
		ptr.put(Material.WARPED_HANGING_SIGN, Rarity.RARE);
		ptr.put(Material.WARPED_SHELF, Rarity.COMMON); //end of Warped
		ptr.put(Material.QUARTZ, Rarity.UNCOMMON);
		ptr.put(Material.QUARTZ_BLOCK, Rarity.UNCOMMON);
		ptr.put(Material.QUARTZ_BRICKS, Rarity.UNCOMMON);
		ptr.put(Material.QUARTZ_PILLAR, Rarity.UNCOMMON);
		ptr.put(Material.QUARTZ_SLAB, Rarity.UNCOMMON);
		ptr.put(Material.QUARTZ_STAIRS, Rarity.UNCOMMON);
		ptr.put(Material.CHISELED_QUARTZ_BLOCK, Rarity.UNCOMMON);
		ptr.put(Material.SMOOTH_QUARTZ, Rarity.UNCOMMON);
		ptr.put(Material.SMOOTH_QUARTZ_SLAB, Rarity.UNCOMMON);
		ptr.put(Material.SMOOTH_QUARTZ_STAIRS, Rarity.UNCOMMON); //end of Quartz
		ptr.put(Material.OBSIDIAN, Rarity.RARE);
		ptr.put(Material.CRYING_OBSIDIAN, Rarity.RARE); //end of Obsidian
		ptr.put(Material.RESPAWN_ANCHOR, Rarity.EPIC);
		ptr.put(Material.SHROOMLIGHT, Rarity.UNCOMMON); //
		ptr.put(Material.SOUL_CAMPFIRE, Rarity.UNCOMMON);
		ptr.put(Material.SOUL_LANTERN, Rarity.RARE);
		ptr.put(Material.SOUL_SAND, Rarity.COMMON);
		ptr.put(Material.SOUL_SOIL, Rarity.COMMON);
		ptr.put(Material.SOUL_TORCH, Rarity.UNCOMMON); //end of Soul
		ptr.put(Material.TWISTING_VINES, Rarity.UNCOMMON);
		ptr.put(Material.WEEPING_VINES, Rarity.UNCOMMON); //end of Vines
		ptr.put(Material.WARPED_FUNGUS_ON_A_STICK, Rarity.UNCOMMON);
		ptr.put(Material.CRIMSON_FUNGUS, Rarity.COMMON);
		ptr.put(Material.WARPED_FUNGUS, Rarity.COMMON); //end of Fungus
		ptr.put(Material.CRIMSON_ROOTS, Rarity.COMMON);
		ptr.put(Material.WARPED_ROOTS, Rarity.COMMON); //end of Roots
		ptr.put(Material.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Rarity.MYSTIC);
		ptr.put(Material.SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE, Rarity.LEGENDARY);
		ptr.put(Material.RIB_ARMOR_TRIM_SMITHING_TEMPLATE, Rarity.LEGENDARY);
		ptr.put(Material.DRIED_GHAST, Rarity.EPIC);
		ptr.put(Material.GLOWSTONE, Rarity.UNCOMMON);
		ptr.put(Material.GLOWSTONE_DUST, Rarity.UNCOMMON);
		ptr.put(Material.GOLDEN_HELMET, Rarity.UNCOMMON);
		ptr.put(Material.GOLDEN_CHESTPLATE, Rarity.UNCOMMON);
		ptr.put(Material.GOLDEN_LEGGINGS, Rarity.UNCOMMON);
		ptr.put(Material.GOLDEN_BOOTS, Rarity.UNCOMMON);
		ptr.put(Material.GOLDEN_SWORD, Rarity.UNCOMMON);
		ptr.put(Material.GOLDEN_AXE, Rarity.UNCOMMON);
		ptr.put(Material.GOLDEN_PICKAXE, Rarity.UNCOMMON);
		ptr.put(Material.GOLDEN_HOE, Rarity.UNCOMMON);
		ptr.put(Material.WITHER_SKELETON_SKULL, Rarity.LEGENDARY);
		//end of NETHER
		ptr = CRATE_DATA[Crate.PICKAXE.getID()];
		ptr.put(Material.WOODEN_PICKAXE, Rarity.COMMON);
		ptr.put(Material.GOLDEN_PICKAXE, Rarity.COMMON);
		ptr.put(Material.STONE_PICKAXE, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_PICKAXE, Rarity.RARE);
		ptr.put(Material.IRON_PICKAXE, Rarity.EPIC);
		ptr.put(Material.DIAMOND_PICKAXE, Rarity.LEGENDARY);
		ptr.put(Material.NETHERITE_PICKAXE, Rarity.MYSTIC);
		//end of PICKAXE
		ptr = CRATE_DATA[Crate.POTION.getID()];
		ptr.put(Material.GLASS_BOTTLE, Rarity.COMMON);
		ptr.put(Material.POTION, Rarity.RARE);
		ptr.put(Material.SPLASH_POTION, Rarity.EPIC);
		ptr.put(Material.LINGERING_POTION, Rarity.MYSTIC);
		ptr.put(Material.OMINOUS_BOTTLE, Rarity.LEGENDARY); //end of Potion
		ptr.put(Material.NETHER_WART, Rarity.RARE);
		ptr.put(Material.GLOWSTONE_DUST, Rarity.UNCOMMON);
		ptr.put(Material.REDSTONE, Rarity.UNCOMMON);
		ptr.put(Material.GUNPOWDER, Rarity.UNCOMMON);
		ptr.put(Material.DRAGON_BREATH, Rarity.MYSTIC);
		ptr.put(Material.SUGAR, Rarity.COMMON);
		ptr.put(Material.PUFFERFISH, Rarity.COMMON);
		ptr.put(Material.TURTLE_SCUTE, Rarity.EPIC);
		ptr.put(Material.GHAST_TEAR, Rarity.RARE);
		ptr.put(Material.SPIDER_EYE, Rarity.UNCOMMON);
		ptr.put(Material.FERMENTED_SPIDER_EYE, Rarity.RARE);
		ptr.put(Material.BLAZE_ROD, Rarity.RARE);
		ptr.put(Material.BLAZE_POWDER, Rarity.RARE);
		ptr.put(Material.MAGMA_CREAM, Rarity.UNCOMMON);
		ptr.put(Material.GLISTERING_MELON_SLICE, Rarity.RARE);
		ptr.put(Material.GOLDEN_CARROT, Rarity.UNCOMMON);
		ptr.put(Material.RABBIT_FOOT, Rarity.EPIC);
		ptr.put(Material.PHANTOM_MEMBRANE, Rarity.RARE);
		ptr.put(Material.BREWING_STAND, Rarity.RARE);
		ptr.put(Material.CAULDRON, Rarity.UNCOMMON);
		ptr.put(Material.TURTLE_HELMET, Rarity.LEGENDARY);
		ptr.put(Material.STONE, Rarity.COMMON);
		ptr.put(Material.SLIME_BLOCK, Rarity.RARE);
		ptr.put(Material.COBWEB, Rarity.RARE);
		ptr.put(Material.BREEZE_ROD, Rarity.RARE);
		//end of POTION
		ptr = CRATE_DATA[Crate.PROJECTILE.getID()];
		ptr.put(Material.ARROW, Rarity.UNCOMMON);
		ptr.put(Material.SPECTRAL_ARROW, Rarity.RARE);
		ptr.put(Material.TIPPED_ARROW, Rarity.MYSTIC); //end of Arrow
		ptr.put(Material.EXPERIENCE_BOTTLE, Rarity.LEGENDARY);
		ptr.put(Material.TRIDENT, Rarity.MYSTIC);
		ptr.put(Material.SNOWBALL, Rarity.COMMON);
		ptr.put(Material.EGG, Rarity.UNCOMMON);
		ptr.put(Material.BLUE_EGG, Rarity.UNCOMMON);
		ptr.put(Material.BROWN_EGG, Rarity.UNCOMMON);
		ptr.put(Material.ENDER_PEARL, Rarity.RARE);
		ptr.put(Material.ENDER_EYE, Rarity.EPIC);
		ptr.put(Material.FIRE_CHARGE, Rarity.RARE);
		ptr.put(Material.FIREWORK_ROCKET, Rarity.LEGENDARY);
		ptr.put(Material.WIND_CHARGE, Rarity.EPIC);
		//end of PROJECTILE
		ptr = CRATE_DATA[Crate.REDSTONE.getID()];
		ptr.put(Material.ACACIA_BUTTON, Rarity.COMMON);
		ptr.put(Material.BIRCH_BUTTON, Rarity.COMMON);
		ptr.put(Material.DARK_OAK_BUTTON, Rarity.COMMON);
		ptr.put(Material.JUNGLE_BUTTON, Rarity.COMMON);
		ptr.put(Material.OAK_BUTTON, Rarity.COMMON);
		ptr.put(Material.SPRUCE_BUTTON, Rarity.COMMON);
		ptr.put(Material.MANGROVE_BUTTON, Rarity.COMMON);
		ptr.put(Material.BAMBOO_BUTTON, Rarity.COMMON);
		ptr.put(Material.CHERRY_BUTTON, Rarity.COMMON);
		ptr.put(Material.PALE_OAK_BUTTON, Rarity.COMMON);
		ptr.put(Material.CRIMSON_BUTTON, Rarity.UNCOMMON);
		ptr.put(Material.WARPED_BUTTON, Rarity.UNCOMMON);
		ptr.put(Material.STONE_BUTTON, Rarity.UNCOMMON);
		ptr.put(Material.POLISHED_BLACKSTONE_BUTTON, Rarity.UNCOMMON); //end of Button
		ptr.put(Material.ACACIA_DOOR, Rarity.COMMON);
		ptr.put(Material.BIRCH_DOOR, Rarity.COMMON);
		ptr.put(Material.DARK_OAK_DOOR, Rarity.COMMON);
		ptr.put(Material.JUNGLE_DOOR, Rarity.COMMON);
		ptr.put(Material.OAK_DOOR, Rarity.COMMON);
		ptr.put(Material.SPRUCE_DOOR, Rarity.COMMON);
		ptr.put(Material.MANGROVE_DOOR, Rarity.COMMON);
		ptr.put(Material.BAMBOO_DOOR, Rarity.COMMON);
		ptr.put(Material.CHERRY_DOOR, Rarity.COMMON);
		ptr.put(Material.PALE_OAK_DOOR, Rarity.COMMON);
		ptr.put(Material.CRIMSON_DOOR, Rarity.UNCOMMON);
		ptr.put(Material.WARPED_DOOR, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_DOOR, Rarity.RARE);
		ptr.put(Material.EXPOSED_COPPER_DOOR, Rarity.RARE);
		ptr.put(Material.WEATHERED_COPPER_DOOR, Rarity.RARE);
		ptr.put(Material.OXIDIZED_COPPER_DOOR, Rarity.RARE);
		ptr.put(Material.WAXED_COPPER_DOOR, Rarity.RARE);
		ptr.put(Material.WAXED_EXPOSED_COPPER_DOOR, Rarity.RARE);
		ptr.put(Material.WAXED_WEATHERED_COPPER_DOOR, Rarity.RARE);
		ptr.put(Material.WAXED_OXIDIZED_COPPER_DOOR, Rarity.RARE);
		ptr.put(Material.IRON_DOOR, Rarity.EPIC); //end of Door
		ptr.put(Material.ACACIA_FENCE_GATE, Rarity.COMMON);
		ptr.put(Material.BIRCH_FENCE_GATE, Rarity.COMMON);
		ptr.put(Material.DARK_OAK_FENCE_GATE, Rarity.COMMON);
		ptr.put(Material.JUNGLE_FENCE_GATE, Rarity.COMMON);
		ptr.put(Material.OAK_FENCE_GATE, Rarity.COMMON);
		ptr.put(Material.SPRUCE_FENCE_GATE, Rarity.COMMON);
		ptr.put(Material.MANGROVE_FENCE_GATE, Rarity.COMMON);
		ptr.put(Material.BAMBOO_FENCE_GATE, Rarity.COMMON);
		ptr.put(Material.CHERRY_FENCE_GATE, Rarity.COMMON);
		ptr.put(Material.PALE_OAK_FENCE_GATE, Rarity.COMMON);
		ptr.put(Material.CRIMSON_FENCE_GATE, Rarity.UNCOMMON);
		ptr.put(Material.WARPED_FENCE_GATE, Rarity.UNCOMMON); //end of Fence Gate
		ptr.put(Material.ACACIA_PRESSURE_PLATE, Rarity.COMMON);
		ptr.put(Material.BIRCH_PRESSURE_PLATE, Rarity.COMMON);
		ptr.put(Material.DARK_OAK_PRESSURE_PLATE, Rarity.COMMON);
		ptr.put(Material.JUNGLE_PRESSURE_PLATE, Rarity.COMMON);
		ptr.put(Material.OAK_PRESSURE_PLATE, Rarity.COMMON);
		ptr.put(Material.SPRUCE_PRESSURE_PLATE, Rarity.COMMON);
		ptr.put(Material.MANGROVE_PRESSURE_PLATE, Rarity.COMMON);
		ptr.put(Material.BAMBOO_PRESSURE_PLATE, Rarity.COMMON);
		ptr.put(Material.CHERRY_PRESSURE_PLATE, Rarity.COMMON);
		ptr.put(Material.PALE_OAK_PRESSURE_PLATE, Rarity.COMMON);
		ptr.put(Material.CRIMSON_PRESSURE_PLATE, Rarity.UNCOMMON);
		ptr.put(Material.WARPED_PRESSURE_PLATE, Rarity.UNCOMMON);
		ptr.put(Material.STONE_PRESSURE_PLATE, Rarity.UNCOMMON);
		ptr.put(Material.POLISHED_BLACKSTONE_PRESSURE_PLATE, Rarity.UNCOMMON);
		ptr.put(Material.HEAVY_WEIGHTED_PRESSURE_PLATE, Rarity.EPIC);
		ptr.put(Material.LIGHT_WEIGHTED_PRESSURE_PLATE, Rarity.EPIC); //end of Pressure Plate
		ptr.put(Material.ACACIA_TRAPDOOR, Rarity.COMMON);
		ptr.put(Material.BIRCH_TRAPDOOR, Rarity.COMMON);
		ptr.put(Material.DARK_OAK_TRAPDOOR, Rarity.COMMON);
		ptr.put(Material.JUNGLE_TRAPDOOR, Rarity.COMMON);
		ptr.put(Material.OAK_TRAPDOOR, Rarity.COMMON);
		ptr.put(Material.SPRUCE_TRAPDOOR, Rarity.COMMON);
		ptr.put(Material.MANGROVE_TRAPDOOR, Rarity.COMMON);
		ptr.put(Material.BAMBOO_TRAPDOOR, Rarity.COMMON);
		ptr.put(Material.CHERRY_TRAPDOOR, Rarity.COMMON);
		ptr.put(Material.PALE_OAK_TRAPDOOR, Rarity.COMMON);
		ptr.put(Material.CRIMSON_TRAPDOOR, Rarity.UNCOMMON);
		ptr.put(Material.WARPED_TRAPDOOR, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_TRAPDOOR, Rarity.RARE);
		ptr.put(Material.EXPOSED_COPPER_TRAPDOOR, Rarity.RARE);
		ptr.put(Material.WEATHERED_COPPER_TRAPDOOR, Rarity.RARE);
		ptr.put(Material.OXIDIZED_COPPER_TRAPDOOR, Rarity.RARE);
		ptr.put(Material.WAXED_COPPER_TRAPDOOR, Rarity.RARE);
		ptr.put(Material.WAXED_EXPOSED_COPPER_TRAPDOOR, Rarity.RARE);
		ptr.put(Material.WAXED_WEATHERED_COPPER_TRAPDOOR, Rarity.RARE);
		ptr.put(Material.WAXED_OXIDIZED_COPPER_TRAPDOOR, Rarity.RARE);
		ptr.put(Material.IRON_TRAPDOOR, Rarity.EPIC); //end of Trapdoor
		ptr.put(Material.RAIL, Rarity.EPIC);
		ptr.put(Material.ACTIVATOR_RAIL, Rarity.EPIC);
		ptr.put(Material.DETECTOR_RAIL, Rarity.EPIC);
		ptr.put(Material.POWERED_RAIL, Rarity.EPIC); //end of Rail
		ptr.put(Material.DAYLIGHT_DETECTOR, Rarity.LEGENDARY);
		ptr.put(Material.STRING, Rarity.UNCOMMON);
		ptr.put(Material.DISPENSER, Rarity.RARE);
		ptr.put(Material.DROPPER, Rarity.RARE);
		ptr.put(Material.HOPPER, Rarity.EPIC);
		ptr.put(Material.LECTERN, Rarity.RARE);
		ptr.put(Material.LEVER, Rarity.COMMON);
		ptr.put(Material.NOTE_BLOCK, Rarity.RARE);
		ptr.put(Material.JUKEBOX, Rarity.LEGENDARY);
		ptr.put(Material.OBSERVER, Rarity.LEGENDARY);
		ptr.put(Material.PISTON, Rarity.EPIC);
		ptr.put(Material.COMPARATOR, Rarity.LEGENDARY);
		ptr.put(Material.REDSTONE_LAMP, Rarity.EPIC);
		ptr.put(Material.REDSTONE_ORE, Rarity.EPIC);
		ptr.put(Material.REPEATER, Rarity.RARE);
		ptr.put(Material.REDSTONE_TORCH, Rarity.RARE);
		ptr.put(Material.STICKY_PISTON, Rarity.EPIC);
		ptr.put(Material.TNT, Rarity.RARE);
		ptr.put(Material.TRAPPED_CHEST, Rarity.RARE);
		ptr.put(Material.TRIPWIRE_HOOK, Rarity.RARE);
		ptr.put(Material.REDSTONE_BLOCK, Rarity.EPIC);
		ptr.put(Material.DEEPSLATE_REDSTONE_ORE, Rarity.EPIC);
		ptr.put(Material.REDSTONE, Rarity.RARE);
		ptr.put(Material.TARGET, Rarity.RARE);
		ptr.put(Material.SCULK_SENSOR, Rarity.LEGENDARY);
		ptr.put(Material.CALIBRATED_SCULK_SENSOR, Rarity.LEGENDARY);
		ptr.put(Material.SCULK_SHRIEKER, Rarity.MYSTIC);
		ptr.put(Material.CHISELED_BOOKSHELF, Rarity.UNCOMMON);
		ptr.put(Material.CRAFTER, Rarity.EPIC);
		ptr.put(Material.COPPER_BULB, Rarity.EPIC);
		ptr.put(Material.EXPOSED_COPPER_BULB, Rarity.EPIC);
		ptr.put(Material.WEATHERED_COPPER_BULB, Rarity.EPIC);
		ptr.put(Material.OXIDIZED_COPPER_BULB, Rarity.EPIC);
		ptr.put(Material.WAXED_COPPER_BULB, Rarity.EPIC);
		ptr.put(Material.WAXED_EXPOSED_COPPER_BULB, Rarity.EPIC);
		ptr.put(Material.WAXED_WEATHERED_COPPER_BULB, Rarity.EPIC);
		ptr.put(Material.WAXED_OXIDIZED_COPPER_BULB, Rarity.EPIC);
		ptr.put(Material.CREAKING_HEART, Rarity.RARE);
		ptr.put(Material.ACACIA_SHELF, Rarity.COMMON);
		ptr.put(Material.BAMBOO_SHELF, Rarity.COMMON);
		ptr.put(Material.BIRCH_SHELF, Rarity.COMMON);
		ptr.put(Material.CHERRY_SHELF, Rarity.COMMON);
		ptr.put(Material.CRIMSON_SHELF, Rarity.COMMON);
		ptr.put(Material.DARK_OAK_SHELF, Rarity.COMMON);
		ptr.put(Material.JUNGLE_SHELF, Rarity.COMMON);
		ptr.put(Material.MANGROVE_SHELF, Rarity.COMMON);
		ptr.put(Material.OAK_SHELF, Rarity.COMMON);
		ptr.put(Material.PALE_OAK_SHELF, Rarity.COMMON);
		ptr.put(Material.SPRUCE_SHELF, Rarity.COMMON);
		ptr.put(Material.WARPED_SHELF, Rarity.COMMON);
		ptr.put(Material.COPPER_GOLEM_STATUE, Rarity.RARE);
		ptr.put(Material.EXPOSED_COPPER_GOLEM_STATUE, Rarity.RARE);
		ptr.put(Material.WEATHERED_COPPER_GOLEM_STATUE, Rarity.RARE);
		ptr.put(Material.OXIDIZED_COPPER_GOLEM_STATUE, Rarity.RARE);
		ptr.put(Material.WAXED_COPPER_GOLEM_STATUE, Rarity.RARE);
		ptr.put(Material.WAXED_EXPOSED_COPPER_GOLEM_STATUE, Rarity.RARE);
		ptr.put(Material.WAXED_WEATHERED_COPPER_GOLEM_STATUE, Rarity.RARE);
		ptr.put(Material.WAXED_OXIDIZED_COPPER_GOLEM_STATUE, Rarity.RARE);
		//end of REDSTONE
		ptr = CRATE_DATA[Crate.SHOVEL.getID()];
		ptr.put(Material.WOODEN_SHOVEL, Rarity.COMMON);
		ptr.put(Material.GOLDEN_SHOVEL, Rarity.COMMON);
		ptr.put(Material.STONE_SHOVEL, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_SHOVEL, Rarity.RARE);
		ptr.put(Material.IRON_SHOVEL, Rarity.EPIC);
		ptr.put(Material.DIAMOND_SHOVEL, Rarity.LEGENDARY);
		ptr.put(Material.NETHERITE_SHOVEL, Rarity.MYSTIC);
		//end of SHOVEL
		ptr = CRATE_DATA[Crate.SWORD.getID()];
		ptr.put(Material.WOODEN_SWORD, Rarity.COMMON);
		ptr.put(Material.GOLDEN_SWORD, Rarity.COMMON);
		ptr.put(Material.STONE_SWORD, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_SWORD, Rarity.RARE);
		ptr.put(Material.IRON_SWORD, Rarity.EPIC);
		ptr.put(Material.DIAMOND_SWORD, Rarity.LEGENDARY);
		ptr.put(Material.NETHERITE_SWORD, Rarity.MYSTIC);
		//end of SWORD
		ptr = CRATE_DATA[Crate.TOOL.getID()];
		ptr.put(Material.WOODEN_HOE, Rarity.COMMON);
		ptr.put(Material.GOLDEN_HOE, Rarity.COMMON);
		ptr.put(Material.STONE_HOE, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_HOE, Rarity.RARE);
		ptr.put(Material.IRON_HOE, Rarity.EPIC);
		ptr.put(Material.DIAMOND_HOE, Rarity.LEGENDARY);
		ptr.put(Material.NETHERITE_HOE, Rarity.MYSTIC); //end of Hoe
		ptr.put(Material.WOODEN_SHOVEL, Rarity.COMMON);
		ptr.put(Material.GOLDEN_SHOVEL, Rarity.COMMON);
		ptr.put(Material.STONE_SHOVEL, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_SHOVEL, Rarity.RARE);
		ptr.put(Material.IRON_SHOVEL, Rarity.EPIC);
		ptr.put(Material.DIAMOND_SHOVEL, Rarity.LEGENDARY);
		ptr.put(Material.NETHERITE_SHOVEL, Rarity.MYSTIC); //end of Shovel
		ptr.put(Material.WOODEN_PICKAXE, Rarity.COMMON);
		ptr.put(Material.GOLDEN_PICKAXE, Rarity.COMMON);
		ptr.put(Material.STONE_PICKAXE, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_PICKAXE, Rarity.RARE);
		ptr.put(Material.IRON_PICKAXE, Rarity.EPIC);
		ptr.put(Material.DIAMOND_PICKAXE, Rarity.LEGENDARY);
		ptr.put(Material.NETHERITE_PICKAXE, Rarity.MYSTIC); //end of Pickaxe
		ptr.put(Material.WOODEN_AXE, Rarity.COMMON);
		ptr.put(Material.GOLDEN_AXE, Rarity.COMMON);
		ptr.put(Material.STONE_AXE, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_AXE, Rarity.RARE);
		ptr.put(Material.IRON_AXE, Rarity.EPIC);
		ptr.put(Material.DIAMOND_AXE, Rarity.LEGENDARY);
		ptr.put(Material.NETHERITE_AXE, Rarity.MYSTIC); //end of Axe
		ptr.put(Material.WOODEN_SWORD, Rarity.COMMON);
		ptr.put(Material.GOLDEN_SWORD, Rarity.COMMON);
		ptr.put(Material.STONE_SWORD, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_SWORD, Rarity.RARE);
		ptr.put(Material.IRON_SWORD, Rarity.EPIC);
		ptr.put(Material.DIAMOND_SWORD, Rarity.LEGENDARY);
		ptr.put(Material.NETHERITE_SWORD, Rarity.MYSTIC); //end of Sword
		ptr.put(Material.FISHING_ROD, Rarity.UNCOMMON);
		ptr.put(Material.CARROT_ON_A_STICK, Rarity.RARE);
		ptr.put(Material.WARPED_FUNGUS_ON_A_STICK, Rarity.EPIC); //end of Fishing Rod
		ptr.put(Material.SHEARS, Rarity.EPIC);
		ptr.put(Material.FLINT_AND_STEEL, Rarity.RARE);
		ptr.put(Material.COMPASS, Rarity.EPIC);
		ptr.put(Material.CLOCK, Rarity.EPIC);
		ptr.put(Material.LEAD, Rarity.UNCOMMON);
		ptr.put(Material.ITEM_FRAME, Rarity.RARE);
		ptr.put(Material.GLOW_ITEM_FRAME, Rarity.EPIC);
		ptr.put(Material.SPYGLASS, Rarity.LEGENDARY);
		ptr.put(Material.BRUSH, Rarity.RARE);
		//end of TOOL
		ptr = CRATE_DATA[Crate.TRIM.getID()];
		ptr.put(Material.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Rarity.MYSTIC);
		ptr.put(Material.BOLT_ARMOR_TRIM_SMITHING_TEMPLATE, Rarity.RARE);
		ptr.put(Material.COAST_ARMOR_TRIM_SMITHING_TEMPLATE, Rarity.RARE);
		ptr.put(Material.DUNE_ARMOR_TRIM_SMITHING_TEMPLATE, Rarity.RARE);
		ptr.put(Material.EYE_ARMOR_TRIM_SMITHING_TEMPLATE, Rarity.EPIC);
		ptr.put(Material.FLOW_ARMOR_TRIM_SMITHING_TEMPLATE, Rarity.RARE);
		ptr.put(Material.HOST_ARMOR_TRIM_SMITHING_TEMPLATE, Rarity.RARE);
		ptr.put(Material.RAISER_ARMOR_TRIM_SMITHING_TEMPLATE, Rarity.RARE);
		ptr.put(Material.RIB_ARMOR_TRIM_SMITHING_TEMPLATE, Rarity.RARE);
		ptr.put(Material.SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE, Rarity.RARE);
		ptr.put(Material.SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE, Rarity.RARE);
		ptr.put(Material.SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE, Rarity.LEGENDARY);
		ptr.put(Material.SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE, Rarity.RARE);
		ptr.put(Material.SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE, Rarity.EPIC);
		ptr.put(Material.TIDE_ARMOR_TRIM_SMITHING_TEMPLATE, Rarity.RARE);
		ptr.put(Material.VEX_ARMOR_TRIM_SMITHING_TEMPLATE, Rarity.EPIC);
		ptr.put(Material.WARD_ARMOR_TRIM_SMITHING_TEMPLATE, Rarity.EPIC);
		ptr.put(Material.WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE, Rarity.RARE);
		ptr.put(Material.WILD_ARMOR_TRIM_SMITHING_TEMPLATE, Rarity.RARE);
		ptr.put(Material.ANGLER_POTTERY_SHERD, Rarity.UNCOMMON);
		ptr.put(Material.ARCHER_POTTERY_SHERD, Rarity.UNCOMMON);
		ptr.put(Material.ARMS_UP_POTTERY_SHERD, Rarity.UNCOMMON);
		ptr.put(Material.BLADE_POTTERY_SHERD, Rarity.UNCOMMON);
		ptr.put(Material.BREWER_POTTERY_SHERD, Rarity.UNCOMMON);
		ptr.put(Material.BURN_POTTERY_SHERD, Rarity.UNCOMMON);
		ptr.put(Material.DANGER_POTTERY_SHERD, Rarity.UNCOMMON);
		ptr.put(Material.EXPLORER_POTTERY_SHERD, Rarity.UNCOMMON);
		ptr.put(Material.FLOW_POTTERY_SHERD, Rarity.UNCOMMON);
		ptr.put(Material.FRIEND_POTTERY_SHERD, Rarity.UNCOMMON);
		ptr.put(Material.GUSTER_POTTERY_SHERD, Rarity.UNCOMMON);
		ptr.put(Material.HEART_POTTERY_SHERD, Rarity.UNCOMMON);
		ptr.put(Material.HEARTBREAK_POTTERY_SHERD, Rarity.UNCOMMON);
		ptr.put(Material.HOWL_POTTERY_SHERD, Rarity.UNCOMMON);
		ptr.put(Material.MINER_POTTERY_SHERD, Rarity.UNCOMMON);
		ptr.put(Material.MOURNER_POTTERY_SHERD, Rarity.UNCOMMON);
		ptr.put(Material.PLENTY_POTTERY_SHERD, Rarity.UNCOMMON);
		ptr.put(Material.PRIZE_POTTERY_SHERD, Rarity.UNCOMMON);
		ptr.put(Material.SCRAPE_POTTERY_SHERD, Rarity.UNCOMMON);
		ptr.put(Material.SHEAF_POTTERY_SHERD, Rarity.UNCOMMON);
		ptr.put(Material.SHELTER_POTTERY_SHERD, Rarity.UNCOMMON);
		ptr.put(Material.SKULL_POTTERY_SHERD, Rarity.UNCOMMON);
		ptr.put(Material.SNORT_POTTERY_SHERD, Rarity.UNCOMMON);
		ptr.put(Material.BORDURE_INDENTED_BANNER_PATTERN, Rarity.COMMON);
		ptr.put(Material.CREEPER_BANNER_PATTERN, Rarity.LEGENDARY);
		ptr.put(Material.FIELD_MASONED_BANNER_PATTERN, Rarity.COMMON);
		ptr.put(Material.FLOW_BANNER_PATTERN, Rarity.RARE);
		ptr.put(Material.FLOWER_BANNER_PATTERN, Rarity.COMMON);
		ptr.put(Material.GLOBE_BANNER_PATTERN, Rarity.UNCOMMON);
		ptr.put(Material.GUSTER_BANNER_PATTERN, Rarity.RARE);
		ptr.put(Material.MOJANG_BANNER_PATTERN, Rarity.EPIC);
		ptr.put(Material.PIGLIN_BANNER_PATTERN, Rarity.RARE);
		ptr.put(Material.SKULL_BANNER_PATTERN, Rarity.EPIC);
		//end of TRIM
		ptr = CRATE_DATA[Crate.WEAPON.getID()];
		ptr.put(Material.WOODEN_AXE, Rarity.COMMON);
		ptr.put(Material.GOLDEN_AXE, Rarity.COMMON);
		ptr.put(Material.STONE_AXE, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_AXE, Rarity.RARE);
		ptr.put(Material.IRON_AXE, Rarity.EPIC);
		ptr.put(Material.DIAMOND_AXE, Rarity.LEGENDARY);
		ptr.put(Material.NETHERITE_AXE, Rarity.MYSTIC); //end of Axe
		ptr.put(Material.WOODEN_SWORD, Rarity.COMMON);
		ptr.put(Material.GOLDEN_SWORD, Rarity.COMMON);
		ptr.put(Material.STONE_SWORD, Rarity.UNCOMMON);
		ptr.put(Material.COPPER_SWORD, Rarity.RARE);
		ptr.put(Material.IRON_SWORD, Rarity.EPIC);
		ptr.put(Material.DIAMOND_SWORD, Rarity.LEGENDARY);
		ptr.put(Material.NETHERITE_SWORD, Rarity.MYSTIC); //end of Sword
		ptr.put(Material.BOW, Rarity.UNCOMMON);
		ptr.put(Material.CROSSBOW, Rarity.UNCOMMON); //end of Bow
		ptr.put(Material.ARROW, Rarity.COMMON);
		ptr.put(Material.SPECTRAL_ARROW, Rarity.RARE);
		ptr.put(Material.TIPPED_ARROW, Rarity.LEGENDARY); //end of Arrow
		ptr.put(Material.TRIDENT, Rarity.MYSTIC);
		ptr.put(Material.FIRE_CHARGE, Rarity.RARE);
		ptr.put(Material.WIND_CHARGE, Rarity.RARE);
		ptr.put(Material.MACE, Rarity.MYSTIC);
		ptr.put(Material.SNOWBALL, Rarity.COMMON);
		ptr.put(Material.FIREWORK_ROCKET, Rarity.EPIC);
		ptr.put(Material.TNT, Rarity.RARE);
		ptr.put(Material.FLINT_AND_STEEL, Rarity.RARE);
		ptr.put(Material.END_CRYSTAL, Rarity.LEGENDARY);
		//end of WEAPON
	}
	
	public static final ItemPool[] getCrateData() { return CRATE_DATA; }
}
