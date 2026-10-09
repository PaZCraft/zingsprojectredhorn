package net.mcreator.zingsprojectredhorn.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class DarlingBlueWoolBlock extends Block {
	public DarlingBlueWoolBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOL).strength(1f, 10f));
	}
}