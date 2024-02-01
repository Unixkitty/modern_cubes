package com.unixkitty.modern_cubes.datagen.tag;

import com.unixkitty.modern_cubes.ModBlocks;
import com.unixkitty.modern_cubes.ModernCubes;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTags extends BlockTagsProvider
{
    public ModBlockTags(DataGenerator generatorIn, ExistingFileHelper existingFileHelper)
    {
        super(generatorIn, ModernCubes.MODID, existingFileHelper);
    }

    @Override
    protected void addTags()
    {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.STEEL_DOOR.get())
                .add(ModBlocks.STRONG_DOOR.get())
                .add(ModBlocks.STURDY_RUSTY_DOOR.get())
                .add(ModBlocks.STURDY_STEEL_DOOR.get())
                .add(ModBlocks.STURDY_WHITE_STEEL_DOOR.get())
                .add(ModBlocks.WARNING_RUSTY_DOOR.get())
                .add(ModBlocks.WARNING_STEEL_DOOR.get())
                .add(ModBlocks.WARNING_WHITE_STEEL_DOOR.get())
                .add(ModBlocks.WHITE_STEEL_DOOR.get())
                .add(ModBlocks.BLUE_STEEL_DOOR_GLASS.get())
                .add(ModBlocks.FIRE_DOOR.get())
                .add(ModBlocks.STURDY_WHITE_STEEL_DOOR_GLASS.get())
                .add(ModBlocks.WHITE_STEEL_DOOR_GLASS.get())
                .add(ModBlocks.BEAM.get())
                .add(ModBlocks.BEAM_BOLTS.get())
                .add(ModBlocks.REINFORCED_GLASS.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.STEEL_DOOR.get())
                .add(ModBlocks.STRONG_DOOR.get())
                .add(ModBlocks.STURDY_RUSTY_DOOR.get())
                .add(ModBlocks.STURDY_STEEL_DOOR.get())
                .add(ModBlocks.STURDY_WHITE_STEEL_DOOR.get())
                .add(ModBlocks.WARNING_RUSTY_DOOR.get())
                .add(ModBlocks.WARNING_STEEL_DOOR.get())
                .add(ModBlocks.WARNING_WHITE_STEEL_DOOR.get())
                .add(ModBlocks.WHITE_STEEL_DOOR.get())
                .add(ModBlocks.BLUE_STEEL_DOOR_GLASS.get())
                .add(ModBlocks.FIRE_DOOR.get())
                .add(ModBlocks.STURDY_WHITE_STEEL_DOOR_GLASS.get())
                .add(ModBlocks.WHITE_STEEL_DOOR_GLASS.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.REINFORCED_GLASS.get());
    }
}
