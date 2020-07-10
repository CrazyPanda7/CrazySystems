package com.crazypanda.crazysystems.init;

import com.crazypanda.crazysystems.CrazySystems;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public final class Kepler452Fluids {

 	/**
 	 *
 	 */
 	private Kepler452Fluids() {
 
 	}
 
 	/**
 	 *
 	 */
 	public static final Fluid B_WATER = new Fluid("b_fluid",
 			new ResourceLocation(CrazySystems.MODID, "blocks/b_water"),
 			new ResourceLocation(CrazySystems.MODID, "blocks/b_water"));
 
 	/**
 	 *
 	 */
 	public static void init() {
 		B_WATER.setDensity(1);
 		B_WATER.setViscosity(1);
 		B_WATER.setTemperature(1);
 		B_WATER.setLuminosity(1);
 		B_WATER.setUnlocalizedName(CrazySystems.MODID + "." + "B_WATER");
 		FluidRegistry.registerFluid(B_WATER);
 		FluidRegistry.addBucketForFluid(B_WATER);
 	}
}
