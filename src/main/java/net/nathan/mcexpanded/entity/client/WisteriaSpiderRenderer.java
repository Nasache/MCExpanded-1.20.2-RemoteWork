package net.nathan.mcexpanded.entity.client;


import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.SpiderEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.nathan.mcexpanded.MCExpanded;
import net.nathan.mcexpanded.entity.custom.WisteriaSpiderEntity;
import net.nathan.mcexpanded.entity.layer.ModModelLayers;

@Environment(EnvType.CLIENT)
public class WisteriaSpiderRenderer extends SpiderEntityRenderer<WisteriaSpiderEntity> {
    private static final Identifier TEXTURE = new Identifier(MCExpanded.MOD_ID, "textures/entity/wisteria_spider.png");
    private static final float SCALE = 0.7F;

    public WisteriaSpiderRenderer(EntityRendererFactory.Context context) {
        super(context, ModModelLayers.WISTERIA_SPIDER);
        this.shadowRadius *= 0.7F;
    }

    protected void scale(WisteriaSpiderEntity wisteriaSpiderEntity, MatrixStack matrixStack, float f) {
        matrixStack.scale(0.7F, 0.7F, 0.7F);
    }

    public Identifier getTexture(WisteriaSpiderEntity wisteiraSpiderEntity) {
        return TEXTURE;
    }
}
