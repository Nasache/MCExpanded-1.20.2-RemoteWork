package net.nathan.mcexpanded.entity.layer;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.nathan.mcexpanded.MCExpanded;

public class ModModelLayers {
    public static final EntityModelLayer DUCK =
            new EntityModelLayer(new Identifier(MCExpanded.MOD_ID, "duck"), "main");
}
