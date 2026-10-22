package p254o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p320s.AbstractC6605a;

/* renamed from: o.c */
/* loaded from: classes.dex */
public abstract class AbstractC5888c {

    /* renamed from: a */
    private static final ThreadLocal f23433a = new ThreadLocal();

    /* renamed from: a */
    public static ColorStateList m23746a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m23747b(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: b */
    public static ColorStateList m23747b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m23750e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    /* renamed from: c */
    private static TypedValue m23748c() {
        ThreadLocal threadLocal = f23433a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    /* renamed from: d */
    public static ColorStateList m23749d(Resources resources, int i10, Resources.Theme theme) {
        try {
            return m23746a(resources, resources.getXml(i10), theme);
        } catch (Exception e10) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e10);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.content.res.ColorStateList m23750e(android.content.res.Resources r17, org.xmlpull.v1.XmlPullParser r18, android.util.AttributeSet r19, android.content.res.Resources.Theme r20) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p254o.AbstractC5888c.m23750e(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* renamed from: f */
    private static boolean m23751f(Resources resources, int i10) {
        TypedValue m23748c = m23748c();
        resources.getValue(i10, m23748c, true);
        int i11 = m23748c.type;
        if (i11 >= 28 && i11 <= 31) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private static int m23752g(int i10, float f10, float f11) {
        boolean z10;
        if (f11 >= 0.0f && f11 <= 100.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (f10 == 1.0f && !z10) {
            return i10;
        }
        int m25818b = AbstractC6605a.m25818b((int) ((Color.alpha(i10) * f10) + 0.5f), 0, 255);
        if (z10) {
            C5886a m23723c = C5886a.m23723c(i10);
            i10 = C5886a.m23727m(m23723c.m23733j(), m23723c.m23732i(), f11);
        }
        return (i10 & 16777215) | (m25818b << 24);
    }

    /* renamed from: h */
    private static TypedArray m23753h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
