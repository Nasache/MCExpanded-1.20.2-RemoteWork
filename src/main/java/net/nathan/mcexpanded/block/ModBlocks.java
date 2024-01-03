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
    public static final Block MAPLE_LEAVES = registerBlock("maple_leaves",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).mapColor(MapColor.BRIGHT_RED)));
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
