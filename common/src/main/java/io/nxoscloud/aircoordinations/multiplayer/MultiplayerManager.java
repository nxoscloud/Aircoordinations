package io.nxoscloud.aircoordinations.multiplayer;

import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;

public class MultiplayerManager {

    public static void setupMultiplayer(MinecraftServer server) {
        // Example cooperative building setup
        for (ServerWorld world : server.getWorlds()) {
            System.out.println("Setting up multiplayer for world: " + world.getRegistryKey().getValue());
        }
    }
}
