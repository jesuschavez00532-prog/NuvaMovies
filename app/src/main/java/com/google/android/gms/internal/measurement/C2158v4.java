package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.v4 */
/* loaded from: classes.dex */
public final class C2158v4 {

    /* renamed from: a */
    public final C2158v4 f8193a;

    /* renamed from: b */
    final C2198y f8194b;

    /* renamed from: c */
    final Map f8195c = new HashMap();

    /* renamed from: d */
    final Map f8196d = new HashMap();

    public C2158v4(C2158v4 c2158v4, C2198y c2198y) {
        this.f8193a = c2158v4;
        this.f8194b = c2198y;
    }

    /* renamed from: a */
    public final C2158v4 m9026a() {
        return new C2158v4(this, this.f8194b);
    }

    /* renamed from: b */
    public final InterfaceC2078q m9027b(InterfaceC2078q interfaceC2078q) {
        return this.f8194b.m9193a(this, interfaceC2078q);
    }

    /* renamed from: c */
    public final InterfaceC2078q m9028c(C1912f c1912f) {
        InterfaceC2078q interfaceC2078q = InterfaceC2078q.f8002Q;
        Iterator m8361w = c1912f.m8361w();
        while (m8361w.hasNext()) {
            interfaceC2078q = this.f8194b.m9193a(this, c1912f.m8359u(((Integer) m8361w.next()).intValue()));
            if (interfaceC2078q instanceof C1943h) {
                break;
            }
        }
        return interfaceC2078q;
    }

    /* renamed from: d */
    public final InterfaceC2078q m9029d(String str) {
        if (this.f8195c.containsKey(str)) {
            return (InterfaceC2078q) this.f8195c.get(str);
        }
        C2158v4 c2158v4 = this.f8193a;
        if (c2158v4 != null) {
            return c2158v4.m9029d(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }

    /* renamed from: e */
    public final void m9030e(String str, InterfaceC2078q interfaceC2078q) {
        if (this.f8196d.containsKey(str)) {
            return;
        }
        if (interfaceC2078q == null) {
            this.f8195c.remove(str);
        } else {
            this.f8195c.put(str, interfaceC2078q);
        }
    }

    /* renamed from: f */
    public final void m9031f(String str, InterfaceC2078q interfaceC2078q) {
        m9030e(str, interfaceC2078q);
        this.f8196d.put(str, Boolean.TRUE);
    }

    /* renamed from: g */
    public final void m9032g(String str, InterfaceC2078q interfaceC2078q) {
        C2158v4 c2158v4;
        if (!this.f8195c.containsKey(str) && (c2158v4 = this.f8193a) != null && c2158v4.m9033h(str)) {
            this.f8193a.m9032g(str, interfaceC2078q);
        } else {
            if (this.f8196d.containsKey(str)) {
                return;
            }
            if (interfaceC2078q == null) {
                this.f8195c.remove(str);
            } else {
                this.f8195c.put(str, interfaceC2078q);
            }
        }
    }

    /* renamed from: h */
    public final boolean m9033h(String str) {
        if (this.f8195c.containsKey(str)) {
            return true;
        }
        C2158v4 c2158v4 = this.f8193a;
        if (c2158v4 != null) {
            return c2158v4.m9033h(str);
        }
        return false;
    }
}
