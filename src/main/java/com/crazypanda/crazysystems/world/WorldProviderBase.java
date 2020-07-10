package com.crazypanda.crazysystems.world;

import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.galaxies.Planet;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.WorldProviderSpace;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.api.world.IExitHeight;
import micdoodle8.mods.galacticraft.api.world.ISolarLevel;
import micdoodle8.mods.galacticraft.core.client.CloudRenderer;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class WorldProviderBase extends WorldProviderSpace implements ISolarLevel, IExitHeight, IPlanetWorldProvider {
	
	private static WorldProviderBase instance;
	
	public WorldProviderBase() {
		instance = this;
	}
	
	public World getWorldObj() {
		return this.world;
	}
	
	@Override
	public Planet getSCPlanet() {
		return (Planet) this.getCelestialBody();
	}
	
	@Override
    public String getSaveFolder() {
		return "planets/" + this.getSCPlanet().getName();
	}
	
	public static WorldProviderBase instance() {
		return instance;
	}
	
	@Override
	public abstract float getSolarSize();
	
	@Override
	public abstract double getMeteorFrequency();
	
	@Override
	public abstract Class<? extends IChunkGenerator> getChunkProviderClass();
	
	@Override
	public abstract CelestialBody getCelestialBody();

	@Override
	public abstract float getGravity();

	@Override
	public boolean canSpaceshipTierPass(int tier) {
		return tier >= this.getSCPlanet().getTierRequirement();
	}

	@Override
	public int getDungeonSpacing() {
		return 704;
	}

	@Override
	public double getYCoordinateToTeleport() {
		return 1500;
	}

	@Override
	public Vector3 getFogColor() {
		return new Vector3(0, 0, 0);
	}

	@Override
    public abstract long getDayLength();
	
    @Override
    public IRenderHandler getCloudRenderer(){
        return new CloudRenderer();
    }
	
    @Override
    @SideOnly(Side.CLIENT)
    public float getSunBrightness(float par1) {
       float f1 = this.world.getCelestialAngle(1.0F);
       float f2 = 1.25F - (MathHelper.cos(f1 * 3.1415927F * 2.0F) * 2.0F + 0.2F);
       if(f2 < 0.0F) {
          f2 = 0.0F;
       }

       if(f2 > 1.0F) {
          f2 = 1.0F;
       }

       f2 = 1.0F - f2;
       return f2 * 0.8F + 0.2F;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public float getStarBrightness(float par1)
    {
        final float var2 = this.world.getCelestialAngle(par1);
        float var3 = 1.0F - (MathHelper.cos(var2 * (float) Math.PI * 2.0F) * 2.0F + 0.25F);

        if (var3 < 0.0F)
        {
            var3 = 0.0F;
        }

        if (var3 > 1.0F)
        {
            var3 = 1.0F;
        }

        return var3 * var3 * 0.5F + 0.3F;
    }

}
