package com.zing.zingsprojectredhorn.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class CerasusFloorLineBlock extends Block {
	public CerasusFloorLineBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f));
	}
}