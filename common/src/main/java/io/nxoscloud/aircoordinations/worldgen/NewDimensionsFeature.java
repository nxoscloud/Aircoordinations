package io.nxoscloud.aircoordinations.worldgen;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;

public class NewDimensionsFeature extends Feature<DefaultFeatureConfig> {

    public NewDimensionsFeature(Codec<DefaultFeatureConfig> codec) {
        super(codec);
    }

    @Override
    public boolean generate(FeatureContext<DefaultFeatureConfig> context) {
        // Implement new dimension logic
        ServerWorld world = context.getWorld();
        BlockPos pos = context.getOrigin();

        // Generate new dimension features
        AdvancedWorldGeneration.generateWorld(world, pos);
        return true;
    }
}
