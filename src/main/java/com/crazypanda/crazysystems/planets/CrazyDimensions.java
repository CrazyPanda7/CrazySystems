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
package com.crazypanda.crazysystems.planets;

import com.crazypanda.crazysystems.util.ExampleModConfig;

import micdoodle8.mods.galacticraft.core.util.WorldUtil;
import net.minecraft.world.DimensionType;

public class CrazyDimensions {
	
	public static DimensionType KEPLER452B;
	
	public static void init() {
		CrazyDimensions.KEPLER452B = WorldUtil.getDimensionTypeById(ExampleModConfig.GENERAL.kepler452b_dimId);
	}

}
