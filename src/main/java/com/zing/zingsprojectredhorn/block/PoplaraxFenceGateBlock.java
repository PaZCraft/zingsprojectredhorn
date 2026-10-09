package com.zing.zingsprojectredhorn.block;

import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FenceGateBlock;

public class PoplaraxFenceGateBlock extends FenceGateBlock {
	public PoplaraxFenceGateBlock(BlockBehaviour.Properties properties) {
		super(WoodType.OAK, properties.sound(SoundType.WOOD).strength(1f, 10f).forceSolidOn());
	}
}