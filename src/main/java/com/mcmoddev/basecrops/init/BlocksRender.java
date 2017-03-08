package com.mcmoddev.basecrops.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class BlocksRender {
	public static void registerBlockRenderer() {
	reg(Blocks.metallicFarmland);
	reg(Blocks.metallicOre);
}
	public static void reg(Block block) {
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
