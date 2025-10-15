// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package com.example.mod;
   
public class me:mreggen extends EntityModel<Entity> {
	private final ModelPart torso;
	private final ModelPart belly;
	private final ModelPart leftleg;
	private final ModelPart rightleg;
	private final ModelPart leftarm;
	private final ModelPart rightarm;
	private final ModelPart head;
	public me:mreggen(ModelPart root) {
		this.torso = root.getChild("torso");
		this.belly = root.getChild("belly");
		this.leftleg = root.getChild("leftleg");
		this.rightleg = root.getChild("rightleg");
		this.leftarm = root.getChild("leftarm");
		this.rightarm = root.getChild("rightarm");
		this.head = root.getChild("head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData torso = modelPartData.addChild("torso", ModelPartBuilder.create().uv(0, 0).cuboid(-12.0F, -23.0F, -12.0F, 24.0F, 17.0F, 24.0F, new Dilation(0.0F))
		.uv(0, 41).cuboid(-11.0F, -40.0F, -11.0F, 22.0F, 17.0F, 22.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 9.0F, 0.0F));

		ModelPartData belly = modelPartData.addChild("belly", ModelPartBuilder.create().uv(72, 80).cuboid(-10.0F, -10.0F, -5.0F, 20.0F, 18.0F, 3.0F, new Dilation(0.0F))
		.uv(88, 58).cuboid(-8.0F, -7.0F, -7.0F, 16.0F, 13.0F, 3.0F, new Dilation(0.0F))
		.uv(88, 41).cuboid(-9.0F, -8.0F, -6.0F, 18.0F, 15.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -7.0F, -8.0F));

		ModelPartData leftleg = modelPartData.addChild("leftleg", ModelPartBuilder.create().uv(114, 126).cuboid(-3.0F, 18.0F, -9.0F, 7.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(60, 124).cuboid(-3.0F, 17.0F, -5.0F, 7.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(-6.0F, 4.0F, 1.0F));

		ModelPartData cube_r1 = leftleg.addChild("cube_r1", ModelPartBuilder.create().uv(118, 85).cuboid(-4.0F, -5.0F, -4.0F, 7.0F, 8.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 14.0F, -1.0F, 0.0436F, 0.0F, 0.0F));

		ModelPartData thigh_r1 = leftleg.addChild("thigh_r1", ModelPartBuilder.create().uv(96, 23).cuboid(-9.0F, -9.0F, -1.0F, 7.0F, 11.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 7.0F, -4.0F, -0.0873F, 0.0F, 0.0F));

		ModelPartData rightleg = modelPartData.addChild("rightleg", ModelPartBuilder.create().uv(128, 60).cuboid(-4.0F, 18.0F, -7.0F, 7.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(86, 124).cuboid(-4.0F, 17.0F, -3.0F, 7.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(6.0F, 4.0F, -1.0F));

		ModelPartData cube_r2 = rightleg.addChild("cube_r2", ModelPartBuilder.create().uv(124, 23).cuboid(-4.0F, -5.0F, -4.0F, 7.0F, 8.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 14.0F, 1.0F, 0.0436F, 0.0F, 0.0F));

		ModelPartData thigh_r2 = rightleg.addChild("thigh_r2", ModelPartBuilder.create().uv(32, 115).cuboid(-9.0F, -9.0F, -1.0F, 7.0F, 11.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, 7.0F, -2.0F, -0.0873F, 0.0F, 0.0F));

		ModelPartData leftarm = modelPartData.addChild("leftarm", ModelPartBuilder.create(), ModelTransform.pivot(-15.0F, -29.0F, 0.0F));

		ModelPartData cube_r3 = leftarm.addChild("cube_r3", ModelPartBuilder.create().uv(72, 101).cuboid(-3.0F, -2.0F, -6.0F, 8.0F, 15.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0436F));

		ModelPartData upperarm_r1 = leftarm.addChild("upperarm_r1", ModelPartBuilder.create().uv(96, 0).cuboid(-7.0F, -2.0F, -5.0F, 8.0F, 15.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, 2.0F, 1.0F, -0.0873F, 0.0F, 0.0873F));

		ModelPartData rightarm = modelPartData.addChild("rightarm", ModelPartBuilder.create(), ModelTransform.pivot(15.0F, -29.0F, 0.0F));

		ModelPartData cube_r4 = rightarm.addChild("cube_r4", ModelPartBuilder.create().uv(104, 101).cuboid(-3.0F, -2.0F, -6.0F, 8.0F, 15.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 16.0F, 1.0F, 0.0F, 0.0F, -0.0436F));

		ModelPartData upperarm_r2 = rightarm.addChild("upperarm_r2", ModelPartBuilder.create().uv(0, 115).cuboid(-7.0F, -2.0F, -5.0F, 8.0F, 15.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, 2.0F, 1.0F, -0.0859F, -0.0151F, -0.0866F));

		ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create().uv(118, 74).cuboid(-4.0F, 8.0F, -4.0F, 8.0F, 3.0F, 8.0F, new Dilation(0.0F))
		.uv(0, 80).cuboid(-9.0F, -9.0F, -9.0F, 18.0F, 17.0F, 18.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -42.0F, 0.0F));
		return TexturedModelData.of(modelData, 256, 256);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		torso.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		belly.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		leftleg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		rightleg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		leftarm.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		rightarm.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		head.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}