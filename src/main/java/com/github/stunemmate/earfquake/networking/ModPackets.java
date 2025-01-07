package com.github.stunemmate.earfquake.networking;

import com.github.stunemmate.earfquake.Earfquake;
import com.github.stunemmate.earfquake.networking.packet.TryAttackPacket;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.simple.SimpleChannel;

public class ModPackets {
    private static final String PROTOCOL_VERSION = "1";

    public static final SimpleChannel INSTANCE = NetworkRegistry.ChannelBuilder
            .named(new ResourceLocation(Earfquake.MOD_ID, "main"))
            .networkProtocolVersion(() -> PROTOCOL_VERSION)
            .clientAcceptedVersions(s -> true)
            .serverAcceptedVersions(s -> true)
            .simpleChannel();

    private static int packetId = 0;

    private static int nextPacketId() {
        return packetId++;
    }

    public static <P> void sendToServer(P packet) {
        INSTANCE.sendToServer(packet);
    }

    public static <P> void sendToPlayer(P packet, ServerPlayer player) {
        INSTANCE.send(PacketDistributor.PLAYER.with(() -> player), packet);
    }

    public static void register() {
        INSTANCE.messageBuilder(TryAttackPacket.class, nextPacketId(), NetworkDirection.PLAY_TO_SERVER)
                .decoder(TryAttackPacket::new)
                .encoder(TryAttackPacket::toBytes)
                .consumerMainThread(TryAttackPacket::handle)
                .add();
    }
}
