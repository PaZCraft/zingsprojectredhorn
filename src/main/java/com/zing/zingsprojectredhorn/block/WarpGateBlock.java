package net.mcreator.zingsprojectredhorn.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class WarpGateBlock extends Block {
	public WarpGateBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GLASS).strength(1f, 10f).lightLevel(blockstate -> 10).noCollision().postProcess((bs, br, bp) -> bp).emissiveRendering((bs, br, bp) -> true));
	}

	@Override
	public int getLightDampening(BlockState state) {
		return 15;
	}
}