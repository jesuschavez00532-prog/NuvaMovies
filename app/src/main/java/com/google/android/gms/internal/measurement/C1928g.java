package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.g */
/* loaded from: classes.dex */
public final class C1928g implements InterfaceC2078q {

    /* renamed from: a */
    private final boolean f7754a;

    public C1928g(Boolean bool) {
        boolean booleanValue;
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        this.f7754a = booleanValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1928g) && this.f7754a == ((C1928g) obj).f7754a) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: g */
    public final InterfaceC2078q mo8349g() {
        return new C1928g(Boolean.valueOf(this.f7754a));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: h */
    public final Double mo8350h() {
        double d10;
        if (true != this.f7754a) {
            d10 = 0.0d;
        } else {
            d10 = 1.0d;
        }
        return Double.valueOf(d10);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f7754a).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: i */
    public final String mo8351i() {
        return Boolean.toString(this.f7754a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: j */
    public final Boolean mo8352j() {
        return Boolean.valueOf(this.f7754a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: k */
    public final Iterator mo8353k() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: o */
    public final InterfaceC2078q mo8355o(String str, C2158v4 c2158v4, List list) {
        if ("toString".equals(str)) {
            return new C2138u(Boolean.toString(this.f7754a));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f7754a), str));
    }

    public final String toString() {
        return String.valueOf(this.f7754a);
    }
}
