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

    public static final ItemGroup GROUP_A = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCExpanded.MOD_ID, "group_a"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.group_a"))
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
    public static final ItemGroup GROUP_B = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCExpanded.MOD_ID, "group_b"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.group_b"))
                    .icon(() -> new ItemStack(Blocks.ORANGE_WOOL)).entries((displayContext, entries) -> {
                        entries.add(Blocks.ORANGE_WOOL);

                    }).build());
    public static final ItemGroup GROUP_C = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCExpanded.MOD_ID, "group_c"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.group_c"))
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
    public static final ItemGroup GROUP_D = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCExpanded.MOD_ID, "group_d"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.group_d"))
                    .icon(() -> new ItemStack(ModItems.MAPLE_SIGN)).entries((displayContext, entries) -> {
                        entries.add(ModItems.MAPLE_SIGN);
                        entries.add(ModItems.MAPLE_HANGING_SIGN);
                        entries.add(ModItems.WISTERIA_SIGN);
                        entries.add(ModItems.WISTERIA_HANGING_SIGN);
                        entries.add(ModItems.FROST_PINE_SIGN);
                        entries.add(ModItems.FROST_PINE_HANGING_SIGN);

                    }).build());

    public static final ItemGroup GROUP_E = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCExpanded.MOD_ID, "group_e"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.group_e"))
                    .icon(() -> new ItemStack(Items.REDSTONE)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.MAPLE_BUTTON);
                        entries.add(ModBlocks.WISTERIA_BUTTON);
                        entries.add(ModBlocks.FROST_PINE_BUTTON);

                    }).build());
    public static final ItemGroup GROUP_F = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCExpanded.MOD_ID, "group_f"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.group_f"))
                    .icon(() -> new ItemStack(ModItems.COBALT_PICKAXE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.COBALT_SHOVEL);
                        entries.add(ModItems.COBALT_PICKAXE);
                        entries.add(ModItems.COBALT_AXE);
                        entries.add(ModItems.COBALT_HOE);
                        entries.add(ModItems.LIGHTNING_BOTTLE);
                        entries.add(ModItems.MUSIC_DISC_SHROOM_SONG);

                    }).build());
    public static final ItemGroup GROUP_G = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCExpanded.MOD_ID, "group_g"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.group_g"))
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
    public static final ItemGroup GROUP_H = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCExpanded.MOD_ID, "group_h"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.group_h"))
                    .icon(() -> new ItemStack(ModItems.LEEK)).entries((displayContext, entries) -> {
                        entries.add(ModItems.MOON_FRUIT);
                        entries.add(ModItems.SUN_FRUIT);
                        entries.add(ModItems.LEEK);
                        entries.add(ModItems.ROASTED_LEEK);
                        entries.add(ModItems.SNOW_LEAF);

                        entries.add(ModItems.RAW_SQUID);
                        entries.add(ModItems.COOKED_SQUID);

                        entries.add(ModItems.RAW_GLOW_SQUID);
                        entries.add(ModItems.COOKED_GLOW_SQUID);

                        entries.add(ModItems.RAW_DUCK);
                        entries.add(ModItems.COOKED_DUCK);

                        entries.add(ModItems.HONEY_GLAZED_STEAK);

                        entries.add(ModItems.MARSHMALLOW);
                        entries.add(ModItems.BURNT_MARSHMALLOW);

                    }).build());
    public static final ItemGroup GROUP_I = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCExpanded.MOD_ID, "group_i"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.group_i"))
                    .icon(() -> new ItemStack(ModItems.COBALT_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_COBALT);
                        entries.add(ModItems.COBALT_INGOT);

                        entries.add(ModItems.DUCK_FEATHER);

                        entries.add(ModItems.CONGEALED_SLIME);

                        entries.add(ModItems.MAPLE_SAP);

                    }).build());
    public static final ItemGroup GROUP_J = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCExpanded.MOD_ID, "group_j"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.group_j"))
                    .icon(() -> new ItemStack(ModItems.DUCK_SPAWN_EGG)).entries((displayContext, entries) -> {
                        entries.add(ModItems.DUCK_SPAWN_EGG);
                        entries.add(ModItems.GHOST_SPAWN_EGG);
                        entries.add(ModItems.VAGRANT_SPAWN_EGG);
                        entries.add(ModItems.WISTERIA_SPIDER_SPAWN_EGG);

                    }).build());

    public static void registerItemGroups() {


    }
}
