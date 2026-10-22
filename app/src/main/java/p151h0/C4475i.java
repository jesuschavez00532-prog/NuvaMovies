package p151h0;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: h0.i */
/* loaded from: classes.dex */
class C4475i extends Property {

    /* renamed from: a */
    private final Property f19368a;

    /* renamed from: b */
    private final PathMeasure f19369b;

    /* renamed from: c */
    private final float f19370c;

    /* renamed from: d */
    private final float[] f19371d;

    /* renamed from: e */
    private final PointF f19372e;

    /* renamed from: f */
    private float f19373f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4475i(Property property, Path path) {
        super(Float.class, property.getName());
        this.f19371d = new float[2];
        this.f19372e = new PointF();
        this.f19368a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f19369b = pathMeasure;
        this.f19370c = pathMeasure.getLength();
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(Object obj) {
        return Float.valueOf(this.f19373f);
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(Object obj, Float f10) {
        this.f19373f = f10.floatValue();
        this.f19369b.getPosTan(this.f19370c * f10.floatValue(), this.f19371d, null);
        PointF pointF = this.f19372e;
        float[] fArr = this.f19371d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f19368a.set(obj, pointF);
    }
}
