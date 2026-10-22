package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.core.view.AbstractC0616q0;
import androidx.core.view.AbstractC0619r;
import p144g5.AbstractC4346a;
import p282p5.C6214a;
import p282p5.C6217d;
import p320s.AbstractC6605a;
import p360v.AbstractC7186q;
import p360v.InterfaceC7185p;

/* renamed from: com.google.android.material.internal.a */
/* loaded from: classes.dex */
public final class C2583a {

    /* renamed from: V */
    private static final boolean f9750V = false;

    /* renamed from: W */
    private static final Paint f9751W = null;

    /* renamed from: A */
    private boolean f9752A;

    /* renamed from: B */
    private Bitmap f9753B;

    /* renamed from: C */
    private Paint f9754C;

    /* renamed from: D */
    private float f9755D;

    /* renamed from: E */
    private float f9756E;

    /* renamed from: F */
    private float f9757F;

    /* renamed from: G */
    private float f9758G;

    /* renamed from: H */
    private int[] f9759H;

    /* renamed from: I */
    private boolean f9760I;

    /* renamed from: J */
    private final TextPaint f9761J;

    /* renamed from: K */
    private final TextPaint f9762K;

    /* renamed from: L */
    private TimeInterpolator f9763L;

    /* renamed from: M */
    private TimeInterpolator f9764M;

    /* renamed from: N */
    private float f9765N;

    /* renamed from: O */
    private float f9766O;

    /* renamed from: P */
    private float f9767P;

    /* renamed from: Q */
    private ColorStateList f9768Q;

    /* renamed from: R */
    private float f9769R;

    /* renamed from: S */
    private float f9770S;

    /* renamed from: T */
    private float f9771T;

    /* renamed from: U */
    private ColorStateList f9772U;

    /* renamed from: a */
    private final View f9773a;

    /* renamed from: b */
    private boolean f9774b;

    /* renamed from: c */
    private float f9775c;

    /* renamed from: d */
    private final Rect f9776d;

    /* renamed from: e */
    private final Rect f9777e;

    /* renamed from: f */
    private final RectF f9778f;

    /* renamed from: g */
    private int f9779g = 16;

    /* renamed from: h */
    private int f9780h = 16;

    /* renamed from: i */
    private float f9781i = 15.0f;

    /* renamed from: j */
    private float f9782j = 15.0f;

    /* renamed from: k */
    private ColorStateList f9783k;

    /* renamed from: l */
    private ColorStateList f9784l;

    /* renamed from: m */
    private float f9785m;

    /* renamed from: n */
    private float f9786n;

    /* renamed from: o */
    private float f9787o;

    /* renamed from: p */
    private float f9788p;

    /* renamed from: q */
    private float f9789q;

    /* renamed from: r */
    private float f9790r;

    /* renamed from: s */
    private Typeface f9791s;

    /* renamed from: t */
    private Typeface f9792t;

    /* renamed from: u */
    private Typeface f9793u;

    /* renamed from: v */
    private C6214a f9794v;

    /* renamed from: w */
    private C6214a f9795w;

    /* renamed from: x */
    private CharSequence f9796x;

    /* renamed from: y */
    private CharSequence f9797y;

    /* renamed from: z */
    private boolean f9798z;

    /* renamed from: com.google.android.material.internal.a$a */
    /* loaded from: classes.dex */
    class a implements C6214a.a {
        a() {
        }

        @Override // p282p5.C6214a.a
        /* renamed from: a */
        public void mo10634a(Typeface typeface) {
            C2583a.this.m10611G(typeface);
        }
    }

    public C2583a(View view) {
        this.f9773a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f9761J = textPaint;
        this.f9762K = new TextPaint(textPaint);
        this.f9777e = new Rect();
        this.f9776d = new Rect();
        this.f9778f = new RectF();
    }

    /* renamed from: A */
    private static boolean m10587A(Rect rect, int i10, int i11, int i12, int i13) {
        if (rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    private boolean m10588H(Typeface typeface) {
        C6214a c6214a = this.f9795w;
        if (c6214a != null) {
            c6214a.m24786c();
        }
        if (this.f9791s != typeface) {
            this.f9791s = typeface;
            return true;
        }
        return false;
    }

    /* renamed from: N */
    private boolean m10589N(Typeface typeface) {
        C6214a c6214a = this.f9794v;
        if (c6214a != null) {
            c6214a.m24786c();
        }
        if (this.f9792t != typeface) {
            this.f9792t = typeface;
            return true;
        }
        return false;
    }

    /* renamed from: P */
    private void m10590P(float f10) {
        boolean z10;
        m10596g(f10);
        if (f9750V && this.f9757F != 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9752A = z10;
        if (z10) {
            m10598j();
        }
        AbstractC0616q0.m2618e0(this.f9773a);
    }

    /* renamed from: a */
    private static int m10591a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb((int) ((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), (int) ((Color.red(i10) * f11) + (Color.red(i11) * f10)), (int) ((Color.green(i10) * f11) + (Color.green(i11) * f10)), (int) ((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    /* renamed from: b */
    private void m10592b() {
        float f10;
        float f11 = this.f9758G;
        m10596g(this.f9782j);
        CharSequence charSequence = this.f9797y;
        float f12 = 0.0f;
        if (charSequence != null) {
            f10 = this.f9761J.measureText(charSequence, 0, charSequence.length());
        } else {
            f10 = 0.0f;
        }
        int m2800b = AbstractC0619r.m2800b(this.f9780h, this.f9798z ? 1 : 0);
        int i10 = m2800b & 112;
        if (i10 != 48) {
            if (i10 != 80) {
                this.f9786n = this.f9777e.centerY() + (((this.f9761J.descent() - this.f9761J.ascent()) / 2.0f) - this.f9761J.descent());
            } else {
                this.f9786n = this.f9777e.bottom;
            }
        } else {
            this.f9786n = this.f9777e.top - this.f9761J.ascent();
        }
        int i11 = m2800b & 8388615;
        if (i11 != 1) {
            if (i11 != 5) {
                this.f9788p = this.f9777e.left;
            } else {
                this.f9788p = this.f9777e.right - f10;
            }
        } else {
            this.f9788p = this.f9777e.centerX() - (f10 / 2.0f);
        }
        m10596g(this.f9781i);
        CharSequence charSequence2 = this.f9797y;
        if (charSequence2 != null) {
            f12 = this.f9761J.measureText(charSequence2, 0, charSequence2.length());
        }
        int m2800b2 = AbstractC0619r.m2800b(this.f9779g, this.f9798z ? 1 : 0);
        int i12 = m2800b2 & 112;
        if (i12 != 48) {
            if (i12 != 80) {
                this.f9785m = this.f9776d.centerY() + (((this.f9761J.descent() - this.f9761J.ascent()) / 2.0f) - this.f9761J.descent());
            } else {
                this.f9785m = this.f9776d.bottom;
            }
        } else {
            this.f9785m = this.f9776d.top - this.f9761J.ascent();
        }
        int i13 = m2800b2 & 8388615;
        if (i13 != 1) {
            if (i13 != 5) {
                this.f9787o = this.f9776d.left;
            } else {
                this.f9787o = this.f9776d.right - f12;
            }
        } else {
            this.f9787o = this.f9776d.centerX() - (f12 / 2.0f);
        }
        m10597h();
        m10590P(f11);
    }

    /* renamed from: d */
    private void m10593d() {
        m10595f(this.f9775c);
    }

    /* renamed from: e */
    private boolean m10594e(CharSequence charSequence) {
        InterfaceC7185p interfaceC7185p;
        boolean z10 = true;
        if (AbstractC0616q0.m2579B(this.f9773a) != 1) {
            z10 = false;
        }
        if (z10) {
            interfaceC7185p = AbstractC7186q.f26887d;
        } else {
            interfaceC7185p = AbstractC7186q.f26886c;
        }
        return interfaceC7185p.mo27812a(charSequence, 0, charSequence.length());
    }

    /* renamed from: f */
    private void m10595f(float f10) {
        m10603u(f10);
        this.f9789q = m10605x(this.f9787o, this.f9788p, f10, this.f9763L);
        this.f9790r = m10605x(this.f9785m, this.f9786n, f10, this.f9763L);
        m10590P(m10605x(this.f9781i, this.f9782j, f10, this.f9764M));
        if (this.f9784l != this.f9783k) {
            this.f9761J.setColor(m10591a(m10600p(), m10628n(), f10));
        } else {
            this.f9761J.setColor(m10628n());
        }
        this.f9761J.setShadowLayer(m10605x(this.f9769R, this.f9765N, f10, null), m10605x(this.f9770S, this.f9766O, f10, null), m10605x(this.f9771T, this.f9767P, f10, null), m10591a(m10599o(this.f9772U), m10599o(this.f9768Q), f10));
        AbstractC0616q0.m2618e0(this.f9773a);
    }

    /* renamed from: g */
    private void m10596g(float f10) {
        boolean z10;
        float f11;
        boolean z11;
        if (this.f9796x == null) {
            return;
        }
        float width = this.f9777e.width();
        float width2 = this.f9776d.width();
        boolean z12 = true;
        if (m10604v(f10, this.f9782j)) {
            f11 = this.f9782j;
            this.f9757F = 1.0f;
            Typeface typeface = this.f9793u;
            Typeface typeface2 = this.f9791s;
            if (typeface != typeface2) {
                this.f9793u = typeface2;
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            float f12 = this.f9781i;
            Typeface typeface3 = this.f9793u;
            Typeface typeface4 = this.f9792t;
            if (typeface3 != typeface4) {
                this.f9793u = typeface4;
                z10 = true;
            } else {
                z10 = false;
            }
            if (m10604v(f10, f12)) {
                this.f9757F = 1.0f;
            } else {
                this.f9757F = f10 / this.f9781i;
            }
            float f13 = this.f9782j / this.f9781i;
            if (width2 * f13 > width) {
                width = Math.min(width / f13, width2);
            } else {
                width = width2;
            }
            f11 = f12;
            z11 = z10;
        }
        if (width > 0.0f) {
            if (this.f9758G == f11 && !this.f9760I && !z11) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f9758G = f11;
            this.f9760I = false;
        }
        if (this.f9797y == null || z11) {
            this.f9761J.setTextSize(this.f9758G);
            this.f9761J.setTypeface(this.f9793u);
            TextPaint textPaint = this.f9761J;
            if (this.f9757F == 1.0f) {
                z12 = false;
            }
            textPaint.setLinearText(z12);
            CharSequence ellipsize = TextUtils.ellipsize(this.f9796x, this.f9761J, width, TextUtils.TruncateAt.END);
            if (!TextUtils.equals(ellipsize, this.f9797y)) {
                this.f9797y = ellipsize;
                this.f9798z = m10594e(ellipsize);
            }
        }
    }

    /* renamed from: h */
    private void m10597h() {
        Bitmap bitmap = this.f9753B;
        if (bitmap != null) {
            bitmap.recycle();
            this.f9753B = null;
        }
    }

    /* renamed from: j */
    private void m10598j() {
        if (this.f9753B == null && !this.f9776d.isEmpty() && !TextUtils.isEmpty(this.f9797y)) {
            m10595f(0.0f);
            this.f9755D = this.f9761J.ascent();
            this.f9756E = this.f9761J.descent();
            TextPaint textPaint = this.f9761J;
            CharSequence charSequence = this.f9797y;
            int round = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
            int round2 = Math.round(this.f9756E - this.f9755D);
            if (round > 0 && round2 > 0) {
                this.f9753B = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(this.f9753B);
                CharSequence charSequence2 = this.f9797y;
                canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, round2 - this.f9761J.descent(), this.f9761J);
                if (this.f9754C == null) {
                    this.f9754C = new Paint(3);
                }
            }
        }
    }

    /* renamed from: o */
    private int m10599o(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f9759H;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    /* renamed from: p */
    private int m10600p() {
        return m10599o(this.f9783k);
    }

    /* renamed from: s */
    private void m10601s(TextPaint textPaint) {
        textPaint.setTextSize(this.f9782j);
        textPaint.setTypeface(this.f9791s);
    }

    /* renamed from: t */
    private void m10602t(TextPaint textPaint) {
        textPaint.setTextSize(this.f9781i);
        textPaint.setTypeface(this.f9792t);
    }

    /* renamed from: u */
    private void m10603u(float f10) {
        this.f9778f.left = m10605x(this.f9776d.left, this.f9777e.left, f10, this.f9763L);
        this.f9778f.top = m10605x(this.f9785m, this.f9786n, f10, this.f9763L);
        this.f9778f.right = m10605x(this.f9776d.right, this.f9777e.right, f10, this.f9763L);
        this.f9778f.bottom = m10605x(this.f9776d.bottom, this.f9777e.bottom, f10, this.f9763L);
    }

    /* renamed from: v */
    private static boolean m10604v(float f10, float f11) {
        if (Math.abs(f10 - f11) < 0.001f) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    private static float m10605x(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return AbstractC4346a.m18242a(f10, f11, f12);
    }

    /* renamed from: B */
    public void m10606B(int i10, int i11, int i12, int i13) {
        if (!m10587A(this.f9777e, i10, i11, i12, i13)) {
            this.f9777e.set(i10, i11, i12, i13);
            this.f9760I = true;
            m10632y();
        }
    }

    /* renamed from: C */
    public void m10607C(Rect rect) {
        m10606B(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: D */
    public void m10608D(int i10) {
        C6217d c6217d = new C6217d(this.f9773a.getContext(), i10);
        ColorStateList colorStateList = c6217d.f24393b;
        if (colorStateList != null) {
            this.f9784l = colorStateList;
        }
        float f10 = c6217d.f24392a;
        if (f10 != 0.0f) {
            this.f9782j = f10;
        }
        ColorStateList colorStateList2 = c6217d.f24400i;
        if (colorStateList2 != null) {
            this.f9768Q = colorStateList2;
        }
        this.f9766O = c6217d.f24401j;
        this.f9767P = c6217d.f24402k;
        this.f9765N = c6217d.f24403l;
        C6214a c6214a = this.f9795w;
        if (c6214a != null) {
            c6214a.m24786c();
        }
        this.f9795w = new C6214a(new a(), c6217d.m24801e());
        c6217d.m24804h(this.f9773a.getContext(), this.f9795w);
        m10633z();
    }

    /* renamed from: E */
    public void m10609E(ColorStateList colorStateList) {
        if (this.f9784l != colorStateList) {
            this.f9784l = colorStateList;
            m10633z();
        }
    }

    /* renamed from: F */
    public void m10610F(int i10) {
        if (this.f9780h != i10) {
            this.f9780h = i10;
            m10633z();
        }
    }

    /* renamed from: G */
    public void m10611G(Typeface typeface) {
        if (m10588H(typeface)) {
            m10633z();
        }
    }

    /* renamed from: I */
    public void m10612I(int i10, int i11, int i12, int i13) {
        if (!m10587A(this.f9776d, i10, i11, i12, i13)) {
            this.f9776d.set(i10, i11, i12, i13);
            this.f9760I = true;
            m10632y();
        }
    }

    /* renamed from: J */
    public void m10613J(Rect rect) {
        m10612I(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: K */
    public void m10614K(ColorStateList colorStateList) {
        if (this.f9783k != colorStateList) {
            this.f9783k = colorStateList;
            m10633z();
        }
    }

    /* renamed from: L */
    public void m10615L(int i10) {
        if (this.f9779g != i10) {
            this.f9779g = i10;
            m10633z();
        }
    }

    /* renamed from: M */
    public void m10616M(float f10) {
        if (this.f9781i != f10) {
            this.f9781i = f10;
            m10633z();
        }
    }

    /* renamed from: O */
    public void m10617O(float f10) {
        float m25817a = AbstractC6605a.m25817a(f10, 0.0f, 1.0f);
        if (m25817a != this.f9775c) {
            this.f9775c = m25817a;
            m10593d();
        }
    }

    /* renamed from: Q */
    public void m10618Q(TimeInterpolator timeInterpolator) {
        this.f9763L = timeInterpolator;
        m10633z();
    }

    /* renamed from: R */
    public final boolean m10619R(int[] iArr) {
        this.f9759H = iArr;
        if (m10631w()) {
            m10633z();
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public void m10620S(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f9796x, charSequence)) {
            this.f9796x = charSequence;
            this.f9797y = null;
            m10597h();
            m10633z();
        }
    }

    /* renamed from: T */
    public void m10621T(TimeInterpolator timeInterpolator) {
        this.f9764M = timeInterpolator;
        m10633z();
    }

    /* renamed from: U */
    public void m10622U(Typeface typeface) {
        boolean m10588H = m10588H(typeface);
        boolean m10589N = m10589N(typeface);
        if (m10588H || m10589N) {
            m10633z();
        }
    }

    /* renamed from: c */
    public float m10623c() {
        if (this.f9796x == null) {
            return 0.0f;
        }
        m10601s(this.f9762K);
        TextPaint textPaint = this.f9762K;
        CharSequence charSequence = this.f9796x;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: i */
    public void m10624i(Canvas canvas) {
        boolean z10;
        float ascent;
        int save = canvas.save();
        if (this.f9797y != null && this.f9774b) {
            float f10 = this.f9789q;
            float f11 = this.f9790r;
            if (this.f9752A && this.f9753B != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                ascent = this.f9755D * this.f9757F;
            } else {
                ascent = this.f9761J.ascent() * this.f9757F;
                this.f9761J.descent();
            }
            if (z10) {
                f11 += ascent;
            }
            float f12 = f11;
            float f13 = this.f9757F;
            if (f13 != 1.0f) {
                canvas.scale(f13, f13, f10, f12);
            }
            if (z10) {
                canvas.drawBitmap(this.f9753B, f10, f12, this.f9754C);
            } else {
                CharSequence charSequence = this.f9797y;
                canvas.drawText(charSequence, 0, charSequence.length(), f10, f12, this.f9761J);
            }
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: k */
    public void m10625k(RectF rectF) {
        float m10623c;
        float f10;
        boolean m10594e = m10594e(this.f9796x);
        Rect rect = this.f9777e;
        if (!m10594e) {
            m10623c = rect.left;
        } else {
            m10623c = rect.right - m10623c();
        }
        rectF.left = m10623c;
        Rect rect2 = this.f9777e;
        rectF.top = rect2.top;
        if (!m10594e) {
            f10 = m10623c + m10623c();
        } else {
            f10 = rect2.right;
        }
        rectF.right = f10;
        rectF.bottom = this.f9777e.top + m10627m();
    }

    /* renamed from: l */
    public ColorStateList m10626l() {
        return this.f9784l;
    }

    /* renamed from: m */
    public float m10627m() {
        m10601s(this.f9762K);
        return -this.f9762K.ascent();
    }

    /* renamed from: n */
    public int m10628n() {
        return m10599o(this.f9784l);
    }

    /* renamed from: q */
    public float m10629q() {
        m10602t(this.f9762K);
        return -this.f9762K.ascent();
    }

    /* renamed from: r */
    public float m10630r() {
        return this.f9775c;
    }

    /* renamed from: w */
    public final boolean m10631w() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f9784l;
        if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f9783k) != null && colorStateList.isStateful())) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    void m10632y() {
        boolean z10;
        if (this.f9777e.width() > 0 && this.f9777e.height() > 0 && this.f9776d.width() > 0 && this.f9776d.height() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9774b = z10;
    }

    /* renamed from: z */
    public void m10633z() {
        if (this.f9773a.getHeight() > 0 && this.f9773a.getWidth() > 0) {
            m10592b();
            m10593d();
        }
    }
}
