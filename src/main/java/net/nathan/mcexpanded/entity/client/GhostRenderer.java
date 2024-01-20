package net.nathan.mcexpanded.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.nathan.mcexpanded.MCExpanded;
import net.nathan.mcexpanded.entity.custom.GhostEntity;
import net.nathan.mcexpanded.entity.layer.ModModelLayers;

public class GhostRenderer extends MobEntityRenderer<GhostEntity, GhostModel<GhostEntity>> {
    private static final Identifier TEXTURE = new Identifier(MCExpanded.MOD_ID, "textures/entity/ghost.png");
    public GhostRenderer(EntityRendererFactory.Context context) {
        super(context, new GhostModel<>(context.getPart(ModModelLayers.GHOST)), 0.3f);
    }

    @Override
    public Identifier getTexture(GhostEntity entity) {
        return TEXTURE;
    }
}
