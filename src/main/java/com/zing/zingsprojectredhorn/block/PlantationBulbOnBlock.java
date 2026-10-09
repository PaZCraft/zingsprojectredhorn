package com.zing.zingsprojectredhorn.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.redstone.Orientation;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import com.zing.zingsprojectredhorn.procedures.PlantationBulbOnRedstoneOffProcedure;
import com.zing.zingsprojectredhorn.init.ZingsProjectRedHornModBlocks;

import javax.annotation.Nullable;

import java.util.function.Function;
import java.util.function.Consumer;

public class PlantationBulbOnBlock extends Block {
	public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.AXIS;
	private final Function<BlockState, VoxelShape> shapes = this.makeShapes();

	public PlantationBulbOnBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.LANTERN).strength(1f, 10f).lightLevel(blockstate -> 15).noOcclusion().postProcess((bs, br, bp) -> bp).emissiveRendering((bs, br, bp) -> true).isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(AXIS, Direction.Axis.Y));
	}

	private Function<BlockState, VoxelShape> makeShapes() {
		return this.getShapeForEachState(state -> {
			return switch (state.getValue(AXIS)) {
				case X -> Shapes.or(box(0, 8, 8, 4, 9, 9), box(4, 6, 6, 8, 11, 11), box(8, 7, 7, 9, 10, 10), box(3, 7, 7, 4, 10, 10));
				case Y -> Shapes.or(box(8, 0, 8, 9, 4, 9), box(6, 4, 6, 11, 8, 11), box(7, 8, 7, 10, 9, 10), box(7, 3, 7, 10, 4, 10));
				case Z -> Shapes.or(box(8, 8, 12, 9, 9, 16), box(6, 6, 8, 11, 11, 12), box(7, 7, 7, 10, 10, 8), box(7, 7, 12, 10, 10, 13));
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
		builder.add(AXIS);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		BlockState state = super.getStateForPlacement(context);
		if (state == null)
			return null;
		return state.setValue(AXIS, context.getClickedFace().getAxis());
	}

	@Override
	public BlockState rotate(BlockState state, Rotation rot) {
		return RotatedPillarBlock.rotatePillar(state, rot);
	}

	@Override
	public boolean canConnectRedstone(BlockState state, BlockGetter world, BlockPos pos, Direction side) {
		return true;
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, @Nullable Orientation orientation, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, orientation, moving);
		if (world.getBestNeighborSignal(pos) > 0) {
		} else {
			PlantationBulbOnRedstoneOffProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		}
	}

	public static class Item extends BlockItem {
		public Item(Item.Properties properties) {
			super(ZingsProjectRedHornModBlocks.PLANTATION_BULB_ON.get(), properties);
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
			componentConsumer.accept(Component.translatable("block.zings_project_red_horn.plantation_bulb_on.description_0"));
		}
	}
}