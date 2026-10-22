package p374w0;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bigbee.bean.ServerTime;
import com.dcs.bean.DomainInfo;
import com.google.gson.Gson;
import com.lzy.okgo.model.Progress;
import com.taobao.accs.utl.BaseMonitor;
import ne.AbstractC5868k;
import okhttp3.Dns;
import okhttp3.Interceptor;
import p021b1.C1032a;
import p033c1.C1337a;
import p033c1.EnumC1341e;
import p033c1.InterfaceC1338b;
import p033c1.InterfaceRunnableC1340d;
import p092d1.C3921a;
import p123f1.C4209a;
import p123f1.C4214f;
import p123f1.C4216h;
import p363v2.C7197a;
import p406y0.AbstractC7656a;

/* renamed from: w0.a */
/* loaded from: classes.dex */
public final class C7343a {

    /* renamed from: a */
    private final String f27244a = C7343a.class.getSimpleName();

    /* renamed from: w0.a$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC1338b {
        a() {
        }

        @Override // p033c1.InterfaceC1338b
        /* renamed from: a */
        public void mo12a(InterfaceRunnableC1340d interfaceRunnableC1340d, Exception exc) {
            AbstractC5868k.m23674f(interfaceRunnableC1340d, Progress.REQUEST);
            AbstractC5868k.m23674f(exc, "e");
            C4209a c4209a = C4209a.f18456a;
            c4209a.m17593k(false);
            c4209a.m17595m(SystemClock.elapsedRealtime());
            exc.printStackTrace();
            if (AbstractC7656a.f28098d != null) {
                C7197a c7197a = C7197a.f26917a;
                DomainInfo domainInfo = AbstractC7656a.f28098d;
                AbstractC5868k.m23673e(domainInfo, "TDC");
                c7197a.m27860t(domainInfo, "key_tdc");
            }
        }

        @Override // p033c1.InterfaceC1338b
        /* renamed from: b */
        public void mo13b(InterfaceRunnableC1340d interfaceRunnableC1340d, C3921a c3921a) {
            AbstractC5868k.m23674f(interfaceRunnableC1340d, Progress.REQUEST);
            AbstractC5868k.m23674f(c3921a, "response");
            C4209a c4209a = C4209a.f18456a;
            c4209a.m17593k(false);
            if (c3921a.m16756d() && !TextUtils.isEmpty(c3921a.m16754b())) {
                try {
                    ServerTime serverTime = (ServerTime) new Gson().fromJson(c3921a.m16754b(), ServerTime.class);
                    if (serverTime != null) {
                        C4216h.f18482a.m17619b(serverTime.getTimestamp());
                        c4209a.m17595m(SystemClock.elapsedRealtime());
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            c4209a.m17595m(SystemClock.elapsedRealtime());
        }
    }

    /* renamed from: a */
    public final void m28329a(Dns dns, Interceptor interceptor) {
        String str;
        AbstractC5868k.m23674f(dns, BaseMonitor.COUNT_POINT_DNS);
        C4214f c4214f = C4214f.f18481a;
        String str2 = AbstractC7656a.f28099e;
        AbstractC5868k.m23673e(str2, "URL_HOST_MAIN");
        if (c4214f.m17614a(str2)) {
            str = "http://";
        } else {
            str = "https://";
        }
        String str3 = str + AbstractC7656a.f28099e + AbstractC7656a.f28097c + AbstractC7656a.f28096b;
        String str4 = str + AbstractC7656a.f28100f + AbstractC7656a.f28097c + AbstractC7656a.f28096b;
        C4209a.f18456a.m17593k(true);
        C1032a.f4269b.m4836a().m4834c(new C1337a().m6104i(str3, str4).m6103h(EnumC1341e.GET).m6099b(dns).m6101f(interceptor).m6098a(new a()));
    }
}
