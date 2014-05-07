package com.afroraydude.extrastuff.common.biome.common;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeAfroBiome extends BiomeGenBase{

	public BiomeAfroBiome(int par1) {
		super(par1);
		this.topBlock = (byte)Block.glowStone.blockID;
		this.fillerBlock = (byte)Block.netherBrick.blockID;
		this.theBiomeDecorator.bigMushroomsPerChunk = 16;
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		// TODO Auto-generated constructor stub
	}

}
