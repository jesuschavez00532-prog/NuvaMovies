package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.R$attr;
import androidx.appcompat.view.menu.C0327g;
import androidx.appcompat.view.menu.InterfaceC0331k;
import androidx.appcompat.widget.AbstractC0445s1;
import androidx.appcompat.widget.AbstractC0450t2;
import androidx.core.view.AbstractC0616q0;
import androidx.core.view.C0551a;
import androidx.core.widget.AbstractC0665d0;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import p254o.AbstractC5894i;
import p290q.AbstractC6306k;
import p389x.C7458h0;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC2586d implements InterfaceC0331k.a {

    /* renamed from: F */
    private static final int[] f9738F = {R.attr.state_checked};

    /* renamed from: A */
    private C0327g f9739A;

    /* renamed from: B */
    private ColorStateList f9740B;

    /* renamed from: C */
    private boolean f9741C;

    /* renamed from: D */
    private Drawable f9742D;

    /* renamed from: E */
    private final C0551a f9743E;

    /* renamed from: v */
    private int f9744v;

    /* renamed from: w */
    private boolean f9745w;

    /* renamed from: x */
    boolean f9746x;

    /* renamed from: y */
    private final CheckedTextView f9747y;

    /* renamed from: z */
    private FrameLayout f9748z;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    /* loaded from: classes.dex */
    class C2582a extends C0551a {
        C2582a() {
        }

        @Override // androidx.core.view.C0551a
        /* renamed from: g */
        public void mo2382g(View view, C7458h0 c7458h0) {
            super.mo2382g(view, c7458h0);
            c7458h0.m28597V(NavigationMenuItemView.this.f9746x);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: B */
    private void m10584B() {
        if (m10586D()) {
            this.f9747y.setVisibility(8);
            FrameLayout frameLayout = this.f9748z;
            if (frameLayout != null) {
                AbstractC0445s1.a aVar = (AbstractC0445s1.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.f9748z.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f9747y.setVisibility(0);
        FrameLayout frameLayout2 = this.f9748z;
        if (frameLayout2 != null) {
            AbstractC0445s1.a aVar2 = (AbstractC0445s1.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.f9748z.setLayoutParams(aVar2);
        }
    }

    /* renamed from: C */
    private StateListDrawable m10585C() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(R$attr.colorControlHighlight, typedValue, true)) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(f9738F, new ColorDrawable(typedValue.data));
            stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            return stateListDrawable;
        }
        return null;
    }

    /* renamed from: D */
    private boolean m10586D() {
        if (this.f9739A.getTitle() == null && this.f9739A.getIcon() == null && this.f9739A.getActionView() != null) {
            return true;
        }
        return false;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f9748z == null) {
                this.f9748z = (FrameLayout) ((ViewStub) findViewById(R$id.design_menu_item_action_area_stub)).inflate();
            }
            this.f9748z.removeAllViews();
            this.f9748z.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0331k.a
    /* renamed from: d */
    public boolean mo1263d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0331k.a
    /* renamed from: e */
    public void mo1264e(C0327g c0327g, int i10) {
        int i11;
        this.f9739A = c0327g;
        if (c0327g.isVisible()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        setVisibility(i11);
        if (getBackground() == null) {
            AbstractC0616q0.m2642q0(this, m10585C());
        }
        setCheckable(c0327g.isCheckable());
        setChecked(c0327g.isChecked());
        setEnabled(c0327g.isEnabled());
        setTitle(c0327g.getTitle());
        setIcon(c0327g.getIcon());
        setActionView(c0327g.getActionView());
        setContentDescription(c0327g.getContentDescription());
        AbstractC0450t2.m1940a(this, c0327g.getTooltipText());
        m10584B();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0331k.a
    public C0327g getItemData() {
        return this.f9739A;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        C0327g c0327g = this.f9739A;
        if (c0327g != null && c0327g.isCheckable() && this.f9739A.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f9738F);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f9746x != z10) {
            this.f9746x = z10;
            this.f9743E.mo2386l(this.f9747y, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.f9747y.setChecked(z10);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, 0, i10, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f9741C) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = AbstractC6306k.m25072r(drawable).mutate();
                AbstractC6306k.m25069o(drawable, this.f9740B);
            }
            int i10 = this.f9744v;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f9745w) {
            if (this.f9742D == null) {
                Drawable m23796d = AbstractC5894i.m23796d(getResources(), R$drawable.navigation_empty_icon, getContext().getTheme());
                this.f9742D = m23796d;
                if (m23796d != null) {
                    int i11 = this.f9744v;
                    m23796d.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.f9742D;
        }
        AbstractC0665d0.m2938i(this.f9747y, drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.f9747y.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f9744v = i10;
    }

    void setIconTintList(ColorStateList colorStateList) {
        boolean z10;
        this.f9740B = colorStateList;
        if (colorStateList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9741C = z10;
        C0327g c0327g = this.f9739A;
        if (c0327g != null) {
            setIcon(c0327g.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f9747y.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f9745w = z10;
    }

    public void setTextAppearance(int i10) {
        AbstractC0665d0.m2943n(this.f9747y, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f9747y.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f9747y.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C2582a c2582a = new C2582a();
        this.f9743E = c2582a;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R$layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R$dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R$id.design_menu_item_text);
        this.f9747y = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        AbstractC0616q0.m2636n0(checkedTextView, c2582a);
    }
}
