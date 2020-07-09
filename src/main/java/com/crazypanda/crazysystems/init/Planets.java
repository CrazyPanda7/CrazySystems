/**
 * CrazySystems
 * Copyright (C) 2020
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.crazypanda.crazysystems.init;

import com.crazypanda.crazysystems.CrazySystems;
import com.crazypanda.crazysystems.lib.AstroBuilder;

import micdoodle8.mods.galacticraft.api.galaxies.GalaxyRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.Planet;

public class Planets {
	
	public static Planet kepler452_b;
	static AstroBuilder builder = new AstroBuilder(CrazySystems.MODID);
	public static void init() {
		initPlanets();
		registerPlanets();
	}

	public static void initPlanets() {
		kepler452_b = builder.buildUnreachablePlanet("kepler452_b", SolarSystems.kepler452, 0.5F);
		kepler452_b.setRingColorRGB(0.8F, 0.0F, 0.0F);
		//kepler452b.setBodyIcon("kepler452_b");

	}
	
	public static void registerPlanets() {
		GalaxyRegistry.registerPlanet(kepler452_b);
	}
}
