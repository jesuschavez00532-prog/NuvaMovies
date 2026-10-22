package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import androidx.core.view.InterfaceC0604n0;

/* renamed from: androidx.appcompat.widget.j1 */
/* loaded from: classes.dex */
public class C0409j1 extends ToggleButton implements InterfaceC0604n0 {

    /* renamed from: a */
    private final C0395g f1778a;

    /* renamed from: b */
    private final C0452u0 f1779b;

    public C0409j1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0395g c0395g = this.f1778a;
        if (c0395g != null) {
            c0395g.m1699b();
        }
        C0452u0 c0452u0 = this.f1779b;
        if (c0452u0 != null) {
            c0452u0.m1952b();
        }
    }

    @Override // androidx.core.view.InterfaceC0604n0
    public ColorStateList getSupportBackgroundTintList() {
        C0395g c0395g = this.f1778a;
        if (c0395g != null) {
            return c0395g.m1700c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0604n0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0395g c0395g = this.f1778a;
        if (c0395g != null) {
            return c0395g.m1701d();
        }
        return null;
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0395g c0395g = this.f1778a;
        if (c0395g != null) {
            c0395g.m1703f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0395g c0395g = this.f1778a;
        if (c0395g != null) {
            c0395g.m1704g(i10);
        }
    }

    @Override // androidx.core.view.InterfaceC0604n0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0395g c0395g = this.f1778a;
        if (c0395g != null) {
            c0395g.m1706i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0604n0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0395g c0395g = this.f1778a;
        if (c0395g != null) {
            c0395g.m1707j(mode);
        }
    }

    public C0409j1(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC0422m2.m1832a(this, getContext());
        C0395g c0395g = new C0395g(this);
        this.f1778a = c0395g;
        c0395g.m1702e(attributeSet, i10);
        C0452u0 c0452u0 = new C0452u0(this);
        this.f1779b = c0452u0;
        c0452u0.m1962m(attributeSet, i10);
    }
}
