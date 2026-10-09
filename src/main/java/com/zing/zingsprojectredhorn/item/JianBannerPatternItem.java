package com.zing.zingsprojectredhorn.item;

import net.minecraft.world.level.block.entity.BannerPattern;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import com.zing.zingsprojectredhorn.ZiNGsProjectRedHorn;

import net.minecraft.core.component.DataComponents;

public class JianBannerPatternItem extends Item {
	public static final TagKey<BannerPattern> PROVIDED_PATTERNS = TagKey.create(Registries.BANNER_PATTERN, Identifier.fromNamespaceAndPath(ZiNGsProjectRedHorn.MODID, "pattern_item/jian_banner_pattern"));

	public JianBannerPatternItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).delayedComponent(DataComponents.PROVIDES_BANNER_PATTERNS, context -> context.getOrThrow(PROVIDED_PATTERNS)));
	}
}