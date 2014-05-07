package com.afroraydude.extrastuff.common.block.common;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

import java.util.Random;

public class BlockAwesomeGemOre extends Block {

	public BlockAwesomeGemOre() {
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(10.0F);
		this.setResistance(12.0F);
		this.setLightLevel(10.0F);
		this.setTickRandomly(true);
        this.setHarvestLevel("pickaxe", 2);
        this.setBlockName("awesomegem_ore");
        this.setCreativeTab(CreativeTabs.tabBlock);

	}
	
	@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        //TODO: blockIcon
        this.blockIcon = iconRegister.registerIcon("ashblock");
    }

	public Block idDropped(int par1, Random par2random, int par3) {
		return AfroBlockManagement.awesomeGemOre;
		
	}
	
	public int quantityDropped(int par1, Random par2random, int par3) {
		return 10;
	
	}
}

