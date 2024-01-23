package net.nathan.mcexpanded.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.BiomeKeys;
import net.nathan.mcexpanded.entity.ModEntities;
import net.nathan.mcexpanded.world.biome.ModBiomes;

public class ModEntitySpawns {
    public static void addSpawns() {
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.RIVER, BiomeKeys.SWAMP, BiomeKeys.BIRCH_FOREST, BiomeKeys.FOREST),
                SpawnGroup.CREATURE, ModEntities.DUCK, 100, 2, 5);

        SpawnRestriction.register(ModEntities.DUCK, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::isValidNaturalSpawn);



        BiomeModifications.addSpawn(BiomeSelectors.excludeByKey(BiomeKeys.MUSHROOM_FIELDS),
                SpawnGroup.MONSTER, ModEntities.GHOST, 100, 1, 4);

        SpawnRestriction.register(ModEntities.GHOST, SpawnRestriction.Location.NO_RESTRICTIONS,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, HostileEntity::canSpawnInDark);
    }
}
