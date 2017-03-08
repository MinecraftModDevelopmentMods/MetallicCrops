package com.mcmoddev.basecrops.lib;


import com.mcmoddev.basecrops.BaseCrops;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

	public class BlockMetalicFarmland2 extends Block {

	    public BlockMetalicFarmland2(String unlocalizedName, Material material, float hardness, float resistance) {
	        super(material);
	        this.setUnlocalizedName(BaseCrops.MODID + "." + unlocalizedName);
	        this.setHardness(hardness);
	        this.setResistance(resistance);
	    }
	    public BlockMetalicFarmland2(String unlocalizedName, float hardness, float resistance) {
	        this(unlocalizedName, Material.ROCK, hardness, resistance);
	    }
	    public BlockMetalicFarmland2(String unlocalizedName) {
	        this(unlocalizedName, 2.0f, 10.0f);
	    }
	    
		@Override
	    public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, net.minecraftforge.common.IPlantable plantable)
	    {
	     return true;
	    }

	}