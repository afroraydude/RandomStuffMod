package com.afroraydude.mods.randomstuff;

import com.afroraydude.mods.randomstuff.item.YourItem;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by afroraydude (@afroraydude).
 */
@Mod(modid="RandomStuffMod", version="0.0.1")
public class main
{
    public static String MODID = "RandomStuffMod";
    public static String VERSION = "0.0.1";

    //Items
    public static Item yourItem;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e)
    {
        yourItem = new YourItem().setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("yourItem").setTextureName(MODID + ":" + "yourItem.png");

        GameRegistry.registerItem(yourItem, "yourItem");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
    }
}

