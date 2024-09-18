package io.nxoscloud.aircoordinations.transport;

import io.nxoscloud.aircoordinations.entities.TrainEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class TrainSystem {

    public static void createTrain(World world, double x, double y, double z) {
        TrainEntity train = new TrainEntity(EntityType.MINECART, world);
        train.setPosition(x, y, z);
        world.spawnEntity(train);
    }
}
