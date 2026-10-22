package androidx.core.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* renamed from: androidx.core.widget.s */
/* loaded from: classes.dex */
public final class C0684s {

    /* renamed from: a */
    OverScroller f2506a;

    C0684s(Context context, Interpolator interpolator) {
        OverScroller overScroller;
        if (interpolator != null) {
            overScroller = new OverScroller(context, interpolator);
        } else {
            overScroller = new OverScroller(context);
        }
        this.f2506a = overScroller;
    }

    /* renamed from: b */
    public static C0684s m2987b(Context context, Interpolator interpolator) {
        return new C0684s(context, interpolator);
    }

    /* renamed from: a */
    public boolean m2988a() {
        return this.f2506a.computeScrollOffset();
    }

    /* renamed from: c */
    public int m2989c() {
        return this.f2506a.getCurrX();
    }

    /* renamed from: d */
    public int m2990d() {
        return this.f2506a.getCurrY();
    }

    /* renamed from: e */
    public void m2991e(int i10, int i11, int i12, int i13, int i14) {
        this.f2506a.startScroll(i10, i11, i12, i13, i14);
    }
}
