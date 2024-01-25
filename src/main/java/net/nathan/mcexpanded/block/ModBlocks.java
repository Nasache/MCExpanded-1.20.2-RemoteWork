package net.nathan.mcexpanded.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.TreeConfiguredFeatures;
import net.nathan.mcexpanded.MCExpanded;
import net.nathan.mcexpanded.block.custom.*;
import net.nathan.mcexpanded.util.ModWoodTypes;
import net.nathan.mcexpanded.world.tree.FrostPineSaplingGenerator;
import net.nathan.mcexpanded.world.tree.RedMapleSaplingGenerator;
import net.nathan.mcexpanded.world.tree.WisteriaSaplingGenerator;
import net.nathan.mcexpanded.world.tree.YellowMapleSaplingGenerator;

public class ModBlocks {


    public static final Block COBALT_BLOCK = registerBlock("cobalt_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.BLUE)));
    public static final Block RAW_COBALT_BLOCK = registerBlock("raw_cobalt_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.BLUE)));
    public static final Block COBALT_ORE = registerBlock("cobalt_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block DEEPSLATE_COBALT_ORE = registerBlock("deepslate_cobalt_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));

    public static final Block MAPLE_PLANKS = registerBlock("maple_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block MAPLE_STAIRS = registerBlock("maple_stairs",
            new StairsBlock(ModBlocks.MAPLE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block MAPLE_SLAB = registerBlock("maple_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block MAPLE_BUTTON = registerBlock("maple_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 30, true));
    public static final Block MAPLE_PRESSURE_PLATE = registerBlock("maple_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block MAPLE_FENCE = registerBlock("maple_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block MAPLE_FENCE_GATE = registerBlock("maple_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));
    public static final Block MAPLE_DOOR = registerBlock("maple_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block MAPLE_TRAPDOOR = registerBlock("maple_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block MAPLE_LOG = registerBlock("maple_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block MAPLE_WOOD = registerBlock("maple_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block RED_MAPLE_LEAVES = registerBlock("red_maple_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).mapColor(MapColor.BRIGHT_RED)));
    public static final Block YELLOW_MAPLE_LEAVES = registerBlock("yellow_maple_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).mapColor(MapColor.YELLOW)));
    public static final Block RED_MAPLE_SAPLING = registerBlock("red_maple_sapling",
            new SaplingBlock(new RedMapleSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).mapColor(MapColor.BRIGHT_RED)));
    public static final Block POTTED_RED_MAPLE_SAPLING = registerBlockWithoutBlockItem("potted_red_maple_sapling",
            new FlowerPotBlock(RED_MAPLE_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING).mapColor(MapColor.BRIGHT_RED)));

    public static final Block YELLOW_MAPLE_SAPLING = registerBlock("yellow_maple_sapling",
            new SaplingBlock(new YellowMapleSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).mapColor(MapColor.YELLOW)));
    public static final Block POTTED_YELLOW_MAPLE_SAPLING = registerBlockWithoutBlockItem("potted_yellow_maple_sapling",
            new FlowerPotBlock(YELLOW_MAPLE_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING).mapColor(MapColor.YELLOW)));

    public static final Block MAPLE_SIGN = registerBlockWithoutBlockItem("maple_sign",
            new ModStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), ModWoodTypes.MAPLE));
    public static final Block MAPLE_WALL_SIGN = registerBlockWithoutBlockItem("maple_wall_sign",
            new ModWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN), ModWoodTypes.MAPLE));
    public static final Block MAPLE_HANGING_SIGN = registerBlockWithoutBlockItem("maple_hanging_sign",
            new ModHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), ModWoodTypes.MAPLE));
    public static final Block MAPLE_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("maple_wall_hanging_sign",
            new ModWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.MAPLE));

    public static final Block WISTERIA_PLANKS = registerBlock("wisteria_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.PURPLE)));
    public static final Block WISTERIA_STAIRS = registerBlock("wisteria_stairs",
            new StairsBlock(ModBlocks.WISTERIA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS).mapColor(MapColor.PURPLE)));
    public static final Block WISTERIA_SLAB = registerBlock("wisteria_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB).mapColor(MapColor.PURPLE)));
    public static final Block WISTERIA_BUTTON = registerBlock("wisteria_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 30, true));
    public static final Block WISTERIA_PRESSURE_PLATE = registerBlock("wisteria_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE).mapColor(MapColor.PURPLE), BlockSetType.OAK));
    public static final Block WISTERIA_FENCE = registerBlock("wisteria_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).mapColor(MapColor.PURPLE)));
    public static final Block WISTERIA_FENCE_GATE = registerBlock("wisteria_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE).mapColor(MapColor.PURPLE), WoodType.OAK));
    public static final Block WISTERIA_DOOR = registerBlock("wisteria_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block WISTERIA_TRAPDOOR = registerBlock("wisteria_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block WISTERIA_LOG = registerBlock("wisteria_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).mapColor(MapColor.PURPLE)));
    public static final Block WISTERIA_WOOD = registerBlock("wisteria_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).mapColor(MapColor.PURPLE)));
    public static final Block STRIPPED_WISTERIA_LOG = registerBlock("stripped_wisteria_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).mapColor(MapColor.PURPLE)));
    public static final Block STRIPPED_WISTERIA_WOOD = registerBlock("stripped_wisteria_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).mapColor(MapColor.PURPLE)));
    public static final Block WISTERIA_LEAVES = registerBlock("wisteria_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).mapColor(MapColor.PURPLE)));

    public static final Block WISTERIA_SIGN = registerBlockWithoutBlockItem("wisteria_sign",
            new ModStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), ModWoodTypes.WISTERIA));
    public static final Block WISTERIA_WALL_SIGN = registerBlockWithoutBlockItem("wisteria_wall_sign",
            new ModWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN), ModWoodTypes.WISTERIA));
    public static final Block WISTERIA_HANGING_SIGN = registerBlockWithoutBlockItem("wisteria_hanging_sign",
            new ModHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), ModWoodTypes.WISTERIA));
    public static final Block WISTERIA_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("wisteria_wall_hanging_sign",
            new ModWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.WISTERIA));

    public static final Block WISTERIA_SAPLING = registerBlock("wisteria_sapling",
            new SaplingBlock(new WisteriaSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).mapColor(MapColor.PURPLE)));
    public static final Block POTTED_WISTERIA_SAPLING = registerBlockWithoutBlockItem("potted_wisteria_sapling",
            new FlowerPotBlock(WISTERIA_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING).mapColor(MapColor.PURPLE)));

    public static final Block FROST_PINE_PLANKS = registerBlock("frost_pine_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS).mapColor(MapColor.LIGHT_BLUE)));
    public static final Block FROST_PINE_STAIRS = registerBlock("frost_pine_stairs",
            new StairsBlock(ModBlocks.FROST_PINE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SPRUCE_STAIRS).mapColor(MapColor.LIGHT_BLUE)));
    public static final Block FROST_PINE_SLAB = registerBlock("frost_pine_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_SLAB).mapColor(MapColor.LIGHT_BLUE)));
    public static final Block FROST_PINE_BUTTON = registerBlock("frost_pine_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_BUTTON), BlockSetType.SPRUCE, 30, true));
    public static final Block FROST_PINE_PRESSURE_PLATE = registerBlock("frost_pine_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.SPRUCE_PRESSURE_PLATE).mapColor(MapColor.LIGHT_BLUE), BlockSetType.OAK));
    public static final Block FROST_PINE_FENCE = registerBlock("frost_pine_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_FENCE).mapColor(MapColor.LIGHT_BLUE)));
    public static final Block FROST_PINE_FENCE_GATE = registerBlock("frost_pine_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_FENCE_GATE).mapColor(MapColor.LIGHT_BLUE), WoodType.SPRUCE));
    public static final Block FROST_PINE_DOOR = registerBlock("frost_pine_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE));
    public static final Block FROST_PINE_TRAPDOOR = registerBlock("frost_pine_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_TRAPDOOR), BlockSetType.SPRUCE));
    public static final Block FROST_PINE_LOG = registerBlock("frost_pine_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LOG).mapColor(MapColor.LIGHT_BLUE)));
    public static final Block FROST_PINE_WOOD = registerBlock("frost_pine_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_WOOD).mapColor(MapColor.LIGHT_BLUE)));
    public static final Block STRIPPED_FROST_PINE_LOG = registerBlock("stripped_frost_pine_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_LOG).mapColor(MapColor.LIGHT_BLUE)));
    public static final Block STRIPPED_FROST_PINE_WOOD = registerBlock("stripped_frost_pine_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_WOOD).mapColor(MapColor.LIGHT_BLUE)));
    public static final Block FROST_PINE_LEAVES = registerBlock("frost_pine_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LEAVES).mapColor(MapColor.LIGHT_BLUE)));

    public static final Block FROST_PINE_SIGN = registerBlockWithoutBlockItem("frost_pine_sign",
            new ModStandingSignBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_SIGN), ModWoodTypes.FROST_PINE));
    public static final Block FROST_PINE_WALL_SIGN = registerBlockWithoutBlockItem("frost_pine_wall_sign",
            new ModWallSignBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_WALL_SIGN), ModWoodTypes.FROST_PINE));
    public static final Block FROST_PINE_HANGING_SIGN = registerBlockWithoutBlockItem("frost_pine_hanging_sign",
            new ModHangingSignBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_HANGING_SIGN), ModWoodTypes.FROST_PINE));
    public static final Block FROST_PINE_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("frost_pine_wall_hanging_sign",
            new ModWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_WALL_HANGING_SIGN), ModWoodTypes.FROST_PINE));

    public static final Block FROST_PINE_SAPLING = registerBlock("frost_pine_sapling",
            new FrostPineSapling(new FrostPineSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.SPRUCE_SAPLING).mapColor(MapColor.LIGHT_BLUE)));
    public static final Block POTTED_FROST_PINE_SAPLING = registerBlockWithoutBlockItem("potted_frost_pine_sapling",
            new FlowerPotBlock(FROST_PINE_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_SPRUCE_SAPLING).mapColor(MapColor.LIGHT_BLUE)));


    public static final Block SNOW_BRICKS = registerBlock("snow_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block CHISELED_SNOW_BRICKS = registerBlock("chiseled_snow_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block SNOW_BRICK_STAIRS = registerBlock("snow_brick_stairs",
            new StairsBlock(ModBlocks.SNOW_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block SNOW_BRICK_SLAB = registerBlock("snow_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block SNOW_BRICK_BUTTON = registerBlock("snow_brick_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 30, false));
    public static final Block SNOW_BRICK_PRESSURE_PLATE = registerBlock("snow_brick_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));
    public static final Block SNOW_BRICK_WALL = registerBlock("snow_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));

    public static final Block LEEK_CROP = registerBlockWithoutBlockItem("leek_crop",
            new LeekCropBlock(FabricBlockSettings.copyOf(Blocks.POTATOES)));

   public static final Block BITTER_BERRY_BUSH = registerBlockWithoutBlockItem("bitter_berry_bush",
            new BitterBerryBush(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block FROST_BERRY_BUSH = registerBlockWithoutBlockItem("frost_berry_bush",
            new FrostBerryBush(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE_GRAY).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block FROST_BUD_BLOCK = registerBlock("frost_bud",
            new FrostBudBlock(FabricBlockSettings.copyOf(Blocks.SPORE_BLOSSOM)));

    public static final Block SNOW_GRASS = registerBlock("snow_grass",
            new SnowGrassBlock(FabricBlockSettings.copyOf(Blocks.GRASS)));

    public static final Block MOON_CROP = registerBlockWithoutBlockItem("moon_crop",
            new MoonCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block SUN_CROP = registerBlockWithoutBlockItem("sun_crop",
            new SunCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));



    public static final Block GARDEN_COSMOS = registerBlock("garden_cosmos",
            new FlowerBlock(StatusEffects.GLOWING, 4, FabricBlockSettings.copyOf(Blocks.OXEYE_DAISY).mapColor(MapColor.MAGENTA)));
    public static final Block POTTED_GARDEN_COSMOS = registerBlockWithoutBlockItem("potted_garden_cosmos",
            new FlowerPotBlock(GARDEN_COSMOS, FabricBlockSettings.copyOf(Blocks.POTTED_OXEYE_DAISY).mapColor(MapColor.MAGENTA)));

    public static final Block BLUE_MUSHROOM = registerBlock("blue_mushroom",
            new MushroomPlantBlock(AbstractBlock.Settings.create().mapColor(MapColor.BLUE).noCollision().ticksRandomly()
                    .breakInstantly().sounds(BlockSoundGroup.GRASS).postProcess(Blocks::always).pistonBehavior(PistonBehavior.DESTROY),
                    TreeConfiguredFeatures.HUGE_RED_MUSHROOM)); //Change once find out how to code saplings to create huge blue mushroom tree
    public static final Block POTTED_BLUE_MUSHROOM = registerBlockWithoutBlockItem("potted_blue_mushroom",
            new FlowerPotBlock(BLUE_MUSHROOM, FabricBlockSettings.copyOf(Blocks.POTTED_RED_MUSHROOM).mapColor(MapColor.BLUE)));


    public static final Block MALACHITE_BLOCK = registerBlock("malachite_block",
            new AmethystBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));

    public static final Block BUDDING_MALACHITE = registerBlock("budding_malachite",
            new BuddingAmethystBlock(FabricBlockSettings.copyOf(Blocks.BUDDING_AMETHYST)));
    public static final Block SMALL_MALACHITE_BUD = registerBlockWithoutBlockItem("small_malachite_bud",
            new AmethystClusterBlock(1, 0, FabricBlockSettings.copyOf(Blocks.SMALL_AMETHYST_BUD)));
    public static final Block MEDIUM_MALACHITE_BUD = registerBlockWithoutBlockItem("medium_malachite_bud",
            new AmethystClusterBlock(1, 0, FabricBlockSettings.copyOf(Blocks.MEDIUM_AMETHYST_BUD)));
    public static final Block LARGE_MALACHITE_BUD = registerBlockWithoutBlockItem("large_malachite_bud",
            new AmethystClusterBlock(1, 0, FabricBlockSettings.copyOf(Blocks.LARGE_AMETHYST_BUD)));
    public static final Block MALACHITE_CLUSTER = registerBlockWithoutBlockItem("malachite_cluster",
            new AmethystClusterBlock(1, 0, FabricBlockSettings.copyOf(Blocks.AMETHYST_CLUSTER)));


    public static final Block TEST_BLOCK = registerBlock("test_block",
            new TestBlock(FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)));
    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(MCExpanded.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MCExpanded.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MCExpanded.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        MCExpanded.LOGGER.info("Registering ModBlocks for " + MCExpanded.MOD_ID);
    }
}
