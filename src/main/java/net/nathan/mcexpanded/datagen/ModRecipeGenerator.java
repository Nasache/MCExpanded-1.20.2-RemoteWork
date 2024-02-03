package net.nathan.mcexpanded.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.nathan.mcexpanded.block.ModBlocks;
import net.nathan.mcexpanded.item.ModItems;
import net.nathan.mcexpanded.util.ModTags;

import java.util.List;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generate(RecipeExporter exporter) {

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.COBALT_INGOT, RecipeCategory.MISC, ModBlocks.COBALT_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_COBALT, RecipeCategory.MISC, ModBlocks.RAW_COBALT_BLOCK);

        offerSmelting(exporter, List.of(ModItems.RAW_COBALT, ModBlocks.COBALT_ORE, ModBlocks.DEEPSLATE_COBALT_ORE), RecipeCategory.MISC, ModItems.COBALT_INGOT, 0.7f, 200, "cobalt_ingot");
        offerBlasting(exporter, List.of(ModItems.RAW_COBALT, ModBlocks.COBALT_ORE, ModBlocks.DEEPSLATE_COBALT_ORE), RecipeCategory.MISC, ModItems.COBALT_INGOT, 0.7f, 100, "cobalt_ingot");

        offerPlanksRecipe(exporter, ModBlocks.MAPLE_PLANKS, ModTags.Items.MAPLE_LOGS, 4);

        offerBarkBlockRecipe(exporter, ModBlocks.MAPLE_WOOD, ModBlocks.MAPLE_LOG);
        offerBarkBlockRecipe(exporter, ModBlocks.STRIPPED_MAPLE_WOOD, ModBlocks.STRIPPED_MAPLE_LOG);

        createStairsRecipe(ModBlocks.MAPLE_STAIRS, Ingredient.ofItems(ModBlocks.MAPLE_PLANKS))
                .criterion(hasItem(ModBlocks.MAPLE_PLANKS), conditionsFromItem(ModBlocks.MAPLE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAPLE_STAIRS)));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAPLE_SLAB, Ingredient.ofItems(ModBlocks.MAPLE_PLANKS))
                .criterion(hasItem(ModBlocks.MAPLE_PLANKS), conditionsFromItem(ModBlocks.MAPLE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAPLE_SLAB)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.MAPLE_BUTTON)
                .input(ModBlocks.MAPLE_PLANKS)
                .criterion(hasItem(ModBlocks.MAPLE_PLANKS), conditionsFromItem(ModBlocks.MAPLE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAPLE_BUTTON)));

        createFenceRecipe(ModBlocks.MAPLE_FENCE, Ingredient.ofItems(ModBlocks.MAPLE_PLANKS))
                .criterion(hasItem(ModBlocks.MAPLE_PLANKS), conditionsFromItem(ModBlocks.MAPLE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAPLE_FENCE)));
        createFenceGateRecipe(ModBlocks.MAPLE_FENCE_GATE, Ingredient.ofItems(ModBlocks.MAPLE_PLANKS))
                .criterion(hasItem(ModBlocks.MAPLE_PLANKS), conditionsFromItem(ModBlocks.MAPLE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAPLE_FENCE_GATE)));

        createDoorRecipe(ModBlocks.MAPLE_DOOR, Ingredient.ofItems(ModBlocks.MAPLE_PLANKS))
                .criterion(hasItem(ModBlocks.MAPLE_PLANKS), conditionsFromItem(ModBlocks.MAPLE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAPLE_DOOR)));
        createTrapdoorRecipe(ModBlocks.MAPLE_TRAPDOOR, Ingredient.ofItems(ModBlocks.MAPLE_PLANKS))
                .criterion(hasItem(ModBlocks.MAPLE_PLANKS), conditionsFromItem(ModBlocks.MAPLE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAPLE_TRAPDOOR)));

        offerPressurePlateRecipe(exporter, ModBlocks.MAPLE_PRESSURE_PLATE, ModBlocks.MAPLE_PLANKS);

        offerHangingSignRecipe(exporter, ModItems.MAPLE_HANGING_SIGN, ModBlocks.STRIPPED_MAPLE_LOG);
        createSignRecipe(ModItems.MAPLE_SIGN, Ingredient.ofItems(ModBlocks.MAPLE_PLANKS))
                .criterion(hasItem(ModBlocks.MAPLE_PLANKS), conditionsFromItem(ModBlocks.MAPLE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAPLE_SIGN)));

        offerPlanksRecipe(exporter, ModBlocks.WISTERIA_PLANKS, ModTags.Items.WISTERIA_LOGS, 4);

        offerBarkBlockRecipe(exporter, ModBlocks.WISTERIA_WOOD, ModBlocks.WISTERIA_LOG);
        offerBarkBlockRecipe(exporter, ModBlocks.STRIPPED_WISTERIA_WOOD, ModBlocks.STRIPPED_WISTERIA_LOG);

        createStairsRecipe(ModBlocks.WISTERIA_STAIRS, Ingredient.ofItems(ModBlocks.WISTERIA_PLANKS))
                .criterion(hasItem(ModBlocks.WISTERIA_PLANKS), conditionsFromItem(ModBlocks.WISTERIA_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WISTERIA_STAIRS)));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WISTERIA_SLAB, Ingredient.ofItems(ModBlocks.WISTERIA_PLANKS))
                .criterion(hasItem(ModBlocks.WISTERIA_PLANKS), conditionsFromItem(ModBlocks.WISTERIA_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WISTERIA_SLAB)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.WISTERIA_BUTTON)
                .input(ModBlocks.WISTERIA_PLANKS)
                .criterion(hasItem(ModBlocks.WISTERIA_PLANKS), conditionsFromItem(ModBlocks.WISTERIA_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WISTERIA_BUTTON)));

        createFenceRecipe(ModBlocks.WISTERIA_FENCE, Ingredient.ofItems(ModBlocks.WISTERIA_PLANKS))
                .criterion(hasItem(ModBlocks.WISTERIA_PLANKS), conditionsFromItem(ModBlocks.WISTERIA_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WISTERIA_FENCE)));
        createFenceGateRecipe(ModBlocks.WISTERIA_FENCE_GATE, Ingredient.ofItems(ModBlocks.WISTERIA_PLANKS))
                .criterion(hasItem(ModBlocks.WISTERIA_PLANKS), conditionsFromItem(ModBlocks.WISTERIA_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WISTERIA_FENCE_GATE)));

        offerPressurePlateRecipe(exporter, ModBlocks.WISTERIA_PRESSURE_PLATE, ModBlocks.WISTERIA_PLANKS);

        offerHangingSignRecipe(exporter, ModItems.WISTERIA_HANGING_SIGN, ModBlocks.STRIPPED_WISTERIA_LOG);
        createSignRecipe(ModItems.WISTERIA_SIGN, Ingredient.ofItems(ModBlocks.WISTERIA_PLANKS))
                .criterion(hasItem(ModBlocks.WISTERIA_PLANKS), conditionsFromItem(ModBlocks.WISTERIA_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WISTERIA_SIGN)));

        createDoorRecipe(ModBlocks.WISTERIA_DOOR, Ingredient.ofItems(ModBlocks.WISTERIA_PLANKS))
                .criterion(hasItem(ModBlocks.WISTERIA_PLANKS), conditionsFromItem(ModBlocks.WISTERIA_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WISTERIA_DOOR)));
        createTrapdoorRecipe(ModBlocks.WISTERIA_TRAPDOOR, Ingredient.ofItems(ModBlocks.WISTERIA_PLANKS))
                .criterion(hasItem(ModBlocks.WISTERIA_PLANKS), conditionsFromItem(ModBlocks.WISTERIA_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WISTERIA_TRAPDOOR)));

        offerPlanksRecipe(exporter, ModBlocks.FROST_PINE_PLANKS, ModTags.Items.FROST_PINE_LOGS, 4);

        offerBarkBlockRecipe(exporter, ModBlocks.FROST_PINE_WOOD, ModBlocks.FROST_PINE_LOG);
        offerBarkBlockRecipe(exporter, ModBlocks.STRIPPED_FROST_PINE_WOOD, ModBlocks.STRIPPED_FROST_PINE_LOG);

        createStairsRecipe(ModBlocks.FROST_PINE_STAIRS, Ingredient.ofItems(ModBlocks.FROST_PINE_PLANKS))
                .criterion(hasItem(ModBlocks.FROST_PINE_PLANKS), conditionsFromItem(ModBlocks.FROST_PINE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FROST_PINE_STAIRS)));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FROST_PINE_SLAB, Ingredient.ofItems(ModBlocks.FROST_PINE_PLANKS))
                .criterion(hasItem(ModBlocks.FROST_PINE_PLANKS), conditionsFromItem(ModBlocks.FROST_PINE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FROST_PINE_SLAB)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.FROST_PINE_BUTTON)
                .input(ModBlocks.FROST_PINE_PLANKS)
                .criterion(hasItem(ModBlocks.FROST_PINE_PLANKS), conditionsFromItem(ModBlocks.FROST_PINE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FROST_PINE_BUTTON)));

        createFenceRecipe(ModBlocks.FROST_PINE_FENCE, Ingredient.ofItems(ModBlocks.FROST_PINE_PLANKS))
                .criterion(hasItem(ModBlocks.FROST_PINE_PLANKS), conditionsFromItem(ModBlocks.FROST_PINE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FROST_PINE_FENCE)));
        createFenceGateRecipe(ModBlocks.FROST_PINE_FENCE_GATE, Ingredient.ofItems(ModBlocks.FROST_PINE_PLANKS))
                .criterion(hasItem(ModBlocks.FROST_PINE_PLANKS), conditionsFromItem(ModBlocks.FROST_PINE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FROST_PINE_FENCE_GATE)));

        offerPressurePlateRecipe(exporter, ModBlocks.FROST_PINE_PRESSURE_PLATE, ModBlocks.FROST_PINE_PLANKS);

        offerHangingSignRecipe(exporter, ModItems.FROST_PINE_HANGING_SIGN, ModBlocks.STRIPPED_FROST_PINE_LOG);
        createSignRecipe(ModItems.FROST_PINE_SIGN, Ingredient.ofItems(ModBlocks.FROST_PINE_PLANKS))
                .criterion(hasItem(ModBlocks.FROST_PINE_PLANKS), conditionsFromItem(ModBlocks.FROST_PINE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FROST_PINE_SIGN)));

        createDoorRecipe(ModBlocks.FROST_PINE_DOOR, Ingredient.ofItems(ModBlocks.FROST_PINE_PLANKS))
                .criterion(hasItem(ModBlocks.FROST_PINE_PLANKS), conditionsFromItem(ModBlocks.FROST_PINE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FROST_PINE_DOOR)));
        createTrapdoorRecipe(ModBlocks.FROST_PINE_TRAPDOOR, Ingredient.ofItems(ModBlocks.FROST_PINE_PLANKS))
                .criterion(hasItem(ModBlocks.FROST_PINE_PLANKS), conditionsFromItem(ModBlocks.FROST_PINE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FROST_PINE_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICKS)
                .pattern("SS")
                .pattern("SS")
                .input('S', Blocks.SNOW_BLOCK)
                .criterion(hasItem(Blocks.SNOW_BLOCK), conditionsFromItem(Blocks.SNOW_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SNOW_BRICKS)));

        createStairsRecipe(ModBlocks.SNOW_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.SNOW_BRICKS))
                .criterion(hasItem(ModBlocks.SNOW_BRICKS), conditionsFromItem(ModBlocks.SNOW_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SNOW_BRICK_STAIRS)));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICK_SLAB, Ingredient.ofItems(ModBlocks.SNOW_BRICKS))
                .criterion(hasItem(ModBlocks.SNOW_BRICKS), conditionsFromItem(ModBlocks.SNOW_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SNOW_BRICK_SLAB)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.SNOW_BRICK_BUTTON)
                .input(ModBlocks.SNOW_BRICKS)
                .criterion(hasItem(ModBlocks.SNOW_BRICKS), conditionsFromItem(ModBlocks.SNOW_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SNOW_BRICK_BUTTON)));
        offerPressurePlateRecipe(exporter, ModBlocks.SNOW_BRICK_PRESSURE_PLATE, ModBlocks.SNOW_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICK_WALL, ModBlocks.SNOW_BRICKS);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_SNOW_BRICKS, ModBlocks.SNOW_BRICK_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_SNOW_BRICKS, ModBlocks.SNOW_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICK_STAIRS, ModBlocks.SNOW_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICK_SLAB, ModBlocks.SNOW_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICK_WALL, ModBlocks.SNOW_BRICKS);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COBALT_SWORD)
                .pattern("C")
                .pattern("C")
                .pattern("S")
                .input('C', ModItems.COBALT_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COBALT_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COBALT_PICKAXE)
                .pattern("CCC")
                .pattern(" S ")
                .pattern(" S ")
                .input('C', ModItems.COBALT_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COBALT_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COBALT_AXE)
                .pattern("CC ")
                .pattern("CS ")
                .pattern(" S ")
                .input('C', ModItems.COBALT_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COBALT_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COBALT_SHOVEL)
                .pattern("C")
                .pattern("S")
                .pattern("S")
                .input('C', ModItems.COBALT_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COBALT_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COBALT_HOE)
                .pattern("CC ")
                .pattern(" S ")
                .pattern(" S ")
                .input('C', ModItems.COBALT_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COBALT_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COBALT_HELMET)
                .pattern("CCC")
                .pattern("C C")
                .input('C', ModItems.COBALT_INGOT)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COBALT_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COBALT_CHESTPLATE)
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', ModItems.COBALT_INGOT)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COBALT_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COBALT_LEGGINGS)
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .input('C', ModItems.COBALT_INGOT)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COBALT_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COBALT_BOOTS)
                .pattern("C C")
                .pattern("C C")
                .input('C', ModItems.COBALT_INGOT)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COBALT_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PRISMARINE_HELMET)
                .pattern("CCC")
                .pattern("C C")
                .input('C', Items.PRISMARINE_SHARD)
                .criterion(hasItem(Items.PRISMARINE_SHARD), conditionsFromItem(Items.PRISMARINE_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PRISMARINE_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PRISMARINE_CHESTPLATE)
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', Items.PRISMARINE_SHARD)
                .criterion(hasItem(Items.PRISMARINE_SHARD), conditionsFromItem(Items.PRISMARINE_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PRISMARINE_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PRISMARINE_LEGGINGS)
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .input('C', Items.PRISMARINE_SHARD)
                .criterion(hasItem(Items.PRISMARINE_SHARD), conditionsFromItem(Items.PRISMARINE_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PRISMARINE_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PRISMARINE_BOOTS)
                .pattern("C C")
                .pattern("C C")
                .input('C', Items.PRISMARINE_SHARD)
                .criterion(hasItem(Items.PRISMARINE_SHARD), conditionsFromItem(Items.PRISMARINE_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PRISMARINE_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BEE_HELMET)
                .pattern("CCC")
                .pattern("C C")
                .input('C', Items.HONEYCOMB)
                .criterion(hasItem(Items.HONEYCOMB), conditionsFromItem(Items.HONEYCOMB))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BEE_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BEE_CHESTPLATE)
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', Items.HONEYCOMB)
                .criterion(hasItem(Items.HONEYCOMB), conditionsFromItem(Items.HONEYCOMB))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BEE_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BEE_LEGGINGS)
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .input('C', Items.HONEYCOMB)
                .criterion(hasItem(Items.HONEYCOMB), conditionsFromItem(Items.HONEYCOMB))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BEE_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BEE_BOOTS)
                .pattern("C C")
                .pattern("C C")
                .input('C', Items.HONEYCOMB)
                .criterion(hasItem(Items.HONEYCOMB), conditionsFromItem(Items.HONEYCOMB))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BEE_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SLIME_HELMET)
                .pattern("CCC")
                .pattern("C C")
                .input('C', ModItems.CONGEALED_SLIME)
                .criterion(hasItem(ModItems.CONGEALED_SLIME), conditionsFromItem(ModItems.CONGEALED_SLIME))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SLIME_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SLIME_CHESTPLATE)
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', ModItems.CONGEALED_SLIME)
                .criterion(hasItem(ModItems.CONGEALED_SLIME), conditionsFromItem(ModItems.CONGEALED_SLIME))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SLIME_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SLIME_LEGGINGS)
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .input('C', ModItems.CONGEALED_SLIME)
                .criterion(hasItem(ModItems.CONGEALED_SLIME), conditionsFromItem(ModItems.CONGEALED_SLIME))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SLIME_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SLIME_BOOTS)
                .pattern("C C")
                .pattern("C C")
                .input('C', ModItems.CONGEALED_SLIME)
                .criterion(hasItem(ModItems.CONGEALED_SLIME), conditionsFromItem(ModItems.CONGEALED_SLIME))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SLIME_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SLIME_TOTEM)
                .pattern(" H ")
                .pattern("CTL")
                .pattern(" B ")
                .input('H', ModItems.SLIME_HELMET)
                .input('C', ModItems.SLIME_CHESTPLATE)
                .input('L', ModItems.SLIME_LEGGINGS)
                .input('B', ModItems.SLIME_BOOTS)
                .input('T', Items.TOTEM_OF_UNDYING)
                .criterion(hasItem(Items.TOTEM_OF_UNDYING), conditionsFromItem(Items.TOTEM_OF_UNDYING))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SLIME_TOTEM)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HONEY_TOTEM)
                .pattern(" H ")
                .pattern("CTL")
                .pattern(" B ")
                .input('H', ModItems.BEE_HELMET)
                .input('C', ModItems.BEE_CHESTPLATE)
                .input('L', ModItems.BEE_LEGGINGS)
                .input('B', ModItems.BEE_BOOTS)
                .input('T', Items.TOTEM_OF_UNDYING)
                .criterion(hasItem(Items.TOTEM_OF_UNDYING), conditionsFromItem(Items.TOTEM_OF_UNDYING))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HONEY_TOTEM)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PRISMARINE_TOTEM)
                .pattern(" H ")
                .pattern("CTL")
                .pattern(" B ")
                .input('H', ModItems.PRISMARINE_HELMET)
                .input('C', ModItems.PRISMARINE_CHESTPLATE)
                .input('L', ModItems.PRISMARINE_LEGGINGS)
                .input('B', ModItems.PRISMARINE_BOOTS)
                .input('T', Items.TOTEM_OF_UNDYING)
                .criterion(hasItem(Items.TOTEM_OF_UNDYING), conditionsFromItem(Items.TOTEM_OF_UNDYING))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PRISMARINE_TOTEM)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LEATHER_TOTEM)
                .pattern(" H ")
                .pattern("CTL")
                .pattern(" B ")
                .input('H', Items.LEATHER_HELMET)
                .input('C', Items.LEATHER_CHESTPLATE)
                .input('L', Items.LEATHER_LEGGINGS)
                .input('B', Items.LEATHER_BOOTS)
                .input('T', Items.TOTEM_OF_UNDYING)
                .criterion(hasItem(Items.TOTEM_OF_UNDYING), conditionsFromItem(Items.TOTEM_OF_UNDYING))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LEATHER_TOTEM)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CHAIN_TOTEM)
                .pattern(" H ")
                .pattern("CTL")
                .pattern(" B ")
                .input('H', Items.CHAINMAIL_HELMET)
                .input('C', Items.CHAINMAIL_CHESTPLATE)
                .input('L', Items.CHAINMAIL_LEGGINGS)
                .input('B', Items.CHAINMAIL_BOOTS)
                .input('T', Items.TOTEM_OF_UNDYING)
                .criterion(hasItem(Items.TOTEM_OF_UNDYING), conditionsFromItem(Items.TOTEM_OF_UNDYING))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CHAIN_TOTEM)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.HONEY_GLAZED_STEAK)
                .input(Items.HONEY_BOTTLE)
                .input(Items.COOKED_BEEF)
                .criterion(hasItem(Items.HONEY_BOTTLE), conditionsFromItem(Items.HONEY_BOTTLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HONEY_GLAZED_STEAK)));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(new ItemConvertible[]{ModItems.LEEK}), RecipeCategory.FOOD, ModItems.ROASTED_LEEK, 0.35F, 200).criterion("has_leek", conditionsFromItem(ModItems.LEEK)).offerTo(exporter);
        offerFoodCookingRecipe(exporter, "smoking", RecipeSerializer.SMOKING, 100, ModItems.LEEK, ModItems.ROASTED_LEEK, 0.35f);
        offerFoodCookingRecipe(exporter, "campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING, 600, ModItems.LEEK, ModItems.ROASTED_LEEK, 0.35f);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(new ItemConvertible[]{ModItems.RAW_DUCK}), RecipeCategory.FOOD, ModItems.COOKED_DUCK, 0.35F, 200).criterion("has_raw_duck", conditionsFromItem(ModItems.RAW_DUCK)).offerTo(exporter);
        offerFoodCookingRecipe(exporter, "smoking", RecipeSerializer.SMOKING, 100, ModItems.RAW_DUCK, ModItems.COOKED_DUCK, 0.35f);
        offerFoodCookingRecipe(exporter, "campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING, 600, ModItems.RAW_DUCK, ModItems.COOKED_DUCK, 0.35f);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(new ItemConvertible[]{ModItems.RAW_SQUID}), RecipeCategory.FOOD, ModItems.COOKED_SQUID, 0.35F, 200).criterion("has_raw_squid", conditionsFromItem(ModItems.RAW_SQUID)).offerTo(exporter);
        offerFoodCookingRecipe(exporter, "smoking", RecipeSerializer.SMOKING, 100, ModItems.RAW_SQUID, ModItems.COOKED_SQUID, 0.35f);
        offerFoodCookingRecipe(exporter, "campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING, 600, ModItems.RAW_SQUID, ModItems.COOKED_SQUID, 0.35f);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(new ItemConvertible[]{ModItems.RAW_GLOW_SQUID}), RecipeCategory.FOOD, ModItems.COOKED_GLOW_SQUID, 0.35F, 200).criterion("has_raw_glow_squid", conditionsFromItem(ModItems.RAW_GLOW_SQUID)).offerTo(exporter);
        offerFoodCookingRecipe(exporter, "smoking", RecipeSerializer.SMOKING, 100, ModItems.RAW_GLOW_SQUID, ModItems.COOKED_GLOW_SQUID, 0.35f);
        offerFoodCookingRecipe(exporter, "campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING, 600, ModItems.RAW_GLOW_SQUID, ModItems.COOKED_GLOW_SQUID, 0.35f);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MARSHMALLOW)
                .input(Items.STICK)
                .input(Items.EGG)
                .input(Items.SUGAR)
                .input(Items.HONEY_BOTTLE)
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MARSHMALLOW)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MAPLE_SYRUP_BOTTLE, 3)
                .input(ModItems.MAPLE_SAP)
                .input(Items.GLASS_BOTTLE)
                .input(Items.GLASS_BOTTLE)
                .input(Items.GLASS_BOTTLE)
                .criterion(hasItem(ModItems.MAPLE_SAP), conditionsFromItem(ModItems.MAPLE_SAP))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MAPLE_SYRUP_BOTTLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MAPLE_CANDY, 4)
                .pattern(" S ")
                .pattern("SMS")
                .pattern(" S ")
                .input('S', Items.SUGAR)
                .input('M', ModItems.MAPLE_SYRUP_BOTTLE)
                .criterion(hasItem(ModItems.MAPLE_SYRUP_BOTTLE), conditionsFromItem(ModItems.MAPLE_SYRUP_BOTTLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MAPLE_CANDY)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MILK_BOTTLE, 3)
                .input(Items.MILK_BUCKET)
                .input(Items.GLASS_BOTTLE)
                .input(Items.GLASS_BOTTLE)
                .input(Items.GLASS_BOTTLE)
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(Items.MILK_BUCKET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MILK_BOTTLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, Items.CAKE)
                .pattern("MMM")
                .pattern("SES")
                .pattern("WWW")
                .input('S', Items.SUGAR)
                .input('M', ModItems.MILK_BOTTLE)
                .input('E', Items.EGG)
                .input('W', Items.WHEAT)
                .criterion(hasItem(ModItems.MILK_BOTTLE), conditionsFromItem(ModItems.MILK_BOTTLE))
                .offerTo(exporter, new Identifier(getRecipeName(Items.CAKE)));

        offerFoodCookingRecipe(exporter, "campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING, 100, ModItems.MARSHMALLOW, ModItems.BURNT_MARSHMALLOW, 0.35f);
    }
}
