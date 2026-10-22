package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: com.google.android.material.appbar.c */
/* loaded from: classes.dex */
abstract class AbstractC2523c extends CoordinatorLayout.AbstractC0482b {

    /* renamed from: a */
    private C2524d f9397a;

    /* renamed from: b */
    private int f9398b;

    /* renamed from: c */
    private int f9399c;

    public AbstractC2523c() {
        this.f9398b = 0;
        this.f9399c = 0;
    }

    /* renamed from: E */
    public int mo10149E() {
        C2524d c2524d = this.f9397a;
        if (c2524d != null) {
            return c2524d.m10168b();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F */
    public void mo10162F(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.m2090G(view, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
    /* renamed from: l */
    public boolean mo2122l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        mo10162F(coordinatorLayout, view, i10);
        if (this.f9397a == null) {
            this.f9397a = new C2524d(view);
        }
        this.f9397a.m10169c();
        this.f9397a.m10167a();
        int i11 = this.f9398b;
        if (i11 != 0) {
            this.f9397a.m10171e(i11);
            this.f9398b = 0;
        }
        int i12 = this.f9399c;
        if (i12 != 0) {
            this.f9397a.m10170d(i12);
            this.f9399c = 0;
            return true;
        }
        return true;
    }

    public AbstractC2523c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9398b = 0;
        this.f9399c = 0;
    }
}
