package com.unixkitty.modern_cubes.datagen;

import com.unixkitty.modern_cubes.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraftforge.common.Tags;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class CraftingTableRecipes extends RecipeProvider
{
    public CraftingTableRecipes(DataGenerator generator)
    {
        super(generator);
    }

    @Override
    protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> consumer)
    {
        //Reinforced Glass
        ShapedRecipeBuilder.shaped(ModBlocks.REINFORCED_GLASS.get().asItem(), 16)
                .define('i', Tags.Items.INGOTS_IRON)
                .define('G', Tags.Items.GLASS_COLORLESS)
                .define('O', Tags.Items.OBSIDIAN)
                .pattern("iGi")
                .pattern("GOG")
                .pattern("iGi")
                .unlockedBy("has_item", has(Tags.Items.OBSIDIAN))
                .save(consumer);
    }
}
