package com.zing.zingsprojectredhorn.block;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.PressurePlateBlock;

public class ZeroPlateaPressurePlateBlock extends PressurePlateBlock {
	public ZeroPlateaPressurePlateBlock(BlockBehaviour.Properties properties) {
		super(BlockSetType.OAK, properties.sound(SoundType.BAMBOO_WOOD).strength(1f, 10f).forceSolidOn());
	}
}