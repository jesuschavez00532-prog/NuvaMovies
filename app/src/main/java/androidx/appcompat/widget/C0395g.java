package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R$styleable;
import androidx.core.view.AbstractC0616q0;

/* renamed from: androidx.appcompat.widget.g */
/* loaded from: classes.dex */
class C0395g {

    /* renamed from: a */
    private final View f1742a;

    /* renamed from: d */
    private C0430o2 f1745d;

    /* renamed from: e */
    private C0430o2 f1746e;

    /* renamed from: f */
    private C0430o2 f1747f;

    /* renamed from: c */
    private int f1744c = -1;

    /* renamed from: b */
    private final C0415l f1743b = C0415l.m1763b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0395g(View view) {
        this.f1742a = view;
    }

    /* renamed from: a */
    private boolean m1697a(Drawable drawable) {
        if (this.f1747f == null) {
            this.f1747f = new C0430o2();
        }
        C0430o2 c0430o2 = this.f1747f;
        c0430o2.m1845a();
        ColorStateList m2643r = AbstractC0616q0.m2643r(this.f1742a);
        if (m2643r != null) {
            c0430o2.f1843d = true;
            c0430o2.f1840a = m2643r;
        }
        PorterDuff.Mode m2645s = AbstractC0616q0.m2645s(this.f1742a);
        if (m2645s != null) {
            c0430o2.f1842c = true;
            c0430o2.f1841b = m2645s;
        }
        if (!c0430o2.f1843d && !c0430o2.f1842c) {
            return false;
        }
        C0415l.m1766i(drawable, c0430o2, this.f1742a.getDrawableState());
        return true;
    }

    /* renamed from: k */
    private boolean m1698k() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 21) {
            if (this.f1745d != null) {
                return true;
            }
            return false;
        }
        if (i10 == 21) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m1699b() {
        Drawable background = this.f1742a.getBackground();
        if (background != null) {
            if (m1698k() && m1697a(background)) {
                return;
            }
            C0430o2 c0430o2 = this.f1746e;
            if (c0430o2 != null) {
                C0415l.m1766i(background, c0430o2, this.f1742a.getDrawableState());
                return;
            }
            C0430o2 c0430o22 = this.f1745d;
            if (c0430o22 != null) {
                C0415l.m1766i(background, c0430o22, this.f1742a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList m1700c() {
        C0430o2 c0430o2 = this.f1746e;
        if (c0430o2 != null) {
            return c0430o2.f1840a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode m1701d() {
        C0430o2 c0430o2 = this.f1746e;
        if (c0430o2 != null) {
            return c0430o2.f1841b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m1702e(AttributeSet attributeSet, int i10) {
        Context context = this.f1742a.getContext();
        int[] iArr = R$styleable.f902Q;
        C0438q2 m1874v = C0438q2.m1874v(context, attributeSet, iArr, i10, 0);
        View view = this.f1742a;
        AbstractC0616q0.m2632l0(view, view.getContext(), iArr, attributeSet, m1874v.m1892r(), i10, 0);
        try {
            int i11 = R$styleable.ViewBackgroundHelper_android_background;
            if (m1874v.m1893s(i11)) {
                this.f1744c = m1874v.m1888n(i11, -1);
                ColorStateList m1769f = this.f1743b.m1769f(this.f1742a.getContext(), this.f1744c);
                if (m1769f != null) {
                    m1705h(m1769f);
                }
            }
            int i12 = R$styleable.ViewBackgroundHelper_backgroundTint;
            if (m1874v.m1893s(i12)) {
                AbstractC0616q0.m2644r0(this.f1742a, m1874v.m1877c(i12));
            }
            int i13 = R$styleable.ViewBackgroundHelper_backgroundTintMode;
            if (m1874v.m1893s(i13)) {
                AbstractC0616q0.m2646s0(this.f1742a, AbstractC0421m1.m1831d(m1874v.m1885k(i13, -1), null));
            }
        } finally {
            m1874v.m1894w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m1703f(Drawable drawable) {
        this.f1744c = -1;
        m1705h(null);
        m1699b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m1704g(int i10) {
        ColorStateList colorStateList;
        this.f1744c = i10;
        C0415l c0415l = this.f1743b;
        if (c0415l != null) {
            colorStateList = c0415l.m1769f(this.f1742a.getContext(), i10);
        } else {
            colorStateList = null;
        }
        m1705h(colorStateList);
        m1699b();
    }

    /* renamed from: h */
    void m1705h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1745d == null) {
                this.f1745d = new C0430o2();
            }
            C0430o2 c0430o2 = this.f1745d;
            c0430o2.f1840a = colorStateList;
            c0430o2.f1843d = true;
        } else {
            this.f1745d = null;
        }
        m1699b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m1706i(ColorStateList colorStateList) {
        if (this.f1746e == null) {
            this.f1746e = new C0430o2();
        }
        C0430o2 c0430o2 = this.f1746e;
        c0430o2.f1840a = colorStateList;
        c0430o2.f1843d = true;
        m1699b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m1707j(PorterDuff.Mode mode) {
        if (this.f1746e == null) {
            this.f1746e = new C0430o2();
        }
        C0430o2 c0430o2 = this.f1746e;
        c0430o2.f1841b = mode;
        c0430o2.f1842c = true;
        m1699b();
    }
}
