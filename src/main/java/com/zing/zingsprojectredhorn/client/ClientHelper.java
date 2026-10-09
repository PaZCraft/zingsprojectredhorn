package com.zing.zingsprojectredhorn.client;

import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.Minecraft;

public class ClientHelper {
	public static void openInventory() {
		Minecraft mc = Minecraft.getInstance();
		mc.setScreenAndShow(new InventoryScreen(mc.player));
	}
}