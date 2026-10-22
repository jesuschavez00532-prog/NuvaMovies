package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.core.view.i0 */
/* loaded from: classes.dex */
public class C0584i0 {

    /* renamed from: a */
    private int f2345a;

    /* renamed from: b */
    private int f2346b;

    public C0584i0(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public int m2468a() {
        return this.f2345a | this.f2346b;
    }

    /* renamed from: b */
    public void m2469b(View view, View view2, int i10) {
        m2470c(view, view2, i10, 0);
    }

    /* renamed from: c */
    public void m2470c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f2346b = i10;
        } else {
            this.f2345a = i10;
        }
    }

    /* renamed from: d */
    public void m2471d(View view, int i10) {
        if (i10 == 1) {
            this.f2346b = 0;
        } else {
            this.f2345a = 0;
        }
    }
}
