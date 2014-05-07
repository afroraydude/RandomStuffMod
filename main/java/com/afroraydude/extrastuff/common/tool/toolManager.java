package com.afroraydude.extrastuff.common.tool;

import com.afroraydude.extrastuff.common.main;
import com.afroraydude.extrastuff.common.tool.common.ToolAwesomeAxe;
import com.afroraydude.extrastuff.common.tool.common.ToolAwesomeHoe;
import com.afroraydude.extrastuff.common.tool.common.ToolAwesomePickaxe;
import com.afroraydude.extrastuff.common.tool.common.ToolAwesomeShovel;
import com.afroraydude.extrastuff.common.weapon.common.ToolAwesomeSword;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;

public class toolManager {
	//Define Tools
	public static Item serviritePickaxe;
	public static Item serviriteSword;
	public static Item serviriteHoe;
	public static Item serviriteAxe;
	public static Item serviriteShovel;	
	public static EnumToolMaterial pureAwesomeness = EnumHelper.addToolMaterial("PureAwesome", 4, 2000, 8.0F, 4.0F, 10);
		
	public static void init() {
		serviritePickaxe = new ToolAwesomePickaxe(pureAwesomeness).setUnlocalizedName("afroraydude:awesomepick").setCreativeTab(CreativeTabs.tabTools);
		serviriteAxe = new ToolAwesomeAxe(pureAwesomeness).setUnlocalizedName("afroraydude:awesomeaxe").setCreativeTab(CreativeTabs.tabTools);
		serviriteShovel = new ToolAwesomeShovel(pureAwesomeness).setUnlocalizedName("afroraydude:awesomeshov").setCreativeTab(CreativeTabs.tabTools);
		serviriteHoe = new ToolAwesomeHoe(pureAwesomeness).setUnlocalizedName("afroraydude:awesomehoe").setCreativeTab(CreativeTabs.tabTools);
		serviriteSword = new ToolAwesomeSword(pureAwesomeness).setUnlocalizedName("afroraydude:awesomesword").setCreativeTab(CreativeTabs.tabCombat);
		
		GameRegistry.registerItem(serviriteAxe, "serviriteAxe");
		GameRegistry.registerItem(serviriteHoe, "serviriteHoe");
		GameRegistry.registerItem(serviritePickaxe, "serviritePickaxe");
		GameRegistry.registerItem(serviriteShovel, "serviriteShovel");
		GameRegistry.registerItem(serviriteSword, "serviriteSword");
		
		LanguageRegistry.addName(serviriteAxe, "Servirite Axe");
		LanguageRegistry.addName(serviriteHoe, "Servirite Hoe");
		LanguageRegistry.addName(serviritePickaxe, "Servirite Pickaxe");
		LanguageRegistry.addName(serviriteShovel, "Servirite Shovel");
		LanguageRegistry.addName(serviriteSword, "Servirite Sword");
		
		GameRegistry.addRecipe(new ItemStack(serviriteAxe, 1), new Object[] {"GG ", "GS ", " S ", 'G', main.serviriteGem, 'S', Item.stick});
		GameRegistry.addRecipe(new ItemStack(serviritePickaxe, 1), new Object[] {"GGG", " S ", " S ", 'G', main.serviriteGem, 'S', Item.stick});
		GameRegistry.addRecipe(new ItemStack(serviriteHoe, 1), new Object[] {"GG ", " S ", " S ", 'G', main.serviriteGem, 'S', Item.stick});
		GameRegistry.addRecipe(new ItemStack(serviriteSword, 1), new Object[] {" G ", " G ", " S ", 'G', main.serviriteGem, 'S', Item.stick});
		GameRegistry.addRecipe(new ItemStack(serviriteShovel, 1), new Object[] {"G", "S", "S", 'G', main.serviriteGem, 'S', Item.stick});
		
	}
}
