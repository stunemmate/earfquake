package com.github.stunemmate.earfquake.client.handler;

import com.github.stunemmate.earfquake.Earfquake;
import com.github.stunemmate.earfquake.client.KeyMappings;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Earfquake.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModHandler {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {

    }

    @SubscribeEvent
    public static void registerKeys(RegisterKeyMappingsEvent event) {
        event.register(KeyMappings.INSTANCE.toggleAimingKey);
    }
}
