package io.nxoscloud.aircoordinations.aircraft;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;

public class AircraftControlSystem {

    private final Entity aircraft;

    public AircraftControlSystem(Entity aircraft) {
        this.aircraft = aircraft;
    }

    public void control(Player player) {
        if (player.isShiftKeyDown()) {
            // Decrease altitude
            aircraft.setVelocity(aircraft.getVelocity().subtract(0, 0.1, 0));
        } else {
            // Increase altitude
            aircraft.setVelocity(aircraft.getVelocity().add(0, 0.1, 0));
        }

        // Forward movement
        Vec3d lookVec = player.getRotationVec(1.0F).multiply(0.5);
        aircraft.setVelocity(aircraft.getVelocity().add(lookVec));
    }
}
