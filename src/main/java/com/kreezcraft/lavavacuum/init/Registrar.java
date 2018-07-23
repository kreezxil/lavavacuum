package com.kreezcraft.lavavacuum.init;

import com.kreezcraft.lavavacuum.LavaVacuum;
import com.kreezcraft.lavavacuum.item.ItemLavaVacuum;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class Registrar {

	@SubscribeEvent
	public static void onItemRegister(Register<Item> event) {
		event.getRegistry().registerAll(InitItems.ITEMS.toArray(new Item[0]));
	}

//	@SubscribeEvent
//	public static void onBlockRegister(Register<Block> event) {
//		event.getRegistry().registerAll(InitBlocks.BLOCKS.toArray(new Block[0]));
//	}

	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent e) {
		for (Item i : InitItems.ITEMS) {
			if (i instanceof IHasModel)
				((IHasModel) i).registerModels();
		}
//		for (Block b : InitBlocks.BLOCKS) {
//			if (b instanceof IHasModel)
//				((IHasModel) b).registerModels();
//		}
	}
}
