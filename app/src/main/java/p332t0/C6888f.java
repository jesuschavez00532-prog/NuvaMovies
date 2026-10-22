package p332t0;

import android.content.Context;
import be.C1328x;
import com.advertlib.bean.AdInfo;
import com.umeng.analytics.pro.C3384f;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;
import ne.AbstractC5868k;
import okhttp3.ResponseBody;
import p140g1.C4334b;
import p242n0.AbstractC5721h;
import p277p0.C6156m;
import p321s0.InterfaceC6607b;
import p346u0.C7010d;
import p348u2.AbstractC7030g;
import p361v0.C7190c;
import p361v0.C7191d;
import p363v2.C7197a;
import retrofit2.Response;

/* renamed from: t0.f */
/* loaded from: classes.dex */
public final class C6888f implements InterfaceC6883a {

    /* renamed from: a */
    private C7010d f26191a;

    /* renamed from: b */
    private final String f26192b;

    /* renamed from: c */
    private final String f26193c;

    /* renamed from: d */
    private final String f26194d;

    /* renamed from: e */
    private final long f26195e;

    /* renamed from: f */
    private String f26196f;

    /* renamed from: g */
    private C4334b f26197g;

    /* renamed from: h */
    private AtomicInteger f26198h;

    public C6888f(C7010d c7010d) {
        AbstractC5868k.m23674f(c7010d, "mAdRequestModel");
        this.f26191a = c7010d;
        this.f26192b = C6888f.class.getSimpleName();
        this.f26193c = "ad_video";
        this.f26194d = ".tmp";
        this.f26195e = 104857600L;
        this.f26196f = "";
        this.f26198h = new AtomicInteger(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m26802e(C6888f c6888f, Context context, String str, AdInfo adInfo, InterfaceC6607b interfaceC6607b) {
        AbstractC5868k.m23674f(c6888f, "this$0");
        AbstractC5868k.m23674f(context, "$context");
        AbstractC5868k.m23674f(str, "$adType");
        AbstractC5868k.m23674f(adInfo, "$adInfo");
        c6888f.m26810m(context, str, adInfo, interfaceC6607b);
        if (c6888f.f26198h.decrementAndGet() == 0) {
            C6156m.f24180a.m24564P().mo24581a("video");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f A[Catch: IOException -> 0x005c, TryCatch #0 {IOException -> 0x005c, blocks: (B:3:0x0001, B:5:0x0013, B:7:0x001b, B:10:0x0022, B:12:0x0032, B:19:0x003f, B:21:0x004a, B:23:0x0050), top: B:2:0x0001 }] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m26803f(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            java.lang.String r1 = r4.f26196f     // Catch: java.io.IOException -> L5c
            g1.b r1 = r4.m26805h(r1)     // Catch: java.io.IOException -> L5c
            java.lang.String r2 = ""
            java.lang.String r5 = p242n0.AbstractC5721h.m23116c(r5, r2)     // Catch: java.io.IOException -> L5c
            g1.b$e r5 = r1.m18176z(r5)     // Catch: java.io.IOException -> L5c
            if (r5 == 0) goto L18
            java.io.File r5 = r5.m18198a(r0)     // Catch: java.io.IOException -> L5c
            goto L19
        L18:
            r5 = 0
        L19:
            if (r5 == 0) goto L5b
            boolean r1 = r5.exists()     // Catch: java.io.IOException -> L5c
            if (r1 != 0) goto L22
            goto L5b
        L22:
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.io.IOException -> L5c
            java.lang.String r1 = "file.absolutePath"
            ne.AbstractC5868k.m23673e(r5, r1)     // Catch: java.io.IOException -> L5c
            java.lang.String r5 = r4.m26806i(r5)     // Catch: java.io.IOException -> L5c
            r1 = 1
            if (r5 == 0) goto L3b
            int r2 = r5.length()     // Catch: java.io.IOException -> L5c
            if (r2 != 0) goto L39
            goto L3b
        L39:
            r2 = 0
            goto L3c
        L3b:
            r2 = 1
        L3c:
            if (r2 == 0) goto L3f
            return r0
        L3f:
            java.io.File r2 = new java.io.File     // Catch: java.io.IOException -> L5c
            r2.<init>(r5)     // Catch: java.io.IOException -> L5c
            boolean r3 = r2.exists()     // Catch: java.io.IOException -> L5c
            if (r3 == 0) goto L50
            v0.c r5 = p361v0.C7190c.f26897a     // Catch: java.io.IOException -> L5c
            r5.m27822b(r2)     // Catch: java.io.IOException -> L5c
            return r0
        L50:
            java.io.File r2 = new java.io.File     // Catch: java.io.IOException -> L5c
            r2.<init>(r5)     // Catch: java.io.IOException -> L5c
            boolean r5 = r2.exists()     // Catch: java.io.IOException -> L5c
            r5 = r5 ^ r1
            return r5
        L5b:
            return r0
        L5c:
            r5 = move-exception
            r5.printStackTrace()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p332t0.C6888f.m26803f(java.lang.String):boolean");
    }

    /* renamed from: g */
    private final File m26804g(String str) {
        boolean z10;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && m26803f(str)) {
            try {
                C4334b.e m18176z = m26805h(this.f26196f).m18176z(AbstractC5721h.m23116c(str, ""));
                if (m18176z == null) {
                    return null;
                }
                return m18176z.m18198a(0);
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: h */
    private final C4334b m26805h(String str) {
        if (this.f26197g == null) {
            synchronized (C6888f.class) {
                if (this.f26197g == null) {
                    this.f26197g = C4334b.m18152B(new File(str, this.f26193c), 1, 1, this.f26195e);
                }
                C1328x c1328x = C1328x.f4998a;
            }
        }
        C4334b c4334b = this.f26197g;
        AbstractC5868k.m23671c(c4334b);
        return c4334b;
    }

    /* renamed from: i */
    private final String m26806i(String str) {
        StringBuilder sb2 = new StringBuilder();
        String substring = str.substring(0, str.length() - 2);
        AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb2.append(substring);
        sb2.append(this.f26194d);
        return sb2.toString();
    }

    /* renamed from: j */
    private final void m26807j(final InterfaceC6607b interfaceC6607b, final String str, final boolean z10) {
        C6156m.f24180a.m24566S().post(new Runnable() { // from class: t0.e
            @Override // java.lang.Runnable
            public final void run() {
                C6888f.m26808k(InterfaceC6607b.this, str, z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m26808k(InterfaceC6607b interfaceC6607b, String str, boolean z10) {
        AbstractC5868k.m23674f(str, "$adType");
        if (interfaceC6607b != null) {
            interfaceC6607b.mo23220a(str, z10);
        }
    }

    /* renamed from: l */
    private final boolean m26809l(String str, String str2, InputStream inputStream) {
        File m18183f;
        if (inputStream == null) {
            return false;
        }
        C4334b.c m18175t = m26805h(str).m18175t(AbstractC5721h.m23116c(str2, ""));
        if (m18175t == null || (m18183f = m18175t.m18183f(0)) == null) {
            return false;
        }
        String absolutePath = m18183f.getAbsolutePath();
        AbstractC5868k.m23673e(absolutePath, "cacheFile.absolutePath");
        String m26806i = m26806i(absolutePath);
        C7190c c7190c = C7190c.f26897a;
        c7190c.m27824d(m26806i);
        if (c7190c.m27821a(inputStream, m18183f)) {
            c7190c.m27823c(m26806i);
            m18175t.m18182e();
            return true;
        }
        c7190c.m27823c(m26806i);
        m18175t.m18181b();
        return false;
    }

    /* renamed from: m */
    private final void m26810m(Context context, String str, AdInfo adInfo, InterfaceC6607b interfaceC6607b) {
        m26811n(context);
        String url = adInfo.getUrl();
        AbstractC5868k.m23671c(url);
        if (m26803f(url)) {
            m26807j(interfaceC6607b, str, true);
            return;
        }
        try {
            C7010d c7010d = this.f26191a;
            String url2 = adInfo.getUrl();
            AbstractC5868k.m23671c(url2);
            Response execute = c7010d.m27066m(url2).execute();
            if (!execute.m25763d()) {
                m26807j(interfaceC6607b, str, false);
                C7197a.f26917a.m27860t(C7010d.f26372g.m27069b(), "key_ads");
                return;
            }
            ResponseBody responseBody = (ResponseBody) execute.m25761a();
            if (responseBody == null) {
                m26807j(interfaceC6607b, str, false);
                return;
            }
            String str2 = this.f26196f;
            String url3 = adInfo.getUrl();
            if (url3 == null) {
                url3 = "";
            }
            if (m26809l(str2, url3, responseBody.byteStream())) {
                m26807j(interfaceC6607b, str, true);
            } else {
                m26807j(interfaceC6607b, str, false);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            m26807j(interfaceC6607b, str, false);
            C7197a.f26917a.m27860t(C7010d.f26372g.m27069b(), "key_ads");
        }
    }

    /* renamed from: n */
    private final void m26811n(Context context) {
        boolean z10;
        String str = this.f26196f;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            String absolutePath = context.getCacheDir().getAbsolutePath();
            AbstractC5868k.m23673e(absolutePath, "context.cacheDir.absolutePath");
            this.f26196f = absolutePath;
        }
    }

    @Override // p332t0.InterfaceC6883a
    /* renamed from: a */
    public File mo26796a(Context context, String str, AdInfo adInfo) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, "adType");
        AbstractC5868k.m23674f(adInfo, "adInfo");
        m26811n(context);
        String url = adInfo.getUrl();
        if (url == null) {
            url = "";
        }
        return m26804g(url);
    }

    @Override // p332t0.InterfaceC6883a
    /* renamed from: b */
    public void mo26797b(final Context context, final String str, final AdInfo adInfo, final InterfaceC6607b interfaceC6607b) {
        boolean z10;
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, "adType");
        AbstractC5868k.m23674f(adInfo, "adInfo");
        C7191d c7191d = C7191d.f26898a;
        String str2 = this.f26192b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("send request: ");
        String url = adInfo.getUrl();
        AbstractC5868k.m23671c(url);
        sb2.append(url);
        c7191d.m27826a(str2, sb2.toString());
        String url2 = adInfo.getUrl();
        if (url2 != null && url2.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return;
        }
        this.f26198h.getAndIncrement();
        C6156m.f24180a.m24567T().submit(new AbstractC7030g.f("video cache", new Runnable() { // from class: t0.d
            @Override // java.lang.Runnable
            public final void run() {
                C6888f.m26802e(C6888f.this, context, str, adInfo, interfaceC6607b);
            }
        }, false));
    }
}
