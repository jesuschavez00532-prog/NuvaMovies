package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.j */
/* loaded from: classes.dex */
public abstract class AbstractC1973j implements InterfaceC2078q, InterfaceC2018m {

    /* renamed from: a */
    protected final String f7823a;

    /* renamed from: b */
    protected final Map f7824b = new HashMap();

    public AbstractC1973j(String str) {
        this.f7823a = str;
    }

    /* renamed from: a */
    public abstract InterfaceC2078q mo8107a(C2158v4 c2158v4, List list);

    /* renamed from: b */
    public final String m8538b() {
        return this.f7823a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2018m
    /* renamed from: c */
    public final boolean mo8348c(String str) {
        return this.f7824b.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1973j)) {
            return false;
        }
        AbstractC1973j abstractC1973j = (AbstractC1973j) obj;
        String str = this.f7823a;
        if (str == null) {
            return false;
        }
        return str.equals(abstractC1973j.f7823a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: g */
    public InterfaceC2078q mo8349g() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: h */
    public final Double mo8350h() {
        return Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        String str = this.f7823a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: i */
    public final String mo8351i() {
        return this.f7823a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: j */
    public final Boolean mo8352j() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: k */
    public final Iterator mo8353k() {
        return AbstractC1988k.m8563b(this.f7824b);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2018m
    /* renamed from: n */
    public final void mo8354n(String str, InterfaceC2078q interfaceC2078q) {
        if (interfaceC2078q == null) {
            this.f7824b.remove(str);
        } else {
            this.f7824b.put(str, interfaceC2078q);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: o */
    public final InterfaceC2078q mo8355o(String str, C2158v4 c2158v4, List list) {
        if ("toString".equals(str)) {
            return new C2138u(this.f7823a);
        }
        return AbstractC1988k.m8562a(this, new C2138u(str), c2158v4, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2018m
    /* renamed from: p */
    public final InterfaceC2078q mo8356p(String str) {
        if (this.f7824b.containsKey(str)) {
            return (InterfaceC2078q) this.f7824b.get(str);
        }
        return InterfaceC2078q.f8002Q;
    }
}
