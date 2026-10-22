package p254o;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import androidx.core.R$styleable;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.g */
/* loaded from: classes.dex */
public abstract class AbstractC5892g {
    /* renamed from: a */
    private static a m23786a(a aVar, int i10, int i11, boolean z10, int i12) {
        if (aVar != null) {
            return aVar;
        }
        if (z10) {
            return new a(i10, i12, i11);
        }
        return new a(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Shader m23787b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            TypedArray m23823k = AbstractC5896k.m23823k(resources, theme, attributeSet, R$styleable.f2179e);
            float m23818f = AbstractC5896k.m23818f(m23823k, xmlPullParser, "startX", R$styleable.GradientColor_android_startX, 0.0f);
            float m23818f2 = AbstractC5896k.m23818f(m23823k, xmlPullParser, "startY", R$styleable.GradientColor_android_startY, 0.0f);
            float m23818f3 = AbstractC5896k.m23818f(m23823k, xmlPullParser, "endX", R$styleable.GradientColor_android_endX, 0.0f);
            float m23818f4 = AbstractC5896k.m23818f(m23823k, xmlPullParser, "endY", R$styleable.GradientColor_android_endY, 0.0f);
            float m23818f5 = AbstractC5896k.m23818f(m23823k, xmlPullParser, "centerX", R$styleable.GradientColor_android_centerX, 0.0f);
            float m23818f6 = AbstractC5896k.m23818f(m23823k, xmlPullParser, "centerY", R$styleable.GradientColor_android_centerY, 0.0f);
            int m23819g = AbstractC5896k.m23819g(m23823k, xmlPullParser, "type", R$styleable.GradientColor_android_type, 0);
            int m23814b = AbstractC5896k.m23814b(m23823k, xmlPullParser, "startColor", R$styleable.GradientColor_android_startColor, 0);
            boolean m23822j = AbstractC5896k.m23822j(xmlPullParser, "centerColor");
            int m23814b2 = AbstractC5896k.m23814b(m23823k, xmlPullParser, "centerColor", R$styleable.GradientColor_android_centerColor, 0);
            int m23814b3 = AbstractC5896k.m23814b(m23823k, xmlPullParser, "endColor", R$styleable.GradientColor_android_endColor, 0);
            int m23819g2 = AbstractC5896k.m23819g(m23823k, xmlPullParser, "tileMode", R$styleable.GradientColor_android_tileMode, 0);
            float m23818f7 = AbstractC5896k.m23818f(m23823k, xmlPullParser, "gradientRadius", R$styleable.GradientColor_android_gradientRadius, 0.0f);
            m23823k.recycle();
            a m23786a = m23786a(m23788c(resources, xmlPullParser, attributeSet, theme), m23814b, m23814b3, m23822j, m23814b2);
            if (m23819g != 1) {
                if (m23819g != 2) {
                    return new LinearGradient(m23818f, m23818f2, m23818f3, m23818f4, m23786a.f23448a, m23786a.f23449b, m23789d(m23819g2));
                }
                return new SweepGradient(m23818f5, m23818f6, m23786a.f23448a, m23786a.f23449b);
            }
            if (m23818f7 > 0.0f) {
                return new RadialGradient(m23818f5, m23818f6, m23818f7, m23786a.f23448a, m23786a.f23449b, m23789d(m23819g2));
            }
            throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static p254o.AbstractC5892g.a m23788c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r10.next()
            if (r3 == r1) goto L81
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L81
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = androidx.core.R$styleable.f2180f
            android.content.res.TypedArray r3 = p254o.AbstractC5896k.m23823k(r9, r12, r11, r3)
            int r5 = androidx.core.R$styleable.GradientColorItem_android_color
            boolean r6 = r3.hasValue(r5)
            int r7 = androidx.core.R$styleable.GradientColorItem_android_offset
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L66
            if (r8 == 0) goto L66
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L66:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L81:
            int r9 = r4.size()
            if (r9 <= 0) goto L8d
            o.g$a r9 = new o.g$a
            r9.<init>(r4, r2)
            return r9
        L8d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p254o.AbstractC5892g.m23788c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):o.g$a");
    }

    /* renamed from: d */
    private static Shader.TileMode m23789d(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return Shader.TileMode.CLAMP;
            }
            return Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.g$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final int[] f23448a;

        /* renamed from: b */
        final float[] f23449b;

        a(List list, List list2) {
            int size = list.size();
            this.f23448a = new int[size];
            this.f23449b = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.f23448a[i10] = ((Integer) list.get(i10)).intValue();
                this.f23449b[i10] = ((Float) list2.get(i10)).floatValue();
            }
        }

        a(int i10, int i11) {
            this.f23448a = new int[]{i10, i11};
            this.f23449b = new float[]{0.0f, 1.0f};
        }

        a(int i10, int i11, int i12) {
            this.f23448a = new int[]{i10, i11, i12};
            this.f23449b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
