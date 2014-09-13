package com.afroraydude.mods.randomstuff;

import com.afroraydude.mods.randomstuff.item.YourItem;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import sun.org.mozilla.javascript.internal.ast.Block;

/**
 * Created by afroraydude (@afroraydude).
 */
@Mod(modid="randomstuffmod", version="0.0.2")
public class main
{
    public static String MODID = "randomstuffmod";
    public static String VERSION = "0.0.2";

    //Items
    public static Item yourItem;

    //Blocks
    //public static Block yourBlock;

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
