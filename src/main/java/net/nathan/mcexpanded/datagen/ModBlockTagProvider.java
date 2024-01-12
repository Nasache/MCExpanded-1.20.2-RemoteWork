package net.nathan.mcexpanded.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.nathan.mcexpanded.block.ModBlocks;
import net.nathan.mcexpanded.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
   public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
       super(output, registriesFuture);
   }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.COBALT_BLOCK,
                        ModBlocks.RAW_COBALT_BLOCK,
                        ModBlocks.COBALT_ORE);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.MAPLE_PLANKS,
                        ModBlocks.MAPLE_STAIRS,
                        ModBlocks.MAPLE_SLAB,
                        ModBlocks.MAPLE_BUTTON,
                        ModBlocks.MAPLE_PRESSURE_PLATE,
                        ModBlocks.MAPLE_FENCE,
                        ModBlocks.MAPLE_FENCE_GATE,
                        ModBlocks.MAPLE_DOOR,
                        ModBlocks.MAPLE_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(ModBlocks.MAPLE_PLANKS);

        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(ModBlocks.RED_MAPLE_LEAVES,
                        ModBlocks.YELLOW_MAPLE_LEAVES);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.COBALT_BLOCK,
                        ModBlocks.RAW_COBALT_BLOCK,
                        ModBlocks.COBALT_ORE);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.MAPLE_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.MAPLE_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.MAPLE_LOG, ModBlocks.MAPLE_WOOD, ModBlocks.STRIPPED_MAPLE_LOG, ModBlocks.STRIPPED_MAPLE_WOOD);

        getOrCreateTagBuilder(ModTags.Blocks.MAPLE_LOGS)
                .add(ModBlocks.MAPLE_LOG, ModBlocks.MAPLE_WOOD, ModBlocks.STRIPPED_MAPLE_LOG, ModBlocks.STRIPPED_MAPLE_WOOD);


        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric","needs_tool_level_4")));
    }
}
