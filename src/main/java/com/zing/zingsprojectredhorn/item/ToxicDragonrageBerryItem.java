package net.mcreator.zingsprojectredhorn.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.zingsprojectredhorn.procedures.ToxicDragonrageBerryPlayerFinishesUsingItemProcedure;

public class ToxicDragonrageBerryItem extends Item {
	public ToxicDragonrageBerryItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(4).saturationModifier(0.3f).alwaysEdible().build(), Consumables.defaultFood().consumeSeconds(0.75F).build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		ToxicDragonrageBerryPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}