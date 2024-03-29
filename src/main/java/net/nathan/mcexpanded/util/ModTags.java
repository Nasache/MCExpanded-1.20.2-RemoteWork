package net.nathan.mcexpanded.util;


import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.nathan.mcexpanded.MCExpanded;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> MAPLE_LOGS = TagKey.of(RegistryKeys.BLOCK, new Identifier("mcexpanded", "maple_logs"));
        public static final TagKey<Block> WISTERIA_LOGS = TagKey.of(RegistryKeys.BLOCK, new Identifier("mcexpanded", "wisteria_logs"));
        public static final TagKey<Block> FROST_PINE_LOGS = TagKey.of(RegistryKeys.BLOCK, new Identifier("mcexpanded", "frost_pine_logs"));

        private static TagKey<Block> createBlockTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(MCExpanded.MOD_ID, name));
        }

        private static TagKey<Block> createCommonBlockTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier("c", name));
        }
    }

    public static class Items {

        public static final TagKey<Item> MAPLE_LOGS = TagKey.of(RegistryKeys.ITEM, new Identifier("mcexpanded", "maple_logs"));
        public static final TagKey<Item> WISTERIA_LOGS = TagKey.of(RegistryKeys.ITEM, new Identifier("mcexpanded", "wisteria_logs"));
        public static final TagKey<Item> FROST_PINE_LOGS = TagKey.of(RegistryKeys.ITEM, new Identifier("mcexpanded", "frost_pine_logs"));

        private static TagKey<Item> createItemTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(MCExpanded.MOD_ID, name));
        }

        private static TagKey<Item> createCommonItemTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier("c", name));

        }
    }
}