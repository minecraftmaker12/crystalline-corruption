// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelcreepercrystal extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r3;

	public Modelcreepercrystal() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 6.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 6.0F, 0.0F);
		body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(2.0F, 18.0F, 4.0F);
		leg1.setTextureOffset(0, 16).addBox(-6.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-2.0F, 18.0F, 4.0F);
		leg2.setTextureOffset(0, 16).addBox(2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(2.0F, 18.0F, -4.0F);
		leg3.setTextureOffset(0, 16).addBox(-6.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(-2.0F, 18.0F, -4.0F);
		leg4.setTextureOffset(0, 16).addBox(2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(0, -1).addBox(2.0F, -31.0F, 0.0F, 0.0F, 5.0F, 4.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
		cube_r1.setTextureOffset(0, -1).addBox(2.0F, -31.0F, -4.0F, 0.0F, 5.0F, 4.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(10.0F, 23.0F, 6.0F);
		setRotationAngle(bone2, 0.3491F, 0.5672F, -0.4363F);
		bone2.setTextureOffset(0, -1).addBox(2.0F, -31.0F, 0.0F, 0.0F, 5.0F, 4.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -1.5708F, 0.0F);
		cube_r2.setTextureOffset(0, -1).addBox(2.0F, -31.0F, -4.0F, 0.0F, 5.0F, 4.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(20.0F, -2.0F, 2.0F);
		setRotationAngle(bone3, 0.0F, 2.2689F, -2.0944F);
		bone3.setTextureOffset(0, -1).addBox(2.0F, -31.0F, 0.0F, 0.0F, 5.0F, 4.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -1.5708F, 0.0F);
		cube_r3.setTextureOffset(0, -1).addBox(2.0F, -31.0F, -4.0F, 0.0F, 5.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leg1.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leg3.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leg4.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bone3.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}