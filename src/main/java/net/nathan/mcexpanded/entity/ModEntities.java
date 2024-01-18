package net.nathan.mcexpanded.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.nathan.mcexpanded.MCExpanded;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nathan.mcexpanded.entity.custom.DuckEntity;

public class ModEntities {

    public static final EntityType<DuckEntity> DUCK = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(MCExpanded.MOD_ID, "duck"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, DuckEntity::new)
                    .dimensions(EntityDimensions.fixed(0.35f, 0.5f)).build());

    public static void registerModEntities() {
        MCExpanded.LOGGER.info("Registering Mod Entities for " + MCExpanded.MOD_ID);
    }
}