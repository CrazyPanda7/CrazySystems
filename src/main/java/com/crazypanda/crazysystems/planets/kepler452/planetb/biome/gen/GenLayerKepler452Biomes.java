package com.crazypanda.crazysystems.planets.kepler452.planetb.biome.gen;

import com.crazypanda.crazysystems.init.Planets;

import micdoodle8.mods.galacticraft.api.prefab.world.gen.BiomeAdaptive;
import micdoodle8.mods.miccore.IntCache;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;

public class GenLayerKepler452Biomes extends GenLayer {

    private static final Biome[] biomes = BiomeAdaptive.getBiomesListFor(Planets.kepler452_b).toArray(new Biome[0]);

    public GenLayerKepler452Biomes(long l, GenLayer parent) {
        super(l);
        this.parent = parent;
    }

    public GenLayerKepler452Biomes(long l) {
        super(l);
    }

    @Override
    public int[] getInts(int x, int z, int width, int depth) {
        int[] dest = IntCache.getIntCache(width * depth);

        for (int k = 0; k < depth; ++k) {
            for (int i = 0; i < width; ++i) {
                initChunkSeed(x + i, z + k);
                dest[i + k * width] = Biome.getIdForBiome(biomes[nextInt(biomes.length)]);
            }
        }

        return dest;
    }
}