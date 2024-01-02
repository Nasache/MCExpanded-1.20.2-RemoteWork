package net.nathan.mcexpanded.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nathan.mcexpanded.MCExpanded;
import net.nathan.mcexpanded.block.ModBlocks;
import net.nathan.mcexpanded.item.custom.LightningBottleItem;

public class ModItems {
    public static final Item COBALT_INGOT = registerItem("cobalt_ingot",
            new Item(new FabricItemSettings()));
    public static final Item RAW_COBALT = registerItem("raw_cobalt",
            new Item(new FabricItemSettings()));
    public static final Item LIGHTNING_BOTTLE = registerItem("lightning_bottle",
            new LightningBottleItem(new FabricItemSettings()));

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(COBALT_INGOT);
        entries.add(RAW_COBALT);
    }
    private static void itemGroupBlocks(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.COBALT_BLOCK);
        entries.add(ModBlocks.RAW_COBALT_BLOCK);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MCExpanded.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MCExpanded.LOGGER.info("Registering Mod Items for " + MCExpanded.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::itemGroupBlocks);
    }
}
