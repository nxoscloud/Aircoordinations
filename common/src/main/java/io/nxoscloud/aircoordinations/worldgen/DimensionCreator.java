package io.nxoscloud.aircoordinations.worldgen;

import net.minecraft.world.dimension.Dimension;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionTypeRegistryEntry;
import net.minecraft.world.dimension.DimensionTypeRegistry;
import net.minecraft.util.Identifier;

public class DimensionCreator {

    public static void createDimensions() {
        // Implement custom dimensions with unique characteristics
        DimensionType customDimension = new DimensionType(
                new DimensionType.Visitor() {
                    @Override
                    public void visit(DimensionType type) {
                        System.out.println("Creating custom dimension: " + type);
                    }
                }
        );

        DimensionTypeRegistryEntry customEntry = DimensionTypeRegistryEntry.of(new Identifier("aircoordinations:custom_dimension"), customDimension);
        DimensionTypeRegistry.register(customEntry);
    }
}
