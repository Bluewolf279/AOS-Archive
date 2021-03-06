package com.TRIUMPH.aos.client.render.items;

import com.TRIUMPH.aos.items.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class ItemRenderRegister {

	public static String modID = "aos";

	public static void registerItemRenderer() {
		reg(ModItems.Poison_Arrow);
		reg(ModItems.Ender_nugget);
		reg(ModItems.Ender_crystal);
		reg(ModItems.Ender_crystalSword);
		reg(ModItems.Ender_CrystalPickaxe);
		reg(ModItems.Ender_CrystalHelmet);
		reg(ModItems.Ender_CrystalChestpiece);
		reg(ModItems.Ender_CrystalLeggings);
		reg(ModItems.Ender_CrystalBoots);
		reg(ModItems.Obsidian_Crystal);
		reg(ModItems.Obsidian_Crystal_Clump);
		reg(ModItems.Obsidian_Crystal_Pickaxe);
		reg(ModItems.Obsidian_Crystal_Sword);
		reg(ModItems.Obsidian_Crystal_Helmet);
		reg(ModItems.Obsidian_Crystal_Chestplate);
		reg(ModItems.Obsidian_Crystal_Leggings);
		reg(ModItems.Obsidian_Crystal_Boots);
	}

	public static void reg(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}


}