package com.github.stunemmate.earfquake.client;

import com.github.stunemmate.earfquake.Earfquake;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public final class KeyMappings {

    public static final KeyMappings INSTANCE = new KeyMappings();

    private static final String CATEGORY = "key.categories." + Earfquake.MOD_ID;

    public final KeyMapping toggleAimingKey = new KeyMapping(
            "key." + Earfquake.MOD_ID + ".toggle_aiming_key",
            KeyConflictContext.IN_GAME,
            InputConstants.Type.MOUSE,
            GLFW.GLFW_MOUSE_BUTTON_RIGHT,
            CATEGORY);

    private KeyMappings() {
    }
}
