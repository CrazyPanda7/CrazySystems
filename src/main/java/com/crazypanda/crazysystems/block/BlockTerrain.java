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
package com.crazypanda.crazysystems.block;

import micdoodle8.mods.galacticraft.api.block.ITerraformableBlock;
import micdoodle8.mods.galacticraft.core.util.EnumSortCategoryBlock;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.rom.registry.RecipeBuilder;

public class BlockTerrain extends BlockGeneral implements ITerraformableBlock {

	public BlockTerrain(Material material) {
		super(material);

	}

	@Override
	public void addRecipes(RecipeBuilder recipes) {
	}

	@Override
	public boolean isTerraformable(World world, BlockPos pos) {
		return false;
	}
	
	@Override
	public EnumSortCategoryBlock getCategory(int meta) {
		return EnumSortCategoryBlock.GENERAL;
	}
}


