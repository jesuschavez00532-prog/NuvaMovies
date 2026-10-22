package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p144g5.C4349d;

/* loaded from: classes.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: b */
    private final C4349d f9988b;

    /* renamed from: c */
    private final C4349d f9989c;

    public FabTransformationScrimBehavior() {
        this.f9988b = new C4349d(75L, 150L);
        this.f9989c = new C4349d(0L, 150L);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
    /* renamed from: D */
    public boolean mo2110D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.mo2110D(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
    /* renamed from: e */
    public boolean mo2115e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9988b = new C4349d(75L, 150L);
        this.f9989c = new C4349d(0L, 150L);
    }
}
