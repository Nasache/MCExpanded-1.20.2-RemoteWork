package net.nathan.mcexpanded.world.tree;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.nathan.mcexpanded.world.ModConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class FrostPineSaplingGenerator extends SaplingGenerator {
    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return ModConfiguredFeatures.FROST_PINE_KEY;
    }
}