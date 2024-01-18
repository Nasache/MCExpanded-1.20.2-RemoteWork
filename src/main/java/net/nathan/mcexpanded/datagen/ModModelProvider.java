package net.nathan.mcexpanded.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Items;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.nathan.mcexpanded.block.ModBlocks;
import net.nathan.mcexpanded.block.custom.LeekCropBlock;
import net.nathan.mcexpanded.block.custom.MoonCropBlock;
import net.nathan.mcexpanded.block.custom.SunCropBlock;
import net.nathan.mcexpanded.item.ModItems;

import java.util.IdentityHashMap;
import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBALT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBALT_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_COBALT_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_COBALT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TEST_BLOCK);

        BlockStateModelGenerator.BlockTexturePool maplePlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAPLE_PLANKS);
        maplePlanksTexturePool.stairs(ModBlocks.MAPLE_STAIRS);
        maplePlanksTexturePool.slab(ModBlocks.MAPLE_SLAB);
        maplePlanksTexturePool.button(ModBlocks.MAPLE_BUTTON);
        maplePlanksTexturePool.pressurePlate(ModBlocks.MAPLE_PRESSURE_PLATE);
        maplePlanksTexturePool.fence(ModBlocks.MAPLE_FENCE);
        maplePlanksTexturePool.fenceGate(ModBlocks.MAPLE_FENCE_GATE);
        blockStateModelGenerator.registerDoor(ModBlocks.MAPLE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.MAPLE_TRAPDOOR);

        maplePlanksTexturePool.family(BlockFamilies.register(ModBlocks.MAPLE_PLANKS).sign(ModBlocks.MAPLE_SIGN, ModBlocks.MAPLE_WALL_SIGN).build());

        blockStateModelGenerator.registerHangingSign(ModBlocks.STRIPPED_MAPLE_LOG, ModBlocks.MAPLE_HANGING_SIGN, ModBlocks.MAPLE_WALL_HANGING_SIGN);

        blockStateModelGenerator.registerLog(ModBlocks.MAPLE_LOG).log(ModBlocks.MAPLE_LOG).wood(ModBlocks.MAPLE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_MAPLE_LOG).log(ModBlocks.STRIPPED_MAPLE_LOG).wood(ModBlocks.STRIPPED_MAPLE_WOOD);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_MAPLE_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_MAPLE_LEAVES);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.RED_MAPLE_SAPLING, ModBlocks.POTTED_RED_MAPLE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.YELLOW_MAPLE_SAPLING, ModBlocks.POTTED_YELLOW_MAPLE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerCrop(ModBlocks.LEEK_CROP, LeekCropBlock.AGE, 0, 1, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.MOON_CROP, MoonCropBlock.AGE, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.SUN_CROP, SunCropBlock.AGE, 0, 1, 2, 3, 4, 5);

        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.BITTER_BERRY_BUSH).coordinate(BlockStateVariantMap.create(Properties.AGE_3).register((stage) -> {
            return BlockStateVariant.create().put(VariantSettings.MODEL, blockStateModelGenerator.createSubModel(ModBlocks.BITTER_BERRY_BUSH, "_stage" + stage, Models.CROSS, TextureMap::cross));
        })));

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.GARDEN_COSMOS, ModBlocks.POTTED_GARDEN_COSMOS, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BLUE_MUSHROOM, ModBlocks.POTTED_BLUE_MUSHROOM, BlockStateModelGenerator.TintType.NOT_TINTED);



    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.COBALT_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_COBALT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BITTER_BERRIES, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEEK, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROASTED_LEEK, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOON_FRUIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUN_FRUIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_SQUID, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_GLOW_SQUID, Models.GENERATED);
        itemModelGenerator.register(ModItems.HONEY_GLAZED_STEAK, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHTNING_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CONGEALED_SLIME, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_SHROOM_SONG, Models.GENERATED);

        itemModelGenerator.register(ModItems.SLIME_TOTEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.HONEY_TOTEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.PRISMARINE_TOTEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEATHER_TOTEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHAIN_TOTEM, Models.GENERATED);


        itemModelGenerator.register(ModItems.COBALT_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COBALT_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COBALT_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COBALT_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COBALT_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COBALT_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COBALT_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COBALT_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COBALT_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PRISMARINE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PRISMARINE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PRISMARINE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PRISMARINE_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BEE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BEE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BEE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BEE_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SLIME_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SLIME_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SLIME_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SLIME_BOOTS));

        itemModelGenerator.register(ModItems.DUCK_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")), Optional.empty()));

    }
}
