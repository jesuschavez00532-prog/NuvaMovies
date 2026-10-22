package com.alibaba.sdk.android.httpdns.p045b;

import android.content.Context;
import com.alibaba.sdk.android.httpdns.p046c.C1535a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.alibaba.sdk.android.httpdns.b.b */
/* loaded from: classes.dex */
public class C1528b {

    /* renamed from: a */
    private static InterfaceC1532f f5878a = null;

    /* renamed from: a */
    private static C1535a f5879a = null;

    /* renamed from: a */
    private static boolean f5880a = false;

    /* renamed from: n */
    private static boolean f5881n = true;

    /* renamed from: a */
    public static List<C1531e> m7073a() {
        ArrayList arrayList = new ArrayList();
        if (!f5880a) {
            return arrayList;
        }
        arrayList.addAll(f5878a.mo7070a());
        return arrayList;
    }

    /* renamed from: b */
    public static void m7079b(Context context) {
        if (context != null) {
            f5879a.m7106c(context);
        }
    }

    /* renamed from: g */
    public static boolean m7081g() {
        return f5881n;
    }

    /* renamed from: i */
    public static String m7082i() {
        return f5879a.m7108i();
    }

    /* renamed from: a */
    public static void m7074a(Context context) {
        m7075a(context, (C1535a) null);
    }

    /* renamed from: b */
    public static void m7080b(C1531e c1531e) {
        if (c1531e == null) {
            return;
        }
        f5878a.mo7072b(c1531e);
    }

    /* renamed from: a */
    public static void m7075a(Context context, C1535a c1535a) {
        f5878a = new C1527a(context);
        f5879a = c1535a;
        if (c1535a == null) {
            f5879a = C1535a.m7104a();
        }
    }

    /* renamed from: a */
    public static void m7076a(C1531e c1531e) {
        if (c1531e == null) {
            return;
        }
        f5878a.mo7071a(c1531e);
    }

    /* renamed from: a */
    public static void m7077a(boolean z10, boolean z11) {
        f5880a = z10;
        f5881n = z11;
    }

    /* renamed from: a */
    public static boolean m7078a() {
        return f5880a;
    }
}
