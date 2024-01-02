package net.nathan.mcexpanded;

import net.fabricmc.api.ModInitializer;

import net.nathan.mcexpanded.block.ModBlocks;
import net.nathan.mcexpanded.item.ModItemGroup;
import net.nathan.mcexpanded.item.ModItems;
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
	}
}