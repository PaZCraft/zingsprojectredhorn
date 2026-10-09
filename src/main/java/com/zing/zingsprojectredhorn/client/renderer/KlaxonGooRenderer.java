package com.zing.zingsprojectredhorn.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.SubmitNodeCollector;

import com.zing.zingsprojectredhorn.entity.KlaxonGooEntity;
import com.zing.zingsprojectredhorn.client.model.Modelklaxon_goop_entity_model;

import com.mojang.math.Axis;

import org.joml.Matrix4fc;

import com.mojang.blaze3d.vertex.PoseStack;

public class KlaxonGooRenderer extends EntityRenderer<KlaxonGooEntity, LivingEntityRenderState> {
	private static final Identifier texture = Identifier.parse("zings_project_red_horn:textures/entities/klaxon_goop_projectile.png");
	private final Modelklaxon_goop_entity_model model;

	public KlaxonGooRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelklaxon_goop_entity_model(context.bakeLayer(Modelklaxon_goop_entity_model.LAYER_LOCATION));
	}

	@Override
	public void submit(LivingEntityRenderState state, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, CameraRenderState camera) {
		poseStack.pushPose();
		poseStack.mulPose((Matrix4fc) Axis.YP.rotationDegrees(state.yRot - 90));
		poseStack.mulPose((Matrix4fc) Axis.ZP.rotationDegrees(90 + state.xRot));
		model.setupAnim(state);
		submitNodeCollector.submitModelPart(this.model, state, poseStack, texture, state.lightCoords, OverlayTexture.NO_OVERLAY, state.outlineColor, null);
		poseStack.popPose();
		super.submit(state, poseStack, submitNodeCollector, camera);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(KlaxonGooEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		state.xRot = entity.getXRot(partialTicks);
		state.yRot = entity.getYRot(partialTicks);
	}
}