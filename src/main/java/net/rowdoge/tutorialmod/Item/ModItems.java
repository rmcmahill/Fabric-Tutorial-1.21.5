// example of how to add custom items through fabric modding

package net.rowdoge.tutorialmod.Item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.rowdoge.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

// class for mod items
public class ModItems {


    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));


    // registers the items
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }

    // called by other classes to register mod items
    public static void registerModItems(){
        TutorialMod.LOGGER.info("Registering mod items for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(PINK_GARNET);
        });
    }
}
