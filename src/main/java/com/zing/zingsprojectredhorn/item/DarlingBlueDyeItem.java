package com.zing.zingsprojectredhorn.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DarlingBlueDyeItem extends Item {
	public DarlingBlueDyeItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}
}