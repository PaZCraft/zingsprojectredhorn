package com.zing.zingsprojectredhorn.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import com.zing.zingsprojectredhorn.procedures.DiamondDragonrageBerryPlayerFinishesUsingItemProcedure;

public class DiamondDragonrageBerryItem extends Item {
	public DiamondDragonrageBerryItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(4).saturationModifier(0.3f).alwaysEdible().build(), Consumables.defaultFood().consumeSeconds(0.75F).build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		DiamondDragonrageBerryPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}