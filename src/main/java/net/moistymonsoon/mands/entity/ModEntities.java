package net.moistymonsoon.mands.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.moistymonsoon.mands.MAndS;
import net.moistymonsoon.mands.entity.custom.LurcherEntity;

public class ModEntities {

    public static final EntityType<LurcherEntity> LURCHER = Registry.register(Registries.ENTITY_TYPE, Identifier.of(MAndS.MOD_ID, "lurcher"),
            EntityType.Builder.create(LurcherEntity::new, SpawnGroup.CREATURE)
                    .dimensions(1f,1f).build());


    public static void registerModEntities() {
        MAndS.LOGGER.info("Registering Entities for " +  MAndS.MOD_ID);
    }
}
