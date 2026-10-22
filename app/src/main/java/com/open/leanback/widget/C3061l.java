package com.open.leanback.widget;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import java.util.Map;
import p214l.C5309g;

/* renamed from: com.open.leanback.widget.l */
/* loaded from: classes2.dex */
class C3061l {

    /* renamed from: a */
    private int f12545a = 0;

    /* renamed from: b */
    private int f12546b = 100;

    /* renamed from: c */
    private C5309g f12547c;

    /* renamed from: e */
    static String m12588e(int i10) {
        return Integer.toString(i10);
    }

    /* renamed from: a */
    protected void m12589a() {
        int i10 = this.f12545a;
        if (i10 == 2) {
            if (this.f12546b > 0) {
                C5309g c5309g = this.f12547c;
                if (c5309g == null || c5309g.m21408e() != this.f12546b) {
                    this.f12547c = new C5309g(this.f12546b);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException();
        }
        if (i10 != 3 && i10 != 1) {
            this.f12547c = null;
            return;
        }
        C5309g c5309g2 = this.f12547c;
        if (c5309g2 == null || c5309g2.m21408e() != Integer.MAX_VALUE) {
            this.f12547c = new C5309g(Integer.MAX_VALUE);
        }
    }

    /* renamed from: b */
    public void m12590b() {
        C5309g c5309g = this.f12547c;
        if (c5309g != null) {
            c5309g.m21406c();
        }
    }

    /* renamed from: c */
    public final int m12591c() {
        return this.f12546b;
    }

    /* renamed from: d */
    public final int m12592d() {
        return this.f12545a;
    }

    /* renamed from: f */
    public final void m12593f(Bundle bundle) {
        C5309g c5309g = this.f12547c;
        if (c5309g != null && bundle != null) {
            c5309g.m21406c();
            for (String str : bundle.keySet()) {
                this.f12547c.m21409f(str, bundle.getSparseParcelableArray(str));
            }
        }
    }

    /* renamed from: g */
    public final void m12594g(View view, int i10) {
        if (this.f12547c != null) {
            SparseArray<Parcelable> sparseArray = (SparseArray) this.f12547c.m21410g(m12588e(i10));
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
            }
        }
    }

    /* renamed from: h */
    public void m12595h(int i10) {
        C5309g c5309g = this.f12547c;
        if (c5309g != null && c5309g.m21411i() != 0) {
            this.f12547c.m21410g(m12588e(i10));
        }
    }

    /* renamed from: i */
    public final Bundle m12596i() {
        C5309g c5309g = this.f12547c;
        if (c5309g != null && c5309g.m21411i() != 0) {
            Map m21413k = this.f12547c.m21413k();
            Bundle bundle = new Bundle();
            for (Map.Entry entry : m21413k.entrySet()) {
                bundle.putSparseParcelableArray((String) entry.getKey(), (SparseArray) entry.getValue());
            }
            return bundle;
        }
        return null;
    }

    /* renamed from: j */
    public final void m12597j(View view, int i10) {
        int i11 = this.f12545a;
        if (i11 != 1) {
            if (i11 == 2 || i11 == 3) {
                m12599l(view, i10);
                return;
            }
            return;
        }
        m12595h(i10);
    }

    /* renamed from: k */
    public final Bundle m12598k(Bundle bundle, View view, int i10) {
        if (this.f12545a != 0) {
            String m12588e = m12588e(i10);
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            view.saveHierarchyState(sparseArray);
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray(m12588e, sparseArray);
        }
        return bundle;
    }

    /* renamed from: l */
    protected final void m12599l(View view, int i10) {
        if (this.f12547c != null) {
            String m12588e = m12588e(i10);
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            view.saveHierarchyState(sparseArray);
            this.f12547c.m21409f(m12588e, sparseArray);
        }
    }

    /* renamed from: m */
    public final void m12600m(int i10) {
        this.f12546b = i10;
        m12589a();
    }

    /* renamed from: n */
    public final void m12601n(int i10) {
        this.f12545a = i10;
        m12589a();
    }
}
