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
public class Modelklaxon_guardian_entity_model extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_project_red_horn", "modelklaxon_guardian_entity_model"), "main");
	public final ModelPart body;
	public final ModelPart fin;
	public final ModelPart tail;
	public final ModelPart spike1;
	public final ModelPart spike2;
	public final ModelPart spike3;

	public Modelklaxon_guardian_entity_model(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.fin = this.body.getChild("fin");
		this.tail = this.fin.getChild("tail");
		this.spike1 = this.body.getChild("spike1");
		this.spike2 = this.body.getChild("spike2");
		this.spike3 = this.body.getChild("spike3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -7.0F, -7.0F, 14.0F, 14.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 17.0F, 0.0F));
		PartDefinition fin = body.addOrReplaceChild("fin", CubeListBuilder.create().texOffs(0, 30).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, 7.0F));
		PartDefinition tail = fin.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(16, 30).addBox(0.0F, -4.0F, 0.0F, 0.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 6.0F));
		PartDefinition spike1 = body.addOrReplaceChild("spike1", CubeListBuilder.create().texOffs(28, 30).addBox(-1.0F, -14.0F, 0.0F, 2.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, 0.0F));
		PartDefinition spike2 = body.addOrReplaceChild("spike2", CubeListBuilder.create().texOffs(0, 28).addBox(-14.0F, -1.0F, 0.0F, 14.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, 0.0F, 0.0F));
		PartDefinition spike3 = body.addOrReplaceChild("spike3", CubeListBuilder.create().texOffs(28, 28).addBox(0.0F, -1.0F, 0.0F, 14.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, 0.0F, 0.0F));
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