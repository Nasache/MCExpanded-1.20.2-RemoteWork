package net.nathan.mcexpanded.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.predicate.StatePredicate;
import net.nathan.mcexpanded.block.ModBlocks;
import net.nathan.mcexpanded.block.custom.BitterBerryBush;
import net.nathan.mcexpanded.block.custom.LeekCropBlock;
import net.nathan.mcexpanded.block.custom.MoonCropBlock;
import net.nathan.mcexpanded.block.custom.SunCropBlock;
import net.nathan.mcexpanded.item.ModItems;

public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
    public ModBlockLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.COBALT_BLOCK);
        addDrop(ModBlocks.RAW_COBALT_BLOCK);
        addDrop(ModBlocks.TEST_BLOCK);

        addDrop(ModBlocks.COBALT_ORE, oreDrops(ModBlocks.COBALT_ORE, ModItems.RAW_COBALT));

        addDrop(ModBlocks.MAPLE_PLANKS);
        addDrop(ModBlocks.MAPLE_LOG);
        addDrop(ModBlocks.MAPLE_WOOD);
        addDrop(ModBlocks.STRIPPED_MAPLE_LOG);
        addDrop(ModBlocks.STRIPPED_MAPLE_WOOD);
        addDrop(ModBlocks.MAPLE_LEAVES, leavesDrops(ModBlocks.MAPLE_LEAVES, Blocks.SPRUCE_SAPLING, .05f));
        addDrop(ModBlocks.MAPLE_STAIRS);
        addDrop(ModBlocks.MAPLE_SLAB, slabDrops(ModBlocks.MAPLE_SLAB));
        addDrop(ModBlocks.MAPLE_BUTTON);
        addDrop(ModBlocks.MAPLE_PRESSURE_PLATE);
        addDrop(ModBlocks.MAPLE_FENCE);
        addDrop(ModBlocks.MAPLE_FENCE_GATE);
        addDrop(ModBlocks.MAPLE_DOOR, doorDrops(ModBlocks.MAPLE_DOOR));
        addDrop(ModBlocks.MAPLE_TRAPDOOR);
        addDrop(ModBlocks.GARDEN_COSMOS);
        addDrop(ModBlocks.GARDEN_COSMOS);
        addDrop(ModBlocks.POTTED_GARDEN_COSMOS, pottedPlantDrops(ModBlocks.GARDEN_COSMOS));
        addDrop(ModBlocks.BLUE_MUSHROOM);
        addDrop(ModBlocks.POTTED_BLUE_MUSHROOM, pottedPlantDrops(ModBlocks.BLUE_MUSHROOM));

        LootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.LEEK_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(LeekCropBlock.AGE, 3));
        this.addDrop(ModBlocks.LEEK_CROP, this.cropDrops(ModBlocks.LEEK_CROP, ModItems.LEEK, ModItems.LEEK_SEEDS, builder2));

        LootCondition.Builder builder3 = BlockStatePropertyLootCondition.builder(ModBlocks.MOON_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(MoonCropBlock.AGE, 5));
        this.addDrop(ModBlocks.MOON_CROP, this.cropDrops(ModBlocks.MOON_CROP, ModItems.MOON_FRUIT, ModItems.MOON_SEEDS, builder3));
        LootCondition.Builder builder4 = BlockStatePropertyLootCondition.builder(ModBlocks.SUN_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(SunCropBlock.AGE, 5));
        this.addDrop(ModBlocks.SUN_CROP, this.cropDrops(ModBlocks.SUN_CROP, ModItems.SUN_FRUIT, ModItems.SUN_SEEDS, builder4));

        LootCondition.Builder builder5 = BlockStatePropertyLootCondition.builder(ModBlocks.BITTER_BERRY_BUSH)
                .properties(StatePredicate.Builder.create().exactMatch(BitterBerryBush.AGE, 3));
        this.addDrop(ModBlocks.BITTER_BERRY_BUSH, this.cropDrops(ModBlocks.BITTER_BERRY_BUSH, ModItems.BITTER_BERRIES, Items.AIR, builder5));
    }
}
