
package com.crazypanda.crazysystems.util;

import com.crazypanda.crazysystems.CrazySystems;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 *
 */
@Mod.EventBusSubscriber(modid = CrazySystems.MODID)
@Config(modid = CrazySystems.MODID, category = "")
public final class ExampleModConfig {

	/**
	 *
	 */
	@Config.LangKey("stat.generalButton")
	public static final General GENERAL = new General();

	/**
	 *
	 */
	public static class General {

		/**
		 *
		 */
		@Config.Comment("Example Boolean")
		public boolean exampleBoolean = false;
		
		@Config.Comment("Kepler452b Dimension ID")
		public int kepler452b_dimId = -3303;
	}
	
	

	/**
	 *
	 * @param event The Event.
	 */
	@SubscribeEvent
	public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
		if (event.getModID().equals(CrazySystems.MODID)) {
			ConfigManager.sync(CrazySystems.MODID, Config.Type.INSTANCE);
		}
	}
}
