package net.mcreator.zingsprojectredhorn.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class EncasedBirdzingFeatherDecorationBlock extends Block {
	private static final VoxelShape SHAPE = Shapes.or(box(2, 0, 2, 14, 2, 14), box(1, 2, 1, 15, 3, 15), box(1, 3, 14, 2, 13, 15), box(1, 3, 1, 2, 13, 2), box(14, 3, 1, 15, 13, 2), box(14, 3, 14, 15, 13, 15), box(1, 13, 1, 15, 14, 15),
			box(15, 3, 2, 16, 13, 14), box(0, 3, 2, 1, 13, 14), box(2, 3, 0, 14, 13, 1), box(2, 3, 15, 14, 13, 16), box(7, 3, 7, 9, 4, 9));

	public EncasedBirdzingFeatherDecorationBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GLASS).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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