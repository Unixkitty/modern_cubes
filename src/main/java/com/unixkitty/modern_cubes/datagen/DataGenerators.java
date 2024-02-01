package com.unixkitty.modern_cubes.datagen;

import com.unixkitty.modern_cubes.ModernCubes;
import com.unixkitty.modern_cubes.datagen.loot.ModLootTables;
import com.unixkitty.modern_cubes.datagen.model.ModBlockStates;
import com.unixkitty.modern_cubes.datagen.model.ModItemModels;
import com.unixkitty.modern_cubes.datagen.recipe.CraftingTableRecipes;
import com.unixkitty.modern_cubes.datagen.recipe.StonecutterRecipes;
import com.unixkitty.modern_cubes.datagen.tag.ModBlockTags;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ModernCubes.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        DataGenerator generator = event.getGenerator();
        generator.addProvider(event.includeClient(), new ModBlockStates(generator, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new ModItemModels(generator, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new ModLanguageProvider(generator, "en_us"));
        generator.addProvider(event.includeServer(), new ModLootTables(generator));
        generator.addProvider(event.includeServer(), new CraftingTableRecipes(generator));
        generator.addProvider(event.includeServer(), new StonecutterRecipes(generator));

        ModBlockTags blockTags = new ModBlockTags(generator, event.getExistingFileHelper());
        generator.addProvider(event.includeServer(), blockTags);
//        generator.addProvider(event.includeServer(), new ModItemTags(generator, blockTags, event.getExistingFileHelper()));
    }
}
