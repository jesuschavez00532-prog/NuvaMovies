package p282p5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import com.google.android.material.R$styleable;
import p254o.AbstractC5894i;

/* renamed from: p5.d */
/* loaded from: classes.dex */
public class C6217d {

    /* renamed from: a */
    public final float f24392a;

    /* renamed from: b */
    public final ColorStateList f24393b;

    /* renamed from: c */
    public final ColorStateList f24394c;

    /* renamed from: d */
    public final ColorStateList f24395d;

    /* renamed from: e */
    public final int f24396e;

    /* renamed from: f */
    public final int f24397f;

    /* renamed from: g */
    public final String f24398g;

    /* renamed from: h */
    public final boolean f24399h;

    /* renamed from: i */
    public final ColorStateList f24400i;

    /* renamed from: j */
    public final float f24401j;

    /* renamed from: k */
    public final float f24402k;

    /* renamed from: l */
    public final float f24403l;

    /* renamed from: m */
    private final int f24404m;

    /* renamed from: n */
    private boolean f24405n = false;

    /* renamed from: o */
    private Typeface f24406o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p5.d$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC5894i.d {

        /* renamed from: a */
        final /* synthetic */ AbstractC6219f f24407a;

        a(AbstractC6219f abstractC6219f) {
            this.f24407a = abstractC6219f;
        }

        @Override // p254o.AbstractC5894i.d
        /* renamed from: d */
        public void mo1974d(int i10) {
            C6217d.this.f24405n = true;
            this.f24407a.mo10295a(i10);
        }

        @Override // p254o.AbstractC5894i.d
        /* renamed from: e */
        public void mo1975e(Typeface typeface) {
            C6217d c6217d = C6217d.this;
            c6217d.f24406o = Typeface.create(typeface, c6217d.f24396e);
            C6217d.this.f24405n = true;
            this.f24407a.mo10296b(C6217d.this.f24406o, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p5.d$b */
    /* loaded from: classes.dex */
    public class b extends AbstractC6219f {

        /* renamed from: a */
        final /* synthetic */ TextPaint f24409a;

        /* renamed from: b */
        final /* synthetic */ AbstractC6219f f24410b;

        b(TextPaint textPaint, AbstractC6219f abstractC6219f) {
            this.f24409a = textPaint;
            this.f24410b = abstractC6219f;
        }

        @Override // p282p5.AbstractC6219f
        /* renamed from: a */
        public void mo10295a(int i10) {
            this.f24410b.mo10295a(i10);
        }

        @Override // p282p5.AbstractC6219f
        /* renamed from: b */
        public void mo10296b(Typeface typeface, boolean z10) {
            C6217d.this.m24807k(this.f24409a, typeface);
            this.f24410b.mo10296b(typeface, z10);
        }
    }

    public C6217d(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, R$styleable.f9289B0);
        this.f24392a = obtainStyledAttributes.getDimension(R$styleable.TextAppearance_android_textSize, 0.0f);
        this.f24393b = AbstractC6216c.m24791a(context, obtainStyledAttributes, R$styleable.TextAppearance_android_textColor);
        this.f24394c = AbstractC6216c.m24791a(context, obtainStyledAttributes, R$styleable.TextAppearance_android_textColorHint);
        this.f24395d = AbstractC6216c.m24791a(context, obtainStyledAttributes, R$styleable.TextAppearance_android_textColorLink);
        this.f24396e = obtainStyledAttributes.getInt(R$styleable.TextAppearance_android_textStyle, 0);
        this.f24397f = obtainStyledAttributes.getInt(R$styleable.TextAppearance_android_typeface, 1);
        int m24795e = AbstractC6216c.m24795e(obtainStyledAttributes, R$styleable.TextAppearance_fontFamily, R$styleable.TextAppearance_android_fontFamily);
        this.f24404m = obtainStyledAttributes.getResourceId(m24795e, 0);
        this.f24398g = obtainStyledAttributes.getString(m24795e);
        this.f24399h = obtainStyledAttributes.getBoolean(R$styleable.TextAppearance_textAllCaps, false);
        this.f24400i = AbstractC6216c.m24791a(context, obtainStyledAttributes, R$styleable.TextAppearance_android_shadowColor);
        this.f24401j = obtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowDx, 0.0f);
        this.f24402k = obtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowDy, 0.0f);
        this.f24403l = obtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    private void m24800d() {
        String str;
        if (this.f24406o == null && (str = this.f24398g) != null) {
            this.f24406o = Typeface.create(str, this.f24396e);
        }
        if (this.f24406o == null) {
            int i10 = this.f24397f;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        this.f24406o = Typeface.DEFAULT;
                    } else {
                        this.f24406o = Typeface.MONOSPACE;
                    }
                } else {
                    this.f24406o = Typeface.SERIF;
                }
            } else {
                this.f24406o = Typeface.SANS_SERIF;
            }
            this.f24406o = Typeface.create(this.f24406o, this.f24396e);
        }
    }

    /* renamed from: e */
    public Typeface m24801e() {
        m24800d();
        return this.f24406o;
    }

    /* renamed from: f */
    public Typeface m24802f(Context context) {
        if (this.f24405n) {
            return this.f24406o;
        }
        if (!context.isRestricted()) {
            try {
                Typeface m23797e = AbstractC5894i.m23797e(context, this.f24404m);
                this.f24406o = m23797e;
                if (m23797e != null) {
                    this.f24406o = Typeface.create(m23797e, this.f24396e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f24398g, e10);
            }
        }
        m24800d();
        this.f24405n = true;
        return this.f24406o;
    }

    /* renamed from: g */
    public void m24803g(Context context, TextPaint textPaint, AbstractC6219f abstractC6219f) {
        m24807k(textPaint, m24801e());
        m24804h(context, new b(textPaint, abstractC6219f));
    }

    /* renamed from: h */
    public void m24804h(Context context, AbstractC6219f abstractC6219f) {
        if (AbstractC6218e.m24808a()) {
            m24802f(context);
        } else {
            m24800d();
        }
        int i10 = this.f24404m;
        if (i10 == 0) {
            this.f24405n = true;
        }
        if (this.f24405n) {
            abstractC6219f.mo10296b(this.f24406o, true);
            return;
        }
        try {
            AbstractC5894i.m23799g(context, i10, new a(abstractC6219f), null);
        } catch (Resources.NotFoundException unused) {
            this.f24405n = true;
            abstractC6219f.mo10295a(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f24398g, e10);
            this.f24405n = true;
            abstractC6219f.mo10295a(-3);
        }
    }

    /* renamed from: i */
    public void m24805i(Context context, TextPaint textPaint, AbstractC6219f abstractC6219f) {
        int i10;
        int i11;
        m24806j(context, textPaint, abstractC6219f);
        ColorStateList colorStateList = this.f24393b;
        if (colorStateList != null) {
            i10 = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i10 = -16777216;
        }
        textPaint.setColor(i10);
        float f10 = this.f24403l;
        float f11 = this.f24401j;
        float f12 = this.f24402k;
        ColorStateList colorStateList2 = this.f24400i;
        if (colorStateList2 != null) {
            i11 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i11 = 0;
        }
        textPaint.setShadowLayer(f10, f11, f12, i11);
    }

    /* renamed from: j */
    public void m24806j(Context context, TextPaint textPaint, AbstractC6219f abstractC6219f) {
        if (AbstractC6218e.m24808a()) {
            m24807k(textPaint, m24802f(context));
        } else {
            m24803g(context, textPaint, abstractC6219f);
        }
    }

    /* renamed from: k */
    public void m24807k(TextPaint textPaint, Typeface typeface) {
        boolean z10;
        float f10;
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ (-1)) & this.f24396e;
        if ((style & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setFakeBoldText(z10);
        if ((style & 2) != 0) {
            f10 = -0.25f;
        } else {
            f10 = 0.0f;
        }
        textPaint.setTextSkewX(f10);
        textPaint.setTextSize(this.f24392a);
    }
}
