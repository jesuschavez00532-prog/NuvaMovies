package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.R$styleable;
import androidx.core.view.AbstractC0616q0;
import androidx.core.widget.AbstractC0679n;
import p106e.AbstractC4105b;

/* renamed from: androidx.appcompat.widget.q */
/* loaded from: classes.dex */
public class C0435q {

    /* renamed from: a */
    private final ImageView f1861a;

    /* renamed from: b */
    private C0430o2 f1862b;

    /* renamed from: c */
    private C0430o2 f1863c;

    /* renamed from: d */
    private C0430o2 f1864d;

    public C0435q(ImageView imageView) {
        this.f1861a = imageView;
    }

    /* renamed from: a */
    private boolean m1861a(Drawable drawable) {
        if (this.f1864d == null) {
            this.f1864d = new C0430o2();
        }
        C0430o2 c0430o2 = this.f1864d;
        c0430o2.m1845a();
        ColorStateList m2973a = AbstractC0679n.m2973a(this.f1861a);
        if (m2973a != null) {
            c0430o2.f1843d = true;
            c0430o2.f1840a = m2973a;
        }
        PorterDuff.Mode m2974b = AbstractC0679n.m2974b(this.f1861a);
        if (m2974b != null) {
            c0430o2.f1842c = true;
            c0430o2.f1841b = m2974b;
        }
        if (!c0430o2.f1843d && !c0430o2.f1842c) {
            return false;
        }
        C0415l.m1766i(drawable, c0430o2, this.f1861a.getDrawableState());
        return true;
    }

    /* renamed from: j */
    private boolean m1862j() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 21) {
            if (this.f1862b != null) {
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
    public void m1863b() {
        Drawable drawable = this.f1861a.getDrawable();
        if (drawable != null) {
            AbstractC0421m1.m1829b(drawable);
        }
        if (drawable != null) {
            if (m1862j() && m1861a(drawable)) {
                return;
            }
            C0430o2 c0430o2 = this.f1863c;
            if (c0430o2 != null) {
                C0415l.m1766i(drawable, c0430o2, this.f1861a.getDrawableState());
                return;
            }
            C0430o2 c0430o22 = this.f1862b;
            if (c0430o22 != null) {
                C0415l.m1766i(drawable, c0430o22, this.f1861a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList m1864c() {
        C0430o2 c0430o2 = this.f1863c;
        if (c0430o2 != null) {
            return c0430o2.f1840a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode m1865d() {
        C0430o2 c0430o2 = this.f1863c;
        if (c0430o2 != null) {
            return c0430o2.f1841b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m1866e() {
        Drawable background = this.f1861a.getBackground();
        if (Build.VERSION.SDK_INT >= 21 && AbstractC0431p.m1846a(background)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void m1867f(AttributeSet attributeSet, int i10) {
        int m1888n;
        Context context = this.f1861a.getContext();
        int[] iArr = R$styleable.f914k;
        C0438q2 m1874v = C0438q2.m1874v(context, attributeSet, iArr, i10, 0);
        ImageView imageView = this.f1861a;
        AbstractC0616q0.m2632l0(imageView, imageView.getContext(), iArr, attributeSet, m1874v.m1892r(), i10, 0);
        try {
            Drawable drawable = this.f1861a.getDrawable();
            if (drawable == null && (m1888n = m1874v.m1888n(R$styleable.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = AbstractC4105b.m17170d(this.f1861a.getContext(), m1888n)) != null) {
                this.f1861a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC0421m1.m1829b(drawable);
            }
            int i11 = R$styleable.AppCompatImageView_tint;
            if (m1874v.m1893s(i11)) {
                AbstractC0679n.m2975c(this.f1861a, m1874v.m1877c(i11));
            }
            int i12 = R$styleable.AppCompatImageView_tintMode;
            if (m1874v.m1893s(i12)) {
                AbstractC0679n.m2976d(this.f1861a, AbstractC0421m1.m1831d(m1874v.m1885k(i12, -1), null));
            }
        } finally {
            m1874v.m1894w();
        }
    }

    /* renamed from: g */
    public void m1868g(int i10) {
        if (i10 != 0) {
            Drawable m17170d = AbstractC4105b.m17170d(this.f1861a.getContext(), i10);
            if (m17170d != null) {
                AbstractC0421m1.m1829b(m17170d);
            }
            this.f1861a.setImageDrawable(m17170d);
        } else {
            this.f1861a.setImageDrawable(null);
        }
        m1863b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m1869h(ColorStateList colorStateList) {
        if (this.f1863c == null) {
            this.f1863c = new C0430o2();
        }
        C0430o2 c0430o2 = this.f1863c;
        c0430o2.f1840a = colorStateList;
        c0430o2.f1843d = true;
        m1863b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m1870i(PorterDuff.Mode mode) {
        if (this.f1863c == null) {
            this.f1863c = new C0430o2();
        }
        C0430o2 c0430o2 = this.f1863c;
        c0430o2.f1841b = mode;
        c0430o2.f1842c = true;
        m1863b();
    }
}
