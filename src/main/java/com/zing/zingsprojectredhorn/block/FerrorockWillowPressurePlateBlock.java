package net.mcreator.zingsprojectredhorn.block;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.PressurePlateBlock;

public class FerrorockWillowPressurePlateBlock extends PressurePlateBlock {
	public FerrorockWillowPressurePlateBlock(BlockBehaviour.Properties properties) {
		super(BlockSetType.OAK, properties.sound(SoundType.WOOD).strength(1f, 10f).forceSolidOn());
	}
}