package com.zing.zingsprojectredhorn.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.SimpleParticleType;

import com.zing.zingsprojectredhorn.init.ZingsProjectRedHornModParticleTypes;

public class KlaxonZapperWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle((SimpleParticleType) (ZingsProjectRedHornModParticleTypes.KLAXON_ELECTRO.get()), x, y, z, 0, 1, 0);
	}
}