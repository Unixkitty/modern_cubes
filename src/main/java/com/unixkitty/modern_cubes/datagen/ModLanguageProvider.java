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
        add(ModBlocks.REINFORCED_GLASS.get(), "Reinforced Glass");
    }
}
