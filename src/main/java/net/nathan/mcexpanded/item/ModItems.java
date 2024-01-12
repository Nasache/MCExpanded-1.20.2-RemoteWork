package net.nathan.mcexpanded.item;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nathan.mcexpanded.MCExpanded;
import net.nathan.mcexpanded.block.ModBlocks;
import net.nathan.mcexpanded.item.custom.LightningBottleItem;
import net.nathan.mcexpanded.item.custom.ModArmorItem;
import net.nathan.mcexpanded.sound.ModSounds;

public class ModItems {
    public static final Item COBALT_INGOT = registerItem("cobalt_ingot",
            new Item(new FabricItemSettings()));
    public static final Item RAW_COBALT = registerItem("raw_cobalt",
            new Item(new FabricItemSettings()));
    public static final Item COBALT_SWORD = registerItem("cobalt_sword",
            new SwordItem(ModToolMaterial.COBALT, 3, -2.4f, new FabricItemSettings()));
    public static final Item COBALT_PICKAXE = registerItem("cobalt_pickaxe",
            new PickaxeItem(ModToolMaterial.COBALT, 1, -2.8f, new FabricItemSettings()));
    public static final Item COBALT_AXE = registerItem("cobalt_axe",
            new AxeItem(ModToolMaterial.COBALT, 5, -3.0f, new FabricItemSettings()));
    public static final Item COBALT_SHOVEL = registerItem("cobalt_shovel",
            new ShovelItem(ModToolMaterial.COBALT, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item COBALT_HOE = registerItem("cobalt_hoe",
            new HoeItem(ModToolMaterial.COBALT, -3, 0f, new FabricItemSettings()));
    public static final Item COBALT_HELMET = registerItem("cobalt_helmet",
            new ModArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item COBALT_CHESTPLATE = registerItem("cobalt_chestplate",
            new ModArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item COBALT_LEGGINGS = registerItem("cobalt_leggings",
            new ModArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item COBALT_BOOTS = registerItem("cobalt_boots",
            new ModArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item BLAZE_SHIELD = registerItem("blaze_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(672)));

    public static final Item MAPLE_SIGN = registerItem("maple_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.MAPLE_SIGN, ModBlocks.MAPLE_WALL_SIGN));
    public static final Item MAPLE_HANGING_SIGN = registerItem("maple_hanging_sign",
            new HangingSignItem(ModBlocks.MAPLE_HANGING_SIGN, ModBlocks.MAPLE_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));

    public static final Item BITTER_BERRIES = registerItem("bitter_berries",
            new AliasedBlockItem(ModBlocks.BITTER_BERRY_BUSH, new FabricItemSettings().food(ModFoodComponents.BITTER_BERRIES)));

    public static final Item LEEK_SEEDS = registerItem("leek_seeds",
            new AliasedBlockItem(ModBlocks.LEEK_CROP, new FabricItemSettings()));
    public static final Item ROASTED_LEEK = registerItem("roasted_leek",
            new Item(new FabricItemSettings().food(ModFoodComponents.ROASTED_LEEK)));
    public static final Item LEEK = registerItem("leek",
            new Item(new FabricItemSettings().food(ModFoodComponents.LEEK)));
    public static final Item MOON_FRUIT = registerItem("moon_fruit",
            new Item(new FabricItemSettings().food(ModFoodComponents.MOON_FRUIT)));
    public static final Item MOON_SEEDS = registerItem("moon_seeds",
            new AliasedBlockItem(ModBlocks.MOON_CROP, new FabricItemSettings()));
    public static final Item SUN_FRUIT = registerItem("sun_fruit",
            new Item(new FabricItemSettings().food(ModFoodComponents.SUN_FRUIT)));
    public static final Item SUN_SEEDS = registerItem("sun_seeds",
            new AliasedBlockItem(ModBlocks.SUN_CROP, new FabricItemSettings()));


    public static final Item LIGHTNING_BOTTLE = registerItem("lightning_bottle",
            new LightningBottleItem(new FabricItemSettings().maxCount(16)));

    public static final Item MUSIC_DISC_SHROOM_SONG = registerItem("music_disc_shroom_song",
            new MusicDiscItem(8, ModSounds.SHROOM_SONG, new FabricItemSettings().maxCount(1), 88));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MCExpanded.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MCExpanded.LOGGER.info("Registering Mod Items for " + MCExpanded.MOD_ID);

    }
}
