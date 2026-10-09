package com.zing.zingsprojectredhorn.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.IronBarsBlock;

public class BlockedVirtualGateBlock extends IronBarsBlock {
	public BlockedVirtualGateBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GLASS)
				.strength(-1.0F, 3600000.0F)
				.noCollision()
				// postProcess STILL takes 3 arguments and returns a BlockPos
				.postProcess((state, level, pos) -> pos)
				// emissiveRendering NOW only takes 1 argument and returns a boolean
				.emissiveRendering((state) -> true));
	}
}
