package p091d0;

import android.view.animation.Interpolator;

/* renamed from: d0.d */
/* loaded from: classes.dex */
abstract class AbstractInterpolatorC3920d implements Interpolator {

    /* renamed from: a */
    private final float[] f17595a;

    /* renamed from: b */
    private final float f17596b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractInterpolatorC3920d(float[] fArr) {
        this.f17595a = fArr;
        this.f17596b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f17595a;
        int min = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f17596b;
        float f12 = (f10 - (min * f11)) / f11;
        float[] fArr2 = this.f17595a;
        float f13 = fArr2[min];
        return f13 + (f12 * (fArr2[min + 1] - f13));
    }
}
