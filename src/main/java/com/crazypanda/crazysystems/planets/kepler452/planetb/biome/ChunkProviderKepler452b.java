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

package com.crazypanda.crazysystems.planets.kepler452.planetb.biome;

import java.util.List;
import java.util.Random;

import com.crazypanda.crazysystems.world.chunk.ChunkProviderCrazyBiomes;
import com.crazypanda.crazysystems.world.chunk.MapGenBaseMeta;
import com.crazypanda.crazysystems.world.chunk.MapGenCrazyCaveGen;
import com.crazypanda.crazysystems.world.chunk.MapGenCrazyRavinGen;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;

public class ChunkProviderKepler452b extends ChunkProviderCrazyBiomes {

    private final BiomeDecoratorKepler452b decorator = new BiomeDecoratorKepler452b();
    private final MapGenCrazyRavinGen ravineGenerator = new MapGenCrazyRavinGen();
    private final MapGenCrazyCaveGen caveGenerator = new MapGenCrazyCaveGen(Blocks.DIAMOND_BLOCK.getDefaultState(), Blocks.LAVA.getDefaultState(),
            Sets.newHashSet(Blocks.HARDENED_CLAY, Blocks.BLACK_GLAZED_TERRACOTTA));

    public ChunkProviderKepler452b(World par1World, long seed, boolean mapFeaturesEnabled) {
        super(par1World, seed, mapFeaturesEnabled);
        this.stoneBlock = Blocks.STAINED_GLASS.getDefaultState();
        this.waterBlock = Blocks.WATER.getDefaultState();
    }

    @Override
    protected List<MapGenBaseMeta> getWorldGenerators() {
        List<MapGenBaseMeta> generators = Lists.newArrayList();
        generators.add(this.caveGenerator);
        return generators;
    }

    @Override
    public int getCraterProbability() {
        return 2000;
    }

    @Override
    public void onChunkProvide(int cX, int cZ, ChunkPrimer primer) {
        this.ravineGenerator.generate(this.worldObj, cX, cZ, primer);
    }

    @Override
    public void onPopulate(int cX, int cZ) {

    }

    @Override
    public void recreateStructures(Chunk chunk, int x, int z) {
    }

    @Override
    protected void decoratePlanet(World world, Random rand, int x, int z) {
        this.decorator.decorate(this.worldObj, rand, x, z);
    }
}
