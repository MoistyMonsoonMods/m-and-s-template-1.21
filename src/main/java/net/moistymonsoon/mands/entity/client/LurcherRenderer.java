package net.moistymonsoon.mands.entity.client;

import com.google.common.collect.Maps;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.moistymonsoon.mands.MAndS;
import net.moistymonsoon.mands.entity.custom.LurcherEntity;
import net.moistymonsoon.mands.entity.variant.LurcherVariant;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import java.util.Map;

public class LurcherRenderer extends GeoEntityRenderer<LurcherEntity> {
    public static final Map<LurcherVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(LurcherVariant.class), (map) -> {
                map.put(LurcherVariant.BLACK,
                        Identifier.of(MAndS.MOD_ID, "textures/entity/lurcher/lurcherblack.png"));
                map.put(LurcherVariant.BROWN,
                        Identifier.of(MAndS.MOD_ID, "textures/entity/lurcher/lurcherbrown.png"));
                map.put(LurcherVariant.MERLE,
                        Identifier.of(MAndS.MOD_ID, "textures/entity/lurcher/lurchergrey.png"));
            });

    public LurcherRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new LurcherModel());
    }

    @Override
    public Identifier getTextureLocation(LurcherEntity animatable) {
        return LOCATION_BY_VARIANT.get(animatable.getVariant());
    }

    @Override
    public void render(LurcherEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        if (entity.isBaby()) {
            poseStack.scale(0.5f, 0.5f, 0.5f);
        }
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
