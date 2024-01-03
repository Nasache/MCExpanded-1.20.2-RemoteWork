package net.nathan.mcexpanded.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.block.Fertilizable;
import net.minecraft.item.ItemConvertible;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.WorldView;
import net.minecraft.world.event.GameEvent;
import net.minecraft.world.event.GameEvent.Emitter;
import net.nathan.mcexpanded.item.ModItems;

public class SunCropBlock extends CropBlock implements Fertilizable {
    public static final int MAX_AGE = 5;
    public static final IntProperty AGE = IntProperty.of("age", 0, 5);

    public SunCropBlock(Settings settings) {
        super(settings);
    }

    public boolean hasRandomTicks(BlockState state) {
        return (Integer)state.get(AGE) <= 5;
    }

    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        int i = (Integer) state.get(AGE);
        if (i < 4 && random.nextInt(5) == 0 && world.getBaseLightLevel(pos.up(), 0) >= 9) {
            BlockState blockState = (BlockState) state.with(AGE, i + 1);
            world.setBlockState(pos, blockState, 2);
            world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, Emitter.of(blockState));
        }
        if (world.getBaseLightLevel(pos.up(), 0) >= 9 && !world.isNight()) {
            if (i == 4) {
                BlockState blockState = (BlockState) state.with(AGE, 5);
                world.setBlockState(pos, blockState, 2);
                world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, Emitter.of(blockState));
            }
        } else {
            if (i == 5) {
                BlockState blockState = (BlockState) state.with(AGE, 4);
                world.setBlockState(pos, blockState, 2);
                world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, Emitter.of(blockState));
            }
        }
    }

    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        int i = Math.min(4, (Integer)state.get(AGE) + 1);
        world.setBlockState(pos, (BlockState)state.with(AGE, i), 2);
    }

    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        return (Integer)state.get(AGE) < 4;
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.SUN_SEEDS;
    }

    @Override
    protected IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
    
}
