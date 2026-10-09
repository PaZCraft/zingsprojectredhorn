/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zingsprojectredhorn.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.zingsprojectredhorn.potion.ZeroTwosCurseMobEffect;
import net.mcreator.zingsprojectredhorn.potion.SaurificationMobEffect;
import net.mcreator.zingsprojectredhorn.potion.KlaxonBurningMobEffect;
import net.mcreator.zingsprojectredhorn.ZingsProjectRedHornMod;

public class ZingsProjectRedHornModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, ZingsProjectRedHornMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> ZERO_TWOS_CURSE = REGISTRY.register("zero_twos_curse", ZeroTwosCurseMobEffect::new);
	public static final DeferredHolder<MobEffect, MobEffect> KLAXON_BURNING = REGISTRY.register("klaxon_burning", KlaxonBurningMobEffect::new);
	public static final DeferredHolder<MobEffect, MobEffect> SAURIFICATION = REGISTRY.register("saurification", SaurificationMobEffect::new);
}