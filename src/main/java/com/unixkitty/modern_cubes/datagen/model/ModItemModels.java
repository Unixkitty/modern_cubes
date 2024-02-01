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
