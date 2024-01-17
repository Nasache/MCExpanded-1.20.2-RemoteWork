package net.nathan.mcexpanded.item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {
    public static final FoodComponent BITTER_BERRIES = new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build();
    public static final FoodComponent LEEK = new FoodComponent.Builder().hunger(2).saturationModifier(4f).build();
    public static final FoodComponent ROASTED_LEEK = new FoodComponent.Builder().hunger(6).saturationModifier(6.5f).build();
    public static final FoodComponent LUNAR_BURST = new FoodComponent.Builder().hunger(6).saturationModifier(6.5f).build();
    public static final FoodComponent SOLAR_FLARE = new FoodComponent.Builder().hunger(6).saturationModifier(6.5f).build();
    public static final FoodComponent RAW_SQUID = new FoodComponent.Builder().hunger(2).saturationModifier(1f).build();
    public static final FoodComponent RAW_GLOW_SQUID = new FoodComponent.Builder().hunger(2).saturationModifier(1f).build();
    public static final FoodComponent HONEY_GLAZED_STEAK = new FoodComponent.Builder().hunger(12).saturationModifier(14f).build();
}
