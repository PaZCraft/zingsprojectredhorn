package com.zing.zingsprojectredhorn.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ZeroTwosLimiterItem extends Item {
	public ZeroTwosLimiterItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}
}