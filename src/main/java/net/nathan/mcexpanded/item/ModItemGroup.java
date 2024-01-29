package net.nathan.mcexpanded.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.nathan.mcexpanded.MCExpanded;
import net.nathan.mcexpanded.block.ModBlocks;


public class ModItemGroup {

    public static final ItemGroup EX_BUILDING_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCExpanded.MOD_ID, "ex_building_blocks_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ex_building_blocks_group"))
                    .icon(() -> new ItemStack(ModBlocks.MAPLE_LOG)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.MAPLE_LOG);
                        entries.add(ModBlocks.MAPLE_WOOD);
                        entries.add(ModBlocks.STRIPPED_MAPLE_LOG);
                        entries.add(ModBlocks.STRIPPED_MAPLE_WOOD);
                        entries.add(ModBlocks.MAPLE_PLANKS);
                        entries.add(ModBlocks.MAPLE_STAIRS);
                        entries.add(ModBlocks.MAPLE_SLAB);
                        entries.add(ModBlocks.MAPLE_FENCE);
                        entries.add(ModBlocks.MAPLE_FENCE_GATE);
                        entries.add(ModBlocks.MAPLE_DOOR);
                        entries.add(ModBlocks.MAPLE_TRAPDOOR);
                        entries.add(ModBlocks.MAPLE_PRESSURE_PLATE);
                        entries.add(ModBlocks.MAPLE_BUTTON);

                        entries.add(ModBlocks.WISTERIA_LOG);
                        entries.add(ModBlocks.WISTERIA_WOOD);
                        entries.add(ModBlocks.STRIPPED_WISTERIA_LOG);
                        entries.add(ModBlocks.STRIPPED_WISTERIA_WOOD);
                        entries.add(ModBlocks.WISTERIA_PLANKS);
                        entries.add(ModBlocks.WISTERIA_STAIRS);
                        entries.add(ModBlocks.WISTERIA_SLAB);
                        entries.add(ModBlocks.WISTERIA_FENCE);
                        entries.add(ModBlocks.WISTERIA_FENCE_GATE);
                        entries.add(ModBlocks.WISTERIA_DOOR);
                        entries.add(ModBlocks.WISTERIA_TRAPDOOR);
                        entries.add(ModBlocks.WISTERIA_PRESSURE_PLATE);
                        entries.add(ModBlocks.WISTERIA_BUTTON);

                        entries.add(ModBlocks.FROST_PINE_LOG);
                        entries.add(ModBlocks.FROST_PINE_WOOD);
                        entries.add(ModBlocks.STRIPPED_FROST_PINE_LOG);
                        entries.add(ModBlocks.STRIPPED_FROST_PINE_WOOD);
                        entries.add(ModBlocks.FROST_PINE_PLANKS);
                        entries.add(ModBlocks.FROST_PINE_STAIRS);
                        entries.add(ModBlocks.FROST_PINE_SLAB);
                        entries.add(ModBlocks.FROST_PINE_FENCE);
                        entries.add(ModBlocks.FROST_PINE_FENCE_GATE);
                        entries.add(ModBlocks.FROST_PINE_DOOR);
                        entries.add(ModBlocks.FROST_PINE_TRAPDOOR);
                        entries.add(ModBlocks.FROST_PINE_PRESSURE_PLATE);
                        entries.add(ModBlocks.FROST_PINE_BUTTON);

                        entries.add(ModBlocks.SNOW_BRICKS);
                        entries.add(ModBlocks.CHISELED_SNOW_BRICKS);
                        entries.add(ModBlocks.SNOW_BRICK_STAIRS);
                        entries.add(ModBlocks.SNOW_BRICK_SLAB);
                        entries.add(ModBlocks.SNOW_BRICK_WALL);
                        entries.add(ModBlocks.SNOW_BRICK_BUTTON);
                        entries.add(ModBlocks.SNOW_BRICK_PRESSURE_PLATE);

                        entries.add(ModBlocks.COBALT_BLOCK);
                        entries.add(ModBlocks.RAW_COBALT_BLOCK);
                        entries.add(ModBlocks.COBALT_ORE);
                        entries.add(ModBlocks.DEEPSLATE_COBALT_ORE);

                    }).build());
    public static final ItemGroup EX_COLORED_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCExpanded.MOD_ID, "ex_colored_blocks_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ex_colored_blocks_group"))
                    .icon(() -> new ItemStack(Blocks.ORANGE_WOOL)).entries((displayContext, entries) -> {
                        entries.add(Blocks.ORANGE_WOOL);

                    }).build());
    public static final ItemGroup EX_NATURAL_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCExpanded.MOD_ID, "ex_natural_blocks_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ex_natural_blocks_group"))
                    .icon(() -> new ItemStack(ModBlocks.RED_MAPLE_LEAVES)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.RED_MAPLE_LEAVES);
                        entries.add(ModBlocks.YELLOW_MAPLE_LEAVES);
                        entries.add(ModBlocks.WISTERIA_LEAVES);
                        entries.add(ModBlocks.FROST_PINE_LEAVES);

                        entries.add(ModBlocks.RED_MAPLE_SAPLING);
                        entries.add(ModBlocks.YELLOW_MAPLE_SAPLING);
                        entries.add(ModBlocks.WISTERIA_SAPLING);
                        entries.add(ModBlocks.FROST_PINE_SAPLING);

                        entries.add(ModBlocks.BLUE_MUSHROOM);
                        entries.add(ModBlocks.GARDEN_COSMOS);

                        entries.add(ModItems.LEEK_SEEDS);
                        entries.add(ModItems.SNOW_LEAF_SEEDS);
                        entries.add(ModItems.MOON_SEEDS);
                        entries.add(ModItems.SUN_SEEDS);
                        entries.add(ModItems.BITTER_BERRIES);
                        entries.add(ModItems.FROST_BERRIES);

                        entries.add(ModBlocks.FROST_BUD_BLOCK);
                        entries.add(ModBlocks.SNOW_GRASS);
                        entries.add(ModItems.ICE_CRYSTAL);

                    }).build());
    public static final ItemGroup EX_FUNCTIONAL_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCExpanded.MOD_ID, "ex_functional_blocks_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ex_functional_blocks_group"))
                    .icon(() -> new ItemStack(ModItems.MAPLE_SIGN)).entries((displayContext, entries) -> {
                        entries.add(ModItems.MAPLE_SIGN);
                        entries.add(ModItems.MAPLE_HANGING_SIGN);
                        entries.add(ModItems.WISTERIA_SIGN);
                        entries.add(ModItems.WISTERIA_HANGING_SIGN);
                        entries.add(ModItems.FROST_PINE_SIGN);
                        entries.add(ModItems.FROST_PINE_HANGING_SIGN);

                    }).build());

    public static final ItemGroup EX_REDSTONE_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCExpanded.MOD_ID, "ex_redstone_blocks_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ex_redstone_blocks_group"))
                    .icon(() -> new ItemStack(Items.REDSTONE)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.MAPLE_BUTTON);
                        entries.add(ModBlocks.WISTERIA_BUTTON);
                        entries.add(ModBlocks.FROST_PINE_BUTTON);

                    }).build());
    public static final ItemGroup EX_TOOLS_AND_UTILITIES_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCExpanded.MOD_ID, "ex_tools_and_utilities_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ex_tools_and_utilities_group"))
                    .icon(() -> new ItemStack(ModItems.COBALT_PICKAXE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.COBALT_SHOVEL);
                        entries.add(ModItems.COBALT_PICKAXE);
                        entries.add(ModItems.COBALT_AXE);
                        entries.add(ModItems.COBALT_HOE);
                        entries.add(ModItems.LIGHTNING_BOTTLE);
                        entries.add(ModItems.MUSIC_DISC_SHROOM_SONG);

                    }).build());
    public static final ItemGroup EX_COMBAT_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCExpanded.MOD_ID, "ex_combat_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ex_combat_group"))
                    .icon(() -> new ItemStack(ModItems.COBALT_SWORD)).entries((displayContext, entries) -> {
                        entries.add(ModItems.COBALT_SWORD);

                        entries.add(ModItems.COBALT_HELMET);
                        entries.add(ModItems.COBALT_CHESTPLATE);
                        entries.add(ModItems.COBALT_LEGGINGS);
                        entries.add(ModItems.COBALT_BOOTS);

                        entries.add(ModItems.BEE_HELMET);
                        entries.add(ModItems.BEE_CHESTPLATE);
                        entries.add(ModItems.BEE_LEGGINGS);
                        entries.add(ModItems.BEE_BOOTS);

                        entries.add(ModItems.SLIME_HELMET);
                        entries.add(ModItems.SLIME_CHESTPLATE);
                        entries.add(ModItems.SLIME_LEGGINGS);
                        entries.add(ModItems.SLIME_BOOTS);

                        entries.add(ModItems.PRISMARINE_HELMET);
                        entries.add(ModItems.PRISMARINE_CHESTPLATE);
                        entries.add(ModItems.PRISMARINE_LEGGINGS);
                        entries.add(ModItems.PRISMARINE_BOOTS);

                        entries.add(ModItems.LEATHER_TOTEM);
                        entries.add(ModItems.CHAIN_TOTEM);
                        entries.add(ModItems.HONEY_TOTEM);
                        entries.add(ModItems.SLIME_TOTEM);
                        entries.add(ModItems.PRISMARINE_TOTEM);

                    }).build());
    public static final ItemGroup EX_FOOD_AND_DRINKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCExpanded.MOD_ID, "ex_food_and_drinks_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ex_food_and_drinks_group"))
                    .icon(() -> new ItemStack(ModItems.LEEK)).entries((displayContext, entries) -> {
                        entries.add(ModItems.MOON_FRUIT);
                        entries.add(ModItems.SUN_FRUIT);
                        entries.add(ModItems.LEEK);
                        entries.add(ModItems.ROASTED_LEEK);
                        entries.add(ModItems.SNOW_LEAF);

                        entries.add(ModItems.RAW_SQUID);

                        entries.add(ModItems.RAW_GLOW_SQUID);

                        entries.add(ModItems.RAW_DUCK);

                        entries.add(ModItems.HONEY_GLAZED_STEAK);

                        entries.add(ModItems.MARSHMALLOW);
                        entries.add(ModItems.BURNT_MARSHMALLOW);

                    }).build());
    public static final ItemGroup EX_INGREDIENTS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCExpanded.MOD_ID, "ex_ingredients_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ex_ingredients_group"))
                    .icon(() -> new ItemStack(ModItems.COBALT_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_COBALT);
                        entries.add(ModItems.COBALT_INGOT);

                        entries.add(ModItems.DUCK_FEATHER);

                        entries.add(ModItems.CONGEALED_SLIME);

                    }).build());
    public static final ItemGroup EX_SPAWN_EGGS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCExpanded.MOD_ID, "ex_spawn_eggs_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ex_spawn_eggs_group"))
                    .icon(() -> new ItemStack(ModItems.DUCK_SPAWN_EGG)).entries((displayContext, entries) -> {
                        entries.add(ModItems.DUCK_SPAWN_EGG);
                        entries.add(ModItems.GHOST_SPAWN_EGG);
                        entries.add(ModItems.VAGRANT_SPAWN_EGG);
                        entries.add(ModItems.WISTERIA_SPIDER_SPAWN_EGG);

                    }).build());

    public static void registerItemGroups() {


    }
}
