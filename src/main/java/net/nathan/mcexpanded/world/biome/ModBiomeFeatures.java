package net.nathan.mcexpanded.world.biome;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.MiscPlacedFeatures;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.nathan.mcexpanded.entity.ModEntities;
import net.nathan.mcexpanded.world.ModPlacedFeatures;

public class ModBiomeFeatures {

    public static void addWisteriaFlowers(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.PATCH_GRASS_FOREST);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.PATCH_TALL_GRASS);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.GARDEN_COSMOS_PLACED_KEY);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PINK_TULIP_FLOWERS_PLACED);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PEONY_FLOWERS_PLACED);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.LILAC_FLOWERS_PLACED);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.ALLIUM_FLOWERS_PLACED);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CORNFLOWER_FLOWERS_PLACED);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BLUE_ORCHID_FLOWERS_PLACED);

    }
    public static void addSnowyCavesVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.PATCH_FROST_PLACED_KEY);
        builder.feature(GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.FROST_BUD_PLACED_KEY);
        builder.feature(GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.FROST_PINE_PLACED_KEY);
    }
    public static void addSnowyCavesMobs(SpawnSettings.Builder builder) {
        builder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.STRAY, 100, 1, 4));
        builder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.ZOMBIE, 70, 1, 4));
        builder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.CREEPER, 50, 1, 3));
        builder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.SPIDER, 50, 1, 4));
        builder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.ENDERMAN, 25, 1, 3));
        builder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(ModEntities.GHOST, 60, 1, 4));
    }
}
