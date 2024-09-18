package io.nxoscloud.aircoordinations;

import dev.architectury.platform.Platform;
import io.nxoscloud.aircoordinations.blocks.CityBlock;
import io.nxoscloud.aircoordinations.commands.BuildCityCommand;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.util.registry.Registry;
import net.minecraft.block.Block;

public class Aircoordinations {
	public static final String MOD_ID = "aircoordinations";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	public static void init() {
		CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> {
			BuildCityCommand.register(dispatcher);
		});
		LOGGER.info("AirCoordinations is starting!");
		if (Platform.isForge()) {
			LOGGER.info("Running on Forge!");
		} else {
			LOGGER.info("Running on Fabric!");
		}
	}

	public static Identifier id(String name) {
		return new Identifier(MOD_ID, name);
	}
}


