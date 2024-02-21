package com.unixkitty.modern_cubes.datagen.tag;

import com.unixkitty.modern_cubes.ModBlocks;
import com.unixkitty.modern_cubes.ModernCubes;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
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
        pickaxe(ModBlocks.LABORATORY_STEEL_SMALL_SLAB.get());
        pickaxe(ModBlocks.LABORATORY_STEEL_LARGE.get());
        pickaxe(ModBlocks.LABORATORY_STEEL_SMALL.get());
        pickaxe(ModBlocks.LABORATORY_PANEL.get());
        pickaxe(ModBlocks.LABORATORY_PANEL_DOTTED.get());
        pickaxe(ModBlocks.LABORATORY_ROUNDEL.get());
        pickaxe(ModBlocks.LABORATORY_SCREEN_CLEAR.get());
        pickaxe(ModBlocks.LABORATORY_SCREEN_FUZZY.get());
        pickaxe(ModBlocks.LABORATORY_TILE_PLAIN.get());
        pickaxe(ModBlocks.LABORATORY_TILE_PLAIN_CTM.get());
        pickaxe(ModBlocks.LABORATORY_TILES.get());
        pickaxe(ModBlocks.LABORATORY_TILES_CHECKER.get());
        pickaxe(ModBlocks.LABORATORY_TILES_FLOOR.get());
        pickaxe(ModBlocks.LABORATORY_VENTS.get());
        pickaxe(ModBlocks.LABORATORY_INFOCON.get());
        pickaxe(ModBlocks.LABORATORY_DIRECTION_UPRIGHT.get());
        pickaxe(ModBlocks.LABORATORY_DIRECTION_DOWNLEFT.get());

        pickaxe(ModBlocks.TECHNICAL_CAUTION_TAPE.get());

        pickaxe(ModBlocks.TYRIAN_BLACK.get());
        pickaxe(ModBlocks.TYRIAN_BLACK_ALT.get());
        pickaxe(ModBlocks.TYRIAN_BLUE_PLATING.get());
        pickaxe(ModBlocks.TYRIAN_DENT.get());
        pickaxe(ModBlocks.TYRIAN_DIAGONAL.get());
        pickaxe(ModBlocks.TYRIAN_ELABORATE.get());
        pickaxe(ModBlocks.TYRIAN_PLATE.get());
        pickaxe(ModBlocks.TYRIAN_PLATE_TILE.get());
        pickaxe(ModBlocks.TYRIAN_PLATE_TILE_CTM.get());
        pickaxe(ModBlocks.TYRIAN_TILES.get());

        pickaxe(ModBlocks.FACTORY_DOTS.get());
        pickaxe(ModBlocks.FACTORY_DOTS_LIGHT.get());
        pickaxe(ModBlocks.FACTORY_HAZARD.get());
        pickaxe(ModBlocks.FACTORY_HAZARD_ORANGE.get());
        pickaxe(ModBlocks.FACTORY_RUST.get());
        pickaxe(ModBlocks.FACTORY_WIREFRAME.get());
        pickaxe(ModBlocks.FACTORY_WIREFRAME_WHITE.get());

        pickaxe(ModBlocks.HEX_BLACK.get());
        pickaxe(ModBlocks.HEX_BLUE.get());
        pickaxe(ModBlocks.HEX_BROWN.get());
        pickaxe(ModBlocks.HEX_CYAN.get());
        pickaxe(ModBlocks.HEX_GRAY.get());
        pickaxe(ModBlocks.HEX_GREEN.get());
        pickaxe(ModBlocks.HEX_LIGHT_BLUE.get());
        pickaxe(ModBlocks.HEX_LIGHT_GRAY.get());
        pickaxe(ModBlocks.HEX_LIME.get());
        pickaxe(ModBlocks.HEX_MAGENTA.get());
        pickaxe(ModBlocks.HEX_ORANGE.get());
        pickaxe(ModBlocks.HEX_PINK.get());
        pickaxe(ModBlocks.HEX_PURPLE.get());
        pickaxe(ModBlocks.HEX_RED.get());
        pickaxe(ModBlocks.HEX_WHITE.get());
        pickaxe(ModBlocks.HEX_YELLOW.get());

        pickaxe(ModBlocks.SPACE_PLATING_INSET.get());
        pickaxe(ModBlocks.SPACE_PLATING_RIVETS.get());
        pickaxe(ModBlocks.SPACE_PLATING_STRIPE_BLACK.get());
        pickaxe(ModBlocks.SPACE_PLATING_STRIPE_BLUE.get());
        pickaxe(ModBlocks.SPACE_PLATING_STRIPE_BROWN.get());
        pickaxe(ModBlocks.SPACE_PLATING_STRIPE_CYAN.get());
        pickaxe(ModBlocks.SPACE_PLATING_STRIPE_GRAY.get());
        pickaxe(ModBlocks.SPACE_PLATING_STRIPE_GREEN.get());
        pickaxe(ModBlocks.SPACE_PLATING_STRIPE_LIGHT_BLUE.get());
        pickaxe(ModBlocks.SPACE_PLATING_STRIPE_LIGHT_GRAY.get());
        pickaxe(ModBlocks.SPACE_PLATING_STRIPE_LIME.get());
        pickaxe(ModBlocks.SPACE_PLATING_STRIPE_MAGENTA.get());
        pickaxe(ModBlocks.SPACE_PLATING_STRIPE_ORANGE.get());
        pickaxe(ModBlocks.SPACE_PLATING_STRIPE_PINK.get());
        pickaxe(ModBlocks.SPACE_PLATING_STRIPE_PURPLE.get());
        pickaxe(ModBlocks.SPACE_PLATING_STRIPE_RED.get());
        pickaxe(ModBlocks.SPACE_PLATING_STRIPE_WHITE.get());
        pickaxe(ModBlocks.SPACE_PLATING_STRIPE_YELLOW.get());
        pickaxe(ModBlocks.SPACE_PLATING_VENT.get());
        pickaxe(ModBlocks.SPACE_PLATING_VENT_CTM.get());
        pickaxe(ModBlocks.SPACE_PLATING_TILE.get());
        pickaxe(ModBlocks.SPACE_PLATING.get());
        pickaxe(ModBlocks.SPACE_PLATING_SQUARE.get());
        pickaxe(ModBlocks.SPACE_PLATING_HATCH.get());

        pickaxe(ModBlocks.CONCRETE_PAVER_SLAB.get());
        pickaxe(ModBlocks.CONCRETE_SIMPLE_TILE_SLAB.get());
        pickaxe(ModBlocks.ASPHALT_PLAIN.get());
        pickaxe(ModBlocks.CONCRETE_PAVER.get());
        pickaxe(ModBlocks.CONCRETE_PLAIN.get());
        pickaxe(ModBlocks.CONCRETE_ASPHALT.get());
        pickaxe(ModBlocks.CONCRETE_GRAY.get());
        pickaxe(ModBlocks.CONCRETE_HARSH.get());
        pickaxe(ModBlocks.CONCRETE_SIMPLE.get());
        pickaxe(ModBlocks.CONCRETE_SIMPLE_TILE.get());

        pickaxe(ModBlocks.CEILING_PLATE.get());
        pickaxe(ModBlocks.CEILING_TILE.get());
        pickaxe(ModBlocks.FLOOR_PLATE.get());
        pickaxe(ModBlocks.FLOOR_PLATE_DARK.get());
        pickaxe(ModBlocks.FLOOR_PLATE_LIGHT.get());
        pickaxe(ModBlocks.PLATING_COPPER.get());
        pickaxe(ModBlocks.PLATING_IRON.get());
        pickaxe(ModBlocks.PLATING_IRON_RUSTED.get());
        pickaxe(ModBlocks.PLATING_LEAD.get());
        pickaxe(ModBlocks.PLATING_STEEL.get());
        pickaxe(ModBlocks.PLATING_TITANIUM_STEEL.get());

        pickaxe(ModBlocks.SHEETMETAL_ALUMINUM.get());
        pickaxe(ModBlocks.SHEETMETAL_COPPER.get());
        pickaxe(ModBlocks.SHEETMETAL_GOLD.get());
        pickaxe(ModBlocks.SHEETMETAL_IRON.get());
        pickaxe(ModBlocks.SHEETMETAL_LEAD.get());
        pickaxe(ModBlocks.SHEETMETAL_NICKEL.get());
        pickaxe(ModBlocks.SHEETMETAL_SILVER.get());
        pickaxe(ModBlocks.SHEETMETAL_STEEL.get());
        pickaxe(ModBlocks.SHEETMETAL_URANIUM.get());
        pickaxe(ModBlocks.SHEETMETAL_COPPER_ALT.get());
        pickaxe(ModBlocks.SHEETMETAL_IRON_ALT.get());

        pickaxe(ModBlocks.SOFT_PLATE_WHITE.get());
        pickaxe(ModBlocks.SOFT_PLATE_ORANGE.get());
        pickaxe(ModBlocks.SOFT_PLATE_MAGENTA.get());
        pickaxe(ModBlocks.SOFT_PLATE_LIGHT_BLUE.get());
        pickaxe(ModBlocks.SOFT_PLATE_YELLOW.get());
        pickaxe(ModBlocks.SOFT_PLATE_LIME.get());
        pickaxe(ModBlocks.SOFT_PLATE_PINK.get());
        pickaxe(ModBlocks.SOFT_PLATE_GRAY.get());
        pickaxe(ModBlocks.SOFT_PLATE_LIGHT_GRAY.get());
        pickaxe(ModBlocks.SOFT_PLATE_CYAN.get());
        pickaxe(ModBlocks.SOFT_PLATE_PURPLE.get());
        pickaxe(ModBlocks.SOFT_PLATE_BLUE.get());
        pickaxe(ModBlocks.SOFT_PLATE_BROWN.get());
        pickaxe(ModBlocks.SOFT_PLATE_GREEN.get());
        pickaxe(ModBlocks.SOFT_PLATE_RED.get());
        pickaxe(ModBlocks.SOFT_PLATE_BLACK.get());

        pickaxe(ModBlocks.STEEL_DOOR.get());
        pickaxe(ModBlocks.STRONG_DOOR.get());
        pickaxe(ModBlocks.STURDY_RUSTY_DOOR.get());
        pickaxe(ModBlocks.STURDY_STEEL_DOOR.get());
        pickaxe(ModBlocks.STURDY_WHITE_STEEL_DOOR.get());
        pickaxe(ModBlocks.WARNING_RUSTY_DOOR.get());
        pickaxe(ModBlocks.WARNING_STEEL_DOOR.get());
        pickaxe(ModBlocks.WARNING_WHITE_STEEL_DOOR.get());
        pickaxe(ModBlocks.WHITE_STEEL_DOOR.get());
        pickaxe(ModBlocks.BLUE_STEEL_DOOR_GLASS.get());
        pickaxe(ModBlocks.FIRE_DOOR.get());
        pickaxe(ModBlocks.STURDY_WHITE_STEEL_DOOR_GLASS.get());
        pickaxe(ModBlocks.WHITE_STEEL_DOOR_GLASS.get());

        pickaxe(ModBlocks.BEAM.get());
        pickaxe(ModBlocks.BEAM_BOLTS.get());

        pickaxe(ModBlocks.REINFORCED_GLASS.get(), BlockTags.NEEDS_IRON_TOOL);
        pickaxe(ModBlocks.REINFORCED_GLASS_CTM.get(), BlockTags.NEEDS_IRON_TOOL);
    }

    @SafeVarargs
    private void pickaxe(Block block, TagKey<Block>... needsToolTag)
    {
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(block);

        if (needsToolTag != null && needsToolTag.length > 0)
        {
            tag(needsToolTag[0]).add(block);
        }
    }
}
