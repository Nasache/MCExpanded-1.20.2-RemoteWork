package net.nathan.mcexpanded.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.feature.ElytraFeatureRenderer;
import net.minecraft.client.render.entity.feature.HeldItemFeatureRenderer;
import net.minecraft.util.Identifier;
import net.nathan.mcexpanded.MCExpanded;
import net.nathan.mcexpanded.entity.custom.VagrantEntity;
import net.nathan.mcexpanded.entity.layer.ModModelLayers;

public class JungleSkeletonRenderer extends MobEntityRenderer<VagrantEntity, JungleSkeletonModel<VagrantEntity>> {
    private static final Identifier TEXTURE = new Identifier(MCExpanded.MOD_ID, "textures/entity/jungle_skeleton.png");

    public JungleSkeletonRenderer(EntityRendererFactory.Context context) {
        super(context, new JungleSkeletonModel<>(context.getPart(ModModelLayers.JUNGLE_SKELETON)), 0.3f);
        this.addFeature(new ElytraFeatureRenderer<>(this, context.getModelLoader()));
        this.addFeature(new HeldItemFeatureRenderer<>(this, context.getHeldItemRenderer()));
    }

    @Override
    public Identifier getTexture(VagrantEntity entity) {
        return TEXTURE;
    }
}
