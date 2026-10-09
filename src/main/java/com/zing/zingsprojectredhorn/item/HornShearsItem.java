package com.zing.zingsprojectredhorn.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.core.component.DataComponents;

public class HornShearsItem extends ShearsItem {
	public HornShearsItem(Item.Properties properties) {
		super(properties.component(DataComponents.TOOL, ShearsItem.createToolProperties()).durability(1000).fireResistant().enchantable(20));
	}

	@Override
	public float getDestroySpeed(ItemStack stack, BlockState blockstate) {
		return 15f;
	}
}