package io.nxoscloud.aircoordinations.entities;

import net.minecraft.entity.vehicle.MinecartEntity;
import net.minecraft.world.World;

public class MilitaryVehicleEntity extends MinecartEntity {
    public MilitaryVehicleEntity(EntityType<? extends MinecartEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public void tick() {
        super.tick();
        // Custom military vehicle logic
    }
}
