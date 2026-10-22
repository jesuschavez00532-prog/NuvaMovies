package com.p077uc.crashsdk;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.util.Log;
import com.p077uc.crashsdk.p078a.C3251a;
import com.p077uc.crashsdk.p078a.C3256f;
import com.p077uc.crashsdk.p078a.C3257g;
import com.p077uc.crashsdk.p078a.C3258h;
import com.p077uc.crashsdk.p078a.RunnableC3255e;
import com.umeng.analytics.pro.C3384f;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import org.android.agoo.common.AgooConstants;

/* renamed from: com.uc.crashsdk.b */
/* loaded from: classes3.dex */
public class C3259b {

    /* renamed from: A */
    private static boolean f13701A = false;

    /* renamed from: B */
    private static boolean f13702B = false;

    /* renamed from: C */
    private static boolean f13703C = false;

    /* renamed from: D */
    private static boolean f13704D = false;

    /* renamed from: E */
    private static boolean f13705E = false;

    /* renamed from: F */
    private static boolean f13706F = false;

    /* renamed from: H */
    private static String f13708H = null;

    /* renamed from: I */
    private static int f13709I = 0;

    /* renamed from: J */
    private static boolean f13710J = false;

    /* renamed from: K */
    private static boolean f13711K = false;

    /* renamed from: L */
    private static boolean f13712L = true;

    /* renamed from: M */
    private static RandomAccessFile f13713M = null;

    /* renamed from: N */
    private static boolean f13714N = false;

    /* renamed from: P */
    private static String f13716P = null;

    /* renamed from: Q */
    private static boolean f13717Q = false;

    /* renamed from: R */
    private static volatile Object[] f13718R = null;

    /* renamed from: a */
    public static boolean f13727a = false;

    /* renamed from: b */
    public static boolean f13739b = false;

    /* renamed from: c */
    public static boolean f13740c = false;

    /* renamed from: d */
    public static boolean f13741d = false;

    /* renamed from: f */
    public static boolean f13743f = false;

    /* renamed from: g */
    public static boolean f13744g = true;

    /* renamed from: h */
    public static boolean f13745h = false;

    /* renamed from: i */
    static final /* synthetic */ boolean f13746i = true;

    /* renamed from: j */
    private static String f13747j;

    /* renamed from: k */
    private static String f13748k;

    /* renamed from: l */
    private static String f13749l;

    /* renamed from: m */
    private static String f13750m;

    /* renamed from: n */
    private static String f13751n;

    /* renamed from: o */
    private static String f13752o;

    /* renamed from: p */
    private static String f13753p;

    /* renamed from: q */
    private static String f13754q;

    /* renamed from: r */
    private static String f13755r;

    /* renamed from: s */
    private static String f13756s;

    /* renamed from: t */
    private static String f13757t;

    /* renamed from: u */
    private static String f13758u;

    /* renamed from: v */
    private static String f13759v;

    /* renamed from: w */
    private static String f13760w;

    /* renamed from: x */
    private static boolean f13761x;

    /* renamed from: y */
    private static boolean f13762y;

    /* renamed from: z */
    private static volatile boolean f13763z;

    /* renamed from: e */
    public static final Object f13742e = new Object();

    /* renamed from: G */
    private static final Object f13707G = new Object();

    /* renamed from: O */
    private static final Object f13715O = new Object();

    /* renamed from: S */
    private static Runnable f13719S = new RunnableC3255e(101);

    /* renamed from: T */
    private static boolean f13720T = false;

    /* renamed from: U */
    private static long f13721U = 0;

    /* renamed from: V */
    private static final Object f13722V = new Object();

    /* renamed from: W */
    private static long f13723W = 0;

    /* renamed from: X */
    private static boolean f13724X = false;

    /* renamed from: Y */
    private static boolean f13725Y = false;

    /* renamed from: Z */
    private static boolean f13726Z = false;

    /* renamed from: aa */
    private static long f13728aa = 0;

    /* renamed from: ab */
    private static final WeakHashMap<Activity, Integer> f13729ab = new WeakHashMap<>();

    /* renamed from: ac */
    private static boolean f13730ac = false;

    /* renamed from: ad */
    private static String f13731ad = null;

    /* renamed from: ae */
    private static boolean f13732ae = false;

    /* renamed from: af */
    private static boolean f13733af = false;

    /* renamed from: ag */
    private static boolean f13734ag = false;

    /* renamed from: ah */
    private static boolean f13735ah = false;

    /* renamed from: ai */
    private static boolean f13736ai = false;

    /* renamed from: aj */
    private static final Object f13737aj = new Object();

    /* renamed from: ak */
    private static PendingIntent f13738ak = null;

    /* renamed from: A */
    public static boolean m13296A() {
        if (!f13725Y && m13333ad()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static boolean m13297B() {
        if (f13725Y && !f13761x) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static void m13298C() {
        C3256f.m13206a(2, new RunnableC3255e(100));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static void m13299D() {
        String str;
        if (f13741d && (str = f13731ad) != null) {
            JNIBridge.set(129, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static String m13300E() {
        String str = f13731ad;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: F */
    public static boolean m13301F() {
        boolean z10;
        if (!f13732ae) {
            if (!C3257g.m13225a(C3250a.f13621a) && C3250a.f13621a.equals(C3262e.m13481h())) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                f13733af = true;
                if (f13741d) {
                    JNIBridge.set(2, true);
                }
            }
            f13732ae = true;
        }
        return f13733af;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public static void m13302G() {
        f13734ag = true;
        if (f13741d) {
            JNIBridge.set(34, true);
        }
    }

    /* renamed from: H */
    public static boolean m13303H() {
        return f13734ag;
    }

    /* renamed from: I */
    public static int m13304I() {
        boolean m13316U = m13316U();
        if (m13362t()) {
            if (m13316U) {
                return 3;
            }
            return 6;
        }
        if (m13361s()) {
            if (m13316U) {
                return 2;
            }
            return 5;
        }
        if (m13316U) {
            return 4;
        }
        return 1;
    }

    /* renamed from: J */
    public static int m13305J() {
        boolean m13317V = m13317V();
        boolean m13318W = m13318W();
        boolean m13319X = m13319X();
        if (m13362t()) {
            if (m13317V) {
                return 12;
            }
            if (m13318W) {
                return 14;
            }
            if (m13319X) {
                return 16;
            }
            return 98;
        }
        if (m13361s()) {
            if (m13317V) {
                return 11;
            }
            if (m13318W) {
                return 13;
            }
            if (m13319X) {
                return 15;
            }
            return 97;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public static void m13306K() {
        if (f13741d) {
            JNIBridge.nativeSet(27, f13709I, AgooConstants.ACK_PACK_NULL, null);
            JNIBridge.set(30, f13712L);
        }
    }

    /* renamed from: L */
    public static boolean m13307L() {
        if (!f13736ai) {
            synchronized (f13737aj) {
                if (!f13736ai) {
                    f13735ah = m13334ae();
                    f13736ai = true;
                }
            }
        }
        return f13735ah;
    }

    /* renamed from: M */
    public static void m13308M() {
        if (C3262e.m13386F() || m13307L() || f13738ak != null || C3264g.m13603h() < 0) {
            return;
        }
        try {
            Context m13211a = C3257g.m13211a();
            Intent launchIntentForPackage = m13211a.getPackageManager().getLaunchIntentForPackage(m13211a.getPackageName());
            launchIntentForPackage.addFlags(335544320);
            f13738ak = PendingIntent.getActivity(m13211a, 0, launchIntentForPackage, 0);
        } catch (Throwable th) {
            C3257g.m13220a(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public static boolean m13309N() {
        if (f13738ak == null) {
            C3251a.m13170b("Restart intent is null!");
            return false;
        }
        try {
            C3251a.m13168a("crashsdk", "restarting ...");
            ((AlarmManager) C3257g.m13211a().getSystemService("alarm")).set(1, System.currentTimeMillis() + 200, f13738ak);
            return true;
        } catch (Throwable th) {
            C3257g.m13220a(th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public static /* synthetic */ boolean m13310O() {
        f13730ac = true;
        return true;
    }

    /* renamed from: Q */
    private static String m13312Q() {
        if (f13747j == null) {
            f13747j = m13343d("ss");
        }
        return f13747j;
    }

    /* renamed from: R */
    private static String m13313R() {
        if (f13749l == null) {
            f13749l = m13343d("ctn");
        }
        return f13749l;
    }

    /* renamed from: S */
    private static String m13314S() {
        if (f13750m == null) {
            f13750m = m13343d("cta");
        }
        return f13750m;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:13|(9:17|18|(1:24)|25|26|(1:28)|30|31|32)|35|18|(2:20|24)|25|26|(0)|30|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        com.p077uc.crashsdk.p078a.C3257g.m13220a(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071 A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #0 {all -> 0x0075, blocks: (B:26:0x006b, B:28:0x0071), top: B:25:0x006b, outer: #1 }] */
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m13315T() {
        /*
            boolean r0 = com.p077uc.crashsdk.C3259b.f13763z
            if (r0 != 0) goto L80
            boolean r0 = com.p077uc.crashsdk.C3259b.f13762y
            if (r0 == 0) goto La
            goto L80
        La:
            java.lang.Object r0 = com.p077uc.crashsdk.C3259b.f13707G
            monitor-enter(r0)
            boolean r1 = com.p077uc.crashsdk.C3259b.f13763z     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7d
            return
        L13:
            java.lang.String r1 = com.p077uc.crashsdk.C3264g.m13578X()     // Catch: java.lang.Throwable -> L7d
            m13347f(r1)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = m13358p()     // Catch: java.lang.Throwable -> L7d
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L7d
            java.lang.String r3 = m13335b()     // Catch: java.lang.Throwable -> L7d
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L7d
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L7d
            java.lang.String r4 = m13313R()     // Catch: java.lang.Throwable -> L7d
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r4 = "f"
            boolean r4 = r4.equals(r1)     // Catch: java.lang.Throwable -> L7d
            com.p077uc.crashsdk.C3259b.f13701A = r4     // Catch: java.lang.Throwable -> L7d
            java.lang.String r4 = "b"
            boolean r1 = r4.equals(r1)     // Catch: java.lang.Throwable -> L7d
            com.p077uc.crashsdk.C3259b.f13702B = r1     // Catch: java.lang.Throwable -> L7d
            boolean r1 = r2.exists()     // Catch: java.lang.Throwable -> L7d
            com.p077uc.crashsdk.C3259b.f13704D = r1     // Catch: java.lang.Throwable -> L7d
            boolean r1 = r3.exists()     // Catch: java.lang.Throwable -> L7d
            com.p077uc.crashsdk.C3259b.f13705E = r1     // Catch: java.lang.Throwable -> L7d
            boolean r2 = com.p077uc.crashsdk.C3259b.f13704D     // Catch: java.lang.Throwable -> L7d
            r3 = 1
            if (r2 != 0) goto L56
            if (r1 == 0) goto L54
            goto L56
        L54:
            r1 = 0
            goto L57
        L56:
            r1 = 1
        L57:
            com.p077uc.crashsdk.C3259b.f13703C = r1     // Catch: java.lang.Throwable -> L7d
            if (r1 != 0) goto L6b
            boolean r1 = com.p077uc.crashsdk.C3259b.f13701A     // Catch: java.lang.Throwable -> L7d
            if (r1 != 0) goto L63
            boolean r1 = com.p077uc.crashsdk.C3259b.f13702B     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L6b
        L63:
            boolean r1 = m13360r()     // Catch: java.lang.Throwable -> L7d
            com.p077uc.crashsdk.C3259b.f13706F = r1     // Catch: java.lang.Throwable -> L7d
            com.p077uc.crashsdk.C3259b.f13703C = r1     // Catch: java.lang.Throwable -> L7d
        L6b:
            boolean r1 = m13368z()     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L79
            m13321Z()     // Catch: java.lang.Throwable -> L75
            goto L79
        L75:
            r1 = move-exception
            com.p077uc.crashsdk.p078a.C3257g.m13220a(r1)     // Catch: java.lang.Throwable -> L7d
        L79:
            com.p077uc.crashsdk.C3259b.f13763z = r3     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7d
            return
        L7d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7d
            throw r1
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p077uc.crashsdk.C3259b.m13315T():void");
    }

    /* renamed from: U */
    private static boolean m13316U() {
        m13315T();
        return f13703C;
    }

    /* renamed from: V */
    private static boolean m13317V() {
        m13315T();
        return f13704D;
    }

    /* renamed from: W */
    private static boolean m13318W() {
        m13315T();
        return f13705E;
    }

    /* renamed from: X */
    private static boolean m13319X() {
        m13315T();
        return f13706F;
    }

    /* renamed from: Y */
    private static void m13320Y() {
        if (f13741d) {
            JNIBridge.set(26, f13761x);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0041 -> B:13:0x0044). Please report as a decompilation issue!!! */
    /* renamed from: Z */
    private static void m13321Z() {
        if (!f13720T) {
            f13720T = true;
            try {
                new File(m13335b()).delete();
            } catch (Throwable th) {
                C3257g.m13220a(th);
            }
            try {
                new File(m13313R()).delete();
            } catch (Throwable th2) {
                C3257g.m13220a(th2);
            }
            try {
                if (f13741d) {
                    JNIBridge.cmd(16);
                } else {
                    new File(m13314S()).delete();
                }
            } catch (Throwable th3) {
                C3257g.m13220a(th3);
            }
        }
        Object[] m13331ab = m13331ab();
        if (!m13331ab[0].equals(f13716P) && f13718R == null) {
            m13327a(m13331ab);
        } else {
            f13717Q = true;
            m13330aa();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m13323a() {
        String str = f13708H;
        if (str != null) {
            return str;
        }
        String m13481h = C3262e.m13481h();
        if (C3257g.m13225a(m13481h)) {
            f13708H = "LLUN";
        } else {
            int i10 = 0;
            if (m13481h.length() > 48) {
                int length = m13481h.length() - 48;
                m13481h = m13481h.substring(0, 48);
                i10 = length;
            }
            StringBuilder sb2 = new StringBuilder();
            byte[] bytes = m13481h.getBytes();
            for (int length2 = bytes.length - 1; length2 >= 0; length2--) {
                byte b10 = bytes[length2];
                if (b10 == 46) {
                    sb2.append('0');
                } else if (b10 == 58) {
                    sb2.append('1');
                } else if (b10 >= 97 && b10 <= 122) {
                    sb2.append((char) ((b10 + 65) - 97));
                } else if (b10 >= 65 && b10 <= 90) {
                    sb2.append((char) b10);
                } else if (b10 >= 48 && b10 <= 57) {
                    sb2.append((char) b10);
                } else {
                    sb2.append('2');
                }
            }
            if (i10 > 0) {
                sb2.append(String.valueOf(i10));
            }
            f13708H = sb2.toString();
        }
        return f13708H;
    }

    /* renamed from: aa */
    private static void m13330aa() {
        if (!C3256f.m13209b(f13719S)) {
            C3256f.m13206a(1, f13719S);
            return;
        }
        Object[] objArr = f13718R;
        if (objArr == null || !m13331ab()[0].equals(objArr[0])) {
            C3256f.m13205a(f13719S);
            C3256f.m13206a(1, f13719S);
        }
    }

    /* renamed from: ab */
    private static Object[] m13331ab() {
        synchronized (f13722V) {
            long j10 = f13723W + 1;
            f13723W = j10;
            if (f13761x) {
                return new Object[]{"e", Long.valueOf(j10)};
            }
            if (m13297B()) {
                return new Object[]{"f", Long.valueOf(f13723W)};
            }
            return new Object[]{"b", Long.valueOf(f13723W)};
        }
    }

    /* renamed from: ac */
    private static Object m13332ac() {
        Object m13322a;
        Object m13322a2 = m13322a((Application) C3257g.m13211a(), (Class<?>) Application.class, "mLoadedApk");
        if (m13322a2 != null && (m13322a = m13322a(m13322a2, (Class<?>) null, "mActivityThread")) != null) {
            return m13322a;
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentActivityThread", new Class[0]);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                return declaredMethod.invoke(null, new Object[0]);
            }
        } catch (Throwable th) {
            C3257g.m13220a(th);
        }
        return null;
    }

    /* renamed from: ad */
    private static boolean m13333ad() {
        String m13212a = C3257g.m13212a(new File("/proc/self/cgroup"), 512, false);
        if (C3257g.m13225a(m13212a)) {
            return false;
        }
        if (!m13212a.contains("/bg_non_interactive") && !m13212a.contains("/background")) {
            return false;
        }
        return true;
    }

    /* renamed from: ae */
    private static boolean m13334ae() {
        try {
            Method declaredMethod = Process.class.getDeclaredMethod("isIsolated", new Class[0]);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                if (invoke != null && (invoke instanceof Boolean)) {
                    return ((Boolean) invoke).booleanValue();
                }
            }
        } catch (Throwable th) {
            C3257g.m13220a(th);
        }
        int myUid = Process.myUid() % 100000;
        if (myUid >= 99000 && myUid <= 99999) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m13335b() {
        if (f13748k == null) {
            f13748k = m13343d("ctj");
        }
        return f13748k;
    }

    /* renamed from: d */
    private static String m13343d(String str) {
        return C3264g.m13578X() + m13323a() + "." + str;
    }

    /* renamed from: e */
    private static File[] m13346e(String str) {
        if (!f13746i && str.length() <= 0) {
            throw new AssertionError();
        }
        File[] listFiles = new File(C3264g.m13578X()).listFiles();
        if (listFiles == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : listFiles) {
            if (file.getPath().endsWith(str)) {
                arrayList.add(file);
            }
        }
        return (File[]) arrayList.toArray(new File[arrayList.size()]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static File[] m13348f() {
        return m13346e(".stcb");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static String m13349g() {
        if (f13759v == null) {
            f13759v = m13343d("bati");
        }
        return f13759v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static String m13350h() {
        if (f13760w == null) {
            f13760w = m13343d("hdr");
        }
        return f13760w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static String m13351i() {
        if (f13754q == null) {
            f13754q = C3264g.m13578X() + C3384f.f14557R;
        }
        return f13754q;
    }

    /* renamed from: j */
    public static String m13352j() {
        if (f13755r == null) {
            f13755r = C3264g.m13578X() + "authu";
        }
        return f13755r;
    }

    /* renamed from: k */
    public static String m13353k() {
        if (f13756s == null) {
            f13756s = C3264g.m13578X() + "statu";
        }
        return f13756s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static String m13354l() {
        if (f13757t == null) {
            f13757t = C3264g.m13578X() + "poli";
        }
        return f13757t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static String m13355m() {
        if (f13758u == null) {
            f13758u = C3264g.m13578X() + "ver";
        }
        return f13758u;
    }

    /* renamed from: n */
    public static String m13356n() {
        return C3264g.m13578X() + "bvu";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static String m13357o() {
        return C3264g.m13578X() + "fds";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static String m13358p() {
        return C3257g.m13212a(new File(m13312Q()), 8, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static boolean m13359q() {
        return f13762y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static boolean m13360r() {
        boolean z10;
        if (!f13710J) {
            if (f13741d) {
                if (JNIBridge.cmd(15) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f13711K = z10;
            } else {
                f13711K = new File(m13314S()).exists();
            }
            f13710J = true;
        }
        return f13711K;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static boolean m13361s() {
        m13315T();
        return f13701A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static boolean m13362t() {
        m13315T();
        return f13702B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static boolean m13363u() {
        return f13761x;
    }

    /* renamed from: v */
    public static void m13364v() {
        boolean z10;
        m13347f(C3264g.m13578X());
        f13762y = true;
        f13701A = false;
        f13702B = false;
        f13703C = false;
        f13704D = false;
        f13705E = false;
        f13706F = false;
        String[] strArr = {".st", ".wa", ".callback", ".ctn", ".ctj", ".cta", ".signal"};
        String[] strArr2 = {C3384f.f14557R, "authu", "statu", "poli"};
        File[] listFiles = new File(C3264g.m13578X()).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                String name = file.getName();
                int i10 = 0;
                while (true) {
                    if (i10 < 7) {
                        if (name.endsWith(strArr[i10])) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (!z10) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= 4) {
                            break;
                        }
                        if (name.equals(strArr2[i11])) {
                            z10 = true;
                            break;
                        }
                        i11++;
                    }
                }
                if (z10) {
                    C3251a.m13168a("crashsdk", "delete file: " + file.getPath());
                    C3257g.m13222a(file);
                }
            }
        }
        m13321Z();
    }

    /* renamed from: w */
    public static void m13365w() {
        if (f13761x) {
            return;
        }
        f13761x = true;
        if (m13307L() || C3262e.m13506u()) {
            return;
        }
        m13347f(C3264g.m13578X());
        m13320Y();
        m13321Z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static boolean m13366x() {
        return m13347f(C3264g.m13578X());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static boolean m13367y() {
        return m13347f(C3264g.m13579Y());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static boolean m13368z() {
        if (!f13724X && m13333ad()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m13340c() {
        if (f13751n == null) {
            f13751n = m13343d("st");
        }
        return f13751n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static File[] m13344d() {
        return m13346e(".st");
    }

    /* renamed from: f */
    private static boolean m13347f(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (file.isDirectory()) {
            return true;
        }
        C3251a.m13169a("crashsdk", "Crash log directory was placed by a file!", null);
        if (!file.delete()) {
            return false;
        }
        file.mkdirs();
        return true;
    }

    /* renamed from: b */
    public static String m13336b(String str) {
        return "debug.crs." + str;
    }

    /* renamed from: b */
    public static void m13339b(boolean z10) {
        if (C3262e.m13506u()) {
            return;
        }
        if (z10 && f13761x) {
            if (C3264g.m13570P()) {
                Log.v("crashsdk", "setForeground, reset sExited to false!!!");
            }
            f13761x = false;
            m13320Y();
        }
        boolean z11 = C3262e.m13386F() || m13307L();
        long currentTimeMillis = System.currentTimeMillis();
        if (f13724X && !f13725Y && z10) {
            long j10 = f13728aa;
            if (j10 != 0 && !z11 && currentTimeMillis - j10 > 1800000) {
                C3256f.m13207a(1, new RunnableC3255e(104), 1000L);
            }
        }
        f13728aa = currentTimeMillis;
        f13725Y = z10;
        if (z10) {
            f13724X = true;
        }
        if (f13741d) {
            JNIBridge.nativeSetForeground(z10);
        }
        if (f13761x || z11) {
            return;
        }
        m13315T();
        m13321Z();
        if (z10) {
            C3250a.m13146a(false);
            if (!f13726Z) {
                C3262e.m13382B();
                f13726Z = true;
            }
        }
        if (!f13714N) {
            m13330aa();
        }
        C3262e.m13457c(z10);
    }

    /* renamed from: c */
    public static boolean m13342c(int i10) {
        return (i10 & f13709I) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static String m13345e() {
        if (f13752o == null) {
            f13752o = m13343d("stcb");
        }
        return f13752o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m13324a(String str) {
        if (str == null || str.length() <= 0 || !str.endsWith(".st")) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(".st");
        if (!f13746i && lastIndexOf < 0) {
            throw new AssertionError();
        }
        String substring = str.substring(0, lastIndexOf);
        if (substring.length() <= 0) {
            return null;
        }
        return substring + ".stcb";
    }

    /* renamed from: a */
    public static void m13326a(boolean z10) {
        f13712L = z10;
        if (f13741d) {
            JNIBridge.set(30, z10);
        }
    }

    /* renamed from: b */
    public static void m13337b(int i10) {
        f13709I = i10;
        m13306K();
    }

    /* renamed from: a */
    private static void m13327a(Object[] objArr) {
        f13718R = objArr;
        synchronized (f13715O) {
            String str = (String) objArr[0];
            long longValue = ((Long) objArr[1]).longValue();
            if (longValue < f13721U) {
                C3251a.m13172c("crashsdk", String.format(Locale.US, "Update state generation %d, last is: %d", Long.valueOf(longValue), Long.valueOf(f13721U)));
                return;
            }
            f13721U = longValue;
            String m13312Q = m13312Q();
            if (f13741d) {
                RandomAccessFile randomAccessFile = f13713M;
                if (randomAccessFile != null) {
                    C3257g.m13218a(randomAccessFile);
                    f13713M = null;
                }
                boolean nativeChangeState = JNIBridge.nativeChangeState(m13312Q, str, f13714N);
                f13714N = false;
                if (!nativeChangeState) {
                    C3251a.m13170b("write state failed: " + str);
                }
            } else {
                RandomAccessFile randomAccessFile2 = f13713M;
                if (randomAccessFile2 == null || f13714N) {
                    if (randomAccessFile2 != null) {
                        C3257g.m13218a(randomAccessFile2);
                        f13713M = null;
                    }
                    try {
                        RandomAccessFile randomAccessFile3 = new RandomAccessFile(m13312Q, "rw");
                        f13713M = randomAccessFile3;
                        randomAccessFile3.seek(0L);
                        f13714N = false;
                    } catch (Exception e10) {
                        C3257g.m13220a(e10);
                    }
                }
                try {
                    f13713M.write(str.getBytes());
                    f13713M.seek(0L);
                } catch (Exception e11) {
                    C3257g.m13220a(e11);
                }
            }
            f13716P = str;
            f13718R = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m13338b(Context context) {
        long j10;
        boolean z10;
        C3251a.m13167a("Restart APP");
        if (context == null) {
            return;
        }
        if (f13753p == null) {
            f13753p = m13343d("rt");
        }
        File file = new File(f13753p);
        try {
            j10 = Long.parseLong(C3257g.m13235d(file));
        } catch (Throwable th) {
            C3257g.m13220a(th);
            j10 = -1;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (C3264g.m13603h() < 0 || (j10 > 0 && currentTimeMillis - j10 <= C3264g.m13603h())) {
            z10 = false;
        } else {
            m13347f(C3264g.m13578X());
            C3257g.m13223a(file, String.valueOf(currentTimeMillis));
            z10 = true;
        }
        C3251a.m13167a("lastTime: " + j10 + ", currentTime: " + currentTimeMillis + ", needRestart: " + z10);
        if (z10) {
            try {
                C3261d.m13376a(true);
            } catch (Throwable th2) {
                C3257g.m13220a(th2);
            }
            m13309N();
        }
    }

    /* renamed from: a */
    public static boolean m13328a(Context context) {
        try {
            ((Application) context).registerActivityLifecycleCallbacks(new C3260c());
            if (!C3264g.m13567M()) {
                return true;
            }
            m13298C();
            return true;
        } catch (Throwable th) {
            C3257g.m13220a(th);
            return false;
        }
    }

    /* renamed from: a */
    public static void m13325a(int i10) {
        Object m13322a;
        Activity activity;
        int i11;
        boolean z10 = false;
        boolean z11 = true;
        switch (i10) {
            case 100:
                Object m13332ac = m13332ac();
                if (m13332ac == null || (m13322a = m13322a(m13332ac, (Class<?>) null, "mActivities")) == null) {
                    return;
                }
                try {
                    Iterator it = ((Map) m13322a).entrySet().iterator();
                    boolean z12 = false;
                    while (it.hasNext()) {
                        Object value = ((Map.Entry) it.next()).getValue();
                        if (value != null && (activity = (Activity) m13322a(value, (Class<?>) null, "activity")) != null) {
                            boolean booleanValue = ((Boolean) m13322a(value, (Class<?>) null, "paused")).booleanValue();
                            boolean booleanValue2 = ((Boolean) m13322a(value, (Class<?>) null, "stopped")).booleanValue();
                            WeakHashMap<Activity, Integer> weakHashMap = f13729ab;
                            synchronized (weakHashMap) {
                                if (booleanValue || booleanValue2) {
                                    i11 = 2;
                                } else {
                                    i11 = 1;
                                    z12 = true;
                                }
                                weakHashMap.put(activity, Integer.valueOf(i11));
                            }
                        }
                        z10 = true;
                    }
                    if (z10) {
                        m13339b(z12);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    C3257g.m13220a(th);
                    return;
                }
            case 101:
                try {
                    if (new File(m13312Q()).exists()) {
                        z11 = false;
                    }
                    f13714N = z11;
                    if (z11 || f13717Q) {
                        m13327a(m13331ab());
                        f13717Q = false;
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    C3257g.m13220a(th2);
                    return;
                }
            case 102:
                C3256f.m13206a(1, new RunnableC3255e(103));
                return;
            case 103:
                try {
                    C3257g.m13222a(new File(m13314S()));
                    return;
                } catch (Throwable th3) {
                    C3257g.m13220a(th3);
                    return;
                }
            case 104:
                C3258h.m13275d();
                C3263f.m13530a(102);
                if (m13301F()) {
                    C3262e.m13383C();
                    return;
                }
                return;
            default:
                if (!f13746i) {
                    throw new AssertionError();
                }
                return;
        }
    }

    /* renamed from: a */
    private static Object m13322a(Object obj, Class<?> cls, String str) {
        if (obj == null) {
            return null;
        }
        if (cls == null) {
            cls = obj.getClass();
        }
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Throwable th) {
            C3257g.m13220a(th);
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m13329a(Object obj, String str, RunnableC3255e runnableC3255e) {
        FileChannel fileChannel;
        boolean z10;
        synchronized (obj) {
            FileChannel fileChannel2 = null;
            r1 = null;
            FileLock lock = null;
            FileChannel fileChannel3 = null;
            boolean z11 = false;
            if (f13741d) {
                int nativeOpenFile = JNIBridge.nativeOpenFile(str);
                if (nativeOpenFile < 0) {
                    C3251a.m13169a("crashsdk", "Can not open file: " + str, null);
                    return false;
                }
                try {
                    boolean nativeLockFile = JNIBridge.nativeLockFile(nativeOpenFile, true);
                    try {
                        z10 = runnableC3255e.m13201a();
                        return z10;
                    } finally {
                        if (nativeLockFile) {
                            JNIBridge.nativeLockFile(nativeOpenFile, false);
                        }
                    }
                } finally {
                    JNIBridge.nativeCloseFile(nativeOpenFile);
                }
            }
            File file = new File(str);
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (Exception e10) {
                    C3257g.m13220a(e10);
                }
            }
            try {
                try {
                    fileChannel = new RandomAccessFile(file, "rw").getChannel();
                } catch (Throwable th) {
                    th = th;
                    C3257g.m13218a(fileChannel3);
                    throw th;
                }
            } catch (Exception e11) {
                try {
                    C3257g.m13220a(e11);
                    fileChannel = null;
                } catch (Exception e12) {
                    e = e12;
                    C3257g.m13220a(e);
                    C3257g.m13218a(fileChannel2);
                    z10 = z11;
                    return z10;
                }
            }
            if (fileChannel != null) {
                try {
                    try {
                        lock = fileChannel.lock();
                    } catch (Exception e13) {
                        try {
                            C3257g.m13220a(e13);
                        } catch (Exception e14) {
                            e = e14;
                            fileChannel2 = fileChannel;
                            C3257g.m13220a(e);
                            C3257g.m13218a(fileChannel2);
                            z10 = z11;
                            return z10;
                        }
                    }
                } catch (Throwable th2) {
                    fileChannel3 = fileChannel;
                    th = th2;
                    C3257g.m13218a(fileChannel3);
                    throw th;
                }
            }
            try {
                z11 = runnableC3255e.m13201a();
                C3257g.m13218a(fileChannel);
                z10 = z11;
                return z10;
            } finally {
                if (lock != null) {
                    try {
                        lock.release();
                    } catch (Exception e15) {
                        C3257g.m13220a(e15);
                    }
                }
            }
        }
    }
}
