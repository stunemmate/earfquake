package com.github.stunemmate.earfquake.networking.packet;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class TryAttackPacket implements IPacket {

    public TryAttackPacket() {

    }

    public TryAttackPacket(FriendlyByteBuf friendlyByteBuf) {
    }

    @Override
    public void toBytes(FriendlyByteBuf buf) {

    }

    @Override
    public boolean handle(Supplier<NetworkEvent.Context> supplier) {
        NetworkEvent.Context context = supplier.get();
        context.enqueueWork(() -> {
            ServerPlayer player = context.getSender();

            if (player != null) {
                ServerLevel level = player.serverLevel();

                EntityType.PIG.spawn(level, player.blockPosition(), MobSpawnType.COMMAND);
            }
        });
        return true;
    }
}
