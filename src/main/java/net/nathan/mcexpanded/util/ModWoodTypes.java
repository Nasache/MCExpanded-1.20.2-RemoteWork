package net.nathan.mcexpanded.util;

import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeRegistry;
import net.nathan.mcexpanded.MCExpanded;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

public class ModWoodTypes {
    public static final WoodType MAPLE = WoodTypeRegistry.register(new Identifier(MCExpanded.MOD_ID, "maple"), BlockSetType.OAK);
    public static final WoodType WISTERIA = WoodTypeRegistry.register(new Identifier(MCExpanded.MOD_ID, "wisteria"), BlockSetType.OAK);
    public static final WoodType FROST_PINE = WoodTypeRegistry.register(new Identifier(MCExpanded.MOD_ID, "frost_pine"), BlockSetType.SPRUCE);
}