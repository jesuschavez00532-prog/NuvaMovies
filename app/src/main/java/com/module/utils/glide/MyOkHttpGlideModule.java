package com.module.utils.glide;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import cc.AbstractC1453g;
import cc.C1479y;
import com.bumptech.glide.C1587d;
import com.bumptech.glide.C1592i;
import com.bumptech.glide.ComponentCallbacks2C1586c;
import com.bumptech.glide.integration.okhttp3.C1594b;
import com.umeng.analytics.pro.C3384f;
import java.io.InputStream;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.X509TrustManager;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import okhttp3.OkHttpClient;
import p003a2.C0012h;
import p184j1.EnumC4971b;
import p230m1.C5578k;
import p243n1.C5728f;
import p243n1.C5730h;
import p243n1.C5732j;
import p278p1.C6169i;
import p407y1.AbstractC7657a;
import p416ya.C7691a;
import p416ya.C7695e;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* loaded from: classes2.dex */
public final class MyOkHttpGlideModule extends AbstractC7657a {

    /* renamed from: b */
    public static final C2991a f12122b = new C2991a(null);

    /* renamed from: c */
    private static final long f12123c = 104857600;

    /* renamed from: d */
    private static final long f12124d = IjkMediaMeta.AV_CH_STEREO_RIGHT;

    /* renamed from: e */
    private static boolean f12125e;

    /* renamed from: a */
    private final int f12126a = 15;

    /* renamed from: com.module.utils.glide.MyOkHttpGlideModule$a */
    /* loaded from: classes2.dex */
    public static final class C2991a {
        private C2991a() {
        }

        public /* synthetic */ C2991a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final boolean m12057a() {
            return MyOkHttpGlideModule.f12125e;
        }
    }

    @Override // p407y1.AbstractC7659c
    /* renamed from: a */
    public void mo7270a(Context context, ComponentCallbacks2C1586c componentCallbacks2C1586c, C1592i c1592i) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(componentCallbacks2C1586c, "glide");
        AbstractC5868k.m23674f(c1592i, "registry");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.proxy(Proxy.NO_PROXY);
        long j10 = this.f12126a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.connectTimeout(j10, timeUnit).readTimeout(this.f12126a, timeUnit).writeTimeout(this.f12126a, timeUnit).addInterceptor(new C7691a()).dns(new C7695e());
        Log.e("AddGlideErrorInter", "初始化：AddGlideErrorInterceptor");
        X509TrustManager m6758a = AbstractC1453g.m6758a();
        if (m6758a != null) {
            builder.sslSocketFactory(new C1479y(m6758a), m6758a);
        }
        OkHttpClient build = builder.build();
        AbstractC5868k.m23673e(build, "builder.build()");
        c1592i.m7338r(C6169i.class, InputStream.class, new C1594b.a(build));
    }

    @Override // p407y1.AbstractC7657a
    /* renamed from: b */
    public void mo7271b(Context context, C1587d c1587d) {
        boolean z10;
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(c1587d, "builder");
        c1587d.m7304f(6);
        Object systemService = context.getSystemService("activity");
        AbstractC5868k.m23672d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
        if (memoryInfo.totalMem < f12124d) {
            z10 = true;
        } else {
            z10 = false;
        }
        f12125e = z10;
        if (z10) {
            C5732j m23142a = new C5732j.a(context).m23142a();
            c1587d.m7301c((C0012h) ((C0012h) new C0012h().mo63m(EnumC4971b.PREFER_RGB_565)).mo52f());
            c1587d.m7305g(new C5730h(m23142a.m23141d() / 2));
            long m23140b = m23142a.m23140b() / 2;
            if (m23140b > 2097152) {
                c1587d.m7300b(new C5578k(m23140b));
            }
        }
        c1587d.m7303e(new C5728f(context, f12123c));
    }

    @Override // p407y1.AbstractC7657a
    /* renamed from: c */
    public boolean mo7272c() {
        return false;
    }
}
