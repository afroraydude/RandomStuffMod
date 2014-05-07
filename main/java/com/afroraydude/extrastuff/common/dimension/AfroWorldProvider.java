package com.afroraydude.extrastuff.common.dimension;

import com.afroraydude.extrastuff.common.main;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class AfroWorldProvider extends WorldProvider {

	public void registerWorldChunkManager() {
		this.worldChunkMgr = new WorldChunkManagerHell(main.deadZoneBiome, 0.1F, 0.2F);
		this.worldChunkMgr = new WorldChunkManagerHell(main.afroBiome, 0.1F, 0.2F);
		
		this.dimensionId = main.afroDimensionID;
	}
	
	public IChunkProvider createChunkGenerator() {
		return new AfroChunkProvider(worldObj, worldObj.getSeed(), true);
	}
	
	@Override
	public String getDimensionName() {
		// TODO Auto-generated method stub
		return "Afro World";
	}

}
