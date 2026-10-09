package net.mcreator.zingsprojectredhorn.client.renderer;

import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.VillagerRenderState;
import net.minecraft.client.renderer.entity.state.HoldingEntityRenderState;
import net.minecraft.client.renderer.entity.layers.CrossedArmsItemLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.npc.VillagerModel;
import net.minecraft.client.model.geom.ModelLayers;

import net.mcreator.zingsprojectredhorn.entity.MaskedIllusionerEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class MaskedIllusionerRenderer extends MobRenderer<MaskedIllusionerEntity, VillagerRenderState, VillagerModel> {
	private final Identifier entityTexture = Identifier.parse("zings_project_red_horn:textures/entities/masked_illusioner_mob.png");

	public MaskedIllusionerRenderer(EntityRendererProvider.Context context) {
		super(context, new VillagerModel(context.bakeLayer(ModelLayers.VILLAGER)), 0.5f);
		this.addLayer(new CrossedArmsItemLayer<>(this));
	}

	@Override
	public VillagerRenderState createRenderState() {
		return new VillagerRenderState();
	}

	@Override
	public void extractRenderState(MaskedIllusionerEntity entity, VillagerRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		if (state instanceof HoldingEntityRenderState holdingState) {
			this.itemModelResolver.updateForLiving(holdingState.heldItem, entity.getMainHandItem(), ItemDisplayContext.GROUND, entity);
		}
	}

	@Override
	public Identifier getTextureLocation(VillagerRenderState state) {
		return entityTexture;
	}

	@Override
	protected void scale(VillagerRenderState state, PoseStack poseStack) {
		poseStack.scale(0.9375f, 0.9375f, 0.9375f);
	}
}