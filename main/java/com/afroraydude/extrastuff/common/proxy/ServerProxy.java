package com.afroraydude.extrastuff.common.proxy;

import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class ServerProxy {
	
	public void registerRenderThings() {
		
	}
	
	public void registerServerTickHandler() {
	TickRegistry.registerTickHandler(new ServerTickHandler(), Side.SERVER);
	}
	
}
