package net.nathan.mcexpanded.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.nathan.mcexpanded.item.ModItems;
import net.nathan.mcexpanded.block.ModBlocks; // Import your ModBlocks class

public class MapleLogBlock extends PillarBlock {

    public MapleLogBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.getItem() instanceof AxeItem) {
            if (!world.isClient) {
                world.playSound(null, pos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                dropMaple(world, pos);
                itemStack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
                player.incrementStat(Stats.USED.getOrCreateStat(itemStack.getItem()));

                world.setBlockState(pos, ModBlocks.STRIPPED_MAPLE_LOG.getDefaultState().with(Properties.AXIS, state.get(Properties.AXIS)), 11);
            }
            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS;
    }

    public static void dropMaple(World world, BlockPos pos) {
        dropStack(world, pos, new ItemStack(ModItems.LEEK, 1));
    }
}
