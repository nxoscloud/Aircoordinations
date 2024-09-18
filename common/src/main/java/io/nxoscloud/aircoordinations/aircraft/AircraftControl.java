package io.nxoscloud.aircoordinations.aircraft;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.world.World;
import net.minecraft.util.math.MathHelper;

public class AircraftControl extends AbstractMinecartEntity {

    private static final double FLIGHT_SPEED = 0.1;

    public AircraftControl(EntityType<? extends AbstractMinecartEntity> type, World world) {
        super(type, world);
    }

    @Override
    public void tick() {
        super.tick();
        // Refine flight dynamics
        // Implement pitch, yaw, and roll controls based on player input
        float pitch = MathHelper.sin((float) getYaw() * 0.017453292F) * FLIGHT_SPEED;
        float roll = MathHelper.cos((float) getYaw() * 0.017453292F) * FLIGHT_SPEED;
        setVelocity(getVelocity().add(pitch, roll, 0));
    }
}
