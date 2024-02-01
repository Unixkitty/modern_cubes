package com.unixkitty.modern_cubes.datagen;

import com.unixkitty.modern_cubes.ModBlocks;
import com.unixkitty.modern_cubes.ModernCubes;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider
{

    public ModLanguageProvider(DataGenerator gen, String locale)
    {
        super(gen, ModernCubes.MODID, locale);
    }

    @Override
    protected void addTranslations()
    {
        add(ModBlocks.SHEETMETAL_ALUMINUM.get(), "Aluminum Sheetmetal");
        add(ModBlocks.SHEETMETAL_COPPER.get(), "Copper Sheetmetal");
        add(ModBlocks.SHEETMETAL_GOLD.get(), "Gold Sheetmetal");
        add(ModBlocks.SHEETMETAL_IRON.get(), "Iron Sheetmetal");
        add(ModBlocks.SHEETMETAL_LEAD.get(), "Lead Sheetmetal");
        add(ModBlocks.SHEETMETAL_NICKEL.get(), "Nickel Sheetmetal");
        add(ModBlocks.SHEETMETAL_SILVER.get(), "Silver Sheetmetal");
        add(ModBlocks.SHEETMETAL_STEEL.get(), "Steel Sheetmetal");
        add(ModBlocks.SHEETMETAL_URANIUM.get(), "Uranium Sheetmetal");
        add(ModBlocks.SHEETMETAL_COPPER_ALT.get(), "Copper Sheetmetal (Alternate)");
        add(ModBlocks.SHEETMETAL_IRON_ALT.get(), "Iron Sheetmetal (Alternate)");

        add(ModBlocks.SOFT_PLATE_WHITE.get(), "Soft White Plate");
        add(ModBlocks.SOFT_PLATE_ORANGE.get(), "Soft Orange Plate");
        add(ModBlocks.SOFT_PLATE_MAGENTA.get(), "Soft Magenta Plate");
        add(ModBlocks.SOFT_PLATE_LIGHT_BLUE.get(), "Soft Light Blue Plate");
        add(ModBlocks.SOFT_PLATE_YELLOW.get(), "Soft Yellow Plate");
        add(ModBlocks.SOFT_PLATE_LIME.get(), "Soft Lime Plate");
        add(ModBlocks.SOFT_PLATE_PINK.get(), "Soft Pink Plate");
        add(ModBlocks.SOFT_PLATE_GRAY.get(), "Soft Gray Plate");
        add(ModBlocks.SOFT_PLATE_LIGHT_GRAY.get(), "Soft Light Gray Plate");
        add(ModBlocks.SOFT_PLATE_CYAN.get(), "Soft Cyan Plate");
        add(ModBlocks.SOFT_PLATE_PURPLE.get(), "Soft Purple Plate");
        add(ModBlocks.SOFT_PLATE_BLUE.get(), "Soft Blue Plate");
        add(ModBlocks.SOFT_PLATE_BROWN.get(), "Soft Brown Plate");
        add(ModBlocks.SOFT_PLATE_GREEN.get(), "Soft Green Plate");
        add(ModBlocks.SOFT_PLATE_RED.get(), "Soft Red Plate");
        add(ModBlocks.SOFT_PLATE_BLACK.get(), "Soft Black Plate");

        add(ModBlocks.STEEL_DOOR.get(), "Blue Steel Door");
        add(ModBlocks.STRONG_DOOR.get(), "Strong Door");
        add(ModBlocks.STURDY_RUSTY_DOOR.get(), "Sturdy Rusty Door");
        add(ModBlocks.STURDY_STEEL_DOOR.get(), "Sturdy Steel Door");
        add(ModBlocks.STURDY_WHITE_STEEL_DOOR.get(), "Sturdy White Steel Door");
        add(ModBlocks.WARNING_RUSTY_DOOR.get(), "Warning Rusty Door");
        add(ModBlocks.WARNING_STEEL_DOOR.get(), "Warning Steel Door");
        add(ModBlocks.WARNING_WHITE_STEEL_DOOR.get(), "Warning White Steel Door");
        add(ModBlocks.WHITE_STEEL_DOOR.get(), "White Steel Door");
        add(ModBlocks.BLUE_STEEL_DOOR_GLASS.get(), "Blue Steel Door");
        add(ModBlocks.FIRE_DOOR.get(), "Fire Door");
        add(ModBlocks.STURDY_WHITE_STEEL_DOOR_GLASS.get(), "Sturdy White Steel Door (Glass)");
        add(ModBlocks.WHITE_STEEL_DOOR_GLASS.get(), "White Steel Door (Glass)");

        add(ModBlocks.BEAM.get(), "Metal Beam");
        add(ModBlocks.BEAM_BOLTS.get(), "Metal Bolted Beam");

        add(ModBlocks.REINFORCED_GLASS.get(), "Reinforced Glass");
    }
}
