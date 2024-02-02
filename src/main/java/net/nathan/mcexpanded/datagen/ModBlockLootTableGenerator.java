package net.nathan.mcexpanded.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.predicate.StatePredicate;
import net.nathan.mcexpanded.block.ModBlocks;
import net.nathan.mcexpanded.block.custom.*;
import net.nathan.mcexpanded.item.ModItems;

public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
    public ModBlockLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    public LootTable.Builder snowGrassDrops(Block dropWithShears) {
        return dropsWithShears(dropWithShears, (LootPoolEntry.Builder)this.applyExplosionDecay(dropWithShears, ((LeafEntry.Builder)ItemEntry.builder(ModItems.SNOW_LEAF_SEEDS).conditionally(RandomChanceLootCondition.builder(0.125F))).apply(ApplyBonusLootFunction.uniformBonusCount(Enchantments.FORTUNE, 2))));
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.COBALT_BLOCK);
        addDrop(ModBlocks.RAW_COBALT_BLOCK);
        addDrop(ModBlocks.TEST_BLOCK);

        addDrop(ModBlocks.COBALT_ORE, oreDrops(ModBlocks.COBALT_ORE, ModItems.RAW_COBALT));
        addDrop(ModBlocks.DEEPSLATE_COBALT_ORE, oreDrops(ModBlocks.DEEPSLATE_COBALT_ORE, ModItems.RAW_COBALT));

        addDrop(ModBlocks.MAPLE_PLANKS);
        addDrop(ModBlocks.MAPLE_LOG);
        addDrop(ModBlocks.MAPLE_WOOD);
        addDrop(ModBlocks.STRIPPED_MAPLE_LOG);
        addDrop(ModBlocks.STRIPPED_MAPLE_WOOD);
        addDrop(ModBlocks.RED_MAPLE_LEAVES, leavesDrops(ModBlocks.RED_MAPLE_LEAVES, ModBlocks.RED_MAPLE_SAPLING, .05f));
        addDrop(ModBlocks.YELLOW_MAPLE_LEAVES, leavesDrops(ModBlocks.YELLOW_MAPLE_LEAVES, ModBlocks.YELLOW_MAPLE_SAPLING, .05f));
        addDrop(ModBlocks.MAPLE_STAIRS);
        addDrop(ModBlocks.MAPLE_SLAB, slabDrops(ModBlocks.MAPLE_SLAB));
        addDrop(ModBlocks.MAPLE_BUTTON);
        addDrop(ModBlocks.MAPLE_PRESSURE_PLATE);
        addDrop(ModBlocks.MAPLE_FENCE);
        addDrop(ModBlocks.MAPLE_FENCE_GATE);
        addDrop(ModBlocks.MAPLE_DOOR, doorDrops(ModBlocks.MAPLE_DOOR));
        addDrop(ModBlocks.MAPLE_TRAPDOOR);
        addDrop(ModBlocks.MAPLE_SIGN);
        addDrop(ModBlocks.MAPLE_WALL_SIGN);
        addDrop(ModBlocks.MAPLE_HANGING_SIGN);
        addDrop(ModBlocks.MAPLE_WALL_HANGING_SIGN);
        addDrop(ModBlocks.RED_MAPLE_SAPLING);
        addDrop(ModBlocks.POTTED_RED_MAPLE_SAPLING, pottedPlantDrops(ModBlocks.RED_MAPLE_SAPLING));
        addDrop(ModBlocks.YELLOW_MAPLE_SAPLING);
        addDrop(ModBlocks.POTTED_YELLOW_MAPLE_SAPLING, pottedPlantDrops(ModBlocks.YELLOW_MAPLE_SAPLING));

        addDrop(ModBlocks.WISTERIA_PLANKS);
        addDrop(ModBlocks.WISTERIA_LOG);
        addDrop(ModBlocks.WISTERIA_WOOD);
        addDrop(ModBlocks.STRIPPED_WISTERIA_LOG);
        addDrop(ModBlocks.STRIPPED_WISTERIA_WOOD);
        addDrop(ModBlocks.WISTERIA_LEAVES, leavesDrops(ModBlocks.WISTERIA_LEAVES, ModBlocks.WISTERIA_SAPLING, .05f));
        addDrop(ModBlocks.WISTERIA_STAIRS);
        addDrop(ModBlocks.WISTERIA_SLAB, slabDrops(ModBlocks.WISTERIA_SLAB));
        addDrop(ModBlocks.WISTERIA_BUTTON);
        addDrop(ModBlocks.WISTERIA_PRESSURE_PLATE);
        addDrop(ModBlocks.WISTERIA_FENCE);
        addDrop(ModBlocks.WISTERIA_FENCE_GATE);
        addDrop(ModBlocks.WISTERIA_DOOR, doorDrops(ModBlocks.WISTERIA_DOOR));
        addDrop(ModBlocks.WISTERIA_TRAPDOOR);
        addDrop(ModBlocks.WISTERIA_SIGN);
        addDrop(ModBlocks.WISTERIA_WALL_SIGN);
        addDrop(ModBlocks.WISTERIA_HANGING_SIGN);
        addDrop(ModBlocks.WISTERIA_WALL_HANGING_SIGN);
        addDrop(ModBlocks.WISTERIA_SAPLING);
        addDrop(ModBlocks.POTTED_WISTERIA_SAPLING, pottedPlantDrops(ModBlocks.WISTERIA_SAPLING));

        addDrop(ModBlocks.FROST_PINE_PLANKS);
        addDrop(ModBlocks.FROST_PINE_LOG);
        addDrop(ModBlocks.FROST_PINE_WOOD);
        addDrop(ModBlocks.STRIPPED_FROST_PINE_LOG);
        addDrop(ModBlocks.STRIPPED_FROST_PINE_WOOD);
        addDrop(ModBlocks.FROST_PINE_LEAVES, leavesDrops(ModBlocks.FROST_PINE_LEAVES, ModBlocks.FROST_PINE_SAPLING, .05f));
        addDrop(ModBlocks.FROST_PINE_STAIRS);
        addDrop(ModBlocks.FROST_PINE_SLAB, slabDrops(ModBlocks.FROST_PINE_SLAB));
        addDrop(ModBlocks.FROST_PINE_BUTTON);
        addDrop(ModBlocks.FROST_PINE_PRESSURE_PLATE);
        addDrop(ModBlocks.FROST_PINE_FENCE);
        addDrop(ModBlocks.FROST_PINE_FENCE_GATE);
        addDrop(ModBlocks.FROST_PINE_DOOR, doorDrops(ModBlocks.FROST_PINE_DOOR));
        addDrop(ModBlocks.FROST_PINE_TRAPDOOR);
        addDrop(ModBlocks.FROST_PINE_SIGN);
        addDrop(ModBlocks.FROST_PINE_WALL_SIGN);
        addDrop(ModBlocks.FROST_PINE_HANGING_SIGN);
        addDrop(ModBlocks.FROST_PINE_WALL_HANGING_SIGN);
        addDrop(ModBlocks.FROST_PINE_SAPLING);
        addDrop(ModBlocks.POTTED_FROST_PINE_SAPLING, pottedPlantDrops(ModBlocks.FROST_PINE_SAPLING));


        addDrop(ModBlocks.SNOW_BRICKS);
        addDrop(ModBlocks.CHISELED_SNOW_BRICKS);
        addDrop(ModBlocks.SNOW_BRICK_STAIRS);
        addDrop(ModBlocks.SNOW_BRICK_SLAB, slabDrops(ModBlocks.SNOW_BRICK_SLAB));
        addDrop(ModBlocks.SNOW_BRICK_BUTTON);
        addDrop(ModBlocks.SNOW_BRICK_PRESSURE_PLATE);
        addDrop(ModBlocks.SNOW_BRICK_WALL);

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

        LootCondition.Builder builder6 = BlockStatePropertyLootCondition.builder(ModBlocks.FROST_BERRY_BUSH)
                .properties(StatePredicate.Builder.create().exactMatch(FrostBerryBush.AGE, 3));
        this.addDrop(ModBlocks.FROST_BERRY_BUSH, this.cropDrops(ModBlocks.FROST_BERRY_BUSH, ModItems.FROST_BERRIES, Items.AIR, builder6));

        addDrop(ModBlocks.FROST_BUD_BLOCK);
        addDrop(ModBlocks.SNOW_GRASS, snowGrassDrops(ModBlocks.SNOW_GRASS));
        addDrop(ModBlocks.ICE_CRYSTAL, drops(ModItems.ICE_CRYSTAL));

        LootCondition.Builder builder7 = BlockStatePropertyLootCondition.builder(ModBlocks.SNOW_LEAF_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(SnowLeafCropBlock.AGE, 3));
        this.addDrop(ModBlocks.SNOW_LEAF_CROP, this.cropDrops(ModBlocks.SNOW_LEAF_CROP, ModItems.SNOW_LEAF, ModItems.SNOW_LEAF_SEEDS, builder7));
    }
}
