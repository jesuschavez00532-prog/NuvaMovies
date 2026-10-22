package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h */
/* loaded from: classes.dex */
public final class C1943h implements InterfaceC2078q {

    /* renamed from: a */
    private final InterfaceC2078q f7790a;

    /* renamed from: b */
    private final String f7791b;

    public C1943h(String str) {
        this.f7790a = InterfaceC2078q.f8002Q;
        this.f7791b = str;
    }

    /* renamed from: a */
    public final InterfaceC2078q m8476a() {
        return this.f7790a;
    }

    /* renamed from: b */
    public final String m8477b() {
        return this.f7791b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1943h)) {
            return false;
        }
        C1943h c1943h = (C1943h) obj;
        if (this.f7791b.equals(c1943h.f7791b) && this.f7790a.equals(c1943h.f7790a)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: g */
    public final InterfaceC2078q mo8349g() {
        return new C1943h(this.f7791b, this.f7790a.mo8349g());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: h */
    public final Double mo8350h() {
        throw new IllegalStateException("Control is not a double");
    }

    public final int hashCode() {
        return (this.f7791b.hashCode() * 31) + this.f7790a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: i */
    public final String mo8351i() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: j */
    public final Boolean mo8352j() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: k */
    public final Iterator mo8353k() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: o */
    public final InterfaceC2078q mo8355o(String str, C2158v4 c2158v4, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public C1943h(String str, InterfaceC2078q interfaceC2078q) {
        this.f7790a = interfaceC2078q;
        this.f7791b = str;
    }
}
