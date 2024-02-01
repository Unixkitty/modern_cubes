package com.unixkitty.modern_cubes.datagen.model;

import com.unixkitty.modern_cubes.ModBlocks;
import com.unixkitty.modern_cubes.ModernCubes;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

public class ModBlockStates extends BlockStateProvider
{
    public ModBlockStates(DataGenerator generator, ExistingFileHelper existingFileHelper)
    {
        super(generator, ModernCubes.MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        customDoor((DoorBlock) ModBlocks.STEEL_DOOR.get());
        customDoor((DoorBlock) ModBlocks.STRONG_DOOR.get());
        customDoor((DoorBlock) ModBlocks.STURDY_RUSTY_DOOR.get());
        customDoor((DoorBlock) ModBlocks.STURDY_STEEL_DOOR.get());
        customDoor((DoorBlock) ModBlocks.STURDY_WHITE_STEEL_DOOR.get());
        customDoor((DoorBlock) ModBlocks.WARNING_RUSTY_DOOR.get());
        customDoor((DoorBlock) ModBlocks.WARNING_STEEL_DOOR.get());
        customDoor((DoorBlock) ModBlocks.WARNING_WHITE_STEEL_DOOR.get());
        customDoor((DoorBlock) ModBlocks.WHITE_STEEL_DOOR.get());

        customDoorCutout((DoorBlock) ModBlocks.BLUE_STEEL_DOOR_GLASS.get());
        customDoorCutout((DoorBlock) ModBlocks.FIRE_DOOR.get());
        customDoorCutout((DoorBlock) ModBlocks.STURDY_WHITE_STEEL_DOOR_GLASS.get());
        customDoorCutout((DoorBlock) ModBlocks.WHITE_STEEL_DOOR_GLASS.get());

        customAxisBlock((RotatedPillarBlock) ModBlocks.BEAM.get());
        customAxisBlock((RotatedPillarBlock) ModBlocks.BEAM_BOLTS.get(), ModBlocks.BEAM.get());

        simpleCutoutBlock(ModBlocks.REINFORCED_GLASS.get());
    }

    private void customDoor(DoorBlock block)
    {
        doorBlock(block, extendBlockTexture(blockTexture(block), "_bottom"), extendBlockTexture(blockTexture(block), "_top"));
    }

    private void customDoorCutout(DoorBlock block)
    {
        doorBlockWithRenderType(block, extendBlockTexture(blockTexture(block), "_bottom"), extendBlockTexture(blockTexture(block), "_top"), "cutout");
    }

    private void customAxisBlock(RotatedPillarBlock block)
    {
        customAxisBlock(block, block);
    }

    private void customAxisBlock(RotatedPillarBlock block, Block blockTop)
    {
        axisBlock(block, blockTexture(block), extendBlockTexture(blockTexture(blockTop), "_top"));
    }

    private ResourceLocation extendBlockTexture(ResourceLocation rl, String suffix)
    {
        return new ResourceLocation(rl.getNamespace(), rl.getPath() + suffix);
    }

    private void simpleCutoutBlock(Block block)
    {
        simpleBlock(block, models().cubeAll(Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block)).getPath(), blockTexture(block)).renderType("cutout"));
    }
}
