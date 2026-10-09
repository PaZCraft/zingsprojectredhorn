package com.zing.zingsprojectredhorn.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.Raft;
import net.minecraft.world.entity.EntityType;

import com.zing.zingsprojectredhorn.init.ZingsProjectRedHornModItems;

public class ZeroPlateaRaftEntity extends Raft {
	public ZeroPlateaRaftEntity(EntityType<ZeroPlateaRaftEntity> type, Level world) {
		super(type, world, ZingsProjectRedHornModItems.ZERO_PLATEA_RAFT);
	}
}