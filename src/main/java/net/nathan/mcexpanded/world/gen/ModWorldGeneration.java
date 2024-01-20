package net.nathan.mcexpanded.world.gen;

import net.nathan.mcexpanded.entity.ModEntities;
import net.nathan.mcexpanded.world.ModOrePlacement;

public class ModWorldGeneration {
    public static void generateModWorldGeneration() {
        ModGeodeGeneration.generateGeodes();

        ModOreGeneration.generateOres();

        ModTreeGeneration.generateTrees();

        ModFlowerGeneration.generateFlowers();

        ModEntitySpawns.addSpawns();
    }
}