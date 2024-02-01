package com.unixkitty.modern_cubes;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ModernCubes.MODID)
public class ModernCubes
{
    // The MODID value here should match an entry in the META-INF/mods.toml file
    public static final String MODID = "modern_cubes";
    public static final String MODNAME = "Modern Cubes";

    public static final Logger LOG = LogManager.getLogger(MODNAME);

    public ModernCubes()
    {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.BLOCKS.register(modEventBus);
        ModBlocks.ITEMS.register(modEventBus);
    }
}
