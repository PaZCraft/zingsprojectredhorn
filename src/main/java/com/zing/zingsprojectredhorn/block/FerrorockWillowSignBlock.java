package net.mcreator.zingsprojectredhorn.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.SoundType;

import net.mcreator.zingsprojectredhorn.init.ZingsProjectRedHornModWoodTypes;

public class FerrorockWillowSignBlock extends StandingSignBlock {
	public FerrorockWillowSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsProjectRedHornModWoodTypes.FERROROCK_WILLOW_SIGN_WOOD_TYPE, properties.sound(SoundType.WOOD).strength(1f, 10f).forceSolidOn());
	}
}