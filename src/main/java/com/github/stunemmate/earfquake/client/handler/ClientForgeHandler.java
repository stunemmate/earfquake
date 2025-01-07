package com.github.stunemmate.earfquake.client.handler;

import com.github.stunemmate.earfquake.Earfquake;
import com.github.stunemmate.earfquake.client.KeyMappings;
import com.github.stunemmate.earfquake.networking.ModPackets;
import com.github.stunemmate.earfquake.networking.packet.TryAttackPacket;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Earfquake.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientForgeHandler {

    @SubscribeEvent
    public static void inputKey(InputEvent.Key event) {
        Minecraft minecraft = Minecraft.getInstance();

        if (KeyMappings.TOGGLE_AIMING_KEY.consumeClick() && minecraft.player != null) {
            Earfquake.LOGGER.debug("Toggle aiming key consumed click");

            ModPackets.sendToServer(new TryAttackPacket());
        }
    }
}
