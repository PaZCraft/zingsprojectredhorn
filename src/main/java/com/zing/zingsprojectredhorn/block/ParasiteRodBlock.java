package net.mcreator.zingsprojectredhorn.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.EndRodBlock;

public class ParasiteRodBlock extends EndRodBlock {
	public ParasiteRodBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(1f, 10f).lightLevel(blockstate -> 15).noOcclusion().postProcess((bs, br, bp) -> bp).emissiveRendering((bs, br, bp) -> true).isRedstoneConductor((bs, br, bp) -> false).forceSolidOff());
	}
}