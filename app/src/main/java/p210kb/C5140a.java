package p210kb;

import com.qiniu.android.dns.C3063a;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import p252nb.C5836a;
import p266ob.C5959c;

/* renamed from: kb.a */
/* loaded from: classes2.dex */
public final class C5140a {

    /* renamed from: j */
    private static final String f21088j = "a";

    /* renamed from: a */
    private final InterfaceC5143d[] f21089a;

    /* renamed from: b */
    private final InterfaceC5142c f21090b;

    /* renamed from: c */
    private final C5959c f21091c;

    /* renamed from: d */
    private final C5836a f21092d;

    /* renamed from: e */
    private final InterfaceC5144e f21093e;

    /* renamed from: f */
    private volatile C3063a f21094f;

    /* renamed from: g */
    private volatile int f21095g;

    /* renamed from: h */
    private volatile boolean f21096h;

    /* renamed from: i */
    private ConcurrentHashMap f21097i;

    /* renamed from: kb.a$b */
    /* loaded from: classes2.dex */
    private static class b implements InterfaceC5144e {
        private b() {
        }

        @Override // p210kb.InterfaceC5144e
        /* renamed from: a */
        public String[] mo20804a(String[] strArr) {
            return strArr;
        }
    }

    public C5140a(C3063a c3063a, InterfaceC5143d[] interfaceC5143dArr, InterfaceC5142c interfaceC5142c) {
        this(c3063a, interfaceC5143dArr, interfaceC5142c, null);
    }

    /* renamed from: a */
    private void m20792a() {
        synchronized (this.f21091c) {
            this.f21091c.clear();
        }
    }

    /* renamed from: b */
    private synchronized Object m20793b(String str) {
        Object obj = this.f21097i.get(str);
        if (obj == null) {
            Object obj2 = new Object();
            this.f21097i.put(str, obj2);
            return obj2;
        }
        return obj;
    }

    /* renamed from: c */
    private void m20794c() {
        synchronized (this.f21089a) {
            if (!this.f21096h) {
                try {
                    C5959c load = this.f21090b.load();
                    if (load != null && load.size() != 0) {
                        synchronized (this.f21091c) {
                            this.f21091c.putAll(load);
                        }
                        this.f21096h = true;
                        return;
                    }
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
                this.f21096h = true;
            }
        }
    }

    /* renamed from: g */
    private String[] m20795g(C5141b c5141b) {
        C5145f[] m20796h = m20796h(c5141b);
        if (m20796h != null && m20796h.length != 0) {
            return m20797i(m20796h);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bb, code lost:
    
        throw new java.net.UnknownHostException(r11.f21098a);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049 A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x000a, B:5:0x000c, B:20:0x003d, B:24:0x0041, B:25:0x0044, B:27:0x0049, B:29:0x004d, B:31:0x0067, B:57:0x006a, B:58:0x006c, B:70:0x0085, B:75:0x0057, B:73:0x0062, B:35:0x0088, B:38:0x008c, B:40:0x0093, B:41:0x0095, B:45:0x00a5, B:50:0x00a9, B:51:0x00aa, B:52:0x00b1, B:54:0x00b4, B:55:0x00bb, B:56:0x00bc, B:80:0x00bf, B:60:0x006d, B:62:0x0071, B:64:0x007d, B:65:0x007f, B:66:0x0080, B:43:0x0096, B:44:0x00a4, B:7:0x000d, B:9:0x0018, B:11:0x0024, B:13:0x0027, B:15:0x002f, B:17:0x0032, B:18:0x0035, B:19:0x003c, B:23:0x0040), top: B:3:0x000a, inners: #1, #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0093 A[Catch: all -> 0x00c0, TryCatch #0 {, blocks: (B:4:0x000a, B:5:0x000c, B:20:0x003d, B:24:0x0041, B:25:0x0044, B:27:0x0049, B:29:0x004d, B:31:0x0067, B:57:0x006a, B:58:0x006c, B:70:0x0085, B:75:0x0057, B:73:0x0062, B:35:0x0088, B:38:0x008c, B:40:0x0093, B:41:0x0095, B:45:0x00a5, B:50:0x00a9, B:51:0x00aa, B:52:0x00b1, B:54:0x00b4, B:55:0x00bb, B:56:0x00bc, B:80:0x00bf, B:60:0x006d, B:62:0x0071, B:64:0x007d, B:65:0x007f, B:66:0x0080, B:43:0x0096, B:44:0x00a4, B:7:0x000d, B:9:0x0018, B:11:0x0024, B:13:0x0027, B:15:0x002f, B:17:0x0032, B:18:0x0035, B:19:0x003c, B:23:0x0040), top: B:3:0x000a, inners: #1, #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00aa A[Catch: all -> 0x00c0, TryCatch #0 {, blocks: (B:4:0x000a, B:5:0x000c, B:20:0x003d, B:24:0x0041, B:25:0x0044, B:27:0x0049, B:29:0x004d, B:31:0x0067, B:57:0x006a, B:58:0x006c, B:70:0x0085, B:75:0x0057, B:73:0x0062, B:35:0x0088, B:38:0x008c, B:40:0x0093, B:41:0x0095, B:45:0x00a5, B:50:0x00a9, B:51:0x00aa, B:52:0x00b1, B:54:0x00b4, B:55:0x00bb, B:56:0x00bc, B:80:0x00bf, B:60:0x006d, B:62:0x0071, B:64:0x007d, B:65:0x007f, B:66:0x0080, B:43:0x0096, B:44:0x00a4, B:7:0x000d, B:9:0x0018, B:11:0x0024, B:13:0x0027, B:15:0x002f, B:17:0x0032, B:18:0x0035, B:19:0x003c, B:23:0x0040), top: B:3:0x000a, inners: #1, #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0086 A[EDGE_INSN: B:76:0x0086->B:34:0x0086 BREAK  A[LOOP:0: B:25:0x0044->B:66:0x0080], SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private p210kb.C5145f[] m20796h(p210kb.C5141b r11) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p210kb.C5140a.m20796h(kb.b):kb.f[]");
    }

    /* renamed from: i */
    private static String[] m20797i(C5145f[] c5145fArr) {
        if (c5145fArr == null || c5145fArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(c5145fArr.length);
        for (C5145f c5145f : c5145fArr) {
            arrayList.add(c5145f.f21102a);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: j */
    private static void m20798j(C5145f[] c5145fArr) {
        if (c5145fArr != null && c5145fArr.length > 1) {
            C5145f c5145f = c5145fArr[0];
            System.arraycopy(c5145fArr, 1, c5145fArr, 0, c5145fArr.length - 1);
            c5145fArr[c5145fArr.length - 1] = c5145f;
        }
    }

    /* renamed from: k */
    private static C5145f[] m20799k(C5145f[] c5145fArr) {
        ArrayList arrayList = new ArrayList(c5145fArr.length);
        for (C5145f c5145f : c5145fArr) {
            if (c5145f != null && c5145f.f21103b == 1) {
                arrayList.add(c5145f);
            }
        }
        return (C5145f[]) arrayList.toArray(new C5145f[arrayList.size()]);
    }

    /* renamed from: l */
    public static boolean m20800l(String str) {
        if (str == null || str.length() < 7 || str.length() > 15 || str.contains(Operator.Operation.MINUS)) {
            return false;
        }
        try {
            int indexOf = str.indexOf(46);
            if (indexOf != -1 && Integer.parseInt(str.substring(0, indexOf)) > 255) {
                return false;
            }
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(46, i10);
            if (indexOf2 != -1 && Integer.parseInt(str.substring(i10, indexOf2)) > 255) {
                return false;
            }
            int i11 = indexOf2 + 1;
            int indexOf3 = str.indexOf(46, i11);
            if (indexOf3 != -1 && Integer.parseInt(str.substring(i11, indexOf3)) > 255 && Integer.parseInt(str.substring(indexOf3 + 1, str.length() - 1)) > 255) {
                if (str.charAt(str.length() - 1) != '.') {
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public void m20801d(C3063a c3063a) {
        m20792a();
        if (c3063a == null) {
            c3063a = C3063a.f12569d;
        }
        this.f21094f = c3063a;
        synchronized (this.f21089a) {
            this.f21095g = 0;
        }
    }

    /* renamed from: e */
    public String[] m20802e(String str) {
        return m20803f(new C5141b(str));
    }

    /* renamed from: f */
    public String[] m20803f(C5141b c5141b) {
        if (c5141b != null) {
            String str = c5141b.f21098a;
            if (str != null && str.trim().length() != 0) {
                if (m20800l(c5141b.f21098a)) {
                    return new String[]{c5141b.f21098a};
                }
                String[] m20795g = m20795g(c5141b);
                if (m20795g != null && m20795g.length > 1) {
                    return this.f21093e.mo20804a(m20795g);
                }
                return m20795g;
            }
            throw new IOException("empty domain " + c5141b.f21098a);
        }
        throw new IOException("null domain");
    }

    public C5140a(C3063a c3063a, InterfaceC5143d[] interfaceC5143dArr, InterfaceC5142c interfaceC5142c, InterfaceC5144e interfaceC5144e) {
        this.f21092d = new C5836a();
        this.f21094f = null;
        this.f21095g = 0;
        this.f21096h = false;
        this.f21097i = new ConcurrentHashMap(24);
        this.f21094f = c3063a == null ? C3063a.f12569d : c3063a;
        this.f21089a = (InterfaceC5143d[]) interfaceC5143dArr.clone();
        this.f21090b = interfaceC5142c;
        this.f21091c = new C5959c();
        this.f21093e = interfaceC5144e == null ? new b() : interfaceC5144e;
    }
}
