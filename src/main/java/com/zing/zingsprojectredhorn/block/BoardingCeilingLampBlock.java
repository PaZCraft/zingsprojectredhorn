package com.zing.zingsprojectredhorn.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import com.zing.zingsprojectredhorn.procedures.BoardingCeilingLampOnBlockRightclickedProcedure;

public class BoardingCeilingLampBlock extends Block {
	private static final VoxelShape SHAPE = Shapes.or(box(6, 7, 6, 10, 8, 10), box(7, 8, 7, 9, 10, 9), box(3, 3, 3, 13, 7, 13), box(4, 2, 4, 12, 3, 12), box(4, 1, 4, 5, 2, 5), box(8, 1, 4, 9, 2, 5), box(11, 1, 4, 12, 2, 5), box(11, 1, 11, 12, 2, 12),
			box(4, 1, 11, 5, 2, 12), box(4, 1, 8, 5, 2, 9), box(11, 1, 7, 12, 2, 8), box(7, 1, 11, 8, 2, 12));

	public BoardingCeilingLampBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.LANTERN).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return SHAPE;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public InteractionResult useWithoutItem(BlockState blockstate, Level world, BlockPos pos, Player entity, BlockHitResult hit) {
		super.useWithoutItem(blockstate, world, pos, entity, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		BoardingCeilingLampOnBlockRightclickedProcedure.execute(world, x, y, z);
		return InteractionResult.SUCCESS;
	}
}