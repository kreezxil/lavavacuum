package com.kreezcraft.lavavacuum.item;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.kreezcraft.lavavacuum.LavaVacuum;
import com.kreezcraft.lavavacuum.init.IHasModel;
import com.kreezcraft.lavavacuum.init.InitItems;

public class ItemLavaVacuum extends ItemBucket implements IHasModel {

	public static final String NAME = "lavavacuum";

	private static final Logger logger = LogManager.getLogger(LavaVacuum.MODID);

	public ItemLavaVacuum() {
		super(Blocks.AIR);
		setCreativeTab(LavaVacuum.creativeTab);
		setUnlocalizedName(LavaVacuum.MODID + "." + NAME);
		setRegistryName("Lava Vacuum");
		InitItems.ITEMS.add(this);
	}

	@Override
	public boolean tryPlaceContainedLiquid(EntityPlayer player, World worldIn, BlockPos posIn) {
		if (worldIn.getBlockState(posIn) == Blocks.LAVA || worldIn.getBlockState(posIn) == Blocks.FLOWING_LAVA) {
			worldIn.setBlockToAir(posIn);
			return true;
		}
		return false;
	}

	public void registerItemModel() {
		LavaVacuum.proxy.registerItemRenderer(this, 0, NAME);
	}

	@Override
	public Item setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

	@Override
	public void registerModels() {
		LavaVacuum.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
