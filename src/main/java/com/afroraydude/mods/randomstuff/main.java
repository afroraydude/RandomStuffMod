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

import static net.minecraftforge.common.BiomeDictionary.registerBiomeType;
import static net.minecraftforge.common.BiomeManager.BiomeEntry;
import static net.minecraftforge.common.BiomeManager.addSpawnBiome;
import static net.minecraftforge.common.BiomeManager.addVillageBiome;

/**
 * Created by afroraydude.
 * for minecraft version 1.7.10
 * for forge build 1208 or higher
 */
@Mod(name="randomstuffmod", modid="randomstuff", version="0.0.4")
public class main
{
    String MODID = "randomstuff";
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

        testItem = new TestItem().setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("testitem").setTextureName(MODID + ":testitem.png");

        testBlock = new TestBlock(Material.rock).setBlockName("testblock").setBlockTextureName(MODID + ":testblock").setCreativeTab(CreativeTabs.tabMisc);

        GameRegistry.registerItem(testItem, "testitem");

        GameRegistry.registerBlock(testBlock, "testblock");

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e)
    {

        mushroomForest = new MushrooForest(52).setTemperatureRainfall(1.2F, 0.9F).setBiomeName("Mushroom Forest");

        devilsParadise = new DevilsParadise(53).setBiomeName("Devil's Paradise");

        /// TODO: Fix slow world spawn times, may only happen when other applications are running, investigate later.
        // WorldType afroWorldType = new WorldTypeAfro("afro");

        registerBiomeType(mushroomForest, BiomeDictionary.Type.FOREST);
        addSpawnBiome(mushroomForest);
        BiomeManager.coolBiomes.add(new BiomeEntry(mushroomForest, 5));
        BiomeManager.warmBiomes.add(new BiomeEntry(mushroomForest, 5));

        BiomeManager.desertBiomes.add(new BiomeEntry(devilsParadise, 5));
        registerBiomeType(devilsParadise, BiomeDictionary.Type.PLAINS);
        addVillageBiome(devilsParadise, true);
        addSpawnBiome(devilsParadise);

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
    }
}

