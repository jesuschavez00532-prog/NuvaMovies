package p201k2;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import be.C1328x;
import com.lzy.okgo.cache.CacheEntity;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p134fc.AbstractC4305b;
import p359ue.AbstractC7166t;

/* renamed from: k2.g */
/* loaded from: classes.dex */
public final class C5090g {

    /* renamed from: u */
    private static volatile boolean f20968u;

    /* renamed from: a */
    public static final C5090g f20948a = new C5090g();

    /* renamed from: b */
    private static final String f20949b = C5090g.class.getSimpleName();

    /* renamed from: c */
    private static final String f20950c = "2b494e53756c774c2f44465245733572";

    /* renamed from: d */
    private static String f20951d = "key_sn_token";

    /* renamed from: e */
    private static String f20952e = "key_device_id";

    /* renamed from: f */
    private static String f20953f = "key_sn_flag";

    /* renamed from: g */
    private static String f20954g = "key_preinstall_flag";

    /* renamed from: h */
    private static String f20955h = "key_user_id";

    /* renamed from: i */
    private static String f20956i = "key_user_identity";

    /* renamed from: j */
    private static String f20957j = "key_renew_flag";

    /* renamed from: k */
    private static String f20958k = "key_u";

    /* renamed from: l */
    private static String f20959l = "key_p";

    /* renamed from: m */
    private static String f20960m = "key_v";

    /* renamed from: n */
    private static String f20961n = "key_t";

    /* renamed from: o */
    private static String f20962o = "key_c";

    /* renamed from: p */
    private static String f20963p = "key_b_t";

    /* renamed from: q */
    private static String f20964q = "key_n_bt";

    /* renamed from: r */
    private static String f20965r = "/sdcard/.properties";

    /* renamed from: s */
    private static List f20966s = new ArrayList();

    /* renamed from: t */
    private static final boolean f20967t = true;

    /* renamed from: v */
    private static final ConcurrentHashMap f20969v = new ConcurrentHashMap();

    /* renamed from: w */
    private static final Object f20970w = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k2.g$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final a f20971a = new a();

        a() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo542f(String str) {
            AbstractC5868k.m23674f(str, "it");
            return new Object();
        }
    }

    private C5090g() {
    }

    /* renamed from: b */
    private final String m20633b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (!f20967t) {
            return str;
        }
        try {
            String m18076a = AbstractC4305b.m18076a(str, f20950c);
            AbstractC5868k.m23673e(m18076a, "decryptThreeDESECB(string, KEY)");
            return m18076a;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: d */
    private final String m20634d(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (!f20967t) {
            return str;
        }
        try {
            String m18077b = AbstractC4305b.m18077b(str, f20950c);
            AbstractC5868k.m23673e(m18077b, "encryptThreeDESECB(string, KEY)");
            return m18077b;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: q */
    private final Object m20635q(String str) {
        Object obj = null;
        Object computeIfAbsent = null;
        if (Build.VERSION.SDK_INT >= 24) {
            ConcurrentHashMap concurrentHashMap = f20969v;
            final a aVar = a.f20971a;
            computeIfAbsent = concurrentHashMap.computeIfAbsent(str, new Function() { // from class: k2.f
                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    Object m20636r = null;
                    m20636r = C5090g.m20636r(InterfaceC5660l.this, obj2);
                    return m20636r;
                }
            });
            AbstractC5868k.m23673e(computeIfAbsent, "{\n            //computeI…}\n            }\n        }");
            return computeIfAbsent;
        }
        synchronized (f20970w) {
            ConcurrentHashMap concurrentHashMap2 = f20969v;
            Object obj2 = concurrentHashMap2.get(str);
            if (obj2 == null) {
                obj2 = new Object();
                concurrentHashMap2.put(str, obj2);
            }
            obj = obj2;
            AbstractC5868k.m23673e(obj, "fileLocks[path] ?: run {…newLock\n                }");
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final Object m20636r(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return interfaceC5660l.mo542f(obj);
    }

    /* renamed from: v */
    private final Properties m20637v(String str) {
        Properties properties = new Properties();
        FileInputStream fileInputStream = null;
        try {
            try {
                if (!new File(str).exists()) {
                    return properties;
                }
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    properties.load(fileInputStream2);
                    try {
                        fileInputStream2.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                    return properties;
                } catch (FileNotFoundException e11) {
                    e = e11;
                    fileInputStream = fileInputStream2;
                    e.printStackTrace();
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                    }
                    return properties;
                } catch (IOException e13) {
                    e = e13;
                    fileInputStream = fileInputStream2;
                    e.printStackTrace();
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e14) {
                            e14.printStackTrace();
                        }
                    }
                    return properties;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e15) {
                            e15.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException e16) {
            e = e16;
        } catch (IOException e17) {
            e = e17;
        }
    }

    /* renamed from: y */
    private final void m20638y(String str, String str2, String str3) {
        FileOutputStream fileOutputStream;
        synchronized (m20635q(str)) {
            C5090g c5090g = f20948a;
            Properties m20637v = c5090g.m20637v(str);
            m20637v.setProperty(str2, c5090g.m20634d(str3));
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    File file = new File(str);
                    File parentFile = file.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    fileOutputStream = new FileOutputStream(str);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (FileNotFoundException e10) {
                e = e10;
            } catch (IOException e11) {
                e = e11;
            }
            try {
                m20637v.store(fileOutputStream, "personal info");
                try {
                    fileOutputStream.close();
                } catch (IOException e12) {
                    e = e12;
                    e.printStackTrace();
                    C1328x c1328x = C1328x.f4998a;
                }
            } catch (FileNotFoundException e13) {
                e = e13;
                fileOutputStream2 = fileOutputStream;
                e.printStackTrace();
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e14) {
                        e = e14;
                        e.printStackTrace();
                        C1328x c1328x2 = C1328x.f4998a;
                    }
                }
                C1328x c1328x22 = C1328x.f4998a;
            } catch (IOException e15) {
                e = e15;
                fileOutputStream2 = fileOutputStream;
                e.printStackTrace();
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e16) {
                        e = e16;
                        e.printStackTrace();
                        C1328x c1328x222 = C1328x.f4998a;
                    }
                }
                C1328x c1328x2222 = C1328x.f4998a;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e17) {
                        e17.printStackTrace();
                    }
                }
                throw th;
            }
            C1328x c1328x22222 = C1328x.f4998a;
        }
    }

    /* renamed from: c */
    public final void m20639c(File file) {
        File[] listFiles;
        if (file != null && file.exists()) {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
                for (File file2 : listFiles) {
                    m20639c(file2);
                }
            }
            file.delete();
        }
    }

    /* renamed from: e */
    public final String m20640e() {
        return f20950c;
    }

    /* renamed from: f */
    public final String m20641f() {
        return f20958k;
    }

    /* renamed from: g */
    public final String m20642g() {
        return f20961n;
    }

    /* renamed from: h */
    public final String m20643h() {
        return f20962o;
    }

    /* renamed from: i */
    public final String m20644i() {
        return f20952e;
    }

    /* renamed from: j */
    public final String m20645j() {
        return f20959l;
    }

    /* renamed from: k */
    public final String m20646k() {
        return f20964q;
    }

    /* renamed from: l */
    public final String m20647l() {
        return f20957j;
    }

    /* renamed from: m */
    public final String m20648m() {
        return f20951d;
    }

    /* renamed from: n */
    public final String m20649n() {
        return f20955h;
    }

    /* renamed from: o */
    public final String m20650o() {
        return f20956i;
    }

    /* renamed from: p */
    public final String m20651p() {
        return f20960m;
    }

    /* renamed from: s */
    public final void m20652s() {
        String m27728o = null;
        boolean m27723j;
        if (!f20968u) {
            String m20595e = AbstractC5085b.m20595e();
            AbstractC5868k.m23673e(m20595e, "getEnglishAppName()");
            m27728o = AbstractC7166t.m27728o(m20595e, " ", "", false, 4, null);
            Locale locale = Locale.US;
            AbstractC5868k.m23673e(locale, "US");
            String lowerCase = m27728o.toLowerCase(locale);
            AbstractC5868k.m23673e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            m27723j = AbstractC7166t.m27723j(lowerCase, "UniTV", true);
            if (!m27723j) {
                f20951d += '_' + lowerCase;
                f20952e += '_' + lowerCase;
                f20953f += '_' + lowerCase;
                f20954g += '_' + lowerCase;
                f20958k += '_' + lowerCase;
                f20959l += '_' + lowerCase;
                f20960m += '_' + lowerCase;
                f20961n += '_' + lowerCase;
                f20962o += '_' + lowerCase;
                f20963p += '_' + lowerCase;
            }
            String path = Environment.getExternalStorageDirectory().getPath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(path);
            String str = File.separator;
            sb2.append(str);
            sb2.append(".properties");
            f20965r = sb2.toString();
            f20966s.add(path + str + "Android" + str + ".config");
            List list = f20966s;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(path);
            sb3.append(str);
            sb3.append(".config");
            list.add(sb3.toString());
            f20966s.add(f20965r);
            f20968u = true;
        }
    }

    /* renamed from: t */
    public final String m20653t(String str) {
        boolean z10 = false;
        boolean z11 = false;
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        Iterator it = f20966s.iterator();
        String str2 = "";
        do {
            z10 = true;
            if (!it.hasNext()) {
                break;
            }
            str2 = m20654u((String) it.next(), str);
            if (str2.length() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
        } while (z11);
        if (str2.length() != 0) {
            z10 = false;
        }
        if (!z10) {
            for (String str3 : f20966s) {
                if (!new File(str3).exists()) {
                    m20638y(str3, str, str2);
                }
            }
        }
        return str2;
    }

    /* renamed from: u */
    public final String m20654u(String str, String str2) {
        AbstractC5868k.m23674f(str, "path");
        AbstractC5868k.m23674f(str2, CacheEntity.KEY);
        Properties properties = new Properties();
        FileInputStream fileInputStream = null;
        try {
            try {
                if (!new File(str).exists()) {
                    return "";
                }
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    properties.load(fileInputStream2);
                    String property = properties.getProperty(str2, "");
                    AbstractC5868k.m23673e(property, "properties.getProperty(key, \"\")");
                    String m20633b = m20633b(property);
                    try {
                        fileInputStream2.close();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    return m20633b;
                } catch (Exception e11) {
                    e = e11;
                    fileInputStream = fileInputStream2;
                    e.printStackTrace();
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                    }
                    return "";
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception e13) {
                            e13.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e14) {
            e = e14;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
    
        if (r4 != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m20655w(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "tag"
            ne.AbstractC5868k.m23674f(r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "/system/etc/.UCERT"
            r1.<init>(r2)
            boolean r2 = r1.isDirectory()
            if (r2 == 0) goto L19
            goto L90
        L19:
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L79 java.lang.Exception -> L7d
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L79 java.lang.Exception -> L7d
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L74
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L74
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            java.lang.String r2 = "metadata"
            boolean r2 = ne.AbstractC5868k.m23669a(r7, r2)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            java.lang.String r5 = "it"
            if (r2 == 0) goto L40
            java.lang.String r7 = r4.readLine()     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            ne.AbstractC5868k.m23673e(r7, r5)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            if (r7 == 0) goto L5b
            r0.append(r7)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            goto L5b
        L40:
            java.lang.String r2 = "signdata"
            boolean r7 = ne.AbstractC5868k.m23669a(r7, r2)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            if (r7 == 0) goto L5b
            java.lang.String r7 = r4.readLine()     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            ne.AbstractC5868k.m23673e(r7, r5)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            java.lang.String r7 = r4.readLine()     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            ne.AbstractC5868k.m23673e(r7, r5)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            if (r7 == 0) goto L5b
            r0.append(r7)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
        L5b:
            r3.close()
            r1.close()
        L61:
            r4.close()
            goto L90
        L65:
            r7 = move-exception
            goto L72
        L67:
            r7 = move-exception
            goto L77
        L69:
            r7 = move-exception
            r4 = r2
            goto L72
        L6c:
            r7 = move-exception
            r4 = r2
            goto L77
        L6f:
            r7 = move-exception
            r1 = r2
            r4 = r1
        L72:
            r2 = r3
            goto L9b
        L74:
            r7 = move-exception
            r1 = r2
            r4 = r1
        L77:
            r2 = r3
            goto L80
        L79:
            r7 = move-exception
            r1 = r2
            r4 = r1
            goto L9b
        L7d:
            r7 = move-exception
            r1 = r2
            r4 = r1
        L80:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L9a
            if (r2 == 0) goto L88
            r2.close()
        L88:
            if (r1 == 0) goto L8d
            r1.close()
        L8d:
            if (r4 == 0) goto L90
            goto L61
        L90:
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "sb.toString()"
            ne.AbstractC5868k.m23673e(r7, r0)
            return r7
        L9a:
            r7 = move-exception
        L9b:
            if (r2 == 0) goto La0
            r2.close()
        La0:
            if (r1 == 0) goto La5
            r1.close()
        La5:
            if (r4 == 0) goto Laa
            r4.close()
        Laa:
            goto Lac
        Lab:
            throw r7
        Lac:
            goto Lab
        */
        throw new UnsupportedOperationException("Method not decompiled: p201k2.C5090g.m20655w(java.lang.String):java.lang.String");
    }

    /* renamed from: x */
    public final void m20656x(String str, String str2) {
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        AbstractC5868k.m23674f(str2, "value");
        Iterator it = f20966s.iterator();
        while (it.hasNext()) {
            m20638y((String) it.next(), str, str2);
        }
    }
}
