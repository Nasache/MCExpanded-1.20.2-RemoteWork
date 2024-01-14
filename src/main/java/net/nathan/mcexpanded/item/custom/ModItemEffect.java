package net.nathan.mcexpanded.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.nathan.mcexpanded.effect.ModEffects;
import net.nathan.mcexpanded.item.ModItems;

public class ModItemEffect extends Item {

    public ModItemEffect(Settings settings) {
        super(settings);
        // Register the event listener
        ServerPlayerEvents.ALLOW_DEATH.register(this::onPlayerDeath);
    }

    private boolean onPlayerDeath(ServerPlayerEntity player, DamageSource source, float amount) {
        ItemStack totemStack = null;
        if (player.getMainHandStack().getItem() == ModItems.SLIME_TOTEM || player.getOffHandStack().getItem() == ModItems.SLIME_TOTEM) {
            totemStack = player.getMainHandStack().getItem() == ModItems.SLIME_TOTEM ? player.getMainHandStack() : player.getOffHandStack();
        } else if (player.getMainHandStack().getItem() == ModItems.HONEY_TOTEM || player.getOffHandStack().getItem() == ModItems.HONEY_TOTEM) {
            totemStack = player.getMainHandStack().getItem() == ModItems.HONEY_TOTEM ? player.getMainHandStack() : player.getOffHandStack();
        } else if (player.getMainHandStack().getItem() ==
                ModItems.PRISMARINE_TOTEM || player.getOffHandStack().getItem() == ModItems.PRISMARINE_TOTEM) {
            totemStack = player.getMainHandStack().getItem() == ModItems.PRISMARINE_TOTEM ? player.getMainHandStack() : player.getOffHandStack();
        }

        if (totemStack != null) {
            // Consume the totem
            totemStack.decrement(1);

            // Set player health to 1 heart
            player.setHealth(1.0F);
            // Clear existing negative effects
            player.clearStatusEffects();
            // Add standard totem effects: 40 seconds of Regeneration II and 5 seconds of Absorption II
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 800, 1));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 100, 1));
            // Emit totem using sound and particles (if applicable)
            // Play Totem of Undying sound effect
            player.getWorld().playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_TOTEM_USE, SoundCategory.PLAYERS, 1.0F, 1.0F);

            // Trigger Totem of Undying animation
            player.getWorld().sendEntityStatus(player, (byte) 35);

            // Cancel the death event
            return false;
        }
        return true;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient() && entity instanceof PlayerEntity player) {
            // Check if the player is holding the specific item in either hand
            if (player.getMainHandStack().getItem() == ModItems.SLIME_TOTEM || player.getOffHandStack().getItem() == ModItems.SLIME_TOTEM) {
                // Apply a status effect to the player
                player.addStatusEffect(new StatusEffectInstance(ModEffects.SLIMEY, 1, 0, false, false, true));
            } if (player.getMainHandStack().getItem() == ModItems.HONEY_TOTEM || player.getOffHandStack().getItem() == ModItems.HONEY_TOTEM) {
                // Apply a status effect to the player
                player.addStatusEffect(new StatusEffectInstance(ModEffects.BEE, 10, 0, false, false, true));
            } if (player.getMainHandStack().getItem() == ModItems.PRISMARINE_TOTEM || player.getOffHandStack().getItem() == ModItems.PRISMARINE_TOTEM) {
                // Apply a status effect to the player
                player.addStatusEffect(new StatusEffectInstance(ModEffects.PRISMARINE, 1, 0, false, false, true));
            }
        }

        super.inventoryTick(stack, world, entity, slot, selected);
    }
}
