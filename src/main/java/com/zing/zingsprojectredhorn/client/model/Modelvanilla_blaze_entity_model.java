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
public class Modelvanilla_blaze_entity_model extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_project_red_horn", "modelvanilla_blaze_entity_model"), "main");
	public final ModelPart head;
	public final ModelPart stick1;
	public final ModelPart stick2;
	public final ModelPart stick3;
	public final ModelPart stick4;
	public final ModelPart stick5;
	public final ModelPart stick6;
	public final ModelPart stick7;
	public final ModelPart stick8;
	public final ModelPart stick9;
	public final ModelPart stick10;
	public final ModelPart stick11;
	public final ModelPart stick12;

	public Modelvanilla_blaze_entity_model(ModelPart root) {
		super(root);
		this.head = root.getChild("head");
		this.stick1 = root.getChild("stick1");
		this.stick2 = root.getChild("stick2");
		this.stick3 = root.getChild("stick3");
		this.stick4 = root.getChild("stick4");
		this.stick5 = root.getChild("stick5");
		this.stick6 = root.getChild("stick6");
		this.stick7 = root.getChild("stick7");
		this.stick8 = root.getChild("stick8");
		this.stick9 = root.getChild("stick9");
		this.stick10 = root.getChild("stick10");
		this.stick11 = root.getChild("stick11");
		this.stick12 = root.getChild("stick12");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition stick1 = partdefinition.addOrReplaceChild("stick1", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, -2.0F, -7.0F));
		PartDefinition stick2 = partdefinition.addOrReplaceChild("stick2", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, -2.0F, -7.0F));
		PartDefinition stick3 = partdefinition.addOrReplaceChild("stick3", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, -2.0F, 7.0F));
		PartDefinition stick4 = partdefinition.addOrReplaceChild("stick4", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, -2.0F, 7.0F));
		PartDefinition stick5 = partdefinition.addOrReplaceChild("stick5", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, -5.0F));
		PartDefinition stick6 = partdefinition.addOrReplaceChild("stick6", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, -5.0F));
		PartDefinition stick7 = partdefinition.addOrReplaceChild("stick7", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, 5.0F));
		PartDefinition stick8 = partdefinition.addOrReplaceChild("stick8", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 5.0F));
		PartDefinition stick9 = partdefinition.addOrReplaceChild("stick9", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 10.0F, -3.0F));
		PartDefinition stick10 = partdefinition.addOrReplaceChild("stick10", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 10.0F, -3.0F));
		PartDefinition stick11 = partdefinition.addOrReplaceChild("stick11", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 10.0F, 3.0F));
		PartDefinition stick12 = partdefinition.addOrReplaceChild("stick12", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 10.0F, 3.0F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
	}
}