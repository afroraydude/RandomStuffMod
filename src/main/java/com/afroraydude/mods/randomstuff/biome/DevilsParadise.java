package com.afroraydude.mods.randomstuff.biome;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

/**
 * Created by afroraydude.
 */
public class DevilsParadise extends BiomeGenBase {
    public DevilsParadise(int id) {
        super(id);
        this.topBlock = Blocks.netherrack;
        this.fillerBlock = Blocks.soul_sand;
        this.theBiomeDecorator.cactiPerChunk = 5;
        this.theBiomeDecorator.treesPerChunk = -999;
    }
}
