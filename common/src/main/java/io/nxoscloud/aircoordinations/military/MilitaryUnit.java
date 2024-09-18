package io.nxoscloud.aircoordinations.military;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class MilitaryUnit extends MobEntity {

    private static final int PATROL_RADIUS = 50;
    private BlockPos[] patrolPoints;

    public MilitaryUnit(EntityType<? extends MobEntity> type, ServerWorld world) {
        super(type, world);
        // Initialize default patrol points or load from configuration
    }

    @Override
    public void tick() {
        super.tick();
        // Add patrol and defense logic
        if (patrolPoints != null) {
            patrol();
        }
        defend();
    }

    private void patrol() {
        // Patrol logic: Move between defined points
        if (patrolPoints.length > 0) {
            BlockPos target = patrolPoints[(int) (tickCount / 100) % patrolPoints.length];
            Vec3d direction = new Vec3d(target.getX() - getX(), 0, target.getZ() - getZ()).normalize();
            setVelocity(direction.multiply(0.5));
            getNavigation().startMovingTo(target.getX(), target.getY(), target.getZ(), 1.0);
        }
    }

    private void defend() {
        // Defense logic: Attack enemies within range
        getWorld().getEntitiesByClass(MobEntity.class, getBoundingBox().expand(20), entity -> !entity.equals(this)).forEach(enemy -> {
            attack(enemy);
        });
    }

    public void setPatrolPoints(BlockPos[] points) {
        this.patrolPoints = points;
    }
}
