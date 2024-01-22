package net.nathan.mcexpanded.util;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.ComposterBlock;
import net.nathan.mcexpanded.block.ModBlocks;
import net.nathan.mcexpanded.command.ReturnHomeCommand;
import net.nathan.mcexpanded.command.SetHomeCommand;
import net.nathan.mcexpanded.entity.ModEntities;
import net.nathan.mcexpanded.entity.custom.DuckEntity;
import net.nathan.mcexpanded.entity.custom.GhostEntity;
import net.nathan.mcexpanded.event.AttackEntityHandler;
import net.nathan.mcexpanded.event.PlayerCopyHandler;
import net.nathan.mcexpanded.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
        registerModCompostables();
        registerCommands();
        registerEvents();
        registerStrippables();
        registerFlammables();
        registerAttributes();
    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.DUCK, DuckEntity.createDuckAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.GHOST, GhostEntity.createGhostAttributes());
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
        registry.add(ModBlocks.WISTERIA_PLANKS, 300);
        registry.add(ModBlocks.WISTERIA_STAIRS, 300);
        registry.add(ModBlocks.WISTERIA_SLAB, 300);
        registry.add(ModBlocks.WISTERIA_BUTTON, 300);
        registry.add(ModBlocks.WISTERIA_PRESSURE_PLATE, 300);
        registry.add(ModBlocks.WISTERIA_FENCE, 300);
        registry.add(ModBlocks.WISTERIA_FENCE_GATE, 300);
        registry.add(ModBlocks.WISTERIA_DOOR, 300);
        registry.add(ModBlocks.WISTERIA_TRAPDOOR, 300);
        registry.add(ModBlocks.FROST_PINE_PLANKS, 300);
        registry.add(ModBlocks.FROST_PINE_STAIRS, 300);
        registry.add(ModBlocks.FROST_PINE_SLAB, 300);
        registry.add(ModBlocks.FROST_PINE_BUTTON, 300);
        registry.add(ModBlocks.FROST_PINE_PRESSURE_PLATE, 300);
        registry.add(ModBlocks.FROST_PINE_FENCE, 300);
        registry.add(ModBlocks.FROST_PINE_FENCE_GATE, 300);
        registry.add(ModBlocks.FROST_PINE_DOOR, 300);
        registry.add(ModBlocks.FROST_PINE_TRAPDOOR, 300);
    }

    private static void registerModCompostables () {
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.LEEK, 0.65f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.ROASTED_LEEK, 0.85f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.LEEK_SEEDS, 0.3f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.BITTER_BERRIES, 0.3f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.SUN_SEEDS, 0.3f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.SUN_FRUIT, 0.3f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.MOON_SEEDS, 0.3f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.MOON_FRUIT, 0.3f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.RED_MAPLE_SAPLING, 0.3f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.YELLOW_MAPLE_SAPLING, 0.3f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.WISTERIA_SAPLING, 0.3f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.FROST_PINE_SAPLING, 0.3f);
    }

    private static void registerFlammables() {
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAPLE_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAPLE_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_MAPLE_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_MAPLE_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAPLE_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_MAPLE_LEAVES, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YELLOW_MAPLE_LEAVES, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WISTERIA_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WISTERIA_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_WISTERIA_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_WISTERIA_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FROST_PINE_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FROST_PINE_LEAVES, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FROST_PINE_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FROST_PINE_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_FROST_PINE_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_FROST_PINE_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FROST_PINE_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FROST_PINE_LEAVES, 30, 60);
    }

    private static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.MAPLE_LOG, ModBlocks.STRIPPED_MAPLE_LOG);
        StrippableBlockRegistry.register(ModBlocks.MAPLE_WOOD, ModBlocks.STRIPPED_MAPLE_WOOD);
        StrippableBlockRegistry.register(ModBlocks.WISTERIA_LOG, ModBlocks.STRIPPED_WISTERIA_LOG);
        StrippableBlockRegistry.register(ModBlocks.WISTERIA_WOOD, ModBlocks.STRIPPED_WISTERIA_WOOD);
        StrippableBlockRegistry.register(ModBlocks.FROST_PINE_LOG, ModBlocks.STRIPPED_FROST_PINE_LOG);
        StrippableBlockRegistry.register(ModBlocks.FROST_PINE_WOOD, ModBlocks.STRIPPED_FROST_PINE_WOOD);
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
