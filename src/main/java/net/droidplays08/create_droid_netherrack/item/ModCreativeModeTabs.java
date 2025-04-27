package net.droidplays08.create_droid_netherrack.item;

import net.droidplays08.create_droid_netherrack.CreateDroidNetherrack;
import net.droidplays08.create_droid_netherrack.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateDroidNetherrack.MODID);

    public static final Supplier<CreativeModeTab> CREATE_DROID_NETHERRACK = CREATIVE_MODE_TAB.register("create_droid_netherrack_tab",
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
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
