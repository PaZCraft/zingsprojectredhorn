package com.zing.zingsprojectredhorn.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GlassPieceItem extends Item {
	public GlassPieceItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
	}
}