package p326s5;

/* renamed from: s5.e */
/* loaded from: classes.dex */
public class C6682e extends AbstractC6681d {

    /* renamed from: a */
    float f25600a = -1.0f;

    @Override // p326s5.AbstractC6681d
    /* renamed from: a */
    public void mo26056a(C6692o c6692o, float f10, float f11, float f12) {
        c6692o.m26209n(0.0f, f12 * f11, 180.0f, 180.0f - f10);
        double sin = Math.sin(Math.toRadians(f10));
        double d10 = f12;
        Double.isNaN(d10);
        double d11 = f11;
        Double.isNaN(d11);
        double sin2 = Math.sin(Math.toRadians(90.0f - f10));
        Double.isNaN(d10);
        Double.isNaN(d11);
        c6692o.m26207l((float) (sin * d10 * d11), (float) (sin2 * d10 * d11));
    }
}
