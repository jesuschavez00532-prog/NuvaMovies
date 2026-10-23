package p421z0;

import android.os.SystemClock;
import android.text.TextUtils;
import be.C1328x;
import com.bigbee.bean.request.AppBean;
import com.bigbee.p049db.EventDbModel;
import com.lzy.okgo.model.Progress;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p123f1.C4209a;
import p123f1.C4212d;
import p123f1.C4213e;
import p123f1.C4216h;
import p348u2.AbstractC7029f;

/* renamed from: z0.c */
/* loaded from: classes.dex */
public final class C7729c {

    /* renamed from: c */
    private static AppBean f28425c;

    /* renamed from: a */
    public static final C7729c f28423a = new C7729c();

    /* renamed from: b */
    private static final String f28424b = C7729c.class.getSimpleName();

    /* renamed from: d */
    private static String f28426d = "";

    /* renamed from: e */
    private static HashMap f28427e = new HashMap();

    /* renamed from: z0.c$a */
    /* loaded from: classes.dex */
    public static final class a implements C4212d.c {

        /* renamed from: a */
        final /* synthetic */ String f28428a;

        /* renamed from: b */
        final /* synthetic */ HashMap f28429b;

        /* renamed from: c */
        final /* synthetic */ int f28430c;

        /* renamed from: d */
        final /* synthetic */ String f28431d;

        /* renamed from: e */
        final /* synthetic */ boolean f28432e;

        /* renamed from: f */
        final /* synthetic */ String f28433f;

        /* renamed from: g */
        final /* synthetic */ long f28434g;

        /* renamed from: h */
        final /* synthetic */ long f28435h;

        a(String str, HashMap hashMap, int i10, String str2, boolean z10, String str3, long j10, long j11) {
            this.f28428a = str;
            this.f28429b = hashMap;
            this.f28430c = i10;
            this.f28431d = str2;
            this.f28432e = z10;
            this.f28433f = str3;
            this.f28434g = j10;
            this.f28435h = j11;
        }

        @Override // p123f1.C4212d.c
        /* renamed from: a */
        public void mo17607a() {
            String userName = null;
            if (!TextUtils.isEmpty(this.f28428a)) {
                userName = this.f28428a;
            } else {
                userName = C7737k.f28482a.m29914a().getUserName();
            }
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = this.f28429b;
            if (hashMap2 != null && hashMap2.size() > 0) {
                hashMap = this.f28429b;
            }
            HashMap hashMap3 = hashMap;
            hashMap3.put("httpStatus", Integer.valueOf(this.f28430c));
            hashMap3.put("uri", this.f28431d);
            if (this.f28432e) {
                hashMap3.put("domain|DES", this.f28433f);
            } else {
                hashMap3.put("domain", this.f28433f);
            }
            if (!TextUtils.isEmpty(userName) || !TextUtils.isEmpty(C7737k.f28482a.m29914a().getUserName())) {
                if (userName == null && (userName = C7737k.f28482a.m29914a().getUserName()) == null) {
                    userName = "";
                }
                hashMap3.put("uname", userName);
            }
            C4216h c4216h = C4216h.f18482a;
            long m17618a = c4216h.m17618a();
            long j10 = this.f28434g;
            C4209a c4209a = C4209a.f18456a;
            C7734h.f28449q.m29905a().m29901w(C7730d.m29862d(C7730d.f28438a, "app_api", hashMap3, (j10 - c4209a.m17589g()) + m17618a, (this.f28435h - c4209a.m17589g()) + c4216h.m17618a(), false, 16, null));
        }
    }

    /* renamed from: z0.c$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ long f28436a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10) {
            super(1);
            this.f28436a = j10;
        }

        /* renamed from: a */
        public final void m29859a(String str) {
            C4213e.f18477b.m17613a().m17611c("server_time", Long.valueOf(C4216h.f18482a.m17618a()));
            C7729c.f28423a.m29856j(this.f28436a);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m29859a((String) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: z0.c$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f28437a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m29860a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m29860a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    private C7729c() {
    }

    /* renamed from: c */
    private final EventDbModel m29845c(boolean z10) {
        String str = null;
        long j10;
        long j11;
        String str2 = null;
        AppBean appBean = f28425c;
        if (appBean != null) {
            str = appBean.getTag();
        } else {
            str = null;
        }
        String str3 = "";
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = f28427e;
            AppBean appBean2 = f28425c;
            if (appBean2 == null || (str2 = appBean2.getTag()) == null) {
                str2 = "";
            }
            hashMap.put(Progress.TAG, str2);
        }
        C7737k c7737k = C7737k.f28482a;
        if (!TextUtils.isEmpty(c7737k.m29914a().getUserName())) {
            HashMap hashMap2 = f28427e;
            String userName = c7737k.m29914a().getUserName();
            if (userName != null) {
                str3 = userName;
            }
            hashMap2.put("uname", str3);
        }
        C7730d c7730d = C7730d.f28438a;
        HashMap hashMap3 = f28427e;
        AppBean appBean3 = f28425c;
        if (appBean3 != null) {
            j10 = appBean3.getSt();
        } else {
            j10 = 0;
        }
        AppBean appBean4 = f28425c;
        if (appBean4 != null) {
            j11 = appBean4.getEt();
        } else {
            j11 = 0;
        }
        return c7730d.m29864c("app", hashMap3, j10, j11, z10);
    }

    /* renamed from: e */
    public static /* synthetic */ void m29846e(C7729c c7729c, long j10, long j11, String str, String str2, int i10, String str3, HashMap hashMap, boolean z10, int i11, Object obj) {
        String str4 = null;
        HashMap hashMap2;
        if ((i11 & 32) != 0) {
            str4 = "";
        } else {
            str4 = str3;
        }
        if ((i11 & 64) != 0) {
            hashMap2 = null;
        } else {
            hashMap2 = hashMap;
        }
        c7729c.m29851d(j10, j11, str, str2, i10, str4, hashMap2, z10);
    }

    /* renamed from: k */
    public static /* synthetic */ void m29847k(C7729c c7729c, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        c7729c.m29856j(j10);
    }

    /* renamed from: m */
    public static final void m29848m(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: n */
    public static final void m29849n(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: p */
    public static /* synthetic */ void m29850p(C7729c c7729c, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        c7729c.m29858o(z10, z11);
    }

    /* renamed from: d */
    public final void m29851d(long j10, long j11, String str, String str2, int i10, String str3, HashMap hashMap, boolean z10) {
        AbstractC5868k.m23674f(str, "uri");
        AbstractC5868k.m23674f(str2, "domain");
        if (i10 >= 0) {
            C4212d.f18470c.m17606a().m17604f(new a(str3, hashMap, i10, str, z10, str2, j10, j11));
        }
    }

    /* renamed from: f */
    public final void m29852f() {
        AppBean appBean = f28425c;
        if (appBean != null && appBean != null) {
            appBean.setEt(C4216h.f18482a.m17618a() + (SystemClock.elapsedRealtime() - C4209a.f18456a.m17589g()));
        }
    }

    /* renamed from: g */
    public final void m29853g(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        AbstractC5868k.m23674f(str, "mCode");
        AbstractC5868k.m23674f(str2, "title");
        AbstractC5868k.m23674f(str3, "host");
        AbstractC5868k.m23674f(str4, "bussType");
        AbstractC5868k.m23674f(str5, "cdnType");
        AbstractC5868k.m23674f(str6, "hCode");
        AbstractC5868k.m23674f(str7, "eCode");
        AbstractC5868k.m23674f(str8, "uri");
        HashMap hashMap = new HashMap();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        hashMap.put("mCode", str);
        hashMap.put("cdnType", str5);
        hashMap.put("bussType", str4);
        hashMap.put("eCode", str7);
        hashMap.put("title", str2);
        hashMap.put("host", str3);
        hashMap.put("hCode", str6);
        hashMap.put("uri", str8);
        C7730d.f28438a.m29863a("app_error_hint", hashMap, elapsedRealtime, elapsedRealtime, false, true);
    }

    /* renamed from: h */
    public final void m29854h() {
        if (f28425c != null) {
            C7734h.f28449q.m29905a().m29890H(m29845c(false));
        }
        f28425c = null;
    }

    /* renamed from: i */
    public final void m29855i(HashMap hashMap) {
        AbstractC5868k.m23674f(hashMap, "parameters");
        f28427e = hashMap;
    }

    /* renamed from: j */
    public final void m29856j(long j10) {
        if (f28425c == null) {
            if (j10 == 0) {
                j10 = C4216h.f18482a.m17618a() + (SystemClock.elapsedRealtime() - C4209a.f18456a.m17589g());
            }
            long j11 = j10;
            C7737k c7737k = C7737k.f28482a;
            f28425c = new AppBean(c7737k.m29914a().getAppVer(), c7737k.m29914a().getSysVer(), c7737k.m29914a().getUserId(), c7737k.m29914a().getUserName(), j11, 1000 + j11, f28426d);
            C7734h.f28449q.m29905a().m29890H(m29845c(true));
        }
    }

    /* renamed from: l */
    public final void m29857l(long j10) {
        Observable compose = Observable.just("ioSchedulers").compose(AbstractC7029f.m27122c());
        final b bVar = new b(j10);
        Consumer consumer = new Consumer() { // from class: z0.a
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7729c.m29848m(InterfaceC5660l.this, obj);
            }
        };
        final c cVar = c.f28437a;
        compose.subscribe(consumer, new Consumer() { // from class: z0.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7729c.m29849n(InterfaceC5660l.this, obj);
            }
        });
    }

    /* renamed from: o */
    public final void m29858o(boolean z10, boolean z11) {
        long j10;
        long j11;
        if (f28425c != null) {
            long m17618a = C4216h.f18482a.m17618a();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            AppBean appBean = f28425c;
            long j12 = 0;
            if (appBean != null) {
                j10 = appBean.getEt();
            } else {
                j10 = 0;
            }
            C4209a c4209a = C4209a.f18456a;
            if (c4209a.m17589g() < 1) {
                c4209a.m17595m(elapsedRealtime);
            } else {
                j10 = m17618a + (elapsedRealtime - c4209a.m17589g());
            }
            AppBean appBean2 = f28425c;
            if (appBean2 != null) {
                if (appBean2 != null) {
                    j11 = appBean2.getSt();
                } else {
                    j11 = 0;
                }
                if (j10 < j11) {
                    long j13 = 60000;
                    AppBean appBean3 = f28425c;
                    if (appBean3 != null) {
                        j12 = appBean3.getSt();
                    }
                    j10 = j13 + j12;
                }
                AppBean appBean4 = f28425c;
                if (appBean4 != null) {
                    appBean4.setEt(j10);
                }
                C7734h.f28449q.m29905a().m29890H(m29845c(z10));
                if (!z10) {
                    f28425c = null;
                }
            }
        }
    }
}
