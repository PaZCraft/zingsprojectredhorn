package net.mcreator.zingsprojectredhorn.item;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.zingsprojectredhorn.ZingsProjectRedHornMod;

public class DiscMyDarlingItem extends Item {
	public DiscMyDarlingItem(Item.Properties properties) {
		super(properties.jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, Identifier.fromNamespaceAndPath(ZingsProjectRedHornMod.MODID, "disc_my_darling"))));
	}
}