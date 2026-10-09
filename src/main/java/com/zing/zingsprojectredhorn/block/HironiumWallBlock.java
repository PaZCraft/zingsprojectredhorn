package net.mcreator.zingsprojectredhorn.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class HironiumWallBlock extends WallBlock {
	public HironiumWallBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.RESIN_BRICKS).strength(2.5f, 10f).requiresCorrectToolForDrops().forceSolidOn());
	}
}