package io.nxoscloud.aircoordinations.worldgen;

import net.minecraft.block.Blocks;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;

public class AdvancedCityGenerator {

    public static void generateCity(ServerWorld world, BlockPos startPos) {
        int citySize = 40; // Increased city size for better coverage
        BlockPos currentPos = startPos;

        // Generate a more intricate road network and city layout
        for (int x = 0; x < citySize; x++) {
            for (int z = 0; z < citySize; z++) {
                currentPos = startPos.add(x * 40, 0, z * 40);
                generateRoad(world, currentPos);

                if ((x + z) % 10 == 0) {
                    // Spawn different types of buildings
                    if (x % 20 == 0) {
                        generateOffice(world, currentPos.add(4, 0, 4));
                    } else {
                        generateResidentialBuilding(world, currentPos.add(4, 0, 4));
                    }
                }
            }
        }
    }

    private static void generateRoad(ServerWorld world, BlockPos pos) {
        // More complex road network with intersections
        for (int x = -20; x <= 20; x++) {
            world.setBlockState(pos.add(x, 0, 0), Blocks.COBBLESTONE.getDefaultState());
            world.setBlockState(pos.add(0, 0, x), Blocks.COBBLESTONE.getDefaultState());
        }
    }

    private static void generateResidentialBuilding(ServerWorld world, BlockPos pos) {
        // Example: A detailed residential building
        for (int y = 0; y < 8; y++) {
            for (int x = -3; x <= 3; x++) {
                for (int z = -3; z <= 3; z++) {
                    if (y == 0 || y == 7 || x == -3 || x == 3 || z == -3 || z == 3) {
                        world.setBlockState(pos.add(x, y, z), Blocks.WOOD.getDefaultState());
                    } else {
                        world.setBlockState(pos.add(x, y, z), Blocks.AIR.getDefaultState());
                    }
                }
            }
        }
    }

    private static void generateOffice(ServerWorld world, BlockPos pos) {
        // Example: A detailed office building
        for (int y = 0; y < 12; y++) {
            for (int x = -4; x <= 4; x++) {
                for (int z = -4; z <= 4; z++) {
                    if (y == 0 || y == 11 || x == -4 || x == 4 || z == -4 || z == 4) {
                        world.setBlockState(pos.add(x, y, z), Blocks.BRICK_BLOCK.getDefaultState());
                    } else {
                        world.setBlockState(pos.add(x, y, z), Blocks.AIR.getDefaultState());
                    }
                }
            }
        }
    }
}
