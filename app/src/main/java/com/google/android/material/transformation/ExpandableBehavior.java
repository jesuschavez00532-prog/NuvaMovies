package com.google.android.material.transformation;

import android.content.Context;
import android.support.v4.media.session.AbstractC0272b;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC0616q0;
import java.util.List;
import p247n5.InterfaceC5745a;

/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.AbstractC0482b {

    /* renamed from: a */
    private int f9983a;

    public ExpandableBehavior() {
        this.f9983a = 0;
    }

    /* renamed from: E */
    protected InterfaceC5745a m10830E(CoordinatorLayout coordinatorLayout, View view) {
        List m2101q = coordinatorLayout.m2101q(view);
        int size = m2101q.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) m2101q.get(i10);
            if (mo2115e(coordinatorLayout, view, view2)) {
                AbstractC0272b.m941a(view2);
                return null;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
    /* renamed from: e */
    public abstract boolean mo2115e(CoordinatorLayout coordinatorLayout, View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
    /* renamed from: h */
    public boolean mo2118h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC0272b.m941a(view2);
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
    /* renamed from: l */
    public boolean mo2122l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (!AbstractC0616q0.m2600R(view)) {
            m10830E(coordinatorLayout, view);
            return false;
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9983a = 0;
    }
}
