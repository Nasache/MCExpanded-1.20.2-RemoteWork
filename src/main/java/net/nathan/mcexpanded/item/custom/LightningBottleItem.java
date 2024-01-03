package net.nathan.mcexpanded.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;



public class LightningBottleItem extends Item {
    public LightningBottleItem(Settings settings) {
        super(settings);
    }


    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient && (!world.isThundering())) {
            ServerWorld serverWorld = (ServerWorld) world;
            serverWorld.setWeather(0, UniformIntProvider.create(3600, 15600).get(world.random), true, true);

            if (!user.isCreative() && user.getStackInHand(hand).getCount() > 0) {
                user.getStackInHand(hand).decrement(1);
            }
        }
        return TypedActionResult.consume(user.getStackInHand(hand));
    }
}