package com.zing.zingsprojectredhorn.mixin;

import java.util.Collection;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.CaveSurface;

/**
 * SurfaceRules
 */
public class SurfaceRules {

    public class RuleSource {

        public Collection<? extends RuleSource> sequence() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'sequence'");
        }
    }

    public static RuleSource sequence(RuleSource[] array) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sequence'");
    }

    public static Object state(BlockState undergroundBlock) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'state'");
    }

    public static Object stoneDepthCheck(int i, boolean b, int j, CaveSurface floor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stoneDepthCheck'");
    }

    public static Object ifTrue(Object stoneDepthCheck, Object state) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ifTrue'");
    }

    public static Object waterBlockCheck(VerticalAnchor i
    public static Object waterBlockCheck(VerticalAnchor i
    public static Object waterBlockCheck(int i, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'waterBlockCheck'");
    }

    public static Object sequence(Object ifTrue, Object state) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sequence'");
    }

    public static Object waterBlockCheck(VerticalAnchor belowTop, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'waterBlockCheck'");
    }

    public static Object not(Object waterBlockCheck) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'not'");
    }

    public static Object isBiome(ResourceKey<Biome> biomeKey) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isBiome'");
    }

    public static Object abovePreliminarySurface() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'abovePreliminarySurface'");
    }

}
