package com.gmail.colewombwell.heathcliffmod.init;

import com.gmail.colewombwell.heathcliffmod.HeathcliffModMain;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, HeathcliffModMain.MODID);

    public static final RegistryObject<Block> HEATHCLIFF_BLOCK = register("heathcliff_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).jumpFactor(5f)),
                new Item.Properties().tab(HeathcliffModMain.TAB) );

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties) {

        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }


}
