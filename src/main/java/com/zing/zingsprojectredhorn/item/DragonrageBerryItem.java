package com.zing.zingsprojectredhorn.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class DragonrageBerryItem extends Item {
	public DragonrageBerryItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(4).saturationModifier(0.3f).alwaysEdible().build(), Consumables.defaultFood().consumeSeconds(0.75F).build()));
	}
}