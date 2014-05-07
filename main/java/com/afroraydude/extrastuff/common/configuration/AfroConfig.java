package com.afroraydude.extrastuff.common.configuration;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.event.FMLInitializationEvent;

/**
 * This holds all the configs for all "Afro Mods"!!!
 * @author afroraydude
 * @author @afroraydude
 */
public class AfroConfig {
	
	//ID Files
	public static int awesomePickaxeID;
	public static int awesomeAxeID;
	public static int awesomeHoeID;
	public static int awesomeShovelID;
	public static int awesomeSwordID;
	
	public static int awesomeGemID;
	
	public static int denseforrestID;
	public static int deadzoneID;
	public static int afroBiomeID;
	
	public static int emeraldShardBlockID;
	public static int awesomeGemOreID;
	public static int afroPortalBlockID;
	
	//Enable/Disable Files
	public static boolean enableBlocks;
	public static boolean enableTools;
	public static boolean enableWorldGenerator;
	
	public static void init(File configFile){
		Configuration config = new Configuration(configFile);
		config.load();

        // Enable Stuff
		enableBlocks = config.get("Enable/Disable", "Blocks", true).getBoolean(true);
		enableTools = config.get("Enable/Disable", "Tools", true).getBoolean(true);
		
		
		config.save();
	}	
}
