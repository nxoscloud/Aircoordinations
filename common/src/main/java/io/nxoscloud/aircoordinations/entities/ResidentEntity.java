package io.nxoscloud.aircoordinations.entities;

import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;

public class ResidentEntity extends MobEntity {

    private String job;
    private String home;

    public ResidentEntity(EntityType<? extends MobEntity> entityType, World world, String job, String home) {
        super(entityType, world);
        this.job = job;
        this.home = home;
    }

    public String getJob() {
        return job;
    }

    public String getHome() {
        return home;
    }

    public void goToWork() {
        // Logic for going to work at a specific location
    }

    public void returnHome() {
        // Logic for returning home
    }
}
