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
public class Modelvanilla_frog_entity_model extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_project_red_horn", "modelvanilla_frog_entity_model"), "main");
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart eyes;
	public final ModelPart croaking_body;
	public final ModelPart tongue;
	public final ModelPart left_arm;
	public final ModelPart right_arm;
	public final ModelPart left_leg;
	public final ModelPart right_leg;

	public Modelvanilla_frog_entity_model(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.head = this.body.getChild("head");
		this.eyes = this.head.getChild("eyes");
		this.croaking_body = this.body.getChild("croaking_body");
		this.tongue = this.body.getChild("tongue");
		this.left_arm = this.body.getChild("left_arm");
		this.right_arm = this.body.getChild("right_arm");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(3, 1).addBox(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(23, 22).addBox(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 22.0F, 4.0F));
		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(23, 13).addBox(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 13).addBox(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -2.0F, -1.0F));
		PartDefinition eyes = head.addOrReplaceChild("eyes",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -4.0F, -8.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 5).addBox(1.0F, -4.0F, -8.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.5F, 0.0F, 2.0F));
		PartDefinition croaking_body = body.addOrReplaceChild("croaking_body", CubeListBuilder.create().texOffs(26, 5).addBox(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, -1.0F, -5.0F));
		PartDefinition tongue = body.addOrReplaceChild("tongue", CubeListBuilder.create().texOffs(17, 13).addBox(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.1F, 1.0F));
		PartDefinition left_arm = body.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(0, 32).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(18, 40).addBox(-4.0F, 3.01F, -5.0F, 8.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, -1.0F, -6.5F));
		PartDefinition right_arm = body.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(0, 38).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(2, 40).addBox(-4.0F, 3.01F, -5.0F, 8.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, -1.0F, -6.5F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(14, 25).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(2, 32).addBox(-2.0F, 3.01F, -4.0F, 8.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.5F, 21.0F, 4.0F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(0, 25).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(18, 32).addBox(-6.0F, 3.01F, -4.0F, 8.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.5F, 21.0F, 4.0F));
		return LayerDefinition.create(meshdefinition, 48, 48);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}