package com.crazypanda.crazysystems.planets.kepler452.planetb.b_blocks;

import com.crazypanda.crazysystems.block.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class b_dirt extends BlockBase
{

	public b_dirt(String name, Material material) 
	{
		
		super(name, material);
		
		setSoundType(SoundType.GROUND);
		setHardness(2.0F);
		setResistance(10.0F);
		setHarvestLevel("shovel", 0);
	}

}
