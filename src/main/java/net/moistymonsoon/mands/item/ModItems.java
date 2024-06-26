package net.moistymonsoon.mands.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.moistymonsoon.mands.MAndS;
import net.moistymonsoon.mands.entity.ModEntities;

public class ModItems {

    public static final Item TRINK = registerItem("trink", new Item(new Item.Settings()));

    public static final Item LURCHER_SPAWN_EGG = registerItem("lurcher_spawn_egg", new SpawnEggItem(ModEntities.LURCHER, 0x36333F, 0xada19F, new Item.Settings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(TRINK);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MAndS.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MAndS.LOGGER.info("Registering Mod Items for " + MAndS.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
