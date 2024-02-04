package net.nathan.mcexpanded.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.FletchingTableBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.screen.*;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.nathan.mcexpanded.screen.FletchingTableScreenHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FletchingTableBlock.class)
public abstract class FletchingTableMixin {
    private static final Text SCREEN_TITLE = Text.translatable("container.upgrade");

    @Inject(method = "onUse(Lnet/minecraft/block/BlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/player/PlayerEntity;Lnet/minecraft/util/Hand;Lnet/minecraft/util/hit/BlockHitResult;)Lnet/minecraft/util/ActionResult;", at = @At("HEAD"), cancellable = true)
    private void onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit, CallbackInfoReturnable<ActionResult> cir) {
        if (!world.isClient) {
            player.openHandledScreen(new SimpleNamedScreenHandlerFactory((syncId, playerInventory, playerEntity) -> {
                BlockEntity blockEntity = world.getBlockEntity(pos);
                if (blockEntity instanceof Inventory) {
                    Inventory blockInventory = (Inventory) blockEntity;
                    PropertyDelegate propertyDelegate = new ArrayPropertyDelegate(2); // Assuming your screen uses a property delegate
                    return new FletchingTableScreenHandler(syncId, playerInventory, blockInventory, propertyDelegate);
                } else {
                    // Handle the case where the block entity is not an Inventory, perhaps by logging an error or providing a fallback
                    return null; // Make sure to handle this case to avoid opening a screen with a null inventory
                }
            }, SCREEN_TITLE));

            cir.setReturnValue(ActionResult.CONSUME);
        }
    }
}

