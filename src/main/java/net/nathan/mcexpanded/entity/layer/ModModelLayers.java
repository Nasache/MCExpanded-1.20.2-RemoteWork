package net.nathan.mcexpanded.entity.layer;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.nathan.mcexpanded.MCExpanded;

public class ModModelLayers {
    public static final EntityModelLayer DUCK =
            new EntityModelLayer(new Identifier(MCExpanded.MOD_ID, "duck"), "main");

    public static final EntityModelLayer GHOST =
            new EntityModelLayer(new Identifier(MCExpanded.MOD_ID, "ghost"), "main");

    public static final EntityModelLayer JUNGLE_SKELETON =
            new EntityModelLayer(new Identifier(MCExpanded.MOD_ID, "jungle_skeleton"), "main");

    public static final EntityModelLayer MIRE =
            new EntityModelLayer(new Identifier(MCExpanded.MOD_ID, "mire"), "main");

    public static final EntityModelLayer WISTERIA_SPIDER =
            new EntityModelLayer(new Identifier(MCExpanded.MOD_ID, "wisteria_spider"), "main");

    public static final EntityModelLayer HARVEST_SPIRIT =
            new EntityModelLayer(new Identifier(MCExpanded.MOD_ID, "harvestspirit"), "main");
}
