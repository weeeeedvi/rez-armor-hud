package com.rez.armorhud;

import com.rez.armorhud.config.ModConfig;
import com.rez.armorhud.render.ArmorHudRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;

public class ArmorHud implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModConfig.get();
        HudRenderCallback.EVENT.register(ArmorHudRenderer::render);
    }
}
