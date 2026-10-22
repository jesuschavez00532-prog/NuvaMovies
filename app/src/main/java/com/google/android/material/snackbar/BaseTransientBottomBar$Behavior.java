package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: j */
    private final C2591a f9822j = new C2591a(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* renamed from: E */
    public boolean mo10180E(View view) {
        return this.f9822j.m10667a(view);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
    /* renamed from: k */
    public boolean mo2121k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f9822j.m10668b(coordinatorLayout, view, motionEvent);
        return super.mo2121k(coordinatorLayout, view, motionEvent);
    }
}
