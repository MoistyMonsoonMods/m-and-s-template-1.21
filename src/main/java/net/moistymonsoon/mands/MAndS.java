package net.moistymonsoon.mands;

import net.fabricmc.api.ModInitializer;

import net.moistymonsoon.mands.entity.ModEntities;
import net.moistymonsoon.mands.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MAndS implements ModInitializer {
	public static final String MOD_ID = "mands";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModEntities.registerModEntities();
	}
}