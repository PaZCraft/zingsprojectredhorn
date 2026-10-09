package net.mcreator.zingsprojectredhorn.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class MagmaEnergyFuelBlockBlock extends Block {
	public MagmaEnergyFuelBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.IRON).strength(1f, 10f).lightLevel(blockstate -> 15).postProcess((bs, br, bp) -> bp).emissiveRendering((bs, br, bp) -> true));
	}
}