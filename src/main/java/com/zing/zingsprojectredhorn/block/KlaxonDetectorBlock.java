package com.zing.zingsprojectredhorn.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class KlaxonDetectorBlock extends Block {
	public KlaxonDetectorBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GLASS).strength(1f, 10f).lightLevel(blockstate -> 15).postProcess((bs, br, bp) -> bp).emissiveRendering((bs, br, bp) -> true));
	}
}