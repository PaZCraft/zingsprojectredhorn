package com.zing.zingsprojectredhorn.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.BlockPos;

public class ZeroTwosCurseOnEntityHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!(world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(Identifier.parse("zings_project_red_horn:zero_two_curse_cannot_replace")))) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.FIRE.defaultBlockState(), 3);
		}
	}
}