package com.umeng.commonsdk.config;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.umeng.commonsdk.config.b */
/* loaded from: classes3.dex */
public class C3435b implements InterfaceC3439f {

    /* renamed from: a */
    private static Map<String, Boolean> f15095a = new HashMap();

    /* renamed from: b */
    private static Object f15096b = new Object();

    /* renamed from: com.umeng.commonsdk.config.b$a */
    /* loaded from: classes3.dex */
    private static class a {

        /* renamed from: a */
        private static final C3435b f15097a = new C3435b();

        private a() {
        }
    }

    /* renamed from: b */
    public static C3435b m14554b() {
        return a.f15097a;
    }

    /* renamed from: a */
    public void m14555a() {
        synchronized (f15096b) {
            f15095a.clear();
        }
    }

    private C3435b() {
    }

    /* renamed from: a */
    public static boolean m14553a(String str) {
        if (!C3437d.m14559a(str)) {
            return false;
        }
        synchronized (f15096b) {
            if (!f15095a.containsKey(str)) {
                return true;
            }
            return f15095a.get(str).booleanValue();
        }
    }

    @Override // com.umeng.commonsdk.config.InterfaceC3439f
    /* renamed from: a */
    public void mo14556a(String str, Boolean bool) {
        if (C3437d.m14559a(str)) {
            synchronized (f15096b) {
                Map<String, Boolean> map = f15095a;
                if (map != null) {
                    map.put(str, bool);
                }
            }
        }
    }
}
