package net.nathan.mcexpanded.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.nathan.mcexpanded.MCExpanded;
import net.nathan.mcexpanded.entity.custom.MireEntity;
import net.nathan.mcexpanded.entity.layer.ModModelLayers;

public class MireRenderer extends MobEntityRenderer<MireEntity, MireModel<MireEntity>> {
    private static final Identifier TEXTURE = new Identifier(MCExpanded.MOD_ID, "textures/entity/mire.png");

    public MireRenderer(EntityRendererFactory.Context context) {
        super(context, new MireModel<>(context.getPart(ModModelLayers.MIRE)), 0.3f);
    }

    @Override
    public Identifier getTexture(MireEntity entity) {
        return TEXTURE;
    }
}

