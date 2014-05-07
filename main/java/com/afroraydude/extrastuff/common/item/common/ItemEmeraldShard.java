package com.afroraydude.extrastuff.common.item.common;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemEmeraldShard extends Item{

	public ItemEmeraldShard(int par1) {
		super(par1);
		// TODO Auto-generated constructor stub
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1RegisterIcon) {
		this.itemIcon = par1RegisterIcon.registerIcon("afroraydude:emeraldshard");
	}
}
