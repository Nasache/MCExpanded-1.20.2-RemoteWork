package net.nathan.mcexpanded.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.nathan.mcexpanded.world.ModPlacedFeatures;
import net.nathan.mcexpanded.world.biome.ModBiomes;

public class ModFlowerGeneration {
    public static void generateFlowers() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PATCH_BITTER_PLACED_KEY);

      //BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.SNOWY_CAVES),
      //        GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.PATCH_FROST_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP, BiomeKeys.MUSHROOM_FIELDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BLUE_MUSHROOM_PLACED_KEY);
    }
}