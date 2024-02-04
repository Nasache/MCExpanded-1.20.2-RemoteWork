package net.nathan.mcexpanded.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.nathan.mcexpanded.MCExpanded;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nathan.mcexpanded.entity.custom.*;

public class ModEntities {

    public static final EntityType<DuckEntity> DUCK = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(MCExpanded.MOD_ID, "duck"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, DuckEntity::new)
                    .dimensions(EntityDimensions.fixed(0.35f, 0.5f)).build());

    public static final EntityType<GhostEntity> GHOST = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(MCExpanded.MOD_ID, "ghost"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, GhostEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 1.5f)).build());

    public static final EntityType<VagrantEntity> VAGRANT = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(MCExpanded.MOD_ID, "jungle_skeleton"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, VagrantEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 1.5f)).build());

    public static final EntityType<MireEntity> MIRE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(MCExpanded.MOD_ID, "mire"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, MireEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 1.5f)).build());

    public static final EntityType<WisteriaSpiderEntity> WISTERIA_SPIDER = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(MCExpanded.MOD_ID, "wisteria_spider"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, WisteriaSpiderEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 1.5f)).build());

    public static final EntityType<HarvestSpiritEntity> HARVEST_SPIRIT = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(MCExpanded.MOD_ID, "harvestspirit"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, HarvestSpiritEntity::new)
                    .dimensions(EntityDimensions.fixed(2f, 3f)).build());



    public static void registerModEntities() {
        MCExpanded.LOGGER.info("Registering Mod Entities for " + MCExpanded.MOD_ID);

        FabricDefaultAttributeRegistry.register(VAGRANT, ModSkeletonEntity.createModSkeletonAttributes());
    }
}