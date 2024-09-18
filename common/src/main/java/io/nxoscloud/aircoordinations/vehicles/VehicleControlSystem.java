package io.nxoscloud.aircoordinations.vehicles;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class VehicleControlSystem {

    private final Entity vehicle;

    public VehicleControlSystem(Entity vehicle) {
        this.vehicle = vehicle;
    }

    public void control(PlayerEntity player) {
        World world = vehicle.world;

        if (player.isSneaking()) {
            // Braking mechanism
            Vec3d velocity = vehicle.getVelocity().multiply(0.9);
            vehicle.setVelocity(velocity);
        } else {
            // Accelerate forward
            Vec3d lookVec = player.getRotationVec(1.0F).multiply(0.5);
            vehicle.setVelocity(vehicle.getVelocity().add(lookVec));
        }

        // Simple turning
        if (player.input.pressingRight) {
            vehicle.setYaw(vehicle.getYaw() + 2);
        } else if (player.input.pressingLeft) {
            vehicle.setYaw(vehicle.getYaw() - 2);
        }
    }
}
