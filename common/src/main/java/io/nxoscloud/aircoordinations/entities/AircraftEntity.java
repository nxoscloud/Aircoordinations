package io.nxoscloud.aircoordinations.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.world.World;

public class AircraftEntity extends BoatEntity {
    public AircraftEntity(EntityType<? extends BoatEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public void tick() {
        super.tick();
        if (this.isInAir()) {
            this.setVelocity(this.getVelocity().add(0, 0.1, 0)); // Simulating lift
        }
    }

    private boolean isInAir() {
        return this.getY() > 100; // Placeholder altitude logic
    }
}
