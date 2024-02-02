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
import net.minecraft.world.level.material.Fluids;
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

    //Space plating
    public static final RegistryObject<Block> SPACE_PLATING_INSET = register("space_plating_inset", spacePlatingPillarBlock());
    public static final RegistryObject<Block> SPACE_PLATING_RIVETS = register("space_plating_rivets", spacePlatingPillarBlock());
    public static final RegistryObject<Block> SPACE_PLATING_STRIPE_BLACK = register("space_plating_stripe_black", spacePlatingPillarBlock());
    public static final RegistryObject<Block> SPACE_PLATING_STRIPE_BLUE = register("space_plating_stripe_blue", spacePlatingPillarBlock());
    public static final RegistryObject<Block> SPACE_PLATING_STRIPE_BROWN = register("space_plating_stripe_brown", spacePlatingPillarBlock());
    public static final RegistryObject<Block> SPACE_PLATING_STRIPE_CYAN = register("space_plating_stripe_cyan", spacePlatingPillarBlock());
    public static final RegistryObject<Block> SPACE_PLATING_STRIPE_GRAY = register("space_plating_stripe_gray", spacePlatingPillarBlock());
    public static final RegistryObject<Block> SPACE_PLATING_STRIPE_GREEN = register("space_plating_stripe_green", spacePlatingPillarBlock());
    public static final RegistryObject<Block> SPACE_PLATING_STRIPE_LIGHT_BLUE = register("space_plating_stripe_light_blue", spacePlatingPillarBlock());
    public static final RegistryObject<Block> SPACE_PLATING_STRIPE_LIGHT_GRAY = register("space_plating_stripe_light_gray", spacePlatingPillarBlock());
    public static final RegistryObject<Block> SPACE_PLATING_STRIPE_LIME = register("space_plating_stripe_lime", spacePlatingPillarBlock());
    public static final RegistryObject<Block> SPACE_PLATING_STRIPE_MAGENTA = register("space_plating_stripe_magenta", spacePlatingPillarBlock());
    public static final RegistryObject<Block> SPACE_PLATING_STRIPE_ORANGE = register("space_plating_stripe_orange", spacePlatingPillarBlock());
    public static final RegistryObject<Block> SPACE_PLATING_STRIPE_PINK = register("space_plating_stripe_pink", spacePlatingPillarBlock());
    public static final RegistryObject<Block> SPACE_PLATING_STRIPE_PURPLE = register("space_plating_stripe_purple", spacePlatingPillarBlock());
    public static final RegistryObject<Block> SPACE_PLATING_STRIPE_RED = register("space_plating_stripe_red", spacePlatingPillarBlock());
    public static final RegistryObject<Block> SPACE_PLATING_STRIPE_WHITE = register("space_plating_stripe_white", spacePlatingPillarBlock());
    public static final RegistryObject<Block> SPACE_PLATING_STRIPE_YELLOW = register("space_plating_stripe_yellow", spacePlatingPillarBlock());
    public static final RegistryObject<Block> SPACE_PLATING_VENT = register("space_plating_vent", spacePlatingPillarBlock());
    public static final RegistryObject<Block> SPACE_PLATING_VENT_CTM = register("space_plating_vent_ctm", spacePlatingBlock());

    public static final RegistryObject<Block> SPACE_PLATING_TILE = register("space_plating_tile", spacePlatingBlock());
    public static final RegistryObject<Block> SPACE_PLATING = register("space_plating", spacePlatingBlock());
    public static final RegistryObject<Block> SPACE_PLATING_SQUARE = register("space_plating_square", spacePlatingBlock());

    public static final RegistryObject<Block> SPACE_PLATING_HATCH = register("space_plating_hatch", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_TRAPDOOR))
    {
        @Override
        public @NotNull InteractionResult use(@NotNull BlockState pState, @NotNull Level pLevel, @NotNull BlockPos pPos, @NotNull Player pPlayer, InteractionHand pHand, BlockHitResult pHit)
        {
            pState = pState.cycle(OPEN);
            pLevel.setBlock(pPos, pState, 2);
            if (pState.getValue(WATERLOGGED)) {
                pLevel.scheduleTick(pPos, Fluids.WATER, Fluids.WATER.getTickDelay(pLevel));
            }

            this.playSound(pPlayer, pLevel, pPos, pState.getValue(OPEN));
            return InteractionResult.sidedSuccess(pLevel.isClientSide);
        }
    });

    //Concrete variants
    public static final RegistryObject<Block> CONCRETE_PAVER_SLAB = register("concrete_paver_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<Block> CONCRETE_SIMPLE_TILE_SLAB = register("concrete_simple_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));

    public static final RegistryObject<Block> ASPHALT_PLAIN = register("asphalt_plain", concreteBlock());
    public static final RegistryObject<Block> CONCRETE_PAVER = register("concrete_paver", concreteBlock());
    public static final RegistryObject<Block> CONCRETE_PLAIN = register("concrete_plain", concreteBlock());
    public static final RegistryObject<Block> CONCRETE_ASPHALT = register("concrete_asphalt", concreteBlock());
    public static final RegistryObject<Block> CONCRETE_GRAY = register("concrete_gray", concreteBlock());
    public static final RegistryObject<Block> CONCRETE_HARSH = register("concrete_harsh", concreteBlock());
    public static final RegistryObject<Block> CONCRETE_SIMPLE = register("concrete_simple", concreteBlock());
    public static final RegistryObject<Block> CONCRETE_SIMPLE_TILE = register("concrete_simple_tile", concreteBlock());

    //Basic plating
    public static final RegistryObject<Block> CEILING_PLATE = register("ceiling_plate", sheetMetalBlock());
    public static final RegistryObject<Block> CEILING_TILE = register("ceiling_tile", sheetMetalBlock());
    public static final RegistryObject<Block> FLOOR_PLATE = register("floor_plate", sheetMetalBlock());
    public static final RegistryObject<Block> FLOOR_PLATE_DARK = register("floor_plate_dark", sheetMetalBlock());
    public static final RegistryObject<Block> FLOOR_PLATE_LIGHT = register("floor_plate_light", sheetMetalBlock());
    public static final RegistryObject<Block> PLATING_COPPER = register("plating_copper", sheetMetalBlock());
    public static final RegistryObject<Block> PLATING_IRON = register("plating_iron", sheetMetalBlock());
    public static final RegistryObject<Block> PLATING_IRON_RUSTED = register("plating_iron_rusted", sheetMetalBlock());
    public static final RegistryObject<Block> PLATING_LEAD = register("plating_lead", sheetMetalBlock());
    public static final RegistryObject<Block> PLATING_STEEL = register("plating_steel", sheetMetalBlock());
    public static final RegistryObject<Block> PLATING_TITANIUM_STEEL = register("plating_titanium_steel", sheetMetalBlock());

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

    //Beams
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
    public static final RegistryObject<Block> REINFORCED_GLASS_CTM = register("reinforced_glass_ctm", () -> new GlassBlock(BlockBehaviour.Properties.copy(REINFORCED_GLASS.get())));

    private static RegistryObject<Block> register(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS.register(name, supplier);
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        return block;
    }

    private static Supplier<? extends Block> spacePlatingPillarBlock()
    {
        return () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).destroyTime(Blocks.STONE.defaultDestroyTime()));
    }

    private static Supplier<? extends Block> spacePlatingBlock()
    {
        return () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK));
    }

    private static Supplier<? extends Block> concreteBlock()
    {
        return () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE));
    }

    private static Supplier<? extends Block> sheetMetalBlock()
    {
        return () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).destroyTime(Blocks.STONE.defaultDestroyTime()));
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
