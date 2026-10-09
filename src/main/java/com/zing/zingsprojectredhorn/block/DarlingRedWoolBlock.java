package net.mcreator.zingsprojectredhorn.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class DarlingRedWoolBlock extends Block {
	public DarlingRedWoolBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOL).strength(1f, 10f));
	}
}