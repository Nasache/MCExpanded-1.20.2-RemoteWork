package net.nathan.mcexpanded;

import net.fabricmc.api.ModInitializer;

import net.nathan.mcexpanded.block.ModBlocks;
import net.nathan.mcexpanded.block.entity.ModBlockEntities;
import net.nathan.mcexpanded.effect.ModEffects;
import net.nathan.mcexpanded.enchantment.ModEnchantments;
import net.nathan.mcexpanded.entity.ModEntities;
import net.nathan.mcexpanded.item.ModItemGroup;
import net.nathan.mcexpanded.item.ModItems;
import net.nathan.mcexpanded.screen.ModScreenHandlers;
import net.nathan.mcexpanded.sound.ModSounds;
import net.nathan.mcexpanded.util.ModEventListeners;
import net.nathan.mcexpanded.util.ModLootTableModifiers;
import net.nathan.mcexpanded.util.ModRegistries;
import net.nathan.mcexpanded.world.gen.ModWorldGeneration;
import net.nathan.mcexpanded.world.tree.ModFoliagePlacerTypes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCExpanded implements ModInitializer {
	public static final String MOD_ID = "mcexpanded";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();
		ModEnchantments.registerModEnchantments();

		ModSounds.registerSounds();

		ModLootTableModifiers.modifyLootTables();
		ModEffects.registerEffects();

		ModBlockEntities.registerBlockEntities();
		ModWorldGeneration.generateModWorldGeneration();

		ModFoliagePlacerTypes.register();
		ModEventListeners.registerEventListeners();

		ModEntities.registerModEntities();
		ModScreenHandlers.registerScreenHandler();


	}
}