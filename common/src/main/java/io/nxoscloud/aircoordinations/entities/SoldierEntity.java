package io.nxoscloud.aircoordinations.entities;

import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;

public class SoldierEntity extends MobEntity {
    public SoldierEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public void tick() {
        super.tick();
        // Custom behavior for soldiers (e.g., patrol, defend city)
    }
}
