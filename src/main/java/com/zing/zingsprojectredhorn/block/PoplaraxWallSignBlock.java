package com.zing.zingsprojectredhorn.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.SoundType;

import com.zing.zingsprojectredhorn.init.ZingsProjectRedHornModWoodTypes;
import com.zing.zingsprojectredhorn.init.ZingsProjectRedHornModBlocks;

public class PoplaraxWallSignBlock extends WallSignBlock {
	public PoplaraxWallSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsProjectRedHornModWoodTypes.POPLARAX_SIGN_WOOD_TYPE, properties.sound(SoundType.WOOD).strength(1f, 10f).forceSolidOn().overrideLootTable(ZingsProjectRedHornModBlocks.POPLARAX_SIGN.get().getLootTable())
				.overrideDescription(ZingsProjectRedHornModBlocks.POPLARAX_SIGN.get().getDescriptionId()));
	}
}