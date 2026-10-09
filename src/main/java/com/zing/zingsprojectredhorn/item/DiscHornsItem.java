package com.zing.zingsprojectredhorn.item;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import com.zing.zingsprojectredhorn.ZingsProjectRedHornMod;

public class DiscHornsItem extends Item {
	public DiscHornsItem(Item.Properties properties) {
		super(properties.jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, Identifier.fromNamespaceAndPath(ZingsProjectRedHornMod.MODID, "disc_horns"))));
	}
}