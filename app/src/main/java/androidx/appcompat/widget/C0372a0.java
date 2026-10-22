package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.R$styleable;
import androidx.core.view.AbstractC0616q0;
import p290q.AbstractC6306k;

/* renamed from: androidx.appcompat.widget.a0 */
/* loaded from: classes.dex */
class C0372a0 extends C0451u {

    /* renamed from: d */
    private final SeekBar f1658d;

    /* renamed from: e */
    private Drawable f1659e;

    /* renamed from: f */
    private ColorStateList f1660f;

    /* renamed from: g */
    private PorterDuff.Mode f1661g;

    /* renamed from: h */
    private boolean f1662h;

    /* renamed from: i */
    private boolean f1663i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0372a0(SeekBar seekBar) {
        super(seekBar);
        this.f1660f = null;
        this.f1661g = null;
        this.f1662h = false;
        this.f1663i = false;
        this.f1658d = seekBar;
    }

    /* renamed from: f */
    private void m1595f() {
        Drawable drawable = this.f1659e;
        if (drawable != null) {
            if (this.f1662h || this.f1663i) {
                Drawable m25072r = AbstractC6306k.m25072r(drawable.mutate());
                this.f1659e = m25072r;
                if (this.f1662h) {
                    AbstractC6306k.m25069o(m25072r, this.f1660f);
                }
                if (this.f1663i) {
                    AbstractC6306k.m25070p(this.f1659e, this.f1661g);
                }
                if (this.f1659e.isStateful()) {
                    this.f1659e.setState(this.f1658d.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.C0451u
    /* renamed from: c */
    public void mo1596c(AttributeSet attributeSet, int i10) {
        super.mo1596c(attributeSet, i10);
        Context context = this.f1658d.getContext();
        int[] iArr = R$styleable.f915l;
        C0438q2 m1874v = C0438q2.m1874v(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar = this.f1658d;
        AbstractC0616q0.m2632l0(seekBar, seekBar.getContext(), iArr, attributeSet, m1874v.m1892r(), i10, 0);
        Drawable m1882h = m1874v.m1882h(R$styleable.AppCompatSeekBar_android_thumb);
        if (m1882h != null) {
            this.f1658d.setThumb(m1882h);
        }
        m1600j(m1874v.m1881g(R$styleable.AppCompatSeekBar_tickMark));
        int i11 = R$styleable.AppCompatSeekBar_tickMarkTintMode;
        if (m1874v.m1893s(i11)) {
            this.f1661g = AbstractC0421m1.m1831d(m1874v.m1885k(i11, -1), this.f1661g);
            this.f1663i = true;
        }
        int i12 = R$styleable.AppCompatSeekBar_tickMarkTint;
        if (m1874v.m1893s(i12)) {
            this.f1660f = m1874v.m1877c(i12);
            this.f1662h = true;
        }
        m1874v.m1894w();
        m1595f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m1597g(Canvas canvas) {
        int i10;
        if (this.f1659e != null) {
            int max = this.f1658d.getMax();
            int i11 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1659e.getIntrinsicWidth();
                int intrinsicHeight = this.f1659e.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i10 = intrinsicWidth / 2;
                } else {
                    i10 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i11 = intrinsicHeight / 2;
                }
                this.f1659e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f1658d.getWidth() - this.f1658d.getPaddingLeft()) - this.f1658d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f1658d.getPaddingLeft(), this.f1658d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f1659e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m1598h() {
        Drawable drawable = this.f1659e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1658d.getDrawableState())) {
            this.f1658d.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m1599i() {
        Drawable drawable = this.f1659e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* renamed from: j */
    void m1600j(Drawable drawable) {
        Drawable drawable2 = this.f1659e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1659e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1658d);
            AbstractC6306k.m25067m(drawable, AbstractC0616q0.m2579B(this.f1658d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1658d.getDrawableState());
            }
            m1595f();
        }
        this.f1658d.invalidate();
    }
}
