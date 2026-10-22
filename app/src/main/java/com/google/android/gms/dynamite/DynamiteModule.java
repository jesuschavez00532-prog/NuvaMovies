package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;
import p172i4.C4870j;
import p219l4.AbstractC5388m;
import p219l4.AbstractC5391n;
import p281p4.AbstractC6202f;
import p325s4.BinderC6676b;
import p325s4.InterfaceC6675a;
import p336t4.AbstractC6907b;
import p336t4.AbstractC6909d;

/* loaded from: classes.dex */
public final class DynamiteModule {

    /* renamed from: h */
    private static Boolean f7632h = null;

    /* renamed from: i */
    private static String f7633i = null;

    /* renamed from: j */
    private static boolean f7634j = false;

    /* renamed from: k */
    private static int f7635k = -1;

    /* renamed from: l */
    private static Boolean f7636l;

    /* renamed from: q */
    private static C1830m f7641q;

    /* renamed from: r */
    private static C1831n f7642r;

    /* renamed from: a */
    private final Context f7643a;

    /* renamed from: m */
    private static final ThreadLocal f7637m = new ThreadLocal();

    /* renamed from: n */
    private static final ThreadLocal f7638n = new C1819b();

    /* renamed from: o */
    private static final InterfaceC1817b.a f7639o = new C1820c();

    /* renamed from: b */
    public static final InterfaceC1817b f7626b = new C1821d();

    /* renamed from: c */
    public static final InterfaceC1817b f7627c = new C1822e();

    /* renamed from: d */
    public static final InterfaceC1817b f7628d = new C1823f();

    /* renamed from: e */
    public static final InterfaceC1817b f7629e = new C1824g();

    /* renamed from: f */
    public static final InterfaceC1817b f7630f = new C1825h();

    /* renamed from: g */
    public static final InterfaceC1817b f7631g = new C1826i();

    /* renamed from: p */
    public static final InterfaceC1817b f7640p = new C1827j();

    @DynamiteApi
    /* loaded from: classes.dex */
    public static class DynamiteLoaderClassLoader {

        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    /* loaded from: classes.dex */
    public static class C1816a extends Exception {
        /* synthetic */ C1816a(String str, AbstractC6909d abstractC6909d) {
            super(str);
        }

        /* synthetic */ C1816a(String str, Throwable th, AbstractC6909d abstractC6909d) {
            super(str, th);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1817b {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$a */
        /* loaded from: classes.dex */
        public interface a {
            /* renamed from: a */
            int mo8068a(Context context, String str, boolean z10);

            /* renamed from: b */
            int mo8069b(Context context, String str);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b */
        /* loaded from: classes.dex */
        public static class b {

            /* renamed from: a */
            public int f7644a = 0;

            /* renamed from: b */
            public int f7645b = 0;

            /* renamed from: c */
            public int f7646c = 0;
        }

        /* renamed from: a */
        b mo8067a(Context context, String str, a aVar);
    }

    private DynamiteModule(Context context) {
        AbstractC5391n.m21783i(context);
        this.f7643a = context;
    }

    /* renamed from: a */
    public static int m8056a(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!AbstractC5388m.m21771a(declaredField.get(null), str)) {
                Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    /* renamed from: b */
    public static int m8057b(Context context, String str) {
        return m8059e(context, str, false);
    }

    /* renamed from: d */
    public static DynamiteModule m8058d(Context context, InterfaceC1817b interfaceC1817b, String str) {
        long j10;
        Boolean bool;
        InterfaceC6675a m8073P;
        DynamiteModule dynamiteModule;
        C1831n c1831n;
        boolean z10;
        Boolean valueOf;
        InterfaceC6675a m8077M;
        ThreadLocal threadLocal = f7637m;
        C1828k c1828k = (C1828k) threadLocal.get();
        C1828k c1828k2 = new C1828k(null);
        threadLocal.set(c1828k2);
        ThreadLocal threadLocal2 = f7638n;
        long longValue = ((Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            InterfaceC1817b.b mo8067a = interfaceC1817b.mo8067a(context, str, f7639o);
            Log.i("DynamiteModule", "Considering local module " + str + ":" + mo8067a.f7644a + " and remote module " + str + ":" + mo8067a.f7645b);
            int i10 = mo8067a.f7646c;
            try {
                if (i10 != 0) {
                    if (i10 == -1) {
                        if (mo8067a.f7644a != 0) {
                            i10 = -1;
                        }
                    }
                    if (i10 != 1 || mo8067a.f7645b != 0) {
                        if (i10 == -1) {
                            DynamiteModule m8061g = m8061g(context, str);
                            if (longValue == 0) {
                                threadLocal2.remove();
                            } else {
                                threadLocal2.set(Long.valueOf(longValue));
                            }
                            Cursor cursor = c1828k2.f7647a;
                            if (cursor != null) {
                                cursor.close();
                            }
                            threadLocal.set(c1828k);
                            return m8061g;
                        }
                        if (i10 == 1) {
                            try {
                                int i11 = mo8067a.f7645b;
                                try {
                                    synchronized (DynamiteModule.class) {
                                        if (m8064j(context)) {
                                            bool = f7632h;
                                        } else {
                                            throw new C1816a("Remote loading disabled", null);
                                        }
                                    }
                                    if (bool != null) {
                                        if (bool.booleanValue()) {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i11);
                                            synchronized (DynamiteModule.class) {
                                                c1831n = f7642r;
                                            }
                                            if (c1831n != null) {
                                                C1828k c1828k3 = (C1828k) threadLocal.get();
                                                if (c1828k3 != null && c1828k3.f7647a != null) {
                                                    Context applicationContext = context.getApplicationContext();
                                                    Cursor cursor2 = c1828k3.f7647a;
                                                    BinderC6676b.m26053M(null);
                                                    synchronized (DynamiteModule.class) {
                                                        if (f7635k >= 2) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                        valueOf = Boolean.valueOf(z10);
                                                    }
                                                    if (valueOf.booleanValue()) {
                                                        Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                        m8077M = c1831n.m8078N(BinderC6676b.m26053M(applicationContext), str, i11, BinderC6676b.m26053M(cursor2));
                                                    } else {
                                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                        m8077M = c1831n.m8077M(BinderC6676b.m26053M(applicationContext), str, i11, BinderC6676b.m26053M(cursor2));
                                                    }
                                                    Context context2 = (Context) BinderC6676b.m26054d(m8077M);
                                                    if (context2 != null) {
                                                        dynamiteModule = new DynamiteModule(context2);
                                                    } else {
                                                        throw new C1816a("Failed to get module context", null);
                                                    }
                                                } else {
                                                    throw new C1816a("No result cursor", null);
                                                }
                                            } else {
                                                throw new C1816a("DynamiteLoaderV2 was not cached.", null);
                                            }
                                        } else {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i11);
                                            C1830m m8065k = m8065k(context);
                                            if (m8065k != null) {
                                                int m8070M = m8065k.m8070M();
                                                if (m8070M >= 3) {
                                                    C1828k c1828k4 = (C1828k) threadLocal.get();
                                                    if (c1828k4 != null) {
                                                        m8073P = m8065k.m8074Q(BinderC6676b.m26053M(context), str, i11, BinderC6676b.m26053M(c1828k4.f7647a));
                                                    } else {
                                                        throw new C1816a("No cached result cursor holder", null);
                                                    }
                                                } else if (m8070M == 2) {
                                                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                    m8073P = m8065k.m8075R(BinderC6676b.m26053M(context), str, i11);
                                                } else {
                                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                    m8073P = m8065k.m8073P(BinderC6676b.m26053M(context), str, i11);
                                                }
                                                Object m26054d = BinderC6676b.m26054d(m8073P);
                                                if (m26054d != null) {
                                                    dynamiteModule = new DynamiteModule((Context) m26054d);
                                                } else {
                                                    throw new C1816a("Failed to load remote module.", null);
                                                }
                                            } else {
                                                throw new C1816a("Failed to create IDynamiteLoader.", null);
                                            }
                                        }
                                        if (longValue == 0) {
                                            threadLocal2.remove();
                                        } else {
                                            threadLocal2.set(Long.valueOf(longValue));
                                        }
                                        Cursor cursor3 = c1828k2.f7647a;
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                        threadLocal.set(c1828k);
                                        return dynamiteModule;
                                    }
                                    throw new C1816a("Failed to determine which loading route to use.", null);
                                } catch (RemoteException e10) {
                                    throw new C1816a("Failed to load remote module.", e10, null);
                                } catch (C1816a e11) {
                                    throw e11;
                                } catch (Throwable th) {
                                    AbstractC6202f.m24753a(context, th);
                                    throw new C1816a("Failed to load remote module.", th, null);
                                }
                            } catch (C1816a e12) {
                                Log.w("DynamiteModule", "Failed to load remote module: " + e12.getMessage());
                                int i12 = mo8067a.f7644a;
                                if (i12 != 0 && interfaceC1817b.mo8067a(context, str, new C1829l(i12, 0)).f7646c == -1) {
                                    DynamiteModule m8061g2 = m8061g(context, str);
                                    if (longValue == 0) {
                                        f7638n.remove();
                                    } else {
                                        f7638n.set(Long.valueOf(longValue));
                                    }
                                    Cursor cursor4 = c1828k2.f7647a;
                                    if (cursor4 != null) {
                                        cursor4.close();
                                    }
                                    f7637m.set(c1828k);
                                    return m8061g2;
                                }
                                throw new C1816a("Remote load failed. No local fallback found.", e12, null);
                            }
                        }
                        throw new C1816a("VersionPolicy returned invalid code:" + i10, null);
                    }
                }
                throw new C1816a("No acceptable module " + str + " found. Local version is " + mo8067a.f7644a + " and remote version is " + mo8067a.f7645b + ".", null);
            } catch (Throwable th2) {
                th = th2;
                j10 = 0;
                if (longValue == j10) {
                    f7638n.remove();
                } else {
                    f7638n.set(Long.valueOf(longValue));
                }
                Cursor cursor5 = c1828k2.f7647a;
                if (cursor5 != null) {
                    cursor5.close();
                }
                f7637m.set(c1828k);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j10 = 0;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01b1 -> B:24:0x01b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01b3 -> B:24:0x01b6). Please report as a decompilation issue!!! */
    /* renamed from: e */
    public static int m8059e(Context context, String str, boolean z10) {
        Field declaredField;
        Throwable th;
        RemoteException e10;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f7632h;
                Cursor cursor2 = null;
                int i10 = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e11) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e11.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                m8062h(classLoader);
                            } catch (C1816a unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!m8064j(context)) {
                                return 0;
                            }
                            if (!f7634j) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int m8060f = m8060f(context, str, z10, true);
                                        String str2 = f7633i;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader m26845a = AbstractC6907b.m26845a();
                                            if (m26845a == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    String str3 = f7633i;
                                                    AbstractC5391n.m21783i(str3);
                                                    m26845a = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = f7633i;
                                                    AbstractC5391n.m21783i(str4);
                                                    m26845a = new C1818a(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            m8062h(m26845a);
                                            declaredField.set(null, m26845a);
                                            f7632h = bool2;
                                            return m8060f;
                                        }
                                        return m8060f;
                                    } catch (C1816a unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        f7632h = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return m8060f(context, str, z10, false);
                    } catch (C1816a e12) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e12.getMessage());
                        return 0;
                    }
                }
                C1830m m8065k = m8065k(context);
                try {
                    if (m8065k != null) {
                        try {
                            int m8070M = m8065k.m8070M();
                            if (m8070M >= 3) {
                                C1828k c1828k = (C1828k) f7637m.get();
                                if (c1828k != null && (cursor = c1828k.f7647a) != null) {
                                    i10 = cursor.getInt(0);
                                } else {
                                    Cursor cursor3 = (Cursor) BinderC6676b.m26054d(m8065k.m8076S(BinderC6676b.m26053M(context), str, z10, ((Long) f7638n.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i11 = cursor3.getInt(0);
                                                if (i11 <= 0 || !m8063i(cursor3)) {
                                                    cursor2 = cursor3;
                                                }
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                i10 = i11;
                                            }
                                        } catch (RemoteException e13) {
                                            e10 = e13;
                                            cursor2 = cursor3;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e10.getMessage());
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            return i10;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                }
                            } else if (m8070M == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i10 = m8065k.m8072O(BinderC6676b.m26053M(context), str, z10);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i10 = m8065k.m8071N(BinderC6676b.m26053M(context), str, z10);
                            }
                        } catch (RemoteException e14) {
                            e10 = e14;
                        }
                    }
                    return i10;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            AbstractC6202f.m24753a(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x009f, code lost:
    
        r10.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c9  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int m8060f(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) {
        /*
            r0 = 0
            java.lang.ThreadLocal r1 = com.google.android.gms.dynamite.DynamiteModule.f7638n     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb5
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb5
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb5
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb5
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb5
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L19
            r10 = r4
        L19:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb5
            r12.<init>()     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb5
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb5
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb5
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb5
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb5
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb5
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb5
            android.net.Uri r4 = r10.build()     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb5
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb5
            if (r10 == 0) goto La3
            boolean r11 = r10.moveToFirst()     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lc5
            if (r11 == 0) goto La3
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lc5
            if (r12 <= 0) goto L8e
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lc5
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.dynamite.DynamiteModule.f7633i = r2     // Catch: java.lang.Throwable -> L8b
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 < 0) goto L6f
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.dynamite.DynamiteModule.f7635k = r2     // Catch: java.lang.Throwable -> L8b
        L6f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader2"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 < 0) goto L82
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L7e
            goto L7f
        L7e:
            r9 = 0
        L7f:
            com.google.android.gms.dynamite.DynamiteModule.f7634j = r9     // Catch: java.lang.Throwable -> L8b
            r11 = r9
        L82:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8b
            boolean r1 = m8063i(r10)     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lc5
            if (r1 == 0) goto L8e
            r10 = r0
            goto L8e
        L8b:
            r11 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8b
            throw r11     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lc5
        L8e:
            if (r13 == 0) goto L9d
            if (r11 != 0) goto L93
            goto L9d
        L93:
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lc5
            java.lang.String r12 = "forcing fallback to container DynamiteLoader impl"
            r11.<init>(r12, r0)     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lc5
            throw r11     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lc5
        L9b:
            r11 = move-exception
            goto Lb8
        L9d:
            if (r10 == 0) goto La2
            r10.close()
        La2:
            return r12
        La3:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lc5
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lc5
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lc5
            throw r11     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lc5
        Lb2:
            r10 = move-exception
            r11 = r10
            goto Lc7
        Lb5:
            r10 = move-exception
            r11 = r10
            r10 = r0
        Lb8:
            boolean r12 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.C1816a     // Catch: java.lang.Throwable -> Lc5
            if (r12 == 0) goto Lbd
            throw r11     // Catch: java.lang.Throwable -> Lc5
        Lbd:
            com.google.android.gms.dynamite.DynamiteModule$a r12 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r13 = "V2 version check failed"
            r12.<init>(r13, r11, r0)     // Catch: java.lang.Throwable -> Lc5
            throw r12     // Catch: java.lang.Throwable -> Lc5
        Lc5:
            r11 = move-exception
            r0 = r10
        Lc7:
            if (r0 == 0) goto Lcc
            r0.close()
        Lcc:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m8060f(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    /* renamed from: g */
    private static DynamiteModule m8061g(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context.getApplicationContext());
    }

    /* renamed from: h */
    private static void m8062h(ClassLoader classLoader) {
        C1831n c1831n;
        AbstractC6909d abstractC6909d = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                c1831n = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof C1831n) {
                    c1831n = (C1831n) queryLocalInterface;
                } else {
                    c1831n = new C1831n(iBinder);
                }
            }
            f7642r = c1831n;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new C1816a("Failed to instantiate dynamite loader", e10, abstractC6909d);
        }
    }

    /* renamed from: i */
    private static boolean m8063i(Cursor cursor) {
        C1828k c1828k = (C1828k) f7637m.get();
        if (c1828k != null && c1828k.f7647a == null) {
            c1828k.f7647a = cursor;
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private static boolean m8064j(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f7636l)) {
            return true;
        }
        boolean z10 = false;
        if (f7636l == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (C4870j.m20060f().mo20046h(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z10 = true;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            f7636l = valueOf;
            z10 = valueOf.booleanValue();
            if (z10 && resolveContentProvider != null && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f7634j = true;
            }
        }
        if (!z10) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    /* renamed from: k */
    private static C1830m m8065k(Context context) {
        C1830m c1830m;
        synchronized (DynamiteModule.class) {
            C1830m c1830m2 = f7641q;
            if (c1830m2 != null) {
                return c1830m2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    c1830m = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof C1830m) {
                        c1830m = (C1830m) queryLocalInterface;
                    } else {
                        c1830m = new C1830m(iBinder);
                    }
                }
                if (c1830m != null) {
                    f7641q = c1830m;
                    return c1830m;
                }
            } catch (Exception e10) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e10.getMessage());
            }
            return null;
        }
    }

    /* renamed from: c */
    public IBinder m8066c(String str) {
        try {
            return (IBinder) this.f7643a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new C1816a("Failed to instantiate module class: ".concat(String.valueOf(str)), e10, null);
        }
    }
}
