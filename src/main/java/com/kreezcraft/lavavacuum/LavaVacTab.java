package com.kreezcraft.lavavacuum;

import com.kreezcraft.lavavacuum.init.InitItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class LavaVacTab extends CreativeTabs {

	public LavaVacTab(String label) {
		super(LavaVacuum.MODID);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(InitItems.LAVAVAC);
	}
	
	@Override
	public boolean hasSearchBar() {
		return false;
	}

	
}