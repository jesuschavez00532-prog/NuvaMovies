package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.AbstractC0616q0;

/* renamed from: com.google.android.material.appbar.d */
/* loaded from: classes.dex */
class C2524d {

    /* renamed from: a */
    private final View f9400a;

    /* renamed from: b */
    private int f9401b;

    /* renamed from: c */
    private int f9402c;

    /* renamed from: d */
    private int f9403d;

    /* renamed from: e */
    private int f9404e;

    /* renamed from: f */
    private boolean f9405f = true;

    /* renamed from: g */
    private boolean f9406g = true;

    public C2524d(View view) {
        this.f9400a = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m10167a() {
        View view = this.f9400a;
        AbstractC0616q0.m2607Y(view, this.f9403d - (view.getTop() - this.f9401b));
        View view2 = this.f9400a;
        AbstractC0616q0.m2606X(view2, this.f9404e - (view2.getLeft() - this.f9402c));
    }

    /* renamed from: b */
    public int m10168b() {
        return this.f9403d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m10169c() {
        this.f9401b = this.f9400a.getTop();
        this.f9402c = this.f9400a.getLeft();
    }

    /* renamed from: d */
    public boolean m10170d(int i10) {
        if (this.f9406g && this.f9404e != i10) {
            this.f9404e = i10;
            m10167a();
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean m10171e(int i10) {
        if (this.f9405f && this.f9403d != i10) {
            this.f9403d = i10;
            m10167a();
            return true;
        }
        return false;
    }
}
