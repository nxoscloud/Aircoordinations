package io.nxoscloud.aircoordinations.aircraft;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;

public class EnhancedAircraftControlSystem {

    private final Entity aircraft;

    public EnhancedAircraftControlSystem(Entity aircraft) {
        this.aircraft = aircraft;
    }

    public void control(PlayerEntity player) {
        Vec3d velocity = aircraft.getVelocity();
        Vec3d direction = player.getRotationVec(1.0F);

        if (player.isSneaking()) {
            // Descend
            aircraft.setVelocity(velocity.add(0, -0.1, 0));
        } else if (player.input.pressingJump) {
            // Ascend
            aircraft.setVelocity(velocity.add(0, 0.1, 0));
        } else {
            // Forward movement
            aircraft.setVelocity(velocity.add(direction.multiply(0.5)));
        }

        // Turning
        if (player.input.pressingRight) {
            aircraft.setYaw(aircraft.getYaw() + 5);
        } else if (player.input.pressingLeft) {
            aircraft.setYaw(aircraft.getYaw() - 5);
        }
    }
}
