package p035c3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.titans.entity.CdnType;
import com.umeng.analytics.pro.C3384f;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ne.AbstractC5868k;
import okhttp3.internal.Util;
import p043ce.AbstractC1500l;
import p043ce.AbstractC1508t;
import p363v2.C7197a;
import pe.AbstractC6291c;

/* renamed from: c3.k */
/* loaded from: classes.dex */
public final class C1356k {

    /* renamed from: a */
    public static final C1356k f5086a = new C1356k();

    /* renamed from: b */
    private static ExecutorService f5087b;

    /* renamed from: c */
    private static final List f5088c;

    /* renamed from: d */
    private static final List f5089d;

    static {
        List m6988g;
        List m6988g2;
        m6988g = AbstractC1500l.m6988g("googleadservices", "googleapis", "googleanalysis", "googleadmob", "googleMessaging", "umengacs", CdnType.TYPE_AWS);
        f5088c = m6988g;
        m6988g2 = AbstractC1500l.m6988g("log?s=", "rpc?alt=json", "vpkg?asfast=true", "zip?g=true", "log_event");
        f5089d = m6988g2;
    }

    private C1356k() {
    }

    /* renamed from: a */
    public final int m6128a() {
        try {
            C7197a c7197a = C7197a.f26917a;
            return c7197a.m27844a().getPackageManager().getPackageInfo(c7197a.m27844a().getPackageName(), 64).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    /* renamed from: b */
    public final List m6129b() {
        return f5088c;
    }

    /* renamed from: c */
    public final List m6130c() {
        return f5089d;
    }

    /* renamed from: d */
    public final synchronized ExecutorService m6131d() {
        ExecutorService executorService;
        if (f5087b == null) {
            f5087b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("Net OkHttp Dispatcher", false));
        }
        executorService = f5087b;
        AbstractC5868k.m23671c(executorService);
        return executorService;
    }

    /* renamed from: e */
    public final String m6132e(List list) {
        Object m7012x;
        AbstractC5868k.m23674f(list, "strings");
        m7012x = AbstractC1508t.m7012x(list, AbstractC6291c.f24632a);
        return (String) m7012x;
    }

    /* renamed from: f */
    public final boolean m6133f(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        if (m6136i(context) || m6137j(context) || m6134g(context) || m6135h(context)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r5 = r5.getNetworkCapabilities(r1);
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m6134g(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            ne.AbstractC5868k.m23674f(r5, r0)
            r0 = 1
            java.lang.String r1 = "connectivity"
            java.lang.Object r5 = r5.getSystemService(r1)     // Catch: java.lang.Exception -> L3b
            java.lang.String r1 = "null cannot be cast to non-null type android.net.ConnectivityManager"
            ne.AbstractC5868k.m23672d(r5, r1)     // Catch: java.lang.Exception -> L3b
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5     // Catch: java.lang.Exception -> L3b
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L3b
            r2 = 23
            r3 = 0
            if (r1 < r2) goto L2d
            android.net.Network r1 = com.bumptech.glide.manager.AbstractC1636s.m7500a(r5)     // Catch: java.lang.Exception -> L3b
            if (r1 != 0) goto L21
            return r3
        L21:
            android.net.NetworkCapabilities r5 = p035c3.AbstractC1354i.m6126a(r5, r1)     // Catch: java.lang.Exception -> L3b
            if (r5 != 0) goto L28
            return r3
        L28:
            boolean r5 = p035c3.AbstractC1355j.m6127a(r5, r3)     // Catch: java.lang.Exception -> L3b
            return r5
        L2d:
            android.net.NetworkInfo r5 = r5.getNetworkInfo(r3)     // Catch: java.lang.Exception -> L3b
            if (r5 == 0) goto L3a
            boolean r5 = r5.isConnected()     // Catch: java.lang.Exception -> L3b
            if (r5 == 0) goto L3a
            goto L3b
        L3a:
            r0 = 0
        L3b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035c3.C1356k.m6134g(android.content.Context):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r5 = r5.getNetworkCapabilities(r1);
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m6135h(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            ne.AbstractC5868k.m23674f(r5, r0)
            r0 = 1
            java.lang.String r1 = "connectivity"
            java.lang.Object r5 = r5.getSystemService(r1)     // Catch: java.lang.Exception -> L4e
            java.lang.String r1 = "null cannot be cast to non-null type android.net.ConnectivityManager"
            ne.AbstractC5868k.m23672d(r5, r1)     // Catch: java.lang.Exception -> L4e
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5     // Catch: java.lang.Exception -> L4e
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L4e
            r2 = 23
            r3 = 0
            if (r1 < r2) goto L40
            android.net.Network r1 = com.bumptech.glide.manager.AbstractC1636s.m7500a(r5)     // Catch: java.lang.Exception -> L4e
            if (r1 != 0) goto L21
            return r3
        L21:
            android.net.NetworkCapabilities r5 = p035c3.AbstractC1354i.m6126a(r5, r1)     // Catch: java.lang.Exception -> L4e
            if (r5 != 0) goto L28
            return r3
        L28:
            boolean r1 = p035c3.AbstractC1355j.m6127a(r5, r0)     // Catch: java.lang.Exception -> L4e
            if (r1 == 0) goto L2f
            goto L3f
        L2f:
            boolean r1 = p035c3.AbstractC1355j.m6127a(r5, r3)     // Catch: java.lang.Exception -> L4e
            if (r1 == 0) goto L36
            goto L3f
        L36:
            r1 = 3
            boolean r5 = p035c3.AbstractC1355j.m6127a(r5, r1)     // Catch: java.lang.Exception -> L4e
            if (r5 == 0) goto L3e
            goto L3f
        L3e:
            r0 = 0
        L3f:
            return r0
        L40:
            android.net.NetworkInfo r5 = r5.getActiveNetworkInfo()     // Catch: java.lang.Exception -> L4e
            if (r5 == 0) goto L4d
            boolean r5 = r5.isConnected()     // Catch: java.lang.Exception -> L4e
            if (r5 == 0) goto L4d
            goto L4e
        L4d:
            r0 = 0
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035c3.C1356k.m6135h(android.content.Context):boolean");
    }

    /* renamed from: i */
    public final boolean m6136i(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        Object systemService = context.getSystemService("connectivity");
        AbstractC5868k.m23672d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r5 = r5.getNetworkCapabilities(r1);
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m6137j(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            ne.AbstractC5868k.m23674f(r5, r0)
            r0 = 1
            java.lang.String r1 = "connectivity"
            java.lang.Object r5 = r5.getSystemService(r1)     // Catch: java.lang.Exception -> L3b
            java.lang.String r1 = "null cannot be cast to non-null type android.net.ConnectivityManager"
            ne.AbstractC5868k.m23672d(r5, r1)     // Catch: java.lang.Exception -> L3b
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5     // Catch: java.lang.Exception -> L3b
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L3b
            r2 = 23
            r3 = 0
            if (r1 < r2) goto L2d
            android.net.Network r1 = com.bumptech.glide.manager.AbstractC1636s.m7500a(r5)     // Catch: java.lang.Exception -> L3b
            if (r1 != 0) goto L21
            return r3
        L21:
            android.net.NetworkCapabilities r5 = p035c3.AbstractC1354i.m6126a(r5, r1)     // Catch: java.lang.Exception -> L3b
            if (r5 != 0) goto L28
            return r3
        L28:
            boolean r5 = p035c3.AbstractC1355j.m6127a(r5, r0)     // Catch: java.lang.Exception -> L3b
            return r5
        L2d:
            android.net.NetworkInfo r5 = r5.getNetworkInfo(r0)     // Catch: java.lang.Exception -> L3b
            if (r5 == 0) goto L3a
            boolean r5 = r5.isConnected()     // Catch: java.lang.Exception -> L3b
            if (r5 == 0) goto L3a
            goto L3b
        L3a:
            r0 = 0
        L3b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035c3.C1356k.m6137j(android.content.Context):boolean");
    }
}
