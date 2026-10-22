package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.r */
/* loaded from: classes.dex */
public final class C2093r implements InterfaceC2078q {

    /* renamed from: a */
    private final String f8034a;

    /* renamed from: b */
    private final ArrayList f8035b;

    public C2093r(String str, List list) {
        this.f8034a = str;
        ArrayList arrayList = new ArrayList();
        this.f8035b = arrayList;
        arrayList.addAll(list);
    }

    /* renamed from: a */
    public final String m8864a() {
        return this.f8034a;
    }

    /* renamed from: b */
    public final ArrayList m8865b() {
        return this.f8035b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2093r)) {
            return false;
        }
        C2093r c2093r = (C2093r) obj;
        String str = this.f8034a;
        if (str == null ? c2093r.f8034a != null : !str.equals(c2093r.f8034a)) {
            return false;
        }
        return this.f8035b.equals(c2093r.f8035b);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: g */
    public final InterfaceC2078q mo8349g() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: h */
    public final Double mo8350h() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final int hashCode() {
        int i10;
        String str = this.f8034a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return (i10 * 31) + this.f8035b.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: i */
    public final String mo8351i() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: j */
    public final Boolean mo8352j() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: k */
    public final Iterator mo8353k() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: o */
    public final InterfaceC2078q mo8355o(String str, C2158v4 c2158v4, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}
