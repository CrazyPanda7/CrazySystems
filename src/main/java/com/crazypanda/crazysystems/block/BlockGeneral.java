package com.crazypanda.crazysystems.block;

import micdoodle8.mods.galacticraft.core.blocks.ISortableBlock;
import micdoodle8.mods.galacticraft.core.util.EnumSortCategoryBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.item.ItemStack;
import net.rom.block.BlockBaseRO;
import net.rom.registry.IAddRecipe;
import net.rom.registry.RecipeBuilder;

public abstract class BlockGeneral extends BlockBaseRO implements ISortableBlock, IAddRecipe {

	
	public BlockGeneral(Material material) {

		super(material);
		
	}

	public ItemStack getStack(int count) {
		return new ItemStack(this, count);
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this);
	}

	@Override
	public EnumSortCategoryBlock getCategory(int meta) {
		return EnumSortCategoryBlock.GENERAL;
	}
	
    public abstract void addRecipes(RecipeBuilder recipes);

}
