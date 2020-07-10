package com.crazypanda.crazysystems;

import javax.annotation.ParametersAreNonnullByDefault;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.crazypanda.crazysystems.init.CrazySystemsBlocks;
import com.crazypanda.crazysystems.init.Planets;
import com.crazypanda.crazysystems.init.SolarSystems;
import com.crazypanda.crazysystems.planets.CrazyDimensions;
import com.crazypanda.crazysystems.proxy.CommonProxy;

import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.rom.base.IMod;
import net.rom.registry.ReadOnlyRegistry;
import net.rom.utils.ModLogger;
import net.rom.utils.TranslateUtil;

@Mod(
	modid = CrazySystems.MODID,
	name = CrazySystems.NAME,
	version = CrazySystems.VERSION,
	dependencies = "required-after:forge@[14.23.4.2705,)",
	useMetadata = false,
	clientSideOnly = false,
	serverSideOnly = false,
	acceptedMinecraftVersions = "[1.12.2]",
	acceptableRemoteVersions = CrazySystems.VERSION,
	acceptableSaveVersions = "",
	certificateFingerprint = "@FINGERPRINT@",
	modLanguage = "java",
	modLanguageAdapter = "",
	canBeDeactivated = false,
	guiFactory = "",
	updateJSON = "https://github.com/MinecraftModDevelopmentMods/ExampleMod/master/update.json",
	customProperties = {})
@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class CrazySystems implements IMod {
	
	public static final String MODID = "crazysystems";
	public static final String NAME = "CrazySystems";
	public static final String VERSION = "@MOD_VERSION@";
	public static final int BUILD = 1;
	
	@Instance(MODID)
	public static CrazySystems instance;
	public static ReadOnlyRegistry registry = new ReadOnlyRegistry();
	public static TranslateUtil translate = new TranslateUtil(MODID);
	public static ModLogger logger = new ModLogger(MODID, BUILD);
	public static final Logger LOGGER = LogManager.getLogger(CrazySystems.MODID);
	
	@SidedProxy(clientSide = "com.crazypanda.crazysystems.proxy.ClientProxy", serverSide = "com.crazypanda.crazysystems.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	public static CreativeTabs BlocksTab = new CreativeTabs("CrazySystemsTab") {
		@Override
		public ItemStack getTabIconItem() {

			return new ItemStack(CrazySystemsBlocks.HEAVY_STONE);
		}
	};
	
	/**
	 *
 	 * @param event The Event.
	 */
	@EventHandler
	public void preInit(final FMLPreInitializationEvent event) {
		//// All Blocks, Items must be initialized here, configs as well
		
		registry.setMod(this);
		registry.getRecipeMaker();
		registry.addRegistrationHandler(CrazySystemsBlocks::registerAll, Block.class);
		
		SolarSystems.init();
		Planets.init();
		
		//// Above ////
		proxy.preInit(registry, event);
	}

	/**
	 *
 	 * @param event The Event.
	 */
	@EventHandler
	public static void init(final FMLInitializationEvent event) {
		
		//// Above ////
		proxy.init(registry, event);
	}

	/**
	 *
 	 * @param event The Event.
	 */
	@EventHandler
	public static void postInit(final FMLPostInitializationEvent event) {
		CrazyDimensions.init();
		
		
		//// Above ////
		proxy.postInit(registry, event);
	}

	@Override
	public String getModId() {
		return MODID;
	}

	@Override
	public String getModName() {
		return NAME;
	}

	@Override
	public String getVersion() {
		return VERSION;
	}

	@Override
	public int getBuildNum() {
		return 0;
	}

}
