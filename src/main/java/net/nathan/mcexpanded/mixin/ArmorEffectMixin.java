package net.nathan.mcexpanded.mixin;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.nathan.mcexpanded.effect.ModEffects;
import net.nathan.mcexpanded.item.ModArmorMaterials;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.At;

import java.util.Map;
import com.google.common.collect.ImmutableMap;

@Mixin(ServerPlayerEntity.class)
public class ArmorEffectMixin {

    private static final Map<ArmorMaterial, StatusEffectInstance> MATERIAL_TO_EFFECT_MAP =
            new ImmutableMap.Builder<ArmorMaterial, StatusEffectInstance>()
                    .put(ArmorMaterials.LEATHER, new StatusEffectInstance(ModEffects.LEATHER, 2, 0, false, false, false))
                    .put(ArmorMaterials.CHAIN, new StatusEffectInstance(ModEffects.CHAIN, 2, 0, false, false, false))
                    .put(ModArmorMaterials.HONEY, new StatusEffectInstance(ModEffects.BEE, 2, 0, false, false, false))
                    .put(ModArmorMaterials.SLIME, new StatusEffectInstance(ModEffects.SLIMEY, 2, 0, false, false, false))
                    .put(ModArmorMaterials.PRISMARINE, new StatusEffectInstance(ModEffects.PRISMARINE, 2, 0, false, false, false)).build();

    @Inject(at = @At("HEAD"), method = "tick()V")
    private void onTick(CallbackInfo info) {
        PlayerEntity player = (PlayerEntity) (Object) this;
        if (!player.getWorld().isClient) {
            if (hasFullSuitOfArmorOn(player)) {
                evaluateArmorEffects(player);
            }
        }
    }

    private boolean hasFullSuitOfArmorOn(PlayerEntity player) {
        ItemStack boots = player.getInventory().getArmorStack(0);
        ItemStack leggings = player.getInventory().getArmorStack(1);
        ItemStack chestplate = player.getInventory().getArmorStack(2);
        ItemStack helmet = player.getInventory().getArmorStack(3);

        return !boots.isEmpty() && !leggings.isEmpty() && !chestplate.isEmpty() && !helmet.isEmpty();
    }

    private void evaluateArmorEffects(PlayerEntity player) {
        for (Map.Entry<ArmorMaterial, StatusEffectInstance> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            StatusEffectInstance mapStatusEffect = entry.getValue();

            if (hasCorrectArmorOn(mapArmorMaterial, player)) {
                addStatusEffectForMaterial(player, mapStatusEffect);
                break;
            }
        }
    }

    private void addStatusEffectForMaterial(PlayerEntity player, StatusEffectInstance mapStatusEffect) {
        player.addStatusEffect(new StatusEffectInstance(
                mapStatusEffect.getEffectType(),
                mapStatusEffect.getDuration(),
                mapStatusEffect.getAmplifier(),
                mapStatusEffect.isAmbient(),
                mapStatusEffect.shouldShowParticles(),
                mapStatusEffect.shouldShowIcon()
        ));
    }


    private boolean hasCorrectArmorOn(ArmorMaterial mapArmorMaterial, PlayerEntity player) {
        for (ItemStack armorStack : player.getInventory().armor) {
            if (!(armorStack.getItem() instanceof ArmorItem armorItem) || armorItem.getMaterial() != mapArmorMaterial) {
                return false;
            }
        }
        return true;
    }
}
