package net.mcreator.zingsprojectredhorn.client.renderer;

import net.neoforged.neoforge.client.renderstate.RegisterRenderStateModifiersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.util.context.ContextKey;
import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.animation.KeyframeAnimation;
import net.minecraft.client.animation.AnimationDefinition;

import net.mcreator.zingsprojectredhorn.entity.KlaxonZombieEntity;
import net.mcreator.zingsprojectredhorn.client.model.animations.klaxon_zombie_entity_modelAnimation;
import net.mcreator.zingsprojectredhorn.client.model.Modelklaxon_zombie_entity_model;

import java.util.Map;

import com.mojang.blaze3d.vertex.PoseStack;

public class KlaxonZombieRenderer extends MobRenderer<KlaxonZombieEntity, LivingEntityRenderState, Modelklaxon_zombie_entity_model> {
	private final Identifier entityTexture = Identifier.parse("zings_project_red_horn:textures/entities/klaxon_zombie_mob.png");

	public KlaxonZombieRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelklaxon_zombie_entity_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(KlaxonZombieEntity entity, LivingEntityRenderState state, float partialTicks) {
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

	private static final class AnimatedModel extends Modelklaxon_zombie_entity_model {
		private final KeyframeAnimation keyframeAnimation0;

		public AnimatedModel(ModelPart root) {
			super(root);
			this.keyframeAnimation0 = safeBake(klaxon_zombie_entity_modelAnimation.angry);
		}

		private KeyframeAnimation safeBake(AnimationDefinition source) {
			try {
				return source.bake(root);
			} catch (IllegalArgumentException e) {
				return new AnimationDefinition(0, false, Map.of()).bake(root);
			}
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			KlaxonZombieEntity entity = state.getRenderData(ENTITY_KEY);
			this.keyframeAnimation0.apply(entity.animationState0, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}

	public static final ContextKey<KlaxonZombieEntity> ENTITY_KEY = new ContextKey<>(Identifier.parse("zings_project_red_horn:klaxon_zombie_entity"));

	@EventBusSubscriber(Dist.CLIENT)
	public static class EntityStateAdder {
		@SubscribeEvent
		private static void registerRenderStateModifiersEvent(RegisterRenderStateModifiersEvent event) {
			event.registerEntityModifier(KlaxonZombieRenderer.class, (entity, state) -> state.setRenderData(ENTITY_KEY, entity));
		}
	}
}