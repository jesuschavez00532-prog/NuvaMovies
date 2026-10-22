package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.appcompat.R$attr;
import androidx.core.view.InterfaceC0604n0;
import androidx.core.widget.AbstractC0665d0;
import androidx.core.widget.InterfaceC0660b;
import androidx.core.widget.InterfaceC0671g0;

/* renamed from: androidx.appcompat.widget.h */
/* loaded from: classes.dex */
public class C0399h extends Button implements InterfaceC0604n0, InterfaceC0660b, InterfaceC0671g0 {

    /* renamed from: a */
    private final C0395g f1763a;

    /* renamed from: b */
    private final C0452u0 f1764b;

    public C0399h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.buttonStyle);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0395g c0395g = this.f1763a;
        if (c0395g != null) {
            c0395g.m1699b();
        }
        C0452u0 c0452u0 = this.f1764b;
        if (c0452u0 != null) {
            c0452u0.m1952b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC0660b.f2492P) {
            return super.getAutoSizeMaxTextSize();
        }
        C0452u0 c0452u0 = this.f1764b;
        if (c0452u0 != null) {
            return c0452u0.m1954e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (InterfaceC0660b.f2492P) {
            return super.getAutoSizeMinTextSize();
        }
        C0452u0 c0452u0 = this.f1764b;
        if (c0452u0 != null) {
            return c0452u0.m1955f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (InterfaceC0660b.f2492P) {
            return super.getAutoSizeStepGranularity();
        }
        C0452u0 c0452u0 = this.f1764b;
        if (c0452u0 != null) {
            return c0452u0.m1956g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (InterfaceC0660b.f2492P) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0452u0 c0452u0 = this.f1764b;
        if (c0452u0 != null) {
            return c0452u0.m1957h();
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (InterfaceC0660b.f2492P) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        C0452u0 c0452u0 = this.f1764b;
        if (c0452u0 == null) {
            return 0;
        }
        return c0452u0.m1958i();
    }

    @Override // androidx.core.view.InterfaceC0604n0
    public ColorStateList getSupportBackgroundTintList() {
        C0395g c0395g = this.f1763a;
        if (c0395g != null) {
            return c0395g.m1700c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0604n0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0395g c0395g = this.f1763a;
        if (c0395g != null) {
            return c0395g.m1701d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1764b.m1959j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1764b.m1960k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        C0452u0 c0452u0 = this.f1764b;
        if (c0452u0 != null) {
            c0452u0.m1964o(z10, i10, i11, i12, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        C0452u0 c0452u0 = this.f1764b;
        if (c0452u0 != null && !InterfaceC0660b.f2492P && c0452u0.m1961l()) {
            this.f1764b.m1953c();
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (InterfaceC0660b.f2492P) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        C0452u0 c0452u0 = this.f1764b;
        if (c0452u0 != null) {
            c0452u0.m1969t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (InterfaceC0660b.f2492P) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        C0452u0 c0452u0 = this.f1764b;
        if (c0452u0 != null) {
            c0452u0.m1970u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (InterfaceC0660b.f2492P) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        C0452u0 c0452u0 = this.f1764b;
        if (c0452u0 != null) {
            c0452u0.m1971v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0395g c0395g = this.f1763a;
        if (c0395g != null) {
            c0395g.m1703f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0395g c0395g = this.f1763a;
        if (c0395g != null) {
            c0395g.m1704g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0665d0.m2945p(this, callback));
    }

    public void setSupportAllCaps(boolean z10) {
        C0452u0 c0452u0 = this.f1764b;
        if (c0452u0 != null) {
            c0452u0.m1968s(z10);
        }
    }

    @Override // androidx.core.view.InterfaceC0604n0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0395g c0395g = this.f1763a;
        if (c0395g != null) {
            c0395g.m1706i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0604n0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0395g c0395g = this.f1763a;
        if (c0395g != null) {
            c0395g.m1707j(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC0671g0
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1764b.m1972w(colorStateList);
        this.f1764b.m1952b();
    }

    @Override // androidx.core.widget.InterfaceC0671g0
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1764b.m1973x(mode);
        this.f1764b.m1952b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C0452u0 c0452u0 = this.f1764b;
        if (c0452u0 != null) {
            c0452u0.m1966q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (InterfaceC0660b.f2492P) {
            super.setTextSize(i10, f10);
            return;
        }
        C0452u0 c0452u0 = this.f1764b;
        if (c0452u0 != null) {
            c0452u0.m1951A(i10, f10);
        }
    }

    public C0399h(Context context, AttributeSet attributeSet, int i10) {
        super(C0426n2.m1842b(context), attributeSet, i10);
        AbstractC0422m2.m1832a(this, getContext());
        C0395g c0395g = new C0395g(this);
        this.f1763a = c0395g;
        c0395g.m1702e(attributeSet, i10);
        C0452u0 c0452u0 = new C0452u0(this);
        this.f1764b = c0452u0;
        c0452u0.m1962m(attributeSet, i10);
        c0452u0.m1952b();
    }
}
