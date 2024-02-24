package com.unixkitty.modern_cubes.datagen.loot;

import com.unixkitty.modern_cubes.ModernCubes;
import net.minecraft.data.loot.packs.VanillaBlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ModBlockLootTables extends VanillaBlockLoot
{
    private final Set<Block> knownBlocks = new HashSet<>();

    @Override
    protected void generate()
    {
        for (Block block : ForgeRegistries.BLOCKS)
        {
            if (ModernCubes.MODID.equals(Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block)).getNamespace()))
            {
                if (block instanceof DoorBlock)
                {
                    add(block, this::createDoorTable);
                }
                else if (block instanceof SlabBlock)
                {
                    add(block, this::createSlabItemTable);
                }
                else
                {
                    add(block, this::createSingleItemTable);
                }
            }
        }
    }

    @Override
    protected void add(@NotNull Block block, LootTable.@NotNull Builder builder)
    {
        super.add(block, builder);

        this.knownBlocks.add(block);
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks()
    {
        return this.knownBlocks;
    }
}
