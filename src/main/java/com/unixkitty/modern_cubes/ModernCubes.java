package com.unixkitty.modern_cubes;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

@Mod(ModernCubes.MODID)
public class ModernCubes
{
    // The MODID value here should match an entry in the META-INF/mods.toml file
    public static final String MODID = "modern_cubes";
    public static final String MODNAME = "Modern Cubes";

//    public static final Logger LOG = LogManager.getLogger(MODNAME);

    public ModernCubes()
    {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.BLOCKS.register(modEventBus);
        ModBlocks.ITEMS.register(modEventBus);

        modEventBus.addListener(this::onBuildCreativeTabs);
    }

    private void onBuildCreativeTabs(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS)
        {
            for (Block block : ForgeRegistries.BLOCKS)
            {
                if (ModernCubes.MODID.equals(Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block)).getNamespace()))
                {
                    event.accept(block);
                }
            }
        }
    }
}
