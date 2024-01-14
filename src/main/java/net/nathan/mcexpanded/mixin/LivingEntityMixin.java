package net.nathan.mcexpanded.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.SwordItem;
import net.nathan.mcexpanded.effect.ModEffects;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {

    @ModifyArg(method = "handleFallDamage", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/LivingEntity;computeFallDamage(FF)I"), index = 0)
    private float modifyFallDistance(float fallDistance) {
        LivingEntity entity = (LivingEntity) (Object) this;
        if (entity.hasStatusEffect(ModEffects.LEATHER)) {
            // Halve the fall damage
            return fallDistance * 0.5f;
        }
        return fallDistance;
    }

    @Inject(method = "handleFallDamage", at = @At("HEAD"), cancellable = true)
    private void onHandleFallDamage(float fallDistance, float damageMultiplier, DamageSource damageSource, CallbackInfoReturnable<Boolean> info) {
        // This method is kept for potential additional modifications or checks
    }

    @Unique
    private boolean reducedSwordDamage = false;

    @Inject(method = "damage", at = @At("HEAD"), cancellable = true)
    private void onDamage(DamageSource source, float amount, CallbackInfoReturnable<Boolean> info) {
        LivingEntity entity = (LivingEntity) (Object) this;
        if (!reducedSwordDamage && source.getSource() instanceof LivingEntity) {
            LivingEntity attacker = (LivingEntity) source.getSource();
            if (attacker.getMainHandStack().getItem() instanceof SwordItem) {
                if (entity.hasStatusEffect(ModEffects.CHAIN)) {
                    // Halve the damage from swords and prevent recursion
                    reducedSwordDamage = true;
                    entity.damage(source, amount * 0.35f);
                    reducedSwordDamage = false;
                    info.cancel();
                }
            }
        }
    }
}
