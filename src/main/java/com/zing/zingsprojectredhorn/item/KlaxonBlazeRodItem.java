package com.zing.zingsprojectredhorn.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class KlaxonBlazeRodItem extends Item {
	public KlaxonBlazeRodItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}
}