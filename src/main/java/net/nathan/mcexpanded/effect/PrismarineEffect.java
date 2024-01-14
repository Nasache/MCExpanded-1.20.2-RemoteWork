package net.nathan.mcexpanded.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

import java.util.UUID;

public class PrismarineEffect extends StatusEffect {
    public static final UUID ATTACK_BOOST_ID = UUID.fromString("f056a1b1-1dcd-4a9e-8b3c-3a2f07b68d90");
    private static final double ATTACK_BOOST_AMOUNT = 3.0; // Adjust as needed for strength boost

    protected PrismarineEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity.isSubmergedInWater() && entity.hasStatusEffect(this)) {
            entity.setAir(entity.getMaxAir());

            // Apply attack boost if not already applied
            if (!entity.getAttributes().hasModifierForAttribute(EntityAttributes.GENERIC_ATTACK_DAMAGE, ATTACK_BOOST_ID)) {
                EntityAttributeModifier attackModifier = new EntityAttributeModifier(ATTACK_BOOST_ID, "Prismarine attack boost", ATTACK_BOOST_AMOUNT, EntityAttributeModifier.Operation.ADDITION);
                entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).addTemporaryModifier(attackModifier);
            }
        } else {
            // Remove attack boost when not underwater or effect is lost
            removeAttackBoost(entity);
        }
    }

    private void removeAttackBoost(LivingEntity entity) {
        if (entity.getAttributes().hasModifierForAttribute(EntityAttributes.GENERIC_ATTACK_DAMAGE, ATTACK_BOOST_ID)) {
            entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).removeModifier(ATTACK_BOOST_ID);
        }
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true; // This makes the effect update every game tick
    }
}
