package com.afroraydude.extrastuff.common.block.common;

import com.afroraydude.extrastuff.common.block.common.BlockAfroPortal;
import com.afroraydude.extrastuff.common.worldgen.AwesomeGemWorldGeneration;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import com.afroraydude.extrastuff.common.main;
import com.afroraydude.extrastuff.common.block.common.BlockAwesomeGemOre;
import com.afroraydude.extrastuff.common.block.common.BlockEmeraldShard;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
/**
 * Holds the blocks for Afro Core
 */

public class AfroBlockManagement {
	
	//Define Blocks and ores
	public static Block awesomeGemOre;
	public static Block emeraldShardBlock;
	public static Block afroPortalBlock;
	
	public static AwesomeGemWorldGeneration AAG_genWorld = new AwesomeGemWorldGeneration();
	
	public static void init() {
		awesomeGemOre = new BlockAwesomeGemOre().setBlockName("awesomegem_ore").setCreativeTab(CreativeTabs.tabBlock);
		emeraldShardBlock = new BlockEmeraldShard().setBlockName("emeraldShardBlock").setCreativeTab(CreativeTabs.tabBlock);
		afroPortalBlock = new BlockAfroPortal().setBlockName("PortalBlock").setCreativeTab(CreativeTabs.tabBlock);

		
		GameRegistry.registerBlock(awesomeGemOre, "serviriteGemOre");
		//LanguageRegistry.addName(awesomeGemOre, "Servirite Gem Ore");
		
		GameRegistry.registerBlock(emeraldShardBlock, "emeraldShardBlock");
		//LanguageRegistry.addName(emeraldShardBlock, "Emerald Shard Block");
		
		GameRegistry.registerBlock(afroPortalBlock, "afroPortalBlock");
		//LanguageRegistry.addName(afroPortalBlock, "Afro Portal Block");
		
		GameRegistry.addSmelting(awesomeGemOre, new ItemStack(main.serviriteGem), 2.55F);
		//GameRegistry.addSmelting(emeraldShardBlock, new ItemStack(main.emeraldShard), 2.55F);


		
	}

}