package com.afroraydude.extrastuff.common.block.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

import java.util.Random;

public class BlockEmeraldShard extends Block {


    public BlockEmeraldShard() {
		super(Material.iron);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(10.0F);
		this.setResistance(12.0F);
		this.setLightLevel(100000000000000.0F);
        this.setHarvestLevel("pickaxe", 2);
		
	}


    @Override
    //TODO:		registerIcons()
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        //TODO: blockIcon
        this.blockIcon = iconRegister.registerIcon("biomesoplenty:ashblock");
    }

	public Block idDropped(int par1, Random par2random, int par3) {
		return AfroBlockManagement.emeraldShardBlock;
	}
	
	public int quantityDropped(int par1, Random par2random, int par3) {
		return 10;
	}
	
}

