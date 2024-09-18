package io.nxoscloud.aircoordinations;

import io.nxoscloud.aircoordinations.blocks.BlockRegistry;
import io.nxoscloud.aircoordinations.commands.CommandRegistry;
import io.nxoscloud.aircoordinations.worldgen.CityFeature;
import net.fabricmc.api.ModInitializer;
import net.minecraft.server.command.CommandManager;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureRegistry;

public class ModInitializer implements ModInitializer {

    @Override
    public void onInitialize() {
        // Register Blocks
        BlockRegistry.registerBlocks();

        // Register Commands
        CommandRegistry.registerCommands(CommandManager.DISPATCHER);

        // Register Features
        FeatureRegistry.register(Feature.CITY_FEATURE, new CityFeature());

        // Additional initializations if necessary
    }
}
