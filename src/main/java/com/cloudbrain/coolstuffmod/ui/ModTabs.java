package com.cloudbrain.coolstuffmod.ui;

import com.cloudbrain.coolstuffmod.block.ModBlocks;
import com.cloudbrain.coolstuffmod.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.cloudbrain.coolstuffmod.main.CoolStuffMod.MODID;

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> COOL_STUFF_ITEMS =
            CREATIVE_TABS.register("coolstuffitems", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.coolstuffmod"))
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .icon(() -> ModItems.ORANGE.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.ORANGE.get());
                    }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> COOL_STUFF_BLOCKS =
            CREATIVE_TABS.register("coolstuffblocks", () -> CreativeModeTab.builder()
                    .title(Component.translatable("blockGroup.coolstuffmod"))
                    .withTabsBefore(COOL_STUFF_ITEMS.getKey())
                    .icon(() -> ModItems.CHECKERED_TILE.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.CHECKERED_TILE.get());
                        output.accept(ModBlocks.BLEEDING_LOG.get());
                        output.accept(ModBlocks.BLEEDING_PLANKS.get());
                        output.accept(ModBlocks.BLEEDING_SLAB.get());
                    }).build());
}
