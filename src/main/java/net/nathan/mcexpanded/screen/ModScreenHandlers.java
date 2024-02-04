package net.nathan.mcexpanded.screen;


import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.screen.ArrayPropertyDelegate;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.nathan.mcexpanded.MCExpanded;

public class ModScreenHandlers {
    public static final ScreenHandlerType<FletchingTableScreenHandler> FLETCHING_TABLE_SCREEN_HANDLER =
            ScreenHandlerRegistry.registerSimple(new Identifier("mcexpanded", "fletching_table"),
                    (syncId, inventory) -> new FletchingTableScreenHandler(syncId, inventory, new SimpleInventory(4), new ArrayPropertyDelegate(2)));



    public static void registerScreenHandler() {
        MCExpanded.LOGGER.info("Registering Screen Handlers for " + MCExpanded.MOD_ID);
    }
}