package io.nxoscloud.aircoordinations.worldgen;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig.Target;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.chunk.ChunkGeneratorConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GenerationStep;

public class CustomWorldGenerator {

    public static void generateCustomWorld(ServerWorld world) {
        // Define custom biomes
        Biome customBiome = new CustomBiome();

        // Register custom biomes and features
        Registry.register(Registry.BIOME, "aircoordinations:custom_biome", customBiome);

        // Define custom world features
        ConfiguredFeature<?, ?> customFeature = Feature.ORE.configure(new OreFeatureConfig(Target.NATURAL_STONE, Blocks.DIAMOND_ORE.getDefaultState(), 7));
        PlacedFeature placedFeature = customFeature.withPlacement(Placement.COUNT_HEIGHTMAP.configure(new CountConfig(10)));

        world.getChunkManager().getChunkGenerator().addFeature(GenerationStep.Feature.UNDERGROUND_ORES, placedFeature);
    }
}
