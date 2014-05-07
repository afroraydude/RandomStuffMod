package com.afroraydude.extrastuff.common;

import com.afroraydude.extrastuff.common.biome.common.BiomeAfroBiome;
import com.afroraydude.extrastuff.common.biome.common.BiomeDeadZone;
import com.afroraydude.extrastuff.common.biome.common.BiomeDenseForestBiome;
import com.afroraydude.extrastuff.common.block.common.AfroBlockManagement;
import com.afroraydude.extrastuff.common.configuration.AfroConfig;
import com.afroraydude.extrastuff.common.dimension.AfroWorldProvider;
import com.afroraydude.extrastuff.common.item.common.ItemAwesomeGem;
import com.afroraydude.extrastuff.common.item.common.ItemEmeraldShard;
import com.afroraydude.extrastuff.common.proxy.ServerProxy;
import com.afroraydude.extrastuff.common.tool.toolManager;
import com.afroraydude.extrastuff.common.worldgen.AwesomeGemWorldGeneration;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.init.Blocks;
/**
 * This is the main class for the coremod.
 * Do not mess up this file!
 * I repeat please do not mess up this file!
 * @author afroraydude
 * @author @afroraydude
 *
 */
@Mod(modid = "RandomStuff", name = "Random Stuff Mod", version = "Alpha 1")

public class main {
	
	@SidedProxy(clientSide = "ClientProxy", serverSide = "afroraydude.core.common.proxy.ServerSide")
	public static ServerProxy proxy;
	
	//TODO: All Other TODOs
	//Define Armor
	//TODO: Add Awesome Helmet, maybe other stuff.

	
	//Define Biomes
	public static BiomeGenBase denseForestBiome;
	public static BiomeGenBase deadZoneBiome;
	public static BiomeGenBase stonebiome;
	public static BiomeGenBase lavabiome;
	public static BiomeGenBase afroBiome;
	
	//Define Items
	public static Item serviriteGem;
	public static Item emeraldShard;

    //Define World Generation
    public static AwesomeGemWorldGeneration AAG_genWorld = new AwesomeGemWorldGeneration();

    public static int afroDimensionID = 8;
	
	@EventHandler
	public void load(FMLPreInitializationEvent event){
		AfroConfig.init(event.getSuggestedConfigurationFile());

        BiomeGenBase.Height denseforestheight = new BiomeGenBase.Height(0.23F, -0.10F);
        BiomeGenBase.Height myHeight = new BiomeGenBase.Height(0.23F, 0.10F);

        GameRegistry.registerWorldGenerator(AAG_genWorld);
		//Settings for Items
		serviriteGem = new ItemAwesomeGem(AfroConfig.awesomeGemID).setUnlocalizedName("afroraydude:awesome_gem").setCreativeTab(CreativeTabs.tabMaterials);
		emeraldShard = new ItemEmeraldShard(650).setUnlocalizedName("afroraydude:emerald_shard").setCreativeTab(CreativeTabs.tabMisc);

		//Settings for Biomes 
		denseForestBiome = new BiomeDenseForestBiome(AfroConfig.denseforrestID).setBiomeName("Dense Forest").setHeight(denseforestheight);
		deadZoneBiome = new BiomeDeadZone(AfroConfig.deadzoneID).setBiomeName("Meteor").setHeight(0.23F, 0.22F);
		afroBiome = new BiomeAfroBiome(AfroConfig.afroBiomeID).setBiomeName("Afro Biome").setHeight(0.23F, 0.22F);

		//Register Items
		GameRegistry.registerItem(serviriteGem, "ServiriteGem");
		//LanguageRegistry.addName(serviriteGem, "Servirite Gem");
		
		GameRegistry.registerItem(emeraldShard, "emeraldShard");
		//LanguageRegistry.addName(emeraldShard, "Emerald Shard");
		//Register Blocks	
		DimensionManager.registerProviderType(main.afroDimensionID, AfroWorldProvider.class, false);
		DimensionManager.registerDimension(main.afroDimensionID, main.afroDimensionID);
		
		//Register World Generation
		GameRegistry.addBiome(deadZoneBiome);
		GameRegistry.addBiome(afroBiome);
		GameRegistry.addBiome(denseForestBiome);

		GameRegistry.addRecipe(new ItemStack(Blocks.emerald_ore, 1), new Object[] {"SS", "SS", 'S', main.emeraldShard});


		AfroBlockManagement.init();
        toolManager.init();
        /**
		//Register Biomes
		GameRegistry
		GameRegistry
		
		//Define Recipes for Items
		GameRegistry.addSmelting(awesomeGemOre.blockID, new ItemStack(awesomeGem), 2.55F);
		
		//Define Recipes For Tools
		/**TODO:
		GameRegistry
		GameRegistry
		GameRegistry
	GameRegistry.registerWorldGenerator(AAG_genWorld);	GameRegistry
		GameRegistry
		*/
	}
}