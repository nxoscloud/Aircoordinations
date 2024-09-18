package io.nxoscloud.aircoordinations.gui;

import net.fabricmc.fabric.api.client.screen.v1.ScreenRegistry;
import net.minecraft.client.gui.screen.Screen;

public class GUIRegistry {

    public static void registerScreens() {
        ScreenRegistry.register("aircoordinations:city_gui", CityGUI::new);
    }
}
