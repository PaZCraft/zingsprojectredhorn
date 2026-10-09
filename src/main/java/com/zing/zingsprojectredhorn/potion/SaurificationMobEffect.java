package com.zing.zingsprojectredhorn.potion;

import net.neoforged.neoforge.common.NeoForgeMod;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.Identifier;

import com.zing.zingsprojectredhorn.ZingsProjectRedHornMod;

public class SaurificationMobEffect extends MobEffect {
	public SaurificationMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13369345);
		this.addAttributeModifier(Attributes.ARMOR_TOUGHNESS, Identifier.fromNamespaceAndPath(ZingsProjectRedHornMod.MODID, "effect.saurification_0"), 0.1, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, Identifier.fromNamespaceAndPath(ZingsProjectRedHornMod.MODID, "effect.saurification_1"), 0.05, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ATTACK_KNOCKBACK, Identifier.fromNamespaceAndPath(ZingsProjectRedHornMod.MODID, "effect.saurification_2"), 0.05, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.BLOCK_INTERACTION_RANGE, Identifier.fromNamespaceAndPath(ZingsProjectRedHornMod.MODID, "effect.saurification_3"), 0.05, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ENTITY_INTERACTION_RANGE, Identifier.fromNamespaceAndPath(ZingsProjectRedHornMod.MODID, "effect.saurification_4"), 0.05, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.JUMP_STRENGTH, Identifier.fromNamespaceAndPath(ZingsProjectRedHornMod.MODID, "effect.saurification_5"), 0.05, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.LUCK, Identifier.fromNamespaceAndPath(ZingsProjectRedHornMod.MODID, "effect.saurification_6"), 0.1, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.MAX_HEALTH, Identifier.fromNamespaceAndPath(ZingsProjectRedHornMod.MODID, "effect.saurification_7"), 0.1, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, Identifier.fromNamespaceAndPath(ZingsProjectRedHornMod.MODID, "effect.saurification_8"), 0.03, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.SNEAKING_SPEED, Identifier.fromNamespaceAndPath(ZingsProjectRedHornMod.MODID, "effect.saurification_9"), 0.05, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.STEP_HEIGHT, Identifier.fromNamespaceAndPath(ZingsProjectRedHornMod.MODID, "effect.saurification_10"), 0.1, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.SUBMERGED_MINING_SPEED, Identifier.fromNamespaceAndPath(ZingsProjectRedHornMod.MODID, "effect.saurification_11"), 0.15, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.FALL_DAMAGE_MULTIPLIER, Identifier.fromNamespaceAndPath(ZingsProjectRedHornMod.MODID, "effect.saurification_12"), -0.1, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.BLOCK_BREAK_SPEED, Identifier.fromNamespaceAndPath(ZingsProjectRedHornMod.MODID, "effect.saurification_13"), 0.1, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.MINING_EFFICIENCY, Identifier.fromNamespaceAndPath(ZingsProjectRedHornMod.MODID, "effect.saurification_14"), 0.1, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(NeoForgeMod.SWIM_SPEED, Identifier.fromNamespaceAndPath(ZingsProjectRedHornMod.MODID, "effect.saurification_15"), 0.05, AttributeModifier.Operation.ADD_VALUE);
	}
}