package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.appcompat.R$attr;
import androidx.core.view.InterfaceC0604n0;
import androidx.core.widget.InterfaceC0669f0;
import p106e.AbstractC4105b;

/* renamed from: androidx.appcompat.widget.v */
/* loaded from: classes.dex */
public class C0455v extends RadioButton implements InterfaceC0669f0, InterfaceC0604n0 {

    /* renamed from: a */
    private final C0411k f1960a;

    /* renamed from: b */
    private final C0395g f1961b;

    /* renamed from: c */
    private final C0452u0 f1962c;

    public C0455v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.radioButtonStyle);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0395g c0395g = this.f1961b;
        if (c0395g != null) {
            c0395g.m1699b();
        }
        C0452u0 c0452u0 = this.f1962c;
        if (c0452u0 != null) {
            c0452u0.m1952b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0411k c0411k = this.f1960a;
        if (c0411k != null) {
            return c0411k.m1753b(compoundPaddingLeft);
        }
        return compoundPaddingLeft;
    }

    @Override // androidx.core.view.InterfaceC0604n0
    public ColorStateList getSupportBackgroundTintList() {
        C0395g c0395g = this.f1961b;
        if (c0395g != null) {
            return c0395g.m1700c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0604n0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0395g c0395g = this.f1961b;
        if (c0395g != null) {
            return c0395g.m1701d();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC0669f0
    public ColorStateList getSupportButtonTintList() {
        C0411k c0411k = this.f1960a;
        if (c0411k != null) {
            return c0411k.m1754c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0411k c0411k = this.f1960a;
        if (c0411k != null) {
            return c0411k.m1755d();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0395g c0395g = this.f1961b;
        if (c0395g != null) {
            c0395g.m1703f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0395g c0395g = this.f1961b;
        if (c0395g != null) {
            c0395g.m1704g(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0411k c0411k = this.f1960a;
        if (c0411k != null) {
            c0411k.m1757f();
        }
    }

    @Override // androidx.core.view.InterfaceC0604n0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0395g c0395g = this.f1961b;
        if (c0395g != null) {
            c0395g.m1706i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0604n0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0395g c0395g = this.f1961b;
        if (c0395g != null) {
            c0395g.m1707j(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC0669f0
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0411k c0411k = this.f1960a;
        if (c0411k != null) {
            c0411k.m1758g(colorStateList);
        }
    }

    @Override // androidx.core.widget.InterfaceC0669f0
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0411k c0411k = this.f1960a;
        if (c0411k != null) {
            c0411k.m1759h(mode);
        }
    }

    public C0455v(Context context, AttributeSet attributeSet, int i10) {
        super(C0426n2.m1842b(context), attributeSet, i10);
        AbstractC0422m2.m1832a(this, getContext());
        C0411k c0411k = new C0411k(this);
        this.f1960a = c0411k;
        c0411k.m1756e(attributeSet, i10);
        C0395g c0395g = new C0395g(this);
        this.f1961b = c0395g;
        c0395g.m1702e(attributeSet, i10);
        C0452u0 c0452u0 = new C0452u0(this);
        this.f1962c = c0452u0;
        c0452u0.m1962m(attributeSet, i10);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(AbstractC4105b.m17170d(getContext(), i10));
    }
}
