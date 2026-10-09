package net.mcreator.zingsprojectredhorn.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class ZeroniumSlabBlock extends SlabBlock {
	public ZeroniumSlabBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.RESIN_BRICKS).strength(2.5f, 10f).requiresCorrectToolForDrops());
	}
}