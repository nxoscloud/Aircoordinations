package io.nxoscloud.aircoordinations.forge;

import dev.architectury.platform.forge.EventBuses;
import io.nxoscloud.aircoordinations.Aircoordinations;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Aircoordinations.MOD_ID)
public class AircoordinationsForge {
    public AircoordinationsForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Aircoordinations.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
            Aircoordinations.init();
    }
}