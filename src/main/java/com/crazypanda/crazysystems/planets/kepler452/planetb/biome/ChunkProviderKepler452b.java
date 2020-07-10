package com.crazypanda.crazysystems.planets.kepler452.planetb.biome;

import java.util.List;
import java.util.Random;

import com.crazypanda.crazysystems.init.CrazySystemsBlocks;
//import com.crazypanda.crazysystems.init.Kepler452Fluids;
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
        this.stoneBlock = CrazySystemsBlocks.HEAVY_DIRT.getDefaultState();
        this.waterBlock =Blocks.WATER /*Kepler452Fluids.B_WATER*/.getDefaultState();
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
