package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.v */
/* loaded from: classes.dex */
public final class C2153v implements InterfaceC2078q {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C2153v;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: g */
    public final InterfaceC2078q mo8349g() {
        return InterfaceC2078q.f8002Q;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: h */
    public final Double mo8350h() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: i */
    public final String mo8351i() {
        return "undefined";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: j */
    public final Boolean mo8352j() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: k */
    public final Iterator mo8353k() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: o */
    public final InterfaceC2078q mo8355o(String str, C2158v4 c2158v4, List list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }
}
