package defense.client.model.missile;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelClusterMissile extends ModelMissileBase
{
    // fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape2a;
    ModelRenderer Shape2b;
    ModelRenderer Shape2c;
    ModelRenderer Shape3a;
    ModelRenderer Shape3;
    ModelRenderer Shape3b;
    ModelRenderer Shape3c;
    ModelRenderer Shape4;
    ModelRenderer Shape4a;
    ModelRenderer Shape4b;
    ModelRenderer Shape4c;
    ModelRenderer Shape5a;
    ModelRenderer Shape5;
    ModelRenderer Shape4d;
    ModelRenderer Shape4e;
    ModelRenderer Shape4f;
    ModelRenderer Shape4g;
    ModelRenderer Shape6;
    ModelRenderer Shape6a;
    ModelRenderer Shape7;
    ModelRenderer Shape7a;
    ModelRenderer Shape7b;
    ModelRenderer Shape7c;
    ModelRenderer Shape7d;
    ModelRenderer Shape7e;
    ModelRenderer Shape7f;
    ModelRenderer Shape7g;
    ModelRenderer Shape8a;
    ModelRenderer Shape8;

    public ModelClusterMissile()
    {
        textureWidth = 128;
        textureHeight = 128;

        Shape1 = new ModelRenderer(this, 0, 0);
        Shape1.addBox(-4F, 0F, -4F, 8, 64, 8);
        Shape1.setRotationPoint(0F, -40F, 0F);
        Shape1.setTextureSize(128, 128);
        Shape1.mirror = true;
        setRotation(Shape1, 0F, 0F, 0F);
        Shape2 = new ModelRenderer(this, 62, 48);
        Shape2.addBox(0F, 0F, 0F, 14, 10, 1);
        Shape2.setRotationPoint(-7F, 14F, 6F);
        Shape2.setTextureSize(128, 128);
        Shape2.mirror = true;
        setRotation(Shape2, 0F, 0F, 0F);
        Shape2a = new ModelRenderer(this, 62, 48);
        Shape2a.addBox(0F, 0F, 0F, 14, 10, 1);
        Shape2a.setRotationPoint(-7F, 14F, -7F);
        Shape2a.setTextureSize(128, 128);
        Shape2a.mirror = true;
        setRotation(Shape2a, 0F, 0F, 0F);
        Shape2b = new ModelRenderer(this, 34, 48);
        Shape2b.addBox(0F, 0F, 0F, 1, 10, 12);
        Shape2b.setRotationPoint(-7F, 14F, -6F);
        Shape2b.setTextureSize(128, 128);
        Shape2b.mirror = true;
        setRotation(Shape2b, 0F, 0F, 0F);
        Shape2c = new ModelRenderer(this, 34, 48);
        Shape2c.addBox(0F, 0F, 0F, 1, 10, 12);
        Shape2c.setRotationPoint(6F, 14F, -6F);
        Shape2c.setTextureSize(128, 128);
        Shape2c.mirror = true;
        setRotation(Shape2c, 0F, 0F, 0F);
        Shape3a = new ModelRenderer(this, 34, 33);
        Shape3a.addBox(-11F, 0F, -1F, 22, 12, 2);
        Shape3a.setRotationPoint(0F, 12F, 0F);
        Shape3a.setTextureSize(128, 128);
        Shape3a.mirror = true;
        setRotation(Shape3a, 0F, 0.7853982F, 0F);
        Shape3 = new ModelRenderer(this, 34, 33);
        Shape3.addBox(-11F, 0F, -1F, 22, 12, 2);
        Shape3.setRotationPoint(0F, 12F, 0F);
        Shape3.setTextureSize(128, 128);
        Shape3.mirror = true;
        setRotation(Shape3, 0F, -0.7853982F, 0F);
        Shape3b = new ModelRenderer(this, 34, 13);
        Shape3b.addBox(-8F, -8F, -1F, 16, 16, 2);
        Shape3b.setRotationPoint(0F, 12F, 0F);
        Shape3b.setTextureSize(128, 128);
        Shape3b.mirror = true;
        setRotation(Shape3b, 0F, 0.7853982F, 0.7853982F);
        Shape3c = new ModelRenderer(this, 34, 13);
        Shape3c.addBox(-8F, -8F, -1F, 16, 16, 2);
        Shape3c.setRotationPoint(0F, 12F, 0F);
        Shape3c.setTextureSize(128, 128);
        Shape3c.mirror = true;
        setRotation(Shape3c, 0F, -0.7853982F, 0.7853982F);
        Shape4 = new ModelRenderer(this, 16, 114);
        Shape4.addBox(0F, 0F, 0F, 2, 7, 5);
        Shape4.setRotationPoint(-1F, -23F, 4F);
        Shape4.setTextureSize(128, 128);
        Shape4.mirror = true;
        setRotation(Shape4, -0.5235988F, 0F, 0F);
        Shape4a = new ModelRenderer(this, 0, 114);
        Shape4a.addBox(0F, 0F, 0F, 5, 8, 2);
        Shape4a.setRotationPoint(4F, -23F, -1F);
        Shape4a.setTextureSize(128, 128);
        Shape4a.mirror = true;
        setRotation(Shape4a, 0F, 0F, 0.5235988F);
        Shape4b = new ModelRenderer(this, 15, 104);
        Shape4b.addBox(-1F, 0F, 0F, 2, 4, 5);
        Shape4b.setRotationPoint(0F, -35F, -4F);
        Shape4b.setTextureSize(128, 128);
        Shape4b.mirror = true;
        setRotation(Shape4b, -0.5235988F, 3.141593F, 0F);
        Shape4c = new ModelRenderer(this, 0, 114);
        Shape4c.addBox(0F, 0F, -1F, 5, 8, 2);
        Shape4c.setRotationPoint(-4F, -23F, 0F);
        Shape4c.setTextureSize(128, 128);
        Shape4c.mirror = true;
        setRotation(Shape4c, 0F, 3.141593F, 0.5235988F);
        Shape5a = new ModelRenderer(this, 0, 74);
        Shape5a.addBox(-1F, 0F, -8F, 2, 12, 16);
        Shape5a.setRotationPoint(0F, -32F, 0F);
        Shape5a.setTextureSize(128, 128);
        Shape5a.mirror = true;
        setRotation(Shape5a, 0F, 0F, 0F);
        Shape5 = new ModelRenderer(this, 0, 74);
        Shape5.addBox(-1F, 0F, -8F, 2, 12, 16);
        Shape5.setRotationPoint(0F, -32F, 0F);
        Shape5.setTextureSize(128, 128);
        Shape5.mirror = true;
        setRotation(Shape5, 0F, 1.570796F, 0F);
        Shape4d = new ModelRenderer(this, 16, 114);
        Shape4d.addBox(-1F, 0F, 0F, 2, 8, 5);
        Shape4d.setRotationPoint(0F, -23F, -4F);
        Shape4d.setTextureSize(128, 128);
        Shape4d.mirror = true;
        setRotation(Shape4d, -0.5235988F, 3.141593F, 0F);
        Shape4e = new ModelRenderer(this, 15, 104);
        Shape4e.addBox(-1F, 0F, 0F, 2, 4, 5);
        Shape4e.setRotationPoint(0F, -35F, 4F);
        Shape4e.setTextureSize(128, 128);
        Shape4e.mirror = true;
        setRotation(Shape4e, -0.5235988F, 0F, 0F);
        Shape4f = new ModelRenderer(this, 0, 104);
        Shape4f.addBox(0F, 0F, -1F, 5, 4, 2);
        Shape4f.setRotationPoint(-4F, -35F, 0F);
        Shape4f.setTextureSize(128, 128);
        Shape4f.mirror = true;
        setRotation(Shape4f, 0F, 3.141593F, 0.5235988F);
        Shape4g = new ModelRenderer(this, 0, 104);
        Shape4g.addBox(0F, 0F, 0F, 5, 4, 2);
        Shape4g.setRotationPoint(4F, -35F, -1F);
        Shape4g.setTextureSize(128, 128);
        Shape4g.mirror = true;
        setRotation(Shape4g, 0F, 0F, 0.5235988F);
        Shape6 = new ModelRenderer(this, 34, 0);
        Shape6.addBox(0F, 0F, 0F, 10, 1, 10);
        Shape6.setRotationPoint(-5F, -37F, -5F);
        Shape6.setTextureSize(128, 128);
        Shape6.mirror = true;
        setRotation(Shape6, 0F, 0F, 0F);
        Shape6a = new ModelRenderer(this, 34, 0);
        Shape6a.addBox(0F, 0F, 0F, 10, 1, 10);
        Shape6a.setRotationPoint(-5F, -41F, -5F);
        Shape6a.setTextureSize(128, 128);
        Shape6a.mirror = true;
        setRotation(Shape6a, 0F, 0F, 0F);
        Shape7 = new ModelRenderer(this, 39, 74);
        Shape7.addBox(0F, 0F, 0F, 6, 22, 6);
        Shape7.setRotationPoint(-3F, 2F, 4F);
        Shape7.setTextureSize(128, 128);
        Shape7.mirror = true;
        setRotation(Shape7, 0F, 0F, 0F);
        Shape7a = new ModelRenderer(this, 65, 74);
        Shape7a.addBox(0F, 0F, 0F, 4, 4, 4);
        Shape7a.setRotationPoint(-2F, -2F, 5F);
        Shape7a.setTextureSize(128, 128);
        Shape7a.mirror = true;
        setRotation(Shape7a, 0F, 0F, 0F);
        Shape7b = new ModelRenderer(this, 65, 74);
        Shape7b.addBox(0F, 0F, 0F, 4, 4, 4);
        Shape7b.setRotationPoint(-2F, -2F, -9F);
        Shape7b.setTextureSize(128, 128);
        Shape7b.mirror = true;
        setRotation(Shape7b, 0F, 0F, 0F);
        Shape7c = new ModelRenderer(this, 39, 74);
        Shape7c.addBox(0F, 0F, 0F, 6, 22, 6);
        Shape7c.setRotationPoint(-3F, 2F, -10F);
        Shape7c.setTextureSize(128, 128);
        Shape7c.mirror = true;
        setRotation(Shape7c, 0F, 0F, 0F);
        Shape7d = new ModelRenderer(this, 65, 74);
        Shape7d.addBox(0F, 0F, 0F, 4, 4, 4);
        Shape7d.setRotationPoint(-9F, -2F, -2F);
        Shape7d.setTextureSize(128, 128);
        Shape7d.mirror = true;
        setRotation(Shape7d, 0F, 0F, 0F);
        Shape7e = new ModelRenderer(this, 39, 74);
        Shape7e.addBox(0F, 0F, 0F, 6, 22, 6);
        Shape7e.setRotationPoint(-10F, 2F, -3F);
        Shape7e.setTextureSize(128, 128);
        Shape7e.mirror = true;
        setRotation(Shape7e, 0F, 0F, 0F);
        Shape7f = new ModelRenderer(this, 65, 74);
        Shape7f.addBox(0F, 0F, 0F, 4, 4, 4);
        Shape7f.setRotationPoint(5F, -2F, -2F);
        Shape7f.setTextureSize(128, 128);
        Shape7f.mirror = true;
        setRotation(Shape7f, 0F, 0F, 0F);
        Shape7g = new ModelRenderer(this, 39, 74);
        Shape7g.addBox(0F, 0F, 0F, 6, 22, 6);
        Shape7g.setRotationPoint(4F, 2F, -3F);
        Shape7g.setTextureSize(128, 128);
        Shape7g.mirror = true;
        setRotation(Shape7g, 0F, 0F, 0F);
        Shape8a = new ModelRenderer(this, 78, 0);
        Shape8a.addBox(0F, 0F, 0F, 8, 5, 8);
        Shape8a.setRotationPoint(-4F, -46F, -4F);
        Shape8a.setTextureSize(128, 128);
        Shape8a.mirror = true;
        setRotation(Shape8a, 0F, 0F, 0F);
        Shape8 = new ModelRenderer(this, 78, 15);
        Shape8.addBox(0F, 0F, 0F, 6, 2, 6);
        Shape8.setRotationPoint(-3F, -48F, -3F);
        Shape8.setTextureSize(128, 128);
        Shape8.mirror = true;
        setRotation(Shape8, 0F, 0F, 0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

        this.render(f5);
    }

    @Override
    public void render(float f5)
    {
        Shape1.render(f5);
        Shape2.render(f5);
        Shape2a.render(f5);
        Shape2b.render(f5);
        Shape2c.render(f5);
        Shape3a.render(f5);
        Shape3.render(f5);
        Shape3b.render(f5);
        Shape3c.render(f5);
        Shape4.render(f5);
        Shape4a.render(f5);
        Shape4b.render(f5);
        Shape4c.render(f5);
        Shape5a.render(f5);
        Shape5.render(f5);
        Shape4d.render(f5);
        Shape4e.render(f5);
        Shape4f.render(f5);
        Shape4g.render(f5);
        Shape6.render(f5);
        Shape6a.render(f5);
        Shape7.render(f5);
        Shape7a.render(f5);
        Shape7b.render(f5);
        Shape7c.render(f5);
        Shape7d.render(f5);
        Shape7e.render(f5);
        Shape7f.render(f5);
        Shape7g.render(f5);
        Shape8a.render(f5);
        Shape8.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
