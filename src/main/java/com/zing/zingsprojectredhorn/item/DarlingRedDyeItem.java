package net.mcreator.zingsprojectredhorn.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DarlingRedDyeItem extends Item {
	public DarlingRedDyeItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}
}