package net.nathan.mcexpanded.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.nathan.mcexpanded.entity.custom.HarvestSpiritEntity;
import net.minecraft.util.Identifier;
import net.nathan.mcexpanded.MCExpanded;
import net.nathan.mcexpanded.entity.layer.ModModelLayers;

public class HarvestSpiritRenderer extends MobEntityRenderer<HarvestSpiritEntity, HarvestSpiritModel<HarvestSpiritEntity>> {
    private static final Identifier TEXTURE = new Identifier(MCExpanded.MOD_ID, "textures/entity/harvestspirit.png");
    public HarvestSpiritRenderer(EntityRendererFactory.Context context) {
        super(context, new HarvestSpiritModel<>(context.getPart(ModModelLayers.HARVEST_SPIRIT)), 0.3f);
    }

    @Override
    public Identifier getTexture(HarvestSpiritEntity entity) {
        return TEXTURE;
    }
}
