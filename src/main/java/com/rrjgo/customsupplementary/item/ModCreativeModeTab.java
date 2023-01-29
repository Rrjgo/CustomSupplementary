package com.rrjgo.customsupplementary.item;

import com.rrjgo.customsupplementary.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab SUPPLEMENTARY_TAB = new CreativeModeTab("supplementtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.OVERHEAD_LINE_BLOCK.get());
        }
    };
}
