package com.kreezcraft.lavavacuum;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.kreezcraft.lavavacuum.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.InstanceFactory;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
  modid = LavaVacuum.MODID,
  name = LavaVacuum.NAME,
  version = LavaVacuum.VERSION
 )
public class LavaVacuum {

  public static final String MODID = "lavavacuum";
  public static final String NAME = "Lava Vacuum";
  public static final String VERSION = "@VERSION@";
  
  private static final Logger logger = LogManager.getLogger(MODID);
  
  public static final LavaVacTab creativeTab = new LavaVacTab("Lava Vacuum");

  @SidedProxy(
    clientSide = "com.kreezcraft.lavavacuum.proxy.ClientProxy",
    serverSide = "com.kreezcraft.lavavacuum.proxy.ServerProxy"
  )
  public static CommonProxy proxy;

  private static LavaVacuum instance = new LavaVacuum();

  @InstanceFactory
  public static LavaVacuum instance() {
    return instance;
  }

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
