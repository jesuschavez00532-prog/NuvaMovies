package com.p077uc.crashsdk.p078a;

import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.SparseArray;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.p077uc.crashsdk.C3250a;
import com.p077uc.crashsdk.C3259b;
import com.p077uc.crashsdk.C3262e;
import com.p077uc.crashsdk.C3264g;
import com.p077uc.crashsdk.JNIBridge;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C3309bd;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.analytics.pro.C3384f;
import com.umeng.ccg.C3417a;
import com.umeng.ccg.C3419c;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.android.agoo.message.MessageService;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* renamed from: com.uc.crashsdk.a.h */
/* loaded from: classes3.dex */
public class C3258h {

    /* renamed from: a */
    static final /* synthetic */ boolean f13683a = true;

    /* renamed from: b */
    private static final Object f13684b = new Object();

    /* renamed from: c */
    private static final Map<String, String> f13685c = new HashMap();

    /* renamed from: d */
    private static int f13686d = 0;

    /* renamed from: e */
    private static final Map<String, a> f13687e = new HashMap();

    /* renamed from: f */
    private static final Object f13688f = new Object();

    /* renamed from: g */
    private static final Object f13689g = new Object();

    /* renamed from: h */
    private static final SparseArray<String> f13690h = new SparseArray<>();

    /* renamed from: i */
    private static boolean f13691i = false;

    /* renamed from: j */
    private static boolean f13692j = false;

    /* renamed from: k */
    private static final Object f13693k = new Object();

    /* renamed from: l */
    private static String f13694l = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.uc.crashsdk.a.h$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        long f13695a = 0;

        /* renamed from: b */
        int f13696b = 0;

        /* renamed from: c */
        Map<String, String> f13697c = new HashMap();

        /* renamed from: d */
        private String f13698d;

        /* renamed from: e */
        private boolean f13699e;

        /* renamed from: f */
        private boolean f13700f;

        a(String str, boolean z10, boolean z11) {
            this.f13699e = false;
            this.f13700f = false;
            this.f13698d = str;
            this.f13699e = z10;
            this.f13700f = z11;
        }

        /* renamed from: d */
        private long m13288d(String str) {
            return C3257g.m13231c(m13289a(str));
        }

        /* renamed from: a */
        final void m13292a(String str, String str2) {
            this.f13697c.put(str, str2);
        }

        /* renamed from: b */
        final String m13294b(String str) {
            String m13289a = m13289a(str);
            if (m13289a == null) {
                return "";
            }
            return m13289a;
        }

        /* renamed from: c */
        final boolean m13295c(String str) {
            if (C3257g.m13225a(str)) {
                return false;
            }
            HashMap hashMap = new HashMap();
            Map m13272c = C3258h.m13272c(str);
            String str2 = null;
            long j10 = 0;
            int i10 = 0;
            for (String str3 : m13272c.keySet()) {
                String str4 = (String) m13272c.get(str3);
                if (str3.equals("lt")) {
                    str2 = str4;
                } else if (this.f13699e && str3.equals(C3384f.f14557R)) {
                    j10 = C3257g.m13231c(str4);
                } else if (this.f13699e && str3.equals("pid")) {
                    i10 = (int) C3257g.m13231c(str4);
                } else {
                    hashMap.put(str3, str4);
                }
            }
            String str5 = this.f13698d;
            if (str5 != null && !str5.equals(str2)) {
                return false;
            }
            this.f13695a = j10;
            this.f13696b = i10;
            this.f13698d = str2;
            this.f13697c = hashMap;
            return true;
        }

        /* renamed from: a */
        final void m13291a(String str, long j10) {
            long m13288d = m13288d(str) + j10;
            if (m13288d <= 100) {
                j10 = 0;
                if (m13288d >= 0) {
                    j10 = m13288d;
                }
            }
            m13292a(str, String.valueOf(j10));
        }

        /* renamed from: a */
        final boolean m13293a(a aVar) {
            if (!this.f13700f) {
                C3251a.m13169a("crashsdk", String.format(Locale.US, "WaItem '%s' is not mergable!", this.f13698d), null);
                return false;
            }
            for (String str : aVar.f13697c.keySet()) {
                if (str.startsWith("c_")) {
                    m13292a(str, aVar.m13289a(str));
                } else {
                    long m13288d = aVar.m13288d(str);
                    if (m13288d == 0) {
                        m13292a(str, aVar.m13289a(str));
                    } else if (m13288d < 100) {
                        m13291a(str, m13288d);
                    }
                }
            }
            return true;
        }

        /* renamed from: a */
        final String m13289a(String str) {
            return this.f13697c.get(str);
        }

        /* renamed from: a */
        final String m13290a(boolean z10, boolean z11, boolean z12) {
            if (this.f13698d == null) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            if (z10) {
                C3258h.m13267b(sb2, "lt", "uc");
                C3258h.m13267b(sb2, "pre", C3264g.m13600e());
                C3258h.m13267b(sb2, "pkg", C3250a.f13621a);
                C3258h.m13267b(sb2, "rom", Build.VERSION.RELEASE);
                C3258h.m13267b(sb2, "brd", Build.BRAND);
                C3258h.m13267b(sb2, Constants.KEY_MODEL, Build.MODEL);
                C3258h.m13257a(sb2, C3417a.f14999u, Build.VERSION.SDK_INT);
                C3258h.m13267b(sb2, C3325bt.f14281w, C3262e.m13467e());
                C3258h.m13267b(sb2, "hdw", C3262e.m13472f());
                long m13284l = C3258h.m13284l();
                C3258h.m13257a(sb2, "ram", m13284l);
                C3258h.m13267b(sb2, "aram", C3258h.m13246a(m13284l));
                C3258h.m13267b(sb2, "cver", "3.3.2.2");
                C3258h.m13267b(sb2, "cseq", "240515102041");
                C3258h.m13267b(sb2, "ctag", "umeng");
                C3258h.m13267b(sb2, "aver", C3250a.m13135a());
                C3258h.m13267b(sb2, "ver", C3264g.m13575U());
                C3258h.m13267b(sb2, "sver", C3264g.m13576V());
                C3258h.m13267b(sb2, "seq", C3264g.m13577W());
                C3258h.m13267b(sb2, "grd", C3259b.m13296A() ? "fg" : "bg");
                C3258h.m13267b(sb2, "os", DispatchConstants.ANDROID);
                C3258h.m13267b(sb2, "dn", C3262e.m13499q());
                String m13591ac = C3264g.m13591ac();
                if (TextUtils.isEmpty(m13591ac)) {
                    m13591ac = C3262e.m13499q();
                }
                C3258h.m13267b(sb2, "k_uid", m13591ac);
                String m13592ad = C3264g.m13592ad();
                if (!TextUtils.isEmpty(m13592ad)) {
                    C3258h.m13267b(sb2, "k_channel", m13592ad);
                }
                sb2.append("\n");
            }
            C3258h.m13267b(sb2, "lt", this.f13698d);
            C3258h.m13259a(sb2, this.f13697c);
            if (this.f13699e && !z11) {
                long j10 = this.f13695a;
                if (j10 != 0) {
                    C3258h.m13267b(sb2, C3384f.f14557R, String.valueOf(j10));
                }
                if (z12) {
                    C3258h.m13267b(sb2, "pid", String.format(Locale.US, "%d", Integer.valueOf(Process.myPid())));
                } else {
                    int i10 = this.f13696b;
                    if (i10 != 0) {
                        C3258h.m13267b(sb2, "pid", String.format(Locale.US, "%d", Integer.valueOf(i10)));
                    }
                }
            }
            sb2.append("\n");
            return sb2.toString();
        }
    }

    /* renamed from: a */
    static /* synthetic */ String m13246a(long j10) {
        if (j10 < 524288) {
            return "512M";
        }
        return String.format(Locale.US, "%dG", Long.valueOf(((j10 / IjkMediaMeta.AV_CH_SIDE_RIGHT) + 512) / IjkMediaMeta.AV_CH_SIDE_RIGHT));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m13267b(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(Operator.Operation.EQUALS);
        sb2.append(str2);
        sb2.append("`");
    }

    /* renamed from: c */
    static /* synthetic */ Map m13272c(String str) {
        HashMap hashMap = new HashMap();
        for (String str2 : str.split("`")) {
            if (str2.length() > 1) {
                String[] split = str2.split(Operator.Operation.EQUALS, 3);
                if (split.length == 2) {
                    hashMap.put(split[0], split[1]);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: d */
    public static void m13275d() {
        m13265b(2, 2000L);
        m13250a(1, 70000L);
    }

    /* renamed from: e */
    public static boolean m13277e() {
        return f13692j;
    }

    /* renamed from: f */
    public static void m13278f() {
        m13265b(1, 2000L);
    }

    /* renamed from: g */
    public static void m13279g() {
        m13265b(3, 0L);
    }

    /* renamed from: h */
    public static void m13280h() {
        m13265b(4, 0L);
    }

    /* renamed from: i */
    public static void m13281i() {
        if (!C3264g.m13572R()) {
            return;
        }
        C3256f.m13206a(1, new RunnableC3255e(303));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static byte[] m13282j() {
        return new byte[]{Byte.MAX_VALUE, 100, 110, 31};
    }

    /* renamed from: k */
    public static void m13283k() {
        synchronized (f13693k) {
            f13694l = null;
        }
    }

    /* renamed from: l */
    static /* synthetic */ long m13284l() {
        return m13287o();
    }

    /* renamed from: m */
    private static String m13285m() {
        return C3264g.m13578X() + "pv.wa";
    }

    /* renamed from: n */
    private static String m13286n() {
        return C3264g.m13578X() + "cdt.wa";
    }

    /* renamed from: o */
    private static long m13287o() {
        Iterator<String> it = C3257g.m13215a(new File("/proc/meminfo"), 2).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (next.contains("MemTotal:")) {
                try {
                    return Long.parseLong(next.replaceAll("\\D+", ""));
                } catch (NumberFormatException e10) {
                    C3257g.m13220a(e10);
                }
            }
        }
        return 0L;
    }

    /* renamed from: a */
    static /* synthetic */ void m13257a(StringBuilder sb2, String str, long j10) {
        m13267b(sb2, str, String.valueOf(j10));
    }

    /* renamed from: b */
    public static void m13264b() {
        m13250a(2, 0L);
    }

    /* renamed from: c */
    public static void m13273c() {
        m13250a(3, 0L);
    }

    /* renamed from: b */
    private static void m13265b(int i10, long j10) {
        if (C3264g.m13572R()) {
            C3256f.m13207a(1, new RunnableC3255e(C3419c.f15026o, new Object[]{Integer.valueOf(i10)}), j10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m13274c(java.lang.String r9, java.lang.String r10) {
        /*
            boolean r0 = com.p077uc.crashsdk.p078a.C3257g.m13225a(r10)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            byte[] r10 = r10.getBytes()
            r0 = 16
            r2 = 8
            r3 = 0
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L3b
            byte[] r4 = com.p077uc.crashsdk.p078a.C3253c.m13182a()     // Catch: java.lang.Throwable -> L3b
            com.p077uc.crashsdk.p078a.C3253c.m13179a(r0, r3, r4)     // Catch: java.lang.Throwable -> L3b
            byte[] r4 = m13282j()     // Catch: java.lang.Throwable -> L3b
            r5 = 4
            com.p077uc.crashsdk.p078a.C3253c.m13179a(r0, r5, r4)     // Catch: java.lang.Throwable -> L3b
            byte[] r4 = com.p077uc.crashsdk.C3250a.m13156f()     // Catch: java.lang.Throwable -> L3b
            com.p077uc.crashsdk.p078a.C3253c.m13179a(r0, r2, r4)     // Catch: java.lang.Throwable -> L3b
            byte[] r4 = com.p077uc.crashsdk.p078a.C3254d.m13197d()     // Catch: java.lang.Throwable -> L3b
            r5 = 12
            com.p077uc.crashsdk.p078a.C3253c.m13179a(r0, r5, r4)     // Catch: java.lang.Throwable -> L3b
            byte[] r0 = com.p077uc.crashsdk.p078a.C3253c.m13186a(r10, r0)     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L3f
            r10 = r0
            r0 = 1
            goto L40
        L3b:
            r0 = move-exception
            com.p077uc.crashsdk.p078a.C3257g.m13220a(r0)
        L3f:
            r0 = 0
        L40:
            if (r9 != 0) goto L44
            java.lang.String r9 = "unknown"
        L44:
            boolean r4 = com.p077uc.crashsdk.C3264g.m13573S()
            if (r4 == 0) goto L4d
            java.lang.String r4 = "4ea4e41a3993"
            goto L4f
        L4d:
            java.lang.String r4 = "28ef1713347d"
        L4f:
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r9)
            r6.append(r5)
            java.lang.String r7 = "AppChk#2014"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = com.p077uc.crashsdk.p078a.C3257g.m13236d(r6)
            if (r6 != 0) goto L76
            r9 = 0
            goto Lba
        L76:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = com.p077uc.crashsdk.C3264g.m13555A()
            r7.append(r8)
            java.lang.String r8 = "?chk="
            r7.append(r8)
            int r8 = r6.length()
            int r8 = r8 - r2
            int r2 = r6.length()
            java.lang.String r2 = r6.substring(r8, r2)
            r7.append(r2)
            java.lang.String r2 = "&vno="
            r7.append(r2)
            r7.append(r5)
            java.lang.String r2 = "&uuid="
            r7.append(r2)
            r7.append(r9)
            java.lang.String r9 = "&app="
            r7.append(r9)
            r7.append(r4)
            if (r0 == 0) goto Lb6
            java.lang.String r9 = "&enc=aes"
            r7.append(r9)
        Lb6:
            java.lang.String r9 = r7.toString()
        Lba:
            if (r9 != 0) goto Lbd
            return r3
        Lbd:
            byte[] r9 = com.p077uc.crashsdk.p078a.C3253c.m13184a(r9, r10)
            if (r9 != 0) goto Lc4
            return r3
        Lc4:
            java.lang.String r10 = new java.lang.String
            r10.<init>(r9)
            java.lang.String r9 = "retcode=0"
            boolean r9 = r10.contains(r9)
            if (r9 == 0) goto Ld2
            return r1
        Ld2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p077uc.crashsdk.p078a.C3258h.m13274c(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: d */
    private static boolean m13276d(String str) {
        boolean m13274c;
        File file = new File(str);
        Iterator<a> it = m13248a(file, "cst", 30).iterator();
        while (it.hasNext()) {
            a next = it.next();
            String m13289a = next.m13289a("prc");
            if (!C3257g.m13225a(m13289a)) {
                Map<String, a> map = f13687e;
                a aVar = map.get(m13289a);
                if (aVar != null) {
                    aVar.m13293a(next);
                } else {
                    map.put(m13289a, next);
                }
            }
        }
        Map<String, a> map2 = f13687e;
        StringBuilder m13247a = m13247a((Iterable<a>) map2.values(), true, false);
        if (C3264g.m13590ab()) {
            m13274c = m13270b(C3262e.m13499q(), m13247a.toString());
        } else {
            m13274c = m13274c(C3262e.m13499q(), m13247a.toString());
        }
        C3257g.m13228b(file);
        if (m13274c || C3257g.m13223a(file, m13247a((Iterable<a>) map2.values(), false, true).toString())) {
            map2.clear();
        }
        return true;
    }

    /* renamed from: a */
    static /* synthetic */ void m13259a(StringBuilder sb2, Map map) {
        for (String str : map.keySet()) {
            m13267b(sb2, str, (String) map.get(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m13255a(String str) {
        synchronized (f13684b) {
            File file = new File(m13285m());
            a aVar = new a(C3384f.f14559T, true, true);
            String m13233c = C3257g.m13233c(file);
            if (!C3257g.m13225a(m13233c)) {
                aVar.m13295c(m13233c);
            }
            aVar.m13291a(str, 1L);
            aVar.m13291a("aujv", 1L);
            C3257g.m13223a(file, aVar.m13290a(false, false, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m13269b(int i10, Object[] objArr) {
        switch (i10) {
            case 351:
                if (!f13683a && objArr == null) {
                    throw new AssertionError();
                }
                String str = (String) objArr[0];
                int intValue = ((Integer) objArr[1]).intValue();
                if (intValue == 1) {
                    if (f13692j) {
                        return false;
                    }
                    f13692j = true;
                }
                if (!C3264g.m13589aa()) {
                    return false;
                }
                File file = new File(str);
                ArrayList<a> m13248a = m13248a(file, "crp", 100);
                if (intValue != 4) {
                    a aVar = new a("crp", false, false);
                    if (intValue == 1) {
                        aVar.m13292a("et", String.valueOf(C3259b.m13304I()));
                        aVar.m13292a("ete", String.valueOf(C3259b.m13305J()));
                    } else if (intValue == 3) {
                        aVar.m13292a("et", "1");
                        aVar.m13292a("ete", "1");
                    } else if (intValue == 2) {
                        aVar.m13292a("hpv", "1");
                    }
                    aVar.m13292a("prc", C3262e.m13481h());
                    aVar.m13292a(C3309bd.f14096c, C3259b.m13301F() ? "1" : MessageService.MSG_DB_READY_REPORT);
                    m13254a(aVar);
                    m13248a.add(0, aVar);
                }
                if (!m13248a.isEmpty()) {
                    boolean m13274c = m13274c(C3262e.m13499q(), m13247a((Iterable<a>) m13248a, true, false).toString());
                    C3257g.m13228b(file);
                    if (!m13274c) {
                        C3257g.m13223a(file, m13247a((Iterable<a>) m13248a, false, true).toString());
                    }
                }
                return true;
            case 352:
                if (f13683a || objArr != null) {
                    return m13276d((String) objArr[0]);
                }
                throw new AssertionError();
            case 353:
                if (f13683a || objArr != null) {
                    return m13271b((String) objArr[0], (String) objArr[1], ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue());
                }
                throw new AssertionError();
            case 354:
                if (!f13683a && objArr == null) {
                    throw new AssertionError();
                }
                File file2 = new File((String) objArr[0]);
                boolean m13274c2 = m13274c(C3262e.m13499q(), m13247a((Iterable<a>) m13248a(file2, "cst", 30), true, false).toString());
                if (m13274c2) {
                    C3257g.m13228b(file2);
                }
                return m13274c2;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public static void m13249a() {
        m13250a(0, C3259b.m13303H() ? 700000L : 70000L);
    }

    /* renamed from: a */
    private static void m13250a(int i10, long j10) {
        if (C3259b.m13301F()) {
            C3256f.m13207a(0, new RunnableC3255e(302, new Object[]{Integer.valueOf(i10)}), j10);
        }
    }

    /* renamed from: a */
    public static boolean m13261a(String str, String str2) {
        try {
            String str3 = "c_" + str.replaceAll("[^0-9a-zA-Z-_]", Operator.Operation.MINUS);
            String replaceAll = C3257g.m13225a(str2) ? "" : str2.replaceAll("[`=]", Operator.Operation.MINUS);
            Map<String, String> map = f13685c;
            synchronized (map) {
                if (map.get(str3) == null) {
                    int i10 = f13686d;
                    if (i10 >= 20) {
                        return false;
                    }
                    f13686d = i10 + 1;
                }
                map.put(str3, replaceAll);
                return true;
            }
        } catch (Throwable th) {
            C3257g.m13220a(th);
            return false;
        }
    }

    /* renamed from: b */
    public static void m13268b(boolean z10) {
        if (m13263a(z10, "crash detail upload")) {
            return;
        }
        String str = C3264g.m13578X() + "dt.wa";
        C3259b.m13329a(f13688f, str, new RunnableC3255e(352, new Object[]{str}));
        String m13286n = m13286n();
        C3259b.m13329a(f13689g, m13286n, new RunnableC3255e(354, new Object[]{m13286n}));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0090  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m13270b(java.lang.String r8, java.lang.String r9) {
        /*
            boolean r0 = com.p077uc.crashsdk.p078a.C3257g.m13225a(r9)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            byte[] r9 = r9.getBytes()
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = com.p077uc.crashsdk.C3264g.m13600e()
            r0.append(r4)
            r0.append(r8)
            r0.append(r2)
            java.lang.String r4 = "AppChk#2014"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = com.p077uc.crashsdk.p078a.C3257g.m13236d(r0)
            r4 = 0
            int r5 = r0.length()     // Catch: java.lang.Throwable -> L4b
            int r5 = r5 + (-16)
            int r6 = r0.length()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r5 = r0.substring(r5, r6)     // Catch: java.lang.Throwable -> L4b
            byte[] r5 = r5.getBytes()     // Catch: java.lang.Throwable -> L4b
            byte[] r5 = com.p077uc.crashsdk.p078a.C3253c.m13186a(r9, r5)     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L4f
            r9 = r5
            r5 = 1
            goto L50
        L4b:
            r5 = move-exception
            com.p077uc.crashsdk.p078a.C3257g.m13220a(r5)
        L4f:
            r5 = 0
        L50:
            int r6 = r0.length()
            int r6 = r6 + (-8)
            int r7 = r0.length()
            java.lang.String r0 = r0.substring(r6, r7)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = com.p077uc.crashsdk.C3264g.m13555A()
            r6.append(r7)
            java.lang.String r7 = "/api/v1/crashtrack/upload?chk="
            r6.append(r7)
            r6.append(r0)
            java.lang.String r0 = "&vno="
            r6.append(r0)
            r6.append(r2)
            java.lang.String r0 = "&uuid="
            r6.append(r0)
            r6.append(r8)
            java.lang.String r8 = "&app="
            r6.append(r8)
            java.lang.String r8 = com.p077uc.crashsdk.C3264g.m13600e()
            r6.append(r8)
            if (r5 == 0) goto L95
            java.lang.String r8 = "&enc=aes"
            r6.append(r8)
        L95:
            java.lang.String r8 = r6.toString()
            if (r8 != 0) goto L9c
            return r4
        L9c:
            byte[] r8 = com.p077uc.crashsdk.p078a.C3253c.m13184a(r8, r9)
            if (r8 != 0) goto La3
            return r4
        La3:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r8)
            java.lang.String r8 = "retcode=0"
            boolean r8 = r9.contains(r8)
            if (r8 == 0) goto Lb1
            return r1
        Lb1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p077uc.crashsdk.p078a.C3258h.m13270b(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: a */
    private static void m13254a(a aVar) {
        Map<String, String> map = f13685c;
        synchronized (map) {
            for (String str : map.keySet()) {
                aVar.m13292a(str, f13685c.get(str));
            }
        }
    }

    /* renamed from: a */
    public static void m13260a(boolean z10) {
        m13252a(1, z10);
    }

    /* renamed from: a */
    public static boolean m13263a(boolean z10, String str) {
        if (!C3259b.f13741d || z10 || !JNIBridge.nativeIsCrashing()) {
            return false;
        }
        C3251a.m13171b("crashsdk", "Native is crashing, skip stat for " + str);
        return true;
    }

    /* renamed from: b */
    private static boolean m13271b(String str, String str2, boolean z10, boolean z11) {
        a aVar;
        File file = new File(m13286n());
        ArrayList<a> m13248a = m13248a(file, "cst", 30);
        String str3 = str + str2;
        Iterator<a> it = m13248a.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = it.next();
            if (str3.equals(aVar.m13294b("prc") + aVar.m13294b("typ"))) {
                break;
            }
        }
        if (aVar == null) {
            aVar = new a("cst", false, true);
            aVar.m13292a("prc", str);
            aVar.m13292a("typ", str2);
            m13254a(aVar);
            m13248a.add(aVar);
        }
        aVar.m13291a("cnt", 1L);
        if (z10) {
            aVar.m13291a("lim", 1L);
        }
        if (z11) {
            aVar.m13291a("syu", 1L);
        }
        return C3257g.m13223a(file, m13247a((Iterable<a>) m13248a, false, false).toString());
    }

    /* renamed from: a */
    private static void m13252a(int i10, boolean z10) {
        if (m13263a(z10, "crash rate")) {
            return;
        }
        String str = C3264g.m13578X() + "cr.wa";
        C3259b.m13329a(f13684b, str, new RunnableC3255e(351, new Object[]{str, Integer.valueOf(i10)}));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006a, code lost:
    
        if (r3 == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af A[Catch: all -> 0x00cb, TryCatch #0 {, blocks: (B:19:0x001d, B:21:0x0028, B:23:0x002c, B:24:0x00c9, B:27:0x002e, B:29:0x0038, B:31:0x0040, B:33:0x005a, B:35:0x005f, B:42:0x0070, B:43:0x0077, B:44:0x008b, B:46:0x0097, B:50:0x00af, B:51:0x00c2, B:52:0x00a5, B:57:0x0083), top: B:18:0x001d }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m13253a(int r9, java.lang.Object[] r10) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p077uc.crashsdk.p078a.C3258h.m13253a(int, java.lang.Object[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m13266b(String str) {
        synchronized (f13693k) {
            f13694l = str;
            C3252b.m13176a(C3259b.m13353k(), str + "\n");
        }
    }

    /* renamed from: a */
    private static StringBuilder m13247a(Iterable<a> iterable, boolean z10, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        boolean z12 = true;
        for (a aVar : iterable) {
            if (z12) {
                sb2.append(aVar.m13290a(z10, z10, z11));
                z12 = false;
            } else {
                sb2.append(aVar.m13290a(false, z10, z11));
            }
        }
        return sb2;
    }

    /* renamed from: a */
    public static void m13256a(String str, int i10, int i11) {
        if (C3264g.m13572R()) {
            synchronized (f13688f) {
                Map<String, a> map = f13687e;
                a aVar = map.get(str);
                if (aVar == null) {
                    aVar = new a("cst", false, true);
                    map.put(str, aVar);
                    m13254a(aVar);
                }
                SparseArray<String> sparseArray = f13690h;
                synchronized (sparseArray) {
                    if (sparseArray.size() == 0) {
                        m13251a(100, C3384f.f14559T);
                        m13251a(102, "hpv");
                        m13251a(1, "all");
                        m13251a(2, "afg");
                        m13251a(101, "abg");
                        m13251a(3, "jfg");
                        m13251a(4, "jbg");
                        m13251a(7, "nfg");
                        m13251a(8, "nbg");
                        m13251a(27, "nafg");
                        m13251a(28, "nabg");
                        m13251a(9, "nho");
                        m13251a(10, "uar");
                        m13251a(29, "ulm");
                        m13251a(30, "ukt");
                        m13251a(31, "uet");
                        m13251a(32, "urs");
                        m13251a(11, "ufg");
                        m13251a(12, "ubg");
                        m13251a(40, "anf");
                        m13251a(41, "anb");
                        m13251a(42, "ancf");
                        m13251a(43, "ancb");
                        m13251a(13, "lup");
                        m13251a(14, "luf");
                        m13251a(15, "lef");
                        m13251a(200, "ltf");
                        m13251a(16, "laf");
                        m13251a(22, "lac");
                        m13251a(23, "lau");
                        m13251a(17, "llf");
                        m13251a(18, "lul");
                        m13251a(19, "lub");
                        m13251a(20, "luc");
                        m13251a(21, "luu");
                        m13251a(24, "lzc");
                        m13251a(201, "lec");
                        m13251a(25, "lrc");
                        m13251a(26, "lss");
                    }
                }
                String str2 = sparseArray.get(i10);
                if (str2 == null) {
                    C3251a.m13169a("crashsdk", "map key is not set with: " + i10, null);
                }
                aVar.m13292a("prc", str);
                if (str2 != null) {
                    aVar.m13292a(str2, String.valueOf(i11));
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m13262a(String str, String str2, boolean z10, boolean z11) {
        if (!C3264g.m13572R()) {
            return false;
        }
        return C3259b.m13329a(f13689g, m13286n(), new RunnableC3255e(353, new Object[]{str, str2, Boolean.valueOf(z10), Boolean.valueOf(z11)}));
    }

    /* renamed from: a */
    private static void m13251a(int i10, String str) {
        f13690h.put(i10, str);
    }

    /* renamed from: a */
    private static ArrayList<a> m13248a(File file, String str, int i10) {
        ArrayList<String> m13215a = C3257g.m13215a(file, i10);
        ArrayList<a> arrayList = new ArrayList<>();
        Iterator<String> it = m13215a.iterator();
        while (it.hasNext()) {
            String next = it.next();
            a aVar = new a(str, false, false);
            if (aVar.m13295c(next)) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }
}
