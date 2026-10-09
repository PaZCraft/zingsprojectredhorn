package com.zing.zingsprojectredhorn.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import com.zing.zingsprojectredhorn.init.ZingsProjectRedHornModParticleTypes;

public class KlaxonBeamWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (ZingsProjectRedHornModParticleTypes.KLAXON_ORB_YELLOW.get()), x, y, z, 5, 3, 3, 3, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (ZingsProjectRedHornModParticleTypes.KLAXON_ORB_BLUE.get()), x, y, z, 5, 3, 3, 3, 1);
	}
}