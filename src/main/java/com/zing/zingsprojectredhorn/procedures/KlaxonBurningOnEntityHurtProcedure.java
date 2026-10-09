package com.zing.zingsprojectredhorn.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.server.level.ServerLevel;

public class KlaxonBurningOnEntityHurtProcedure {
	public static void execute(LevelAccessor world, ItemStack itemstack) {
		if (world instanceof ServerLevel _level) {
			itemstack.hurtAndBreak(1, _level, null, _stkprov -> {
			});
		}
	}
}