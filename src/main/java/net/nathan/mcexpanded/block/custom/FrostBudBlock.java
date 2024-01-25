package net.nathan.mcexpanded.block.custom;

import net.minecraft.block.*;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class FrostBudBlock extends Block {
    private static final VoxelShape SHAPE = Block.createCuboidShape(2.0, 2.0, 2.0, 14.0, 16.0, 14.0);
    private static final int field_31252 = 14;
    private static final int field_31253 = 10;
    private static final int field_31254 = 10;

    public FrostBudBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockState blockAbove = world.getBlockState(pos.up());
        boolean isLeaves = blockAbove.getBlock() instanceof LeavesBlock;
        boolean canCoverSmallSquare = Block.sideCoversSmallSquare(world, pos.up(), Direction.DOWN);
        return (isLeaves || canCoverSmallSquare) && !world.isWater(pos);
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return direction == Direction.UP && !this.canPlaceAt(state, world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        BlockPos.Mutable mutable = new BlockPos.Mutable();

        // Further increase the range for particle spread
        for (int l = 0; l < 40; ++l) {
            // Significantly widen the area around the block where particles can appear
            mutable.set(pos.getX() + MathHelper.nextDouble(random, -10.0, 10.0),
                    pos.getY() + MathHelper.nextDouble(random, -5.0, 5.0),
                    pos.getZ() + MathHelper.nextDouble(random, -10.0, 10.0));

            // Check to ensure particles are not generated inside other full blocks
            BlockState blockState = world.getBlockState(mutable);
            if (!blockState.isFullCube(world, mutable)) {
                // Create a snowflake particle with slight variations in the y-velocity
                world.addParticle(ParticleTypes.SNOWFLAKE,
                        (double) mutable.getX() + random.nextDouble(),
                        (double) mutable.getY() + random.nextDouble(),
                        (double) mutable.getZ() + random.nextDouble(),
                        0.0, MathHelper.nextDouble(random, -0.05, -0.15), 0.0);
            }
        }
    }



    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}