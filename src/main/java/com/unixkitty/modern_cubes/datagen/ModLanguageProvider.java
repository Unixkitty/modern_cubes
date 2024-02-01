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
