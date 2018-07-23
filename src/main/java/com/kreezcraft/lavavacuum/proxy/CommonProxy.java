package com.kreezcraft.lavavacuum.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

abstract public class CommonProxy {

	public void registerItemRenderer(Item item, int meta, String id) {
	}

}
