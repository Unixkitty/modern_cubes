package com.unixkitty.modern_cubes;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public final class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModernCubes.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModernCubes.MODID);

    //Regular blocks
    //Sheetmetal
    public static final RegistryObject<Block> SHEETMETAL_ALUMINUM = register("sheetmetal_aluminum", sheetMetalBlock());
    public static final RegistryObject<Block> SHEETMETAL_COPPER = register("sheetmetal_copper", sheetMetalBlock());
    public static final RegistryObject<Block> SHEETMETAL_GOLD = register("sheetmetal_gold", sheetMetalBlock());
    public static final RegistryObject<Block> SHEETMETAL_IRON = register("sheetmetal_iron", sheetMetalBlock());
    public static final RegistryObject<Block> SHEETMETAL_LEAD = register("sheetmetal_lead", sheetMetalBlock());
    public static final RegistryObject<Block> SHEETMETAL_NICKEL = register("sheetmetal_nickel", sheetMetalBlock());
    public static final RegistryObject<Block> SHEETMETAL_SILVER = register("sheetmetal_silver", sheetMetalBlock());
    public static final RegistryObject<Block> SHEETMETAL_STEEL = register("sheetmetal_steel", sheetMetalBlock());
    public static final RegistryObject<Block> SHEETMETAL_URANIUM = register("sheetmetal_uranium", sheetMetalBlock());
    public static final RegistryObject<Block> SHEETMETAL_COPPER_ALT = register("sheetmetal_copper_alt", sheetMetalBlock());
    public static final RegistryObject<Block> SHEETMETAL_IRON_ALT = register("sheetmetal_iron_alt", sheetMetalBlock());

    //Soft plate
    public static final RegistryObject<Block> SOFT_PLATE_WHITE = register("soft_plate_white", sheetMetalBlock());
    public static final RegistryObject<Block> SOFT_PLATE_ORANGE = register("soft_plate_orange", sheetMetalBlock());
    public static final RegistryObject<Block> SOFT_PLATE_MAGENTA = register("soft_plate_magenta", sheetMetalBlock());
    public static final RegistryObject<Block> SOFT_PLATE_LIGHT_BLUE = register("soft_plate_light_blue", sheetMetalBlock());
    public static final RegistryObject<Block> SOFT_PLATE_YELLOW = register("soft_plate_yellow", sheetMetalBlock());
    public static final RegistryObject<Block> SOFT_PLATE_LIME = register("soft_plate_lime", sheetMetalBlock());
    public static final RegistryObject<Block> SOFT_PLATE_PINK = register("soft_plate_pink", sheetMetalBlock());
    public static final RegistryObject<Block> SOFT_PLATE_GRAY = register("soft_plate_gray", sheetMetalBlock());
    public static final RegistryObject<Block> SOFT_PLATE_LIGHT_GRAY = register("soft_plate_light_gray", sheetMetalBlock());
    public static final RegistryObject<Block> SOFT_PLATE_CYAN = register("soft_plate_cyan", sheetMetalBlock());
    public static final RegistryObject<Block> SOFT_PLATE_PURPLE = register("soft_plate_purple", sheetMetalBlock());
    public static final RegistryObject<Block> SOFT_PLATE_BLUE = register("soft_plate_blue", sheetMetalBlock());
    public static final RegistryObject<Block> SOFT_PLATE_BROWN = register("soft_plate_brown", sheetMetalBlock());
    public static final RegistryObject<Block> SOFT_PLATE_GREEN = register("soft_plate_green", sheetMetalBlock());
    public static final RegistryObject<Block> SOFT_PLATE_RED = register("soft_plate_red", sheetMetalBlock());
    public static final RegistryObject<Block> SOFT_PLATE_BLACK = register("soft_plate_black", sheetMetalBlock());

    //Doors
    public static final RegistryObject<Block> STEEL_DOOR = register("steel_door", doorBlock());
    public static final RegistryObject<Block> STRONG_DOOR = register("strong_door", doorBlock());
    public static final RegistryObject<Block> STURDY_RUSTY_DOOR = register("sturdy_rusty_door", doorBlock());
    public static final RegistryObject<Block> STURDY_STEEL_DOOR = register("sturdy_steel_door", doorBlock());
    public static final RegistryObject<Block> STURDY_WHITE_STEEL_DOOR = register("sturdy_white_steel_door", doorBlock());
    public static final RegistryObject<Block> WARNING_RUSTY_DOOR = register("warning_rusty_door", doorBlock());
    public static final RegistryObject<Block> WARNING_STEEL_DOOR = register("warning_steel_door", doorBlock());
    public static final RegistryObject<Block> WARNING_WHITE_STEEL_DOOR = register("warning_white_steel_door", doorBlock());
    public static final RegistryObject<Block> WHITE_STEEL_DOOR = register("white_steel_door", doorBlock());

    //Doors openable
    public static final RegistryObject<Block> BLUE_STEEL_DOOR_GLASS = register("blue_steel_door_glass", openableMetalDoorBlock());
    public static final RegistryObject<Block> FIRE_DOOR = register("fire_door", openableMetalDoorBlock());
    public static final RegistryObject<Block> STURDY_WHITE_STEEL_DOOR_GLASS = register("sturdy_white_steel_door_glass", openableMetalDoorBlock());
    public static final RegistryObject<Block> WHITE_STEEL_DOOR_GLASS = register("white_steel_door_glass", openableMetalDoorBlock());

    //Rotated pillar blocks
    public static final RegistryObject<Block> BEAM = register("beam", sheetMetalBlock());
    public static final RegistryObject<Block> BEAM_BOLTS = register("beam_bolts", sheetMetalBlock());

    //Special
    public static final RegistryObject<Block> REINFORCED_GLASS = register("reinforced_glass", () -> new GlassBlock(Block.Properties.of(Material.METAL, MaterialColor.NONE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.GLASS)
            .noOcclusion()
            .isRedstoneConductor(Blocks::never)
            .isSuffocating(Blocks::never)
            .isViewBlocking(Blocks::never)
            .strength(Blocks.IRON_BLOCK.defaultDestroyTime(), Blocks.OBSIDIAN.getExplosionResistance())));

    private static RegistryObject<Block> register(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS.register(name, supplier);
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        return block;
    }

    private static Supplier<? extends Block> sheetMetalBlock()
    {
        return () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).destroyTime(Blocks.STONE.defaultDestroyTime()));
    }
    
    private static Supplier<? extends Block> doorBlock()
    {
        return () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_DOOR));
    }
    
    private static Supplier<? extends Block> openableMetalDoorBlock()
    {
        return () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_DOOR))
        {
            @Override
            public @NotNull InteractionResult use(@NotNull BlockState pState, @NotNull Level pLevel, @NotNull BlockPos pPos, @NotNull Player pPlayer, @NotNull InteractionHand pHand, @NotNull BlockHitResult pHit)
            {
                pState = pState.cycle(OPEN);
                pLevel.setBlock(pPos, pState, 10);
                pLevel.levelEvent(pPlayer, pState.getValue(OPEN) ? this.getOpenSound() : this.getCloseSound(), pPos, 0);
                pLevel.gameEvent(pPlayer, this.isOpen(pState) ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pPos);
                return InteractionResult.sidedSuccess(pLevel.isClientSide);
            }
        };
    }
}
