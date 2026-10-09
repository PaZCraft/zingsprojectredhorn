package com.zing.zingsprojectredhorn.client.renderer;

import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.IllusionerRenderer;
import net.minecraft.client.renderer.entity.state.IllusionerRenderState;
import net.minecraft.client.renderer.entity.state.VillagerRenderState;
import net.minecraft.client.renderer.entity.state.HoldingEntityRenderState;
import net.minecraft.client.renderer.entity.layers.CrossedArmsItemLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.npc.VillagerModel;
import net.minecraft.client.model.geom.ModelLayers;

import com.zing.zingsprojectredhorn.entity.MaskedIllusionerEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class MaskedIllusionerRenderer extends MobRenderer<MaskedIllusionerEntity, IllusionerRenderState> {
	private final Identifier entityTexture = Identifier.parse("zings_project_red_horn:textures/entities/masked_illusioner_mob.png");
	private Object itemModelResolver;

	public MaskedIllusionerRenderer(EntityRendererProvider.Context context) {
		super();
	}

	public IllusionerRenderState createRenderState() {
		return new IllusionerRenderState();
	}

	public void extractRenderState(MaskedIllusionerEntity entity, IllusionerRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		if (state instanceof HoldingEntityRenderState holdingState) {
			((Object) this.itemModelResolver).updateForLiving(holdingState.heldItem, entity.getMainHandItem(), ItemDisplayContext.GROUND, entity);
		}
	}

	public Identifier getTextureLocation(IllusionerRenderState state) {
		return entityTexture;
	}

	protected void scale(IllusionerRenderState state, PoseStack poseStack) {
		poseStack.scale(0.9375f, 0.9375f, 0.9375f);
	}
}