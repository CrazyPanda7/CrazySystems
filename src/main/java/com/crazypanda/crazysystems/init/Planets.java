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
	
	public static Planet kelper452_a = new Planet("kelper452_a");
	static AstroBuilder builder = new AstroBuilder(CrazySystems.MODID);
	public static void init() {
		initPlanets();
		registerPlanets();
	}

	public static void initPlanets() {
		kelper452_a = builder.buildUnreachablePlanet("yzcetib", SolarSystems.kepler452, 0.5F);
		kelper452_a.setRingColorRGB(0.8F, 0.0F, 0.0F);

	}
	
	public static void registerPlanets() {
		GalaxyRegistry.registerPlanet(kelper452_a);
	}
}
