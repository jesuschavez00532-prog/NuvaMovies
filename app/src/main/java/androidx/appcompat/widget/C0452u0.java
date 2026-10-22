package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.appcompat.R$styleable;
import androidx.core.view.AbstractC0616q0;
import androidx.core.widget.InterfaceC0660b;
import java.lang.ref.WeakReference;
import p254o.AbstractC5894i;
import p405y.AbstractC7653c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.u0 */
/* loaded from: classes.dex */
public class C0452u0 {

    /* renamed from: a */
    private final TextView f1926a;

    /* renamed from: b */
    private C0430o2 f1927b;

    /* renamed from: c */
    private C0430o2 f1928c;

    /* renamed from: d */
    private C0430o2 f1929d;

    /* renamed from: e */
    private C0430o2 f1930e;

    /* renamed from: f */
    private C0430o2 f1931f;

    /* renamed from: g */
    private C0430o2 f1932g;

    /* renamed from: h */
    private C0430o2 f1933h;

    /* renamed from: i */
    private final C0397g1 f1934i;

    /* renamed from: j */
    private int f1935j = 0;

    /* renamed from: k */
    private int f1936k = -1;

    /* renamed from: l */
    private Typeface f1937l;

    /* renamed from: m */
    private boolean f1938m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.u0$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC5894i.d {

        /* renamed from: a */
        final /* synthetic */ int f1939a;

        /* renamed from: b */
        final /* synthetic */ int f1940b;

        /* renamed from: c */
        final /* synthetic */ WeakReference f1941c;

        a(int i10, int i11, WeakReference weakReference) {
            this.f1939a = i10;
            this.f1940b = i11;
            this.f1941c = weakReference;
        }

        @Override // p254o.AbstractC5894i.d
        /* renamed from: d */
        public void mo1974d(int i10) {
        }

        @Override // p254o.AbstractC5894i.d
        /* renamed from: e */
        public void mo1975e(Typeface typeface) {
            int i10;
            boolean z10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f1939a) != -1) {
                if ((this.f1940b & 2) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                typeface = Typeface.create(typeface, i10, z10);
            }
            C0452u0.this.m1963n(this.f1941c, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.u0$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TextView f1943a;

        /* renamed from: b */
        final /* synthetic */ Typeface f1944b;

        /* renamed from: c */
        final /* synthetic */ int f1945c;

        b(TextView textView, Typeface typeface, int i10) {
            this.f1943a = textView;
            this.f1944b = typeface;
            this.f1945c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1943a.setTypeface(this.f1944b, this.f1945c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0452u0(TextView textView) {
        this.f1926a = textView;
        this.f1934i = new C0397g1(textView);
    }

    /* renamed from: B */
    private void m1945B(int i10, float f10) {
        this.f1934i.m1736v(i10, f10);
    }

    /* renamed from: C */
    private void m1946C(Context context, C0438q2 c0438q2) {
        String m1889o;
        Typeface create;
        boolean z10;
        boolean z11;
        Typeface create2;
        this.f1935j = c0438q2.m1885k(R$styleable.TextAppearance_android_textStyle, this.f1935j);
        int i10 = Build.VERSION.SDK_INT;
        boolean z12 = false;
        if (i10 >= 28) {
            int m1885k = c0438q2.m1885k(R$styleable.TextAppearance_android_textFontWeight, -1);
            this.f1936k = m1885k;
            if (m1885k != -1) {
                this.f1935j = (this.f1935j & 2) | 0;
            }
        }
        int i11 = R$styleable.TextAppearance_android_fontFamily;
        if (!c0438q2.m1893s(i11) && !c0438q2.m1893s(R$styleable.TextAppearance_fontFamily)) {
            int i12 = R$styleable.TextAppearance_android_typeface;
            if (c0438q2.m1893s(i12)) {
                this.f1938m = false;
                int m1885k2 = c0438q2.m1885k(i12, 1);
                if (m1885k2 != 1) {
                    if (m1885k2 != 2) {
                        if (m1885k2 == 3) {
                            this.f1937l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.f1937l = Typeface.SERIF;
                    return;
                }
                this.f1937l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.f1937l = null;
        int i13 = R$styleable.TextAppearance_fontFamily;
        if (c0438q2.m1893s(i13)) {
            i11 = i13;
        }
        int i14 = this.f1936k;
        int i15 = this.f1935j;
        if (!context.isRestricted()) {
            try {
                Typeface m1884j = c0438q2.m1884j(i11, this.f1935j, new a(i14, i15, new WeakReference(this.f1926a)));
                if (m1884j != null) {
                    if (i10 >= 28 && this.f1936k != -1) {
                        Typeface create3 = Typeface.create(m1884j, 0);
                        int i16 = this.f1936k;
                        if ((this.f1935j & 2) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        create2 = Typeface.create(create3, i16, z11);
                        this.f1937l = create2;
                    } else {
                        this.f1937l = m1884j;
                    }
                }
                if (this.f1937l == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f1938m = z10;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1937l == null && (m1889o = c0438q2.m1889o(i11)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f1936k != -1) {
                Typeface create4 = Typeface.create(m1889o, 0);
                int i17 = this.f1936k;
                if ((this.f1935j & 2) != 0) {
                    z12 = true;
                }
                create = Typeface.create(create4, i17, z12);
                this.f1937l = create;
                return;
            }
            this.f1937l = Typeface.create(m1889o, this.f1935j);
        }
    }

    /* renamed from: a */
    private void m1947a(Drawable drawable, C0430o2 c0430o2) {
        if (drawable != null && c0430o2 != null) {
            C0415l.m1766i(drawable, c0430o2, this.f1926a.getDrawableState());
        }
    }

    /* renamed from: d */
    private static C0430o2 m1948d(Context context, C0415l c0415l, int i10) {
        ColorStateList m1769f = c0415l.m1769f(context, i10);
        if (m1769f != null) {
            C0430o2 c0430o2 = new C0430o2();
            c0430o2.f1843d = true;
            c0430o2.f1840a = m1769f;
            return c0430o2;
        }
        return null;
    }

    /* renamed from: y */
    private void m1949y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] compoundDrawablesRelative = this.f1926a.getCompoundDrawablesRelative();
                Drawable drawable7 = compoundDrawablesRelative[0];
                if (drawable7 == null && compoundDrawablesRelative[2] == null) {
                    Drawable[] compoundDrawables = this.f1926a.getCompoundDrawables();
                    TextView textView = this.f1926a;
                    if (drawable == null) {
                        drawable = compoundDrawables[0];
                    }
                    if (drawable2 == null) {
                        drawable2 = compoundDrawables[1];
                    }
                    if (drawable3 == null) {
                        drawable3 = compoundDrawables[2];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawables[3];
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                    return;
                }
                TextView textView2 = this.f1926a;
                if (drawable2 == null) {
                    drawable2 = compoundDrawablesRelative[1];
                }
                Drawable drawable8 = compoundDrawablesRelative[2];
                if (drawable4 == null) {
                    drawable4 = compoundDrawablesRelative[3];
                }
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                return;
            }
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f1926a.getCompoundDrawablesRelative();
        TextView textView3 = this.f1926a;
        if (drawable5 == null) {
            drawable5 = compoundDrawablesRelative2[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawablesRelative2[1];
        }
        if (drawable6 == null) {
            drawable6 = compoundDrawablesRelative2[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawablesRelative2[3];
        }
        textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
    }

    /* renamed from: z */
    private void m1950z() {
        C0430o2 c0430o2 = this.f1933h;
        this.f1927b = c0430o2;
        this.f1928c = c0430o2;
        this.f1929d = c0430o2;
        this.f1930e = c0430o2;
        this.f1931f = c0430o2;
        this.f1932g = c0430o2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public void m1951A(int i10, float f10) {
        if (!InterfaceC0660b.f2492P && !m1961l()) {
            m1945B(i10, f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m1952b() {
        if (this.f1927b != null || this.f1928c != null || this.f1929d != null || this.f1930e != null) {
            Drawable[] compoundDrawables = this.f1926a.getCompoundDrawables();
            m1947a(compoundDrawables[0], this.f1927b);
            m1947a(compoundDrawables[1], this.f1928c);
            m1947a(compoundDrawables[2], this.f1929d);
            m1947a(compoundDrawables[3], this.f1930e);
        }
        if (this.f1931f != null || this.f1932g != null) {
            Drawable[] compoundDrawablesRelative = this.f1926a.getCompoundDrawablesRelative();
            m1947a(compoundDrawablesRelative[0], this.f1931f);
            m1947a(compoundDrawablesRelative[2], this.f1932g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m1953c() {
        this.f1934i.m1723a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m1954e() {
        return this.f1934i.m1725h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m1955f() {
        return this.f1934i.m1726i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m1956g() {
        return this.f1934i.m1727j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int[] m1957h() {
        return this.f1934i.m1728k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m1958i() {
        return this.f1934i.m1729l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public ColorStateList m1959j() {
        C0430o2 c0430o2 = this.f1933h;
        if (c0430o2 != null) {
            return c0430o2.f1840a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public PorterDuff.Mode m1960k() {
        C0430o2 c0430o2 = this.f1933h;
        if (c0430o2 != null) {
            return c0430o2.f1841b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean m1961l() {
        return this.f1934i.m1731p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e5  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1962m(android.util.AttributeSet r24, int r25) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0452u0.m1962m(android.util.AttributeSet, int):void");
    }

    /* renamed from: n */
    void m1963n(WeakReference weakReference, Typeface typeface) {
        if (this.f1938m) {
            this.f1937l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (AbstractC0616q0.m2599Q(textView)) {
                    textView.post(new b(textView, typeface, this.f1935j));
                } else {
                    textView.setTypeface(typeface, this.f1935j);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m1964o(boolean z10, int i10, int i11, int i12, int i13) {
        if (!InterfaceC0660b.f2492P) {
            m1953c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m1965p() {
        m1952b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m1966q(Context context, int i10) {
        String m1889o;
        ColorStateList m1877c;
        ColorStateList m1877c2;
        ColorStateList m1877c3;
        C0438q2 m1872t = C0438q2.m1872t(context, i10, R$styleable.f899N);
        int i11 = R$styleable.TextAppearance_textAllCaps;
        if (m1872t.m1893s(i11)) {
            m1968s(m1872t.m1875a(i11, false));
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 23) {
            int i13 = R$styleable.TextAppearance_android_textColor;
            if (m1872t.m1893s(i13) && (m1877c3 = m1872t.m1877c(i13)) != null) {
                this.f1926a.setTextColor(m1877c3);
            }
            int i14 = R$styleable.TextAppearance_android_textColorLink;
            if (m1872t.m1893s(i14) && (m1877c2 = m1872t.m1877c(i14)) != null) {
                this.f1926a.setLinkTextColor(m1877c2);
            }
            int i15 = R$styleable.TextAppearance_android_textColorHint;
            if (m1872t.m1893s(i15) && (m1877c = m1872t.m1877c(i15)) != null) {
                this.f1926a.setHintTextColor(m1877c);
            }
        }
        int i16 = R$styleable.TextAppearance_android_textSize;
        if (m1872t.m1893s(i16) && m1872t.m1880f(i16, -1) == 0) {
            this.f1926a.setTextSize(0, 0.0f);
        }
        m1946C(context, m1872t);
        if (i12 >= 26) {
            int i17 = R$styleable.TextAppearance_fontVariationSettings;
            if (m1872t.m1893s(i17) && (m1889o = m1872t.m1889o(i17)) != null) {
                this.f1926a.setFontVariationSettings(m1889o);
            }
        }
        m1872t.m1894w();
        Typeface typeface = this.f1937l;
        if (typeface != null) {
            this.f1926a.setTypeface(typeface, this.f1935j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m1967r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            AbstractC7653c.m29444f(editorInfo, textView.getText());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m1968s(boolean z10) {
        this.f1926a.setAllCaps(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m1969t(int i10, int i11, int i12, int i13) {
        this.f1934i.m1733r(i10, i11, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m1970u(int[] iArr, int i10) {
        this.f1934i.m1734s(iArr, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m1971v(int i10) {
        this.f1934i.m1735t(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m1972w(ColorStateList colorStateList) {
        boolean z10;
        if (this.f1933h == null) {
            this.f1933h = new C0430o2();
        }
        C0430o2 c0430o2 = this.f1933h;
        c0430o2.f1840a = colorStateList;
        if (colorStateList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        c0430o2.f1843d = z10;
        m1950z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m1973x(PorterDuff.Mode mode) {
        boolean z10;
        if (this.f1933h == null) {
            this.f1933h = new C0430o2();
        }
        C0430o2 c0430o2 = this.f1933h;
        c0430o2.f1841b = mode;
        if (mode != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        c0430o2.f1842c = z10;
        m1950z();
    }
}
