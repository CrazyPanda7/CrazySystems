package com.crazypanda.crazysystems.block;

import com.crazypanda.crazysystems.CrazySystems;
import com.crazypanda.crazysystems.init.Kepler452Blocks;
import com.crazypanda.crazysystems.init.Kepler452Items;
import com.crazypanda.crazysystems.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockBase extends Block implements IHasModel
{
	
	public BlockBase(String name, Material material)
	{
		
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		Kepler452Blocks.BLOCKS.add(this);
		//Kepler452Items.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	}

	@Override
	public void registerModels() 
	{
		
		CrazySystems.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}

}
