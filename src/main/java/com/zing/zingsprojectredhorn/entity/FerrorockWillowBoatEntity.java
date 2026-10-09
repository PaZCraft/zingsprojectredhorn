package net.mcreator.zingsprojectredhorn.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.entity.EntityType;

import net.mcreator.zingsprojectredhorn.init.ZingsProjectRedHornModItems;

public class FerrorockWillowBoatEntity extends Boat {
	public FerrorockWillowBoatEntity(EntityType<FerrorockWillowBoatEntity> type, Level world) {
		super(type, world, ZingsProjectRedHornModItems.FERROROCK_WILLOW_BOAT);
	}
}