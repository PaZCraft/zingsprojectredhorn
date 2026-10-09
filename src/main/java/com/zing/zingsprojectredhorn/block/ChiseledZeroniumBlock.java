package net.mcreator.zingsprojectredhorn.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class ChiseledZeroniumBlock extends Block {
	public ChiseledZeroniumBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(3.05f, 10f).lightLevel(blockstate -> 5).requiresCorrectToolForDrops());
	}
}