package com.cloudbrain.coolstuffmod.main;

import com.cloudbrain.coolstuffmod.block.ModBlocks;
import com.cloudbrain.coolstuffmod.item.ModItems;
import com.cloudbrain.coolstuffmod.ui.ModTabs;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(CoolStuffMod.MODID)
public class CoolStuffMod
{
    public static final String MODID = "coolstuffmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CoolStuffMod(IEventBus modEventBus, ModContainer modContainer)
    {
        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        ModTabs.CREATIVE_TABS.register(modEventBus);
    }
}
