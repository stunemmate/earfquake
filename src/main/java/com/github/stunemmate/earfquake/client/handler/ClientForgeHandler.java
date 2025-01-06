package com.github.stunemmate.earfquake.client.handler;

import com.github.stunemmate.earfquake.Earfquake;
import com.github.stunemmate.earfquake.client.KeyMappings;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Earfquake.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientForgeHandler {

    @SubscribeEvent
    public static void clientTick(TickEvent.ClientTickEvent event) {
        Minecraft minecraft = Minecraft.getInstance();

        if (KeyMappings.INSTANCE.toggleAimingKey.consumeClick() && minecraft.player != null) {
            Earfquake.LOGGER.debug("Toggle aiming key consumed click");
        }
    }
}
