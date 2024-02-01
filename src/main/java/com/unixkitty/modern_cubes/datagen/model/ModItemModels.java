package com.unixkitty.modern_cubes.datagen.model;

import com.unixkitty.modern_cubes.ModBlocks;
import com.unixkitty.modern_cubes.ModernCubes;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItemModels extends ItemModelProvider
{

    public ModItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper)
    {
        super(generator, ModernCubes.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        copyParent(ModBlocks.CONCRETE_ASPHALT.get());
        copyParent(ModBlocks.CONCRETE_BURNT.get());
        copyParent(ModBlocks.CONCRETE_GRAY.get());
        copyParent(ModBlocks.CONCRETE_HARSH.get());
        copyParent(ModBlocks.CONCRETE_SIMPLE.get());
        copyParent(ModBlocks.CONCRETE_SIMPLE_TILE.get());

        copyParent(ModBlocks.CEILING_PLATE.get());
        copyParent(ModBlocks.CEILING_TILE.get());
        copyParent(ModBlocks.FLOOR_PLATE.get());
        copyParent(ModBlocks.FLOOR_PLATE_DARK.get());
        copyParent(ModBlocks.FLOOR_PLATE_LIGHT.get());
        copyParent(ModBlocks.PLATING_COPPER.get());
        copyParent(ModBlocks.PLATING_IRON.get());
        copyParent(ModBlocks.PLATING_IRON_RUSTED.get());
        copyParent(ModBlocks.PLATING_LEAD.get());
        copyParent(ModBlocks.PLATING_STEEL.get());
        copyParent(ModBlocks.PLATING_TITANIUM_STEEL.get());

        copyParent(ModBlocks.SHEETMETAL_ALUMINUM.get());
        copyParent(ModBlocks.SHEETMETAL_COPPER.get());
        copyParent(ModBlocks.SHEETMETAL_GOLD.get());
        copyParent(ModBlocks.SHEETMETAL_IRON.get());
        copyParent(ModBlocks.SHEETMETAL_LEAD.get());
        copyParent(ModBlocks.SHEETMETAL_NICKEL.get());
        copyParent(ModBlocks.SHEETMETAL_SILVER.get());
        copyParent(ModBlocks.SHEETMETAL_STEEL.get());
        copyParent(ModBlocks.SHEETMETAL_URANIUM.get());
        copyParent(ModBlocks.SHEETMETAL_COPPER_ALT.get());
        copyParent(ModBlocks.SHEETMETAL_IRON_ALT.get());

        copyParent(ModBlocks.SOFT_PLATE_WHITE.get());
        copyParent(ModBlocks.SOFT_PLATE_ORANGE.get());
        copyParent(ModBlocks.SOFT_PLATE_MAGENTA.get());
        copyParent(ModBlocks.SOFT_PLATE_LIGHT_BLUE.get());
        copyParent(ModBlocks.SOFT_PLATE_YELLOW.get());
        copyParent(ModBlocks.SOFT_PLATE_LIME.get());
        copyParent(ModBlocks.SOFT_PLATE_PINK.get());
        copyParent(ModBlocks.SOFT_PLATE_GRAY.get());
        copyParent(ModBlocks.SOFT_PLATE_LIGHT_GRAY.get());
        copyParent(ModBlocks.SOFT_PLATE_CYAN.get());
        copyParent(ModBlocks.SOFT_PLATE_PURPLE.get());
        copyParent(ModBlocks.SOFT_PLATE_BLUE.get());
        copyParent(ModBlocks.SOFT_PLATE_BROWN.get());
        copyParent(ModBlocks.SOFT_PLATE_GREEN.get());
        copyParent(ModBlocks.SOFT_PLATE_RED.get());
        copyParent(ModBlocks.SOFT_PLATE_BLACK.get());

        basicItem(ModBlocks.STEEL_DOOR.get().asItem());
        basicItem(ModBlocks.STRONG_DOOR.get().asItem());
        basicItem(ModBlocks.STURDY_RUSTY_DOOR.get().asItem());
        basicItem(ModBlocks.STURDY_STEEL_DOOR.get().asItem());
        basicItem(ModBlocks.STURDY_WHITE_STEEL_DOOR.get().asItem());
        basicItem(ModBlocks.WARNING_RUSTY_DOOR.get().asItem());
        basicItem(ModBlocks.WARNING_STEEL_DOOR.get().asItem());
        basicItem(ModBlocks.WARNING_WHITE_STEEL_DOOR.get().asItem());
        basicItem(ModBlocks.WHITE_STEEL_DOOR.get().asItem());
        basicItem(ModBlocks.BLUE_STEEL_DOOR_GLASS.get().asItem());
        basicItem(ModBlocks.FIRE_DOOR.get().asItem());
        basicItem(ModBlocks.STURDY_WHITE_STEEL_DOOR_GLASS.get().asItem());
        basicItem(ModBlocks.WHITE_STEEL_DOOR_GLASS.get().asItem());

        copyParent(ModBlocks.BEAM.get());
        copyParent(ModBlocks.BEAM_BOLTS.get());

        copyParent(ModBlocks.REINFORCED_GLASS.get());
    }

    @SuppressWarnings("ConstantConditions")
    private void copyParent(Block block)
    {
        withExistingParent(ForgeRegistries.ITEMS.getKey(block.asItem()).getPath(), modLoc("block/" + block.asItem().toString().toLowerCase()));
    }
}
