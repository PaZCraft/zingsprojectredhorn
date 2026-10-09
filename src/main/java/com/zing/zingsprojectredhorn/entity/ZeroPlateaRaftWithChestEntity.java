package net.mcreator.zingsprojectredhorn.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.ChestRaft;
import net.minecraft.world.entity.EntityType;

import net.mcreator.zingsprojectredhorn.init.ZingsProjectRedHornModItems;

public class ZeroPlateaRaftWithChestEntity extends ChestRaft {
	public ZeroPlateaRaftWithChestEntity(EntityType<ZeroPlateaRaftWithChestEntity> type, Level world) {
		super(type, world, ZingsProjectRedHornModItems.ZERO_PLATEA_RAFT_WITH_CHEST);
	}
}