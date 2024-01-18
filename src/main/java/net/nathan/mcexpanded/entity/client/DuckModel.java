package net.nathan.mcexpanded.entity.client;

import com.ibm.icu.text.Normalizer2;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;
import net.nathan.mcexpanded.entity.animations.ModAnimations;
import net.nathan.mcexpanded.entity.custom.DuckEntity;
import oshi.jna.platform.mac.SystemB;

import javax.swing.text.html.parser.Entity;

public class DuckModel<T extends DuckEntity> extends SinglePartEntityModel<T> {
    private final ModelPart Duck;
    private final ModelPart Head;
    public DuckModel(ModelPart root) {
        this.Duck = root.getChild("Duck");
        this.Head = Duck.getChild("Body").getChild("Torso").getChild("Head");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData Duck = modelPartData.addChild("Duck", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData Body = Duck.addChild("Body", ModelPartBuilder.create().uv(0, 0).cuboid(-2.0F, -7.0F, -3.0F, 4.0F, 4.0F, 7.0F, new Dilation(0.0F))
                .uv(14, 21).cuboid(-2.0F, -5.0F, 4.0F, 4.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 2).cuboid(-1.0F, -6.0F, 4.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 11).cuboid(-2.0F, -3.0F, -2.0F, 4.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData RightWing = Body.addChild("RightWing", ModelPartBuilder.create().uv(0, 17).cuboid(-3.0F, -7.0F, -2.0F, 1.0F, 3.0F, 5.0F, new Dilation(0.0F))
                .uv(19, 21).cuboid(-3.0F, -5.0F, -1.0F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData LeftWing = Body.addChild("LeftWing", ModelPartBuilder.create().uv(15, 0).cuboid(2.0F, -5.0F, -1.0F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F))
                .uv(7, 20).cuboid(2.0F, -7.0F, -2.0F, 1.0F, 3.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData LeftLeg = Body.addChild("LeftLeg", ModelPartBuilder.create().uv(1, 12).cuboid(1.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.01F))
                .uv(13, 11).cuboid(1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, new Dilation(0.01F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData RightLeg = Body.addChild("RightLeg", ModelPartBuilder.create().uv(1, 5).cuboid(-2.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.01F))
                .uv(13, 13).cuboid(-2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, new Dilation(0.01F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData Torso = Body.addChild("Torso", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData Tail = Torso.addChild("Tail", ModelPartBuilder.create().uv(0, 26).cuboid(-1.0F, -5.0F, 5.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-1.0F, -4.0F, 5.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData Head = Torso.addChild("Head", ModelPartBuilder.create().uv(25, 5).cuboid(-1.0F, -8.0F, -7.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(14, 13).cuboid(-2.0F, -10.0F, -5.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F))
                .uv(19, 8).cuboid(-1.0F, -6.0F, -4.0F, 2.0F, 1.0F, 3.0F, new Dilation(-0.01F))
                .uv(22, 0).cuboid(-1.0F, -11.0F, -4.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, 1.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }
    @Override
    public void setAngles(DuckEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(entity, netHeadYaw, headPitch, ageInTicks);

        this.animateMovement(ModAnimations.DUCK_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.updateAnimation(entity.idleAnimationState, ModAnimations.DUCK_IDLE, ageInTicks, 1f);
    }


    private void setHeadAngles(DuckEntity entity, float headYaw, float headPitch, float animationProgress) {
        headYaw = MathHelper.clamp(headYaw, -30.0f, 30.0f);
        headPitch = MathHelper.clamp(headPitch, -25.0f, 45.0f);

        this.Head.yaw = headYaw * 0.017453292F;
        this.Head.pitch = headPitch * 0.017453292F;
    }


    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        Duck.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return Duck;
    }
}