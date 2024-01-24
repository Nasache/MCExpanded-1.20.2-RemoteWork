package net.nathan.mcexpanded.world;

import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.placementmodifier.*;
import net.nathan.mcexpanded.MCExpanded;
import net.nathan.mcexpanded.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;


import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> RED_MAPLE_PLACED_KEY = registerKey("red_maple_placed");
    public static final RegistryKey<PlacedFeature> YELLOW_MAPLE_PLACED_KEY = registerKey("yellow_maple_placed");
    public static final RegistryKey<PlacedFeature> WISTERIA_PLACED_KEY = registerKey("wisteria_placed");
    public static final RegistryKey<PlacedFeature> FROST_PINE_PLACED_KEY = registerKey("frost_pine_placed");
    public static final RegistryKey<PlacedFeature> GARDEN_COSMOS_PLACED_KEY = registerKey("garden_cosmos_placed");
    public static final RegistryKey<PlacedFeature> ALLIUM_FLOWERS_PLACED = registerKey("allium_flowers_placed");
    public static final RegistryKey<PlacedFeature> PEONY_FLOWERS_PLACED = registerKey("peony_flowers_placed");
    public static final RegistryKey<PlacedFeature> LILAC_FLOWERS_PLACED = registerKey("lilac_flowers_placed");
    public static final RegistryKey<PlacedFeature> CORNFLOWER_FLOWERS_PLACED = registerKey("cornflower_flowers_placed");
    public static final RegistryKey<PlacedFeature> BLUE_ORCHID_FLOWERS_PLACED = registerKey("blue_orchid_flowers_placed");
    public static final RegistryKey<PlacedFeature> PINK_TULIP_FLOWERS_PLACED = registerKey("pink_tulip_flowers_placed");
    public static final RegistryKey<PlacedFeature> PATCH_BITTER_PLACED_KEY = registerKey("bitter_berry_placed");
    public static final RegistryKey<PlacedFeature> PATCH_FROST_PLACED_KEY = registerKey("frost_berry_placed");
    public static final RegistryKey<PlacedFeature> FROST_BUD_PLACED_KEY = registerKey("frost_bud_placed");
    public static final RegistryKey<PlacedFeature> BLUE_MUSHROOM_PLACED_KEY = registerKey("blue_mushroom_placed");
    public static final RegistryKey<PlacedFeature> COBALT_ORE_PLACED_KEY = registerKey("cobalt_ore_placed");
    public static final RegistryKey<PlacedFeature> MALACHITE_GEODE_PLACED_KEY = registerKey("malachite_geode_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, RED_MAPLE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RED_MAPLE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.2f, 2), ModBlocks.RED_MAPLE_SAPLING));
        register(context, YELLOW_MAPLE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.YELLOW_MAPLE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.2f, 2), ModBlocks.YELLOW_MAPLE_SAPLING));
        register(context, WISTERIA_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.WISTERIA_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(8, 0.2f, 2), ModBlocks.WISTERIA_SAPLING));
        register(context, FROST_PINE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.FROST_PINE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(10, 0.2f, 2), ModBlocks.FROST_PINE_SAPLING));

        register(context, GARDEN_COSMOS_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GARDEN_COSMOS_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PINK_TULIP_FLOWERS_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PINK_TULIP_FLOWERS),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PEONY_FLOWERS_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PEONY_FLOWERS),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, LILAC_FLOWERS_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.LILAC_FLOWERS),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, ALLIUM_FLOWERS_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ALLIUM_FLOWERS),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, CORNFLOWER_FLOWERS_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CORNFLOWER_FLOWERS),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, BLUE_ORCHID_FLOWERS_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BLUE_ORCHID_FLOWERS),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, PATCH_BITTER_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PATCH_BITTER_BUSH),
                new PlacementModifier[]{RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(),
                        PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of()});
        register(context, PATCH_FROST_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PATCH_FROST_BUSH),
                new PlacementModifier[]{CountPlacementModifier.of(75), SquarePlacementModifier.of(),
                        PlacedFeatures.BOTTOM_TO_TOP_RANGE, EnvironmentScanPlacementModifier.of(Direction.DOWN,
                        BlockPredicate.solid(), BlockPredicate.IS_AIR, 12),
                        RandomOffsetPlacementModifier.vertically(ConstantIntProvider.create(1)), BiomePlacementModifier.of()});
        register(context, FROST_BUD_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.FROST_BUD),
                new PlacementModifier[]{CountPlacementModifier.of(80), SquarePlacementModifier.of(),
                        PlacedFeatures.BOTTOM_TO_TOP_RANGE, EnvironmentScanPlacementModifier.of(Direction.UP,
                        BlockPredicate.solid(), BlockPredicate.IS_AIR, 12),
                        RandomOffsetPlacementModifier.vertically(ConstantIntProvider.create(-1)), BiomePlacementModifier.of()});


        register(context, BLUE_MUSHROOM_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PATCH_BLUE_MUSHROOM),
                RarityFilterPlacementModifier.of(8), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, COBALT_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.COBALT_ORE_KEY),
                ModOrePlacement.modifiersWithCount(10,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(32))));

        register(context, MALACHITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MALACHITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(42), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.fixed(-16),
                        YOffset.fixed(32)), BiomePlacementModifier.of());

    }


    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MCExpanded.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}