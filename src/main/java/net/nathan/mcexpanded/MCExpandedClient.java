package net.nathan.mcexpanded;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.block.entity.HangingSignBlockEntityRenderer;
import net.minecraft.client.render.block.entity.SignBlockEntityRenderer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;
import net.nathan.mcexpanded.block.ModBlocks;
import net.nathan.mcexpanded.block.entity.ModBlockEntities;
import net.nathan.mcexpanded.effect.ModEffects;
import net.nathan.mcexpanded.entity.ModEntities;
import net.nathan.mcexpanded.entity.client.DuckModel;
import net.nathan.mcexpanded.entity.client.DuckRenderer;
import net.nathan.mcexpanded.entity.layer.ModModelLayers;
import net.nathan.mcexpanded.util.ModWoodTypes;

import java.util.HashMap;
import java.util.UUID;

public class MCExpandedClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAPLE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAPLE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LEEK_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOON_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SUN_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BITTER_BERRY_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GARDEN_COSMOS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_GARDEN_COSMOS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_MAPLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_RED_MAPLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YELLOW_MAPLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_YELLOW_MAPLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_MUSHROOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BLUE_MUSHROOM, RenderLayer.getCutout());

        BlockEntityRendererFactories.register(ModBlockEntities.MOD_SIGN_BLOCK_ENTITY, SignBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.MOD_HANGING_SIGN_BLOCK_ENTITY, HangingSignBlockEntityRenderer::new);

        TexturedRenderLayers.SIGN_TYPE_TEXTURES.put(ModWoodTypes.MAPLE, TexturedRenderLayers.getSignTextureId(ModWoodTypes.MAPLE));

        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.DUCK, DuckModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.DUCK, DuckRenderer::new);

    }
}