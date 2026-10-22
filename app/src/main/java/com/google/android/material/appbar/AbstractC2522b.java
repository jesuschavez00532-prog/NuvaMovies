package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC0616q0;
import androidx.core.view.AbstractC0619r;
import androidx.core.view.C0609o1;
import java.util.List;
import p320s.AbstractC6605a;

/* renamed from: com.google.android.material.appbar.b */
/* loaded from: classes.dex */
abstract class AbstractC2522b extends AbstractC2523c {

    /* renamed from: d */
    final Rect f9393d;

    /* renamed from: e */
    final Rect f9394e;

    /* renamed from: f */
    private int f9395f;

    /* renamed from: g */
    private int f9396g;

    public AbstractC2522b() {
        this.f9393d = new Rect();
        this.f9394e = new Rect();
        this.f9395f = 0;
    }

    /* renamed from: L */
    private static int m10161L(int i10) {
        if (i10 == 0) {
            return 8388659;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.appbar.AbstractC2523c
    /* renamed from: F */
    public void mo10162F(CoordinatorLayout coordinatorLayout, View view, int i10) {
        View mo10152G = mo10152G(coordinatorLayout.m2101q(view));
        if (mo10152G != null) {
            CoordinatorLayout.C0485e c0485e = (CoordinatorLayout.C0485e) view.getLayoutParams();
            Rect rect = this.f9393d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0485e).leftMargin, mo10152G.getBottom() + ((ViewGroup.MarginLayoutParams) c0485e).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0485e).rightMargin, ((coordinatorLayout.getHeight() + mo10152G.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0485e).bottomMargin);
            C0609o1 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && AbstractC0616q0.m2657y(coordinatorLayout) && !AbstractC0616q0.m2657y(view)) {
                rect.left += lastWindowInsets.m2519i();
                rect.right -= lastWindowInsets.m2520j();
            }
            Rect rect2 = this.f9394e;
            AbstractC0619r.m2799a(m10161L(c0485e.f2151c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
            int m10163H = m10163H(mo10152G);
            view.layout(rect2.left, rect2.top - m10163H, rect2.right, rect2.bottom - m10163H);
            this.f9395f = rect2.top - mo10152G.getBottom();
            return;
        }
        super.mo10162F(coordinatorLayout, view, i10);
        this.f9395f = 0;
    }

    /* renamed from: G */
    abstract View mo10152G(List list);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public final int m10163H(View view) {
        if (this.f9396g == 0) {
            return 0;
        }
        float mo10153I = mo10153I(view);
        int i10 = this.f9396g;
        return AbstractC6605a.m25818b((int) (mo10153I * i10), 0, i10);
    }

    /* renamed from: I */
    abstract float mo10153I(View view);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public int mo10154J(View view) {
        return view.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public final int m10164K() {
        return this.f9395f;
    }

    /* renamed from: M */
    public final void m10165M(int i10) {
        this.f9396g = i10;
    }

    /* renamed from: N */
    protected boolean m10166N() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
    /* renamed from: m */
    public boolean mo2123m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        View mo10152G;
        int i14;
        C0609o1 lastWindowInsets;
        int i15 = view.getLayoutParams().height;
        if ((i15 == -1 || i15 == -2) && (mo10152G = mo10152G(coordinatorLayout.m2101q(view))) != null) {
            int size = View.MeasureSpec.getSize(i12);
            if (size > 0) {
                if (AbstractC0616q0.m2657y(mo10152G) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.m2521k() + lastWindowInsets.m2518h();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int mo10154J = size + mo10154J(mo10152G);
            int measuredHeight = mo10152G.getMeasuredHeight();
            if (m10166N()) {
                view.setTranslationY(-measuredHeight);
            } else {
                mo10154J -= measuredHeight;
            }
            if (i15 == -1) {
                i14 = 1073741824;
            } else {
                i14 = Integer.MIN_VALUE;
            }
            coordinatorLayout.m2091H(view, i10, i11, View.MeasureSpec.makeMeasureSpec(mo10154J, i14), i13);
            return true;
        }
        return false;
    }

    public AbstractC2522b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9393d = new Rect();
        this.f9394e = new Rect();
        this.f9395f = 0;
    }
}
