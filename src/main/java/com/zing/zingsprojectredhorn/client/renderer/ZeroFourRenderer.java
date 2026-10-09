package net.mcreator.zingsprojectredhorn.client.renderer;

import net.neoforged.neoforge.client.renderstate.RegisterRenderStateModifiersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.context.ContextKey;
import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ArmorModelSet;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.zingsprojectredhorn.procedures.ZeroTwoDisplayConditionProcedure;
import net.mcreator.zingsprojectredhorn.entity.ZeroFourEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class ZeroFourRenderer extends HumanoidMobRenderer<ZeroFourEntity, HumanoidRenderState, HumanoidModel<HumanoidRenderState>> {
	private final Identifier entityTexture = Identifier.parse("zings_project_red_horn:textures/entities/zero_four.png");

	public ZeroFourRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<HumanoidRenderState>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, ArmorModelSet.bake(ModelLayers.PLAYER_ARMOR, context.getModelSet(), HumanoidModel::new), context.getEquipmentRenderer()));
		this.addLayer(new RenderLayer<>(this) {
			final Identifier LAYER_TEXTURE = Identifier.parse("zings_project_red_horn:textures/entities/zero_two_eyes_angry.png");
			final RenderType RENDER_TYPE = RenderTypes.eyes(LAYER_TEXTURE);

			@Override
			public void submit(PoseStack poseStack, SubmitNodeCollector submitNodeCollector, int light, HumanoidRenderState state, float headYaw, float headPitch) {
				Entity entity = state.getRenderData(ENTITY_KEY);
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (ZeroTwoDisplayConditionProcedure.execute(entity)) {
					submitNodeCollector.submitModel(this.getParentModel(), state, poseStack, RENDER_TYPE, light, OverlayTexture.NO_OVERLAY, state.outlineColor, null);
				}
			}
		});
	}

	@Override
	public HumanoidRenderState createRenderState() {
		return new HumanoidRenderState();
	}

	@Override
	public void extractRenderState(ZeroFourEntity entity, HumanoidRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(HumanoidRenderState state) {
		return entityTexture;
	}

	@Override
	protected void scale(HumanoidRenderState state, PoseStack poseStack) {
		poseStack.scale(state.ageScale, state.ageScale, state.ageScale);
	}

	public static final ContextKey<ZeroFourEntity> ENTITY_KEY = new ContextKey<>(Identifier.parse("zings_project_red_horn:zero_four_entity"));

	@EventBusSubscriber(Dist.CLIENT)
	public static class EntityStateAdder {
		@SubscribeEvent
		private static void registerRenderStateModifiersEvent(RegisterRenderStateModifiersEvent event) {
			event.registerEntityModifier(ZeroFourRenderer.class, (entity, state) -> state.setRenderData(ENTITY_KEY, entity));
		}
	}
}