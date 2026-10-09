package com.zing.zingsprojectredhorn.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class BlueObsidianBlock extends Block {
	public BlueObsidianBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1.6f, 13.5f).requiresCorrectToolForDrops().postProcess((bs, br, bp) -> bp).emissiveRendering((bs, br, bp) -> true));
	}
}