package com.unixkitty.modern_cubes.client;

import com.unixkitty.modern_cubes.ModBlocks;
import com.unixkitty.modern_cubes.ModernCubes;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = ModernCubes.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class ClientEvents
{
    @SubscribeEvent
    public static void onFMLClientSetupEvent(final FMLClientSetupEvent event)
    {
        event.enqueueWork(() ->
        {
            setCutout(ModBlocks.REINFORCED_GLASS_CTM);
            setCutout(ModBlocks.STRONG_DOOR);
            setCutout(ModBlocks.BLUE_STEEL_DOOR_GLASS);
            setCutout(ModBlocks.FIRE_DOOR);
            setCutout(ModBlocks.STURDY_WHITE_STEEL_DOOR_GLASS);
            setCutout(ModBlocks.WHITE_STEEL_DOOR_GLASS);
        });
    }

    private static void setCutout(RegistryObject<Block> blockRegistryObject)
    {
        //Athena ignores json render type viariable
        //noinspection deprecation
        ItemBlockRenderTypes.setRenderLayer(blockRegistryObject.get(), RenderType.cutout());
    }
}
