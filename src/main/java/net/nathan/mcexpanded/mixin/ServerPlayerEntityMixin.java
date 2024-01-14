package net.nathan.mcexpanded.mixin;

import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.server.network.ServerPlayerEntity;
import net.nathan.mcexpanded.effect.ModEffects;
import net.nathan.mcexpanded.effect.PrismarineEffect;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ServerPlayerEntity.class)
public class ServerPlayerEntityMixin {
    @Inject(method = "tick", at = @At("HEAD"))
    private void onTick(CallbackInfo info) {
        ServerPlayerEntity player = (ServerPlayerEntity)(Object)this;
        if (!player.hasStatusEffect(ModEffects.PRISMARINE)) {
            // If the player no longer has the effect, remove the attack boost
            if (player.getAttributes().hasModifierForAttribute(EntityAttributes.GENERIC_ATTACK_DAMAGE, PrismarineEffect.ATTACK_BOOST_ID)) {
                player.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).removeModifier(PrismarineEffect.ATTACK_BOOST_ID);
            }
        }
    }
}
