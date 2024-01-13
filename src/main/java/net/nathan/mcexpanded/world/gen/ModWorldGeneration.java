package net.nathan.mcexpanded.world.gen;

import net.nathan.mcexpanded.world.ModOrePlacement;

public class ModWorldGeneration {
    public static void generateModWorldGeneration() {
        ModOreGeneration.generateOres();

        ModTreeGeneration.generateTrees();
    }
}