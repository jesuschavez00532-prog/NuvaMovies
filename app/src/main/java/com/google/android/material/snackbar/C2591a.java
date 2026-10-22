package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: com.google.android.material.snackbar.a */
/* loaded from: classes.dex */
public class C2591a {
    public C2591a(SwipeDismissBehavior swipeDismissBehavior) {
        swipeDismissBehavior.m10182K(0.1f);
        swipeDismissBehavior.m10181J(0.6f);
        swipeDismissBehavior.m10183L(0);
    }

    /* renamed from: a */
    public boolean m10667a(View view) {
        return view instanceof AbstractC2594d;
    }

    /* renamed from: b */
    public void m10668b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                C2595e.m10670b().m10674f(null);
                return;
            }
            return;
        }
        if (coordinatorLayout.m2106z(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            C2595e.m10670b().m10673e(null);
        }
    }
}
