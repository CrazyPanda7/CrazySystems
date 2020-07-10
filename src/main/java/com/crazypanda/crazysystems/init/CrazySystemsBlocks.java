package com.crazypanda.crazysystems.init;

import com.crazypanda.crazysystems.CrazySystems;
import com.crazypanda.crazysystems.block.worldterrain.BlockHeavyDirt;
import com.crazypanda.crazysystems.block.worldterrain.BlockHeavyStone;

import net.rom.registry.ReadOnlyRegistry;

public class CrazySystemsBlocks {
	
	public static final BlockHeavyDirt HEAVY_DIRT = new BlockHeavyDirt();
	public static final BlockHeavyStone HEAVY_STONE = new BlockHeavyStone();
	
	public static void registerAll(ReadOnlyRegistry registry) {
		
		registry.setDefaultCreativeTab(CrazySystems.BlocksTab);
		registry.registerBlock(HEAVY_DIRT, "heavy_dirt");
		registry.registerBlock(HEAVY_STONE, "heavy_stone");
	}

}
