package io.nxoscloud.aircoordinations.entities;

import io.nxoscloud.aircoordinations.blocks.RoadBlock;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.world.World;

public class VehicleEntity extends BoatEntity {
    public VehicleEntity(EntityType<? extends BoatEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public void tick() {
        super.tick();
        // Custom vehicle movement on roads
        if (this.isOnRoad()) {
            this.setVelocity(this.getVelocity().multiply(1.2)); // Speed boost on road
        }
    }

    private boolean isOnRoad() {
        return this.world.getBlockState(this.getBlockPos().down()).getBlock() instanceof RoadBlock;
    }
}
