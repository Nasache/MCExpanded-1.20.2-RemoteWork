package net.nathan.mcexpanded.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.advancement.criterion.ConsumeItemCriterion;
import net.nathan.mcexpanded.MCExpanded;
import net.nathan.mcexpanded.block.ModBlocks;
import net.nathan.mcexpanded.item.ModItems;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementDisplay;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModAdvancementProvider extends FabricAdvancementProvider {
    public ModAdvancementProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateAdvancement(Consumer<AdvancementEntry> consumer) {
        AdvancementEntry rootAdvancement = Advancement.Builder.create()
                .display(new AdvancementDisplay(new ItemStack(ModBlocks.MAPLE_LOG),
                        Text.literal("A Whole New World"), Text.literal("I Don't Recognize This Block"),
                        new Identifier(MCExpanded.MOD_ID, "textures/block/maple_planks.png"), AdvancementFrame.TASK,
                        true, true, false))
                .criterion("has_maple_log", InventoryChangedCriterion.Conditions.items(ModBlocks.MAPLE_LOG))
                .build(consumer, MCExpanded.MOD_ID + ":mcexpanded");
        AdvancementEntry marshmallowAdvancement = Advancement.Builder.create()
                .display(new AdvancementDisplay(new ItemStack(ModItems.BURNT_MARSHMALLOW),
                        Text.literal("Mmmmm Carcinogens"), Text.literal("Eat a Burnt Marshmallow"),
                        new Identifier(MCExpanded.MOD_ID, "textures/block/maple_planks.png"), AdvancementFrame.TASK,
                        true, true, false))
                .criterion("eat_burnt_marshmallow", ConsumeItemCriterion.Conditions.item(ModItems.BURNT_MARSHMALLOW))
                .parent(rootAdvancement)
                .build(consumer, MCExpanded.MOD_ID + "mcexpanded");

    }
}
