package net.topiqq.Item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.topiqq.TutorialMod;
import net.topiqq.block.ModBlocks;

public class ModItemsGroups {
    //do not touch above
    //creating and registering item groups
    public static final ItemGroup LUSCINIER = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "luscinier"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModItems.LUSCIN_INGOT))
                    .displayName(Text.translatable("itemgroup.tutorialmod.luscinier"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.RAW_LUSCIN_BLOCK);
                        entries.add(ModBlocks.LUSCIN_BLOCK);
                        entries.add(ModBlocks.LUSCIN_ORE);
                        entries.add(ModBlocks.DEEPSLATE_LUSCIN_ORE);
                        entries.add(ModItems.RAW_LUSCIN);
                        entries.add(ModItems.LUSCIN_INGOT);
                        entries.add(ModItems.CLEAR_LUSCIN);


                    }).build());

    public static void registerItemGruop(){
        TutorialMod.LOGGER.info("Registering mod item groups for" + TutorialMod.MOD_ID);
    }
}
