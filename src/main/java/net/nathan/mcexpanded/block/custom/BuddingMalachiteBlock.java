package net.nathan.mcexpanded.block.custom;

import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.nathan.mcexpanded.block.ModBlocks;

import java.util.Random;

public class BuddingMalachiteBlock extends Block {
    public static final Direction[] DIRECTIONS = Direction.values();

    public BuddingMalachiteBlock(Settings settings) {
        super(settings);
    }

    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextInt(5) == 0) { // Adjust the probability as needed
            Direction direction = DIRECTIONS[random.nextInt(DIRECTIONS.length)];
            BlockPos blockPos = pos.offset(direction);
            BlockState blockState = world.getBlockState(blockPos);

            if (world.isAir(blockPos)) {
                BlockState malachiteState = ModBlocks.SMALL_MALACHITE_BUD.getDefaultState()
                        .with(FacingBlock.FACING, direction);

                world.setBlockState(blockPos, malachiteState);
            }
        }
    }
}