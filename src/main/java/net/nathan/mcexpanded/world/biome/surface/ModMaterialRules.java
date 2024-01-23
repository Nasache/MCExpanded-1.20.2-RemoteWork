package net.nathan.mcexpanded.world.biome.surface;

import net.nathan.mcexpanded.world.biome.ModBiomes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class ModMaterialRules {
    private static final MaterialRules.MaterialRule SNOW = makeStateRule(Blocks.SNOW_BLOCK);
    private static final MaterialRules.MaterialRule ICE = makeStateRule(Blocks.BLUE_ICE);

    private static final MaterialRules.MaterialRule SAND = makeStateRule(Blocks.SAND);
    private static final MaterialRules.MaterialRule SANDSTONE = makeStateRule(Blocks.SANDSTONE);

    public static MaterialRules.MaterialRule makeRules() {
        MaterialRules.MaterialCondition isSnowyCaves = MaterialRules.biome(ModBiomes.SNOWY_CAVES);
        MaterialRules.MaterialRule snowyCavesSurface = MaterialRules.sequence(
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH, SNOW),
                MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING_WITH_SURFACE_DEPTH, ICE)
        );

        MaterialRules.MaterialCondition isSandyCaves = MaterialRules.biome(ModBiomes.SANDY_CAVES);
        MaterialRules.MaterialRule sandyCavesSurface = MaterialRules.sequence(
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH, SAND),
                MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING_WITH_SURFACE_DEPTH, SANDSTONE)
        );

        return MaterialRules.sequence(
                MaterialRules.condition(isSnowyCaves, snowyCavesSurface),
                MaterialRules.condition(isSandyCaves, sandyCavesSurface)

        );
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}
