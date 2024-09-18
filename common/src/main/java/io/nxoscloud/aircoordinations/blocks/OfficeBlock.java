package io.nxoscloud.aircoordinations.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.core.BlockPos;
import net.minecraft.world.BlockView;

public class OfficeBlock extends Block {

    public OfficeBlock() {
        super(Settings.of(Material.STONE).strength(3.0F, 6.0F));
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Block neighbor, BlockView world, BlockPos pos, BlockPos neighborPos) {
        return super.getStateForNeighborUpdate(state, neighbor, world, pos, neighborPos);
    }
}
