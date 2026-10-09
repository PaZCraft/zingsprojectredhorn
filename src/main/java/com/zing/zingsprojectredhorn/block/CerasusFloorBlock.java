package net.mcreator.zingsprojectredhorn.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class CerasusFloorBlock extends Block {
	public CerasusFloorBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f));
	}
}