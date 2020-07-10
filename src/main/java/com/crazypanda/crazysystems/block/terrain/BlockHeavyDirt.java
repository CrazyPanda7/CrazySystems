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
package com.crazypanda.crazysystems.block.terrain;

import com.crazypanda.crazysystems.block.BlockTerrain;

import net.minecraft.block.material.Material;

public class BlockHeavyDirt extends BlockTerrain {

	public BlockHeavyDirt() {
		super(Material.GROUND);
		setHardness(2.0F);
		setResistance(1.0F);
		setHarvestLevel("shovel", 2);
	}

}
