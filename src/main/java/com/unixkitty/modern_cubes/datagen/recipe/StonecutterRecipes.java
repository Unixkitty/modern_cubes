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
        simpleAmount(ModBlocks.LABORATORY_STEEL_SMALL_SLAB.get(), 2, ModBlocks.LABORATORY_STEEL_SMALL.get(), consumer);

        categoryItem(Items.IRON_INGOT, consumer,
                ModBlocks.LABORATORY_TILE_PLAIN.get(),
                ModBlocks.LABORATORY_TILE_PLAIN_CTM.get(),
                ModBlocks.LABORATORY_STEEL_LARGE.get(),
                ModBlocks.LABORATORY_STEEL_SMALL.get(),
                ModBlocks.LABORATORY_PANEL.get(),
                ModBlocks.LABORATORY_ROUNDEL.get(),
                ModBlocks.LABORATORY_SCREEN_CLEAR.get(),
                ModBlocks.LABORATORY_SCREEN_FUZZY.get(),
                ModBlocks.LABORATORY_TILES.get(),
                ModBlocks.LABORATORY_TILES_CHECKER.get(),
                ModBlocks.LABORATORY_TILES_FLOOR.get()
        );

        simple(ModBlocks.TECHNICAL_CAUTION_TAPE.get(), Items.IRON_INGOT, consumer);

        categoryItem(Items.IRON_INGOT, consumer,
                ModBlocks.TYRIAN_BLACK.get(),
                ModBlocks.TYRIAN_BLACK_ALT.get(),
                ModBlocks.TYRIAN_BLUE_PLATING.get(),
                ModBlocks.TYRIAN_DENT.get(),
                ModBlocks.TYRIAN_DIAGONAL.get(),
                ModBlocks.TYRIAN_ELABORATE.get(),
                ModBlocks.TYRIAN_PLATE.get(),
                ModBlocks.TYRIAN_PLATE_TILE.get(),
                ModBlocks.TYRIAN_PLATE_TILE_CTM.get(),
                ModBlocks.TYRIAN_TILES.get()
        );

        categoryItem(Items.COPPER_INGOT, consumer,
                ModBlocks.FACTORY_DOTS.get(),
                ModBlocks.FACTORY_DOTS_LIGHT.get(),
                ModBlocks.FACTORY_HAZARD.get(),
                ModBlocks.FACTORY_HAZARD_ORANGE.get(),
                ModBlocks.FACTORY_RUST.get(),
                ModBlocks.FACTORY_WIREFRAME.get(),
                ModBlocks.FACTORY_WIREFRAME_WHITE.get()
        );

        categoryItem(Items.IRON_INGOT, consumer,
                ModBlocks.HEX_BLACK.get(),
                ModBlocks.HEX_BLUE.get(),
                ModBlocks.HEX_BROWN.get(),
                ModBlocks.HEX_CYAN.get(),
                ModBlocks.HEX_GRAY.get(),
                ModBlocks.HEX_GREEN.get(),
                ModBlocks.HEX_LIGHT_BLUE.get(),
                ModBlocks.HEX_LIGHT_GRAY.get(),
                ModBlocks.HEX_LIME.get(),
                ModBlocks.HEX_MAGENTA.get(),
                ModBlocks.HEX_ORANGE.get(),
                ModBlocks.HEX_PINK.get(),
                ModBlocks.HEX_PURPLE.get(),
                ModBlocks.HEX_RED.get(),
                ModBlocks.HEX_WHITE.get(),
                ModBlocks.HEX_YELLOW.get()
        );

        category(Items.IRON_BLOCK, consumer,
                ModBlocks.SPACE_PLATING_INSET.get(),
                ModBlocks.SPACE_PLATING_RIVETS.get(),
                ModBlocks.SPACE_PLATING_STRIPE_BLACK.get(),
                ModBlocks.SPACE_PLATING_STRIPE_BLUE.get(),
                ModBlocks.SPACE_PLATING_STRIPE_BROWN.get(),
                ModBlocks.SPACE_PLATING_STRIPE_CYAN.get(),
                ModBlocks.SPACE_PLATING_STRIPE_GRAY.get(),
                ModBlocks.SPACE_PLATING_STRIPE_GREEN.get(),
                ModBlocks.SPACE_PLATING_STRIPE_LIGHT_BLUE.get(),
                ModBlocks.SPACE_PLATING_STRIPE_LIGHT_GRAY.get(),
                ModBlocks.SPACE_PLATING_STRIPE_LIME.get(),
                ModBlocks.SPACE_PLATING_STRIPE_MAGENTA.get(),
                ModBlocks.SPACE_PLATING_STRIPE_ORANGE.get(),
                ModBlocks.SPACE_PLATING_STRIPE_PINK.get(),
                ModBlocks.SPACE_PLATING_STRIPE_PURPLE.get(),
                ModBlocks.SPACE_PLATING_STRIPE_RED.get(),
                ModBlocks.SPACE_PLATING_STRIPE_WHITE.get(),
                ModBlocks.SPACE_PLATING_STRIPE_YELLOW.get(),
                ModBlocks.SPACE_PLATING_VENT.get(),
                ModBlocks.SPACE_PLATING_VENT_CTM.get(),
                ModBlocks.SPACE_PLATING_TILE.get(),
                ModBlocks.SPACE_PLATING.get(),
                ModBlocks.SPACE_PLATING_SQUARE.get()
        );

        simpleUndoable(ModBlocks.SPACE_PLATING_HATCH.get(), Items.IRON_TRAPDOOR, consumer);

        simpleAmount(ModBlocks.CONCRETE_PAVER_SLAB.get(), 2, ModBlocks.CONCRETE_PAVER.get(), consumer);
        simpleAmount(ModBlocks.CONCRETE_SIMPLE_TILE_SLAB.get(), 2, ModBlocks.CONCRETE_SIMPLE_TILE.get(), consumer);

        category(Items.GRAY_CONCRETE, consumer,
                ModBlocks.ASPHALT_PLAIN.get(),
                ModBlocks.CONCRETE_PAVER.get(),
                ModBlocks.CONCRETE_PLAIN.get(),
                ModBlocks.CONCRETE_ASPHALT.get(),
                ModBlocks.CONCRETE_GRAY.get(),
                ModBlocks.CONCRETE_HARSH.get(),
                ModBlocks.CONCRETE_SIMPLE.get(),
                ModBlocks.CONCRETE_SIMPLE_TILE.get()
        );

        categoryItem(Items.COPPER_INGOT, consumer,
                ModBlocks.CEILING_PLATE.get(),
                ModBlocks.CEILING_TILE.get(),
                ModBlocks.FLOOR_PLATE.get(),
                ModBlocks.FLOOR_PLATE_DARK.get(),
                ModBlocks.FLOOR_PLATE_LIGHT.get(),
                ModBlocks.PLATING_COPPER.get(),
                ModBlocks.PLATING_IRON.get(),
                ModBlocks.PLATING_IRON_RUSTED.get(),
                ModBlocks.PLATING_LEAD.get(),
                ModBlocks.PLATING_STEEL.get(),
                ModBlocks.PLATING_TITANIUM_STEEL.get()
        );

        categoryItem(Items.COPPER_INGOT, consumer,
                ModBlocks.SHEETMETAL_ALUMINUM.get(),
                ModBlocks.SHEETMETAL_COPPER.get(),
                ModBlocks.SHEETMETAL_GOLD.get(),
                ModBlocks.SHEETMETAL_IRON.get(),
                ModBlocks.SHEETMETAL_LEAD.get(),
                ModBlocks.SHEETMETAL_NICKEL.get(),
                ModBlocks.SHEETMETAL_SILVER.get(),
                ModBlocks.SHEETMETAL_STEEL.get(),
                ModBlocks.SHEETMETAL_URANIUM.get(),
                ModBlocks.SHEETMETAL_COPPER_ALT.get(),
                ModBlocks.SHEETMETAL_IRON_ALT.get()
        );

        categoryItem(Items.COPPER_INGOT, consumer,
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

        simpleUndoable(ModBlocks.REINFORCED_GLASS_CTM.get(), ModBlocks.REINFORCED_GLASS.get(), consumer);
    }

    private void categoryItem(ItemLike ingredient, Consumer<FinishedRecipe> consumer, ItemLike mainResult, ItemLike... results)
    {
        simple(mainResult, ingredient, consumer);

        if (results != null && results.length > 0)
        {
            category(mainResult, consumer, results);
        }
    }

    //This makes things craftable into each other, Chisel-style
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
        simpleAmount(result, 1, ingredient, consumer);
    }

    private void simpleAmount(ItemLike result, int amount, ItemLike ingredient, @NotNull Consumer<FinishedRecipe> consumer)
    {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ingredient), result, amount)
                .unlockedBy("has_item", has(ingredient))
                .save(consumer, ModernCubes.MODID + ":" + result.asItem().toString().toLowerCase() + "_from_" + ingredient.asItem().toString().toLowerCase() + "_stonecutting");
    }
}
