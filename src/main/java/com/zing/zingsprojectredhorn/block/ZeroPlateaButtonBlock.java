package net.mcreator.zingsprojectredhorn.block;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.ButtonBlock;

public class ZeroPlateaButtonBlock extends ButtonBlock {
	public ZeroPlateaButtonBlock(BlockBehaviour.Properties properties) {
		super(BlockSetType.OAK, 30, properties.sound(SoundType.BAMBOO_WOOD).strength(1f, 10f));
	}
}