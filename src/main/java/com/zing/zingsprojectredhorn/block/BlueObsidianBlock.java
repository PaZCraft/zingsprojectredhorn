package com.zing.zingsprojectredhorn.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class BlueObsidianBlock extends Block {
	public BlueObsidianBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1.6f, 13.5f)
				.requiresCorrectToolForDrops()
				// postProcess takes 3 arguments and returns a BlockPos
				.postProcess((state, level, pos) -> pos)
				// emissiveRendering takes 1 argument and returns a boolean
				.emissiveRendering((state) -> true));
	}
}
