package com.zing.zingsprojectredhorn.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import com.zing.zingsprojectredhorn.init.ZingsProjectRedHornModEntities;

public class SoulOfZeroTwoRightclickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.HEART, x, y, z, 5, 3, 3, 3, 1);
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = ZingsProjectRedHornModEntities.ZERO_TWO.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
			}
		}
		if (!entity.level().isClientSide())
			entity.discard();
	}
}