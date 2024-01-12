package net.nathan.mcexpanded.world.tree;

import net.nathan.mcexpanded.MCExpanded;
import net.nathan.mcexpanded.mixin.FoliagePlacerTypeInvoker;
import net.nathan.mcexpanded.world.tree.custom.MapleFoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class ModFoliagePlacerTypes {
    public static final FoliagePlacerType<?> MAPLE_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister(
            "maple_foliage_placer", MapleFoliagePlacer.CODEC);

    public static void register() {
        MCExpanded.LOGGER.info("Registering the Foliage Placers for " + MCExpanded.MOD_ID);
    }
}