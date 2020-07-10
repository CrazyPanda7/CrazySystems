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


