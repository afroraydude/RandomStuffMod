package com.afroraydude.extrastuff.common.biome.common;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class BiomeDenseForestBiome extends BiomeGenBase {

	public BiomeDenseForestBiome(int par1) {
		super(par1);
		this.topBlock = (byte)Block.grass.blockID;
		this.fillerBlock = (byte)Block.dirt.blockID;
		this.theBiomeDecorator.clayPerChunk = 16;
		this.theBiomeDecorator.ironGen = new WorldGenMinable(Block.oreIron.blockID, 8);
		this.theBiomeDecorator.treesPerChunk = 64;

	}

}
