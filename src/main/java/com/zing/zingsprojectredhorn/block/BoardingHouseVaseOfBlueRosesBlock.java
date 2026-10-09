package com.zing.zingsprojectredhorn.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class BoardingHouseVaseOfBlueRosesBlock extends Block {
	private static final VoxelShape SHAPE = Shapes.or(box(4, 0, 4, 12, 1, 12), box(4, 8, 4, 12, 9, 12), box(5, 1, 5, 11, 8, 11));

	public BoardingHouseVaseOfBlueRosesBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.DECORATED_POT).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return SHAPE;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}
}