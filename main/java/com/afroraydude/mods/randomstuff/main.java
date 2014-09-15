package com.afroraydude.mods.randomstuff;

import com.afroraydude.mods.randomstuff.biome.TestBiome;
import com.afroraydude.mods.randomstuff.item.TestItem;
import com.mojang.realmsclient.dto.McoServer;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;

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

    public  static BiomeGenBase mushroomForest;


    // Blocks
    //public static Block testBlock;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e)
    {

        testItem = new TestItem().setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("testItem").setTextureName(MODID + ":" + "testItem.png");

        mushroomForest = new TestBiome(1).setBiomeName("Mushroom Forest").setTemperatureRainfall(1.2F, 0.9F);

        GameRegistry.registerItem(testItem, "testItem");

        WorldType afroWorldType = new WorldTypeAfro("afro");

        BiomeDictionary.registerBiomeType(mushroomForest, BiomeDictionary.Type.FOREST);
        BiomeManager.addSpawnBiome(mushroomForest);


    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
    }
}

