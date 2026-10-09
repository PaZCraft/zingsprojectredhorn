package com.zing.zingsprojectredhorn.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.UntintedParticleLeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ColorParticleOption;

public class FerrorockWillowLeavesBlock extends UntintedParticleLeavesBlock {
	public FerrorockWillowLeavesBlock(BlockBehaviour.Properties properties) {
		super(0.025f, ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, -16291001), properties.sound(SoundType.GRASS).strength(1f, 10f).noOcclusion().pushReaction(PushReaction.DESTROY).isRedstoneConductor((bs, br, bp) -> false).ignitedByLava()
				.isSuffocating((bs, br, bp) -> false).isViewBlocking((bs, br, bp) -> false));
	}
}