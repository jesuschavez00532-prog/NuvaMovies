package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: b */
    private final Rect f9984b;

    /* renamed from: c */
    private final RectF f9985c;

    /* renamed from: d */
    private final RectF f9986d;

    /* renamed from: e */
    private final int[] f9987e;

    public FabTransformationBehavior() {
        this.f9984b = new Rect();
        this.f9985c = new RectF();
        this.f9986d = new RectF();
        this.f9987e = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
    /* renamed from: e */
    public boolean mo2115e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
    /* renamed from: g */
    public void mo2117g(CoordinatorLayout.C0485e c0485e) {
        if (c0485e.f2156h == 0) {
            c0485e.f2156h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9984b = new Rect();
        this.f9985c = new RectF();
        this.f9986d = new RectF();
        this.f9987e = new int[2];
    }
}
