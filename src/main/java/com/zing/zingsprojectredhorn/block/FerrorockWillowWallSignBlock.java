package com.zing.zingsprojectredhorn.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.SoundType;

import com.zing.zingsprojectredhorn.init.ZingsProjectRedHornModWoodTypes;
import com.zing.zingsprojectredhorn.init.ZingsProjectRedHornModBlocks;

public class FerrorockWillowWallSignBlock extends WallSignBlock {
	public FerrorockWillowWallSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsProjectRedHornModWoodTypes.FERROROCK_WILLOW_SIGN_WOOD_TYPE, properties.sound(SoundType.WOOD).strength(1f, 10f).forceSolidOn().overrideLootTable(ZingsProjectRedHornModBlocks.FERROROCK_WILLOW_SIGN.get().getLootTable())
				.overrideDescription(ZingsProjectRedHornModBlocks.FERROROCK_WILLOW_SIGN.get().getDescriptionId()));
	}
}