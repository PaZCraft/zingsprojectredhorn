/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.zing.zingsprojectredhorn.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.core.dispenser.BoatDispenseItemBehavior;

@EventBusSubscriber
public class ZingsProjectRedHornModDispenseBehaviors {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			DispenserBlock.registerBehavior(ZingsProjectRedHornModItems.FERROROCK_WILLOW_BOAT.get(), new BoatDispenseItemBehavior(ZingsProjectRedHornModEntities.FERROROCK_WILLOW_BOAT.get()));
			DispenserBlock.registerBehavior(ZingsProjectRedHornModItems.FERROROCK_WILLOW_BOAT_WITH_CHEST.get(), new BoatDispenseItemBehavior(ZingsProjectRedHornModEntities.FERROROCK_WILLOW_BOAT_WITH_CHEST.get()));
			DispenserBlock.registerBehavior(ZingsProjectRedHornModItems.ZERO_PLATEA_RAFT.get(), new BoatDispenseItemBehavior(ZingsProjectRedHornModEntities.ZERO_PLATEA_RAFT.get()));
			DispenserBlock.registerBehavior(ZingsProjectRedHornModItems.ZERO_PLATEA_RAFT_WITH_CHEST.get(), new BoatDispenseItemBehavior(ZingsProjectRedHornModEntities.ZERO_PLATEA_RAFT_WITH_CHEST.get()));
		});
	}
}