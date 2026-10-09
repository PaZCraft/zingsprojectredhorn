package net.mcreator.zingsprojectredhorn.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class IchigoniumTilesBlock extends Block {
	public IchigoniumTilesBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.DEEPSLATE_TILES).strength(3.05f, 10f).lightLevel(blockstate -> 5).requiresCorrectToolForDrops());
	}
}