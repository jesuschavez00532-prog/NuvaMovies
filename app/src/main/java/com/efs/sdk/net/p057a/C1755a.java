package com.efs.sdk.net.p057a;

import java.util.HashMap;

/* renamed from: com.efs.sdk.net.a.a */
/* loaded from: classes.dex */
public final class C1755a {

    /* renamed from: c */
    private static C1755a f7346c;

    /* renamed from: a */
    private HashMap<String, C1766c> f7347a;

    /* renamed from: b */
    private HashMap<String, C1767d> f7348b;

    private C1755a() {
        m7838b();
    }

    /* renamed from: a */
    public static C1755a m7837a() {
        if (f7346c == null) {
            f7346c = new C1755a();
        }
        return f7346c;
    }

    /* renamed from: b */
    private void m7838b() {
        if (this.f7347a == null) {
            this.f7347a = new HashMap<>();
        }
        this.f7347a.clear();
    }

    /* renamed from: c */
    public final C1767d m7841c(String str) {
        if (this.f7348b == null) {
            this.f7348b = new HashMap<>();
        }
        if (this.f7348b.containsKey(str)) {
            return this.f7348b.get(str);
        }
        C1767d c1767d = new C1767d();
        c1767d.f7406A = str;
        c1767d.f7409D = System.currentTimeMillis();
        this.f7348b.put(str, c1767d);
        return c1767d;
    }

    /* renamed from: d */
    public final void m7842d(String str) {
        HashMap<String, C1767d> hashMap = this.f7348b;
        if (hashMap != null && hashMap.containsKey(str)) {
            this.f7348b.remove(str);
        }
    }

    /* renamed from: a */
    public final C1766c m7839a(String str) {
        if (this.f7347a == null) {
            m7838b();
        }
        C1766c c1766c = this.f7347a.get(str);
        if (c1766c != null) {
            return c1766c;
        }
        C1766c c1766c2 = new C1766c();
        c1766c2.f7370a = str;
        c1766c2.f7371b = System.currentTimeMillis();
        this.f7347a.put(str, c1766c2);
        return c1766c2;
    }

    /* renamed from: b */
    public final void m7840b(String str) {
        HashMap<String, C1766c> hashMap = this.f7347a;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return;
        }
        this.f7347a.remove(str);
    }
}
