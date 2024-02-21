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
        copyChiselBlock(ModBlocks.LABORATORY_STEEL_SMALL_SLAB.get());
        copyChiselBlock(ModBlocks.LABORATORY_STEEL_LARGE.get());
        copyChiselBlock(ModBlocks.LABORATORY_STEEL_SMALL.get());
        copyChiselBlock(ModBlocks.LABORATORY_PANEL.get());
        copyChiselBlock(ModBlocks.LABORATORY_PANEL_DOTTED.get());
        copyChiselBlock(ModBlocks.LABORATORY_ROUNDEL.get());
        copyChiselBlock(ModBlocks.LABORATORY_SCREEN_CLEAR.get());
        copyChiselBlock(ModBlocks.LABORATORY_SCREEN_FUZZY.get());
        copyChiselBlock(ModBlocks.LABORATORY_TILE_PLAIN.get());
        copyChiselBlock(ModBlocks.LABORATORY_TILE_PLAIN_CTM.get());
        copyChiselBlock(ModBlocks.LABORATORY_TILES.get());
        copyChiselBlock(ModBlocks.LABORATORY_TILES_CHECKER.get());
        copyChiselBlock(ModBlocks.LABORATORY_TILES_FLOOR.get());
        copyChiselBlock(ModBlocks.LABORATORY_VENTS.get());
        copyChiselBlock(ModBlocks.LABORATORY_INFOCON.get());
        copyChiselBlock(ModBlocks.LABORATORY_DIRECTION_UPRIGHT.get());
        copyChiselBlock(ModBlocks.LABORATORY_DIRECTION_DOWNLEFT.get());

        copyChiselBlock(ModBlocks.TECHNICAL_CAUTION_TAPE.get());

        copyChiselBlock(ModBlocks.TYRIAN_BLACK.get());
        copyChiselBlock(ModBlocks.TYRIAN_BLACK_ALT.get());
        copyChiselBlock(ModBlocks.TYRIAN_BLUE_PLATING.get());
        copyChiselBlock(ModBlocks.TYRIAN_DENT.get());
        copyChiselBlock(ModBlocks.TYRIAN_DIAGONAL.get());
        copyChiselBlock(ModBlocks.TYRIAN_ELABORATE.get());
        copyChiselBlock(ModBlocks.TYRIAN_PLATE.get());
        copyChiselBlock(ModBlocks.TYRIAN_PLATE_TILE.get());
        copyChiselBlock(ModBlocks.TYRIAN_PLATE_TILE_CTM.get());
        copyChiselBlock(ModBlocks.TYRIAN_TILES.get());

        copyChiselBlock(ModBlocks.FACTORY_DOTS.get());
        copyChiselBlock(ModBlocks.FACTORY_DOTS_LIGHT.get());
        copyChiselBlock(ModBlocks.FACTORY_HAZARD.get());
        copyChiselBlock(ModBlocks.FACTORY_HAZARD_ORANGE.get());
        copyChiselBlock(ModBlocks.FACTORY_RUST.get());
        copyChiselBlock(ModBlocks.FACTORY_WIREFRAME.get());
        copyChiselBlock(ModBlocks.FACTORY_WIREFRAME_WHITE.get());

        copyParent(ModBlocks.HEX_BLACK.get());
        copyParent(ModBlocks.HEX_BLUE.get());
        copyParent(ModBlocks.HEX_BROWN.get());
        copyParent(ModBlocks.HEX_CYAN.get());
        copyParent(ModBlocks.HEX_GRAY.get());
        copyParent(ModBlocks.HEX_GREEN.get());
        copyParent(ModBlocks.HEX_LIGHT_BLUE.get());
        copyParent(ModBlocks.HEX_LIGHT_GRAY.get());
        copyParent(ModBlocks.HEX_LIME.get());
        copyParent(ModBlocks.HEX_MAGENTA.get());
        copyParent(ModBlocks.HEX_ORANGE.get());
        copyParent(ModBlocks.HEX_PINK.get());
        copyParent(ModBlocks.HEX_PURPLE.get());
        copyParent(ModBlocks.HEX_RED.get());
        copyParent(ModBlocks.HEX_WHITE.get());
        copyParent(ModBlocks.HEX_YELLOW.get());

        copyParent(ModBlocks.SPACE_PLATING_INSET.get());
        copyParent(ModBlocks.SPACE_PLATING_RIVETS.get());
        copyParent(ModBlocks.SPACE_PLATING_STRIPE_BLACK.get());
        copyParent(ModBlocks.SPACE_PLATING_STRIPE_BLUE.get());
        copyParent(ModBlocks.SPACE_PLATING_STRIPE_BROWN.get());
        copyParent(ModBlocks.SPACE_PLATING_STRIPE_CYAN.get());
        copyParent(ModBlocks.SPACE_PLATING_STRIPE_GRAY.get());
        copyParent(ModBlocks.SPACE_PLATING_STRIPE_GREEN.get());
        copyParent(ModBlocks.SPACE_PLATING_STRIPE_LIGHT_BLUE.get());
        copyParent(ModBlocks.SPACE_PLATING_STRIPE_LIGHT_GRAY.get());
        copyParent(ModBlocks.SPACE_PLATING_STRIPE_LIME.get());
        copyParent(ModBlocks.SPACE_PLATING_STRIPE_MAGENTA.get());
        copyParent(ModBlocks.SPACE_PLATING_STRIPE_ORANGE.get());
        copyParent(ModBlocks.SPACE_PLATING_STRIPE_PINK.get());
        copyParent(ModBlocks.SPACE_PLATING_STRIPE_PURPLE.get());
        copyParent(ModBlocks.SPACE_PLATING_STRIPE_RED.get());
        copyParent(ModBlocks.SPACE_PLATING_STRIPE_WHITE.get());
        copyParent(ModBlocks.SPACE_PLATING_STRIPE_YELLOW.get());
        copyParent(ModBlocks.SPACE_PLATING_VENT.get());
        copyParent(ModBlocks.SPACE_PLATING_VENT_CTM.get());

        copyParent(ModBlocks.SPACE_PLATING_TILE.get());
        copyParent(ModBlocks.SPACE_PLATING.get());
        copyParent(ModBlocks.SPACE_PLATING_SQUARE.get());

        copyTrapdoor(ModBlocks.SPACE_PLATING_HATCH.get());

        copyParent(ModBlocks.CONCRETE_PAVER_SLAB.get());
        copyParent(ModBlocks.CONCRETE_SIMPLE_TILE_SLAB.get());

        copyParent(ModBlocks.ASPHALT_PLAIN.get());
        copyParent(ModBlocks.CONCRETE_PAVER.get());
        copyParent(ModBlocks.CONCRETE_PLAIN.get());
        copyParent(ModBlocks.CONCRETE_ASPHALT.get());
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
        copyDifferentParent(ModBlocks.REINFORCED_GLASS_CTM.get(), ModBlocks.REINFORCED_GLASS.get());
    }

    @SuppressWarnings("ConstantConditions")
    private void copyTrapdoor(Block block)
    {
        withExistingParent(ForgeRegistries.ITEMS.getKey(block.asItem()).getPath(), modLoc("block/" + block.asItem().toString().toLowerCase() + "_bottom"));
    }

    private void copyParent(Block block)
    {
        copyDifferentParent(block, block, "");
    }

    private void copyChiselBlock(Block block)
    {
        copyDifferentParent(block, block, "chisel/" + block.asItem().toString().toLowerCase().split("_")[0] + "/");
    }

    private void copyDifferentParent(Block block, Block parentBlock)
    {
        copyDifferentParent(block, parentBlock, "");
    }

    @SuppressWarnings("ConstantConditions")
    private void copyDifferentParent(Block block, Block parentBlock, String extraPath)
    {
        withExistingParent(ForgeRegistries.ITEMS.getKey(block.asItem()).getPath(), modLoc("block/" + extraPath + parentBlock.asItem().toString().toLowerCase()));
    }
}
