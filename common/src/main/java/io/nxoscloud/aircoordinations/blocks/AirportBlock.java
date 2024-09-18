package io.nxoscloud.aircoordinations.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class AirportBlock extends Block {
    public AirportBlock() {
        super(Settings.of(Material.STONE).strength(3.0F, 9.0F));
    }
}
