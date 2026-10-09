package com.zing.zingsprojectredhorn.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BlobOfKlaxonItem extends Item {
	public BlobOfKlaxonItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
	}
}