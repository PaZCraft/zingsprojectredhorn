package com.zing.zingsprojectredhorn.item;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;

import com.zing.zingsprojectredhorn.ZiNGsProjectRedHorn;

import net.minecraft.core.registries.Registries;

public class DiscMyDarlingItem extends Item {
	public DiscMyDarlingItem(Item.Properties properties) {
		super(properties.jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, Identifier.fromNamespaceAndPath(ZiNGsProjectRedHorn.MODID, "disc_my_darling"))));
	}
}