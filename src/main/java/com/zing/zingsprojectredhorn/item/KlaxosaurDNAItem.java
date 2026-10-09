package net.mcreator.zingsprojectredhorn.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class KlaxosaurDNAItem extends Item {
	public KlaxosaurDNAItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
	}
}