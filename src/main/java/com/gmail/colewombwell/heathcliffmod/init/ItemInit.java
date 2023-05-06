package com.gmail.colewombwell.heathcliffmod.init;

import com.gmail.colewombwell.heathcliffmod.HeathcliffModMain;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, HeathcliffModMain.MODID);

    public static final RegistryObject<Item> HEATHCLIFF_COIN = ITEMS.register("heathcliff_coin", () -> new Item(new Item.Properties().tab(HeathcliffModMain.TAB)));
    public static final RegistryObject<Item> HEATHCLIFF_SOUL = ITEMS.register("heathcliff_soul", () -> new Item(new Item.Properties().tab(HeathcliffModMain.TAB)));



}
