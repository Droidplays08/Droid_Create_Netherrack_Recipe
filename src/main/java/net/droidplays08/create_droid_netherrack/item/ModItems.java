package net.droidplays08.create_droid_netherrack.item;

import net.droidplays08.create_droid_netherrack.CreateDroidNetherrack;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateDroidNetherrack.MODID);

    public static final DeferredItem<Item> HEATED_COBBLE_POWDER = ITEMS.register("heated_cobble_powder",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_NETHERRACK_POWDER = ITEMS.register("incomplete_netherrack_powder",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
