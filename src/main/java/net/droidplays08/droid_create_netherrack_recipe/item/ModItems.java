package net.droidplays08.droid_create_netherrack_recipe.item;

import net.droidplays08.droid_create_netherrack_recipe.Droid_Create_Netherrack_Recipe;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, Droid_Create_Netherrack_Recipe.MOD_ID);

    public static final RegistryObject<Item> HEATED_COBBLE_POWDER = Items.register("heated_cobble_powder",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_NETHERRACK_POWDER = Items.register("incomplete_netherrack_powder",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        Items.register(eventBus);
    }
}
