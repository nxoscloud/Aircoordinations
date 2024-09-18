package io.nxoscloud.aircoordinations.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class CityBlock extends Block {
    public CityBlock() {
        super(Settings.of(Material.STONE).strength(1.5F, 6.0F));
    }
}