package net.nathan.mcexpanded.item;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nathan.mcexpanded.MCExpanded;
import net.nathan.mcexpanded.block.ModBlocks;
import net.nathan.mcexpanded.entity.ModEntities;
import net.nathan.mcexpanded.item.custom.LightningBottleItem;
import net.nathan.mcexpanded.item.custom.ModItemEffect;
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
            new ArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item COBALT_CHESTPLATE = registerItem("cobalt_chestplate",
            new ArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item COBALT_LEGGINGS = registerItem("cobalt_leggings",
            new ArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item COBALT_BOOTS = registerItem("cobalt_boots",
            new ArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item PRISMARINE_HELMET = registerItem("prismarine_helmet",
            new ArmorItem(ModArmorMaterials.PRISMARINE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item PRISMARINE_CHESTPLATE = registerItem("prismarine_chestplate",
            new ArmorItem(ModArmorMaterials.PRISMARINE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item PRISMARINE_LEGGINGS = registerItem("prismarine_leggings",
            new ArmorItem(ModArmorMaterials.PRISMARINE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item PRISMARINE_BOOTS = registerItem("prismarine_boots",
            new ArmorItem(ModArmorMaterials.PRISMARINE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item BEE_HELMET = registerItem("bee_helmet",
            new ArmorItem(ModArmorMaterials.HONEY, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item BEE_CHESTPLATE = registerItem("bee_chestplate",
            new ArmorItem(ModArmorMaterials.HONEY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item BEE_LEGGINGS = registerItem("bee_leggings",
            new ArmorItem(ModArmorMaterials.HONEY, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item BEE_BOOTS = registerItem("bee_boots",
            new ArmorItem(ModArmorMaterials.HONEY, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item SLIME_HELMET = registerItem("slime_helmet",
            new ArmorItem(ModArmorMaterials.SLIME, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item SLIME_CHESTPLATE = registerItem("slime_chestplate",
            new ArmorItem(ModArmorMaterials.SLIME, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item SLIME_LEGGINGS = registerItem("slime_leggings",
            new ArmorItem(ModArmorMaterials.SLIME, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item SLIME_BOOTS = registerItem("slime_boots",
            new ArmorItem(ModArmorMaterials.SLIME, ArmorItem.Type.BOOTS, new FabricItemSettings()));


    public static final Item SLIME_TOTEM = registerItem("slime_totem",
            new ModItemEffect(new FabricItemSettings().maxCount(1)));
    public static final Item HONEY_TOTEM = registerItem("honey_totem",
            new ModItemEffect(new FabricItemSettings().maxCount(1)));
    public static final Item PRISMARINE_TOTEM = registerItem("prismarine_totem",
            new ModItemEffect(new FabricItemSettings().maxCount(1)));
    public static final Item LEATHER_TOTEM = registerItem("leather_totem",
            new ModItemEffect(new FabricItemSettings().maxCount(1)));
    public static final Item CHAIN_TOTEM = registerItem("chain_totem",
            new ModItemEffect(new FabricItemSettings().maxCount(1)));

    public static final Item MAPLE_SIGN = registerItem("maple_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.MAPLE_SIGN, ModBlocks.MAPLE_WALL_SIGN));
    public static final Item MAPLE_HANGING_SIGN = registerItem("maple_hanging_sign",
            new HangingSignItem(ModBlocks.MAPLE_HANGING_SIGN, ModBlocks.MAPLE_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));

    public static final Item WISTERIA_SIGN = registerItem("wisteria_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.WISTERIA_SIGN, ModBlocks.WISTERIA_WALL_SIGN));
    public static final Item WISTERIA_HANGING_SIGN = registerItem("wisteria_hanging_sign",
            new HangingSignItem(ModBlocks.WISTERIA_HANGING_SIGN, ModBlocks.WISTERIA_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));

    public static final Item FROST_PINE_SIGN = registerItem("frost_pine_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.FROST_PINE_SIGN, ModBlocks.FROST_PINE_WALL_SIGN));
    public static final Item FROST_PINE_HANGING_SIGN = registerItem("frost_pine_hanging_sign",
            new HangingSignItem(ModBlocks.FROST_PINE_HANGING_SIGN, ModBlocks.FROST_PINE_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));

    public static final Item BITTER_BERRIES = registerItem("bitter_berries",
            new AliasedBlockItem(ModBlocks.BITTER_BERRY_BUSH, new FabricItemSettings().food(ModFoodComponents.BITTER_BERRIES)));

    public static final Item FROST_BERRIES = registerItem("frost_berries",
            new AliasedBlockItem(ModBlocks.FROST_BERRY_BUSH, new FabricItemSettings().food(ModFoodComponents.FROST_BERRIES)));
    public static final Item SNOW_LEAF_SEEDS = registerItem("snow_leaf_seeds",
            new AliasedBlockItem(ModBlocks.SNOW_LEAF_CROP, new FabricItemSettings()));
    public static final Item SNOW_LEAF = registerItem("snow_leaf",
            new Item(new FabricItemSettings().food(ModFoodComponents.SNOW_LEAF)));

    public static final Item LEEK_SEEDS = registerItem("leek_seeds",
            new AliasedBlockItem(ModBlocks.LEEK_CROP, new FabricItemSettings()));
    public static final Item ROASTED_LEEK = registerItem("roasted_leek",
            new Item(new FabricItemSettings().food(ModFoodComponents.ROASTED_LEEK)));
    public static final Item LEEK = registerItem("leek",
            new Item(new FabricItemSettings().food(ModFoodComponents.LEEK)));
    public static final Item MOON_FRUIT = registerItem("moon_fruit",
            new Item(new FabricItemSettings().food(ModFoodComponents.LUNAR_BURST)));
    public static final Item MOON_SEEDS = registerItem("moon_seeds",
            new AliasedBlockItem(ModBlocks.MOON_CROP, new FabricItemSettings()));
    public static final Item SUN_FRUIT = registerItem("sun_fruit",
            new Item(new FabricItemSettings().food(ModFoodComponents.SOLAR_FLARE)));
    public static final Item SUN_SEEDS = registerItem("sun_seeds",
            new AliasedBlockItem(ModBlocks.SUN_CROP, new FabricItemSettings()));
    public static final Item RAW_SQUID = registerItem("raw_squid",
            new Item(new FabricItemSettings().food(ModFoodComponents.RAW_SQUID)));
    public static final Item RAW_GLOW_SQUID = registerItem("raw_glow_squid",
            new Item(new FabricItemSettings().food(ModFoodComponents.RAW_GLOW_SQUID)));
    public static final Item HONEY_GLAZED_STEAK = registerItem("honey_glazed_steak",
            new Item(new FabricItemSettings().food(ModFoodComponents.HONEY_GLAZED_STEAK)));

    public static final Item MARSHMALLOW = registerItem("marshmallow",
            new Item(new FabricItemSettings().food(ModFoodComponents.MARSHMALLOW)));
    public static final Item BURNT_MARSHMALLOW = registerItem("burnt_marshmallow",
            new Item(new FabricItemSettings().food(ModFoodComponents.BURNT_MARSHMALLOW)));

    public static final Item CONGEALED_SLIME = registerItem("congealed_slime",
            new Item(new FabricItemSettings()));

    public static final Item MALACHITE_SHARD = registerItem("malachite_shard",
            new Item(new FabricItemSettings()));
    public static final Item SMALL_MALACHITE_BUD = registerItem("small_malachite_bud",
            new AliasedBlockItem(ModBlocks.SMALL_MALACHITE_BUD, new FabricItemSettings()));
    public static final Item MEDIUM_MALACHITE_BUD = registerItem("medium_malachite_bud",
            new AliasedBlockItem(ModBlocks.MEDIUM_MALACHITE_BUD, new FabricItemSettings()));
    public static final Item LARGE_MALACHITE_BUD = registerItem("large_malachite_bud",
            new AliasedBlockItem(ModBlocks.LARGE_MALACHITE_BUD, new FabricItemSettings()));
    public static final Item MALACHITE_CLUSTER = registerItem("malachite_cluster",
            new AliasedBlockItem(ModBlocks.MALACHITE_CLUSTER, new FabricItemSettings()));

    public static final Item ICE_CRYSTAL = registerItem("ice_crystal",
            new AliasedBlockItem(ModBlocks.ICE_CRYSTAL, new FabricItemSettings()));



    public static final Item DUCK_SPAWN_EGG = registerItem("duck_spawn_egg",
            new SpawnEggItem(ModEntities.DUCK, 0x593012, 0x095213, new FabricItemSettings()));
    public static final Item GHOST_SPAWN_EGG = registerItem("ghost_spawn_egg",
            new SpawnEggItem(ModEntities.GHOST, 0xffffff, 0xffffff, new FabricItemSettings()));


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
