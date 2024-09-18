package io.nxoscloud.aircoordinations.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class RoadBlock extends Block {
    public RoadBlock() {
        super(Settings.of(Material.STONE).strength(1.5F, 6.0F).slipperiness(0.9F)); // Asphalt-like friction
    }
}
