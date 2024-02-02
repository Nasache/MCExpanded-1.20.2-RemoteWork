package net.nathan.mcexpanded.world;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.client.gl.Uniform;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliage.AcaciaFoliagePlacer;
import net.minecraft.world.gen.foliage.CherryFoliagePlacer;
import net.minecraft.world.gen.foliage.SpruceFoliagePlacer;
import net.minecraft.world.gen.trunk.BendingTrunkPlacer;
import net.minecraft.world.gen.trunk.CherryTrunkPlacer;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;
import net.nathan.mcexpanded.MCExpanded;
import net.nathan.mcexpanded.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.nathan.mcexpanded.block.custom.BitterBerryBush;
import net.nathan.mcexpanded.block.custom.FrostBerryBush;
import net.nathan.mcexpanded.world.tree.custom.MapleFoliagePlacer;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_MAPLE_KEY = registerKey("red_maple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_MAPLE_KEY = registerKey("yellow_maple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WISTERIA_KEY = registerKey("wisteria");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FROST_PINE_KEY = registerKey("frost_pine");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GARDEN_COSMOS_KEY = registerKey("garden_cosmos");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_BLUE_MUSHROOM = registerKey("blue_mushroom");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_BITTER_BUSH = registerKey("bitter_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_FROST_BUSH = registerKey("frost_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FROST_BUD = registerKey("frost_bud");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ICE_CRYSTAL = registerKey("ice_crystal");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_SNOW_GRASS = registerKey("patch_snow_grass");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ALLIUM_FLOWERS = registerKey("allium_flowers");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PEONY_FLOWERS = registerKey("peony_flowers");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LILAC_FLOWERS = registerKey("lilac_flowers");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CORNFLOWER_FLOWERS = registerKey("cornflower_flowers");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUE_ORCHID_FLOWERS = registerKey("blue_orchid_flowers");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINK_TULIP_FLOWERS = registerKey("pink_tulip_flowers");

    public static final RegistryKey<ConfiguredFeature<?, ?>> COBALT_ORE_KEY = registerKey("cobalt_ore");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldCobaltOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.COBALT_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_COBALT_ORE.getDefaultState()));


        register(context, RED_MAPLE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.MAPLE_LOG),
                new StraightTrunkPlacer(5, 2, 3),
                BlockStateProvider.of(ModBlocks.RED_MAPLE_LEAVES),
                new MapleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, YELLOW_MAPLE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.MAPLE_LOG),
                new StraightTrunkPlacer(5, 2, 3),
                BlockStateProvider.of(ModBlocks.YELLOW_MAPLE_LEAVES),
                new MapleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, WISTERIA_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.WISTERIA_LOG),
                new StraightTrunkPlacer(5, 2, 3),
                BlockStateProvider.of(ModBlocks.WISTERIA_LEAVES),
                new CherryFoliagePlacer(ConstantIntProvider.create(4), ConstantIntProvider.create(0), ConstantIntProvider.create(4),
                        0, 0.5f, 0.9f, 0.7f),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, FROST_PINE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.FROST_PINE_LOG),
                new StraightTrunkPlacer(5, 2, 3),
                BlockStateProvider.of(ModBlocks.FROST_PINE_LEAVES),
                new SpruceFoliagePlacer(ConstantIntProvider.create(4), ConstantIntProvider.create(0), ConstantIntProvider.create(5)),
                new TwoLayersFeatureSize(1, 0, 2)).dirtProvider(BlockStateProvider.of(Blocks.SNOW_BLOCK)).build());

        register(context, COBALT_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldCobaltOres, 8));

        register(context, GARDEN_COSMOS_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GARDEN_COSMOS)))));
        register(context, PINK_TULIP_FLOWERS, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(Blocks.PINK_TULIP)))));
        register(context, PEONY_FLOWERS, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(Blocks.PEONY)))));
        register(context, LILAC_FLOWERS, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(Blocks.LILAC)))));
        register(context, ALLIUM_FLOWERS, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(Blocks.ALLIUM)))));
        register(context, CORNFLOWER_FLOWERS, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(Blocks.CORNFLOWER)))));
        register(context, BLUE_ORCHID_FLOWERS, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(Blocks.BLUE_ORCHID)))));


        register(context, PATCH_BLUE_MUSHROOM, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig
                (Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BLUE_MUSHROOM))));
        ConfiguredFeatures.register(context, PATCH_BITTER_BUSH, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig
                        (BlockStateProvider.of((BlockState)ModBlocks.BITTER_BERRY_BUSH.getDefaultState()
                                .with(BitterBerryBush.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));
        ConfiguredFeatures.register(context, PATCH_FROST_BUSH, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig
                        (BlockStateProvider.of((BlockState)ModBlocks.FROST_BERRY_BUSH.getDefaultState()
                                .with(FrostBerryBush.AGE, 3))), List.of(Blocks.SNOW_BLOCK, Blocks.STONE, Blocks.DEEPSLATE, Blocks.DIRT)));
        ConfiguredFeatures.register(context, FROST_BUD, Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.FROST_BUD_BLOCK)));
        ConfiguredFeatures.register(context, ICE_CRYSTAL, Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.ICE_CRYSTAL)));
        ConfiguredFeatures.register(context, PATCH_SNOW_GRASS, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig
                        (BlockStateProvider.of((BlockState)ModBlocks.SNOW_GRASS.getDefaultState())), List.of(Blocks.SNOW_BLOCK)));


    }


    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(MCExpanded.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}