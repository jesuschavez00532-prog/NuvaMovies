package org.xutils.view;

import android.app.Activity;
import android.view.View;

/* renamed from: org.xutils.view.a */
/* loaded from: classes3.dex */
final class C6125a {

    /* renamed from: a */
    private View f24112a;

    /* renamed from: b */
    private Activity f24113b;

    public C6125a(View view) {
        this.f24112a = view;
    }

    /* renamed from: a */
    public View m24419a(int i10) {
        View view = this.f24112a;
        if (view != null) {
            return view.findViewById(i10);
        }
        Activity activity = this.f24113b;
        if (activity != null) {
            return activity.findViewById(i10);
        }
        return null;
    }

    /* renamed from: b */
    public View m24420b(int i10, int i11) {
        View view;
        if (i11 > 0) {
            view = m24419a(i11);
        } else {
            view = null;
        }
        if (view != null) {
            return view.findViewById(i10);
        }
        return m24419a(i10);
    }

    /* renamed from: c */
    public View m24421c(C6126b c6126b) {
        return m24420b(c6126b.f24114a, c6126b.f24115b);
    }

    public C6125a(Activity activity) {
        this.f24113b = activity;
    }
}
