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
import net.nathan.mcexpanded.world.tree.RedMapleSaplingGenerator;
import net.nathan.mcexpanded.world.tree.YellowMapleSaplingGenerator;

public class ModBlocks {


    public static final Block COBALT_BLOCK = registerBlock("cobalt_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.BLUE)));
    public static final Block RAW_COBALT_BLOCK = registerBlock("raw_cobalt_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.BLUE)));
    public static final Block COBALT_ORE = registerBlock("cobalt_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));

    public static final Block MAPLE_PLANKS = registerBlock("maple_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block MAPLE_STAIRS = registerBlock("maple_stairs",
            new StairsBlock(ModBlocks.MAPLE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block MAPLE_SLAB = registerBlock("maple_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block MAPLE_BUTTON = registerBlock("maple_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
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

    public static final Block LEEK_CROP = registerBlockWithoutBlockItem("leek_crop",
            new LeekCropBlock(FabricBlockSettings.copyOf(Blocks.POTATOES)));

   public static final Block BITTER_BERRY_BUSH = registerBlockWithoutBlockItem("bitter_berry_bush",
            new BitterBerryBush(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));

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
