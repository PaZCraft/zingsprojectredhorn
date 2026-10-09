/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.zing.zingsprojectredhorn.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import com.zing.zingsprojectredhorn.ZingsProjectRedHornMod;

public class ZingsProjectRedHornModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, ZingsProjectRedHornMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> KLAXON_ORB_YELLOW = REGISTRY.register("klaxon_orb_yellow", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> KLAXON_ELECTRO = REGISTRY.register("klaxon_electro", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> KLAXON_ORB_BLUE = REGISTRY.register("klaxon_orb_blue", () -> new SimpleParticleType(false));
}