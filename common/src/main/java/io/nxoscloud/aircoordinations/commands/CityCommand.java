package io.nxoscloud.aircoordinations.commands;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.server.command.CommandSource;
import net.minecraft.server.command.ServerCommandSource;
import io.nxoscloud.aircoordinations.worldgen.CityGenerator;
import net.minecraft.util.math.BlockPos;

import static net.minecraft.server.command.CommandManager.literal;

public class CityCommand {

    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(literal("createcity")
                .executes(context -> {
                    ServerCommandSource source = context.getSource();
                    BlockPos pos = source.getPlayer().getBlockPos();
                    CityGenerator.generateCity(source.getWorld(), pos);
                    return 1;
                }));
    }
}
