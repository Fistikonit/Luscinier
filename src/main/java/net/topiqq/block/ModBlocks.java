package net.topiqq.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.ColorCode;
import net.minecraft.util.Identifier;
import net.topiqq.TutorialMod;

public class ModBlocks {
    //do not touch above
    //Creating blocks and registering them
    public static final  Block DEEPSLATE_LUSCIN_ORE = registerBlock(
            "deepslate_luscin_ore", new Block
                    (AbstractBlock.Settings.create()
                            .strength(12f, 40f)
                            .burnable()


    ));
    public static final Block LUSCIN_ORE = registerBlock(
            "luscin_ore", new Block
                    (AbstractBlock.Settings.create()

            ));
    public static final Block LUSCIN_BLOCK = registerBlock(
            "luscin_block", new Block(
                    AbstractBlock.Settings.create()

            ));
    public static final Block RAW_LUSCIN_BLOCK = registerBlock(
            "raw_luscin_block", new Block(
            AbstractBlock.Settings.create()
                    .strength(4f, 3.0f)

            ));

    //REGBlocks methods

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TutorialMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        TutorialMod.LOGGER.info("Registering Mod Blocks for " + TutorialMod.MOD_ID);

    }
}
