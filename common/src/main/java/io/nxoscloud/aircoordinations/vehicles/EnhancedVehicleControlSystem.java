package io.nxoscloud.aircoordinations.vehicles;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class EnhancedVehicleControlSystem {

    private final Entity vehicle;

    public EnhancedVehicleControlSystem(Entity vehicle) {
        this.vehicle = vehicle;
    }

    public void control(PlayerEntity player) {
        World world = vehicle.world;
        Vec3d velocity = vehicle.getVelocity();

        if (player.isSneaking()) {
            // Brake
            vehicle.setVelocity(velocity.multiply(0.5));
        } else {
            // Accelerate
            Vec3d direction = player.getRotationVec(1.0F).multiply(0.2);
            vehicle.setVelocity(velocity.add(direction));
        }

        // Turning
        if (player.input.pressingRight) {
            vehicle.setYaw(vehicle.getYaw() + 5);
        } else if (player.input.pressingLeft) {
            vehicle.setYaw(vehicle.getYaw() - 5);
        }
    }
}
