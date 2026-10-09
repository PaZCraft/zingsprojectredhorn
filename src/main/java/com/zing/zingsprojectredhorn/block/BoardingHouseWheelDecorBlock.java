package com.zing.zingsprojectredhorn.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.function.Function;

public class BoardingHouseWheelDecorBlock extends Block {
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;
	private final Function<BlockState, VoxelShape> shapes = this.makeShapes();

	public BoardingHouseWheelDecorBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOD).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	private Function<BlockState, VoxelShape> makeShapes() {
		return this.getShapeForEachState(state -> {
			return switch (state.getValue(FACING)) {
				case NORTH -> Shapes.or(box(12, 2, 8, 15, 5, 9), box(13, 1, 8, 14, 2, 9), box(10, 1, 8, 12, 3, 9), box(5, 1, 8, 10, 6, 9), box(1, 1, 8, 4, 4, 9), box(2, 4, 8, 3, 5, 9), box(0, 0, 6, 16, 1, 10));
				case EAST -> Shapes.or(box(7, 2, 12, 8, 5, 15), box(7, 1, 13, 8, 2, 14), box(7, 1, 10, 8, 3, 12), box(7, 1, 5, 8, 6, 10), box(7, 1, 1, 8, 4, 4), box(7, 4, 2, 8, 5, 3), box(6, 0, 0, 10, 1, 16));
				case WEST -> Shapes.or(box(8, 2, 1, 9, 5, 4), box(8, 1, 2, 9, 2, 3), box(8, 1, 4, 9, 3, 6), box(8, 1, 6, 9, 6, 11), box(8, 1, 12, 9, 4, 15), box(8, 4, 13, 9, 5, 14), box(6, 0, 0, 10, 1, 16));
				default -> Shapes.or(box(1, 2, 7, 4, 5, 8), box(2, 1, 7, 3, 2, 8), box(4, 1, 7, 6, 3, 8), box(6, 1, 7, 11, 6, 8), box(12, 1, 7, 15, 4, 8), box(13, 4, 7, 14, 5, 8), box(0, 0, 6, 16, 1, 10));
			};
		});
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return shapes.apply(state);
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		BlockState state = super.getStateForPlacement(context);
		if (state == null)
			return null;
		if (context.getClickedFace().getAxis() == Direction.Axis.Y)
			return state.setValue(FACING, Direction.NORTH);
		return state.setValue(FACING, context.getClickedFace());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}
}