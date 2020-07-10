package com.crazypanda.crazysystems.world;

import micdoodle8.mods.galacticraft.api.galaxies.Planet;
import micdoodle8.mods.galacticraft.api.world.IGalacticraftWorldProvider;

public interface IPlanetWorldProvider extends IGalacticraftWorldProvider {
	
	abstract Planet getSCPlanet();
}
