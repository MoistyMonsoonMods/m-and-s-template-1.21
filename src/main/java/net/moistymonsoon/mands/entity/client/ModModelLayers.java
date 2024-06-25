package net.moistymonsoon.mands.entity.client;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.moistymonsoon.mands.MAndS;

public class ModModelLayers {
    public static final EntityModelLayer LURCHER =
            new EntityModelLayer(Identifier.of(MAndS.MOD_ID, "lurcher"), "main");
}

