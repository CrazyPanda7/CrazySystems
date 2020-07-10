

package com.crazypanda.crazysystems.init;

import java.util.ArrayList;
import java.util.List;

import com.crazypanda.crazysystems.CrazySystems;
import com.crazypanda.crazysystems.planets.kepler452.planetb.b_blocks.b_dirt;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Kepler452Blocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block B_DIRT = new b_dirt("b_dirt", Material.ROCK);
	
	
}
