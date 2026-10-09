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

public class BoardingHouseChairBlock extends Block {
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;
	private final Function<BlockState, VoxelShape> shapes = this.makeShapes();

	public BoardingHouseChairBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOD).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	private Function<BlockState, VoxelShape> makeShapes() {
		return this.getShapeForEachState(state -> {
			return switch (state.getValue(FACING)) {
				case NORTH -> Shapes.or(box(0, 0, 0, 1, 9, 1), box(15, 0, 0, 16, 9, 1), box(15, 0, 15, 16, 9, 16), box(0, 0, 15, 1, 9, 16), box(0, 9, 0, 16, 10, 16), box(0, 10, 15, 2, 26, 16), box(14, 10, 15, 16, 26, 16), box(7, 10, 15, 9, 26, 16),
						box(6, 13, 15, 7, 22, 16), box(6, 10, 15, 7, 12, 16), box(9, 10, 15, 10, 12, 16), box(9, 13, 15, 10, 22, 16), box(9, 24, 15, 11, 26, 16), box(5, 24, 15, 7, 26, 16), box(5, 26, 15, 7, 28, 16), box(9, 26, 15, 11, 28, 16),
						box(7, 26, 15, 9, 29, 16), box(0, 26, 15, 5, 27, 16), box(11, 26, 15, 16, 27, 16), box(0, 10, 0, 16, 12, 15));
				case EAST -> Shapes.or(box(15, 0, 0, 16, 9, 1), box(15, 0, 15, 16, 9, 16), box(0, 0, 15, 1, 9, 16), box(0, 0, 0, 1, 9, 1), box(0, 9, 0, 16, 10, 16), box(0, 10, 0, 1, 26, 2), box(0, 10, 14, 1, 26, 16), box(0, 10, 7, 1, 26, 9),
						box(0, 13, 6, 1, 22, 7), box(0, 10, 6, 1, 12, 7), box(0, 10, 9, 1, 12, 10), box(0, 13, 9, 1, 22, 10), box(0, 24, 9, 1, 26, 11), box(0, 24, 5, 1, 26, 7), box(0, 26, 5, 1, 28, 7), box(0, 26, 9, 1, 28, 11),
						box(0, 26, 7, 1, 29, 9), box(0, 26, 0, 1, 27, 5), box(0, 26, 11, 1, 27, 16), box(1, 10, 0, 16, 12, 16));
				case WEST -> Shapes.or(box(0, 0, 15, 1, 9, 16), box(0, 0, 0, 1, 9, 1), box(15, 0, 0, 16, 9, 1), box(15, 0, 15, 16, 9, 16), box(0, 9, 0, 16, 10, 16), box(15, 10, 14, 16, 26, 16), box(15, 10, 0, 16, 26, 2), box(15, 10, 7, 16, 26, 9),
						box(15, 13, 9, 16, 22, 10), box(15, 10, 9, 16, 12, 10), box(15, 10, 6, 16, 12, 7), box(15, 13, 6, 16, 22, 7), box(15, 24, 5, 16, 26, 7), box(15, 24, 9, 16, 26, 11), box(15, 26, 9, 16, 28, 11), box(15, 26, 5, 16, 28, 7),
						box(15, 26, 7, 16, 29, 9), box(15, 26, 11, 16, 27, 16), box(15, 26, 0, 16, 27, 5), box(0, 10, 0, 15, 12, 16));
				default -> Shapes.or(box(15, 0, 15, 16, 9, 16), box(0, 0, 15, 1, 9, 16), box(0, 0, 0, 1, 9, 1), box(15, 0, 0, 16, 9, 1), box(0, 9, 0, 16, 10, 16), box(14, 10, 0, 16, 26, 1), box(0, 10, 0, 2, 26, 1), box(7, 10, 0, 9, 26, 1),
						box(9, 13, 0, 10, 22, 1), box(9, 10, 0, 10, 12, 1), box(6, 10, 0, 7, 12, 1), box(6, 13, 0, 7, 22, 1), box(5, 24, 0, 7, 26, 1), box(9, 24, 0, 11, 26, 1), box(9, 26, 0, 11, 28, 1), box(5, 26, 0, 7, 28, 1),
						box(7, 26, 0, 9, 29, 1), box(11, 26, 0, 16, 27, 1), box(0, 26, 0, 5, 27, 1), box(0, 10, 1, 16, 12, 16));
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
		return state.setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}
}