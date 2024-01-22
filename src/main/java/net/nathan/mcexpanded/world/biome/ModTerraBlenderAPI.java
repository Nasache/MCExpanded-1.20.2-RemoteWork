package net.nathan.mcexpanded.world.biome;

import net.minecraft.util.Identifier;
import net.nathan.mcexpanded.MCExpanded;
import terrablender.api.Regions;
import terrablender.api.TerraBlenderApi;

public class ModTerraBlenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ModOverworldRegion(new Identifier(MCExpanded.MOD_ID, "overworld"), 10));
    }
}
