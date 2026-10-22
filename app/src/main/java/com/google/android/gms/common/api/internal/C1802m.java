package com.google.android.gms.common.api.internal;

import com.lzy.okgo.cache.CacheEntity;
import p172i4.C4858d;
import p203k4.AbstractC5116m;
import p203k4.C5104b;
import p219l4.AbstractC5388m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.m */
/* loaded from: classes.dex */
public final class C1802m {

    /* renamed from: a */
    private final C5104b f7591a;

    /* renamed from: b */
    private final C4858d f7592b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1802m(C5104b c5104b, C4858d c4858d, AbstractC5116m abstractC5116m) {
        this.f7591a = c5104b;
        this.f7592b = c4858d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C1802m)) {
            C1802m c1802m = (C1802m) obj;
            if (AbstractC5388m.m21771a(this.f7591a, c1802m.f7591a) && AbstractC5388m.m21771a(this.f7592b, c1802m.f7592b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC5388m.m21772b(this.f7591a, this.f7592b);
    }

    public final String toString() {
        return AbstractC5388m.m21773c(this).m21774a(CacheEntity.KEY, this.f7591a).m21774a("feature", this.f7592b).toString();
    }
}
