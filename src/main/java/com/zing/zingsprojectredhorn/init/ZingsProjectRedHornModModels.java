/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zingsprojectredhorn.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.resources.Identifier;
import net.minecraft.client.model.object.boat.RaftModel;
import net.minecraft.client.model.object.boat.BoatModel;
import net.minecraft.client.model.geom.ModelLayerLocation;

import net.mcreator.zingsprojectredhorn.client.model.*;

@EventBusSubscriber(Dist.CLIENT)
public class ZingsProjectRedHornModModels {
	public static final ModelLayerLocation FERROROCK_WILLOW_BOAT_LAYER_LOCATION = new ModelLayerLocation(Identifier.parse("zings_project_red_horn:boat/ferrorock_willow_boat"), "main");
	public static final ModelLayerLocation FERROROCK_WILLOW_BOAT_WITH_CHEST_LAYER_LOCATION = new ModelLayerLocation(Identifier.parse("zings_project_red_horn:chest_boat/ferrorock_willow_boat_with_chest"), "main");
	public static final ModelLayerLocation ZERO_PLATEA_RAFT_LAYER_LOCATION = new ModelLayerLocation(Identifier.parse("zings_project_red_horn:boat/zero_platea_raft"), "main");
	public static final ModelLayerLocation ZERO_PLATEA_RAFT_WITH_CHEST_LAYER_LOCATION = new ModelLayerLocation(Identifier.parse("zings_project_red_horn:chest_boat/zero_platea_raft_with_chest"), "main");

	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelvanilla_blaze_entity_model.LAYER_LOCATION, Modelvanilla_blaze_entity_model::createBodyLayer);
		event.registerLayerDefinition(Modelklaxon_skeleton_entity_model.LAYER_LOCATION, Modelklaxon_skeleton_entity_model::createBodyLayer);
		event.registerLayerDefinition(Modelvanilla_enderman_entity_model.LAYER_LOCATION, Modelvanilla_enderman_entity_model::createBodyLayer);
		event.registerLayerDefinition(Modelklaxon_vex_entity_model.LAYER_LOCATION, Modelklaxon_vex_entity_model::createBodyLayer);
		event.registerLayerDefinition(Modelklaxon_goop_entity_model.LAYER_LOCATION, Modelklaxon_goop_entity_model::createBodyLayer);
		event.registerLayerDefinition(Modelklaxon_phantom_entity_model.LAYER_LOCATION, Modelklaxon_phantom_entity_model::createBodyLayer);
		event.registerLayerDefinition(Modelklaxon_birdzing_entity_model.LAYER_LOCATION, Modelklaxon_birdzing_entity_model::createBodyLayer);
		event.registerLayerDefinition(Modelklaxon_shulker_entity_model.LAYER_LOCATION, Modelklaxon_shulker_entity_model::createBodyLayer);
		event.registerLayerDefinition(Modelklaxon_squid_entity_model.LAYER_LOCATION, Modelklaxon_squid_entity_model::createBodyLayer);
		event.registerLayerDefinition(Modelklaxon_guardian_entity_model.LAYER_LOCATION, Modelklaxon_guardian_entity_model::createBodyLayer);
		event.registerLayerDefinition(Modelvanilla_frog_entity_model.LAYER_LOCATION, Modelvanilla_frog_entity_model::createBodyLayer);
		event.registerLayerDefinition(Modelvanilla_rabbit_entity_model.LAYER_LOCATION, Modelvanilla_rabbit_entity_model::createBodyLayer);
		event.registerLayerDefinition(Modelmeekoni_entity_model.LAYER_LOCATION, Modelmeekoni_entity_model::createBodyLayer);
		event.registerLayerDefinition(Modelvanilla_iron_golem_entity_model.LAYER_LOCATION, Modelvanilla_iron_golem_entity_model::createBodyLayer);
		event.registerLayerDefinition(Modelklaxon_creaking_entity_model.LAYER_LOCATION, Modelklaxon_creaking_entity_model::createBodyLayer);
		event.registerLayerDefinition(Modelklaxon_zapper_entity_model.LAYER_LOCATION, Modelklaxon_zapper_entity_model::createBodyLayer);
		event.registerLayerDefinition(Modelklaxon_bee_entity_model.LAYER_LOCATION, Modelklaxon_bee_entity_model::createBodyLayer);
		event.registerLayerDefinition(Modelklaxon_thing_entity_model.LAYER_LOCATION, Modelklaxon_thing_entity_model::createBodyLayer);
		event.registerLayerDefinition(Modelparasite_arrow_entity_model.LAYER_LOCATION, Modelparasite_arrow_entity_model::createBodyLayer);
		event.registerLayerDefinition(Modelvanilla_elder_guardian_entity_model.LAYER_LOCATION, Modelvanilla_elder_guardian_entity_model::createBodyLayer);
		event.registerLayerDefinition(Modelvanilla_mooshroom_entity_model.LAYER_LOCATION, Modelvanilla_mooshroom_entity_model::createBodyLayer);
		event.registerLayerDefinition(Modelklaxon_mimic_entity_model.LAYER_LOCATION, Modelklaxon_mimic_entity_model::createBodyLayer);
		event.registerLayerDefinition(Modelonium_helmet.LAYER_LOCATION, Modelonium_helmet::createBodyLayer);
		event.registerLayerDefinition(Modelklaxon_beam_entity_model.LAYER_LOCATION, Modelklaxon_beam_entity_model::createBodyLayer);
		event.registerLayerDefinition(Modelklaxon_creeper_entity_model.LAYER_LOCATION, Modelklaxon_creeper_entity_model::createBodyLayer);
		event.registerLayerDefinition(Modelvanilla_wither_entity_model.LAYER_LOCATION, Modelvanilla_wither_entity_model::createBodyLayer);
		event.registerLayerDefinition(Modelklaxon_spider_entity_model.LAYER_LOCATION, Modelklaxon_spider_entity_model::createBodyLayer);
		event.registerLayerDefinition(Modelvirm_bullet_entity_model.LAYER_LOCATION, Modelvirm_bullet_entity_model::createBodyLayer);
		event.registerLayerDefinition(Modelklaxon_zombie_entity_model.LAYER_LOCATION, Modelklaxon_zombie_entity_model::createBodyLayer);
		event.registerLayerDefinition(Modeldroid_spider_entity_model.LAYER_LOCATION, Modeldroid_spider_entity_model::createBodyLayer);
		event.registerLayerDefinition(Modelvanilla_wolf_entity_model.LAYER_LOCATION, Modelvanilla_wolf_entity_model::createBodyLayer);
		event.registerLayerDefinition(FERROROCK_WILLOW_BOAT_LAYER_LOCATION, BoatModel::createBoatModel);
		event.registerLayerDefinition(FERROROCK_WILLOW_BOAT_WITH_CHEST_LAYER_LOCATION, BoatModel::createChestBoatModel);
		event.registerLayerDefinition(ZERO_PLATEA_RAFT_LAYER_LOCATION, RaftModel::createRaftModel);
		event.registerLayerDefinition(ZERO_PLATEA_RAFT_WITH_CHEST_LAYER_LOCATION, RaftModel::createChestRaftModel);
	}
}