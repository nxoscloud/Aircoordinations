package io.nxoscloud.aircoordinations.worldgen;

import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.level.chunk.ChunkGenerator;

import java.util.Random;

public class CitySpawner extends Feature<DefaultFeatureConfig> {

    public CitySpawner() {
        super(DefaultFeatureConfig.CODEC);
    }

    @Override
    public boolean generate(ServerWorld world, ChunkGenerator generator, Random random, BlockPos pos, DefaultFeatureConfig config) {
        // Generate cities and towns at specified locations
        if (random.nextInt(10) == 0) {
            CityGenerator.generateCity(world, pos);
        }
        return true;
    }
}
