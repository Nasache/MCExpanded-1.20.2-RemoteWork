package net.nathan.mcexpanded.block.custom;

import com.sun.net.httpserver.Authenticator;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.GlassBottleItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.nathan.mcexpanded.MCExpanded;

public class TestBlock extends Block {
    public TestBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
            if (player.isSneaking()) {
                world.playSound(player, pos, SoundEvents.ENTITY_ENDERMAN_SCREAM, SoundCategory.BLOCKS, 1f, 1f);
                return ActionResult.SUCCESS;
            } else {
                world.playSound(player, pos, SoundEvents.ENTITY_CREEPER_PRIMED, SoundCategory.BLOCKS, 1f, 1f);
                return ActionResult.CONSUME;
            }
        }
    }