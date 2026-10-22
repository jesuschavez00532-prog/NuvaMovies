package com.umeng.ccg;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.umeng.ccg.b */
/* loaded from: classes3.dex */
public class C3418b {

    /* renamed from: a */
    private static volatile boolean f15005a = true;

    /* renamed from: b */
    private static volatile boolean f15006b = true;

    /* renamed from: c */
    private static volatile boolean f15007c = true;

    /* renamed from: d */
    private static volatile boolean f15008d = true;

    /* renamed from: e */
    private static volatile boolean f15009e = true;

    /* renamed from: g */
    private static Map<String, Boolean> f15011g = new HashMap();

    /* renamed from: f */
    private static Object f15010f = new Object();

    /* renamed from: a */
    public static boolean m14462a() {
        boolean z10;
        synchronized (f15010f) {
            z10 = f15005a;
        }
        return z10;
    }

    /* renamed from: b */
    public static boolean m14465b() {
        boolean z10;
        synchronized (f15010f) {
            z10 = f15006b;
        }
        return z10;
    }

    /* renamed from: c */
    public static boolean m14466c() {
        boolean z10;
        synchronized (f15010f) {
            z10 = f15007c;
        }
        return z10;
    }

    /* renamed from: d */
    public static boolean m14467d() {
        boolean z10;
        synchronized (f15010f) {
            z10 = f15008d;
        }
        return z10;
    }

    /* renamed from: a */
    public static void m14461a(boolean z10) {
        synchronized (f15010f) {
            f15008d = z10;
            f15011g.put(C3417a.f14983e, Boolean.valueOf(z10));
        }
    }

    /* renamed from: b */
    public static void m14464b(boolean z10) {
        synchronized (f15010f) {
            f15009e = z10;
            f15011g.put(C3417a.f14987i, Boolean.valueOf(z10));
        }
    }

    /* renamed from: a */
    public static boolean m14463a(String str) {
        boolean booleanValue;
        synchronized (f15010f) {
            booleanValue = f15011g.containsKey(str) ? f15011g.get(str).booleanValue() : true;
        }
        return booleanValue;
    }
}
