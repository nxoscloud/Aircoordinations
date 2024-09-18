package io.nxoscloud.aircoordinations.mixin;

import io.nxoscloud.aircoordinations.worldgen.CityGenerator;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.ChunkGenerator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ChunkGenerator.class)
public class WorldGenMixin {

    @Inject(method = "generateFeatures", at = @At("HEAD"))
    public void onChunkGenerated(ServerWorld world, Chunk chunk, CallbackInfo ci) {
        // Logic to generate a city in specific chunks
        if (shouldGenerateCity(chunk)) {
            CityGenerator.generateCity(world, chunk.getPos().getStartPos());
        }
        // Add similar logic for roads and towns
    }

    private boolean shouldGenerateCity(Chunk chunk) {
        // Custom logic to determine whether a city should spawn in this chunk
        return chunk.getPos().x % 20 == 0 && chunk.getPos().z % 20 == 0; // Example
    }
}
