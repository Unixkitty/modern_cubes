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
                .add(ModBlocks.SOFT_PLATE_WHITE.get())
                .add(ModBlocks.SOFT_PLATE_ORANGE.get())
                .add(ModBlocks.SOFT_PLATE_MAGENTA.get())
                .add(ModBlocks.SOFT_PLATE_LIGHT_BLUE.get())
                .add(ModBlocks.SOFT_PLATE_YELLOW.get())
                .add(ModBlocks.SOFT_PLATE_LIME.get())
                .add(ModBlocks.SOFT_PLATE_PINK.get())
                .add(ModBlocks.SOFT_PLATE_GRAY.get())
                .add(ModBlocks.SOFT_PLATE_LIGHT_GRAY.get())
                .add(ModBlocks.SOFT_PLATE_CYAN.get())
                .add(ModBlocks.SOFT_PLATE_PURPLE.get())
                .add(ModBlocks.SOFT_PLATE_BLUE.get())
                .add(ModBlocks.SOFT_PLATE_BROWN.get())
                .add(ModBlocks.SOFT_PLATE_GREEN.get())
                .add(ModBlocks.SOFT_PLATE_RED.get())
                .add(ModBlocks.SOFT_PLATE_BLACK.get())
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
                .add(ModBlocks.SOFT_PLATE_WHITE.get())
                .add(ModBlocks.SOFT_PLATE_ORANGE.get())
                .add(ModBlocks.SOFT_PLATE_MAGENTA.get())
                .add(ModBlocks.SOFT_PLATE_LIGHT_BLUE.get())
                .add(ModBlocks.SOFT_PLATE_YELLOW.get())
                .add(ModBlocks.SOFT_PLATE_LIME.get())
                .add(ModBlocks.SOFT_PLATE_PINK.get())
                .add(ModBlocks.SOFT_PLATE_GRAY.get())
                .add(ModBlocks.SOFT_PLATE_LIGHT_GRAY.get())
                .add(ModBlocks.SOFT_PLATE_CYAN.get())
                .add(ModBlocks.SOFT_PLATE_PURPLE.get())
                .add(ModBlocks.SOFT_PLATE_BLUE.get())
                .add(ModBlocks.SOFT_PLATE_BROWN.get())
                .add(ModBlocks.SOFT_PLATE_GREEN.get())
                .add(ModBlocks.SOFT_PLATE_RED.get())
                .add(ModBlocks.SOFT_PLATE_BLACK.get())
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
