package net.mcreator.zingsprojectredhorn.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.UntintedParticleLeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ColorParticleOption;

public class ZeroPlateaLeavesBlock extends UntintedParticleLeavesBlock {
	public ZeroPlateaLeavesBlock(BlockBehaviour.Properties properties) {
		super(0.04f, ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, -1015225), properties.sound(SoundType.AZALEA_LEAVES).strength(1f, 10f).noOcclusion().pushReaction(PushReaction.DESTROY).isRedstoneConductor((bs, br, bp) -> false)
				.ignitedByLava().isSuffocating((bs, br, bp) -> false).isViewBlocking((bs, br, bp) -> false));
	}
}