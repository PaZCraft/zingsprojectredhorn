/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.zing.zingsprojectredhorn.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import com.zing.zingsprojectredhorn.potion.ZeroTwosCurseMobEffect;
import com.zing.zingsprojectredhorn.potion.SaurificationMobEffect;
import com.zing.zingsprojectredhorn.potion.KlaxonBurningMobEffect;
import com.zing.zingsprojectredhorn.ZiNGsProjectRedHorn;

public class ZingsProjectRedHornModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, ZiNGsProjectRedHorn.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> ZERO_TWOS_CURSE = REGISTRY.register("zero_twos_curse", ZeroTwosCurseMobEffect::new);
	public static final DeferredHolder<MobEffect, MobEffect> KLAXON_BURNING = REGISTRY.register("klaxon_burning", KlaxonBurningMobEffect::new);
	public static final DeferredHolder<MobEffect, MobEffect> SAURIFICATION = REGISTRY.register("saurification", SaurificationMobEffect::new);
}