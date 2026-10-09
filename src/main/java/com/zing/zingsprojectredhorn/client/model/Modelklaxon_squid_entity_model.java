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
public class Modelklaxon_squid_entity_model extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_project_red_horn", "modelklaxon_squid_entity_model"), "main");
	public final ModelPart body;
	public final ModelPart tentacle1;
	public final ModelPart tentacle3;
	public final ModelPart tentacle5;
	public final ModelPart tentacle7;

	public Modelklaxon_squid_entity_model(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.tentacle1 = root.getChild("tentacle1");
		this.tentacle3 = root.getChild("tentacle3");
		this.tentacle5 = root.getChild("tentacle5");
		this.tentacle7 = root.getChild("tentacle7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -8.0F, -6.0F, 12.0F, 16.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
				.addBox(5.0F, -20.0F, -1.0F, 1.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 14).addBox(-6.0F, -20.0F, -1.0F, 1.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 0.0F));
		PartDefinition tentacle1 = partdefinition.addOrReplaceChild("tentacle1", CubeListBuilder.create().texOffs(20, 28).addBox(-4.0F, 0.0F, -1.0F, 7.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 6.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition tentacle3 = partdefinition.addOrReplaceChild("tentacle3", CubeListBuilder.create().texOffs(38, 28).addBox(-3.0F, 0.0F, -1.0F, 7.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, 5.0F));
		PartDefinition tentacle5 = partdefinition.addOrReplaceChild("tentacle5", CubeListBuilder.create().texOffs(0, 28).addBox(-4.0F, 0.0F, -1.0F, 8.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 6.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition tentacle7 = partdefinition.addOrReplaceChild("tentacle7", CubeListBuilder.create().texOffs(0, 48).addBox(-3.0F, 0.0F, -1.0F, 6.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, -5.0F, 0.0F, 3.1416F, 0.0F));
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