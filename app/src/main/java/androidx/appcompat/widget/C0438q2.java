package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p106e.AbstractC4105b;
import p254o.AbstractC5894i;

/* renamed from: androidx.appcompat.widget.q2 */
/* loaded from: classes.dex */
public class C0438q2 {

    /* renamed from: a */
    private final Context f1865a;

    /* renamed from: b */
    private final TypedArray f1866b;

    /* renamed from: c */
    private TypedValue f1867c;

    private C0438q2(Context context, TypedArray typedArray) {
        this.f1865a = context;
        this.f1866b = typedArray;
    }

    /* renamed from: t */
    public static C0438q2 m1872t(Context context, int i10, int[] iArr) {
        return new C0438q2(context, context.obtainStyledAttributes(i10, iArr));
    }

    /* renamed from: u */
    public static C0438q2 m1873u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0438q2(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: v */
    public static C0438q2 m1874v(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new C0438q2(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    /* renamed from: a */
    public boolean m1875a(int i10, boolean z10) {
        return this.f1866b.getBoolean(i10, z10);
    }

    /* renamed from: b */
    public int m1876b(int i10, int i11) {
        return this.f1866b.getColor(i10, i11);
    }

    /* renamed from: c */
    public ColorStateList m1877c(int i10) {
        int resourceId;
        ColorStateList m17169c;
        if (this.f1866b.hasValue(i10) && (resourceId = this.f1866b.getResourceId(i10, 0)) != 0 && (m17169c = AbstractC4105b.m17169c(this.f1865a, resourceId)) != null) {
            return m17169c;
        }
        return this.f1866b.getColorStateList(i10);
    }

    /* renamed from: d */
    public float m1878d(int i10, float f10) {
        return this.f1866b.getDimension(i10, f10);
    }

    /* renamed from: e */
    public int m1879e(int i10, int i11) {
        return this.f1866b.getDimensionPixelOffset(i10, i11);
    }

    /* renamed from: f */
    public int m1880f(int i10, int i11) {
        return this.f1866b.getDimensionPixelSize(i10, i11);
    }

    /* renamed from: g */
    public Drawable m1881g(int i10) {
        int resourceId;
        if (this.f1866b.hasValue(i10) && (resourceId = this.f1866b.getResourceId(i10, 0)) != 0) {
            return AbstractC4105b.m17170d(this.f1865a, resourceId);
        }
        return this.f1866b.getDrawable(i10);
    }

    /* renamed from: h */
    public Drawable m1882h(int i10) {
        int resourceId;
        if (this.f1866b.hasValue(i10) && (resourceId = this.f1866b.getResourceId(i10, 0)) != 0) {
            return C0415l.m1763b().m1768d(this.f1865a, resourceId, true);
        }
        return null;
    }

    /* renamed from: i */
    public float m1883i(int i10, float f10) {
        return this.f1866b.getFloat(i10, f10);
    }

    /* renamed from: j */
    public Typeface m1884j(int i10, int i11, AbstractC5894i.d dVar) {
        int resourceId = this.f1866b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1867c == null) {
            this.f1867c = new TypedValue();
        }
        return AbstractC5894i.m23798f(this.f1865a, resourceId, this.f1867c, i11, dVar);
    }

    /* renamed from: k */
    public int m1885k(int i10, int i11) {
        return this.f1866b.getInt(i10, i11);
    }

    /* renamed from: l */
    public int m1886l(int i10, int i11) {
        return this.f1866b.getInteger(i10, i11);
    }

    /* renamed from: m */
    public int m1887m(int i10, int i11) {
        return this.f1866b.getLayoutDimension(i10, i11);
    }

    /* renamed from: n */
    public int m1888n(int i10, int i11) {
        return this.f1866b.getResourceId(i10, i11);
    }

    /* renamed from: o */
    public String m1889o(int i10) {
        return this.f1866b.getString(i10);
    }

    /* renamed from: p */
    public CharSequence m1890p(int i10) {
        return this.f1866b.getText(i10);
    }

    /* renamed from: q */
    public CharSequence[] m1891q(int i10) {
        return this.f1866b.getTextArray(i10);
    }

    /* renamed from: r */
    public TypedArray m1892r() {
        return this.f1866b;
    }

    /* renamed from: s */
    public boolean m1893s(int i10) {
        return this.f1866b.hasValue(i10);
    }

    /* renamed from: w */
    public void m1894w() {
        this.f1866b.recycle();
    }
}
