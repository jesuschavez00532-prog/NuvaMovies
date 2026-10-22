package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.C0403i;
import androidx.core.view.AbstractC0616q0;
import com.google.android.material.R$attr;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.chip.C2554h;
import com.google.android.material.internal.AbstractC2588f;
import com.google.android.material.internal.AbstractC2589g;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import p032c0.AbstractC1334a;
import p144g5.C4348c;
import p282p5.AbstractC6216c;
import p282p5.AbstractC6219f;
import p282p5.C6217d;
import p296q5.AbstractC6345b;
import p326s5.AbstractC6687j;
import p326s5.C6690m;
import p326s5.InterfaceC6693p;
import p389x.C7458h0;

/* loaded from: classes.dex */
public class Chip extends C0403i implements C2554h.a, InterfaceC6693p {

    /* renamed from: t */
    private static final Rect f9519t = new Rect();

    /* renamed from: u */
    private static final int[] f9520u = {R.attr.state_selected};

    /* renamed from: v */
    private static final int[] f9521v = {R.attr.state_checkable};

    /* renamed from: d */
    private C2554h f9522d;

    /* renamed from: e */
    private InsetDrawable f9523e;

    /* renamed from: f */
    private RippleDrawable f9524f;

    /* renamed from: g */
    private View.OnClickListener f9525g;

    /* renamed from: h */
    private CompoundButton.OnCheckedChangeListener f9526h;

    /* renamed from: i */
    private boolean f9527i;

    /* renamed from: j */
    private boolean f9528j;

    /* renamed from: k */
    private boolean f9529k;

    /* renamed from: l */
    private boolean f9530l;

    /* renamed from: m */
    private boolean f9531m;

    /* renamed from: n */
    private int f9532n;

    /* renamed from: o */
    private int f9533o;

    /* renamed from: p */
    private final C2541c f9534p;

    /* renamed from: q */
    private final Rect f9535q;

    /* renamed from: r */
    private final RectF f9536r;

    /* renamed from: s */
    private final AbstractC6219f f9537s;

    /* renamed from: com.google.android.material.chip.Chip$a */
    /* loaded from: classes.dex */
    class C2539a extends AbstractC6219f {
        C2539a() {
        }

        @Override // p282p5.AbstractC6219f
        /* renamed from: a */
        public void mo10295a(int i10) {
        }

        @Override // p282p5.AbstractC6219f
        /* renamed from: b */
        public void mo10296b(Typeface typeface, boolean z10) {
            CharSequence text;
            Chip chip = Chip.this;
            if (chip.f9522d.m10445y2()) {
                text = Chip.this.f9522d.m10389W0();
            } else {
                text = Chip.this.getText();
            }
            chip.setText(text);
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.chip.Chip$b */
    /* loaded from: classes.dex */
    public class C2540b extends ViewOutlineProvider {
        C2540b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f9522d == null) {
                outline.setAlpha(0.0f);
            } else {
                Chip.this.f9522d.getOutline(outline);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.chip.Chip$c */
    /* loaded from: classes.dex */
    public class C2541c extends AbstractC1334a {
        C2541c(Chip chip) {
            super(chip);
        }

        @Override // p032c0.AbstractC1334a
        /* renamed from: B */
        protected int mo6007B(float f10, float f11) {
            if (Chip.this.m10279m() && Chip.this.getCloseIconTouchBounds().contains(f10, f11)) {
                return 1;
            }
            return 0;
        }

        @Override // p032c0.AbstractC1334a
        /* renamed from: C */
        protected void mo6008C(List list) {
            list.add(0);
            if (Chip.this.m10279m() && Chip.this.m10292r()) {
                list.add(1);
            }
        }

        @Override // p032c0.AbstractC1334a
        /* renamed from: J */
        protected boolean mo6011J(int i10, int i11, Bundle bundle) {
            if (i11 == 16) {
                if (i10 == 0) {
                    return Chip.this.performClick();
                }
                if (i10 == 1) {
                    return Chip.this.m10293s();
                }
                return false;
            }
            return false;
        }

        @Override // p032c0.AbstractC1334a
        /* renamed from: M */
        protected void mo6014M(C7458h0 c7458h0) {
            String str;
            c7458h0.m28597V(Chip.this.m10291q());
            c7458h0.m28600Y(Chip.this.isClickable());
            if (!Chip.this.m10291q() && !Chip.this.isClickable()) {
                c7458h0.m28599X("android.view.View");
            } else {
                if (Chip.this.m10291q()) {
                    str = "android.widget.CompoundButton";
                } else {
                    str = "android.widget.Button";
                }
                c7458h0.m28599X(str);
            }
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                c7458h0.m28632s0(text);
            } else {
                c7458h0.m28605b0(text);
            }
        }

        @Override // p032c0.AbstractC1334a
        /* renamed from: N */
        protected void mo6015N(int i10, C7458h0 c7458h0) {
            CharSequence charSequence = "";
            if (i10 == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    c7458h0.m28605b0(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i11 = R$string.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    c7458h0.m28605b0(context.getString(i11, objArr).trim());
                }
                c7458h0.m28595T(Chip.this.getCloseIconTouchBoundsInt());
                c7458h0.m28604b(C7458h0.a.f27514i);
                c7458h0.m28608d0(Chip.this.isEnabled());
                return;
            }
            c7458h0.m28605b0("");
            c7458h0.m28595T(Chip.f9519t);
        }

        @Override // p032c0.AbstractC1334a
        /* renamed from: O */
        protected void mo6016O(int i10, boolean z10) {
            if (i10 == 1) {
                Chip.this.f9530l = z10;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.chipStyle);
    }

    /* renamed from: A */
    private void m10267A() {
        TextPaint paint = getPaint();
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            paint.drawableState = c2554h.getState();
        }
        C6217d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m24805i(getContext(), paint, this.f9537s);
        }
    }

    /* renamed from: B */
    private void m10268B(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                        if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                Log.w("Chip", "Chip text must be vertically center and start aligned");
                                return;
                            }
                            return;
                        }
                        throw new UnsupportedOperationException("Chip does not support multi-line text");
                    }
                    throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                }
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f9536r.setEmpty();
        if (m10279m()) {
            this.f9522d.m10375P0(this.f9536r);
        }
        return this.f9536r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f9535q.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f9535q;
    }

    private C6217d getTextAppearance() {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            return c2554h.m10391X0();
        }
        return null;
    }

    /* renamed from: h */
    private void m10275h(C2554h c2554h) {
        c2554h.m10401c2(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    /* renamed from: i */
    private int[] m10276i() {
        Object isEnabled = isEnabled();
        int i10 = isEnabled;
        if (this.f9530l) {
            i10 = isEnabled + 1;
        }
        int i11 = i10;
        if (this.f9529k) {
            i11 = i10 + 1;
        }
        int i12 = i11;
        if (this.f9528j) {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (isChecked()) {
            i13 = i12 + 1;
        }
        int[] iArr = new int[i13];
        int i14 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i14 = 1;
        }
        if (this.f9530l) {
            iArr[i14] = 16842908;
            i14++;
        }
        if (this.f9529k) {
            iArr[i14] = 16843623;
            i14++;
        }
        if (this.f9528j) {
            iArr[i14] = 16842919;
            i14++;
        }
        if (isChecked()) {
            iArr[i14] = 16842913;
        }
        return iArr;
    }

    /* renamed from: k */
    private void m10277k() {
        if (getBackgroundDrawable() == this.f9523e && this.f9522d.getCallback() == null) {
            this.f9522d.setCallback(this.f9523e);
        }
    }

    /* renamed from: l */
    private boolean m10278l(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = AbstractC1334a.class.getDeclaredField("m");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.f9534p)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = AbstractC1334a.class.getDeclaredMethod("V", Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f9534p, Integer.MIN_VALUE);
                    return true;
                }
            } catch (IllegalAccessException e10) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e10);
            } catch (NoSuchFieldException e11) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e11);
            } catch (NoSuchMethodException e12) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e12);
            } catch (InvocationTargetException e13) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e13);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public boolean m10279m() {
        C2554h c2554h = this.f9522d;
        if (c2554h != null && c2554h.m10362I0() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private void m10280n(Context context, AttributeSet attributeSet, int i10) {
        TypedArray m10660k = AbstractC2588f.m10660k(context, attributeSet, R$styleable.f9369y, i10, R$style.Widget_MaterialComponents_Chip_Action, new int[0]);
        this.f9531m = m10660k.getBoolean(R$styleable.Chip_ensureMinTouchTargetSize, false);
        this.f9533o = (int) Math.ceil(m10660k.getDimension(R$styleable.Chip_chipMinTouchTargetSize, (float) Math.ceil(AbstractC2589g.m10662a(getContext(), 48))));
        m10660k.recycle();
    }

    /* renamed from: o */
    private void m10281o() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C2540b());
        }
    }

    /* renamed from: p */
    private void m10282p(int i10, int i11, int i12, int i13) {
        this.f9523e = new InsetDrawable((Drawable) this.f9522d, i10, i11, i12, i13);
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f9529k != z10) {
            this.f9529k = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f9528j != z10) {
            this.f9528j = z10;
            refreshDrawableState();
        }
    }

    /* renamed from: t */
    private void m10283t() {
        if (this.f9523e != null) {
            this.f9523e = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m10286x();
        }
    }

    /* renamed from: v */
    private void m10284v(C2554h c2554h) {
        if (c2554h != null) {
            c2554h.m10401c2(null);
        }
    }

    /* renamed from: w */
    private void m10285w() {
        if (Build.VERSION.SDK_INT >= 24) {
            return;
        }
        if (m10279m() && m10292r()) {
            AbstractC0616q0.m2636n0(this, this.f9534p);
        } else {
            AbstractC0616q0.m2636n0(this, null);
        }
    }

    /* renamed from: x */
    private void m10286x() {
        if (AbstractC6345b.f24692a) {
            m10287y();
            return;
        }
        this.f9522d.m10442x2(true);
        AbstractC0616q0.m2642q0(this, getBackgroundDrawable());
        m10277k();
    }

    /* renamed from: y */
    private void m10287y() {
        this.f9524f = new RippleDrawable(AbstractC6345b.m25126a(this.f9522d.m10385U0()), getBackgroundDrawable(), null);
        this.f9522d.m10442x2(false);
        AbstractC0616q0.m2642q0(this, this.f9524f);
    }

    /* renamed from: z */
    private void m10288z() {
        C2554h c2554h;
        if (!TextUtils.isEmpty(getText()) && (c2554h = this.f9522d) != null) {
            AbstractC0616q0.m2660z0(this, (int) (this.f9522d.m10356F0() + this.f9522d.m10395Z0() + this.f9522d.m10404e0()), getPaddingTop(), (int) (c2554h.m10346A0() + this.f9522d.m10393Y0() + this.f9522d.m10411i0()), getPaddingBottom());
        }
    }

    @Override // com.google.android.material.chip.C2554h.a
    /* renamed from: a */
    public void mo10289a() {
        m10290j(this.f9533o);
        m10286x();
        m10288z();
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!m10278l(motionEvent) && !this.f9534p.m6021v(motionEvent) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f9534p.m6022w(keyEvent) && this.f9534p.m6006A() != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0403i, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        boolean z10;
        super.drawableStateChanged();
        C2554h c2554h = this.f9522d;
        if (c2554h != null && c2554h.m10405e1()) {
            z10 = this.f9522d.m10394Y1(m10276i());
        } else {
            z10 = false;
        }
        if (z10) {
            invalidate();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f9523e;
        if (insetDrawable == null) {
            return this.f9522d;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            return c2554h.m10440x0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            return c2554h.m10443y0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            return c2554h.m10446z0();
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f9522d;
    }

    public float getChipEndPadding() {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            return c2554h.m10346A0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            return c2554h.m10348B0();
        }
        return null;
    }

    public float getChipIconSize() {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            return c2554h.m10350C0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            return c2554h.m10352D0();
        }
        return null;
    }

    public float getChipMinHeight() {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            return c2554h.m10354E0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            return c2554h.m10356F0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            return c2554h.m10358G0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            return c2554h.m10360H0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            return c2554h.m10362I0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            return c2554h.m10364J0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            return c2554h.m10366K0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            return c2554h.m10368L0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            return c2554h.m10370M0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            return c2554h.m10374O0();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            return c2554h.m10377Q0();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f9534p.m6006A() != 1 && this.f9534p.m6023x() != 1) {
            super.getFocusedRect(rect);
        } else {
            rect.set(getCloseIconTouchBoundsInt());
        }
    }

    public C4348c getHideMotionSpec() {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            return c2554h.m10379R0();
        }
        return null;
    }

    public float getIconEndPadding() {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            return c2554h.m10381S0();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            return c2554h.m10383T0();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            return c2554h.m10385U0();
        }
        return null;
    }

    public C6690m getShapeAppearanceModel() {
        return this.f9522d.m26087A();
    }

    public C4348c getShowMotionSpec() {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            return c2554h.m10387V0();
        }
        return null;
    }

    public float getTextEndPadding() {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            return c2554h.m10393Y0();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            return c2554h.m10395Z0();
        }
        return 0.0f;
    }

    /* renamed from: j */
    public boolean m10290j(int i10) {
        int i11;
        this.f9533o = i10;
        int i12 = 0;
        if (!m10294u()) {
            m10283t();
            return false;
        }
        int max = Math.max(0, i10 - this.f9522d.getIntrinsicHeight());
        int max2 = Math.max(0, i10 - this.f9522d.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            m10283t();
            return false;
        }
        if (max2 > 0) {
            i11 = max2 / 2;
        } else {
            i11 = 0;
        }
        if (max > 0) {
            i12 = max / 2;
        }
        if (this.f9523e != null) {
            Rect rect = new Rect();
            this.f9523e.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                return true;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        m10282p(i11, i12, i11, i12);
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC6687j.m26122f(this, this.f9522d);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f9520u);
        }
        if (m10291q()) {
            View.mergeDrawableStates(onCreateDrawableState, f9521v);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        this.f9534p.m6010I(z10, i10, rect);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                setCloseIconHovered(false);
            }
        } else {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!m10291q() && !isClickable()) {
            accessibilityNodeInfo.setClassName("android.view.View");
        } else {
            if (m10291q()) {
                str = "android.widget.CompoundButton";
            } else {
                str = "android.widget.Button";
            }
            accessibilityNodeInfo.setClassName(str);
        }
        accessibilityNodeInfo.setCheckable(m10291q());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        PointerIcon systemIcon;
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
            return systemIcon;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f9532n != i10) {
            this.f9532n = i10;
            m10288z();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L39
            if (r0 == r2) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L40
        L21:
            boolean r0 = r5.f9528j
            if (r0 == 0) goto L40
            if (r1 != 0) goto L3e
            r5.setCloseIconPressed(r3)
            goto L3e
        L2b:
            boolean r0 = r5.f9528j
            if (r0 == 0) goto L34
            r5.m10293s()
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            r5.setCloseIconPressed(r3)
            goto L41
        L39:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r2)
        L3e:
            r0 = 1
            goto L41
        L40:
            r0 = 0
        L41:
            if (r0 != 0) goto L4b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
            goto L4b
        L4a:
            r2 = 0
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: q */
    public boolean m10291q() {
        C2554h c2554h = this.f9522d;
        if (c2554h != null && c2554h.m10402d1()) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public boolean m10292r() {
        C2554h c2554h = this.f9522d;
        if (c2554h != null && c2554h.m10407f1()) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public boolean m10293s() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f9525g;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        this.f9534p.m6019U(1, 1);
        return z10;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f9524f) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.C0403i, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f9524f) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.C0403i, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10418m1(z10);
        }
    }

    public void setCheckableResource(int i10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10420n1(i10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C2554h c2554h = this.f9522d;
        if (c2554h == null) {
            this.f9527i = z10;
            return;
        }
        if (c2554h.m10402d1()) {
            boolean isChecked = isChecked();
            super.setChecked(z10);
            if (isChecked != z10 && (onCheckedChangeListener = this.f9526h) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z10);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10422o1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10424p1(i10);
        }
    }

    public void setCheckedIconVisible(int i10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10426q1(i10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10430s1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10432t1(i10);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10434u1(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10436v1(i10);
        }
    }

    public void setChipDrawable(C2554h c2554h) {
        C2554h c2554h2 = this.f9522d;
        if (c2554h2 != c2554h) {
            m10284v(c2554h2);
            this.f9522d = c2554h;
            c2554h.m10421n2(false);
            m10275h(this.f9522d);
            m10290j(this.f9533o);
            m10286x();
        }
    }

    public void setChipEndPadding(float f10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10438w1(f10);
        }
    }

    public void setChipEndPaddingResource(int i10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10441x1(i10);
        }
    }

    public void setChipIcon(Drawable drawable) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10444y1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10447z1(i10);
        }
    }

    public void setChipIconSize(float f10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10347A1(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10349B1(i10);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10351C1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10353D1(i10);
        }
    }

    public void setChipIconVisible(int i10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10355E1(i10);
        }
    }

    public void setChipMinHeight(float f10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10359G1(f10);
        }
    }

    public void setChipMinHeightResource(int i10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10361H1(i10);
        }
    }

    public void setChipStartPadding(float f10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10363I1(f10);
        }
    }

    public void setChipStartPaddingResource(int i10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10365J1(i10);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10367K1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10369L1(i10);
        }
    }

    public void setChipStrokeWidth(float f10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10371M1(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10373N1(i10);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10376P1(drawable);
        }
        m10285w();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10378Q1(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10380R1(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10382S1(i10);
        }
    }

    public void setCloseIconResource(int i10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10384T1(i10);
        }
        m10285w();
    }

    public void setCloseIconSize(float f10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10386U1(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10388V1(i10);
        }
    }

    public void setCloseIconStartPadding(float f10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10390W1(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10392X1(i10);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10396Z1(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10398a2(i10);
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m26095Q(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f9522d == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            C2554h c2554h = this.f9522d;
            if (c2554h != null) {
                c2554h.m10403d2(truncateAt);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f9531m = z10;
        m10290j(this.f9533o);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(C4348c c4348c) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10406e2(c4348c);
        }
    }

    public void setHideMotionSpecResource(int i10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10408f2(i10);
        }
    }

    public void setIconEndPadding(float f10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10409g2(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10410h2(i10);
        }
    }

    public void setIconStartPadding(float f10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10412i2(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10413j2(i10);
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f9522d == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 <= 1) {
            super.setLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 <= 1) {
            super.setMaxLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10415k2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 <= 1) {
            super.setMinLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f9526h = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f9525g = onClickListener;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10417l2(colorStateList);
        }
        if (!this.f9522d.m10399b1()) {
            m10287y();
        }
    }

    public void setRippleColorResource(int i10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10419m2(i10);
            if (!this.f9522d.m10399b1()) {
                m10287y();
            }
        }
    }

    @Override // p326s5.InterfaceC6693p
    public void setShapeAppearanceModel(C6690m c6690m) {
        this.f9522d.setShapeAppearanceModel(c6690m);
    }

    public void setShowMotionSpec(C4348c c4348c) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10423o2(c4348c);
        }
    }

    public void setShowMotionSpecResource(int i10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10425p2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (z10) {
            super.setSingleLine(z10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        C2554h c2554h = this.f9522d;
        if (c2554h == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (c2554h.m10445y2()) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        super.setText(charSequence2, bufferType);
        C2554h c2554h2 = this.f9522d;
        if (c2554h2 != null) {
            c2554h2.m10427q2(charSequence);
        }
    }

    public void setTextAppearance(C6217d c6217d) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10429r2(c6217d);
        }
        m10267A();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10433t2(f10);
        }
    }

    public void setTextEndPaddingResource(int i10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10435u2(i10);
        }
    }

    public void setTextStartPadding(float f10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10437v2(f10);
        }
    }

    public void setTextStartPaddingResource(int i10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10439w2(i10);
        }
    }

    /* renamed from: u */
    public boolean m10294u() {
        return this.f9531m;
    }

    public Chip(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f9535q = new Rect();
        this.f9536r = new RectF();
        this.f9537s = new C2539a();
        m10268B(attributeSet);
        int i11 = R$style.Widget_MaterialComponents_Chip_Action;
        C2554h m10335n0 = C2554h.m10335n0(context, attributeSet, i10, i11);
        m10280n(context, attributeSet, i10);
        setChipDrawable(m10335n0);
        m10335n0.m26095Q(AbstractC0616q0.m2651v(this));
        TypedArray m10660k = AbstractC2588f.m10660k(context, attributeSet, R$styleable.f9369y, i10, i11, new int[0]);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 23) {
            setTextColor(AbstractC6216c.m24791a(context, m10660k, R$styleable.Chip_android_textColor));
        }
        boolean hasValue = m10660k.hasValue(R$styleable.Chip_shapeAppearance);
        m10660k.recycle();
        C2541c c2541c = new C2541c(this);
        this.f9534p = c2541c;
        if (i12 >= 24) {
            AbstractC0616q0.m2636n0(this, c2541c);
        } else {
            m10285w();
        }
        if (!hasValue) {
            m10281o();
        }
        setChecked(this.f9527i);
        setText(m10335n0.m10389W0());
        setEllipsize(m10335n0.m10377Q0());
        setIncludeFontPadding(false);
        m10267A();
        if (!this.f9522d.m10445y2()) {
            setSingleLine();
        }
        setGravity(8388627);
        m10288z();
        if (m10294u()) {
            setMinHeight(this.f9533o);
        }
        this.f9532n = AbstractC0616q0.m2579B(this);
    }

    public void setCloseIconVisible(boolean z10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10400b2(z10);
        }
        m10285w();
    }

    public void setCheckedIconVisible(boolean z10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10428r1(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10357F1(z10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10431s2(i10);
        }
        m10267A();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        C2554h c2554h = this.f9522d;
        if (c2554h != null) {
            c2554h.m10431s2(i10);
        }
        m10267A();
    }
}
