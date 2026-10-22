package p254o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: o.k */
/* loaded from: classes.dex */
public abstract class AbstractC5896k {
    /* renamed from: a */
    public static boolean m23813a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, boolean z10) {
        if (!m23822j(xmlPullParser, str)) {
            return z10;
        }
        return typedArray.getBoolean(i10, z10);
    }

    /* renamed from: b */
    public static int m23814b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        if (!m23822j(xmlPullParser, str)) {
            return i11;
        }
        return typedArray.getColor(i10, i11);
    }

    /* renamed from: c */
    public static ColorStateList m23815c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10) {
        if (m23822j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i11 = typedValue.type;
            if (i11 != 2) {
                if (i11 >= 28 && i11 <= 31) {
                    return m23816d(typedValue);
                }
                return AbstractC5888c.m23749d(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            }
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i10 + ": " + typedValue);
        }
        return null;
    }

    /* renamed from: d */
    private static ColorStateList m23816d(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: e */
    public static C5889d m23817e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10, int i11) {
        if (m23822j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i12 = typedValue.type;
            if (i12 >= 28 && i12 <= 31) {
                return C5889d.m23755b(typedValue.data);
            }
            C5889d m23758g = C5889d.m23758g(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            if (m23758g != null) {
                return m23758g;
            }
        }
        return C5889d.m23755b(i11);
    }

    /* renamed from: f */
    public static float m23818f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, float f10) {
        if (!m23822j(xmlPullParser, str)) {
            return f10;
        }
        return typedArray.getFloat(i10, f10);
    }

    /* renamed from: g */
    public static int m23819g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        if (!m23822j(xmlPullParser, str)) {
            return i11;
        }
        return typedArray.getInt(i10, i11);
    }

    /* renamed from: h */
    public static int m23820h(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        if (!m23822j(xmlPullParser, str)) {
            return i11;
        }
        return typedArray.getResourceId(i10, i11);
    }

    /* renamed from: i */
    public static String m23821i(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10) {
        if (!m23822j(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i10);
    }

    /* renamed from: j */
    public static boolean m23822j(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static TypedArray m23823k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: l */
    public static TypedValue m23824l(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10) {
        if (!m23822j(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i10);
    }
}
