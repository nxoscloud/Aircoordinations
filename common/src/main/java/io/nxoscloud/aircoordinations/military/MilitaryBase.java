package io.nxoscloud.aircoordinations.military;

import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.block.Blocks;

public class MilitaryBase {

    public static void setupBase(ServerWorld world, BlockPos pos) {
        generateBarracks(world, pos);
        generateDefenseStructures(world, pos);
        spawnMilitaryUnits(world, pos);
    }

    private static void generateBarracks(ServerWorld world, BlockPos pos) {
        // Generate barracks structure
        for (int y = 0; y < 5; y++) {
            for (int x = -10; x <= 10; x++) {
                for (int z = -10; z <= 10; z++) {
                    if (y == 0 || y == 4) {
                        world.setBlockState(pos.add(x, y, z), Blocks.STONE_BRICKS.getDefaultState());
                    } else {
                        world.setBlockState(pos.add(x, y, z), Blocks.AIR.getDefaultState());
                    }
                }
            }
        }
    }

    private static void generateDefenseStructures(ServerWorld world, BlockPos pos) {
        // Create defense structures like walls and turrets
        for (int i = 0; i < 8; i++) {
            world.setBlockState(pos.add(i, 1, 0), Blocks.TNT.getDefaultState());
        }
    }

    private static void spawnMilitaryUnits(ServerWorld world, BlockPos pos) {
        // Spawn military units around the base
        for (int i = 0; i < 5; i++) {
            // Example: Spawn soldiers (custom entity)
            MilitaryUnitEntity soldier = new MilitaryUnitEntity(EntityType.PIG, world);
            soldier.setPosition(pos.getX(), pos.getY(), pos.getZ());
            world.spawnEntity(soldier);
        }
}
