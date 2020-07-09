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
