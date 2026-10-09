package com.zing.zingsprojectredhorn.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class HoneyRawPorkchopItem extends Item {
	public HoneyRawPorkchopItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(8).saturationModifier(0.7f).alwaysEdible().build()));
	}
}