package io.nxoscloud.aircoordinations.worldgen;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.Biome.Builder;

public class CustomBiome extends Biome {

    public CustomBiome() {
        super(new Builder()
                .precipitation(Biome.Precipitation.RAIN)
                .category(Biome.Category.PLAINS)
                .depth(0.1F)
                .scale(0.2F)
                .temperature(0.8F)
                .downfall(0.4F)
                .effects(new BiomeEffects.Builder()
                        .waterColor(4159204)
                        .waterFogColor(329011)
                        .fogColor(12638463)
                        .skyColor(calculateSkyColor(0.8F))
                        .build())
                .build());
    }
}
