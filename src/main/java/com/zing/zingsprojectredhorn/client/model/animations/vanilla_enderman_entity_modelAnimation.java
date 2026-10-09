package net.mcreator.zingsprojectredhorn.client.model.animations;

import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.AnimationChannel;

// Save this class in your mod and generate all required imports
/**
 * Made with Blockbench 4.12.5 Exported for Minecraft version 1.19 or later with
 * Mojang mappings
 * 
 * @author Author
 */
public class vanilla_enderman_entity_modelAnimation {
	public static final AnimationDefinition generic = AnimationDefinition.Builder.withLength(0.0F).build();
	public static final AnimationDefinition anger = AnimationDefinition.Builder.withLength(0.0F)
			.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 6.0F, 0.0F), AnimationChannel.Interpolations.LINEAR))).build();
}