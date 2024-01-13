package net.nathan.mcexpanded.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;


public class PrismarineEffect extends StatusEffect {

    protected PrismarineEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 10, 1));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 10, 3));

        super.applyUpdateEffect(entity, amplifier);
        };

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}