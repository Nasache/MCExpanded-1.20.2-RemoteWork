package net.nathan.mcexpanded.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
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
                    .icon(() -> new ItemStack(ModBlocks.COBALT_BLOCK)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.COBALT_BLOCK);
                        entries.add(ModBlocks.RAW_COBALT_BLOCK);
                        entries.add(ModBlocks.COBALT_ORE);
                        entries.add(ModBlocks.DEEPSLATE_COBALT_ORE);
                        entries.add(ModBlocks.TEST_BLOCK);
                        entries.add(ModBlocks.MAPLE_LOG);
                        entries.add(ModBlocks.MAPLE_WOOD);
                        entries.add(ModBlocks.STRIPPED_MAPLE_LOG);
                        entries.add(ModBlocks.STRIPPED_MAPLE_WOOD);
                        entries.add(ModBlocks.MAPLE_PLANKS);
                        entries.add(ModBlocks.MAPLE_STAIRS);
                        entries.add(ModBlocks.MAPLE_SLAB);
                        entries.add(ModBlocks.MAPLE_BUTTON);
                        entries.add(ModBlocks.MAPLE_PRESSURE_PLATE);
                        entries.add(ModBlocks.MAPLE_FENCE);
                        entries.add(ModBlocks.MAPLE_FENCE_GATE);
                        entries.add(ModBlocks.MAPLE_DOOR);
                        entries.add(ModBlocks.MAPLE_TRAPDOOR);
                        entries.add(ModBlocks.RED_MAPLE_LEAVES);
                        entries.add(ModBlocks.YELLOW_MAPLE_LEAVES);
                        entries.add(ModItems.MAPLE_SIGN);
                        entries.add(ModItems.MAPLE_HANGING_SIGN);
                        entries.add(ModBlocks.SNOW_BRICKS);
                        entries.add(ModBlocks.CHISELED_SNOW_BRICKS);
                        entries.add(ModBlocks.SNOW_BRICK_STAIRS);
                        entries.add(ModBlocks.SNOW_BRICK_SLAB);
                        entries.add(ModBlocks.SNOW_BRICK_BUTTON);
                        entries.add(ModBlocks.SNOW_BRICK_PRESSURE_PLATE);
                        entries.add(ModBlocks.SNOW_BRICK_WALL);
                        entries.add(ModBlocks.MALACHITE_BLOCK);
                        entries.add(ModBlocks.BUDDING_MALACHITE);
                        entries.add(ModItems.SMALL_MALACHITE_BUD);
                        entries.add(ModItems.MEDIUM_MALACHITE_BUD);
                        entries.add(ModItems.LARGE_MALACHITE_BUD);
                        entries.add(ModItems.MALACHITE_CLUSTER);

                    }).build());
    public static final ItemGroup EX_INGREDIENTS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCExpanded.MOD_ID, "ex_ingredients_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ex_ingredients_group"))
                    .icon(() -> new ItemStack(ModItems.COBALT_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.COBALT_INGOT);
                        entries.add(ModItems.RAW_COBALT);
                        entries.add(ModBlocks.GARDEN_COSMOS);
                        entries.add(ModBlocks.BLUE_MUSHROOM);
                        entries.add(ModItems.CONGEALED_SLIME);
                        entries.add(ModItems.MALACHITE_SHARD);
                        entries.add(ModItems.MUSIC_DISC_SHROOM_SONG);


                    }).build());

    public static final ItemGroup EX_FOOD_AND_DRINKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCExpanded.MOD_ID, "ex_food_and_drinks_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ex_food_and_drinks_group"))
                    .icon(() -> new ItemStack(ModItems.BITTER_BERRIES)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BITTER_BERRIES);
                        entries.add(ModItems.LEEK_SEEDS);
                        entries.add(ModItems.LEEK);
                        entries.add(ModItems.ROASTED_LEEK);
                        entries.add(ModItems.MOON_FRUIT);
                        entries.add(ModItems.MOON_SEEDS);
                        entries.add(ModItems.SUN_FRUIT);
                        entries.add(ModItems.SUN_SEEDS);
                        entries.add(ModItems.RAW_SQUID);
                        entries.add(ModItems.RAW_GLOW_SQUID);
                        entries.add(ModItems.HONEY_GLAZED_STEAK);
                        entries.add(ModBlocks.RED_MAPLE_SAPLING);
                        entries.add(ModBlocks.YELLOW_MAPLE_SAPLING);


                    }).build());

    public static final ItemGroup EX_TOOLS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCExpanded.MOD_ID, "ex_tools"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ex_tools"))
                    .icon(() -> new ItemStack(ModItems.COBALT_PICKAXE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.COBALT_SWORD);
                        entries.add(ModItems.COBALT_PICKAXE);
                        entries.add(ModItems.COBALT_AXE);
                        entries.add(ModItems.COBALT_SHOVEL);
                        entries.add(ModItems.COBALT_HOE);
                        entries.add(ModItems.COBALT_HELMET);
                        entries.add(ModItems.COBALT_CHESTPLATE);
                        entries.add(ModItems.COBALT_LEGGINGS);
                        entries.add(ModItems.COBALT_BOOTS);
                        entries.add(ModItems.PRISMARINE_HELMET);
                        entries.add(ModItems.PRISMARINE_CHESTPLATE);
                        entries.add(ModItems.PRISMARINE_LEGGINGS);
                        entries.add(ModItems.PRISMARINE_BOOTS);
                        entries.add(ModItems.BEE_HELMET);
                        entries.add(ModItems.BEE_CHESTPLATE);
                        entries.add(ModItems.BEE_LEGGINGS);
                        entries.add(ModItems.BEE_BOOTS);
                        entries.add(ModItems.SLIME_HELMET);
                        entries.add(ModItems.SLIME_CHESTPLATE);
                        entries.add(ModItems.SLIME_LEGGINGS);
                        entries.add(ModItems.SLIME_BOOTS);
                        entries.add(ModItems.LIGHTNING_BOTTLE);
                        entries.add(ModItems.DUCK_SPAWN_EGG);
                        entries.add(ModItems.GHOST_SPAWN_EGG);
                        entries.add(ModItems.SLIME_TOTEM);
                        entries.add(ModItems.HONEY_TOTEM);
                        entries.add(ModItems.PRISMARINE_TOTEM);
                        entries.add(ModItems.LEATHER_TOTEM);
                        entries.add(ModItems.CHAIN_TOTEM);

                    }).build());

    public static void registerItemGroups() {


    }
}
