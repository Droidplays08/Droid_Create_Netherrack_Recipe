package net.droidplays08.create_droid_netherrack.item;

import net.droidplays08.create_droid_netherrack.CreateDroidNetherrack;
import net.droidplays08.create_droid_netherrack.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> Creative_Mode_Tabs =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateDroidNetherrack.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = Creative_Mode_Tabs.register("create_droid_netherrack_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.HEATED_COBBLE_POWDER.get()))
                    .title(Component.translatable("creativetab.create_droid_netherrack_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.HEATED_COBBLE_POWDER.get());
                        output.accept(ModBlocks.HEATED_CRACKED_COBBLE.get());
                        output.accept(ModItems.INCOMPLETE_NETHERRACK_POWDER.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        Creative_Mode_Tabs.register(eventBus);
    }
}
