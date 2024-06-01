package com.cloudbrain.coolstuffmod.item;

import com.cloudbrain.coolstuffmod.block.ModBlocks;
import com.cloudbrain.coolstuffmod.main.CoolStuffMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CoolStuffMod.MODID);

    public static final DeferredItem<Item> ORANGE = ITEMS.register("orange", () ->
            new Item(new Item.Properties().stacksTo(16).fireResistant().food(ModFoods.ORANGE)));

    public static final DeferredItem<BlockItem> CHECKERED_TILE = ITEMS.registerSimpleBlockItem("checkered_tile", ModBlocks.CHECKERED_TILE);
    public static final DeferredItem<BlockItem> BLEEDING_LOG = ITEMS.registerSimpleBlockItem("bleeding_log", ModBlocks.BLEEDING_LOG);
    public static final DeferredItem<BlockItem> BLEEDING_PLANKS = ITEMS.registerSimpleBlockItem("bleeding_planks", ModBlocks.BLEEDING_PLANKS);
    public static final DeferredItem<BlockItem> BLEEDING_SLAB = ITEMS.registerSimpleBlockItem("bleeding_slab", ModBlocks.BLEEDING_SLAB);
}
