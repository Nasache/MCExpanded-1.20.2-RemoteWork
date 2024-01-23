package net.nathan.mcexpanded.world.biome;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.nathan.mcexpanded.MCExpanded;
import net.nathan.mcexpanded.entity.ModEntities;

public class ModBiomes {
    public static final RegistryKey<Biome> WISTERIA_FOREST = register("wisteria_forest");
    public static final RegistryKey<Biome> FROST_PINE_FOREST = register("frost_pine_forest");
    public static final RegistryKey<Biome> SNOWY_CAVES = register("snowy_caves");
    public static final RegistryKey<Biome> SANDY_CAVES = register("sandy_caves");

    public static RegistryKey<Biome> register(String name) {
        return RegistryKey.of(RegistryKeys.BIOME, new Identifier(MCExpanded.MOD_ID, name));
    }

    public static void bootstrap(Registerable<Biome> context) {
        context.register(WISTERIA_FOREST, wisteriaForest(context));
        context.register(FROST_PINE_FOREST, frostPineForest(context));
        context.register(SNOWY_CAVES, snowyCaves(context));
        context.register(SANDY_CAVES, sandyCaves(context));

    }

    public static void globalOverworldGeneration(GenerationSettings.LookupBackedBuilder builder) {
        DefaultBiomeFeatures.addLandCarvers(builder);
        DefaultBiomeFeatures.addAmethystGeodes(builder);
        DefaultBiomeFeatures.addDungeons(builder);
        DefaultBiomeFeatures.addMineables(builder);
        DefaultBiomeFeatures.addSprings(builder);
        DefaultBiomeFeatures.addFrozenTopLayer(builder);
    }

    public static Biome wisteriaForest(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
        spawnBuilder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(ModEntities.GHOST, 30, 3, 5));


        DefaultBiomeFeatures.addFarmAnimals(spawnBuilder);
        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);
        DefaultBiomeFeatures.addDefaultOres(biomeBuilder);

        ModBiomeFeatures.addWisteriaFlowers(biomeBuilder);

        DefaultBiomeFeatures.addDefaultMushrooms(biomeBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(biomeBuilder);

        return new Biome.Builder()
                .precipitation(true)
                .downfall(0.4f)
                .temperature(0.7f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .grassColor(0x155226)
                        .fogColor(0xad8cff)
                        .waterColor(0x5c55bd)
                        .waterFogColor(0x433d94)
                        .foliageColor(0x224026)
                        .skyColor(0x1d2a54).build())
                .build();
    }

    public static Biome frostPineForest(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
        spawnBuilder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(ModEntities.GHOST, 10, 3, 5));
        spawnBuilder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.FOX, 50, 3, 5));



        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);
        DefaultBiomeFeatures.addSnowyMobs(spawnBuilder);

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);


        DefaultBiomeFeatures.addDefaultOres(biomeBuilder);
        DefaultBiomeFeatures.addTaigaGrass(biomeBuilder);


        return new Biome.Builder()
                .precipitation(true)
                .downfall(0.4f)
                .temperature(-0.7f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .grassColor(0x599e91)
                        .fogColor(0x75b7c9)
                        .waterColor(0x31699e)
                        .waterFogColor(0x75b7c9)
                        .foliageColor(0x469983)
                        .skyColor(0x98d5e3).build())
                .build();
    }
    public static Biome snowyCaves(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
        spawnBuilder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(ModEntities.GHOST, 30, 3, 5));
        spawnBuilder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.STRAY, 100, 3, 5));

        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);
        DefaultBiomeFeatures.addSnowyMobs(spawnBuilder);

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);
        DefaultBiomeFeatures.addDefaultOres(biomeBuilder);

        DefaultBiomeFeatures.addDefaultMushrooms(biomeBuilder);
        DefaultBiomeFeatures.addTaigaGrass(biomeBuilder);

        return new Biome.Builder()
                .precipitation(true)
                .downfall(0.4f)
                .temperature(-0.7f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .grassColor(0x599e91)
                        .fogColor(0x75b7c9)
                        .waterColor(0x31699e)
                        .waterFogColor(0x75b7c9)
                        .foliageColor(0x469983)
                        .skyColor(0x98d5e3).build())
                .build();
    }
    public static Biome sandyCaves(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
        spawnBuilder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(ModEntities.GHOST, 30, 3, 5));

        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);
        DefaultBiomeFeatures.addDesertMobs(spawnBuilder);

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);
        DefaultBiomeFeatures.addDefaultOres(biomeBuilder);

        DefaultBiomeFeatures.addDefaultMushrooms(biomeBuilder);
        DefaultBiomeFeatures.addDesertVegetation(biomeBuilder);


        return new Biome.Builder()
                .precipitation(false)
                .downfall(0.0f)
                .temperature(1f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .grassColor(0x599e91)
                        .fogColor(0x75b7c9)
                        .waterColor(0x31699e)
                        .waterFogColor(0x75b7c9)
                        .foliageColor(0x469983)
                        .skyColor(0x98d5e3).build())
                .build();
    }
}
