package com.zing.zingsprojectredhorn.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PrismaxShardItem extends Item {
	public PrismaxShardItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
	}
}