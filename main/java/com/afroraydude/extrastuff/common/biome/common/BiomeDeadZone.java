package com.afroraydude.extrastuff.common.biome.common;

import cpw.mods.fml.common.Mod.EventHandler;
import net.minecraft.block.Block;
import net.minecraft.world.biome.*;

public class BiomeDeadZone extends BiomeGenBase {


	public BiomeDeadZone(int par1) {
		super(par1);
		this.topBlock = (byte)Block.grass.blockID;
		this.fillerBlock = (byte)Block.dirt.blockID;
		this.spawnableCreatureList.clear();
		this.spawnableCaveCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		this.theBiomeDecorator.generateLakes = false;
		
	}

}
