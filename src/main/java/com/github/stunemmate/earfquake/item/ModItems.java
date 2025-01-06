package com.github.stunemmate.earfquake.item;

import com.github.stunemmate.earfquake.Earfquake;
import com.github.stunemmate.earfquake.item.weapon.BoltSniperRifle;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Earfquake.MOD_ID);

    public static final RegistryObject<Item> BOLT_SNIPER_RIFLE = ITEMS.register("bolt_sniper_rifle", BoltSniperRifle::new);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
