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
        simpleBlock(ModBlocks.CONCRETE_ASPHALT.get());
        simpleBlock(ModBlocks.CONCRETE_BURNT.get());
        simpleBlock(ModBlocks.CONCRETE_GRAY.get());
        simpleBlock(ModBlocks.CONCRETE_HARSH.get());
        simpleBlock(ModBlocks.CONCRETE_SIMPLE.get());
        simpleBlock(ModBlocks.CONCRETE_SIMPLE_TILE.get());

        customAxisBlockSingle((RotatedPillarBlock) ModBlocks.CEILING_PLATE.get(), "");
        simpleBlock(ModBlocks.CEILING_TILE.get());
        simpleBlock(ModBlocks.FLOOR_PLATE.get());
        simpleBlock(ModBlocks.FLOOR_PLATE_DARK.get());
        simpleBlock(ModBlocks.FLOOR_PLATE_LIGHT.get());
        simpleBlock(ModBlocks.PLATING_COPPER.get());
        simpleBlock(ModBlocks.PLATING_IRON.get());
        simpleBlock(ModBlocks.PLATING_IRON_RUSTED.get());
        simpleBlock(ModBlocks.PLATING_LEAD.get());
        simpleBlock(ModBlocks.PLATING_STEEL.get());
        simpleBlock(ModBlocks.PLATING_TITANIUM_STEEL.get());

        customAxisBlockSingle((RotatedPillarBlock) ModBlocks.SHEETMETAL_ALUMINUM.get(), "");
        customAxisBlockSingle((RotatedPillarBlock) ModBlocks.SHEETMETAL_COPPER.get(), "");
        customAxisBlockSingle((RotatedPillarBlock) ModBlocks.SHEETMETAL_GOLD.get(), "");
        customAxisBlockSingle((RotatedPillarBlock) ModBlocks.SHEETMETAL_IRON.get(), "");
        customAxisBlockSingle((RotatedPillarBlock) ModBlocks.SHEETMETAL_LEAD.get(), "");
        customAxisBlockSingle((RotatedPillarBlock) ModBlocks.SHEETMETAL_NICKEL.get(), "");
        customAxisBlockSingle((RotatedPillarBlock) ModBlocks.SHEETMETAL_SILVER.get(), "");
        customAxisBlockSingle((RotatedPillarBlock) ModBlocks.SHEETMETAL_STEEL.get(), "");
        customAxisBlockSingle((RotatedPillarBlock) ModBlocks.SHEETMETAL_URANIUM.get(), "");
        customAxisBlockSingle((RotatedPillarBlock) ModBlocks.SHEETMETAL_COPPER_ALT.get(), "");
        customAxisBlockSingle((RotatedPillarBlock) ModBlocks.SHEETMETAL_IRON_ALT.get(), "");

        customAxisBlockSingle((RotatedPillarBlock) ModBlocks.SOFT_PLATE_WHITE.get(), "");
        customAxisBlockSingle((RotatedPillarBlock) ModBlocks.SOFT_PLATE_ORANGE.get(), "");
        customAxisBlockSingle((RotatedPillarBlock) ModBlocks.SOFT_PLATE_MAGENTA.get(), "");
        customAxisBlockSingle((RotatedPillarBlock) ModBlocks.SOFT_PLATE_LIGHT_BLUE.get(), "");
        customAxisBlockSingle((RotatedPillarBlock) ModBlocks.SOFT_PLATE_YELLOW.get(), "");
        customAxisBlockSingle((RotatedPillarBlock) ModBlocks.SOFT_PLATE_LIME.get(), "");
        customAxisBlockSingle((RotatedPillarBlock) ModBlocks.SOFT_PLATE_PINK.get(), "");
        customAxisBlockSingle((RotatedPillarBlock) ModBlocks.SOFT_PLATE_GRAY.get(), "");
        customAxisBlockSingle((RotatedPillarBlock) ModBlocks.SOFT_PLATE_LIGHT_GRAY.get(), "");
        customAxisBlockSingle((RotatedPillarBlock) ModBlocks.SOFT_PLATE_CYAN.get(), "");
        customAxisBlockSingle((RotatedPillarBlock) ModBlocks.SOFT_PLATE_PURPLE.get(), "");
        customAxisBlockSingle((RotatedPillarBlock) ModBlocks.SOFT_PLATE_BLUE.get(), "");
        customAxisBlockSingle((RotatedPillarBlock) ModBlocks.SOFT_PLATE_BROWN.get(), "");
        customAxisBlockSingle((RotatedPillarBlock) ModBlocks.SOFT_PLATE_GREEN.get(), "");
        customAxisBlockSingle((RotatedPillarBlock) ModBlocks.SOFT_PLATE_RED.get(), "");
        customAxisBlockSingle((RotatedPillarBlock) ModBlocks.SOFT_PLATE_BLACK.get(), "");

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
        simpleCutoutBlock(ModBlocks.REINFORCED_GLASS_CTM.get());
    }

    private void customDoor(DoorBlock block)
    {
        doorBlock(block, extendBlockTexture(blockTexture(block), "_bottom"), extendBlockTexture(blockTexture(block), "_top"));
    }

    private void customDoorCutout(DoorBlock block)
    {
        doorBlockWithRenderType(block, extendBlockTexture(blockTexture(block), "_bottom"), extendBlockTexture(blockTexture(block), "_top"), "cutout");
    }

    private void customAxisBlockSingle(RotatedPillarBlock block, String suffix)
    {
        axisBlock(block, blockTexture(block), extendBlockTexture(blockTexture(block), suffix));
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
