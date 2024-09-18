package io.nxoscloud.aircoordinations.gui;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;

public class CityManagementGUI extends Screen {

    protected CityManagementGUI() {
        super(Text.of("City Management"));
    }

    @Override
    protected void init() {
        addButton(new ButtonWidget(10, 10, 100, 20, Text.of("Manage City"), button -> {
            // Open a new screen or perform actions
            MinecraftClient.getInstance().setScreen(new ManageCityScreen());
        }));
    }
}
