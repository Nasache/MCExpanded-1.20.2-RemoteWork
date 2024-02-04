package net.nathan.mcexpanded.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.nathan.mcexpanded.entity.custom.HarvestSpiritEntity;
import net.minecraft.util.math.MathHelper;
import net.nathan.mcexpanded.entity.animations.ModAnimations;

public class HarvestSpiritModel<T extends HarvestSpiritEntity> extends SinglePartEntityModel<T> {
    private final ModelPart harvestspirit;
    private final ModelPart head;

    public HarvestSpiritModel(ModelPart root) {
        this.harvestspirit = root.getChild("harvestspirit");
        this.head = harvestspirit.getChild("body").getChild("head");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData harvestspirit = modelPartData.addChild("harvestspirit", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData body = harvestspirit.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(0, 32).cuboid(-5.0F, -52.0F, -5.0F, 10.0F, 10.0F, 10.0F, new Dilation(0.0F))
                .uv(40, 32).cuboid(-4.0F, -51.0F, -4.0F, 8.0F, 9.0F, 8.0F, new Dilation(-0.001F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData right_antler = head.addChild("right_antler", ModelPartBuilder.create().uv(38, 71).cuboid(4.0F, -53.0F, 0.0F, 4.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(58, 57).cuboid(5.0F, -51.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(28, 71).cuboid(7.0F, -54.0F, 0.0F, 4.0F, 2.0F, 1.0F, new Dilation(-0.001F))
                .uv(70, 57).cuboid(10.0F, -55.0F, 0.0F, 4.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(72, 65).cuboid(8.0F, -56.0F, 0.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(76, 37).cuboid(7.0F, -57.0F, 0.0F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(78, 24).cuboid(6.0F, -58.0F, 0.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(50, 8).cuboid(9.0F, -59.0F, 0.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(44, 32).cuboid(10.0F, -60.0F, 0.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(12, 61).cuboid(6.0F, -59.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(15, 76).cuboid(13.0F, -56.0F, 0.0F, 3.0F, 2.0F, 1.0F, new Dilation(-0.001F))
                .uv(56, 72).cuboid(16.0F, -55.0F, 0.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(76, 14).cuboid(19.0F, -56.0F, 0.0F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(78, 16).cuboid(21.0F, -57.0F, 0.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(77, 4).cuboid(15.0F, -57.0F, 0.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 77).cuboid(16.0F, -58.0F, 0.0F, 2.0F, 2.0F, 1.0F, new Dilation(-0.001F))
                .uv(22, 78).cuboid(15.0F, -59.0F, 0.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(78, 18).cuboid(14.0F, -60.0F, 0.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(58, 59).cuboid(14.0F, -61.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(74, 76).cuboid(17.0F, -60.0F, 0.0F, 2.0F, 3.0F, 1.0F, new Dilation(0.0F))
                .uv(68, 76).cuboid(18.0F, -62.0F, 0.0F, 2.0F, 3.0F, 1.0F, new Dilation(-0.001F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData left_antler = head.addChild("left_antler", ModelPartBuilder.create().uv(24, 60).cuboid(4.0F, -53.0F, 0.0F, 4.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(16, 54).cuboid(5.0F, -51.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(52, 49).cuboid(7.0F, -54.0F, 0.0F, 4.0F, 2.0F, 1.0F, new Dilation(-0.001F))
                .uv(28, 52).cuboid(10.0F, -55.0F, 0.0F, 4.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(72, 45).cuboid(8.0F, -56.0F, 0.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(72, 67).cuboid(7.0F, -57.0F, 0.0F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(78, 7).cuboid(6.0F, -58.0F, 0.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(41, 0).cuboid(9.0F, -59.0F, 0.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(30, 32).cuboid(10.0F, -60.0F, 0.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(50, 27).cuboid(6.0F, -59.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 6).cuboid(13.0F, -56.0F, 0.0F, 3.0F, 2.0F, 1.0F, new Dilation(-0.001F))
                .uv(30, 40).cuboid(16.0F, -55.0F, 0.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(56, 65).cuboid(19.0F, -56.0F, 0.0F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(76, 47).cuboid(21.0F, -57.0F, 0.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(76, 69).cuboid(15.0F, -57.0F, 0.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(52, 52).cuboid(16.0F, -58.0F, 0.0F, 2.0F, 2.0F, 1.0F, new Dilation(-0.001F))
                .uv(64, 8).cuboid(15.0F, -59.0F, 0.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(14, 52).cuboid(14.0F, -60.0F, 0.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(50, 25).cuboid(14.0F, -61.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(62, 76).cuboid(17.0F, -60.0F, 0.0F, 2.0F, 3.0F, 1.0F, new Dilation(0.0F))
                .uv(76, 29).cuboid(18.0F, -62.0F, 0.0F, 2.0F, 3.0F, 1.0F, new Dilation(-0.001F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.0F, 3.1416F, 0.0F));

        ModelPartData left_arm = body.addChild("left_arm", ModelPartBuilder.create().uv(68, 8).cuboid(12.0F, -31.0F, -3.0F, 4.0F, 4.0F, 2.0F, new Dilation(-0.001F))
                .uv(64, 29).cuboid(11.0F, -32.0F, -2.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F))
                .uv(0, 64).cuboid(10.0F, -33.0F, 0.0F, 4.0F, 4.0F, 4.0F, new Dilation(-0.001F))
                .uv(44, 63).cuboid(8.0F, -34.0F, 1.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F))
                .uv(28, 63).cuboid(5.0F, -35.0F, 2.0F, 4.0F, 4.0F, 4.0F, new Dilation(-0.001F))
                .uv(50, 8).cuboid(1.0F, -36.0F, 3.0F, 5.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -1.0F));

        ModelPartData left_hand = left_arm.addChild("left_hand", ModelPartBuilder.create().uv(0, 52).cuboid(15.0F, -35.0F, -6.0F, 6.0F, 7.0F, 2.0F, new Dilation(0.0F))
                .uv(64, 37).cuboid(15.0F, -28.0F, -6.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(22, 68).cuboid(14.0F, -33.0F, -6.0F, 1.0F, 6.0F, 2.0F, new Dilation(0.0F))
                .uv(49, 77).cuboid(13.0F, -30.0F, -7.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(70, 47).cuboid(14.0F, -37.0F, -8.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(74, 60).cuboid(14.0F, -39.0F, -9.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(8, 72).cuboid(17.0F, -40.0F, -9.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F))
                .uv(34, 74).cuboid(17.0F, -41.0F, -11.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(72, 40).cuboid(17.0F, -37.0F, -8.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F))
                .uv(74, 53).cuboid(20.0F, -37.0F, -9.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(26, 74).cuboid(20.0F, -38.0F, -11.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(54, 74).cuboid(20.0F, -35.0F, -8.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(0, 37).cuboid(11.0F, -30.0F, -12.0F, 2.0F, 2.0F, 3.0F, new Dilation(0.0F))
                .uv(42, 74).cuboid(12.0F, -30.0F, -9.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, 0.0F, 1.0F));

        ModelPartData right_arm = body.addChild("right_arm", ModelPartBuilder.create().uv(66, 14).cuboid(-16.0F, -31.0F, -3.0F, 4.0F, 4.0F, 2.0F, new Dilation(-0.001F))
                .uv(58, 49).cuboid(-15.0F, -32.0F, -2.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F))
                .uv(58, 57).cuboid(-14.0F, -33.0F, 0.0F, 4.0F, 4.0F, 4.0F, new Dilation(-0.001F))
                .uv(12, 60).cuboid(-12.0F, -34.0F, 1.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F))
                .uv(61, 0).cuboid(-9.0F, -35.0F, 2.0F, 4.0F, 4.0F, 4.0F, new Dilation(-0.001F))
                .uv(30, 32).cuboid(-6.0F, -36.0F, 3.0F, 5.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -1.0F));

        ModelPartData right_hand = right_arm.addChild("right_hand", ModelPartBuilder.create().uv(50, 16).cuboid(-4.0F, -35.0F, -6.0F, 6.0F, 7.0F, 2.0F, new Dilation(0.0F))
                .uv(6, 77).cuboid(2.0F, -30.0F, -7.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 32).cuboid(4.0F, -30.0F, -12.0F, 2.0F, 2.0F, 3.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(1.0F, -37.0F, -8.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(57, 0).cuboid(1.0F, -39.0F, -9.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(48, 71).cuboid(-2.0F, -37.0F, -8.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F))
                .uv(0, 72).cuboid(-2.0F, -40.0F, -9.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F))
                .uv(40, 63).cuboid(-5.0F, -35.0F, -8.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(64, 72).cuboid(-5.0F, -37.0F, -9.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(16, 68).cuboid(2.0F, -33.0F, -6.0F, 1.0F, 6.0F, 2.0F, new Dilation(0.0F))
                .uv(0, 61).cuboid(-3.0F, -28.0F, -6.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(72, 72).cuboid(3.0F, -30.0F, -9.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(73, 0).cuboid(-2.0F, -41.0F, -11.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(74, 20).cuboid(-5.0F, -38.0F, -11.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-15.0F, 0.0F, 1.0F));

        ModelPartData torso = body.addChild("torso", ModelPartBuilder.create().uv(2, 2).cuboid(-8.0F, -37.0F, -1.0F, 16.0F, 23.0F, 7.0F, new Dilation(0.002F))
                .uv(34, 49).cuboid(-3.0F, -42.0F, -3.0F, 6.0F, 8.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData neck = torso.addChild("neck", ModelPartBuilder.create().uv(50, 25).cuboid(-2.0F, -44.0F, -1.0F, 4.0F, 3.0F, 4.0F, new Dilation(-0.001F))
                .uv(62, 21).cuboid(-2.0F, -37.0F, 3.0F, 4.0F, 4.0F, 4.0F, new Dilation(-0.001F))
                .uv(41, 0).cuboid(-3.0F, -39.0F, 2.0F, 6.0F, 4.0F, 4.0F, new Dilation(-0.01F))
                .uv(16, 52).cuboid(-2.0F, -41.0F, 1.0F, 4.0F, 4.0F, 4.0F, new Dilation(-0.001F))
                .uv(60, 65).cuboid(-2.0F, -42.0F, 0.0F, 4.0F, 3.0F, 4.0F, new Dilation(-0.001F)), ModelTransform.pivot(0.0F, 0.0F, -1.0F));
        return TexturedModelData.of(modelData, 128, 128);
    }
    @Override
    public void setAngles(HarvestSpiritEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(entity, netHeadYaw, headPitch, ageInTicks);

        this.updateAnimation(entity.idleAnimationState, ModAnimations.HARVEST_SPIRIT_IDLE, ageInTicks, 1f);
    }

    private void setHeadAngles(HarvestSpiritEntity entity, float headYaw, float headPitch, float animationProgress) {
        headYaw = MathHelper.clamp(headYaw, -25f, 25f);
        headPitch = MathHelper.clamp(headPitch, 0.0f, 0.0f);

        this.head.yaw = headYaw * 0.017453292F;
        this.head.pitch = headPitch * 0.017453292F;
    }
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        harvestspirit.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return harvestspirit;
    }
}