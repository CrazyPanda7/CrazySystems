package com.crazypanda.crazysystems.block.worldterrain;

import com.crazypanda.crazysystems.block.BlockTerrain;

import net.minecraft.block.material.Material;

public class BlockHeavyStone extends BlockTerrain {

	public BlockHeavyStone() {
		super(Material.ROCK);
		setHardness(25.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
	}

}
