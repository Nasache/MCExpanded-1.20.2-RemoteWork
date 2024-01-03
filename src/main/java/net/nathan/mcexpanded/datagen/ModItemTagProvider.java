package net.nathan.mcexpanded.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.nathan.mcexpanded.item.ModItems;

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
                .add(ModItems.COBALT_HELMET, ModItems.COBALT_CHESTPLATE, ModItems.COBALT_LEGGINGS, ModItems.COBALT_BOOTS);

        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ModItems.MUSIC_DISC_SHROOM_SONG);
    }
}
