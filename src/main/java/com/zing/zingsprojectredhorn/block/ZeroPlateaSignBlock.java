package com.zing.zingsprojectredhorn.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.SoundType;

import com.zing.zingsprojectredhorn.init.ZingsProjectRedHornModWoodTypes;

public class ZeroPlateaSignBlock extends StandingSignBlock {
	public ZeroPlateaSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsProjectRedHornModWoodTypes.ZERO_PLATEA_SIGN_WOOD_TYPE, properties.sound(SoundType.BAMBOO_WOOD).strength(1f, 10f).forceSolidOn());
	}
}