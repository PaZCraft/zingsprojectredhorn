package com.zing.zingsprojectredhorn.recipe.brewing;

import net.minecraft.world.item.ItemStack;

public interface IBrewingRecipe {

    // Returns true if the item placed in the top slot is the valid ingredient
    boolean isIngredient(ItemStack ingredient);

    // Returns true if the item placed in the bottom 3 slots is the valid input potion
    boolean isInput(ItemStack input);

    // Determines the output item resulting from a successful brew mix
    ItemStack getOutput(ItemStack input, ItemStack ingredient);
}
