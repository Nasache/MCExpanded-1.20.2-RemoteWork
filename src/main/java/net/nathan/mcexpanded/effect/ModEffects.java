package net.nathan.mcexpanded.effect;

import net.minecraft.entity.Entity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.network.packet.s2c.custom.DebugBeeCustomPayload;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nathan.mcexpanded.MCExpanded;

public class ModEffects {

    public static final StatusEffect SLIMEY = registerStatusEffect("slimey",
            new SlimeyEffect(StatusEffectCategory.BENEFICIAL, 0x36ebab).addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED,
                    "7107DE5E-7CE8-4030-940E-514C1F160890", -0.25f, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
    public static final StatusEffect PRISMARINE = registerStatusEffect("prismarine",
            new PrismarineEffect(StatusEffectCategory.BENEFICIAL, 0xffffff));
    public static final StatusEffect LEATHER = registerStatusEffect("leather",
            new LeatherEffect(StatusEffectCategory.BENEFICIAL, 0xffffff));
    public static final StatusEffect CHAIN = registerStatusEffect("chain",
            new ChainEffect(StatusEffectCategory.BENEFICIAL, 0xffffff));
    public static final StatusEffect BEE = registerStatusEffect("bee",
            new BeeEffect(StatusEffectCategory.BENEFICIAL, 0xffffff));



    
    private static StatusEffect registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(MCExpanded.MOD_ID, name), statusEffect);
    }
    public static void registerEffects() {
        MCExpanded.LOGGER.info("Registering Mod Effects for " + MCExpanded.MOD_ID);
    }
}
