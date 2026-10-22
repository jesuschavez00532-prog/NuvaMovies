package com.p077uc.crashsdk;

import android.content.pm.PackageInfo;
import android.util.Log;
import android.util.SparseArray;
import com.p077uc.crashsdk.export.LogType;
import com.p077uc.crashsdk.p078a.C3251a;
import com.p077uc.crashsdk.p078a.C3252b;
import com.p077uc.crashsdk.p078a.C3256f;
import com.p077uc.crashsdk.p078a.C3257g;
import com.p077uc.crashsdk.p078a.RunnableC3255e;
import com.umeng.ccg.C3419c;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.uc.crashsdk.a */
/* loaded from: classes3.dex */
public class C3250a {

    /* renamed from: a */
    public static String f13621a = "";

    /* renamed from: b */
    public static String f13622b = "";

    /* renamed from: d */
    static final /* synthetic */ boolean f13624d = true;

    /* renamed from: e */
    private static final Map<String, String> f13625e = new HashMap();

    /* renamed from: f */
    private static final List<String> f13626f = new ArrayList();

    /* renamed from: g */
    private static String f13627g = "";

    /* renamed from: h */
    private static String f13628h = null;

    /* renamed from: i */
    private static int f13629i = -1;

    /* renamed from: j */
    private static long f13630j = 0;

    /* renamed from: k */
    private static final HashMap<String, Object[]> f13631k = new HashMap<>();

    /* renamed from: l */
    private static final List<String> f13632l = new ArrayList();

    /* renamed from: m */
    private static int f13633m = 0;

    /* renamed from: n */
    private static int f13634n = 0;

    /* renamed from: o */
    private static int f13635o = 0;

    /* renamed from: p */
    private static int f13636p = 0;

    /* renamed from: q */
    private static final HashMap<String, Object[]> f13637q = new HashMap<>();

    /* renamed from: r */
    private static final List<String> f13638r = new ArrayList();

    /* renamed from: s */
    private static int f13639s = 0;

    /* renamed from: t */
    private static int f13640t = 0;

    /* renamed from: u */
    private static int f13641u = 0;

    /* renamed from: v */
    private static int f13642v = 0;

    /* renamed from: w */
    private static int f13643w = 0;

    /* renamed from: x */
    private static int f13644x = 0;

    /* renamed from: y */
    private static final SparseArray<Object[]> f13645y = new SparseArray<>();

    /* renamed from: z */
    private static final List<Integer> f13646z = new ArrayList();

    /* renamed from: A */
    private static final HashMap<String, Object[]> f13612A = new HashMap<>();

    /* renamed from: B */
    private static final List<String> f13613B = new ArrayList();

    /* renamed from: C */
    private static int f13614C = 0;

    /* renamed from: D */
    private static int f13615D = 0;

    /* renamed from: E */
    private static int f13616E = 0;

    /* renamed from: c */
    static boolean f13623c = false;

    /* renamed from: F */
    private static Runnable f13617F = new RunnableC3255e(201);

    /* renamed from: G */
    private static boolean f13618G = false;

    /* renamed from: H */
    private static boolean f13619H = false;

    /* renamed from: I */
    private static boolean f13620I = false;

    /* renamed from: a */
    public static String m13135a() {
        String str = f13628h;
        return str != null ? str : m13165o() ? f13628h : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static long m13148b() {
        return f13630j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m13152c() {
        if (f13629i == -1) {
            m13165o();
        }
        return f13629i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m13154d() {
        StringBuilder sb2 = new StringBuilder();
        synchronized (f13625e) {
            for (String str : f13626f) {
                String str2 = f13625e.get(str);
                sb2.append(str);
                sb2.append(": ");
                if (str2 != null) {
                    sb2.append(str2);
                }
                sb2.append("\n");
            }
        }
        sb2.append(String.format(Locale.US, "(saved at %s)\n", C3262e.m13493n()));
        C3252b.m13176a(C3259b.m13350h(), sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m13155e() {
        if (!f13624d && !C3259b.f13741d) {
            throw new AssertionError();
        }
        synchronized (f13625e) {
            for (String str : f13626f) {
                JNIBridge.nativeAddHeaderInfo(str, f13625e.get(str));
            }
        }
    }

    /* renamed from: f */
    public static byte[] m13156f() {
        return new byte[]{24, 99, 121, 60};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static void m13157g() {
        if (!f13624d && !C3259b.f13741d) {
            throw new AssertionError();
        }
        synchronized (f13631k) {
            for (String str : f13632l) {
                Object[] objArr = f13631k.get(str);
                int intValue = ((Integer) objArr[0]).intValue();
                if ((1048833 & intValue) != 0) {
                    JNIBridge.nativeAddDumpFile(str, (String) objArr[1], ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue(), intValue, ((Boolean) objArr[4]).booleanValue());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static String m13158h() {
        StringBuilder sb2 = new StringBuilder();
        synchronized (f13631k) {
            boolean z10 = true;
            for (String str : f13632l) {
                if (LogType.isForJava(((Integer) f13631k.get(str)[0]).intValue())) {
                    if (!z10) {
                        sb2.append("`");
                    }
                    sb2.append(str);
                    z10 = false;
                }
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m13159i() {
        if (!f13624d && !C3259b.f13741d) {
            throw new AssertionError();
        }
        synchronized (f13637q) {
            for (String str : f13638r) {
                Object[] objArr = f13637q.get(str);
                int intValue = ((Integer) objArr[0]).intValue();
                if ((1048833 & intValue) != 0) {
                    JNIBridge.nativeAddCallbackInfo(str, intValue, ((Long) objArr[2]).longValue(), ((Integer) objArr[3]).intValue());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static String m13160j() {
        String sb2;
        synchronized (f13637q) {
            StringBuilder sb3 = new StringBuilder();
            List<String> list = f13638r;
            synchronized (list) {
                boolean z10 = true;
                for (String str : list) {
                    if (LogType.isForJava(((Integer) f13637q.get(str)[0]).intValue())) {
                        if (!z10) {
                            sb3.append("`");
                        }
                        sb3.append(str);
                        z10 = false;
                    }
                }
            }
            sb2 = sb3.toString();
        }
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static void m13161k() {
        if (!f13624d && !C3259b.f13741d) {
            throw new AssertionError();
        }
        synchronized (f13612A) {
            for (String str : f13613B) {
                Object[] objArr = f13612A.get(str);
                int intValue = ((Integer) objArr[0]).intValue();
                int intValue2 = ((Integer) objArr[1]).intValue();
                List list = (List) objArr[2];
                if ((1048577 & intValue2) != 0 && JNIBridge.nativeCreateCachedInfo(str, intValue, intValue2) != 0) {
                    Iterator it = list.iterator();
                    while (it.hasNext() && JNIBridge.nativeAddCachedInfo(str, (String) it.next())) {
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static String m13162l() {
        StringBuilder sb2 = new StringBuilder();
        synchronized (f13612A) {
            boolean z10 = true;
            for (String str : f13613B) {
                if (LogType.isForJava(((Integer) f13612A.get(str)[1]).intValue())) {
                    if (!z10) {
                        sb2.append("`");
                    }
                    sb2.append(str);
                    z10 = false;
                }
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static String m13163m() {
        if (!f13618G) {
            String m13174a = C3252b.m13174a(C3259b.m13355m());
            f13627g = m13174a;
            f13618G = true;
            if (m13174a == null) {
                f13627g = "";
            }
        }
        return f13627g;
    }

    /* renamed from: n */
    public static void m13164n() {
        m13166p();
        if (f13619H) {
            if (C3259b.f13741d) {
                JNIBridge.set(128, f13627g);
            }
        } else {
            f13619H = true;
            C3256f.m13206a(0, new RunnableC3255e(C3419c.f15024m));
        }
    }

    /* renamed from: o */
    private static boolean m13165o() {
        try {
            PackageInfo packageInfo = C3257g.m13211a().getPackageManager().getPackageInfo(f13621a, 0);
            f13628h = packageInfo.versionName;
            f13630j = packageInfo.lastUpdateTime;
            f13629i = packageInfo.versionCode;
            return true;
        } catch (Throwable th) {
            C3257g.m13229b(th);
            return false;
        }
    }

    /* renamed from: p */
    private static void m13166p() {
        if (f13620I || !C3262e.m13429a()) {
            return;
        }
        if (C3259b.f13741d || !C3259b.f13744g) {
            String format = String.format(Locale.US, "%s/%s/%s", C3264g.m13575U(), C3264g.m13576V(), C3264g.m13577W());
            C3251a.m13171b("crashsdk", "UUID: " + C3262e.m13499q());
            C3251a.m13171b("crashsdk", "Version: " + format);
            C3251a.m13171b("crashsdk", "Process Name: " + C3262e.m13481h());
            f13620I = true;
        }
    }

    /* renamed from: b */
    private static StringBuilder m13150b(String str, boolean z10) {
        String m13372a;
        StringBuilder sb2 = new StringBuilder();
        try {
            Object[] objArr = f13637q.get(str);
            try {
                if (objArr == null) {
                    m13372a = "Unknown callback: " + str;
                } else {
                    Callable callable = (Callable) objArr[1];
                    if (callable != null) {
                        m13372a = (String) callable.call();
                    } else {
                        m13372a = C3261d.m13372a(str, z10);
                    }
                }
                if (m13372a != null) {
                    sb2.append(m13372a);
                }
            } catch (Throwable th) {
                sb2.append("[DEBUG] Callback occurred new exception:\n");
                sb2.append(Log.getStackTraceString(th));
            }
        } catch (Throwable th2) {
            C3257g.m13220a(th2);
        }
        try {
            if (sb2.length() == 0) {
                sb2.append("(data is null)\n");
            }
        } catch (Throwable th3) {
            C3257g.m13220a(th3);
        }
        return sb2;
    }

    /* renamed from: a */
    public static void m13143a(String str, String str2) {
        Map<String, String> map = f13625e;
        synchronized (map) {
            if (!map.containsKey(str)) {
                f13626f.add(str);
            }
            map.put(str, str2);
            if (C3259b.f13741d) {
                JNIBridge.nativeAddHeaderInfo(str, str2);
            }
            C3262e.m13510y();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static ArrayList<String> m13153c(String str) {
        if (C3257g.m13225a(str)) {
            return null;
        }
        String[] split = str.split(";", 20);
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str2 : split) {
            if (!C3257g.m13225a(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m13139a(OutputStream outputStream, String str) {
        synchronized (f13625e) {
            for (String str2 : f13626f) {
                try {
                    StringBuilder sb2 = new StringBuilder(11);
                    sb2.append(str2);
                    sb2.append(": ");
                    String str3 = f13625e.get(str2);
                    if (str3 != null) {
                        sb2.append(str3);
                    }
                    sb2.append("\n");
                    outputStream.write(sb2.toString().getBytes(str));
                } catch (Throwable th) {
                    C3262e.m13426a(th, outputStream);
                }
            }
        }
    }

    /* renamed from: b */
    public static int m13147b(String str, String str2) {
        int i10;
        if (str == null || str2 == null) {
            return 0;
        }
        if (str2.length() > 2048) {
            str2 = str2.substring(0, 2048);
        }
        HashMap<String, Object[]> hashMap = f13612A;
        synchronized (hashMap) {
            Object[] objArr = hashMap.get(str);
            if (objArr != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int intValue2 = ((Integer) objArr[1]).intValue();
                List list = (List) objArr[2];
                if (list.size() >= intValue) {
                    list.remove(0);
                }
                list.add(str2);
                r0 = LogType.isForJava(intValue2) ? LogType.addType(0, 16) : 0;
                if (!C3259b.f13741d) {
                    if (LogType.isForNative(intValue2)) {
                        r0 = LogType.addType(r0, 1);
                    }
                    if (LogType.isForANR(intValue2)) {
                        r0 = LogType.addType(r0, LogType.ANR);
                    }
                }
                i10 = r0;
                r0 = intValue2;
            } else {
                i10 = 0;
            }
            if (C3259b.f13741d && JNIBridge.nativeAddCachedInfo(str, str2)) {
                if (LogType.isForNative(r0)) {
                    i10 = LogType.addType(i10, 1);
                }
                if (LogType.isForANR(r0)) {
                    i10 = LogType.addType(i10, LogType.ANR);
                }
            }
        }
        return i10;
    }

    /* renamed from: a */
    public static int m13134a(String str, String str2, boolean z10, boolean z11, int i10, boolean z12) {
        int i11;
        int i12;
        boolean z13;
        if (str == null || str2 == null) {
            return 0;
        }
        if (str.length() > 256) {
            C3251a.m13169a("crashsdk", "addDumpFile: description is too long!", null);
            return 0;
        }
        HashMap<String, Object[]> hashMap = f13631k;
        synchronized (hashMap) {
            if (hashMap.containsKey(str)) {
                i12 = ((Integer) hashMap.get(str)[0]).intValue();
                i11 = LogType.addType(i12, i10);
            } else {
                i11 = i10;
                i12 = 0;
            }
            if (LogType.isForJava(i11) && !LogType.isForJava(i12)) {
                int i13 = f13633m;
                if (i13 >= 10) {
                    i11 = LogType.removeType(i11, 16);
                } else {
                    f13633m = i13 + 1;
                }
            }
            if (LogType.isForNative(i11) && !LogType.isForNative(i12)) {
                int i14 = f13634n;
                if (i14 >= 10) {
                    i11 = LogType.removeType(i11, 1);
                } else {
                    f13634n = i14 + 1;
                }
            }
            if (LogType.isForUnexp(i11) && !LogType.isForUnexp(i12)) {
                int i15 = f13635o;
                if (i15 >= 10) {
                    i11 = LogType.removeType(i11, 256);
                } else {
                    f13635o = i15 + 1;
                }
            }
            if (LogType.isForANR(i11) && !LogType.isForANR(i12)) {
                int i16 = f13636p;
                if (i16 >= 10) {
                    i11 = LogType.removeType(i11, LogType.ANR);
                } else {
                    f13636p = i16 + 1;
                }
            }
            if ((1048849 & i11) == 0) {
                z13 = false;
            } else {
                if (i12 == 0) {
                    f13632l.add(str);
                }
                z13 = true;
            }
            if (!z13) {
                return i11;
            }
            if (C3259b.f13741d && (1048833 & i10) != 0) {
                int nativeAddDumpFile = JNIBridge.nativeAddDumpFile(str, str2, z10, z11, i10, z12);
                if (!LogType.isForNative(nativeAddDumpFile)) {
                    i11 = LogType.removeType(i11, 1);
                }
                if (!LogType.isForUnexp(nativeAddDumpFile)) {
                    i11 = LogType.removeType(i11, 256);
                }
                if (!LogType.isForANR(nativeAddDumpFile)) {
                    i11 = LogType.removeType(i11, LogType.ANR);
                }
            }
            hashMap.put(str, new Object[]{Integer.valueOf(i11), str2, Boolean.valueOf(z10), Boolean.valueOf(z11), Boolean.valueOf(z12)});
            return i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:7|(3:34|35|(4:37|38|39|24))(3:9|10|(2:33|24))|12|13|15|16|(2:19|17)|20|21|23|24|5) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a4, code lost:
    
        com.p077uc.crashsdk.C3262e.m13426a(r2, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        com.p077uc.crashsdk.C3262e.m13426a(r2, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
    
        com.p077uc.crashsdk.C3262e.m13426a(r2, r11);
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m13151b(java.io.OutputStream r11, java.lang.String r12, java.lang.String r13, java.util.ArrayList<java.lang.String> r14) {
        /*
            java.util.HashMap<java.lang.String, java.lang.Object[]> r0 = com.p077uc.crashsdk.C3250a.f13612A
            monitor-enter(r0)
            java.util.List<java.lang.String> r1 = com.p077uc.crashsdk.C3250a.f13613B     // Catch: java.lang.Throwable -> Ld1
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Ld1
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Ld1
            if (r2 == 0) goto La9
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Ld1
            java.util.HashMap<java.lang.String, java.lang.Object[]> r3 = com.p077uc.crashsdk.C3250a.f13612A     // Catch: java.lang.Throwable -> Ld1
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> Ld1
            java.lang.Object[] r3 = (java.lang.Object[]) r3     // Catch: java.lang.Throwable -> Ld1
            r4 = 0
            r5 = r3[r4]     // Catch: java.lang.Throwable -> Ld1
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> Ld1
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> Ld1
            r6 = 1
            r7 = r3[r6]     // Catch: java.lang.Throwable -> Ld1
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Throwable -> Ld1
            int r7 = r7.intValue()     // Catch: java.lang.Throwable -> Ld1
            r8 = 2
            r3 = r3[r8]     // Catch: java.lang.Throwable -> Ld1
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> Ld1
            if (r14 != 0) goto L3d
            boolean r7 = com.p077uc.crashsdk.export.LogType.isForJava(r7)     // Catch: java.lang.Throwable -> Ld1
            if (r7 != 0) goto L43
            goto L9
        L3d:
            boolean r7 = m13145a(r14, r2)     // Catch: java.lang.Throwable -> Ld1
            if (r7 == 0) goto L9
        L43:
            java.util.Locale r7 = java.util.Locale.US     // Catch: java.lang.Throwable -> L68
            java.lang.String r9 = "%s (%d/%d)\n"
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L68
            r10[r4] = r2     // Catch: java.lang.Throwable -> L68
            int r2 = r3.size()     // Catch: java.lang.Throwable -> L68
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L68
            r10[r6] = r2     // Catch: java.lang.Throwable -> L68
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L68
            r10[r8] = r2     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = java.lang.String.format(r7, r9, r10)     // Catch: java.lang.Throwable -> L68
            byte[] r2 = r2.getBytes(r12)     // Catch: java.lang.Throwable -> L68
            r11.write(r2)     // Catch: java.lang.Throwable -> L68
            goto L6c
        L68:
            r2 = move-exception
            com.p077uc.crashsdk.C3262e.m13426a(r2, r11)     // Catch: java.lang.Throwable -> Ld1
        L6c:
            java.util.Iterator r2 = r3.iterator()     // Catch: java.lang.Throwable -> L8d
        L70:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L8d
            if (r3 == 0) goto L91
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L8d
            byte[] r3 = r3.getBytes(r12)     // Catch: java.lang.Throwable -> L8d
            r11.write(r3)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r3 = "\n"
            byte[] r3 = r3.getBytes(r12)     // Catch: java.lang.Throwable -> L8d
            r11.write(r3)     // Catch: java.lang.Throwable -> L8d
            goto L70
        L8d:
            r2 = move-exception
            com.p077uc.crashsdk.C3262e.m13426a(r2, r11)     // Catch: java.lang.Throwable -> Ld1
        L91:
            java.lang.String r2 = "\n"
            byte[] r2 = r2.getBytes(r12)     // Catch: java.lang.Throwable -> La3
            r11.write(r2)     // Catch: java.lang.Throwable -> La3
            byte[] r2 = r13.getBytes(r12)     // Catch: java.lang.Throwable -> La3
            r11.write(r2)     // Catch: java.lang.Throwable -> La3
            goto L9
        La3:
            r2 = move-exception
            com.p077uc.crashsdk.C3262e.m13426a(r2, r11)     // Catch: java.lang.Throwable -> Ld1
            goto L9
        La9:
            if (r14 == 0) goto Lcf
            boolean r12 = com.p077uc.crashsdk.C3262e.m13386F()     // Catch: java.lang.Throwable -> Ld1
            if (r12 == 0) goto Lcf
            java.util.Iterator r12 = r14.iterator()     // Catch: java.lang.Throwable -> Ld1
        Lb5:
            boolean r13 = r12.hasNext()     // Catch: java.lang.Throwable -> Ld1
            if (r13 == 0) goto Lcf
            java.lang.Object r13 = r12.next()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> Ld1
            java.util.List<java.lang.String> r14 = com.p077uc.crashsdk.C3250a.f13613B     // Catch: java.lang.Throwable -> Ld1
            boolean r14 = m13145a(r14, r13)     // Catch: java.lang.Throwable -> Ld1
            if (r14 != 0) goto Lb5
            java.lang.String r14 = "CUSTOMCACHEDINFO"
            com.p077uc.crashsdk.C3262e.m13422a(r11, r14, r13)     // Catch: java.lang.Throwable -> Ld1
            goto Lb5
        Lcf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld1
            return
        Ld1:
            r11 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld1
            goto Ld5
        Ld4:
            throw r11
        Ld5:
            goto Ld4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p077uc.crashsdk.C3250a.m13151b(java.io.OutputStream, java.lang.String, java.lang.String, java.util.ArrayList):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050 A[Catch: all -> 0x00d7, TRY_LEAVE, TryCatch #2 {all -> 0x00d7, blocks: (B:12:0x0025, B:69:0x002f, B:22:0x0045, B:24:0x0050, B:15:0x003e), top: B:11:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0 A[Catch: all -> 0x00d3, TryCatch #0 {all -> 0x00d3, blocks: (B:33:0x007f, B:37:0x009b, B:39:0x00a3, B:57:0x00b0, B:59:0x00b5), top: B:32:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5 A[Catch: all -> 0x00d3, TRY_LEAVE, TryCatch #0 {all -> 0x00d3, blocks: (B:33:0x007f, B:37:0x009b, B:39:0x00a3, B:57:0x00b0, B:59:0x00b5), top: B:32:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x006e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m13142a(java.io.OutputStream r18, java.lang.String r19, java.util.ArrayList<java.lang.String> r20) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p077uc.crashsdk.C3250a.m13142a(java.io.OutputStream, java.lang.String, java.util.ArrayList):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m13149b(String str) {
        StringBuilder sb2 = new StringBuilder();
        HashMap<String, Object[]> hashMap = f13612A;
        synchronized (hashMap) {
            Object[] objArr = hashMap.get(str);
            int intValue = ((Integer) objArr[0]).intValue();
            List list = (List) objArr[2];
            sb2.append(String.format(Locale.US, "%s (%d/%d)\n", str, Integer.valueOf(list.size()), Integer.valueOf(intValue)));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m13136a(String str) {
        HashMap<String, Object[]> hashMap = f13631k;
        synchronized (hashMap) {
            Object[] objArr = hashMap.get(str);
            if (objArr == null) {
                return null;
            }
            int i10 = 1;
            String str2 = (String) objArr[1];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean booleanValue2 = ((Boolean) objArr[3]).booleanValue();
            Locale locale = Locale.US;
            Object[] objArr2 = new Object[4];
            objArr2[0] = str2;
            objArr2[1] = "`";
            objArr2[2] = Integer.valueOf(booleanValue ? 1 : 0);
            if (!booleanValue2) {
                i10 = 0;
            }
            objArr2[3] = Integer.valueOf(i10);
            return String.format(locale, "%s%s%d%d", objArr2);
        }
    }

    /* renamed from: a */
    private static boolean m13145a(List<String> list, String str) {
        if (C3257g.m13225a(str)) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[Catch: all -> 0x015a, TryCatch #0 {, blocks: (B:8:0x000d, B:10:0x0013, B:12:0x0027, B:14:0x002b, B:16:0x0035, B:18:0x003b, B:22:0x005d, B:25:0x0047, B:28:0x004c, B:29:0x0057, B:30:0x0050, B:33:0x0063, B:35:0x006a, B:37:0x0070, B:42:0x009a, B:43:0x00a1, B:45:0x00a9, B:47:0x00af, B:49:0x00b3, B:50:0x00b8, B:51:0x00be, B:53:0x00c6, B:55:0x00cc, B:57:0x00d0, B:58:0x00d5, B:59:0x00db, B:63:0x00ed, B:65:0x00ef, B:67:0x00f3, B:69:0x00f9, B:71:0x0105, B:73:0x010b, B:75:0x0112, B:76:0x0117, B:78:0x011d, B:80:0x0123, B:81:0x0128, B:83:0x012e, B:85:0x0134, B:86:0x013c, B:87:0x0158, B:91:0x00e5, B:97:0x007c, B:100:0x0081, B:101:0x008b, B:104:0x0092), top: B:7:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009a A[Catch: all -> 0x015a, TryCatch #0 {, blocks: (B:8:0x000d, B:10:0x0013, B:12:0x0027, B:14:0x002b, B:16:0x0035, B:18:0x003b, B:22:0x005d, B:25:0x0047, B:28:0x004c, B:29:0x0057, B:30:0x0050, B:33:0x0063, B:35:0x006a, B:37:0x0070, B:42:0x009a, B:43:0x00a1, B:45:0x00a9, B:47:0x00af, B:49:0x00b3, B:50:0x00b8, B:51:0x00be, B:53:0x00c6, B:55:0x00cc, B:57:0x00d0, B:58:0x00d5, B:59:0x00db, B:63:0x00ed, B:65:0x00ef, B:67:0x00f3, B:69:0x00f9, B:71:0x0105, B:73:0x010b, B:75:0x0112, B:76:0x0117, B:78:0x011d, B:80:0x0123, B:81:0x0128, B:83:0x012e, B:85:0x0134, B:86:0x013c, B:87:0x0158, B:91:0x00e5, B:97:0x007c, B:100:0x0081, B:101:0x008b, B:104:0x0092), top: B:7:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d0 A[Catch: all -> 0x015a, TryCatch #0 {, blocks: (B:8:0x000d, B:10:0x0013, B:12:0x0027, B:14:0x002b, B:16:0x0035, B:18:0x003b, B:22:0x005d, B:25:0x0047, B:28:0x004c, B:29:0x0057, B:30:0x0050, B:33:0x0063, B:35:0x006a, B:37:0x0070, B:42:0x009a, B:43:0x00a1, B:45:0x00a9, B:47:0x00af, B:49:0x00b3, B:50:0x00b8, B:51:0x00be, B:53:0x00c6, B:55:0x00cc, B:57:0x00d0, B:58:0x00d5, B:59:0x00db, B:63:0x00ed, B:65:0x00ef, B:67:0x00f3, B:69:0x00f9, B:71:0x0105, B:73:0x010b, B:75:0x0112, B:76:0x0117, B:78:0x011d, B:80:0x0123, B:81:0x0128, B:83:0x012e, B:85:0x0134, B:86:0x013c, B:87:0x0158, B:91:0x00e5, B:97:0x007c, B:100:0x0081, B:101:0x008b, B:104:0x0092), top: B:7:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d5 A[Catch: all -> 0x015a, TryCatch #0 {, blocks: (B:8:0x000d, B:10:0x0013, B:12:0x0027, B:14:0x002b, B:16:0x0035, B:18:0x003b, B:22:0x005d, B:25:0x0047, B:28:0x004c, B:29:0x0057, B:30:0x0050, B:33:0x0063, B:35:0x006a, B:37:0x0070, B:42:0x009a, B:43:0x00a1, B:45:0x00a9, B:47:0x00af, B:49:0x00b3, B:50:0x00b8, B:51:0x00be, B:53:0x00c6, B:55:0x00cc, B:57:0x00d0, B:58:0x00d5, B:59:0x00db, B:63:0x00ed, B:65:0x00ef, B:67:0x00f3, B:69:0x00f9, B:71:0x0105, B:73:0x010b, B:75:0x0112, B:76:0x0117, B:78:0x011d, B:80:0x0123, B:81:0x0128, B:83:0x012e, B:85:0x0134, B:86:0x013c, B:87:0x0158, B:91:0x00e5, B:97:0x007c, B:100:0x0081, B:101:0x008b, B:104:0x0092), top: B:7:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed A[Catch: all -> 0x015a, DONT_GENERATE, TryCatch #0 {, blocks: (B:8:0x000d, B:10:0x0013, B:12:0x0027, B:14:0x002b, B:16:0x0035, B:18:0x003b, B:22:0x005d, B:25:0x0047, B:28:0x004c, B:29:0x0057, B:30:0x0050, B:33:0x0063, B:35:0x006a, B:37:0x0070, B:42:0x009a, B:43:0x00a1, B:45:0x00a9, B:47:0x00af, B:49:0x00b3, B:50:0x00b8, B:51:0x00be, B:53:0x00c6, B:55:0x00cc, B:57:0x00d0, B:58:0x00d5, B:59:0x00db, B:63:0x00ed, B:65:0x00ef, B:67:0x00f3, B:69:0x00f9, B:71:0x0105, B:73:0x010b, B:75:0x0112, B:76:0x0117, B:78:0x011d, B:80:0x0123, B:81:0x0128, B:83:0x012e, B:85:0x0134, B:86:0x013c, B:87:0x0158, B:91:0x00e5, B:97:0x007c, B:100:0x0081, B:101:0x008b, B:104:0x0092), top: B:7:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ef A[Catch: all -> 0x015a, TryCatch #0 {, blocks: (B:8:0x000d, B:10:0x0013, B:12:0x0027, B:14:0x002b, B:16:0x0035, B:18:0x003b, B:22:0x005d, B:25:0x0047, B:28:0x004c, B:29:0x0057, B:30:0x0050, B:33:0x0063, B:35:0x006a, B:37:0x0070, B:42:0x009a, B:43:0x00a1, B:45:0x00a9, B:47:0x00af, B:49:0x00b3, B:50:0x00b8, B:51:0x00be, B:53:0x00c6, B:55:0x00cc, B:57:0x00d0, B:58:0x00d5, B:59:0x00db, B:63:0x00ed, B:65:0x00ef, B:67:0x00f3, B:69:0x00f9, B:71:0x0105, B:73:0x010b, B:75:0x0112, B:76:0x0117, B:78:0x011d, B:80:0x0123, B:81:0x0128, B:83:0x012e, B:85:0x0134, B:86:0x013c, B:87:0x0158, B:91:0x00e5, B:97:0x007c, B:100:0x0081, B:101:0x008b, B:104:0x0092), top: B:7:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00e3  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m13133a(java.lang.String r16, int r17, java.util.concurrent.Callable<java.lang.String> r18, long r19, int r21) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p077uc.crashsdk.C3250a.m13133a(java.lang.String, int, java.util.concurrent.Callable, long, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:7|(2:8|9)|(3:35|36|(4:39|40|41|17)(1:38))(3:11|12|(4:14|15|16|17)(1:18))|19|(1:21)(1:34)|(1:33)(1:25)|26|27|29|17|5) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
    
        com.p077uc.crashsdk.C3262e.m13426a(r2, r10);
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m13141a(java.io.OutputStream r10, java.lang.String r11, java.lang.String r12, java.util.ArrayList<java.lang.String> r13) {
        /*
            java.util.HashMap<java.lang.String, java.lang.Object[]> r0 = com.p077uc.crashsdk.C3250a.f13637q
            monitor-enter(r0)
            java.util.List<java.lang.String> r1 = com.p077uc.crashsdk.C3250a.f13638r     // Catch: java.lang.Throwable -> Ld1
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Ld1
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Ld1
            if (r2 == 0) goto La9
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Ld1
            java.util.HashMap<java.lang.String, java.lang.Object[]> r3 = com.p077uc.crashsdk.C3250a.f13637q     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L8d
            java.lang.Object[] r3 = (java.lang.Object[]) r3     // Catch: java.lang.Throwable -> L8d
            r4 = 0
            r5 = r3[r4]     // Catch: java.lang.Throwable -> L8d
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L8d
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L8d
            if (r13 != 0) goto L2f
            boolean r5 = com.p077uc.crashsdk.export.LogType.isForJava(r5)     // Catch: java.lang.Throwable -> L8d
            if (r5 != 0) goto L36
            goto L9
        L2f:
            boolean r5 = m13145a(r13, r2)     // Catch: java.lang.Throwable -> L8d
            if (r5 != 0) goto L36
            goto L9
        L36:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r5.<init>()     // Catch: java.lang.Throwable -> L8d
            r5.append(r2)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r6 = "\n"
            r5.append(r6)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L8d
            byte[] r5 = r5.getBytes(r11)     // Catch: java.lang.Throwable -> L8d
            r10.write(r5)     // Catch: java.lang.Throwable -> L8d
            r5 = 2
            r5 = r3[r5]     // Catch: java.lang.Throwable -> L8d
            java.lang.Long r5 = (java.lang.Long) r5     // Catch: java.lang.Throwable -> L8d
            long r5 = r5.longValue()     // Catch: java.lang.Throwable -> L8d
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L6b
            r7 = 3
            r3 = r3[r7]     // Catch: java.lang.Throwable -> L8d
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L8d
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r2 = com.p077uc.crashsdk.JNIBridge.nativeGetCallbackInfo(r2, r5, r3, r4)     // Catch: java.lang.Throwable -> L8d
            goto L73
        L6b:
            java.lang.StringBuilder r2 = m13150b(r2, r4)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L8d
        L73:
            if (r2 == 0) goto L83
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L8d
            if (r3 <= 0) goto L83
            byte[] r2 = r2.getBytes(r11)     // Catch: java.lang.Throwable -> L8d
            r10.write(r2)     // Catch: java.lang.Throwable -> L8d
            goto L91
        L83:
            java.lang.String r2 = "(data is null)\n"
            byte[] r2 = r2.getBytes(r11)     // Catch: java.lang.Throwable -> L8d
            r10.write(r2)     // Catch: java.lang.Throwable -> L8d
            goto L91
        L8d:
            r2 = move-exception
            com.p077uc.crashsdk.C3262e.m13426a(r2, r10)     // Catch: java.lang.Throwable -> Ld1
        L91:
            java.lang.String r2 = "\n"
            byte[] r2 = r2.getBytes(r11)     // Catch: java.lang.Throwable -> La3
            r10.write(r2)     // Catch: java.lang.Throwable -> La3
            byte[] r2 = r12.getBytes(r11)     // Catch: java.lang.Throwable -> La3
            r10.write(r2)     // Catch: java.lang.Throwable -> La3
            goto L9
        La3:
            r2 = move-exception
            com.p077uc.crashsdk.C3262e.m13426a(r2, r10)     // Catch: java.lang.Throwable -> Ld1
            goto L9
        La9:
            if (r13 == 0) goto Lcf
            boolean r11 = com.p077uc.crashsdk.C3262e.m13386F()     // Catch: java.lang.Throwable -> Ld1
            if (r11 == 0) goto Lcf
            java.util.Iterator r11 = r13.iterator()     // Catch: java.lang.Throwable -> Ld1
        Lb5:
            boolean r12 = r11.hasNext()     // Catch: java.lang.Throwable -> Ld1
            if (r12 == 0) goto Lcf
            java.lang.Object r12 = r11.next()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> Ld1
            java.util.List<java.lang.String> r13 = com.p077uc.crashsdk.C3250a.f13638r     // Catch: java.lang.Throwable -> Ld1
            boolean r13 = m13145a(r13, r12)     // Catch: java.lang.Throwable -> Ld1
            if (r13 != 0) goto Lb5
            java.lang.String r13 = "CUSTOMCALLBACKINFO"
            com.p077uc.crashsdk.C3262e.m13422a(r10, r13, r12)     // Catch: java.lang.Throwable -> Ld1
            goto Lb5
        Lcf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld1
            return
        Ld1:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld1
            goto Ld5
        Ld4:
            throw r10
        Ld5:
            goto Ld4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p077uc.crashsdk.C3250a.m13141a(java.io.OutputStream, java.lang.String, java.lang.String, java.util.ArrayList):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m13137a(String str, boolean z10) {
        String sb2;
        HashMap<String, Object[]> hashMap = f13637q;
        synchronized (hashMap) {
            Object[] objArr = hashMap.get(str);
            long longValue = ((Long) objArr[2]).longValue();
            if (longValue != 0) {
                sb2 = JNIBridge.nativeGetCallbackInfo(str, longValue, ((Integer) objArr[3]).intValue(), z10);
            } else {
                sb2 = m13150b(str, z10).toString();
            }
        }
        return sb2;
    }

    /* renamed from: a */
    private static boolean m13144a(String str, Thread thread) {
        if (thread == null) {
            return false;
        }
        SparseArray<Object[]> sparseArray = f13645y;
        synchronized (sparseArray) {
            int id2 = (int) thread.getId();
            if (sparseArray.get(id2) == null) {
                f13646z.add(Integer.valueOf(id2));
            }
            sparseArray.put(id2, new Object[]{new WeakReference(thread), str});
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:30:0x00c3, B:32:0x00ca, B:33:0x00d3, B:35:0x00d8, B:37:0x00dc, B:38:0x00e5), top: B:29:0x00c3, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:30:0x00c3, B:32:0x00ca, B:33:0x00d3, B:35:0x00d8, B:37:0x00dc, B:38:0x00e5), top: B:29:0x00c3, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m13140a(java.io.OutputStream r13, java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p077uc.crashsdk.C3250a.m13140a(java.io.OutputStream, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public static int m13132a(String str, int i10, int i11) {
        int i12;
        int i13;
        boolean z10;
        if (str == null || i10 <= 0) {
            return 0;
        }
        if (i10 > 1500) {
            C3251a.m13169a("crashsdk", "createCachedInfo: capacity is too large!", null);
            return 0;
        }
        HashMap<String, Object[]> hashMap = f13612A;
        synchronized (hashMap) {
            if (hashMap.containsKey(str)) {
                i13 = ((Integer) hashMap.get(str)[1]).intValue();
                i12 = LogType.addType(i13, i11);
            } else {
                i12 = i11;
                i13 = 0;
            }
            if (LogType.isForJava(i12) && !LogType.isForJava(i13)) {
                int i14 = f13614C;
                if (i14 >= 8) {
                    i12 = LogType.removeType(i12, 16);
                } else {
                    f13614C = i14 + 1;
                }
            }
            if (LogType.isForNative(i12) && !LogType.isForNative(i13)) {
                int i15 = f13615D;
                if (i15 >= 8) {
                    i12 = LogType.removeType(i12, 1);
                } else {
                    f13615D = i15 + 1;
                }
            }
            if (LogType.isForANR(i12) && !LogType.isForANR(i13)) {
                int i16 = f13616E;
                if (i16 >= 8) {
                    i12 = LogType.removeType(i12, LogType.ANR);
                } else {
                    f13616E = i16 + 1;
                }
            }
            if ((1048849 & i12) == 0) {
                z10 = false;
            } else {
                if (i13 == 0) {
                    f13613B.add(str);
                }
                z10 = true;
            }
            if (!z10) {
                return i12;
            }
            if (C3259b.f13741d && (i11 & 1048577) != 0) {
                int nativeCreateCachedInfo = JNIBridge.nativeCreateCachedInfo(str, i10, i12);
                if (!LogType.isForNative(nativeCreateCachedInfo)) {
                    i12 = LogType.removeType(i12, 1);
                }
                if (!LogType.isForANR(nativeCreateCachedInfo)) {
                    i12 = LogType.removeType(i12, LogType.ANR);
                }
            }
            hashMap.put(str, new Object[]{Integer.valueOf(i10), Integer.valueOf(i12), new ArrayList()});
            return i12;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m13131a(int r5, java.lang.String r6) {
        /*
            boolean r0 = com.p077uc.crashsdk.p078a.C3257g.m13225a(r6)
            if (r0 == 0) goto Le
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
        Le:
            boolean r0 = com.p077uc.crashsdk.export.LogType.isForNative(r5)
            if (r0 != 0) goto L1a
            boolean r0 = com.p077uc.crashsdk.export.LogType.isForANR(r5)
            if (r0 == 0) goto L40
        L1a:
            boolean r0 = com.p077uc.crashsdk.C3259b.f13741d
            r1 = 0
            if (r0 == 0) goto L39
            android.util.SparseArray<java.lang.Object[]> r0 = com.p077uc.crashsdk.C3250a.f13645y
            monitor-enter(r0)
            r2 = 4
            long r3 = (long) r5
            com.p077uc.crashsdk.JNIBridge.nativeCmd(r2, r3, r6, r1)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            boolean r0 = com.p077uc.crashsdk.export.LogType.isForNative(r5)
            boolean r1 = com.p077uc.crashsdk.export.LogType.isForANR(r5)
            if (r1 == 0) goto L41
            r1 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 | r1
            goto L41
        L36:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r5
        L39:
            java.lang.String r0 = "crashsdk so has not loaded!"
            java.lang.String r2 = "crashsdk"
            com.p077uc.crashsdk.p078a.C3251a.m13169a(r2, r0, r1)
        L40:
            r0 = 0
        L41:
            boolean r5 = com.p077uc.crashsdk.export.LogType.isForJava(r5)
            if (r5 == 0) goto L50
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            m13144a(r6, r5)
            r0 = r0 | 16
        L50:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p077uc.crashsdk.C3250a.m13131a(int, java.lang.String):int");
    }

    /* renamed from: a */
    public static boolean m13146a(boolean z10) {
        int m13562H;
        if (!C3259b.f13740c) {
            C3251a.m13168a("crashsdk", "Unexp log not enabled, skip update unexp info!");
            return false;
        }
        if (C3262e.m13386F() || C3259b.m13307L()) {
            return false;
        }
        if (z10) {
            C3256f.m13205a(f13617F);
            m13562H = 0;
        } else {
            if (!C3259b.m13297B()) {
                C3251a.m13168a("crashsdk", "Stop update unexp info in background!");
                return false;
            }
            if (C3264g.m13562H() <= 0) {
                return false;
            }
            if (C3256f.m13209b(f13617F)) {
                return true;
            }
            m13562H = C3264g.m13562H() * 1000;
        }
        C3256f.m13207a(0, f13617F, m13562H);
        return true;
    }

    /* renamed from: a */
    public static void m13138a(int i10) {
        if (i10 == 201) {
            C3251a.m13168a("crashsdk", "Begin update info ...");
            long currentTimeMillis = System.currentTimeMillis();
            if (C3259b.f13741d && f13623c) {
                JNIBridge.nativeCmd(11, C3264g.m13562H(), String.valueOf(C3264g.m13563I()), null);
            }
            C3251a.m13168a("crashsdk", "Update info took " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
            m13146a(false);
            return;
        }
        if (i10 != 202) {
            if (!f13624d) {
                throw new AssertionError();
            }
            return;
        }
        m13166p();
        Locale locale = Locale.US;
        String format = String.format(locale, "%s/%s/%s", C3264g.m13575U(), C3264g.m13576V(), C3264g.m13577W());
        f13627g = m13163m();
        if (C3259b.f13741d) {
            JNIBridge.set(128, f13627g);
        }
        boolean z10 = !format.equals(f13627g);
        if (z10) {
            C3252b.m13176a(C3259b.m13355m(), format);
        }
        if (z10 && C3264g.m13617v()) {
            C3251a.m13168a("crashsdk", String.format(locale, "Is new version ('%s' -> '%s'), deleting old stats data!", f13627g, format));
            C3259b.m13364v();
        }
    }
}
