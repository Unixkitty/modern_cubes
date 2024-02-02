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
        add(ModBlocks.SPACE_PLATING_INSET.get(), "Space Plating Inset");
        add(ModBlocks.SPACE_PLATING_RIVETS.get(), "Space Plating Rivets");
        add(ModBlocks.SPACE_PLATING_STRIPE_BLACK.get(), "Space Plating Black Stripe");
        add(ModBlocks.SPACE_PLATING_STRIPE_BLUE.get(), "Space Plating Blue Stripe");
        add(ModBlocks.SPACE_PLATING_STRIPE_BROWN.get(), "Space Plating Brown Stripe");
        add(ModBlocks.SPACE_PLATING_STRIPE_CYAN.get(), "Space Plating Cyan Stripe");
        add(ModBlocks.SPACE_PLATING_STRIPE_GRAY.get(), "Space Plating Gray Stripe");
        add(ModBlocks.SPACE_PLATING_STRIPE_GREEN.get(), "Space Plating Green Stripe");
        add(ModBlocks.SPACE_PLATING_STRIPE_LIGHT_BLUE.get(), "Space Plating Light Blue Stripe");
        add(ModBlocks.SPACE_PLATING_STRIPE_LIGHT_GRAY.get(), "Space Plating Light Gray Stripe");
        add(ModBlocks.SPACE_PLATING_STRIPE_LIME.get(), "Space Plating Lime Stripe");
        add(ModBlocks.SPACE_PLATING_STRIPE_MAGENTA.get(), "Space Plating Magenta Stripe");
        add(ModBlocks.SPACE_PLATING_STRIPE_ORANGE.get(), "Space Plating Orange Stripe");
        add(ModBlocks.SPACE_PLATING_STRIPE_PINK.get(), "Space Plating Pink Stripe");
        add(ModBlocks.SPACE_PLATING_STRIPE_PURPLE.get(), "Space Plating Purple Stripe");
        add(ModBlocks.SPACE_PLATING_STRIPE_RED.get(), "Space Plating Red Stripe");
        add(ModBlocks.SPACE_PLATING_STRIPE_WHITE.get(), "Space Plating White Stripe");
        add(ModBlocks.SPACE_PLATING_STRIPE_YELLOW.get(), "Space Plating Yellow Stripe");
        add(ModBlocks.SPACE_PLATING_VENT.get(), "Space Plating Vent");
        add(ModBlocks.SPACE_PLATING_VENT_CTM.get(), "Space Plating Vent (CTM)");

        add(ModBlocks.SPACE_PLATING_TILE.get(), "Space Plating Tile");
        add(ModBlocks.SPACE_PLATING.get(), "Space Plating");
        add(ModBlocks.SPACE_PLATING_SQUARE.get(), "Space Plating Square");

        add(ModBlocks.SPACE_PLATING_HATCH.get(), "Space Plating Hatch");

        add(ModBlocks.CONCRETE_PAVER_SLAB.get(), "Concrete Paver Slab");
        add(ModBlocks.CONCRETE_SIMPLE_TILE_SLAB.get(), "Concrete Tile Slab");
        add(ModBlocks.ASPHALT_PLAIN.get(), "Asphalt");
        add(ModBlocks.CONCRETE_PAVER.get(), "Concrete Paver");
        add(ModBlocks.CONCRETE_PLAIN.get(), "Plain Concrete");
        add(ModBlocks.CONCRETE_ASPHALT.get(), "Smooth Asphalt");
        add(ModBlocks.CONCRETE_GRAY.get(), "Industrial Concrete");
        add(ModBlocks.CONCRETE_HARSH.get(), "Harsh Concrete");
        add(ModBlocks.CONCRETE_SIMPLE.get(), "Simple Concrete");
        add(ModBlocks.CONCRETE_SIMPLE_TILE.get(), "Concrete Tile");

        add(ModBlocks.CEILING_PLATE.get(), "Ceiling Plate");
        add(ModBlocks.CEILING_TILE.get(), "Ceiling Tile");
        add(ModBlocks.FLOOR_PLATE.get(), "Floor Plate");
        add(ModBlocks.FLOOR_PLATE_DARK.get(), "Dark Floor Plate");
        add(ModBlocks.FLOOR_PLATE_LIGHT.get(), "Light Floor Plate");
        add(ModBlocks.PLATING_COPPER.get(), "Copper Plating");
        add(ModBlocks.PLATING_IRON.get(), "Iron Plating");
        add(ModBlocks.PLATING_IRON_RUSTED.get(), "Rusted Iron Plating");
        add(ModBlocks.PLATING_LEAD.get(), "Lead Plating");
        add(ModBlocks.PLATING_STEEL.get(), "Steel Plating");
        add(ModBlocks.PLATING_TITANIUM_STEEL.get(), "Titanium Steel Plating");

        add(ModBlocks.SHEETMETAL_ALUMINUM.get(), "Aluminum Sheetmetal");
        add(ModBlocks.SHEETMETAL_COPPER.get(), "Copper Sheetmetal");
        add(ModBlocks.SHEETMETAL_GOLD.get(), "Gold Sheetmetal");
        add(ModBlocks.SHEETMETAL_IRON.get(), "Iron Sheetmetal");
        add(ModBlocks.SHEETMETAL_LEAD.get(), "Lead Sheetmetal");
        add(ModBlocks.SHEETMETAL_NICKEL.get(), "Nickel Sheetmetal");
        add(ModBlocks.SHEETMETAL_SILVER.get(), "Silver Sheetmetal");
        add(ModBlocks.SHEETMETAL_STEEL.get(), "Steel Sheetmetal");
        add(ModBlocks.SHEETMETAL_URANIUM.get(), "Uranium Sheetmetal");
        add(ModBlocks.SHEETMETAL_COPPER_ALT.get(), "Copper Sheetmetal (Alternate)");
        add(ModBlocks.SHEETMETAL_IRON_ALT.get(), "Iron Sheetmetal (Alternate)");

        add(ModBlocks.SOFT_PLATE_WHITE.get(), "Soft White Plate");
        add(ModBlocks.SOFT_PLATE_ORANGE.get(), "Soft Orange Plate");
        add(ModBlocks.SOFT_PLATE_MAGENTA.get(), "Soft Magenta Plate");
        add(ModBlocks.SOFT_PLATE_LIGHT_BLUE.get(), "Soft Light Blue Plate");
        add(ModBlocks.SOFT_PLATE_YELLOW.get(), "Soft Yellow Plate");
        add(ModBlocks.SOFT_PLATE_LIME.get(), "Soft Lime Plate");
        add(ModBlocks.SOFT_PLATE_PINK.get(), "Soft Pink Plate");
        add(ModBlocks.SOFT_PLATE_GRAY.get(), "Soft Gray Plate");
        add(ModBlocks.SOFT_PLATE_LIGHT_GRAY.get(), "Soft Light Gray Plate");
        add(ModBlocks.SOFT_PLATE_CYAN.get(), "Soft Cyan Plate");
        add(ModBlocks.SOFT_PLATE_PURPLE.get(), "Soft Purple Plate");
        add(ModBlocks.SOFT_PLATE_BLUE.get(), "Soft Blue Plate");
        add(ModBlocks.SOFT_PLATE_BROWN.get(), "Soft Brown Plate");
        add(ModBlocks.SOFT_PLATE_GREEN.get(), "Soft Green Plate");
        add(ModBlocks.SOFT_PLATE_RED.get(), "Soft Red Plate");
        add(ModBlocks.SOFT_PLATE_BLACK.get(), "Soft Black Plate");

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
        add(ModBlocks.REINFORCED_GLASS_CTM.get(), "Reinforced Glass (CTM)");
    }
}
