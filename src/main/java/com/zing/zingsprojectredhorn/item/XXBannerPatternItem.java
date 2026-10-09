package com.zing.zingsprojectredhorn.item;

import net.minecraft.world.level.block.entity.BannerPattern;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.component.DataComponents;

import com.zing.zingsprojectredhorn.ZingsProjectRedHornMod;

public class XXBannerPatternItem extends Item {
	public static final TagKey<BannerPattern> PROVIDED_PATTERNS = TagKey.create(Registries.BANNER_PATTERN, Identifier.fromNamespaceAndPath(ZingsProjectRedHornMod.MODID, "pattern_item/xx_banner_pattern"));

	public XXBannerPatternItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).delayedComponent(DataComponents.PROVIDES_BANNER_PATTERNS, context -> context.getOrThrow(PROVIDED_PATTERNS)));
	}
}