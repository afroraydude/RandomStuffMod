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
 */
@Mod(name="randomstuffmod", modid="randomstuffmod", version="0.0.2")
public class main
{
    String MODID = "randomstuffmod";
    // Items
    public static Item testItem;

    // Biomes
    public  static BiomeGenBase testBiome;

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

        testBiome = new TestBiome(1).setBiomeName("Butts").setTemperatureRainfall(1.2F, 0.9F);

        GameRegistry.registerItem(testItem, "testItem");

        BiomeDictionary.registerBiomeType(testBiome, BiomeDictionary.Type.FOREST);
        BiomeManager.addSpawnBiome(testBiome);
        WorldType afroWorldType = new WorldTypeAfro("afro");


    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
    }
}

