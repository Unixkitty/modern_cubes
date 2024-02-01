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

    //Doors
    public static final RegistryObject<Block> STEEL_DOOR = register("steel_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_DOOR)));
    public static final RegistryObject<Block> STRONG_DOOR = register("strong_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_DOOR)));
    public static final RegistryObject<Block> STURDY_RUSTY_DOOR = register("sturdy_rusty_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_DOOR)));
    public static final RegistryObject<Block> STURDY_STEEL_DOOR = register("sturdy_steel_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_DOOR)));
    public static final RegistryObject<Block> STURDY_WHITE_STEEL_DOOR = register("sturdy_white_steel_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_DOOR)));
    public static final RegistryObject<Block> WARNING_RUSTY_DOOR = register("warning_rusty_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_DOOR)));
    public static final RegistryObject<Block> WARNING_STEEL_DOOR = register("warning_steel_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_DOOR)));
    public static final RegistryObject<Block> WARNING_WHITE_STEEL_DOOR = register("warning_white_steel_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_DOOR)));
    public static final RegistryObject<Block> WHITE_STEEL_DOOR = register("white_steel_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_DOOR)));

    //Doors openable
    public static final RegistryObject<Block> BLUE_STEEL_DOOR_GLASS = register("blue_steel_door_glass", OpenableMetalDoorBlock::new);
    public static final RegistryObject<Block> FIRE_DOOR = register("fire_door", OpenableMetalDoorBlock::new);
    public static final RegistryObject<Block> STURDY_WHITE_STEEL_DOOR_GLASS = register("sturdy_white_steel_door_glass", OpenableMetalDoorBlock::new);
    public static final RegistryObject<Block> WHITE_STEEL_DOOR_GLASS = register("white_steel_door_glass", OpenableMetalDoorBlock::new);

    //Rotated pillar blocks
    public static final RegistryObject<Block> BEAM = register("beam", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> BEAM_BOLTS = register("beam_bolts", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

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

    private static class OpenableMetalDoorBlock extends DoorBlock
    {
        public OpenableMetalDoorBlock()
        {
            super(BlockBehaviour.Properties.copy(Blocks.IRON_DOOR));
        }

        @Override
        public @NotNull InteractionResult use(@NotNull BlockState pState, Level pLevel, @NotNull BlockPos pPos, @NotNull Player pPlayer, @NotNull InteractionHand pHand, @NotNull BlockHitResult pHit)
        {
            pState = pState.cycle(OPEN);
            pLevel.setBlock(pPos, pState, 10);
            pLevel.levelEvent(pPlayer, pState.getValue(OPEN) ? this.getOpenSound() : this.getCloseSound(), pPos, 0);
            pLevel.gameEvent(pPlayer, this.isOpen(pState) ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pPos);
            return InteractionResult.sidedSuccess(pLevel.isClientSide);
        }
    }
}
