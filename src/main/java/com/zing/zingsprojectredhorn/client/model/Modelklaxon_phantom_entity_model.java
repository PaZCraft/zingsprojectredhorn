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
public class Modelklaxon_phantom_entity_model extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_project_red_horn", "modelklaxon_phantom_entity_model"), "main");
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart wing1;
	public final ModelPart wingtip1;
	public final ModelPart wing2;
	public final ModelPart wingtip2;
	public final ModelPart tail;
	public final ModelPart tail2;

	public Modelklaxon_phantom_entity_model(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.head = this.body.getChild("head");
		this.wing1 = this.body.getChild("wing1");
		this.wingtip1 = this.wing1.getChild("wingtip1");
		this.wing2 = this.body.getChild("wing2");
		this.wingtip2 = this.wing2.getChild("wingtip2");
		this.tail = this.body.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 31).addBox(-3.0F, -2.0F, -8.0F, 5.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 19.0F, 0.0F));
		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(28, 31).addBox(-4.0F, -2.0F, -5.0F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.25F, -8.0F));
		PartDefinition wing1 = body.addOrReplaceChild("wing1", CubeListBuilder.create().texOffs(0, 20).addBox(0.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -2.0F, -8.0F));
		PartDefinition wingtip1 = wing1.addOrReplaceChild("wingtip1", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 0.0F, 0.0F));
		PartDefinition wing2 = body.addOrReplaceChild("wing2", CubeListBuilder.create().texOffs(30, 20).addBox(-6.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -2.0F, -8.0F));
		PartDefinition wingtip2 = wing2.addOrReplaceChild("wingtip2", CubeListBuilder.create().texOffs(0, 10).addBox(-13.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 0.0F, 0.0F));
		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(28, 39).addBox(-2.0F, 0.0F, 0.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 1.0F));
		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 43).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.5F, 6.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
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