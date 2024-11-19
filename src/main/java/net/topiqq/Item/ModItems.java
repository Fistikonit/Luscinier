package net.topiqq.Item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.topiqq.TutorialMod;

public class ModItems {
    //do not touch above

    //Creating and registering items
    public static final Item LUSCIN_INGOT = registerItem("luscin_ingot", new Item(new Item.Settings()));
    public static final Item RAW_LUSCIN = registerItem("raw_luscin", new Item(new Item.Settings()));
    public static final Item CLEAR_LUSCIN = registerItem("clear_luscin", new Item(new Item.Settings()));

    //REGItems method

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    };

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for"+ TutorialMod.MOD_ID);
        // adding our items to specific CIT(Item Groups)
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(LUSCIN_INGOT);
            entries.add(RAW_LUSCIN);
            entries.add(CLEAR_LUSCIN);
        });
    }
}
