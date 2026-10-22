package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.appcompat.widget.AbstractC0431p;
import androidx.core.view.AbstractC0616q0;
import com.google.android.material.R$attr;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.AbstractC2589g;
import p188j5.AbstractC4995a;
import p282p5.AbstractC6216c;
import p290q.AbstractC6306k;
import p296q5.AbstractC6345b;
import p296q5.C6344a;
import p326s5.C6686i;
import p326s5.C6690m;
import p326s5.InterfaceC6693p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.button.c */
/* loaded from: classes.dex */
public class C2538c {

    /* renamed from: s */
    private static final boolean f9500s;

    /* renamed from: a */
    private final MaterialButton f9501a;

    /* renamed from: b */
    private C6690m f9502b;

    /* renamed from: c */
    private int f9503c;

    /* renamed from: d */
    private int f9504d;

    /* renamed from: e */
    private int f9505e;

    /* renamed from: f */
    private int f9506f;

    /* renamed from: g */
    private int f9507g;

    /* renamed from: h */
    private int f9508h;

    /* renamed from: i */
    private PorterDuff.Mode f9509i;

    /* renamed from: j */
    private ColorStateList f9510j;

    /* renamed from: k */
    private ColorStateList f9511k;

    /* renamed from: l */
    private ColorStateList f9512l;

    /* renamed from: m */
    private Drawable f9513m;

    /* renamed from: n */
    private boolean f9514n = false;

    /* renamed from: o */
    private boolean f9515o = false;

    /* renamed from: p */
    private boolean f9516p = false;

    /* renamed from: q */
    private boolean f9517q;

    /* renamed from: r */
    private LayerDrawable f9518r;

    static {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        f9500s = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2538c(MaterialButton materialButton, C6690m c6690m) {
        this.f9501a = materialButton;
        this.f9502b = c6690m;
    }

    /* renamed from: A */
    private void m10237A(C6690m c6690m) {
        if (m10246d() != null) {
            m10246d().setShapeAppearanceModel(c6690m);
        }
        if (m10242l() != null) {
            m10242l().setShapeAppearanceModel(c6690m);
        }
        if (m10245c() != null) {
            m10245c().setShapeAppearanceModel(c6690m);
        }
    }

    /* renamed from: C */
    private void m10238C() {
        int i10;
        C6686i m10246d = m10246d();
        C6686i m10242l = m10242l();
        if (m10246d != null) {
            m10246d.m26101W(this.f9508h, this.f9511k);
            if (m10242l != null) {
                float f10 = this.f9508h;
                if (this.f9514n) {
                    i10 = AbstractC4995a.m20373c(this.f9501a, R$attr.colorSurface);
                } else {
                    i10 = 0;
                }
                m10242l.m26100V(f10, i10);
            }
        }
    }

    /* renamed from: D */
    private InsetDrawable m10239D(Drawable drawable) {
        return new InsetDrawable(drawable, this.f9503c, this.f9505e, this.f9504d, this.f9506f);
    }

    /* renamed from: a */
    private Drawable m10240a() {
        int i10;
        C6686i c6686i = new C6686i(this.f9502b);
        c6686i.m26092J(this.f9501a.getContext());
        AbstractC6306k.m25069o(c6686i, this.f9510j);
        PorterDuff.Mode mode = this.f9509i;
        if (mode != null) {
            AbstractC6306k.m25070p(c6686i, mode);
        }
        c6686i.m26101W(this.f9508h, this.f9511k);
        C6686i c6686i2 = new C6686i(this.f9502b);
        c6686i2.setTint(0);
        float f10 = this.f9508h;
        if (this.f9514n) {
            i10 = AbstractC4995a.m20373c(this.f9501a, R$attr.colorSurface);
        } else {
            i10 = 0;
        }
        c6686i2.m26100V(f10, i10);
        if (f9500s) {
            C6686i c6686i3 = new C6686i(this.f9502b);
            this.f9513m = c6686i3;
            AbstractC6306k.m25068n(c6686i3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(AbstractC6345b.m25126a(this.f9512l), m10239D(new LayerDrawable(new Drawable[]{c6686i2, c6686i})), this.f9513m);
            this.f9518r = rippleDrawable;
            return rippleDrawable;
        }
        C6344a c6344a = new C6344a(this.f9502b);
        this.f9513m = c6344a;
        AbstractC6306k.m25069o(c6344a, AbstractC6345b.m25126a(this.f9512l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c6686i2, c6686i, this.f9513m});
        this.f9518r = layerDrawable;
        return m10239D(layerDrawable);
    }

    /* renamed from: e */
    private C6686i m10241e(boolean z10) {
        LayerDrawable layerDrawable = this.f9518r;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 0) {
            if (f9500s) {
                return (C6686i) ((LayerDrawable) ((InsetDrawable) this.f9518r.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0);
            }
            return (C6686i) this.f9518r.getDrawable(!z10 ? 1 : 0);
        }
        return null;
    }

    /* renamed from: l */
    private C6686i m10242l() {
        return m10241e(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public void m10243B(int i10, int i11) {
        Drawable drawable = this.f9513m;
        if (drawable != null) {
            drawable.setBounds(this.f9503c, this.f9505e, i11 - this.f9504d, i10 - this.f9506f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m10244b() {
        return this.f9507g;
    }

    /* renamed from: c */
    public InterfaceC6693p m10245c() {
        LayerDrawable layerDrawable = this.f9518r;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 1) {
            if (this.f9518r.getNumberOfLayers() > 2) {
                return (InterfaceC6693p) this.f9518r.getDrawable(2);
            }
            return (InterfaceC6693p) this.f9518r.getDrawable(1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C6686i m10246d() {
        return m10241e(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public ColorStateList m10247f() {
        return this.f9512l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C6690m m10248g() {
        return this.f9502b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public ColorStateList m10249h() {
        return this.f9511k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m10250i() {
        return this.f9508h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public ColorStateList m10251j() {
        return this.f9510j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public PorterDuff.Mode m10252k() {
        return this.f9509i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean m10253m() {
        return this.f9515o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean m10254n() {
        return this.f9517q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m10255o(TypedArray typedArray) {
        this.f9503c = typedArray.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetLeft, 0);
        this.f9504d = typedArray.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetRight, 0);
        this.f9505e = typedArray.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetTop, 0);
        this.f9506f = typedArray.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetBottom, 0);
        int i10 = R$styleable.MaterialButton_cornerRadius;
        if (typedArray.hasValue(i10)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i10, -1);
            this.f9507g = dimensionPixelSize;
            m10261u(this.f9502b.m26145w(dimensionPixelSize));
            this.f9516p = true;
        }
        this.f9508h = typedArray.getDimensionPixelSize(R$styleable.MaterialButton_strokeWidth, 0);
        this.f9509i = AbstractC2589g.m10664c(typedArray.getInt(R$styleable.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f9510j = AbstractC6216c.m24791a(this.f9501a.getContext(), typedArray, R$styleable.MaterialButton_backgroundTint);
        this.f9511k = AbstractC6216c.m24791a(this.f9501a.getContext(), typedArray, R$styleable.MaterialButton_strokeColor);
        this.f9512l = AbstractC6216c.m24791a(this.f9501a.getContext(), typedArray, R$styleable.MaterialButton_rippleColor);
        this.f9517q = typedArray.getBoolean(R$styleable.MaterialButton_android_checkable, false);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(R$styleable.MaterialButton_elevation, 0);
        int m2589G = AbstractC0616q0.m2589G(this.f9501a);
        int paddingTop = this.f9501a.getPaddingTop();
        int m2587F = AbstractC0616q0.m2587F(this.f9501a);
        int paddingBottom = this.f9501a.getPaddingBottom();
        this.f9501a.setInternalBackground(m10240a());
        C6686i m10246d = m10246d();
        if (m10246d != null) {
            m10246d.m26095Q(dimensionPixelSize2);
        }
        AbstractC0616q0.m2660z0(this.f9501a, m2589G + this.f9503c, paddingTop + this.f9505e, m2587F + this.f9504d, paddingBottom + this.f9506f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m10256p(int i10) {
        if (m10246d() != null) {
            m10246d().setTint(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m10257q() {
        this.f9515o = true;
        this.f9501a.setSupportBackgroundTintList(this.f9510j);
        this.f9501a.setSupportBackgroundTintMode(this.f9509i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m10258r(boolean z10) {
        this.f9517q = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m10259s(int i10) {
        if (!this.f9516p || this.f9507g != i10) {
            this.f9507g = i10;
            this.f9516p = true;
            m10261u(this.f9502b.m26145w(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m10260t(ColorStateList colorStateList) {
        if (this.f9512l != colorStateList) {
            this.f9512l = colorStateList;
            boolean z10 = f9500s;
            if (z10 && AbstractC0431p.m1846a(this.f9501a.getBackground())) {
                AbstractC2536a.m10235a(this.f9501a.getBackground()).setColor(AbstractC6345b.m25126a(colorStateList));
            } else if (!z10 && (this.f9501a.getBackground() instanceof C6344a)) {
                ((C6344a) this.f9501a.getBackground()).setTintList(AbstractC6345b.m25126a(colorStateList));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m10261u(C6690m c6690m) {
        this.f9502b = c6690m;
        m10237A(c6690m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m10262v(boolean z10) {
        this.f9514n = z10;
        m10238C();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m10263w(ColorStateList colorStateList) {
        if (this.f9511k != colorStateList) {
            this.f9511k = colorStateList;
            m10238C();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m10264x(int i10) {
        if (this.f9508h != i10) {
            this.f9508h = i10;
            m10238C();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m10265y(ColorStateList colorStateList) {
        if (this.f9510j != colorStateList) {
            this.f9510j = colorStateList;
            if (m10246d() != null) {
                AbstractC6306k.m25069o(m10246d(), this.f9510j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m10266z(PorterDuff.Mode mode) {
        if (this.f9509i != mode) {
            this.f9509i = mode;
            if (m10246d() != null && this.f9509i != null) {
                AbstractC6306k.m25070p(m10246d(), this.f9509i);
            }
        }
    }
}
