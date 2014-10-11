package com.afroraydude.mods.randomstuff;

import com.afroraydude.mods.randomstuff.biome.DevilsParadise;
import com.afroraydude.mods.randomstuff.biome.MushrooForest;
import com.afroraydude.mods.randomstuff.block.TestBlock;
import com.afroraydude.mods.randomstuff.item.TestItem;

import com.afroraydude.mods.randomstuff.util.AfroLogger;
import com.afroraydude.mods.randomstuff.util.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeGenBase;

import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;

import java.util.logging.Level;

import static net.minecraftforge.common.BiomeDictionary.registerBiomeType;
import static net.minecraftforge.common.BiomeManager.*;

/**
 * Created by afroraydude.
 * for Minecraft version 1.7.10
 * for forge build 1208 or higher
 */
@Mod(name="randomstuffmod", modid="randomstuff", version="0.0.4")
public class main
{

    @SidedProxy(clientSide="com.afroraydude.mods.randomstuff.util.ClientProxy", serverSide="com.afroraydude.mods.randomstuff.util.ServerProxy")
    public static CommonProxy proxy;

    String MODID = "randomstuff";
    public static String NAME = "randomstuff";
    // Items

    // testItem is a test of items and how to register them, just for reference
    public static Item testItem;

    // Biomes

    public static BiomeGenBase mushroomForest;

    ///TODO: Add generated structures to this biome
    public static BiomeGenBase devilsParadise;

    // Blocks
    public static Block testBlock;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {

        this.proxy.preInit(e);
        //AfroLogger.init();

        //AfroLogger.log(Level.WARNING, "This mod is in a very early alpha state and is supposed to be used for testing purposes.");

        //AfroLogger.log(Level.WARNING, "If this is not your intention, please remove this mod.");

        //AfroLogger.log(Level.INFO, "Loading testItem");

        testItem = new TestItem().setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("testitem").setTextureName(MODID + ":testitem");

        //AfroLogger.log(Level.INFO, "Loading testBlock");

        testBlock = new TestBlock(Material.rock).setBlockName("testblock").setBlockTextureName(MODID + ":testblock").setCreativeTab(CreativeTabs.tabMisc);

        //AfroLogger.log(Level.INFO, "Registering testItem");

        GameRegistry.registerItem(testItem, "testitem");

        //AfroLogger.log(Level.INFO, "Registering testBlock");

        GameRegistry.registerBlock(testBlock, "testblock");

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e)
    {

        //AfroLogger.log(Level.INFO, "Loading biome files");

        mushroomForest = new MushrooForest(52).setTemperatureRainfall(1.2F, 0.9F).setBiomeName("Mushroom Forest");

        devilsParadise = new DevilsParadise(53).setBiomeName("Devil's Paradise");

        /// TODO: Fix slow world spawn times, may only happen when other applications are running, investigate later.
        // WorldType afroWorldType = new WorldTypeAfro("a        fro");

        registerBiomeType(mushroomForest, BiomeDictionary.Type.FOREST);
        addSpawnBiome(mushroomForest);
        BiomeManager.warmBiomes.add(new BiomeEntry(mushroomForest, 25));

        BiomeManager.desertBiomes.add(new BiomeEntry(devilsParadise, 25));
        registerBiomeType(devilsParadise, BiomeDictionary.Type.PLAINS);
        addVillageBiome(devilsParadise, true);
        addSpawnBiome(devilsParadise);

        this.proxy.init(e);

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {

        this.proxy.postInit(e);
        //AfroLogger.log(Level.FINEST, "Done");

    }
}

