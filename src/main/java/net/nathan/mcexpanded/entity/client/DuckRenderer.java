package net.nathan.mcexpanded.entity.client;

import com.google.common.collect.Maps;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.nathan.mcexpanded.MCExpanded;
import net.nathan.mcexpanded.entity.custom.DuckEntity;
import net.nathan.mcexpanded.entity.layer.ModModelLayers;
import net.nathan.mcexpanded.entity.variant.DuckVariant;

import java.util.Map;

public class DuckRenderer extends MobEntityRenderer<DuckEntity, DuckModel<DuckEntity>> {
    private static final Map<DuckVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(DuckVariant.class), map -> {
                map.put(DuckVariant.DEFAULT,
                        new Identifier(MCExpanded.MOD_ID, "textures/entity/duck.png"));
                map.put(DuckVariant.WHITE,
                        new Identifier(MCExpanded.MOD_ID, "textures/entity/duck_white.png"));
            });

    public DuckRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new DuckModel<>(ctx.getPart(ModModelLayers.DUCK)), 0.3f);
    }

    @Override
    public Identifier getTexture(DuckEntity entity) {
        if (entity.isBaby()) {
            return new Identifier(MCExpanded.MOD_ID, "textures/entity/duck_yellow.png");
        } else {
            return LOCATION_BY_VARIANT.get(entity.getVariant());
        }
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
