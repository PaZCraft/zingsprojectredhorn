package com.zing.zingsprojectredhorn.potion;

import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.consume_effects.RemoveStatusEffectsConsumeEffect;
import net.minecraft.world.item.consume_effects.ConsumeEffect;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.Items;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.component.DataComponents;

import com.zing.zingsprojectredhorn.procedures.ZeroTwosCurseOnEntityHurtProcedure;
import com.zing.zingsprojectredhorn.init.ZingsProjectRedHornModMobEffects;
import com.zing.zingsprojectredhorn.ZiNGsProjectRedHorn;
import java.util.List;
import java.util.ArrayList;

@EventBusSubscriber
public class ZeroTwosCurseMobEffect extends MobEffect {
	public ZeroTwosCurseMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16750900, mobEffectInstance -> ParticleTypes.DAMAGE_INDICATOR);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, Identifier.fromNamespaceAndPath(ZiNGsProjectRedHorn.MODID, "effect.zero_twos_curse_0"), 0.03, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.MAX_HEALTH, Identifier.fromNamespaceAndPath(ZiNGsProjectRedHorn.MODID, "effect.zero_twos_curse_1"), -0.03, AttributeModifier.Operation.ADD_VALUE);
	}

	@Override
	public void onMobHurt(ServerLevel level, LivingEntity entity, int amplifier, DamageSource damagesource, float damage) {
		ZeroTwosCurseOnEntityHurtProcedure.execute(level, entity.getX(), entity.getY(), entity.getZ());
	}

	@SubscribeEvent
	public static void modifyItemComponents(ModifyDefaultComponentsEvent event) {
		Consumable original = Consumables.HONEY_BOTTLE;
		List<ConsumeEffect> onConsumeEffects = new ArrayList<>(original.onConsumeEffects());
		onConsumeEffects.add(new RemoveStatusEffectsConsumeEffect(ZingsProjectRedHornModMobEffects.ZERO_TWOS_CURSE));
		Consumable replacementConsumable = new Consumable(original.consumeSeconds(), original.animation(), original.sound(), original.hasConsumeParticles(), onConsumeEffects);
		event.modify(Items.HONEY_BOTTLE, (builder, _, _) -> builder.set(DataComponents.CONSUMABLE, replacementConsumable));
	}
}