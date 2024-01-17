package net.nathan.mcexpanded.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.nathan.mcexpanded.MCExpanded;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static void registerModEntities() {
        MCExpanded.LOGGER.info("Registering Mod Entities for " + MCExpanded.MOD_ID);
    }
}