package net.mcreator.zingsprojectredhorn.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.minecraft.world.entity.EntityType;

import net.mcreator.zingsprojectredhorn.init.ZingsProjectRedHornModItems;

public class FerrorockWillowBoatWithChestEntity extends ChestBoat {
	public FerrorockWillowBoatWithChestEntity(EntityType<FerrorockWillowBoatWithChestEntity> type, Level world) {
		super(type, world, ZingsProjectRedHornModItems.FERROROCK_WILLOW_BOAT_WITH_CHEST);
	}
}