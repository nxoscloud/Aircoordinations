package io.nxoscloud.aircoordinations.worldgen;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Builder;

public class BiomeGenerator {

    public static void generateBiomes() {
        // Generate new biomes with unique features
        Biome newBiome = new Builder()
                .category(Biome.Category.PLAINS)
                .precipitation(Biome.Precipitation.RAIN)
                .temperature(0.8F)
                .downfall(0.4F)
                .build();

        System.out.println("Generated new biome: " + newBiome);
    }
}
