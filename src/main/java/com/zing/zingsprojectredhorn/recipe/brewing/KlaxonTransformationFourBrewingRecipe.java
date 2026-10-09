package com.zing.zingsprojectredhorn.recipe.brewing;

import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.HolderSet;

import com.zing.zingsprojectredhorn.init.ZingsProjectRedHornModPotions;

@EventBusSubscriber(modid = "zings_project_red_horn", bus = EventBusSubscriber.Bus.GAME)
public class KlaxonTransformationFourBrewingRecipe implements IBrewingRecipe {
	
	@SubscribeEvent
	public static void init(RegisterBrewingRecipesEvent event) {
		// Cleaned up: Removed the (Object) cast so the compiler can read the Builder type
		PotionBrewing.Builder builder = event.getBuilder();
		builder.addRecipe(new KlaxonTransformationFourBrewingRecipe());
	}

	@Override
	public boolean isInput(ItemStack input) {
		Item inputItem = input.getItem();
		return (inputItem == Items.POTION || inputItem == Items.SPLASH_POTION || inputItem == Items.LINGERING_POTION) 
				&& input.getOrDefault(DataComponents.POTION_CONTENTS, PotionContents.EMPTY).is(Potions.MUNDANE);
	}

	@Override
	public boolean isIngredient(ItemStack ingredient) {
		// Fixed: Replaced Identifier.parse with ResourceLocation.fromNamespaceAndPath
		return Ingredient.of(HolderSet.emptyNamed(
			BuiltInRegistries.ITEM, 
			ItemTags.create(ResourceLocation.fromNamespaceAndPath("zings_project_red_horn", "klaxon_transformation_level_four_ingredients"))
		)).test(ingredient);
	}

	@Override
	public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
		if (isInput(input) && isIngredient(ingredient)) {
			return PotionContents.createItemStack(input.getItem(), ZingsProjectRedHornModPotions.KLAXON_TRANSFORMATION_IV);
		}
		return ItemStack.EMPTY;
	}
}
