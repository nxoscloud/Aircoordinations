package io.nxoscloud.aircoordinations.fabric;

import io.nxoscloud.aircoordinations.Aircoordinations;
import net.fabricmc.api.ModInitializer;

public class AircoordinationsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Aircoordinations.init();
    }
}