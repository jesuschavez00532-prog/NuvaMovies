package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.b */
/* loaded from: classes.dex */
public final class C1848b {

    /* renamed from: a */
    private String f7662a;

    /* renamed from: b */
    private final long f7663b;

    /* renamed from: c */
    private final Map f7664c;

    public C1848b(String str, long j10, Map map) {
        this.f7662a = str;
        this.f7663b = j10;
        HashMap hashMap = new HashMap();
        this.f7664c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    /* renamed from: a */
    public final long m8108a() {
        return this.f7663b;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1848b clone() {
        return new C1848b(this.f7662a, this.f7663b, new HashMap(this.f7664c));
    }

    /* renamed from: c */
    public final Object m8110c(String str) {
        if (this.f7664c.containsKey(str)) {
            return this.f7664c.get(str);
        }
        return null;
    }

    /* renamed from: d */
    public final String m8111d() {
        return this.f7662a;
    }

    /* renamed from: e */
    public final Map m8112e() {
        return this.f7664c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1848b)) {
            return false;
        }
        C1848b c1848b = (C1848b) obj;
        if (this.f7663b != c1848b.f7663b || !this.f7662a.equals(c1848b.f7662a)) {
            return false;
        }
        return this.f7664c.equals(c1848b.f7664c);
    }

    /* renamed from: f */
    public final void m8113f(String str) {
        this.f7662a = str;
    }

    /* renamed from: g */
    public final void m8114g(String str, Object obj) {
        if (obj == null) {
            this.f7664c.remove(str);
        } else {
            this.f7664c.put(str, obj);
        }
    }

    public final int hashCode() {
        int hashCode = this.f7662a.hashCode();
        long j10 = this.f7663b;
        return (((hashCode * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f7664c.hashCode();
    }

    public final String toString() {
        return "Event{name='" + this.f7662a + "', timestamp=" + this.f7663b + ", params=" + this.f7664c.toString() + "}";
    }
}
