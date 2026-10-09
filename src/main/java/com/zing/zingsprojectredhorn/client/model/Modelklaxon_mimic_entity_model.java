package com.zing.zingsprojectredhorn.client.model;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelklaxon_mimic_entity_model extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_project_red_horn", "modelklaxon_mimic_entity_model"), "main");
	public final ModelPart body;
	public final ModelPart jaw;

	public Modelklaxon_mimic_entity_model(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.jaw = this.body.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -0.2F, -7.0F, 14.0F, 10.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(56, 14).addBox(-7.0F, -2.2F, -6.0F, 14.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(56, 14)
						.addBox(-7.0F, -2.2F, 6.0F, 14.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(56, 2).addBox(-6.0F, -2.2F, -6.0F, 0.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(56, 2)
						.addBox(6.0F, -2.2F, -6.0F, 0.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 14.2F, 0.0F));
		PartDefinition jaw = body.addOrReplaceChild("jaw",
				CubeListBuilder.create().texOffs(0, 24).addBox(-7.0F, -5.25F, -13.75F, 14.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(56, 18).addBox(-7.0F, -0.25F, -12.75F, 14.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(56, 18)
						.addBox(-7.0F, -0.25F, -0.75F, 14.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(56, 6).addBox(-6.0F, -0.25F, -12.75F, 0.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(56, 6)
						.addBox(6.0F, -0.25F, -12.75F, 0.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(56, 22).addBox(-2.0F, -1.25F, -14.75F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.05F, 6.75F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}