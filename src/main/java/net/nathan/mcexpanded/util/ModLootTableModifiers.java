package net.nathan.mcexpanded.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.nathan.mcexpanded.item.ModItems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModLootTableModifiers {
    private static final Identifier SNIFFER_DIGGING_ID
            = new Identifier("minecraft", "gameplay/sniffer_digging");

    private static final Identifier PLAINS_VILLAGE_CHEST_ID
            = new Identifier("minecraft", "chests/village/village_plains_house");
    private static final Identifier TAIGA_VILLAGE_CHEST_ID
            = new Identifier("minecraft", "chests/village/village_taiga_house");
    private static final Identifier SNOW_VILLAGE_CHEST_ID
            = new Identifier("minecraft", "chests/village/village_snowy_house");
    private static final Identifier DESERT_VILLAGE_CHEST_ID
            = new Identifier("minecraft", "chests/village/village_desert_house");
    private static final Identifier SAVANNA_VILLAGE_CHEST_ID
            = new Identifier("minecraft", "chests/village/village_savanna_house");

    private static final Identifier SLIME_ID
            = new Identifier("minecraft", "entities/slime");
    private static final Identifier SQUID_ID
            = new Identifier("minecraft", "entities/squid");
    private static final Identifier GLOW_SQUID_ID
            = new Identifier("minecraft", "entities/glow_squid");


    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(SNIFFER_DIGGING_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.30f))
                        .with(ItemEntry.builder(ModItems.MOON_SEEDS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.30f))
                        .with(ItemEntry.builder(ModItems.SUN_SEEDS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
                tableBuilder.pool(poolBuilder2.build());
                }

            if(PLAINS_VILLAGE_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.70f))
                        .with(ItemEntry.builder(ModItems.BITTER_BERRIES))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 5.0f)).build());
                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.35f))
                        .with(ItemEntry.builder(ModItems.LEEK_SEEDS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 6.0f)).build());
                LootPool.Builder poolBuilder3 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.10f))
                        .with(ItemEntry.builder(ModItems.LEEK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build());

                tableBuilder.pool(poolBuilder.build());
                tableBuilder.pool(poolBuilder2.build());
                tableBuilder.pool(poolBuilder3.build());
            }

            if(TAIGA_VILLAGE_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.60f))
                        .with(ItemEntry.builder(ModItems.LEEK_SEEDS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 6.0f)).build());
                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.45f))
                        .with(ItemEntry.builder(ModItems.LEEK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build());

                tableBuilder.pool(poolBuilder.build());
                tableBuilder.pool(poolBuilder2.build());
            }
            if(SNOW_VILLAGE_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.45f))
                        .with(ItemEntry.builder(ModItems.LEEK_SEEDS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 6.0f)).build());
                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f))
                        .with(ItemEntry.builder(ModItems.LEEK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build());

                tableBuilder.pool(poolBuilder.build());
                tableBuilder.pool(poolBuilder2.build());
            }
            if(SLIME_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f))
                        .with(ItemEntry.builder(ModItems.CONGEALED_SLIME))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());


                tableBuilder.pool(poolBuilder.build());
            }
            if(SQUID_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f))
                        .with(ItemEntry.builder(ModItems.RAW_SQUID))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());


                tableBuilder.pool(poolBuilder.build());
            }
            if(GLOW_SQUID_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f))
                        .with(ItemEntry.builder(ModItems.RAW_GLOW_SQUID))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());


                tableBuilder.pool(poolBuilder.build());
            }

        });



   //  LootTableEvents.REPLACE.register((resourceManager, lootManager, id, original, source) -> {
   //       if(SNIFFER_DIGGING_ID.equals(id)) {
   //           List<LootPoolEntry> entries = new ArrayList<>(Arrays.asList(original.pools(0).entries);
   //           entries.add(ItemEntry.builder(ModItems.MOON_SEEDS).build());
   //           LootPool.Builder pool = LootPool.builder().with(entries);
   //           return LootTable.builder().pool(pool).build();
   //       }

   //       return null;
   //   });
    }
}
