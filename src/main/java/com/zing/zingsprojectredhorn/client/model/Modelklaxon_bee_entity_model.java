package net.mcreator.zingsprojectredhorn.client.model;

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
public class Modelklaxon_bee_entity_model extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_project_red_horn", "modelklaxon_bee_entity_model"), "main");
	public final ModelPart torso;
	public final ModelPart core;
	public final ModelPart left_antenna;
	public final ModelPart right_antenna;
	public final ModelPart left_wing;
	public final ModelPart right_wing;
	public final ModelPart front_legs;
	public final ModelPart middle_legs;
	public final ModelPart back_legs;
	public final ModelPart stinger;

	public Modelklaxon_bee_entity_model(ModelPart root) {
		super(root);
		this.torso = root.getChild("torso");
		this.core = this.torso.getChild("core");
		this.left_antenna = root.getChild("left_antenna");
		this.right_antenna = root.getChild("right_antenna");
		this.left_wing = root.getChild("left_wing");
		this.right_wing = root.getChild("right_wing");
		this.front_legs = root.getChild("front_legs");
		this.middle_legs = root.getChild("middle_legs");
		this.back_legs = root.getChild("back_legs");
		this.stinger = root.getChild("stinger");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition torso = partdefinition.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -4.0F, -5.0F, 7.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.0F, 0.0F));
		PartDefinition core = torso.addOrReplaceChild("core", CubeListBuilder.create().texOffs(30, 21).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition left_antenna = partdefinition.addOrReplaceChild("left_antenna", CubeListBuilder.create().texOffs(2, 0).addBox(1.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 17.0F, -5.0F));
		PartDefinition right_antenna = partdefinition.addOrReplaceChild("right_antenna", CubeListBuilder.create().texOffs(2, 3).addBox(-2.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 17.0F, -5.0F));
		PartDefinition left_wing = partdefinition.addOrReplaceChild("left_wing", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(1.5F, 15.0F, -3.0F));
		PartDefinition right_wing = partdefinition.addOrReplaceChild("right_wing", CubeListBuilder.create().texOffs(0, 18).addBox(-9.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 15.0F, -3.0F));
		PartDefinition front_legs = partdefinition.addOrReplaceChild("front_legs", CubeListBuilder.create().texOffs(28, 1).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 22.0F, -2.0F));
		PartDefinition middle_legs = partdefinition.addOrReplaceChild("middle_legs", CubeListBuilder.create().texOffs(27, 3).addBox(-4.0F, 0.0F, 0.0F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 22.0F, 0.0F));
		PartDefinition back_legs = partdefinition.addOrReplaceChild("back_legs", CubeListBuilder.create().texOffs(27, 5).addBox(-4.0F, 0.0F, 0.0F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 22.0F, 2.0F));
		PartDefinition stinger = partdefinition.addOrReplaceChild("stinger", CubeListBuilder.create().texOffs(24, 7).addBox(0.0F, -1.0F, 5.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}