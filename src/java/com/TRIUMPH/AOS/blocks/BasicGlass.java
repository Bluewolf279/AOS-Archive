package com.TRIUMPH.AOS.blocks;

import java.util.Random;

import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BasicGlass extends BlockGlass {
	private static boolean ignoreSimilarity;

	public BasicGlass(String unlocalizedName, Material material, float hardness, float resistance) {
		super(material, ignoreSimilarity);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setLightOpacity(1);
		this.isVisuallyOpaque();
		this.isTranslucent();
		this.isOpaqueCube();
		this.getHarvestTool(null);
		this.quantityDropped(RANDOM);
	}
	public BasicGlass(String unlocalizedName, float hardness, float resistance) {
		this(unlocalizedName, Material.rock, hardness, resistance);
	}
	
	public BasicGlass(String unlocalizedName) {
		this(unlocalizedName, 1.0f, 10.0f);
	}
	@Override
    public int quantityDropped(Random random)
    {
        return 1;
    }
}
