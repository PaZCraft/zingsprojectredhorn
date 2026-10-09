package net.mcreator.zingsprojectredhorn.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.IronBarsBlock;

public class BlockedVirtualGateBlock extends IronBarsBlock {
	public BlockedVirtualGateBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GLASS).strength(-1, 3600000).postProcess((bs, br, bp) -> bp).emissiveRendering((bs, br, bp) -> true));
	}
}