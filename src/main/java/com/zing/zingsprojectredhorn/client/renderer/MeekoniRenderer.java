package com.zing.zingsprojectredhorn.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.zing.zingsprojectredhorn.entity.MeekoniEntity;
import com.zing.zingsprojectredhorn.client.model.Modelmeekoni_entity_model;

import com.mojang.blaze3d.vertex.PoseStack;

public class MeekoniRenderer extends MobRenderer<MeekoniEntity, LivingEntityRenderState, Modelmeekoni_entity_model> {
	private final Identifier entityTexture = Identifier.parse("zings_project_red_horn:textures/entities/red_meekoni_mob.png");

	public MeekoniRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmeekoni_entity_model(context.bakeLayer(Modelmeekoni_entity_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(MeekoniEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(state.ageScale, state.ageScale, state.ageScale);
	}
}