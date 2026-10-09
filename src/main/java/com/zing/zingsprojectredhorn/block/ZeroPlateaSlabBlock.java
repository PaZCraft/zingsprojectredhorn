package net.mcreator.zingsprojectredhorn.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class ZeroPlateaSlabBlock extends SlabBlock {
	public ZeroPlateaSlabBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.BAMBOO_WOOD).strength(1f, 10f));
	}
}