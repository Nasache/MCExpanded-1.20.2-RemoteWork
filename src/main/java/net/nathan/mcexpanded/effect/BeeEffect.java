package net.nathan.mcexpanded.effect;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.nathan.mcexpanded.effect.ModEffects;

public class BeeEffect extends StatusEffect {

    public BeeEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    // ... [rest of your existing code] ...

    // Override the applyUpdateEffect method
    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entity;
            // Ensuring the player's hunger does not drop below 7
            if (player.getHungerManager().getFoodLevel() < 7) {
                player.getHungerManager().setFoodLevel(7);
            }
        }
    }

    // This method determines if the status effect should be applied every tick
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        // Apply effect every tick
        return true;
    }
    public static void onEntityHit(PlayerEntity player, LivingEntity target) {
        if (player.hasStatusEffect(ModEffects.BEE)) {
            if (isUndeadEntity(target)) {
                // Applying wither effect for 5 seconds (100 ticks), with level 1 (amplifier 0)
                target.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 100, 1));
            } else {
                // Applying poison effect for 5 seconds (100 ticks), with level 1 (amplifier 0)
                target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 100, 1));
            }
        }
    }

    // Helper method to determine if an entity is undead
    private static boolean isUndeadEntity(LivingEntity entity) {
        EntityType<?> entityType = entity.getType();
        return entityType == EntityType.ZOMBIE ||
                entityType == EntityType.SKELETON ||
                entityType == EntityType.STRAY ||
                entityType == EntityType.HUSK ||
                entityType == EntityType.ZOMBIE_VILLAGER ||
                entityType == EntityType.PHANTOM ||
                entityType == EntityType.DROWNED ||
                entityType == EntityType.ZOGLIN;
    }
}
