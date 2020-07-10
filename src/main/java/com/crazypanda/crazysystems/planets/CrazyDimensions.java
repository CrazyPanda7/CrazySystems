
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
