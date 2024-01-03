package net.nathan.mcexpanded.util;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.ComposterBlock;
import net.minecraft.command.CommandRegistryAccess;
import net.nathan.mcexpanded.block.ModBlocks;
import net.nathan.mcexpanded.command.ReturnHomeCommand;
import net.nathan.mcexpanded.command.SetHomeCommand;
import net.nathan.mcexpanded.event.AttackEntityHandler;
import net.nathan.mcexpanded.event.PlayerCopyHandler;
import net.nathan.mcexpanded.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
        registerModCompostables();
        registerCommands();
        registerEvents();
    }

    private static void registerFuels() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModBlocks.MAPLE_PLANKS, 300);
        registry.add(ModBlocks.MAPLE_STAIRS, 300);
        registry.add(ModBlocks.MAPLE_SLAB, 300);
        registry.add(ModBlocks.MAPLE_BUTTON, 300);
        registry.add(ModBlocks.MAPLE_PRESSURE_PLATE, 300);
        registry.add(ModBlocks.MAPLE_FENCE, 300);
        registry.add(ModBlocks.MAPLE_FENCE_GATE, 300);
        registry.add(ModBlocks.MAPLE_DOOR, 300);
        registry.add(ModBlocks.MAPLE_TRAPDOOR, 300);
    }

    private static void registerModCompostables () {
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.LEEK, 0.65f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.ROASTED_LEEK, 0.85f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.LEEK_SEEDS, 0.3f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.BITTER_BERRIES, 0.3f);
    }

    private static void registerCommands() {
        CommandRegistrationCallback.EVENT.register(SetHomeCommand::register);
        CommandRegistrationCallback.EVENT.register(ReturnHomeCommand::register);
    }

    private static void registerEvents() {
        AttackEntityCallback.EVENT.register(new AttackEntityHandler());
        ServerPlayerEvents.COPY_FROM.register(new PlayerCopyHandler());
    }
}
