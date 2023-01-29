package com.rrjgo.customsupplementary.block;

import com.rrjgo.customsupplementary.CustomSupplementary;
import com.rrjgo.customsupplementary.block.custom.OverheadLineBlock;
import com.rrjgo.customsupplementary.item.ModCreativeModeTab;
import com.rrjgo.customsupplementary.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.lwjgl.system.CallbackI;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CustomSupplementary.MOD_ID);

    public static final RegistryObject<Block> OVERHEAD_LINE_BLOCK = registerBlock("overhead_line_block",
            () -> new OverheadLineBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noOcclusion()),
            ModCreativeModeTab.SUPPLEMENTARY_TAB);



    private  static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block , CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab) {
        return ModItems.ITEMS.register(name,
                () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
