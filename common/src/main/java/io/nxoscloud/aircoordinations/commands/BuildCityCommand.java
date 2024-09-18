package io.nxoscloud.aircoordinations.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;

import static net.minecraft.server.command.CommandManager.literal;

public class BuildCityCommand {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(literal("buildcity").executes(BuildCityCommand::execute));
    }

    private static int execute(CommandContext<ServerCommandSource> context) {
        context.getSource().sendFeedback(Text.of("Starting city building!"), false);
        return 1;
    }
}