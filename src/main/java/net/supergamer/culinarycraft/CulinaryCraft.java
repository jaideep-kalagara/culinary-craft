package net.supergamer.culinarycraft;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CulinaryCraft implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("culinarycraft");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}