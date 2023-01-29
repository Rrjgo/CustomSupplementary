package com.rrjgo.customsupplementary.item;

import com.rrjgo.customsupplementary.CustomSupplementary;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CustomSupplementary.MOD_ID);


    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
