package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.f */
/* loaded from: classes.dex */
public final class C1912f implements Iterable, InterfaceC2078q, InterfaceC2018m {

    /* renamed from: a */
    final SortedMap f7730a;

    /* renamed from: b */
    final Map f7731b;

    public C1912f() {
        this.f7730a = new TreeMap();
        this.f7731b = new TreeMap();
    }

    /* renamed from: A */
    public final void m8345A(int i10) {
        int intValue = ((Integer) this.f7730a.lastKey()).intValue();
        if (i10 <= intValue && i10 >= 0) {
            this.f7730a.remove(Integer.valueOf(i10));
            if (i10 == intValue) {
                SortedMap sortedMap = this.f7730a;
                int i11 = i10 - 1;
                Integer valueOf = Integer.valueOf(i11);
                if (!sortedMap.containsKey(valueOf) && i11 >= 0) {
                    this.f7730a.put(valueOf, InterfaceC2078q.f8002Q);
                    return;
                }
                return;
            }
            while (true) {
                i10++;
                if (i10 <= ((Integer) this.f7730a.lastKey()).intValue()) {
                    SortedMap sortedMap2 = this.f7730a;
                    Integer valueOf2 = Integer.valueOf(i10);
                    InterfaceC2078q interfaceC2078q = (InterfaceC2078q) sortedMap2.get(valueOf2);
                    if (interfaceC2078q != null) {
                        this.f7730a.put(Integer.valueOf(i10 - 1), interfaceC2078q);
                        this.f7730a.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: B */
    public final void m8346B(int i10, InterfaceC2078q interfaceC2078q) {
        if (i10 <= 32468) {
            if (i10 >= 0) {
                if (interfaceC2078q == null) {
                    this.f7730a.remove(Integer.valueOf(i10));
                    return;
                } else {
                    this.f7730a.put(Integer.valueOf(i10), interfaceC2078q);
                    return;
                }
            }
            throw new IndexOutOfBoundsException("Out of bounds index: " + i10);
        }
        throw new IllegalStateException("Array too large");
    }

    /* renamed from: C */
    public final boolean m8347C(int i10) {
        if (i10 >= 0 && i10 <= ((Integer) this.f7730a.lastKey()).intValue()) {
            return this.f7730a.containsKey(Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2018m
    /* renamed from: c */
    public final boolean mo8348c(String str) {
        if (!"length".equals(str) && !this.f7731b.containsKey(str)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1912f)) {
            return false;
        }
        C1912f c1912f = (C1912f) obj;
        if (m8358t() != c1912f.m8358t()) {
            return false;
        }
        if (this.f7730a.isEmpty()) {
            return c1912f.f7730a.isEmpty();
        }
        for (int intValue = ((Integer) this.f7730a.firstKey()).intValue(); intValue <= ((Integer) this.f7730a.lastKey()).intValue(); intValue++) {
            if (!m8359u(intValue).equals(c1912f.m8359u(intValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: g */
    public final InterfaceC2078q mo8349g() {
        C1912f c1912f = new C1912f();
        for (Map.Entry entry : this.f7730a.entrySet()) {
            if (entry.getValue() instanceof InterfaceC2018m) {
                c1912f.f7730a.put((Integer) entry.getKey(), (InterfaceC2078q) entry.getValue());
            } else {
                c1912f.f7730a.put((Integer) entry.getKey(), ((InterfaceC2078q) entry.getValue()).mo8349g());
            }
        }
        return c1912f;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: h */
    public final Double mo8350h() {
        if (this.f7730a.size() == 1) {
            return m8359u(0).mo8350h();
        }
        if (this.f7730a.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        return this.f7730a.hashCode() * 31;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: i */
    public final String mo8351i() {
        return m8360v(",");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1896e(this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: j */
    public final Boolean mo8352j() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: k */
    public final Iterator mo8353k() {
        return new C1880d(this, this.f7730a.keySet().iterator(), this.f7731b.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2018m
    /* renamed from: n */
    public final void mo8354n(String str, InterfaceC2078q interfaceC2078q) {
        if (interfaceC2078q == null) {
            this.f7731b.remove(str);
        } else {
            this.f7731b.put(str, interfaceC2078q);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: o */
    public final InterfaceC2078q mo8355o(String str, C2158v4 c2158v4, List list) {
        if (!"concat".equals(str) && !"every".equals(str) && !"filter".equals(str) && !"forEach".equals(str) && !"indexOf".equals(str) && !"join".equals(str) && !"lastIndexOf".equals(str) && !"map".equals(str) && !"pop".equals(str) && !"push".equals(str) && !"reduce".equals(str) && !"reduceRight".equals(str) && !"reverse".equals(str) && !"shift".equals(str) && !"slice".equals(str) && !"some".equals(str) && !"sort".equals(str) && !"splice".equals(str) && !"toString".equals(str) && !"unshift".equals(str)) {
            return AbstractC1988k.m8562a(this, new C2138u(str), c2158v4, list);
        }
        return AbstractC1881d0.m8196a(str, this, c2158v4, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2018m
    /* renamed from: p */
    public final InterfaceC2078q mo8356p(String str) {
        InterfaceC2078q interfaceC2078q;
        if ("length".equals(str)) {
            return new C1958i(Double.valueOf(m8358t()));
        }
        if (mo8348c(str) && (interfaceC2078q = (InterfaceC2078q) this.f7731b.get(str)) != null) {
            return interfaceC2078q;
        }
        return InterfaceC2078q.f8002Q;
    }

    /* renamed from: q */
    public final int m8357q() {
        return this.f7730a.size();
    }

    /* renamed from: t */
    public final int m8358t() {
        if (this.f7730a.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f7730a.lastKey()).intValue() + 1;
    }

    public final String toString() {
        return m8360v(",");
    }

    /* renamed from: u */
    public final InterfaceC2078q m8359u(int i10) {
        InterfaceC2078q interfaceC2078q;
        if (i10 < m8358t()) {
            if (m8347C(i10) && (interfaceC2078q = (InterfaceC2078q) this.f7730a.get(Integer.valueOf(i10))) != null) {
                return interfaceC2078q;
            }
            return InterfaceC2078q.f8002Q;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    /* renamed from: v */
    public final String m8360v(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        if (!this.f7730a.isEmpty()) {
            for (int i10 = 0; i10 < m8358t(); i10++) {
                InterfaceC2078q m8359u = m8359u(i10);
                sb2.append(str);
                if (!(m8359u instanceof C2153v) && !(m8359u instanceof C2048o)) {
                    sb2.append(m8359u.mo8351i());
                }
            }
            sb2.delete(0, str.length());
        }
        return sb2.toString();
    }

    /* renamed from: w */
    public final Iterator m8361w() {
        return this.f7730a.keySet().iterator();
    }

    /* renamed from: x */
    public final List m8362x() {
        ArrayList arrayList = new ArrayList(m8358t());
        for (int i10 = 0; i10 < m8358t(); i10++) {
            arrayList.add(m8359u(i10));
        }
        return arrayList;
    }

    /* renamed from: y */
    public final void m8363y() {
        this.f7730a.clear();
    }

    /* renamed from: z */
    public final void m8364z(int i10, InterfaceC2078q interfaceC2078q) {
        if (i10 >= 0) {
            if (i10 >= m8358t()) {
                m8346B(i10, interfaceC2078q);
                return;
            }
            for (int intValue = ((Integer) this.f7730a.lastKey()).intValue(); intValue >= i10; intValue--) {
                SortedMap sortedMap = this.f7730a;
                Integer valueOf = Integer.valueOf(intValue);
                InterfaceC2078q interfaceC2078q2 = (InterfaceC2078q) sortedMap.get(valueOf);
                if (interfaceC2078q2 != null) {
                    m8346B(intValue + 1, interfaceC2078q2);
                    this.f7730a.remove(valueOf);
                }
            }
            m8346B(i10, interfaceC2078q);
            return;
        }
        throw new IllegalArgumentException("Invalid value index: " + i10);
    }

    public C1912f(List list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                m8346B(i10, (InterfaceC2078q) list.get(i10));
            }
        }
    }
}
