package net.nathan.mcexpanded.util;

import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ActionResult;
import net.nathan.mcexpanded.effect.BeeEffect;

public class ModEventListeners {
    public static void registerEventListeners() {
        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            if (!world.isClient() && entity instanceof LivingEntity) {
                BeeEffect.onEntityHit(player, (LivingEntity) entity);
            }
            return ActionResult.PASS;
        });
    }
}
