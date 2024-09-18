package io.nxoscloud.aircoordinations.vehicles;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class VehicleAI extends AbstractMinecartEntity {

    private static final int AVOID_RADIUS = 10;

    public VehicleAI(EntityType<? extends AbstractMinecartEntity> type, World world) {
        super(type, world);
    }

    @Override
    public void tick() {
        super.tick();
        avoidCollisions();
        followRoads();
    }

    private void avoidCollisions() {
        // Example logic to avoid collisions
        getWorld().getEntitiesByClass(AbstractMinecartEntity.class, getBoundingBox().expand(AVOID_RADIUS), entity -> !entity.equals(this)).forEach(entity -> {
            Vec3d direction = new Vec3d(getX() - entity.getX(), 0, getZ() - entity.getZ()).normalize();
            setVelocity(direction.multiply(0.5));
        });
    }

    private void followRoads() {
        // Placeholder: Implement road-following logic based on road detection
        BlockPos pos = new BlockPos(getBlockPos());
        // Example: Check if the current block is a road block and adjust direction
        if (getWorld().getBlockState(pos.down()).getBlock() == ModBlocks.ROAD_BLOCK) {
            // Adjust velocity to follow the road
        }
    }
}
