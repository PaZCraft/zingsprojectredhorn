package net.mcreator.zingsprojectredhorn.potion;

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
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.component.DataComponents;

import net.mcreator.zingsprojectredhorn.init.ZingsProjectRedHornModMobEffects;
import net.mcreator.zingsprojectredhorn.ZingsProjectRedHornMod;

import java.util.List;
import java.util.ArrayList;

@EventBusSubscriber
public class KlaxonBurningMobEffect extends MobEffect {
	public KlaxonBurningMobEffect() {
		super(MobEffectCategory.HARMFUL, -16777165);
		this.withSoundOnAdded(BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("block.fire.extinguish")));
		this.addAttributeModifier(Attributes.ARMOR, Identifier.fromNamespaceAndPath(ZingsProjectRedHornMod.MODID, "effect.klaxon_burning_0"), -0.05, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ARMOR_TOUGHNESS, Identifier.fromNamespaceAndPath(ZingsProjectRedHornMod.MODID, "effect.klaxon_burning_1"), -0.05, AttributeModifier.Operation.ADD_VALUE);
	}

	@SubscribeEvent
	public static void modifyItemComponents(ModifyDefaultComponentsEvent event) {
		Consumable original = Consumables.HONEY_BOTTLE;
		List<ConsumeEffect> onConsumeEffects = new ArrayList<>(original.onConsumeEffects());
		onConsumeEffects.add(new RemoveStatusEffectsConsumeEffect(ZingsProjectRedHornModMobEffects.KLAXON_BURNING));
		Consumable replacementConsumable = new Consumable(original.consumeSeconds(), original.animation(), original.sound(), original.hasConsumeParticles(), onConsumeEffects);
		event.modify(Items.HONEY_BOTTLE, (builder, _, _) -> builder.set(DataComponents.CONSUMABLE, replacementConsumable));
	}
}