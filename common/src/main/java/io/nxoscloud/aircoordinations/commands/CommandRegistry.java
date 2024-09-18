package io.nxoscloud.aircoordinations.commands;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;

public class CommandRegistry {
    public static void registerCommands(CommandDispatcher<ServerCommandSource> dispatcher) {
        CityCommand.register(dispatcher);
        RoadCommand.register(dispatcher);
        BusinessCommand.register(dispatcher);
    }
}
