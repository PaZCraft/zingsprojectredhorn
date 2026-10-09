/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zingsprojectredhorn.init;

import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.zingsprojectredhorn.client.particle.KlaxonOrbYellowParticle;
import net.mcreator.zingsprojectredhorn.client.particle.KlaxonOrbBlueParticle;
import net.mcreator.zingsprojectredhorn.client.particle.KlaxonElectroParticle;

@EventBusSubscriber(Dist.CLIENT)
public class ZingsProjectRedHornModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(ZingsProjectRedHornModParticleTypes.KLAXON_ORB_YELLOW.get(), KlaxonOrbYellowParticle::provider);
		event.registerSpriteSet(ZingsProjectRedHornModParticleTypes.KLAXON_ELECTRO.get(), KlaxonElectroParticle::provider);
		event.registerSpriteSet(ZingsProjectRedHornModParticleTypes.KLAXON_ORB_BLUE.get(), KlaxonOrbBlueParticle::provider);
	}
}