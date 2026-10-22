package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.n */
/* loaded from: classes.dex */
public class C2033n implements InterfaceC2078q, InterfaceC2018m {

    /* renamed from: a */
    final Map f7888a = new HashMap();

    /* renamed from: a */
    public final List m8712a() {
        return new ArrayList(this.f7888a.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2018m
    /* renamed from: c */
    public final boolean mo8348c(String str) {
        return this.f7888a.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2033n)) {
            return false;
        }
        return this.f7888a.equals(((C2033n) obj).f7888a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: g */
    public final InterfaceC2078q mo8349g() {
        C2033n c2033n = new C2033n();
        for (Map.Entry entry : this.f7888a.entrySet()) {
            if (entry.getValue() instanceof InterfaceC2018m) {
                c2033n.f7888a.put((String) entry.getKey(), (InterfaceC2078q) entry.getValue());
            } else {
                c2033n.f7888a.put((String) entry.getKey(), ((InterfaceC2078q) entry.getValue()).mo8349g());
            }
        }
        return c2033n;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: h */
    public final Double mo8350h() {
        return Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        return this.f7888a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: i */
    public final String mo8351i() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: j */
    public final Boolean mo8352j() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: k */
    public final Iterator mo8353k() {
        return AbstractC1988k.m8563b(this.f7888a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2018m
    /* renamed from: n */
    public final void mo8354n(String str, InterfaceC2078q interfaceC2078q) {
        if (interfaceC2078q == null) {
            this.f7888a.remove(str);
        } else {
            this.f7888a.put(str, interfaceC2078q);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: o */
    public InterfaceC2078q mo8355o(String str, C2158v4 c2158v4, List list) {
        if ("toString".equals(str)) {
            return new C2138u(toString());
        }
        return AbstractC1988k.m8562a(this, new C2138u(str), c2158v4, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2018m
    /* renamed from: p */
    public final InterfaceC2078q mo8356p(String str) {
        if (this.f7888a.containsKey(str)) {
            return (InterfaceC2078q) this.f7888a.get(str);
        }
        return InterfaceC2078q.f8002Q;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        if (!this.f7888a.isEmpty()) {
            for (String str : this.f7888a.keySet()) {
                sb2.append(String.format("%s: %s,", str, this.f7888a.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }
}
