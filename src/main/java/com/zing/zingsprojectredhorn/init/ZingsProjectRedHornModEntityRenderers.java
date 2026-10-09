/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.zing.zingsprojectredhorn.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.RaftRenderer;
import net.minecraft.client.renderer.entity.BoatRenderer;

import com.zing.zingsprojectredhorn.client.renderer.*;

@EventBusSubscriber(Dist.CLIENT)
public class ZingsProjectRedHornModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ZingsProjectRedHornModEntities.ZERO_TWO.get(), ZeroTwoRenderer::new);
		event.registerEntityRenderer(ZingsProjectRedHornModEntities.KLAXON_ZAPPER.get(), KlaxonZapperRenderer::new);
		event.registerEntityRenderer(ZingsProjectRedHornModEntities.HIRO.get(), HiroRenderer::new);
		event.registerEntityRenderer(ZingsProjectRedHornModEntities.PARASITE_ARROW_ENTITY.get(), ParasiteArrowEntityRenderer::new);
		event.registerEntityRenderer(ZingsProjectRedHornModEntities.MASKED_VINDICATOR.get(), MaskedVindicatorRenderer::new);
		event.registerEntityRenderer(ZingsProjectRedHornModEntities.MASKED_VILLAGER.get(), MaskedVillagerRenderer::new);
		event.registerEntityRenderer(ZingsProjectRedHornModEntities.MASKED_PILLAGER.get(), MaskedPillagerRenderer::new);
		event.registerEntityRenderer(ZingsProjectRedHornModEntities.MASKED_ILLUSIONER.get(), MaskedIllusionerRenderer::new);
		event.registerEntityRenderer(ZingsProjectRedHornModEntities.MEEKONI.get(), MeekoniRenderer::new);
		event.registerEntityRenderer(ZingsProjectRedHornModEntities.KLAXON_BIRDZING.get(), KlaxonBirdzingRenderer::new);
		event.registerEntityRenderer(ZingsProjectRedHornModEntities.KLAXON_GOO.get(), KlaxonGooRenderer::new);
		event.registerEntityRenderer(ZingsProjectRedHornModEntities.KLAXON_BEAM.get(), KlaxonBeamRenderer::new);
		event.registerEntityRenderer(ZingsProjectRedHornModEntities.KLAXON_CREEPER.get(), KlaxonCreeperRenderer::new);
		event.registerEntityRenderer(ZingsProjectRedHornModEntities.KLAXON_ZOMBIE.get(), KlaxonZombieRenderer::new);
		event.registerEntityRenderer(ZingsProjectRedHornModEntities.KLAXON_SPIDER.get(), KlaxonSpiderRenderer::new);
		event.registerEntityRenderer(ZingsProjectRedHornModEntities.KLAXON_SKELETON.get(), KlaxonSkeletonRenderer::new);
		event.registerEntityRenderer(ZingsProjectRedHornModEntities.SOULESS_ZERO_TWO.get(), SoulessZeroTwoRenderer::new);
		event.registerEntityRenderer(ZingsProjectRedHornModEntities.SOUL_OF_ZERO_TWO.get(), SoulOfZeroTwoRenderer::new);
		event.registerEntityRenderer(ZingsProjectRedHornModEntities.SOUL_OF_HIRO.get(), SoulOfHiroRenderer::new);
		event.registerEntityRenderer(ZingsProjectRedHornModEntities.SOULESS_HIRO.get(), SoulessHiroRenderer::new);
		event.registerEntityRenderer(ZingsProjectRedHornModEntities.ZERO_THREE.get(), ZeroThreeRenderer::new);
		event.registerEntityRenderer(ZingsProjectRedHornModEntities.ZERO_FOUR.get(), ZeroFourRenderer::new);
		event.registerEntityRenderer(ZingsProjectRedHornModEntities.ICHIGO.get(), IchigoRenderer::new);
		event.registerEntityRenderer(ZingsProjectRedHornModEntities.FERROROCK_WILLOW_BOAT.get(), context -> new BoatRenderer(context, ZingsProjectRedHornModModels.FERROROCK_WILLOW_BOAT_LAYER_LOCATION));
		event.registerEntityRenderer(ZingsProjectRedHornModEntities.FERROROCK_WILLOW_BOAT_WITH_CHEST.get(), context -> new BoatRenderer(context, ZingsProjectRedHornModModels.FERROROCK_WILLOW_BOAT_WITH_CHEST_LAYER_LOCATION));
		event.registerEntityRenderer(ZingsProjectRedHornModEntities.ZERO_PLATEA_RAFT.get(), context -> new RaftRenderer(context, ZingsProjectRedHornModModels.ZERO_PLATEA_RAFT_LAYER_LOCATION));
		event.registerEntityRenderer(ZingsProjectRedHornModEntities.ZERO_PLATEA_RAFT_WITH_CHEST.get(), context -> new RaftRenderer(context, ZingsProjectRedHornModModels.ZERO_PLATEA_RAFT_WITH_CHEST_LAYER_LOCATION));
	}
}