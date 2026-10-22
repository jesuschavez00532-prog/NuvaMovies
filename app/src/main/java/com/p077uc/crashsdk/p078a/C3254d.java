package com.p077uc.crashsdk.p078a;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.p077uc.crashsdk.C3250a;
import com.p077uc.crashsdk.C3259b;
import com.p077uc.crashsdk.C3262e;
import com.p077uc.crashsdk.C3264g;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.umeng.commonsdk.framework.UMModuleRegister;

/* renamed from: com.uc.crashsdk.a.d */
/* loaded from: classes3.dex */
public class C3254d {

    /* renamed from: a */
    static final /* synthetic */ boolean f13652a = true;

    /* renamed from: b */
    private static boolean f13653b = true;

    /* renamed from: d */
    private static boolean f13655d = false;

    /* renamed from: e */
    private static String f13656e = "hsdk";

    /* renamed from: f */
    private static String f13657f = "alid ";

    /* renamed from: g */
    private static String f13658g;

    /* renamed from: i */
    private static String f13660i;

    /* renamed from: c */
    private static final Object f13654c = new Object();

    /* renamed from: h */
    private static final Object f13659h = new Object();

    /* renamed from: a */
    public static void m13192a() {
        C3256f.m13207a(0, new RunnableC3255e(500), C3259b.m13303H() ? 900000L : 90000L);
    }

    /* renamed from: b */
    public static String m13195b() {
        try {
            return "inv" + f13657f + "cras" + f13656e;
        } catch (Throwable th) {
            C3257g.m13229b(th);
            return "";
        }
    }

    /* renamed from: c */
    public static void m13196c() {
        synchronized (f13659h) {
            f13660i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static byte[] m13197d() {
        return new byte[]{6, 0, 23, 8};
    }

    /* renamed from: e */
    public static boolean m13198e() {
        if (!C3262e.m13386F() && !C3259b.m13307L()) {
            m13194a(true);
            return f13653b;
        }
        return true;
    }

    /* renamed from: f */
    private static String m13199f() {
        String str = f13660i;
        if (C3257g.m13225a(str)) {
            synchronized (f13659h) {
                String str2 = "https://errlog.umeng.com";
                if (C3264g.m13573S()) {
                    str2 = "https://errlogos.umeng.com";
                }
                str = C3257g.m13213a(C3259b.m13352j(), str2 + "/api/crashsdk/validate", true);
                f13660i = str;
            }
        }
        return str;
    }

    /* renamed from: g */
    private static String m13200g() {
        String str;
        byte[] bArr;
        String m13199f;
        byte[] m13184a;
        byte[] bArr2;
        StringBuilder sb2 = new StringBuilder();
        m13191a(sb2, DispatchConstants.PLATFORM, C3264g.m13600e());
        m13191a(sb2, "pkgname", C3250a.f13621a);
        m13191a(sb2, UMModuleRegister.PROCESS, C3262e.m13481h());
        m13191a(sb2, "version", C3250a.m13135a());
        m13191a(sb2, "cver", "3.3.2.2");
        m13191a(sb2, "ctag", "umeng");
        if (C3264g.m13573S()) {
            str = "true";
        } else {
            str = "false";
        }
        m13191a(sb2, "inter", str);
        m13191a(sb2, "os", DispatchConstants.ANDROID);
        String sb3 = sb2.toString();
        byte[] bArr3 = new byte[16];
        C3253c.m13179a(bArr3, 0, C3258h.m13282j());
        C3253c.m13179a(bArr3, 4, C3253c.m13182a());
        C3253c.m13179a(bArr3, 8, m13197d());
        C3253c.m13179a(bArr3, 12, C3250a.m13156f());
        try {
            bArr = C3253c.m13187a(sb3.getBytes(), bArr3, true);
        } catch (Throwable th) {
            C3257g.m13220a(th);
            bArr = null;
        }
        if (bArr == null || (m13199f = m13199f()) == null || (m13184a = C3253c.m13184a(m13199f, bArr)) == null) {
            return null;
        }
        try {
            bArr2 = C3253c.m13187a(m13184a, bArr3, false);
        } catch (Throwable th2) {
            C3257g.m13220a(th2);
            bArr2 = null;
        }
        if (bArr2 == null) {
            return null;
        }
        return new String(bArr2);
    }

    /* renamed from: a */
    public static void m13193a(int i10) {
        if (i10 != 500) {
            if (!f13652a) {
                throw new AssertionError();
            }
            return;
        }
        synchronized (f13654c) {
            f13658g = null;
            m13194a(!C3259b.m13301F());
            if (C3257g.m13230b(f13658g)) {
                C3258h.m13255a(f13658g);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m13194a(boolean r12) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p077uc.crashsdk.p078a.C3254d.m13194a(boolean):boolean");
    }

    /* renamed from: a */
    private static StringBuilder m13191a(StringBuilder sb2, String str, String str2) {
        if (sb2.length() > 0) {
            sb2.append("`");
        }
        sb2.append(str);
        sb2.append(Operator.Operation.EQUALS);
        sb2.append(str2);
        return sb2;
    }
}
