package net.nathan.mcexpanded.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.nathan.mcexpanded.block.ModBlocks;
import net.nathan.mcexpanded.item.ModItems;
import net.nathan.mcexpanded.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.COBALT_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.COBALT_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.COBALT_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.COBALT_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.COBALT_HOE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.COBALT_HELMET, ModItems.COBALT_CHESTPLATE, ModItems.COBALT_LEGGINGS, ModItems.COBALT_BOOTS)
                .add(ModItems.PRISMARINE_HELMET, ModItems.PRISMARINE_CHESTPLATE, ModItems.PRISMARINE_LEGGINGS, ModItems.PRISMARINE_BOOTS)
                .add(ModItems.BEE_HELMET, ModItems.BEE_CHESTPLATE, ModItems.BEE_LEGGINGS, ModItems.BEE_BOOTS)
                .add(ModItems.SLIME_HELMET, ModItems.SLIME_CHESTPLATE, ModItems.SLIME_LEGGINGS, ModItems.SLIME_BOOTS);

        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ModItems.MUSIC_DISC_SHROOM_SONG);

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.MAPLE_LOG.asItem(), ModBlocks.MAPLE_WOOD.asItem(),
                        ModBlocks.STRIPPED_MAPLE_LOG.asItem(), ModBlocks.STRIPPED_MAPLE_WOOD.asItem(),
                        ModBlocks.WISTERIA_LOG.asItem(), ModBlocks.WISTERIA_WOOD.asItem(),
                        ModBlocks.STRIPPED_WISTERIA_LOG.asItem(), ModBlocks.STRIPPED_WISTERIA_WOOD.asItem(),
                        ModBlocks.FROST_PINE_LOG.asItem(), ModBlocks.FROST_PINE_WOOD.asItem(),
                        ModBlocks.STRIPPED_FROST_PINE_LOG.asItem(), ModBlocks.STRIPPED_FROST_PINE_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.MAPLE_PLANKS.asItem(),
                        ModBlocks.WISTERIA_PLANKS.asItem(),
                        ModBlocks.FROST_PINE_PLANKS.asItem());

        getOrCreateTagBuilder(ModTags.Items.MAPLE_LOGS)
                .add(ModBlocks.MAPLE_LOG.asItem(), ModBlocks.MAPLE_WOOD.asItem(),
                        ModBlocks.STRIPPED_MAPLE_LOG.asItem(), ModBlocks.STRIPPED_MAPLE_WOOD.asItem());

        getOrCreateTagBuilder(ModTags.Items.WISTERIA_LOGS)
                .add(ModBlocks.WISTERIA_LOG.asItem(), ModBlocks.WISTERIA_WOOD.asItem(),
                        ModBlocks.STRIPPED_WISTERIA_LOG.asItem(), ModBlocks.STRIPPED_WISTERIA_WOOD.asItem());

        getOrCreateTagBuilder(ModTags.Items.FROST_PINE_LOGS)
                .add(ModBlocks.FROST_PINE_LOG.asItem(), ModBlocks.FROST_PINE_WOOD.asItem(),
                        ModBlocks.STRIPPED_FROST_PINE_LOG.asItem(), ModBlocks.STRIPPED_FROST_PINE_WOOD.asItem());


    }
}
