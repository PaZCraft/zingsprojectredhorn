package net.mcreator.zingsprojectredhorn.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class ZeroniumShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 5000, 15f, 0, 20, TagKey.create(Registries.ITEM, Identifier.parse("zings_project_red_horn:zeronium_shovel_repair_items")));

	public ZeroniumShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 11f, -3f, properties.fireResistant());
	}
}