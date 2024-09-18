package io.nxoscloud.aircoordinations.airports;

import net.minecraft.util.math.BlockPos;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.block.Blocks;

public class AirportManager {

    public static void setupAirport(ServerWorld world, BlockPos pos) {
        createRunways(world, pos);
        createHangars(world, pos);
    }

    private static void createRunways(ServerWorld world, BlockPos pos) {
        // Create runway layout
        for (int i = -10; i <= 10; i++) {
            for (int j = -50; j <= 50; j++) {
                world.setBlockState(pos.add(i, 0, j), Blocks.CONCRETE.getDefaultState());
            }
        }
    }

    private static void createHangars(ServerWorld world, BlockPos pos) {
        // Create hangar layout
        for (int y = 0; y < 5; y++) {
            for (int x = -10; x <= 10; x++) {
                for (int z = -10; z <= 10; z++) {
                    if (y == 0 || y == 4) {
                        world.setBlockState(pos.add(x, y, z), Blocks.IRON_BLOCK.getDefaultState());
                    } else {
                        world.setBlockState(pos.add(x, y, z), Blocks.AIR.getDefaultState());
                    }
                }
            }
        }
    }
}
