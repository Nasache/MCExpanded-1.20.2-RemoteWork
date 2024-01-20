package net.nathan.mcexpanded.block.custom;

import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import java.util.Random;

public class MalachiteClusterBlock extends Block {
    public static final IntProperty AGE = Properties.AGE_3;

    public MalachiteClusterBlock(Settings settings) {
        super(settings);
        setDefaultState(getStateManager().getDefaultState().with(AGE, 0));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    public boolean hasRandomTicks(BlockState state) {
        return (Integer)state.get(AGE) < 3;
    }
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextInt(4) == 0 && world.getLightLevel(pos) >= 11) { // Adjust light level and probability as needed
            int age = state.get(AGE);
            if (age < 3) {
                world.setBlockState(pos, state.with(AGE, age + 1));
            }
        }
    }

}