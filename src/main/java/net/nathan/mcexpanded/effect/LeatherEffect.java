package net.nathan.mcexpanded.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.LivingEntity;

public class LeatherEffect extends StatusEffect {

    public LeatherEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        // This effect doesn't need to tick every few seconds, so we return false.
        return false;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        // This is where you would put the logic for effects that need to update regularly.
        // Since we don't need regular updates, this is left empty.
    }
}
