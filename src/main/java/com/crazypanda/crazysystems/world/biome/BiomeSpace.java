/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2020, ROMVoid95 <rom.readonlydev@gmail.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.crazypanda.crazysystems.world.biome;

import micdoodle8.mods.galacticraft.api.galaxies.Planet;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.WorldProviderSpace;
import net.minecraft.block.Block;

public class BiomeSpace extends ExoPlanetBiomeBase {

	protected Planet planetForBiome = null;
	protected WorldProviderSpace spaceProvider = null;
	public static int grassFoliageColor = 0x00ff00;

	public BiomeSpace(BiomeProperties properties) {
		super(properties);
		this.init();
	}

	public BiomeSpace(String singleName, BiomeProperties props) {
		super(singleName, props);
		this.init();
	}

	private void init() {
		this.clearAllSpawning();
	}

	/**
	 * Sets the Planet to be associated with this biome.
	 * 
	 * @param planet The Planet to associate with this biome.
	 * @return The biome for the set Planet.
	 */
	public BiomeSpace setPlanetForBiome(Planet planet) {
		this.planetForBiome = planet;
		return this;
	}

	/**
	 * Gets the Planet associated with this biome.
	 * 
	 * @return The Planet associated with this biome.
	 */
	public Planet getPlanetForBiome() {
		return this.planetForBiome;
	}

	public BiomeSpace setSpaceProvider(WorldProviderSpace provider) {
		this.spaceProvider = provider;
		return this;
	}

	public WorldProviderSpace getSpaceProvider() {
		return this.spaceProvider;
	}

	/**
	 * Checks if the biome is a hot biome or not.
	 * 
	 * @return True if the biome temp is >= 7.0f, otherwise false.
	 */
	public boolean getIsHotBiome() {
		return (this.getBiomeTemp() >= 7F);
	}

	/**
	 * Checks if the biome is a cold biome or not.
	 * 
	 * @return True if the biome temp is <= 3.0f, otherwise false.
	 */
	public boolean getIsColdBiome() {
		return (this.getBiomeTemp() <= 3F);
	}

	@Override
	public BiomeSpace setBlocks(Block topBlock, Block fillerBlock) {
		this.topBlock = topBlock.getDefaultState();
		this.fillerBlock = fillerBlock.getDefaultState();
		return this;
	}

	/**
	 * Sets the Biome temperature.
	 * 
	 * @param biomeTemp Biome temperature.
	 * @return The Planet to apply this biome to.
	 */
	public BiomeSpace setTemp(float biomeTemp) {
		this.temp = biomeTemp;
		return this;
	}

	/**
	 * Returns the temperature of the current biome.
	 * 
	 * @return Biome temp.
	 */
	public float getBiomeTemp() {
		return this.temp;
	}
}