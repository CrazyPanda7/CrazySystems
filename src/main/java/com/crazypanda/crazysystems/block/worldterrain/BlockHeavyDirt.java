package com.crazypanda.crazysystems.block.worldterrain;

import com.crazypanda.crazysystems.block.BlockTerrain;

import net.minecraft.block.material.Material;

public class BlockHeavyDirt extends BlockTerrain {

	public BlockHeavyDirt() {
		super(Material.GROUND);
		setHardness(2.0F);
		setResistance(1.0F);
		setHarvestLevel("shovel", 2);
	}

}
