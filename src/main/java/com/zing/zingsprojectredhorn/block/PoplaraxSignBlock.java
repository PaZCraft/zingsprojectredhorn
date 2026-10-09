package com.zing.zingsprojectredhorn.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.SoundType;

import com.zing.zingsprojectredhorn.init.ZingsProjectRedHornModWoodTypes;

public class PoplaraxSignBlock extends StandingSignBlock {
	public PoplaraxSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsProjectRedHornModWoodTypes.POPLARAX_SIGN_WOOD_TYPE, properties.sound(SoundType.WOOD).strength(1f, 10f).forceSolidOn());
	}
}