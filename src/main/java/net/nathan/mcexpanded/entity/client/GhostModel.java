package net.nathan.mcexpanded.entity.client;


import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.nathan.mcexpanded.entity.animations.ModAnimations;
import net.nathan.mcexpanded.entity.custom.GhostEntity;

public class GhostModel<T extends GhostEntity> extends SinglePartEntityModel<T> {
    private final ModelPart Ghost;
    private final ModelPart Head;

    public GhostModel(ModelPart root) {
        this.Ghost = root.getChild("Ghost");
        this.Head = Ghost.getChild("Body").getChild("Torso").getChild("Head");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData Ghost = modelPartData.addChild("Ghost", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 33.0F, 0.0F));

        ModelPartData Body = Ghost.addChild("Body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData Torso = Body.addChild("Torso", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -16.0476F, 0.0F));

        ModelPartData Head = Torso.addChild("Head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -32.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 16.0476F, 0.0F));

        ModelPartData Bod = Torso.addChild("Bod", ModelPartBuilder.create().uv(0, 16).cuboid(-4.0F, -7.9524F, -2.0F, 8.0F, 7.0F, 4.0F, new Dilation(0.0F))
                .uv(38, 3).cuboid(-1.0F, -0.9524F, -2.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(20, 36).cuboid(0.0F, -0.9524F, -2.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
                .uv(12, 38).cuboid(1.0F, -0.9524F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 38).cuboid(2.0F, -0.9524F, -2.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(38, 11).cuboid(3.0F, -0.9524F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(16, 36).cuboid(3.0F, -0.9524F, -1.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
                .uv(36, 19).cuboid(3.0F, -0.9524F, 0.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
                .uv(31, 37).cuboid(3.0F, -0.9524F, 1.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(38, 9).cuboid(2.0F, -0.9524F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(23, 30).cuboid(1.0F, -0.9524F, 1.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
                .uv(36, 36).cuboid(0.0F, -0.9524F, 1.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(16, 30).cuboid(-1.0F, -0.9524F, 1.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
                .uv(36, 24).cuboid(-2.0F, -0.9524F, 1.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(30, 19).cuboid(-3.0F, -0.9524F, 1.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
                .uv(8, 38).cuboid(-4.0F, -0.9524F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(20, 16).cuboid(-4.0F, -0.9524F, 0.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
                .uv(36, 0).cuboid(-4.0F, -0.9524F, -1.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(24, 0).cuboid(-4.0F, -0.9524F, -2.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 16).cuboid(-3.0F, -0.9524F, -2.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
                .uv(38, 7).cuboid(-2.0F, -0.9524F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData RightArm = Body.addChild("RightArm", ModelPartBuilder.create().uv(16, 19).cuboid(-1.5F, -1.5F, -8.75F, 3.0F, 3.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.5F, -22.5F, -1.25F));

        ModelPartData cube_r1 = RightArm.addChild("cube_r1", ModelPartBuilder.create().uv(34, 30).cuboid(-22.0F, 4.0F, -2.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(6, 27).cuboid(-23.0F, 4.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 4).cuboid(-24.0F, 4.0F, -2.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
                .uv(24, 0).cuboid(-24.0F, 5.0F, -2.0F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F))
                .uv(34, 4).cuboid(-23.0F, 5.0F, -2.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(30, 19).cuboid(-22.0F, 5.0F, -2.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
                .uv(24, 6).cuboid(-22.0F, 6.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-23.0F, 6.0F, -2.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
                .uv(30, 24).cuboid(-24.0F, 6.0F, -2.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(5.5F, 22.5F, 1.25F, 0.0F, 0.0F, 1.5708F));

        ModelPartData LeftArm = Body.addChild("LeftArm", ModelPartBuilder.create().uv(24, 8).cuboid(-1.5F, -1.5F, -8.75F, 3.0F, 3.0F, 8.0F, new Dilation(0.0F))
                .uv(35, 33).cuboid(0.5F, -1.5F, -0.75F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(23, 30).cuboid(0.5F, -0.5F, -0.75F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
                .uv(4, 38).cuboid(0.5F, 0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(31, 0).cuboid(-0.5F, 0.5F, -0.75F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
                .uv(28, 6).cuboid(-0.5F, -1.5F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(26, 35).cuboid(-0.5F, -0.5F, -0.75F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(16, 30).cuboid(-1.5F, -0.5F, -0.75F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F))
                .uv(29, 30).cuboid(-1.5F, -1.5F, -0.75F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
                .uv(31, 34).cuboid(-1.5F, 0.5F, -0.75F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(5.5F, -22.5F, -1.25F));

        ModelPartData RightLeg = Body.addChild("RightLeg", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, -13.7792F, 1.5642F));

        ModelPartData cube_r2 = RightLeg.addChild("cube_r2", ModelPartBuilder.create().uv(0, 27).cuboid(-3.0F, -16.0F, 6.75F, 2.0F, 9.0F, 2.0F, new Dilation(-0.01F)), ModelTransform.of(2.0F, 13.7792F, -1.5642F, 0.48F, 0.0F, 0.0F));

        ModelPartData LeftLeg = Body.addChild("LeftLeg", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, -13.7792F, 1.5642F));

        ModelPartData cube_r3 = LeftLeg.addChild("cube_r3", ModelPartBuilder.create().uv(8, 27).cuboid(1.0F, -16.0F, 6.75F, 2.0F, 9.0F, 2.0F, new Dilation(-0.01F)), ModelTransform.of(-2.0F, 13.7792F, -1.5642F, 0.48F, 0.0F, 0.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }
    @Override
    public void setAngles(GhostEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(entity, netHeadYaw, headPitch, ageInTicks);

        this.animateMovement(ModAnimations.GHOST_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.updateAnimation(entity.idleAnimationState, ModAnimations.GHOST_IDLE, ageInTicks, 1f);
    }

    private void setHeadAngles(GhostEntity entity, float headYaw, float headPitch, float animationProgress) {
        headYaw = MathHelper.clamp(headYaw, -25f, 25f);
        headPitch = MathHelper.clamp(headPitch, 0.0f, 0.0f);

        this.Head.yaw = headYaw * 0.017453292F;
        this.Head.pitch = headPitch * 0.017453292F;
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        Ghost.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return Ghost;
    }
}