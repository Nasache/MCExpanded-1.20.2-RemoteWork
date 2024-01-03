package net.nathan.mcexpanded.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nathan.mcexpanded.MCExpanded;

public class ModEnchantments {

    public static final Enchantment LIGHTNING_STRIKER = register("lightning_striker",
        new LightningStrikerEnchantment(Enchantment.Rarity.UNCOMMON,
                EnchantmentTarget.BOW));

    public static final Enchantment EXPLOSIVE = register("explosive",
            new ExplosiveEnchantment(Enchantment.Rarity.UNCOMMON,
                    EnchantmentTarget.BOW));

    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registries.ENCHANTMENT, new Identifier(MCExpanded.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {
        MCExpanded.LOGGER.info("Registering ModEnchantments for " + MCExpanded.MOD_ID);
    }
}
