package io.nxoscloud.aircoordinations.entities.ai;

import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class SoldierPatrolGoal extends Goal {
    private final MobEntity soldier;
    private final Random random = new Random();

    public SoldierPatrolGoal(MobEntity soldier) {
        this.soldier = soldier;
    }

    @Override
    public boolean canStart() {
        return random.nextInt(100) == 0; // Random patrol start
    }

    @Override
    public void start() {
        BlockPos patrolPos = getRandomPatrolPoint();
        soldier.getNavigation().startMovingTo(patrolPos.getX(), patrolPos.getY(), patrolPos.getZ(), 1.0);
    }

    private BlockPos getRandomPatrolPoint() {
        return soldier.getBlockPos().add(random.nextInt(20) - 10, 0, random.nextInt(20) - 10);
    }
}
