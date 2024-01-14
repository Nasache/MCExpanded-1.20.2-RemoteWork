package net.nathan.mcexpanded.item.custom;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.world.World;
import net.nathan.mcexpanded.effect.ModEffects;
import net.nathan.mcexpanded.item.ModArmorMaterials;

import java.util.Map;

public class ModArmorItem extends ArmorItem {
    private static final Map<ArmorMaterial, StatusEffectInstance> MATERIAL_TO_EFFECT_MAP =
            new ImmutableMap.Builder<ArmorMaterial, StatusEffectInstance>()
                    .put(ArmorMaterials.LEATHER, new StatusEffectInstance(ModEffects.LEATHER, 1, 0, false, false))
                    .put(ArmorMaterials.CHAIN, new StatusEffectInstance(ModEffects.CHAIN, 1, 0, false, false))
                    .put(ModArmorMaterials.PRISMARINE, new StatusEffectInstance(ModEffects.PRISMARINE, 1, 0, false, false)).build();


    public ModArmorItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if(!world.isClient() && entity instanceof PlayerEntity player) {
            if(hasFullSuitOfArmorOn(player)) {
                evaluateArmorEffects(player);
            }
        }

        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private void evaluateArmorEffects(PlayerEntity player) {
        for(Map.Entry<ArmorMaterial, StatusEffectInstance> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            StatusEffectInstance mapStatusEffect = entry.getValue();

            if(hasCorrectArmorOn(mapArmorMaterial, player)) {
                addStatusEffectForMaterial(player, mapStatusEffect);
                break;
            }
        }
    }

    private boolean addStatusEffectForMaterial(PlayerEntity player, StatusEffectInstance mapStatusEffect) {
        boolean hasPlayerEffectAlready = player.hasStatusEffect(mapStatusEffect.getEffectType());

        if(!hasPlayerEffectAlready) {
            player.addStatusEffect(new StatusEffectInstance(mapStatusEffect.getEffectType(),
                    mapStatusEffect.getDuration(), mapStatusEffect.getAmplifier()));
        }
        return hasPlayerEffectAlready;
    }

    private boolean hasCorrectArmorOn(ArmorMaterial mapArmorMaterial, PlayerEntity player) {
        // Check if each armor piece is made of the specified material
        for (ItemStack armorStack : player.getInventory().armor) {
            if (!(armorStack.getItem() instanceof ArmorItem armorItem) || armorItem.getMaterial() != mapArmorMaterial) {
                return false;
            }
        }
        return true;
    }

    private boolean hasFullSuitOfArmorOn(PlayerEntity player) {
        ItemStack boots = player.getInventory().getArmorStack(0);
        ItemStack leggings = player.getInventory().getArmorStack(1);
        ItemStack chestplate = player.getInventory().getArmorStack(2);
        ItemStack helmet = player.getInventory().getArmorStack(3);

        return !boots.isEmpty() && !leggings.isEmpty()
                && !chestplate.isEmpty() && !helmet.isEmpty();
    }
}
