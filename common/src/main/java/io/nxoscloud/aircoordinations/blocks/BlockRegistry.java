package io.nxoscloud.aircoordinations.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;

public class BlockRegistry {
    public static final Block ROAD = new RoadBlock();
    public static final Block OFFICE = new OfficeBlock();
    public static final Block AIRPORT = new AirportBlock();

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier("aircoordinations", "road"), ROAD);
        Registry.register(Registry.BLOCK, new Identifier("aircoordinations", "office"), OFFICE);
        Registry.register(Registry.BLOCK, new Identifier("aircoordinations", "airport"), AIRPORT);
    }
}
