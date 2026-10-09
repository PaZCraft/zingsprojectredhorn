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
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.HolderSet;

import com.zing.zingsprojectredhorn.init.ZingsProjectRedHornModPotions;

@EventBusSubscriber(modid = "zings_project_red_horn", bus = EventBusSubscriber.Bus.GAME)
public class KlaxonTransformationTwoBrewingRecipe implements IBrewingRecipe {

	@SubscribeEvent
	public static void init(RegisterBrewingRecipesEvent event) {
		// 1. Explicitly retrieve the PotionBrewing.Builder object
		PotionBrewing.Builder builder = event.getBuilder();
		
		// 2. Add your custom IBrewingRecipe instance
		builder.addRecipe(new KlaxonTransformationTwoBrewingRecipe());
	}
	
	// Ensure you implement your mandatory IBrewingRecipe overrides below...
}

	@Override
	public boolean isInput(ItemStack input) {
		Item inputItem = input.getItem();
		return (inputItem == Items.POTION || inputItem == Items.SPLASH_POTION || inputItem == Items.LINGERING_POTION) && input.getOrDefault(DataComponents.POTION_CONTENTS, PotionContents.EMPTY).is(Potions.MUNDANE);
	}

	public boolean isIngredient(ItemStack ingredient) {
		return Ingredient.of(HolderSet.emptyNamed(BuiltInRegistries.ITEM, ItemTags.create(Identifier.parse("zings_project_red_horn:klaxon_transformation_level_two_ingredients")))).test(ingredient);
	}

	public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
		if (isInput(input) && isIngredient(ingredient)) {
			return PotionContents.createItemStack(input.getItem(), ZingsProjectRedHornModPotions.KLAXON_TRANSFORMATION_II);
		}
		return ItemStack.EMPTY;
	}
}