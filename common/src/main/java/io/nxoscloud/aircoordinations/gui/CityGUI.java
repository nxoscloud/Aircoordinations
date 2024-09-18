package io.nxoscloud.aircoordinations.gui;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

public class CityGUI extends Screen {

    protected CityGUI() {
        super(Text.of("City Management"));
    }

    @Override
    protected void init() {
        super.init();
        this.addButton(new ButtonWidget(this.width / 2 - 100, this.height / 4, 200, 20, Text.of("Manage Economy"), button -> {
            // Open economy management screen
        }));
    }

    @Override
    public void render(int mouseX, int mouseY, float delta) {
        this.renderBackground();
        super.render(mouseX, mouseY, delta);
    }
}
