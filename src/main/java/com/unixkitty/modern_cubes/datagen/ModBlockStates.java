package com.unixkitty.modern_cubes.datagen;

import com.unixkitty.modern_cubes.ModBlocks;
import com.unixkitty.modern_cubes.ModernCubes;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlockStates extends BlockStateProvider
{
    public ModBlockStates(DataGenerator generator, ExistingFileHelper existingFileHelper)
    {
        super(generator, ModernCubes.MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        simpleCutoutBlock(ModBlocks.REINFORCED_GLASS.get());
    }

    protected void simpleCutoutBlock(Block block)
    {
        simpleBlock(block, models().cubeAll(ForgeRegistries.BLOCKS.getKey(block).getPath(), blockTexture(block)).renderType("cutout"));
    }
}
