package io.nxoscloud.aircoordinations.worldgen;

import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;

public class WorldGenerationConfig {

    public static void registerFeatures() {
        // Register custom features for world generation
        Feature<DefaultFeatureConfig> cityFeature = new CityFeature(DefaultFeatureConfig.CODEC);
        // Register features with world generation
    }
}
