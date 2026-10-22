package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.session.AbstractC0272b;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C0399h;
import androidx.core.view.AbstractC0616q0;
import androidx.core.widget.AbstractC0665d0;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p106e.AbstractC4105b;
import p290q.AbstractC6306k;
import p326s5.AbstractC6687j;
import p326s5.C6690m;
import p326s5.InterfaceC6693p;

/* loaded from: classes.dex */
public class MaterialButton extends C0399h implements Checkable, InterfaceC6693p {

    /* renamed from: n */
    private static final int[] f9486n = {R.attr.state_checkable};

    /* renamed from: o */
    private static final int[] f9487o = {R.attr.state_checked};

    /* renamed from: p */
    private static final int f9488p = R$style.Widget_MaterialComponents_Button;

    /* renamed from: c */
    private final C2538c f9489c;

    /* renamed from: d */
    private final LinkedHashSet f9490d;

    /* renamed from: e */
    private PorterDuff.Mode f9491e;

    /* renamed from: f */
    private ColorStateList f9492f;

    /* renamed from: g */
    private Drawable f9493g;

    /* renamed from: h */
    private int f9494h;

    /* renamed from: i */
    private int f9495i;

    /* renamed from: j */
    private int f9496j;

    /* renamed from: k */
    private boolean f9497k;

    /* renamed from: l */
    private boolean f9498l;

    /* renamed from: m */
    private int f9499m;

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    /* loaded from: classes.dex */
    interface InterfaceC2535a {
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.materialButtonStyle);
    }

    /* renamed from: b */
    private boolean m10229b() {
        if (AbstractC0616q0.m2579B(this) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private boolean m10230c() {
        C2538c c2538c = this.f9489c;
        if (c2538c != null && !c2538c.m10253m()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m10231d(boolean z10) {
        if (z10) {
            AbstractC0665d0.m2938i(this, this.f9493g, null, null, null);
        } else {
            AbstractC0665d0.m2938i(this, null, null, this.f9493g, null);
        }
    }

    /* renamed from: e */
    private void m10232e(boolean z10) {
        boolean z11;
        Drawable drawable = this.f9493g;
        boolean z12 = false;
        if (drawable != null) {
            Drawable mutate = AbstractC6306k.m25072r(drawable).mutate();
            this.f9493g = mutate;
            AbstractC6306k.m25069o(mutate, this.f9492f);
            PorterDuff.Mode mode = this.f9491e;
            if (mode != null) {
                AbstractC6306k.m25070p(this.f9493g, mode);
            }
            int i10 = this.f9494h;
            if (i10 == 0) {
                i10 = this.f9493g.getIntrinsicWidth();
            }
            int i11 = this.f9494h;
            if (i11 == 0) {
                i11 = this.f9493g.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f9493g;
            int i12 = this.f9495i;
            drawable2.setBounds(i12, 0, i10 + i12, i11);
        }
        int i13 = this.f9499m;
        if (i13 != 1 && i13 != 2) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10) {
            m10231d(z11);
            return;
        }
        Drawable[] m2930a = AbstractC0665d0.m2930a(this);
        Drawable drawable3 = m2930a[0];
        Drawable drawable4 = m2930a[2];
        if ((z11 && drawable3 != this.f9493g) || (!z11 && drawable4 != this.f9493g)) {
            z12 = true;
        }
        if (z12) {
            m10231d(z11);
        }
    }

    /* renamed from: f */
    private void m10233f() {
        if (this.f9493g != null && getLayout() != null) {
            int i10 = this.f9499m;
            boolean z10 = true;
            if (i10 != 1 && i10 != 3) {
                TextPaint paint = getPaint();
                String charSequence = getText().toString();
                if (getTransformationMethod() != null) {
                    charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
                }
                int min = Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
                int i11 = this.f9494h;
                if (i11 == 0) {
                    i11 = this.f9493g.getIntrinsicWidth();
                }
                int measuredWidth = (((((getMeasuredWidth() - min) - AbstractC0616q0.m2587F(this)) - i11) - this.f9496j) - AbstractC0616q0.m2589G(this)) / 2;
                boolean m10229b = m10229b();
                if (this.f9499m != 4) {
                    z10 = false;
                }
                if (m10229b != z10) {
                    measuredWidth = -measuredWidth;
                }
                if (this.f9495i != measuredWidth) {
                    this.f9495i = measuredWidth;
                    m10232e(false);
                    return;
                }
                return;
            }
            this.f9495i = 0;
            m10232e(false);
        }
    }

    private String getA11yClassName() {
        Class cls;
        if (m10234a()) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    /* renamed from: a */
    public boolean m10234a() {
        C2538c c2538c = this.f9489c;
        if (c2538c != null && c2538c.m10254n()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m10230c()) {
            return this.f9489c.m10244b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f9493g;
    }

    public int getIconGravity() {
        return this.f9499m;
    }

    public int getIconPadding() {
        return this.f9496j;
    }

    public int getIconSize() {
        return this.f9494h;
    }

    public ColorStateList getIconTint() {
        return this.f9492f;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f9491e;
    }

    public ColorStateList getRippleColor() {
        if (m10230c()) {
            return this.f9489c.m10247f();
        }
        return null;
    }

    public C6690m getShapeAppearanceModel() {
        if (m10230c()) {
            return this.f9489c.m10248g();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m10230c()) {
            return this.f9489c.m10249h();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m10230c()) {
            return this.f9489c.m10250i();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.C0399h, androidx.core.view.InterfaceC0604n0
    public ColorStateList getSupportBackgroundTintList() {
        if (m10230c()) {
            return this.f9489c.m10251j();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.C0399h, androidx.core.view.InterfaceC0604n0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (m10230c()) {
            return this.f9489c.m10252k();
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f9497k;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC6687j.m26122f(this, this.f9489c.m10246d());
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (m10234a()) {
            View.mergeDrawableStates(onCreateDrawableState, f9486n);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f9487o);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.C0399h, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.C0399h, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m10234a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0399h, android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        C2538c c2538c;
        super.onLayout(z10, i10, i11, i12, i13);
        if (Build.VERSION.SDK_INT == 21 && (c2538c = this.f9489c) != null) {
            c2538c.m10243B(i13 - i11, i12 - i10);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        m10233f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0399h, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        m10233f();
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (m10230c()) {
            this.f9489c.m10256p(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    @Override // androidx.appcompat.widget.C0399h, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (m10230c()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
                this.f9489c.m10257q();
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.C0399h, android.view.View
    public void setBackgroundResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = AbstractC4105b.m17170d(getContext(), i10);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (m10230c()) {
            this.f9489c.m10258r(z10);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (m10234a() && isEnabled() && this.f9497k != z10) {
            this.f9497k = z10;
            refreshDrawableState();
            if (this.f9498l) {
                return;
            }
            this.f9498l = true;
            Iterator it = this.f9490d.iterator();
            if (!it.hasNext()) {
                this.f9498l = false;
            } else {
                AbstractC0272b.m941a(it.next());
                throw null;
            }
        }
    }

    public void setCornerRadius(int i10) {
        if (m10230c()) {
            this.f9489c.m10259s(i10);
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (m10230c()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (m10230c()) {
            this.f9489c.m10246d().m26095Q(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f9493g != drawable) {
            this.f9493g = drawable;
            m10232e(true);
        }
    }

    public void setIconGravity(int i10) {
        if (this.f9499m != i10) {
            this.f9499m = i10;
            m10233f();
        }
    }

    public void setIconPadding(int i10) {
        if (this.f9496j != i10) {
            this.f9496j = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = AbstractC4105b.m17170d(getContext(), i10);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i10) {
        if (i10 >= 0) {
            if (this.f9494h != i10) {
                this.f9494h = i10;
                m10232e(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f9492f != colorStateList) {
            this.f9492f = colorStateList;
            m10232e(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f9491e != mode) {
            this.f9491e = mode;
            m10232e(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(AbstractC4105b.m17169c(getContext(), i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(InterfaceC2535a interfaceC2535a) {
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m10230c()) {
            this.f9489c.m10260t(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        if (m10230c()) {
            setRippleColor(AbstractC4105b.m17169c(getContext(), i10));
        }
    }

    @Override // p326s5.InterfaceC6693p
    public void setShapeAppearanceModel(C6690m c6690m) {
        if (m10230c()) {
            this.f9489c.m10261u(c6690m);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (m10230c()) {
            this.f9489c.m10262v(z10);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m10230c()) {
            this.f9489c.m10263w(colorStateList);
        }
    }

    public void setStrokeColorResource(int i10) {
        if (m10230c()) {
            setStrokeColor(AbstractC4105b.m17169c(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (m10230c()) {
            this.f9489c.m10264x(i10);
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (m10230c()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.C0399h, androidx.core.view.InterfaceC0604n0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m10230c()) {
            this.f9489c.m10265y(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.C0399h, androidx.core.view.InterfaceC0604n0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m10230c()) {
            this.f9489c.m10266z(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f9497k);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = com.google.android.material.button.MaterialButton.f9488p
            android.content.Context r9 = com.google.android.material.internal.AbstractC2588f.m10655f(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f9490d = r9
            r9 = 0
            r8.f9497k = r9
            r8.f9498l = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = com.google.android.material.R$styleable.f9317W
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.AbstractC2588f.m10660k(r0, r1, r2, r3, r4, r5)
            int r1 = com.google.android.material.R$styleable.MaterialButton_iconPadding
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f9496j = r1
            int r1 = com.google.android.material.R$styleable.MaterialButton_iconTintMode
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.AbstractC2589g.m10664c(r1, r2)
            r8.f9491e = r1
            android.content.Context r1 = r8.getContext()
            int r2 = com.google.android.material.R$styleable.MaterialButton_iconTint
            android.content.res.ColorStateList r1 = p282p5.AbstractC6216c.m24791a(r1, r0, r2)
            r8.f9492f = r1
            android.content.Context r1 = r8.getContext()
            int r2 = com.google.android.material.R$styleable.MaterialButton_icon
            android.graphics.drawable.Drawable r1 = p282p5.AbstractC6216c.m24794d(r1, r0, r2)
            r8.f9493g = r1
            int r1 = com.google.android.material.R$styleable.MaterialButton_iconGravity
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.f9499m = r1
            int r1 = com.google.android.material.R$styleable.MaterialButton_iconSize
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f9494h = r1
            s5.m$b r10 = p326s5.C6690m.m26127e(r7, r10, r11, r6)
            s5.m r10 = r10.m26165m()
            com.google.android.material.button.c r11 = new com.google.android.material.button.c
            r11.<init>(r8, r10)
            r8.f9489c = r11
            r11.m10255o(r0)
            r0.recycle()
            int r10 = r8.f9496j
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f9493g
            if (r10 == 0) goto L84
            r9 = 1
        L84:
            r8.m10232e(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
