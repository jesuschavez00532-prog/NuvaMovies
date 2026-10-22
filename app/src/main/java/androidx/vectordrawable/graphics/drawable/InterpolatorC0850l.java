package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;
import p254o.AbstractC5896k;
import p276p.AbstractC6135h;

/* renamed from: androidx.vectordrawable.graphics.drawable.l */
/* loaded from: classes.dex */
public class InterpolatorC0850l implements Interpolator {

    /* renamed from: a */
    private float[] f3564a;

    /* renamed from: b */
    private float[] f3565b;

    public InterpolatorC0850l(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    /* renamed from: a */
    private void m4349a(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f10, f11, f12, f13, 1.0f, 1.0f);
        m4350b(path);
    }

    /* renamed from: b */
    private void m4350b(Path path) {
        int i10 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f3564a = new float[min];
            this.f3565b = new float[min];
            float[] fArr = new float[2];
            for (int i11 = 0; i11 < min; i11++) {
                pathMeasure.getPosTan((i11 * length) / (min - 1), fArr, null);
                this.f3564a[i11] = fArr[0];
                this.f3565b[i11] = fArr[1];
            }
            if (Math.abs(this.f3564a[0]) <= 1.0E-5d && Math.abs(this.f3565b[0]) <= 1.0E-5d) {
                int i12 = min - 1;
                if (Math.abs(this.f3564a[i12] - 1.0f) <= 1.0E-5d && Math.abs(this.f3565b[i12] - 1.0f) <= 1.0E-5d) {
                    float f10 = 0.0f;
                    int i13 = 0;
                    while (i10 < min) {
                        float[] fArr2 = this.f3564a;
                        int i14 = i13 + 1;
                        float f11 = fArr2[i13];
                        if (f11 >= f10) {
                            fArr2[i10] = f11;
                            i10++;
                            f10 = f11;
                            i13 = i14;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f11);
                        }
                    }
                    if (!pathMeasure.nextContour()) {
                        return;
                    } else {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("The Path must start at (0,0) and end at (1,1) start: ");
            sb2.append(this.f3564a[0]);
            sb2.append(",");
            sb2.append(this.f3565b[0]);
            sb2.append(" end:");
            int i15 = min - 1;
            sb2.append(this.f3564a[i15]);
            sb2.append(",");
            sb2.append(this.f3565b[i15]);
            throw new IllegalArgumentException(sb2.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }

    /* renamed from: c */
    private void m4351c(float f10, float f11) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f10, f11, 1.0f, 1.0f);
        m4350b(path);
    }

    /* renamed from: d */
    private void m4352d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (AbstractC5896k.m23822j(xmlPullParser, "pathData")) {
            String m23821i = AbstractC5896k.m23821i(typedArray, xmlPullParser, "pathData", 4);
            Path m24442e = AbstractC6135h.m24442e(m23821i);
            if (m24442e != null) {
                m4350b(m24442e);
                return;
            }
            throw new InflateException("The path is null, which is created from " + m23821i);
        }
        if (AbstractC5896k.m23822j(xmlPullParser, "controlX1")) {
            if (AbstractC5896k.m23822j(xmlPullParser, "controlY1")) {
                float m23818f = AbstractC5896k.m23818f(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
                float m23818f2 = AbstractC5896k.m23818f(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
                boolean m23822j = AbstractC5896k.m23822j(xmlPullParser, "controlX2");
                if (m23822j == AbstractC5896k.m23822j(xmlPullParser, "controlY2")) {
                    if (!m23822j) {
                        m4351c(m23818f, m23818f2);
                        return;
                    } else {
                        m4349a(m23818f, m23818f2, AbstractC5896k.m23818f(typedArray, xmlPullParser, "controlX2", 2, 0.0f), AbstractC5896k.m23818f(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
                        return;
                    }
                }
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            }
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        throw new InflateException("pathInterpolator requires the controlX1 attribute");
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        int length = this.f3564a.length - 1;
        int i10 = 0;
        while (length - i10 > 1) {
            int i11 = (i10 + length) / 2;
            if (f10 < this.f3564a[i11]) {
                length = i11;
            } else {
                i10 = i11;
            }
        }
        float[] fArr = this.f3564a;
        float f11 = fArr[length];
        float f12 = fArr[i10];
        float f13 = f11 - f12;
        if (f13 == 0.0f) {
            return this.f3565b[i10];
        }
        float f14 = (f10 - f12) / f13;
        float[] fArr2 = this.f3565b;
        float f15 = fArr2[i10];
        return f15 + (f14 * (fArr2[length] - f15));
    }

    public InterpolatorC0850l(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray m23823k = AbstractC5896k.m23823k(resources, theme, attributeSet, AbstractC0839a.f3548l);
        m4352d(m23823k, xmlPullParser);
        m23823k.recycle();
    }
}
