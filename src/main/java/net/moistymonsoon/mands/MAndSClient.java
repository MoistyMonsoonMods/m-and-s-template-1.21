package net.moistymonsoon.mands;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.moistymonsoon.mands.entity.ModEntities;
import net.moistymonsoon.mands.entity.client.LurcherRenderer;
import net.moistymonsoon.mands.entity.client.ModModelLayers;

public class MAndSClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.LURCHER, LurcherRenderer::new);
    }
}
