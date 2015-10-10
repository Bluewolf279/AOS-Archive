package com.TRIUMPH.AOS.client.render.items;

import com.TRIUMPH.AOS.items.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class ItemRenderRegister {
	
	public static String modID = "aos"; 
	
	public static void registerItemRenderer() {
		reg(ModItems.tutorialItem);
	}
	
	public static void reg(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	
}