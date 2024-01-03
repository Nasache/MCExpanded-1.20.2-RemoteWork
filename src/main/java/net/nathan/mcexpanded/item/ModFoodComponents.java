package net.nathan.mcexpanded.item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {
    public static final FoodComponent BITTER_BERRIES = new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build();
    public static final FoodComponent LEEK = new FoodComponent.Builder().hunger(2).saturationModifier(4f).build();
    public static final FoodComponent ROASTED_LEEK = new FoodComponent.Builder().hunger(6).saturationModifier(6.5f).build();
    public static final FoodComponent MOON_FRUIT = new FoodComponent.Builder().hunger(6).saturationModifier(6.5f).build();
    public static final FoodComponent SUN_FRUIT = new FoodComponent.Builder().hunger(6).saturationModifier(6.5f).build();
}
