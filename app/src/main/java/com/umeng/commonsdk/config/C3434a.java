package com.umeng.commonsdk.config;

/* renamed from: com.umeng.commonsdk.config.a */
/* loaded from: classes3.dex */
public class C3434a {
    /* renamed from: a */
    public static boolean m14547a(int i10, int i11) {
        return i11 >= 0 && i11 <= 31 && (i10 & (1 << i11)) != 0;
    }

    /* renamed from: b */
    public static int m14549b(int i10, int i11) {
        return i10 | (1 << i11);
    }

    /* renamed from: c */
    public static int m14551c(int i10, int i11) {
        return i10 & ((1 << i11) ^ (-1));
    }

    /* renamed from: a */
    public static boolean m14548a(long j10, int i10) {
        return i10 >= 0 && i10 <= 63 && (j10 & (1 << i10)) != 0;
    }

    /* renamed from: b */
    public static long m14550b(long j10, int i10) {
        return (i10 < 0 || i10 > 63) ? j10 : j10 | (1 << i10);
    }

    /* renamed from: c */
    public static long m14552c(long j10, int i10) {
        return (i10 < 0 || i10 > 63) ? j10 : j10 & ((1 << i10) ^ (-1));
    }
}
