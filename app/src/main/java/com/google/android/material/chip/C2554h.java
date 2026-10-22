package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.AbstractC2588f;
import com.google.android.material.internal.C2587e;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p106e.AbstractC4105b;
import p144g5.C4348c;
import p156h5.AbstractC4548b;
import p220l5.AbstractC5420a;
import p276p.AbstractC6128a;
import p282p5.AbstractC6216c;
import p282p5.C6217d;
import p290q.AbstractC6306k;
import p296q5.AbstractC6345b;
import p326s5.C6686i;
import p360v.C7170a;

/* renamed from: com.google.android.material.chip.h */
/* loaded from: classes.dex */
public class C2554h extends C6686i implements Drawable.Callback, C2587e.b {

    /* renamed from: R0 */
    private static final int[] f9551R0 = {R.attr.state_enabled};

    /* renamed from: S0 */
    private static final ShapeDrawable f9552S0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A */
    private ColorStateList f9553A;

    /* renamed from: A0 */
    private int f9554A0;

    /* renamed from: B */
    private float f9555B;

    /* renamed from: B0 */
    private int f9556B0;

    /* renamed from: C */
    private ColorStateList f9557C;

    /* renamed from: C0 */
    private boolean f9558C0;

    /* renamed from: D */
    private CharSequence f9559D;

    /* renamed from: D0 */
    private int f9560D0;

    /* renamed from: E */
    private boolean f9561E;

    /* renamed from: E0 */
    private int f9562E0;

    /* renamed from: F */
    private Drawable f9563F;

    /* renamed from: F0 */
    private ColorFilter f9564F0;

    /* renamed from: G */
    private ColorStateList f9565G;

    /* renamed from: G0 */
    private PorterDuffColorFilter f9566G0;

    /* renamed from: H */
    private float f9567H;

    /* renamed from: H0 */
    private ColorStateList f9568H0;

    /* renamed from: I */
    private boolean f9569I;

    /* renamed from: I0 */
    private PorterDuff.Mode f9570I0;

    /* renamed from: J */
    private boolean f9571J;

    /* renamed from: J0 */
    private int[] f9572J0;

    /* renamed from: K */
    private Drawable f9573K;

    /* renamed from: K0 */
    private boolean f9574K0;

    /* renamed from: L */
    private Drawable f9575L;

    /* renamed from: L0 */
    private ColorStateList f9576L0;

    /* renamed from: M */
    private ColorStateList f9577M;

    /* renamed from: M0 */
    private WeakReference f9578M0;

    /* renamed from: N */
    private float f9579N;

    /* renamed from: N0 */
    private TextUtils.TruncateAt f9580N0;

    /* renamed from: O */
    private CharSequence f9581O;

    /* renamed from: O0 */
    private boolean f9582O0;

    /* renamed from: P0 */
    private int f9583P0;

    /* renamed from: Q0 */
    private boolean f9584Q0;

    /* renamed from: V */
    private boolean f9585V;

    /* renamed from: W */
    private boolean f9586W;

    /* renamed from: X */
    private Drawable f9587X;

    /* renamed from: Y */
    private C4348c f9588Y;

    /* renamed from: Z */
    private C4348c f9589Z;

    /* renamed from: g0 */
    private float f9590g0;

    /* renamed from: h0 */
    private float f9591h0;

    /* renamed from: i0 */
    private float f9592i0;

    /* renamed from: j0 */
    private float f9593j0;

    /* renamed from: k0 */
    private float f9594k0;

    /* renamed from: l0 */
    private float f9595l0;

    /* renamed from: m0 */
    private float f9596m0;

    /* renamed from: n0 */
    private float f9597n0;

    /* renamed from: o0 */
    private final Context f9598o0;

    /* renamed from: p0 */
    private final Paint f9599p0;

    /* renamed from: q0 */
    private final Paint f9600q0;

    /* renamed from: r0 */
    private final Paint.FontMetrics f9601r0;

    /* renamed from: s0 */
    private final RectF f9602s0;

    /* renamed from: t0 */
    private final PointF f9603t0;

    /* renamed from: u0 */
    private final Path f9604u0;

    /* renamed from: v0 */
    private final C2587e f9605v0;

    /* renamed from: w */
    private ColorStateList f9606w;

    /* renamed from: w0 */
    private int f9607w0;

    /* renamed from: x */
    private ColorStateList f9608x;

    /* renamed from: x0 */
    private int f9609x0;

    /* renamed from: y */
    private float f9610y;

    /* renamed from: y0 */
    private int f9611y0;

    /* renamed from: z */
    private float f9612z;

    /* renamed from: z0 */
    private int f9613z0;

    /* renamed from: com.google.android.material.chip.h$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo10289a();
    }

    private C2554h(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f9599p0 = new Paint(1);
        this.f9601r0 = new Paint.FontMetrics();
        this.f9602s0 = new RectF();
        this.f9603t0 = new PointF();
        this.f9604u0 = new Path();
        this.f9562E0 = 255;
        this.f9570I0 = PorterDuff.Mode.SRC_IN;
        this.f9578M0 = new WeakReference(null);
        m26092J(context);
        this.f9598o0 = context;
        C2587e c2587e = new C2587e(this);
        this.f9605v0 = c2587e;
        this.f9559D = "";
        c2587e.m10644e().density = context.getResources().getDisplayMetrics().density;
        this.f9600q0 = null;
        int[] iArr = f9551R0;
        setState(iArr);
        m10394Y1(iArr);
        this.f9582O0 = true;
        if (AbstractC6345b.f24692a) {
            f9552S0.setTint(-1);
        }
    }

    /* renamed from: A2 */
    private boolean m10314A2() {
        if (this.f9561E && this.f9563F != null) {
            return true;
        }
        return false;
    }

    /* renamed from: B2 */
    private boolean m10315B2() {
        if (this.f9571J && this.f9573K != null) {
            return true;
        }
        return false;
    }

    /* renamed from: C2 */
    private void m10316C2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: D2 */
    private void m10317D2() {
        ColorStateList colorStateList;
        if (this.f9574K0) {
            colorStateList = AbstractC6345b.m25126a(this.f9557C);
        } else {
            colorStateList = null;
        }
        this.f9576L0 = colorStateList;
    }

    /* renamed from: E2 */
    private void m10318E2() {
        this.f9575L = new RippleDrawable(AbstractC6345b.m25126a(m10385U0()), this.f9573K, f9552S0);
    }

    /* renamed from: O1 */
    private void m10319O1(ColorStateList colorStateList) {
        if (this.f9606w != colorStateList) {
            this.f9606w = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: a1 */
    private ColorFilter m10320a1() {
        ColorFilter colorFilter = this.f9564F0;
        if (colorFilter == null) {
            return this.f9566G0;
        }
        return colorFilter;
    }

    /* renamed from: c0 */
    private void m10321c0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        AbstractC6306k.m25067m(drawable, AbstractC6306k.m25060f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f9573K) {
            if (drawable.isStateful()) {
                drawable.setState(m10372N0());
            }
            AbstractC6306k.m25069o(drawable, this.f9577M);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.f9563F;
        if (drawable == drawable2 && this.f9569I) {
            AbstractC6306k.m25069o(drawable2, this.f9565G);
        }
    }

    /* renamed from: c1 */
    private static boolean m10322c1(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d0 */
    private void m10323d0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m10314A2() || m10345z2()) {
            float f10 = this.f9590g0 + this.f9591h0;
            if (AbstractC6306k.m25060f(this) == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + this.f9567H;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - this.f9567H;
            }
            float exactCenterY = rect.exactCenterY();
            float f13 = this.f9567H;
            float f14 = exactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    /* renamed from: f0 */
    private void m10324f0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (m10315B2()) {
            float f10 = this.f9597n0 + this.f9596m0 + this.f9579N + this.f9595l0 + this.f9594k0;
            if (AbstractC6306k.m25060f(this) == 0) {
                rectF.right = rect.right - f10;
            } else {
                rectF.left = rect.left + f10;
            }
        }
    }

    /* renamed from: g0 */
    private void m10325g0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m10315B2()) {
            float f10 = this.f9597n0 + this.f9596m0;
            if (AbstractC6306k.m25060f(this) == 0) {
                float f11 = rect.right - f10;
                rectF.right = f11;
                rectF.left = f11 - this.f9579N;
            } else {
                float f12 = rect.left + f10;
                rectF.left = f12;
                rectF.right = f12 + this.f9579N;
            }
            float exactCenterY = rect.exactCenterY();
            float f13 = this.f9579N;
            float f14 = exactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    /* renamed from: g1 */
    private static boolean m10326g1(ColorStateList colorStateList) {
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    /* renamed from: h0 */
    private void m10327h0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m10315B2()) {
            float f10 = this.f9597n0 + this.f9596m0 + this.f9579N + this.f9595l0 + this.f9594k0;
            if (AbstractC6306k.m25060f(this) == 0) {
                float f11 = rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i10 = rect.left;
                rectF.left = i10;
                rectF.right = i10 + f10;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* renamed from: h1 */
    private static boolean m10328h1(Drawable drawable) {
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    /* renamed from: i1 */
    private static boolean m10329i1(C6217d c6217d) {
        ColorStateList colorStateList;
        if (c6217d != null && (colorStateList = c6217d.f24393b) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    /* renamed from: j0 */
    private void m10330j0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f9559D != null) {
            float m10404e0 = this.f9590g0 + m10404e0() + this.f9593j0;
            float m10411i0 = this.f9597n0 + m10411i0() + this.f9594k0;
            if (AbstractC6306k.m25060f(this) == 0) {
                rectF.left = rect.left + m10404e0;
                rectF.right = rect.right - m10411i0;
            } else {
                rectF.left = rect.left + m10411i0;
                rectF.right = rect.right - m10404e0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* renamed from: j1 */
    private void m10331j1(AttributeSet attributeSet, int i10, int i11) {
        TypedArray m10660k = AbstractC2588f.m10660k(this.f9598o0, attributeSet, R$styleable.f9369y, i10, i11, new int[0]);
        this.f9584Q0 = m10660k.hasValue(R$styleable.Chip_shapeAppearance);
        m10319O1(AbstractC6216c.m24791a(this.f9598o0, m10660k, R$styleable.Chip_chipSurfaceColor));
        m10430s1(AbstractC6216c.m24791a(this.f9598o0, m10660k, R$styleable.Chip_chipBackgroundColor));
        m10359G1(m10660k.getDimension(R$styleable.Chip_chipMinHeight, 0.0f));
        int i12 = R$styleable.Chip_chipCornerRadius;
        if (m10660k.hasValue(i12)) {
            m10434u1(m10660k.getDimension(i12, 0.0f));
        }
        m10367K1(AbstractC6216c.m24791a(this.f9598o0, m10660k, R$styleable.Chip_chipStrokeColor));
        m10371M1(m10660k.getDimension(R$styleable.Chip_chipStrokeWidth, 0.0f));
        m10417l2(AbstractC6216c.m24791a(this.f9598o0, m10660k, R$styleable.Chip_rippleColor));
        m10427q2(m10660k.getText(R$styleable.Chip_android_text));
        m10429r2(AbstractC6216c.m24796f(this.f9598o0, m10660k, R$styleable.Chip_android_textAppearance));
        int i13 = m10660k.getInt(R$styleable.Chip_android_ellipsize, 0);
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 == 3) {
                    m10403d2(TextUtils.TruncateAt.END);
                }
            } else {
                m10403d2(TextUtils.TruncateAt.MIDDLE);
            }
        } else {
            m10403d2(TextUtils.TruncateAt.START);
        }
        m10357F1(m10660k.getBoolean(R$styleable.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            m10357F1(m10660k.getBoolean(R$styleable.Chip_chipIconEnabled, false));
        }
        m10444y1(AbstractC6216c.m24794d(this.f9598o0, m10660k, R$styleable.Chip_chipIcon));
        int i14 = R$styleable.Chip_chipIconTint;
        if (m10660k.hasValue(i14)) {
            m10351C1(AbstractC6216c.m24791a(this.f9598o0, m10660k, i14));
        }
        m10347A1(m10660k.getDimension(R$styleable.Chip_chipIconSize, 0.0f));
        m10400b2(m10660k.getBoolean(R$styleable.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            m10400b2(m10660k.getBoolean(R$styleable.Chip_closeIconEnabled, false));
        }
        m10376P1(AbstractC6216c.m24794d(this.f9598o0, m10660k, R$styleable.Chip_closeIcon));
        m10396Z1(AbstractC6216c.m24791a(this.f9598o0, m10660k, R$styleable.Chip_closeIconTint));
        m10386U1(m10660k.getDimension(R$styleable.Chip_closeIconSize, 0.0f));
        m10418m1(m10660k.getBoolean(R$styleable.Chip_android_checkable, false));
        m10428r1(m10660k.getBoolean(R$styleable.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            m10428r1(m10660k.getBoolean(R$styleable.Chip_checkedIconEnabled, false));
        }
        m10422o1(AbstractC6216c.m24794d(this.f9598o0, m10660k, R$styleable.Chip_checkedIcon));
        m10423o2(C4348c.m18245b(this.f9598o0, m10660k, R$styleable.Chip_showMotionSpec));
        m10406e2(C4348c.m18245b(this.f9598o0, m10660k, R$styleable.Chip_hideMotionSpec));
        m10363I1(m10660k.getDimension(R$styleable.Chip_chipStartPadding, 0.0f));
        m10412i2(m10660k.getDimension(R$styleable.Chip_iconStartPadding, 0.0f));
        m10409g2(m10660k.getDimension(R$styleable.Chip_iconEndPadding, 0.0f));
        m10437v2(m10660k.getDimension(R$styleable.Chip_textStartPadding, 0.0f));
        m10433t2(m10660k.getDimension(R$styleable.Chip_textEndPadding, 0.0f));
        m10390W1(m10660k.getDimension(R$styleable.Chip_closeIconStartPadding, 0.0f));
        m10380R1(m10660k.getDimension(R$styleable.Chip_closeIconEndPadding, 0.0f));
        m10438w1(m10660k.getDimension(R$styleable.Chip_chipEndPadding, 0.0f));
        m10415k2(m10660k.getDimensionPixelSize(R$styleable.Chip_android_maxWidth, Integer.MAX_VALUE));
        m10660k.recycle();
    }

    /* renamed from: k0 */
    private float m10332k0() {
        this.f9605v0.m10644e().getFontMetrics(this.f9601r0);
        Paint.FontMetrics fontMetrics = this.f9601r0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e2  */
    /* renamed from: l1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m10333l1(int[] r7, int[] r8) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C2554h.m10333l1(int[], int[]):boolean");
    }

    /* renamed from: m0 */
    private boolean m10334m0() {
        if (this.f9586W && this.f9587X != null && this.f9585V) {
            return true;
        }
        return false;
    }

    /* renamed from: n0 */
    public static C2554h m10335n0(Context context, AttributeSet attributeSet, int i10, int i11) {
        C2554h c2554h = new C2554h(context, attributeSet, i10, i11);
        c2554h.m10331j1(attributeSet, i10, i11);
        return c2554h;
    }

    /* renamed from: o0 */
    private void m10336o0(Canvas canvas, Rect rect) {
        if (m10345z2()) {
            m10323d0(rect, this.f9602s0);
            RectF rectF = this.f9602s0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f9587X.setBounds(0, 0, (int) this.f9602s0.width(), (int) this.f9602s0.height());
            this.f9587X.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    /* renamed from: p0 */
    private void m10337p0(Canvas canvas, Rect rect) {
        if (!this.f9584Q0) {
            this.f9599p0.setColor(this.f9609x0);
            this.f9599p0.setStyle(Paint.Style.FILL);
            this.f9599p0.setColorFilter(m10320a1());
            this.f9602s0.set(rect);
            canvas.drawRoundRect(this.f9602s0, m10446z0(), m10446z0(), this.f9599p0);
        }
    }

    /* renamed from: q0 */
    private void m10338q0(Canvas canvas, Rect rect) {
        if (m10314A2()) {
            m10323d0(rect, this.f9602s0);
            RectF rectF = this.f9602s0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f9563F.setBounds(0, 0, (int) this.f9602s0.width(), (int) this.f9602s0.height());
            this.f9563F.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    /* renamed from: r0 */
    private void m10339r0(Canvas canvas, Rect rect) {
        if (this.f9555B > 0.0f && !this.f9584Q0) {
            this.f9599p0.setColor(this.f9613z0);
            this.f9599p0.setStyle(Paint.Style.STROKE);
            if (!this.f9584Q0) {
                this.f9599p0.setColorFilter(m10320a1());
            }
            RectF rectF = this.f9602s0;
            float f10 = rect.left;
            float f11 = this.f9555B;
            rectF.set(f10 + (f11 / 2.0f), rect.top + (f11 / 2.0f), rect.right - (f11 / 2.0f), rect.bottom - (f11 / 2.0f));
            float f12 = this.f9612z - (this.f9555B / 2.0f);
            canvas.drawRoundRect(this.f9602s0, f12, f12, this.f9599p0);
        }
    }

    /* renamed from: s0 */
    private void m10340s0(Canvas canvas, Rect rect) {
        if (!this.f9584Q0) {
            this.f9599p0.setColor(this.f9607w0);
            this.f9599p0.setStyle(Paint.Style.FILL);
            this.f9602s0.set(rect);
            canvas.drawRoundRect(this.f9602s0, m10446z0(), m10446z0(), this.f9599p0);
        }
    }

    /* renamed from: t0 */
    private void m10341t0(Canvas canvas, Rect rect) {
        if (m10315B2()) {
            m10325g0(rect, this.f9602s0);
            RectF rectF = this.f9602s0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f9573K.setBounds(0, 0, (int) this.f9602s0.width(), (int) this.f9602s0.height());
            if (AbstractC6345b.f24692a) {
                this.f9575L.setBounds(this.f9573K.getBounds());
                this.f9575L.jumpToCurrentState();
                this.f9575L.draw(canvas);
            } else {
                this.f9573K.draw(canvas);
            }
            canvas.translate(-f10, -f11);
        }
    }

    /* renamed from: u0 */
    private void m10342u0(Canvas canvas, Rect rect) {
        this.f9599p0.setColor(this.f9554A0);
        this.f9599p0.setStyle(Paint.Style.FILL);
        this.f9602s0.set(rect);
        if (!this.f9584Q0) {
            canvas.drawRoundRect(this.f9602s0, m10446z0(), m10446z0(), this.f9599p0);
        } else {
            m26104g(new RectF(rect), this.f9604u0);
            super.m26105o(canvas, this.f9599p0, this.f9604u0, m26108t());
        }
    }

    /* renamed from: v0 */
    private void m10343v0(Canvas canvas, Rect rect) {
        Paint paint = this.f9600q0;
        if (paint != null) {
            paint.setColor(AbstractC6128a.m24427f(-16777216, 127));
            canvas.drawRect(rect, this.f9600q0);
            if (m10314A2() || m10345z2()) {
                m10323d0(rect, this.f9602s0);
                canvas.drawRect(this.f9602s0, this.f9600q0);
            }
            if (this.f9559D != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f9600q0);
            }
            if (m10315B2()) {
                m10325g0(rect, this.f9602s0);
                canvas.drawRect(this.f9602s0, this.f9600q0);
            }
            this.f9600q0.setColor(AbstractC6128a.m24427f(-65536, 127));
            m10324f0(rect, this.f9602s0);
            canvas.drawRect(this.f9602s0, this.f9600q0);
            this.f9600q0.setColor(AbstractC6128a.m24427f(-16711936, 127));
            m10327h0(rect, this.f9602s0);
            canvas.drawRect(this.f9602s0, this.f9600q0);
        }
    }

    /* renamed from: w0 */
    private void m10344w0(Canvas canvas, Rect rect) {
        boolean z10;
        if (this.f9559D != null) {
            Paint.Align m10416l0 = m10416l0(rect, this.f9603t0);
            m10330j0(rect, this.f9602s0);
            if (this.f9605v0.m10643d() != null) {
                this.f9605v0.m10644e().drawableState = getState();
                this.f9605v0.m10649j(this.f9598o0);
            }
            this.f9605v0.m10644e().setTextAlign(m10416l0);
            int i10 = 0;
            if (Math.round(this.f9605v0.m10645f(m10389W0().toString())) > Math.round(this.f9602s0.width())) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i10 = canvas.save();
                canvas.clipRect(this.f9602s0);
            }
            CharSequence charSequence = this.f9559D;
            if (z10 && this.f9580N0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f9605v0.m10644e(), this.f9602s0.width(), this.f9580N0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f9603t0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f9605v0.m10644e());
            if (z10) {
                canvas.restoreToCount(i10);
            }
        }
    }

    /* renamed from: z2 */
    private boolean m10345z2() {
        if (this.f9586W && this.f9587X != null && this.f9558C0) {
            return true;
        }
        return false;
    }

    /* renamed from: A0 */
    public float m10346A0() {
        return this.f9597n0;
    }

    /* renamed from: A1 */
    public void m10347A1(float f10) {
        if (this.f9567H != f10) {
            float m10404e0 = m10404e0();
            this.f9567H = f10;
            float m10404e02 = m10404e0();
            invalidateSelf();
            if (m10404e0 != m10404e02) {
                m10414k1();
            }
        }
    }

    /* renamed from: B0 */
    public Drawable m10348B0() {
        Drawable drawable = this.f9563F;
        if (drawable != null) {
            return AbstractC6306k.m25071q(drawable);
        }
        return null;
    }

    /* renamed from: B1 */
    public void m10349B1(int i10) {
        m10347A1(this.f9598o0.getResources().getDimension(i10));
    }

    /* renamed from: C0 */
    public float m10350C0() {
        return this.f9567H;
    }

    /* renamed from: C1 */
    public void m10351C1(ColorStateList colorStateList) {
        this.f9569I = true;
        if (this.f9565G != colorStateList) {
            this.f9565G = colorStateList;
            if (m10314A2()) {
                AbstractC6306k.m25069o(this.f9563F, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: D0 */
    public ColorStateList m10352D0() {
        return this.f9565G;
    }

    /* renamed from: D1 */
    public void m10353D1(int i10) {
        m10351C1(AbstractC4105b.m17169c(this.f9598o0, i10));
    }

    /* renamed from: E0 */
    public float m10354E0() {
        return this.f9610y;
    }

    /* renamed from: E1 */
    public void m10355E1(int i10) {
        m10357F1(this.f9598o0.getResources().getBoolean(i10));
    }

    /* renamed from: F0 */
    public float m10356F0() {
        return this.f9590g0;
    }

    /* renamed from: F1 */
    public void m10357F1(boolean z10) {
        boolean z11;
        if (this.f9561E != z10) {
            boolean m10314A2 = m10314A2();
            this.f9561E = z10;
            boolean m10314A22 = m10314A2();
            if (m10314A2 != m10314A22) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (m10314A22) {
                    m10321c0(this.f9563F);
                } else {
                    m10316C2(this.f9563F);
                }
                invalidateSelf();
                m10414k1();
            }
        }
    }

    /* renamed from: G0 */
    public ColorStateList m10358G0() {
        return this.f9553A;
    }

    /* renamed from: G1 */
    public void m10359G1(float f10) {
        if (this.f9610y != f10) {
            this.f9610y = f10;
            invalidateSelf();
            m10414k1();
        }
    }

    /* renamed from: H0 */
    public float m10360H0() {
        return this.f9555B;
    }

    /* renamed from: H1 */
    public void m10361H1(int i10) {
        m10359G1(this.f9598o0.getResources().getDimension(i10));
    }

    /* renamed from: I0 */
    public Drawable m10362I0() {
        Drawable drawable = this.f9573K;
        if (drawable != null) {
            return AbstractC6306k.m25071q(drawable);
        }
        return null;
    }

    /* renamed from: I1 */
    public void m10363I1(float f10) {
        if (this.f9590g0 != f10) {
            this.f9590g0 = f10;
            invalidateSelf();
            m10414k1();
        }
    }

    /* renamed from: J0 */
    public CharSequence m10364J0() {
        return this.f9581O;
    }

    /* renamed from: J1 */
    public void m10365J1(int i10) {
        m10363I1(this.f9598o0.getResources().getDimension(i10));
    }

    /* renamed from: K0 */
    public float m10366K0() {
        return this.f9596m0;
    }

    /* renamed from: K1 */
    public void m10367K1(ColorStateList colorStateList) {
        if (this.f9553A != colorStateList) {
            this.f9553A = colorStateList;
            if (this.f9584Q0) {
                m26102X(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: L0 */
    public float m10368L0() {
        return this.f9579N;
    }

    /* renamed from: L1 */
    public void m10369L1(int i10) {
        m10367K1(AbstractC4105b.m17169c(this.f9598o0, i10));
    }

    /* renamed from: M0 */
    public float m10370M0() {
        return this.f9595l0;
    }

    /* renamed from: M1 */
    public void m10371M1(float f10) {
        if (this.f9555B != f10) {
            this.f9555B = f10;
            this.f9599p0.setStrokeWidth(f10);
            if (this.f9584Q0) {
                super.m26103Y(f10);
            }
            invalidateSelf();
        }
    }

    /* renamed from: N0 */
    public int[] m10372N0() {
        return this.f9572J0;
    }

    /* renamed from: N1 */
    public void m10373N1(int i10) {
        m10371M1(this.f9598o0.getResources().getDimension(i10));
    }

    /* renamed from: O0 */
    public ColorStateList m10374O0() {
        return this.f9577M;
    }

    /* renamed from: P0 */
    public void m10375P0(RectF rectF) {
        m10327h0(getBounds(), rectF);
    }

    /* renamed from: P1 */
    public void m10376P1(Drawable drawable) {
        Drawable drawable2;
        Drawable m10362I0 = m10362I0();
        if (m10362I0 != drawable) {
            float m10411i0 = m10411i0();
            if (drawable != null) {
                drawable2 = AbstractC6306k.m25072r(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.f9573K = drawable2;
            if (AbstractC6345b.f24692a) {
                m10318E2();
            }
            float m10411i02 = m10411i0();
            m10316C2(m10362I0);
            if (m10315B2()) {
                m10321c0(this.f9573K);
            }
            invalidateSelf();
            if (m10411i0 != m10411i02) {
                m10414k1();
            }
        }
    }

    /* renamed from: Q0 */
    public TextUtils.TruncateAt m10377Q0() {
        return this.f9580N0;
    }

    /* renamed from: Q1 */
    public void m10378Q1(CharSequence charSequence) {
        if (this.f9581O != charSequence) {
            this.f9581O = C7170a.m27771c().m27776h(charSequence);
            invalidateSelf();
        }
    }

    /* renamed from: R0 */
    public C4348c m10379R0() {
        return this.f9589Z;
    }

    /* renamed from: R1 */
    public void m10380R1(float f10) {
        if (this.f9596m0 != f10) {
            this.f9596m0 = f10;
            invalidateSelf();
            if (m10315B2()) {
                m10414k1();
            }
        }
    }

    /* renamed from: S0 */
    public float m10381S0() {
        return this.f9592i0;
    }

    /* renamed from: S1 */
    public void m10382S1(int i10) {
        m10380R1(this.f9598o0.getResources().getDimension(i10));
    }

    /* renamed from: T0 */
    public float m10383T0() {
        return this.f9591h0;
    }

    /* renamed from: T1 */
    public void m10384T1(int i10) {
        m10376P1(AbstractC4105b.m17170d(this.f9598o0, i10));
    }

    /* renamed from: U0 */
    public ColorStateList m10385U0() {
        return this.f9557C;
    }

    /* renamed from: U1 */
    public void m10386U1(float f10) {
        if (this.f9579N != f10) {
            this.f9579N = f10;
            invalidateSelf();
            if (m10315B2()) {
                m10414k1();
            }
        }
    }

    /* renamed from: V0 */
    public C4348c m10387V0() {
        return this.f9588Y;
    }

    /* renamed from: V1 */
    public void m10388V1(int i10) {
        m10386U1(this.f9598o0.getResources().getDimension(i10));
    }

    /* renamed from: W0 */
    public CharSequence m10389W0() {
        return this.f9559D;
    }

    /* renamed from: W1 */
    public void m10390W1(float f10) {
        if (this.f9595l0 != f10) {
            this.f9595l0 = f10;
            invalidateSelf();
            if (m10315B2()) {
                m10414k1();
            }
        }
    }

    /* renamed from: X0 */
    public C6217d m10391X0() {
        return this.f9605v0.m10643d();
    }

    /* renamed from: X1 */
    public void m10392X1(int i10) {
        m10390W1(this.f9598o0.getResources().getDimension(i10));
    }

    /* renamed from: Y0 */
    public float m10393Y0() {
        return this.f9594k0;
    }

    /* renamed from: Y1 */
    public boolean m10394Y1(int[] iArr) {
        if (!Arrays.equals(this.f9572J0, iArr)) {
            this.f9572J0 = iArr;
            if (m10315B2()) {
                return m10333l1(getState(), iArr);
            }
            return false;
        }
        return false;
    }

    /* renamed from: Z0 */
    public float m10395Z0() {
        return this.f9593j0;
    }

    /* renamed from: Z1 */
    public void m10396Z1(ColorStateList colorStateList) {
        if (this.f9577M != colorStateList) {
            this.f9577M = colorStateList;
            if (m10315B2()) {
                AbstractC6306k.m25069o(this.f9573K, colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.internal.C2587e.b
    /* renamed from: a */
    public void mo10397a() {
        m10414k1();
        invalidateSelf();
    }

    /* renamed from: a2 */
    public void m10398a2(int i10) {
        m10396Z1(AbstractC4105b.m17169c(this.f9598o0, i10));
    }

    /* renamed from: b1 */
    public boolean m10399b1() {
        return this.f9574K0;
    }

    /* renamed from: b2 */
    public void m10400b2(boolean z10) {
        boolean z11;
        if (this.f9571J != z10) {
            boolean m10315B2 = m10315B2();
            this.f9571J = z10;
            boolean m10315B22 = m10315B2();
            if (m10315B2 != m10315B22) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (m10315B22) {
                    m10321c0(this.f9573K);
                } else {
                    m10316C2(this.f9573K);
                }
                invalidateSelf();
                m10414k1();
            }
        }
    }

    /* renamed from: c2 */
    public void m10401c2(a aVar) {
        this.f9578M0 = new WeakReference(aVar);
    }

    /* renamed from: d1 */
    public boolean m10402d1() {
        return this.f9585V;
    }

    /* renamed from: d2 */
    public void m10403d2(TextUtils.TruncateAt truncateAt) {
        this.f9580N0 = truncateAt;
    }

    @Override // p326s5.C6686i, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i10;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i11 = this.f9562E0;
            if (i11 < 255) {
                i10 = AbstractC4548b.m18945a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i11);
            } else {
                i10 = 0;
            }
            m10340s0(canvas, bounds);
            m10337p0(canvas, bounds);
            if (this.f9584Q0) {
                super.draw(canvas);
            }
            m10339r0(canvas, bounds);
            m10342u0(canvas, bounds);
            m10338q0(canvas, bounds);
            m10336o0(canvas, bounds);
            if (this.f9582O0) {
                m10344w0(canvas, bounds);
            }
            m10341t0(canvas, bounds);
            m10343v0(canvas, bounds);
            if (this.f9562E0 < 255) {
                canvas.restoreToCount(i10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e0 */
    public float m10404e0() {
        if (!m10314A2() && !m10345z2()) {
            return 0.0f;
        }
        return this.f9591h0 + this.f9567H + this.f9592i0;
    }

    /* renamed from: e1 */
    public boolean m10405e1() {
        return m10328h1(this.f9573K);
    }

    /* renamed from: e2 */
    public void m10406e2(C4348c c4348c) {
        this.f9589Z = c4348c;
    }

    /* renamed from: f1 */
    public boolean m10407f1() {
        return this.f9571J;
    }

    /* renamed from: f2 */
    public void m10408f2(int i10) {
        m10406e2(C4348c.m18246c(this.f9598o0, i10));
    }

    /* renamed from: g2 */
    public void m10409g2(float f10) {
        if (this.f9592i0 != f10) {
            float m10404e0 = m10404e0();
            this.f9592i0 = f10;
            float m10404e02 = m10404e0();
            invalidateSelf();
            if (m10404e0 != m10404e02) {
                m10414k1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f9562E0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f9564F0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f9610y;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f9590g0 + m10404e0() + this.f9593j0 + this.f9605v0.m10645f(m10389W0().toString()) + this.f9594k0 + m10411i0() + this.f9597n0), this.f9583P0);
    }

    @Override // p326s5.C6686i, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // p326s5.C6686i, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f9584Q0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f9612z);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f9612z);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    /* renamed from: h2 */
    public void m10410h2(int i10) {
        m10409g2(this.f9598o0.getResources().getDimension(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0 */
    public float m10411i0() {
        if (m10315B2()) {
            return this.f9595l0 + this.f9579N + this.f9596m0;
        }
        return 0.0f;
    }

    /* renamed from: i2 */
    public void m10412i2(float f10) {
        if (this.f9591h0 != f10) {
            float m10404e0 = m10404e0();
            this.f9591h0 = f10;
            float m10404e02 = m10404e0();
            invalidateSelf();
            if (m10404e0 != m10404e02) {
                m10414k1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p326s5.C6686i, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!m10326g1(this.f9606w) && !m10326g1(this.f9608x) && !m10326g1(this.f9553A) && ((!this.f9574K0 || !m10326g1(this.f9576L0)) && !m10329i1(this.f9605v0.m10643d()) && !m10334m0() && !m10328h1(this.f9563F) && !m10328h1(this.f9587X) && !m10326g1(this.f9568H0))) {
            return false;
        }
        return true;
    }

    /* renamed from: j2 */
    public void m10413j2(int i10) {
        m10412i2(this.f9598o0.getResources().getDimension(i10));
    }

    /* renamed from: k1 */
    protected void m10414k1() {
        a aVar = (a) this.f9578M0.get();
        if (aVar != null) {
            aVar.mo10289a();
        }
    }

    /* renamed from: k2 */
    public void m10415k2(int i10) {
        this.f9583P0 = i10;
    }

    /* renamed from: l0 */
    Paint.Align m10416l0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f9559D != null) {
            float m10404e0 = this.f9590g0 + m10404e0() + this.f9593j0;
            if (AbstractC6306k.m25060f(this) == 0) {
                pointF.x = rect.left + m10404e0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - m10404e0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - m10332k0();
        }
        return align;
    }

    /* renamed from: l2 */
    public void m10417l2(ColorStateList colorStateList) {
        if (this.f9557C != colorStateList) {
            this.f9557C = colorStateList;
            m10317D2();
            onStateChange(getState());
        }
    }

    /* renamed from: m1 */
    public void m10418m1(boolean z10) {
        if (this.f9585V != z10) {
            this.f9585V = z10;
            float m10404e0 = m10404e0();
            if (!z10 && this.f9558C0) {
                this.f9558C0 = false;
            }
            float m10404e02 = m10404e0();
            invalidateSelf();
            if (m10404e0 != m10404e02) {
                m10414k1();
            }
        }
    }

    /* renamed from: m2 */
    public void m10419m2(int i10) {
        m10417l2(AbstractC4105b.m17169c(this.f9598o0, i10));
    }

    /* renamed from: n1 */
    public void m10420n1(int i10) {
        m10418m1(this.f9598o0.getResources().getBoolean(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n2 */
    public void m10421n2(boolean z10) {
        this.f9582O0 = z10;
    }

    /* renamed from: o1 */
    public void m10422o1(Drawable drawable) {
        if (this.f9587X != drawable) {
            float m10404e0 = m10404e0();
            this.f9587X = drawable;
            float m10404e02 = m10404e0();
            m10316C2(this.f9587X);
            m10321c0(this.f9587X);
            invalidateSelf();
            if (m10404e0 != m10404e02) {
                m10414k1();
            }
        }
    }

    /* renamed from: o2 */
    public void m10423o2(C4348c c4348c) {
        this.f9588Y = c4348c;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (m10314A2()) {
            onLayoutDirectionChanged |= AbstractC6306k.m25067m(this.f9563F, i10);
        }
        if (m10345z2()) {
            onLayoutDirectionChanged |= AbstractC6306k.m25067m(this.f9587X, i10);
        }
        if (m10315B2()) {
            onLayoutDirectionChanged |= AbstractC6306k.m25067m(this.f9573K, i10);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        boolean onLevelChange = super.onLevelChange(i10);
        if (m10314A2()) {
            onLevelChange |= this.f9563F.setLevel(i10);
        }
        if (m10345z2()) {
            onLevelChange |= this.f9587X.setLevel(i10);
        }
        if (m10315B2()) {
            onLevelChange |= this.f9573K.setLevel(i10);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // p326s5.C6686i, android.graphics.drawable.Drawable, com.google.android.material.internal.C2587e.b
    public boolean onStateChange(int[] iArr) {
        if (this.f9584Q0) {
            super.onStateChange(iArr);
        }
        return m10333l1(iArr, m10372N0());
    }

    /* renamed from: p1 */
    public void m10424p1(int i10) {
        m10422o1(AbstractC4105b.m17170d(this.f9598o0, i10));
    }

    /* renamed from: p2 */
    public void m10425p2(int i10) {
        m10423o2(C4348c.m18246c(this.f9598o0, i10));
    }

    /* renamed from: q1 */
    public void m10426q1(int i10) {
        m10428r1(this.f9598o0.getResources().getBoolean(i10));
    }

    /* renamed from: q2 */
    public void m10427q2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.f9559D, charSequence)) {
            this.f9559D = charSequence;
            this.f9605v0.m10648i(true);
            invalidateSelf();
            m10414k1();
        }
    }

    /* renamed from: r1 */
    public void m10428r1(boolean z10) {
        boolean z11;
        if (this.f9586W != z10) {
            boolean m10345z2 = m10345z2();
            this.f9586W = z10;
            boolean m10345z22 = m10345z2();
            if (m10345z2 != m10345z22) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (m10345z22) {
                    m10321c0(this.f9587X);
                } else {
                    m10316C2(this.f9587X);
                }
                invalidateSelf();
                m10414k1();
            }
        }
    }

    /* renamed from: r2 */
    public void m10429r2(C6217d c6217d) {
        this.f9605v0.m10647h(c6217d, this.f9598o0);
    }

    /* renamed from: s1 */
    public void m10430s1(ColorStateList colorStateList) {
        if (this.f9608x != colorStateList) {
            this.f9608x = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: s2 */
    public void m10431s2(int i10) {
        m10429r2(new C6217d(this.f9598o0, i10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // p326s5.C6686i, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f9562E0 != i10) {
            this.f9562E0 = i10;
            invalidateSelf();
        }
    }

    @Override // p326s5.C6686i, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f9564F0 != colorFilter) {
            this.f9564F0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p326s5.C6686i, android.graphics.drawable.Drawable, p290q.InterfaceC6320y
    public void setTintList(ColorStateList colorStateList) {
        if (this.f9568H0 != colorStateList) {
            this.f9568H0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p326s5.C6686i, android.graphics.drawable.Drawable, p290q.InterfaceC6320y
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f9570I0 != mode) {
            this.f9570I0 = mode;
            this.f9566G0 = AbstractC5420a.m21828a(this, this.f9568H0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (m10314A2()) {
            visible |= this.f9563F.setVisible(z10, z11);
        }
        if (m10345z2()) {
            visible |= this.f9587X.setVisible(z10, z11);
        }
        if (m10315B2()) {
            visible |= this.f9573K.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: t1 */
    public void m10432t1(int i10) {
        m10430s1(AbstractC4105b.m17169c(this.f9598o0, i10));
    }

    /* renamed from: t2 */
    public void m10433t2(float f10) {
        if (this.f9594k0 != f10) {
            this.f9594k0 = f10;
            invalidateSelf();
            m10414k1();
        }
    }

    /* renamed from: u1 */
    public void m10434u1(float f10) {
        if (this.f9612z != f10) {
            this.f9612z = f10;
            setShapeAppearanceModel(m26087A().m26145w(f10));
        }
    }

    /* renamed from: u2 */
    public void m10435u2(int i10) {
        m10433t2(this.f9598o0.getResources().getDimension(i10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v1 */
    public void m10436v1(int i10) {
        m10434u1(this.f9598o0.getResources().getDimension(i10));
    }

    /* renamed from: v2 */
    public void m10437v2(float f10) {
        if (this.f9593j0 != f10) {
            this.f9593j0 = f10;
            invalidateSelf();
            m10414k1();
        }
    }

    /* renamed from: w1 */
    public void m10438w1(float f10) {
        if (this.f9597n0 != f10) {
            this.f9597n0 = f10;
            invalidateSelf();
            m10414k1();
        }
    }

    /* renamed from: w2 */
    public void m10439w2(int i10) {
        m10437v2(this.f9598o0.getResources().getDimension(i10));
    }

    /* renamed from: x0 */
    public Drawable m10440x0() {
        return this.f9587X;
    }

    /* renamed from: x1 */
    public void m10441x1(int i10) {
        m10438w1(this.f9598o0.getResources().getDimension(i10));
    }

    /* renamed from: x2 */
    public void m10442x2(boolean z10) {
        if (this.f9574K0 != z10) {
            this.f9574K0 = z10;
            m10317D2();
            onStateChange(getState());
        }
    }

    /* renamed from: y0 */
    public ColorStateList m10443y0() {
        return this.f9608x;
    }

    /* renamed from: y1 */
    public void m10444y1(Drawable drawable) {
        Drawable drawable2;
        Drawable m10348B0 = m10348B0();
        if (m10348B0 != drawable) {
            float m10404e0 = m10404e0();
            if (drawable != null) {
                drawable2 = AbstractC6306k.m25072r(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.f9563F = drawable2;
            float m10404e02 = m10404e0();
            m10316C2(m10348B0);
            if (m10314A2()) {
                m10321c0(this.f9563F);
            }
            invalidateSelf();
            if (m10404e0 != m10404e02) {
                m10414k1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y2 */
    public boolean m10445y2() {
        return this.f9582O0;
    }

    /* renamed from: z0 */
    public float m10446z0() {
        if (this.f9584Q0) {
            return m26088C();
        }
        return this.f9612z;
    }

    /* renamed from: z1 */
    public void m10447z1(int i10) {
        m10444y1(AbstractC4105b.m17170d(this.f9598o0, i10));
    }
}
