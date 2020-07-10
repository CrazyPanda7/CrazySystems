package com.crazypanda.crazysystems.planets.kepler452.planetb.biome.gen;

import com.crazypanda.crazysystems.planets.kepler452.planetb.biome.Kepler452BBiomes;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;

public class BiomeGenKepler452b extends Kepler452BBiomes {

	public BiomeGenKepler452b(BiomeProperties properties) {
		super(properties);
        this.topBlock = Blocks.GRASS.getDefaultState(); //TODO change this
        this.fillerBlock = Blocks.STONE.getDefaultState(); //TODO change this
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
	}

	@Override
	public void registerTypes(Biome b) {
            BiomeDictionary.addTypes(b, BiomeDictionary.Type.HOT, BiomeDictionary.Type.DRY, BiomeDictionary.Type.DEAD, BiomeDictionary.Type.SANDY);

	}
}
