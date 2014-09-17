package com.afroraydude.mods.randomstuff;

import com.afroraydude.mods.randomstuff.biome.DevilsParadise;
import com.afroraydude.mods.randomstuff.biome.MushrooForest;
import com.afroraydude.mods.randomstuff.block.TestBlock;
import com.afroraydude.mods.randomstuff.item.TestItem;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;

import javax.sound.sampled.CompoundControl;

/**
 * Created by afroraydude.
 * for minecraft version 1.7.10
 * for forge build 1208 or higher
 */
@Mod(name="randomstuffmod", modid="randomstuffmod", version="0.0.4")
public class main
{
    String MODID = "randomstuffmod";
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

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e)
    {

        testItem = new TestItem().setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("testitem").setTextureName(MODID + ":" + "testItem.png");

        testBlock = new TestBlock(Material.rock).setBlockTextureName(MODID + ":" + "testblock").setCreativeTab(CreativeTabs.tabMisc);

        mushroomForest = new MushrooForest(52).setTemperatureRainfall(1.2F, 0.9F);

        devilsParadise = new DevilsParadise(53);

        GameRegistry.registerItem(testItem, "testItem");

        GameRegistry.registerBlock(testBlock, "testBlock");

        ///TODO: Fix slow world spawn times, may only happen when other applications are running, investigate later.
        WorldType afroWorldType = new WorldTypeAfro("afro");

        BiomeDictionary.registerBiomeType(mushroomForest, BiomeDictionary.Type.FOREST);
        BiomeManager.addSpawnBiome(mushroomForest);

        BiomeDictionary.registerBiomeType(devilsParadise, BiomeDictionary.Type.PLAINS);
        BiomeManager.addVillageBiome(devilsParadise, true);
        BiomeManager.addSpawnBiome(devilsParadise);

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
    }
}

