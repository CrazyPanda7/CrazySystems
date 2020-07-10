package com.crazypanda.crazysystems.init;

import com.crazypanda.crazysystems.CrazySystems;
import com.crazypanda.crazysystems.lib.AstroBuilder;
import com.crazypanda.crazysystems.planets.kepler452.planetb.WorldProviderKepler452b;
import com.crazypanda.crazysystems.planets.kepler452.planetb.biome.Kepler452BBiomes;
import com.crazypanda.crazysystems.util.ExampleModConfig;

import micdoodle8.mods.galacticraft.api.galaxies.GalaxyRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.Planet;
import micdoodle8.mods.galacticraft.api.world.AtmosphereInfo;
import micdoodle8.mods.galacticraft.core.dimension.TeleportTypeMoon;

public class Planets {

	public static Planet kepler452_b = new Planet("kepler452_b");
	static AstroBuilder builder = new AstroBuilder(CrazySystems.MODID);

	public static void init() {
		initPlanets();
		registerPlanets();
	}

	public static void initPlanets() {

		kepler452_b = builder.buildPlanet(SolarSystems.kepler452, "kepler452_b", WorldProviderKepler452b.class,
				ExampleModConfig.GENERAL.kepler452b_dimId, 3, (float) Math.PI, 1.0f, 0.5f, 0.6f);
		kepler452_b.setRingColorRGB(0.8F, 0.0F, 0.0F);
		kepler452_b.setAtmosphere(new AtmosphereInfo(false, true, false, 5.0f, 1.0f, 1.0f));
		kepler452_b.setBiomeInfo(Kepler452BBiomes.kepler452b, Kepler452BBiomes.kepler452b_sea);

	}

	public static void registerPlanets() {
		GalaxyRegistry.registerPlanet(kepler452_b);
		builder.registerTeleportType(WorldProviderKepler452b.class, new TeleportTypeMoon());
	}
}
