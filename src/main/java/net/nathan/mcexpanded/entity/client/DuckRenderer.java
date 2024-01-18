package net.nathan.mcexpanded.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;
import net.nathan.mcexpanded.MCExpanded;
import net.nathan.mcexpanded.entity.custom.DuckEntity;
import net.nathan.mcexpanded.entity.layer.ModModelLayers;

public class DuckRenderer extends MobEntityRenderer<DuckEntity, DuckModel<DuckEntity>> {
    private static final Identifier TEXTURE = new Identifier(MCExpanded.MOD_ID, "textures/entity/duck.png");
    public DuckRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new DuckModel<>(ctx.getPart(ModModelLayers.DUCK)), 0.3f);
    }

    @Override
    public Identifier getTexture(DuckEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(DuckEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.55f, 0.55f, 0.55f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
