package com.unixkitty.modern_cubes.datagen.recipe;

import com.unixkitty.modern_cubes.ModBlocks;
import com.unixkitty.modern_cubes.ModernCubes;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class StonecutterRecipes extends RecipeProvider
{
    public StonecutterRecipes(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> consumer)
    {
        category(Items.IRON_BLOCK, consumer,
                ModBlocks.SOFT_PLATE_WHITE.get(),
                ModBlocks.SOFT_PLATE_ORANGE.get(),
                ModBlocks.SOFT_PLATE_MAGENTA.get(),
                ModBlocks.SOFT_PLATE_LIGHT_BLUE.get(),
                ModBlocks.SOFT_PLATE_YELLOW.get(),
                ModBlocks.SOFT_PLATE_LIME.get(),
                ModBlocks.SOFT_PLATE_PINK.get(),
                ModBlocks.SOFT_PLATE_GRAY.get(),
                ModBlocks.SOFT_PLATE_LIGHT_GRAY.get(),
                ModBlocks.SOFT_PLATE_CYAN.get(),
                ModBlocks.SOFT_PLATE_PURPLE.get(),
                ModBlocks.SOFT_PLATE_BLUE.get(),
                ModBlocks.SOFT_PLATE_BROWN.get(),
                ModBlocks.SOFT_PLATE_GREEN.get(),
                ModBlocks.SOFT_PLATE_RED.get(),
                ModBlocks.SOFT_PLATE_BLACK.get()
        );

        category(Items.IRON_DOOR, consumer,
                ModBlocks.STEEL_DOOR.get(),
                ModBlocks.STRONG_DOOR.get(),
                ModBlocks.STURDY_RUSTY_DOOR.get(),
                ModBlocks.STURDY_STEEL_DOOR.get(),
                ModBlocks.STURDY_WHITE_STEEL_DOOR.get(),
                ModBlocks.WARNING_RUSTY_DOOR.get(),
                ModBlocks.WARNING_STEEL_DOOR.get(),
                ModBlocks.WARNING_WHITE_STEEL_DOOR.get(),
                ModBlocks.WHITE_STEEL_DOOR.get(),
                ModBlocks.BLUE_STEEL_DOOR_GLASS.get(),
                ModBlocks.FIRE_DOOR.get(),
                ModBlocks.STURDY_WHITE_STEEL_DOOR_GLASS.get(),
                ModBlocks.WHITE_STEEL_DOOR_GLASS.get()
        );

        simple(ModBlocks.BEAM.get(), Items.IRON_INGOT, consumer);
        simpleUndoable(ModBlocks.BEAM_BOLTS.get(), ModBlocks.BEAM.get(), consumer);
    }

    //Make things craftable into each other, Chisel-style
    private void category(ItemLike ingredient, @NotNull Consumer<FinishedRecipe> consumer, ItemLike... results)
    {
        for (ItemLike result : results)
        {
            simple(result, ingredient, consumer);
        }

        for (int i = 0; i < results.length; i++)
        {
            for (int j = 0; j < results.length; j++)
            {
                if (i == j) continue;

                simple(results[j], results[i], consumer);
            }
        }
    }

    private void simpleUndoable(ItemLike result, ItemLike ingredient, @NotNull Consumer<FinishedRecipe> consumer)
    {
        simple(result, ingredient, consumer);
        simple(ingredient, result, consumer);
    }

    private void simple(ItemLike result, ItemLike ingredient, @NotNull Consumer<FinishedRecipe> consumer)
    {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ingredient), result)
                .unlockedBy("has_item", has(ingredient))
                .save(consumer, ModernCubes.MODID + ":" + result.asItem().toString().toLowerCase() + "_from_" + ingredient.asItem().toString().toLowerCase() + "_stonecutting");
    }
}
