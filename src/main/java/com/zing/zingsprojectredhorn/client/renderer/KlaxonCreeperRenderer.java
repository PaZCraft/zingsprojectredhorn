package net.mcreator.zingsprojectredhorn.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zingsprojectredhorn.entity.KlaxonCreeperEntity;
import net.mcreator.zingsprojectredhorn.client.model.Modelklaxon_creeper_entity_model;

import com.mojang.blaze3d.vertex.PoseStack;

public class KlaxonCreeperRenderer extends MobRenderer<KlaxonCreeperEntity, LivingEntityRenderState, Modelklaxon_creeper_entity_model> {
	private final Identifier entityTexture = Identifier.parse("zings_project_red_horn:textures/entities/klaxon_creeper_mob.png");

	public KlaxonCreeperRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelklaxon_creeper_entity_model(context.bakeLayer(Modelklaxon_creeper_entity_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(KlaxonCreeperEntity entity, LivingEntityRenderState state, float partialTicks) {
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