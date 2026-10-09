package com.zing.zingsprojectredhorn.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class BlockOfIchigoniumBlock extends Block {
	public BlockOfIchigoniumBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(3.05f, 10f).lightLevel(blockstate -> 5).requiresCorrectToolForDrops());
	}
}