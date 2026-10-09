package net.mcreator.zingsprojectredhorn.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.SoundType;

import net.mcreator.zingsprojectredhorn.init.ZingsProjectRedHornModWoodTypes;
import net.mcreator.zingsprojectredhorn.init.ZingsProjectRedHornModBlocks;

public class ZeroPlateaWallSignBlock extends WallSignBlock {
	public ZeroPlateaWallSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsProjectRedHornModWoodTypes.ZERO_PLATEA_SIGN_WOOD_TYPE, properties.sound(SoundType.BAMBOO_WOOD).strength(1f, 10f).forceSolidOn().overrideLootTable(ZingsProjectRedHornModBlocks.ZERO_PLATEA_SIGN.get().getLootTable())
				.overrideDescription(ZingsProjectRedHornModBlocks.ZERO_PLATEA_SIGN.get().getDescriptionId()));
	}
}