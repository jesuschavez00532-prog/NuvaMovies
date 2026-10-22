package androidx.core.view;

import android.os.Build;
import p373w.AbstractC7338c;

/* renamed from: androidx.core.view.q */
/* loaded from: classes.dex */
public final class C0615q {

    /* renamed from: a */
    private final Object f2393a;

    private C0615q(Object obj) {
        this.f2393a = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C0615q m2572e(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0615q(obj);
    }

    /* renamed from: a */
    public int m2573a() {
        int safeInsetBottom;
        if (Build.VERSION.SDK_INT >= 28) {
            safeInsetBottom = AbstractC0595l.m2497a(this.f2393a).getSafeInsetBottom();
            return safeInsetBottom;
        }
        return 0;
    }

    /* renamed from: b */
    public int m2574b() {
        int safeInsetLeft;
        if (Build.VERSION.SDK_INT >= 28) {
            safeInsetLeft = AbstractC0595l.m2497a(this.f2393a).getSafeInsetLeft();
            return safeInsetLeft;
        }
        return 0;
    }

    /* renamed from: c */
    public int m2575c() {
        int safeInsetRight;
        if (Build.VERSION.SDK_INT >= 28) {
            safeInsetRight = AbstractC0595l.m2497a(this.f2393a).getSafeInsetRight();
            return safeInsetRight;
        }
        return 0;
    }

    /* renamed from: d */
    public int m2576d() {
        int safeInsetTop;
        if (Build.VERSION.SDK_INT >= 28) {
            safeInsetTop = AbstractC0595l.m2497a(this.f2393a).getSafeInsetTop();
            return safeInsetTop;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0615q.class == obj.getClass()) {
            return AbstractC7338c.m28317a(this.f2393a, ((C0615q) obj).f2393a);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f2393a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f2393a + "}";
    }
}
