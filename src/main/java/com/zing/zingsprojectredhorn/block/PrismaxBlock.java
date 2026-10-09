package com.zing.zingsprojectredhorn.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class PrismaxBlock extends Block {
	public PrismaxBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f));
	}
}