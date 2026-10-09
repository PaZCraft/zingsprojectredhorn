package net.mcreator.zingsprojectredhorn.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class HoneyRawMuttonItem extends Item {
	public HoneyRawMuttonItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(8).saturationModifier(0.7f).alwaysEdible().build()));
	}
}