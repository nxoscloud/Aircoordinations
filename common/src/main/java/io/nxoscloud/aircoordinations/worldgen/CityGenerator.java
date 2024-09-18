package io.nxoscloud.aircoordinations.worldgen;

import net.minecraft.block.Blocks;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class CityGenerator {
    public static void generateCity(ServerWorld world, BlockPos startPos) {
        // Determine city size and layout
        int citySize = 10; // Example city radius in chunks
        BlockPos currentPos = startPos;

        // Generate road network in a grid pattern
        for (int x = 0; x < citySize; x++) {
            for (int z = 0; z < citySize; z++) {
                currentPos = startPos.add(x * 10, 0, z * 10);
                generateRoad(world, currentPos);

                if ((x + z) % 3 == 0) {
                    // Spawn buildings in every third block
                    generateBuilding(world, currentPos.add(2, 0, 2));
                }
            }
        }
    }

    private static void generateRoad(ServerWorld world, BlockPos pos) {
        // Simple road logic - placing stone blocks for roads
        for (int x = -5; x <= 5; x++) {
            for (int z = -5; z <= 5; z++) {
                world.setBlockState(pos.add(x, 0, z), Blocks.STONE.getDefaultState());
            }
        }
    }

    private static void generateBuilding(ServerWorld world, BlockPos pos) {
        // Simple building logic - a small box of iron blocks
        for (int y = 0; y < 10; y++) {
            for (int x = -2; x <= 2; x++) {
                for (int z = -2; z <= 2; z++) {
                    if (y == 0 || y == 9 || x == -2 || x == 2 || z == -2 || z == 2) {
                        world.setBlockState(pos.add(x, y, z), Blocks.IRON_BLOCK.getDefaultState());
                    } else {
                        world.setBlockState(pos.add(x, y, z), Blocks.AIR.getDefaultState());
                    }
                }
            }
        }
    }
}
