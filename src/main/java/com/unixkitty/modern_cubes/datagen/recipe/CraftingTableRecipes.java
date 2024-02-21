package com.unixkitty.modern_cubes.datagen.recipe;

import com.unixkitty.modern_cubes.ModBlocks;
import com.unixkitty.modern_cubes.ModernCubes;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.level.ItemLike;
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
        craftSlabs(ModBlocks.LABORATORY_STEEL_SMALL.get(), ModBlocks.LABORATORY_STEEL_SMALL_SLAB.get(), consumer);
        uncraftSlabs(ModBlocks.LABORATORY_STEEL_SMALL.get(), ModBlocks.LABORATORY_STEEL_SMALL_SLAB.get(), consumer);

        craftSlabs(ModBlocks.CONCRETE_PAVER.get(), ModBlocks.CONCRETE_PAVER_SLAB.get(), consumer);
        craftSlabs(ModBlocks.CONCRETE_SIMPLE_TILE.get(), ModBlocks.CONCRETE_SIMPLE_TILE_SLAB.get(), consumer);
        uncraftSlabs(ModBlocks.CONCRETE_PAVER.get(), ModBlocks.CONCRETE_PAVER_SLAB.get(), consumer);
        uncraftSlabs(ModBlocks.CONCRETE_SIMPLE_TILE.get(), ModBlocks.CONCRETE_SIMPLE_TILE_SLAB.get(), consumer);

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

    private void craftSlabs(ItemLike sourceBlock, ItemLike slabsBlock, @NotNull Consumer<FinishedRecipe> consumer)
    {
        ShapedRecipeBuilder.shaped(slabsBlock, 6)
                .define('B', sourceBlock)
                .pattern("BBB")
                .unlockedBy("has_item", has(sourceBlock))
                .save(consumer, ModernCubes.MODID + ":slabs_from_" + sourceBlock.asItem());
    }

    private void uncraftSlabs(ItemLike sourceBlock, ItemLike slabsBlock, @NotNull Consumer<FinishedRecipe> consumer)
    {
        ShapedRecipeBuilder.shaped(sourceBlock)
                .define('S', slabsBlock)
                .pattern("S")
                .pattern("S")
                .unlockedBy("has_item", has(sourceBlock))
                .save(consumer, ModernCubes.MODID + ":slabs_to_" + sourceBlock.asItem());
    }
}
