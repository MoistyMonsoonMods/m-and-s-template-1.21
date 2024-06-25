package net.moistymonsoon.mands.entity.client;

import net.minecraft.entity.AnimationState;
import net.minecraft.util.Identifier;
import net.moistymonsoon.mands.MAndS;
import net.moistymonsoon.mands.entity.custom.LurcherEntity;
import software.bernie.geckolib.model.GeoModel;

public class LurcherModel extends GeoModel<LurcherEntity> {
    @Override
    public Identifier getModelResource(LurcherEntity animatable) {
        return Identifier.of(MAndS.MOD_ID,  "geo/lurcher.geo.json");
    }

    @Override
    public Identifier getTextureResource(LurcherEntity animatable) {
        return LurcherRenderer.LOCATION_BY_VARIANT.get(animatable.getVariant());
    }

    @Override
    public Identifier getAnimationResource(LurcherEntity animatable) {
        return Identifier.of(MAndS.MOD_ID,  "animations/lurcher.animation.json");
    }

}
