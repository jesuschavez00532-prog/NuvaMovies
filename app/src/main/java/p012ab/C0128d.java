package p012ab;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import com.umeng.analytics.pro.C3384f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import ne.AbstractC5868k;
import p348u2.AbstractC7030g;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* renamed from: ab.d */
/* loaded from: classes2.dex */
public final class C0128d {

    /* renamed from: c */
    private static boolean f377c;

    /* renamed from: e */
    private static long f379e;

    /* renamed from: f */
    private static Context f380f;

    /* renamed from: h */
    private static Future f382h;

    /* renamed from: a */
    public static final C0128d f375a = new C0128d();

    /* renamed from: b */
    private static final BroadcastReceiver f376b = new a();

    /* renamed from: d */
    private static String f378d = "eth0";

    /* renamed from: g */
    private static ArrayList f381g = new ArrayList();

    /* renamed from: i */
    private static Handler f383i = new Handler(Looper.getMainLooper());

    /* renamed from: ab.d$a */
    /* loaded from: classes2.dex */
    public static final class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            AbstractC5868k.m23674f(intent, "intent");
            String m504i = C0128d.f375a.m504i();
            if (m504i == null) {
                m504i = "eth0";
            }
            C0128d.f378d = m504i;
        }
    }

    private C0128d() {
    }

    /* renamed from: f */
    private final void m502f() {
        Future future = f382h;
        if (future != null) {
            future.cancel(true);
        }
        f382h = null;
    }

    /* renamed from: g */
    private final void m503g(String str) {
        if (AbstractC5868k.m23669a(Looper.getMainLooper(), Looper.myLooper())) {
            return;
        }
        throw new UnsupportedOperationException("please invoke " + str + " method in main thread");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final String m504i() {
        Object obj;
        ConnectivityManager connectivityManager;
        Context context = f380f;
        if (context != null) {
            obj = context.getSystemService("connectivity");
        } else {
            obj = null;
        }
        if (obj instanceof ConnectivityManager) {
            connectivityManager = (ConnectivityManager) obj;
        } else {
            connectivityManager = null;
        }
        if (connectivityManager != null) {
            NetworkInfo[] allNetworkInfo = connectivityManager.getAllNetworkInfo();
            AbstractC5868k.m23673e(allNetworkInfo, "connectivity.allNetworkInfo");
            int length = allNetworkInfo.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (allNetworkInfo[i10].isConnected()) {
                    String typeName = allNetworkInfo[i10].getTypeName();
                    if (AbstractC5868k.m23669a(typeName, "WIFI")) {
                        return "wlan0";
                    }
                    if (AbstractC5868k.m23669a(typeName, "MOBILE")) {
                        return "ippp0";
                    }
                    return "eth0";
                }
            }
        }
        return null;
    }

    /* renamed from: k */
    private final void m505k() {
        m502f();
        f382h = AbstractC7030g.m27130d().schedule(new AbstractC7030g.f("speed monitor", new Runnable() { // from class: ab.b
            @Override // java.lang.Runnable
            public final void run() {
                C0128d.m506l();
            }
        }, true), 0L, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m506l() {
        f379e = C0129e.f384a.m514a();
        try {
            Thread.sleep(200L);
            C0128d c0128d = f375a;
            c0128d.m508o(c0128d.m507m(200L));
            while (true) {
                Thread.sleep(2000L);
                C0128d c0128d2 = f375a;
                c0128d2.m508o(c0128d2.m507m(2000L));
            }
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: m */
    private final String m507m(long j10) {
        long j11 = f379e;
        long m514a = C0129e.f384a.m514a();
        f379e = m514a;
        long j12 = ((m514a - j11) * 1000) / j10;
        if (j12 <= 0) {
            return "0B/S";
        }
        boolean z10 = false;
        if (1 <= j12 && j12 < IjkMediaMeta.AV_CH_SIDE_RIGHT) {
            z10 = true;
        }
        if (z10) {
            return j12 + "B/S";
        }
        if (j12 >= 1048576) {
            return (j12 / 1048576) + "MB/S";
        }
        return (j12 / IjkMediaMeta.AV_CH_SIDE_RIGHT) + "KB/S";
    }

    /* renamed from: o */
    private final void m508o(final String str) {
        f383i.post(new Runnable() { // from class: ab.c
            @Override // java.lang.Runnable
            public final void run() {
                C0128d.m509p(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m509p(String str) {
        AbstractC5868k.m23674f(str, "$speedInfo");
        Iterator it = f381g.iterator();
        while (it.hasNext()) {
            ((InterfaceC0125a) it.next()).mo497a(str);
        }
    }

    /* renamed from: e */
    public final void m510e(InterfaceC0125a interfaceC0125a) {
        AbstractC5868k.m23674f(interfaceC0125a, "listener");
        m503g("addSpeedListener");
        if (f381g.isEmpty()) {
            m505k();
        }
        f381g.add(interfaceC0125a);
    }

    /* renamed from: h */
    public final void m511h() {
        m502f();
        f381g.clear();
        if (f377c) {
            Context context = f380f;
            if (context != null) {
                context.unregisterReceiver(f376b);
            }
            f377c = false;
        }
    }

    /* renamed from: j */
    public final void m512j(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        f380f = context.getApplicationContext();
    }

    /* renamed from: n */
    public final void m513n(InterfaceC0125a interfaceC0125a) {
        AbstractC5868k.m23674f(interfaceC0125a, "listener");
        m503g("removeSpeedListener");
        f381g.remove(interfaceC0125a);
        if (f381g.isEmpty()) {
            m502f();
        }
    }
}
