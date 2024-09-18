package io.nxoscloud.aircoordinations.commands;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.server.command.CommandSource;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.util.math.BlockPos;

import static net.minecraft.server.command.CommandManager.literal;

public class BusinessCommand {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(literal("createbusiness")
                .executes(context -> {
                    ServerCommandSource source = context.getSource();
                    BlockPos pos = source.getPlayer().getBlockPos();
                    // Implement business creation logic
                    return 1;
                }));
    }
}
