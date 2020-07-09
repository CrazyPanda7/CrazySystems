

package com.crazypanda.crazysystems.init;

import com.crazypanda.crazysystems.CrazySystems;
import com.crazypanda.crazysystems.lib.AstroBuilder;

import micdoodle8.mods.galacticraft.api.galaxies.SolarSystem;
import micdoodle8.mods.galacticraft.api.vector.Vector3;

public class SolarSystems {
	
	public static SolarSystem kepler452;
	
	private static AstroBuilder builder = new AstroBuilder(CrazySystems.MODID);
	
	public static void init() {
		registerSolarSystems();
		initializeSolarSystems();
	}
	private static void registerSolarSystems() {
		
		kepler452 = builder.buildSolarSystem("kepler452", "milky_way", new Vector3(1.0F,  1.0F, 1.0F), "kepler452");
	}

	private static void initializeSolarSystems() {
		builder.registerSolarSystem(kepler452);
	}
}
