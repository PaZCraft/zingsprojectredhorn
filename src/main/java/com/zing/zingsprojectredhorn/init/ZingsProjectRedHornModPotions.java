/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zingsprojectredhorn.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

import net.mcreator.zingsprojectredhorn.ZingsProjectRedHornMod;

public class ZingsProjectRedHornModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, ZingsProjectRedHornMod.MODID);
	public static final DeferredHolder<Potion, Potion> KLAXON_TRANSFORMATION = REGISTRY.register("klaxon_transformation",
			() -> new Potion("klaxon_transformation", new MobEffectInstance(ZingsProjectRedHornModMobEffects.SAURIFICATION, 36000, 1, false, true)));
	public static final DeferredHolder<Potion, Potion> KLAXON_TRANSFORMATION_II = REGISTRY.register("klaxon_transformation_ii",
			() -> new Potion("klaxon_transformation_ii", new MobEffectInstance(ZingsProjectRedHornModMobEffects.SAURIFICATION, 36000, 2, false, true)));
	public static final DeferredHolder<Potion, Potion> KLAXON_TRANSFORMATION_III = REGISTRY.register("klaxon_transformation_iii",
			() -> new Potion("klaxon_transformation_iii", new MobEffectInstance(ZingsProjectRedHornModMobEffects.SAURIFICATION, 36000, 3, false, true)));
	public static final DeferredHolder<Potion, Potion> KLAXON_TRANSFORMATION_IV = REGISTRY.register("klaxon_transformation_iv",
			() -> new Potion("klaxon_transformation_iv", new MobEffectInstance(ZingsProjectRedHornModMobEffects.SAURIFICATION, 36000, 4, false, true)));
}