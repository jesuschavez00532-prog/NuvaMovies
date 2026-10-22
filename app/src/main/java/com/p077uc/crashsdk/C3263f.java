package com.p077uc.crashsdk;

import android.util.SparseArray;
import anet.channel.entity.EventType;
import com.p077uc.crashsdk.export.CrashStatKey;
import com.p077uc.crashsdk.p078a.C3251a;
import com.p077uc.crashsdk.p078a.C3256f;
import com.p077uc.crashsdk.p078a.C3257g;
import com.p077uc.crashsdk.p078a.C3258h;
import com.p077uc.crashsdk.p078a.RunnableC3255e;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.uc.crashsdk.f */
/* loaded from: classes3.dex */
public class C3263f {

    /* renamed from: a */
    static final /* synthetic */ boolean f13848a = true;

    /* renamed from: b */
    private static final Object f13849b = new Object();

    /* renamed from: c */
    private static final SparseArray<String> f13850c = new SparseArray<>();

    /* renamed from: d */
    private static final Object f13851d = new Object();

    /* renamed from: e */
    private static boolean f13852e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m13530a(int i10) {
        m13531a(i10, 1);
    }

    /* renamed from: b */
    private static boolean m13543b(int i10, int i11) {
        try {
            C3259b.m13366x();
        } catch (Throwable th) {
            C3257g.m13220a(th);
        }
        try {
            String m13545c = m13545c(i10);
            if (m13545c == null) {
                C3251a.m13169a("crashsdk", "Stat type not exists: " + i10, null);
                return false;
            }
            File file = new File(C3259b.m13340c());
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
            } catch (Throwable th2) {
                C3257g.m13220a(th2);
            }
            StringBuffer m13529a = m13529a(file);
            if (C3257g.m13226a(m13529a)) {
                if (m13529a == null) {
                    m13529a = new StringBuffer();
                }
                m13529a.append("[");
                m13529a.append(C3262e.m13481h());
                m13529a.append("]\n");
            }
            m13533a(m13529a, m13545c, m13526a(m13529a, m13545c) + i11);
            return m13535a(file, m13529a);
        } catch (Throwable th3) {
            C3257g.m13220a(th3);
            return false;
        }
    }

    /* renamed from: c */
    private static boolean m13548c(String str) {
        if (!C3257g.m13225a(str) && new File(str).exists()) {
            return m13537a(str, new RunnableC3255e(755, new Object[]{str}));
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m13550d(String str) {
        if (!f13848a && str == null) {
            throw new AssertionError();
        }
        File file = new File(str);
        StringBuffer m13529a = m13529a(file);
        if (C3257g.m13226a(m13529a)) {
            return false;
        }
        String m13528a = m13528a(m13529a);
        StringBuffer stringBuffer = null;
        if (m13528a != null && m13528a.length() > 0) {
            SparseArray<String> m13552e = m13552e();
            boolean m13570P = C3264g.m13570P();
            if (m13570P) {
                stringBuffer = new StringBuffer();
                stringBuffer.append("notifyStatsDetailImpl: processName: ");
                stringBuffer.append(m13528a + "\n");
            }
            boolean z10 = false;
            for (int i10 = 0; i10 < m13552e.size(); i10++) {
                try {
                    int keyAt = m13552e.keyAt(i10);
                    String str2 = m13552e.get(keyAt);
                    int m13526a = m13526a(m13529a, str2);
                    if (m13526a > 0) {
                        if (m13570P) {
                            stringBuffer.append("name: ");
                            stringBuffer.append(str2);
                            stringBuffer.append(", key: ");
                            stringBuffer.append(keyAt);
                            stringBuffer.append(", count: ");
                            stringBuffer.append(m13526a);
                            stringBuffer.append("\n");
                        }
                        C3261d.m13374a(m13528a, keyAt, m13526a);
                        m13533a(m13529a, str2, 0);
                        z10 = true;
                    }
                } finally {
                    if (z10) {
                        m13535a(file, m13529a);
                    }
                }
            }
            if (m13570P) {
                C3251a.m13167a(stringBuffer.toString());
            }
            if (z10) {
                C3261d.m13374a(m13528a, CrashStatKey.STATS_REPORT_FINISHED, 0);
            }
            return z10;
        }
        C3251a.m13169a("crashsdk", "notifyStatsDetailImpl: process name is invalid", null);
        return false;
    }

    /* renamed from: e */
    private static boolean m13553e(String str) {
        if (!C3257g.m13225a(str) && new File(str).exists()) {
            return m13537a(str, new RunnableC3255e(756, new Object[]{str}));
        }
        return false;
    }

    /* renamed from: f */
    private static void m13554f() {
        SparseArray<String> sparseArray = f13850c;
        synchronized (sparseArray) {
            if (sparseArray.size() != 0) {
                return;
            }
            sparseArray.put(100, "start_pv");
            sparseArray.put(102, "start_hpv");
            sparseArray.put(1, "all_all");
            sparseArray.put(2, "all_fg");
            sparseArray.put(101, "all_bg");
            sparseArray.put(3, "java_fg");
            sparseArray.put(4, "java_bg");
            sparseArray.put(7, "native_fg");
            sparseArray.put(8, "native_bg");
            sparseArray.put(27, "native_anr_fg");
            sparseArray.put(28, "native_anr_bg");
            sparseArray.put(9, "native_ok");
            sparseArray.put(10, "unexp_anr");
            sparseArray.put(29, "unexp_lowmem");
            sparseArray.put(30, "unexp_killed");
            sparseArray.put(31, "unexp_exit");
            sparseArray.put(32, "unexp_restart");
            sparseArray.put(11, "unexp_fg");
            sparseArray.put(12, "unexp_bg");
            sparseArray.put(40, "anr_fg");
            sparseArray.put(41, "anr_bg");
            sparseArray.put(42, "anr_cr_fg");
            sparseArray.put(43, "anr_cr_bg");
            sparseArray.put(13, "log_up_succ");
            sparseArray.put(14, "log_up_fail");
            sparseArray.put(15, "log_empty");
            sparseArray.put(200, "log_tmp");
            sparseArray.put(16, "log_abd_all");
            sparseArray.put(22, "log_abd_builtin");
            sparseArray.put(23, "log_abd_custom");
            sparseArray.put(17, "log_large");
            sparseArray.put(18, "log_up_all");
            sparseArray.put(19, "log_up_bytes");
            sparseArray.put(20, "log_up_crash");
            sparseArray.put(21, "log_up_custom");
            sparseArray.put(24, "log_zipped");
            sparseArray.put(201, "log_enced");
            sparseArray.put(25, "log_renamed");
            sparseArray.put(26, "log_safe_skip");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m13531a(int i10, int i11) {
        if (i11 == 0) {
            C3251a.m13170b("Add stat for type " + i10 + " with count 0!");
            return;
        }
        m13537a(C3259b.m13340c(), new RunnableC3255e(751, new Object[]{Integer.valueOf(i10), Integer.valueOf(i11)}));
    }

    /* renamed from: c */
    private static String m13545c(int i10) {
        String str;
        m13554f();
        SparseArray<String> sparseArray = f13850c;
        synchronized (sparseArray) {
            str = sparseArray.get(i10);
        }
        return str;
    }

    /* renamed from: e */
    private static SparseArray<String> m13552e() {
        SparseArray<String> clone;
        m13554f();
        SparseArray<String> sparseArray = f13850c;
        synchronized (sparseArray) {
            clone = sparseArray.clone();
        }
        return clone;
    }

    /* renamed from: a */
    private static StringBuffer m13529a(File file) {
        FileReader fileReader;
        FileReader fileReader2 = null;
        if (!file.exists()) {
            return null;
        }
        char[] m13551d = m13551d();
        if (m13551d == null) {
            C3251a.m13169a("crashsdk", "readCrashStatData alloc buffer failed!", null);
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            try {
                fileReader = new FileReader(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            int read = fileReader.read(m13551d);
            if (read > 0) {
                fileReader2 = null;
                stringBuffer.append(m13551d, 0, read);
            }
            C3257g.m13218a(fileReader);
        } catch (Exception e11) {
            e = e11;
            fileReader2 = fileReader;
            C3257g.m13220a(e);
            C3257g.m13218a(fileReader2);
            return stringBuffer;
        } catch (Throwable th2) {
            th = th2;
            fileReader2 = fileReader;
            C3257g.m13218a(fileReader2);
            throw th;
        }
        return stringBuffer;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m13547c(boolean z10) {
        if (C3264g.m13572R() && !C3259b.m13307L()) {
            C3262e.m13486j();
            if (!C3258h.m13277e()) {
                C3258h.m13260a(z10);
            }
            if (C3259b.m13301F()) {
                m13549d(z10);
                m13538a(C3259b.m13340c(), z10);
                C3258h.m13268b(z10);
            }
        }
    }

    /* renamed from: a */
    private static String m13528a(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return null;
        }
        int indexOf = stringBuffer.indexOf("[");
        if (indexOf < 0) {
            C3251a.m13169a("crashsdk", "getProcessName: Can not found process name start!", null);
            return null;
        }
        int i10 = indexOf + 1;
        int indexOf2 = stringBuffer.indexOf("]", i10);
        if (indexOf2 < 0) {
            C3251a.m13169a("crashsdk", "getProcessName: Can not found process name end!", null);
            return null;
        }
        String substring = stringBuffer.substring(i10, indexOf2);
        if (substring.length() > 0) {
            return substring;
        }
        C3251a.m13169a("crashsdk", "getProcessName: process name is empty", null);
        return null;
    }

    /* renamed from: b */
    private static boolean m13544b(String str) {
        File file = new File(str);
        StringBuffer m13529a = m13529a(file);
        if (C3257g.m13226a(m13529a)) {
            return false;
        }
        String m13528a = m13528a(m13529a);
        StringBuffer stringBuffer = null;
        if (m13528a != null && m13528a.length() > 0) {
            SparseArray<String> m13552e = m13552e();
            HashMap hashMap = new HashMap();
            boolean m13570P = C3264g.m13570P();
            if (m13570P) {
                stringBuffer = new StringBuffer();
                stringBuffer.append("reportCrashStatImpl: processName: ");
                stringBuffer.append(m13528a + "\n");
            }
            boolean z10 = false;
            for (int i10 = 0; i10 < m13552e.size(); i10++) {
                try {
                    int keyAt = m13552e.keyAt(i10);
                    String str2 = m13552e.get(keyAt);
                    int m13526a = m13526a(m13529a, str2);
                    if (m13526a > 0) {
                        if (m13570P) {
                            stringBuffer.append("name: ");
                            stringBuffer.append(str2);
                            stringBuffer.append(", key: ");
                            stringBuffer.append(keyAt);
                            stringBuffer.append(", count: ");
                            stringBuffer.append(m13526a);
                            stringBuffer.append("\n");
                        }
                        C3258h.m13256a(m13528a, keyAt, m13526a);
                        hashMap.put(str2, Integer.valueOf(m13526a));
                        m13533a(m13529a, str2, 0);
                        z10 = true;
                    }
                } finally {
                    if (z10) {
                        m13535a(file, m13529a);
                        if (hashMap.size() > 0) {
                            m13532a(m13528a, (HashMap<String, Integer>) hashMap, C3259b.m13324a(str));
                        }
                    }
                }
            }
            if (m13570P) {
                C3251a.m13167a(stringBuffer.toString());
            }
            return true;
        }
        C3251a.m13169a("crashsdk", "reportCrashStatImpl: process name is invalid", null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m13546c() {
        C3256f.m13207a(1, new RunnableC3255e(700), 3000L);
    }

    /* renamed from: a */
    private static int m13526a(StringBuffer stringBuffer, String str) {
        int indexOf = stringBuffer.indexOf(str);
        if (indexOf < 0) {
            return 0;
        }
        int indexOf2 = stringBuffer.indexOf(Operator.Operation.EQUALS, indexOf + str.length());
        if (indexOf2 < 0) {
            C3251a.m13170b(str + " line not contain '='!");
            return 0;
        }
        int i10 = indexOf2 + 1;
        int indexOf3 = stringBuffer.indexOf("\n", i10);
        if (indexOf3 < 0) {
            indexOf3 = stringBuffer.length();
        }
        try {
            int parseInt = Integer.parseInt(stringBuffer.substring(i10, indexOf3));
            if (parseInt < 0) {
                return 0;
            }
            return parseInt;
        } catch (NumberFormatException e10) {
            C3257g.m13220a(e10);
            return 0;
        }
    }

    /* renamed from: d */
    private static char[] m13551d() {
        char[] cArr = null;
        int i10 = EventType.AUTH_FAIL;
        while (cArr == null && i10 > 0) {
            try {
                cArr = new char[i10];
            } catch (Throwable unused) {
                i10 /= 2;
                if (i10 < 512) {
                    break;
                }
            }
        }
        return cArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a A[Catch: all -> 0x0056, TryCatch #0 {, blocks: (B:8:0x0008, B:10:0x000c, B:12:0x000e, B:14:0x0016, B:16:0x0018, B:18:0x001f, B:20:0x0029, B:23:0x004a, B:24:0x004d, B:25:0x0054, B:27:0x0030, B:29:0x0036, B:31:0x0041), top: B:7:0x0008 }] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m13549d(boolean r2) {
        /*
            boolean r0 = com.p077uc.crashsdk.C3263f.f13852e
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.Object r0 = com.p077uc.crashsdk.C3263f.f13851d
            monitor-enter(r0)
            boolean r1 = com.p077uc.crashsdk.C3263f.f13852e     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            return
        Le:
            java.lang.String r1 = "crash detail"
            boolean r2 = com.p077uc.crashsdk.p078a.C3258h.m13263a(r2, r1)     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            return
        L18:
            boolean r2 = com.p077uc.crashsdk.C3259b.m13361s()     // Catch: java.lang.Throwable -> L56
            r1 = 1
            if (r2 == 0) goto L30
            r2 = 2
            m13531a(r2, r1)     // Catch: java.lang.Throwable -> L56
            boolean r2 = com.p077uc.crashsdk.C3259b.m13360r()     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L2e
            r2 = 42
            m13531a(r2, r1)     // Catch: java.lang.Throwable -> L56
        L2e:
            r2 = 1
            goto L48
        L30:
            boolean r2 = com.p077uc.crashsdk.C3259b.m13362t()     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L47
            r2 = 101(0x65, float:1.42E-43)
            m13531a(r2, r1)     // Catch: java.lang.Throwable -> L56
            boolean r2 = com.p077uc.crashsdk.C3259b.m13360r()     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L2e
            r2 = 43
            m13531a(r2, r1)     // Catch: java.lang.Throwable -> L56
            goto L2e
        L47:
            r2 = 0
        L48:
            if (r2 == 0) goto L4d
            m13531a(r1, r1)     // Catch: java.lang.Throwable -> L56
        L4d:
            r2 = 100
            m13531a(r2, r1)     // Catch: java.lang.Throwable -> L56
            com.p077uc.crashsdk.C3263f.f13852e = r1     // Catch: java.lang.Throwable -> L56
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            return
        L56:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            goto L5a
        L59:
            throw r2
        L5a:
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p077uc.crashsdk.C3263f.m13549d(boolean):void");
    }

    /* renamed from: a */
    private static void m13533a(StringBuffer stringBuffer, String str, int i10) {
        int indexOf = stringBuffer.indexOf(str);
        if (indexOf < 0) {
            if (i10 > 0) {
                stringBuffer.append(str);
                stringBuffer.append(Operator.Operation.EQUALS);
                stringBuffer.append(i10);
                stringBuffer.append("\n");
                return;
            }
            return;
        }
        int indexOf2 = stringBuffer.indexOf("\n", indexOf);
        if (indexOf2 < 0) {
            indexOf2 = stringBuffer.length();
        }
        stringBuffer.replace(indexOf, indexOf2, str + Operator.Operation.EQUALS + String.valueOf(i10));
    }

    /* renamed from: a */
    private static boolean m13535a(File file, StringBuffer stringBuffer) {
        FileWriter fileWriter;
        FileWriter fileWriter2 = null;
        try {
            try {
                fileWriter = new FileWriter(file);
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            String stringBuffer2 = stringBuffer.toString();
            fileWriter.write(stringBuffer2, 0, stringBuffer2.length());
            C3257g.m13218a(fileWriter);
            return true;
        } catch (Exception e11) {
            e = e11;
            fileWriter2 = fileWriter;
            C3257g.m13220a(e);
            C3257g.m13218a(fileWriter2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileWriter2 = fileWriter;
            C3257g.m13218a(fileWriter2);
            throw th;
        }
    }

    /* renamed from: a */
    private static void m13532a(String str, HashMap<String, Integer> hashMap, String str2) {
        if (hashMap.size() <= 0) {
            return;
        }
        if (C3257g.m13225a(str)) {
            C3251a.m13169a("crashsdk", "cacheReportedStatsForCallback: processName is null", null);
        } else if (C3257g.m13225a(str2)) {
            C3251a.m13169a("crashsdk", "cacheReportedStatsForCallback: callbackCacheFilePathName is null", null);
        } else {
            m13537a(str2, new RunnableC3255e(754, new Object[]{str, hashMap, str2}));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m13527a(boolean z10) {
        if (z10) {
            return m13548c(C3259b.m13345e()) ? 1 : 0;
        }
        File[] m13348f = C3259b.m13348f();
        if (m13348f == null) {
            return 0;
        }
        int i10 = 0;
        for (File file : m13348f) {
            if (m13548c(file.getAbsolutePath())) {
                i10++;
            }
        }
        return i10;
    }

    /* renamed from: b */
    private static void m13542b(String str, HashMap<String, Integer> hashMap, String str2) {
        try {
            C3259b.m13366x();
        } catch (Throwable th) {
            C3257g.m13220a(th);
        }
        try {
            File file = new File(str2);
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
            } catch (Throwable th2) {
                C3257g.m13220a(th2);
            }
            StringBuffer m13529a = m13529a(file);
            if (C3257g.m13226a(m13529a)) {
                if (m13529a == null) {
                    m13529a = new StringBuffer();
                }
                m13529a.append("[");
                m13529a.append(str);
                m13529a.append("]\n");
            }
            boolean z10 = false;
            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                int intValue = entry.getValue().intValue();
                if (intValue > 0) {
                    String key = entry.getKey();
                    m13533a(m13529a, key, intValue + m13526a(m13529a, key));
                    z10 = true;
                }
            }
            if (z10) {
                m13535a(file, m13529a);
            }
        } catch (Throwable th3) {
            C3257g.m13220a(th3);
        }
    }

    /* renamed from: a */
    private static boolean m13537a(String str, RunnableC3255e runnableC3255e) {
        return C3259b.m13329a(f13849b, str, runnableC3255e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m13538a(String str, boolean z10) {
        if (C3258h.m13263a(z10, "crash detail report")) {
            return false;
        }
        return m13537a(str, new RunnableC3255e(752, new Object[]{str}));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m13525a() {
        File[] m13344d = C3259b.m13344d();
        if (m13344d == null) {
            return 0;
        }
        int i10 = 0;
        for (File file : m13344d) {
            if (m13538a(file.getAbsolutePath(), false)) {
                i10++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m13536a(String str) {
        return m13537a(str, new RunnableC3255e(753, new Object[]{str}));
    }

    /* renamed from: a */
    public static boolean m13534a(int i10, Object[] objArr) {
        switch (i10) {
            case 751:
                if (f13848a || objArr != null) {
                    return m13543b(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue());
                }
                throw new AssertionError();
            case 752:
                if (f13848a || objArr != null) {
                    return m13544b((String) objArr[0]);
                }
                throw new AssertionError();
            case 753:
                if (!f13848a && objArr == null) {
                    throw new AssertionError();
                }
                File file = new File((String) objArr[0]);
                if (!file.exists()) {
                    return false;
                }
                file.delete();
                return true;
            case 754:
                if (!f13848a && objArr == null) {
                    throw new AssertionError();
                }
                m13542b((String) objArr[0], (HashMap) objArr[1], (String) objArr[2]);
                return true;
            case 755:
                if (f13848a || objArr != null) {
                    return m13550d((String) objArr[0]);
                }
                throw new AssertionError();
            case 756:
                if (!f13848a && objArr == null) {
                    throw new AssertionError();
                }
                File file2 = new File((String) objArr[0]);
                if (!file2.exists()) {
                    return false;
                }
                file2.delete();
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m13540b(boolean z10) {
        if (z10) {
            return m13553e(C3259b.m13345e()) ? 1 : 0;
        }
        File[] m13348f = C3259b.m13348f();
        if (m13348f == null) {
            return 0;
        }
        int i10 = 0;
        for (File file : m13348f) {
            if (m13553e(file.getAbsolutePath())) {
                i10++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m13539b() {
        File[] m13344d = C3259b.m13344d();
        if (m13344d == null) {
            return 0;
        }
        int i10 = 0;
        for (File file : m13344d) {
            if (m13536a(file.getAbsolutePath())) {
                i10++;
            }
        }
        return i10;
    }

    /* renamed from: b */
    public static void m13541b(int i10) {
        if (i10 != 700) {
            return;
        }
        m13549d(false);
    }
}
