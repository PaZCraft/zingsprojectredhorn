package com.zing.zingsprojectredhorn.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.IronBarsBlock;

public class AcceptVirtualGateBlock extends IronBarsBlock {
	public AcceptVirtualGateBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GLASS).strength(-1, 3600000).noCollision().postProcess((bs, br, bp) -> bp).emissiveRendering((bs, br, bp) -> true));
	}
}