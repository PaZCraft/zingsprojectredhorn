package com.zing.zingsprojectredhorn.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class IchigoniumOreBlock extends Block {
	public IchigoniumOreBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1.5f, 10f).lightLevel(blockstate -> 5));
	}
}