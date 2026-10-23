package p421z0;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import anet.channel.entity.EventType;
import be.AbstractC1314j;
import be.C1328x;
import be.EnumC1316l;
import be.InterfaceC1312h;
import com.bigbee.p049db.EventDbModel;
import com.dcs.bean.DomainInfo;
import com.raizlabs.android.dbflow.config.FlowLog;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.taobao.accs.utl.BaseMonitor;
import com.umeng.analytics.pro.C3384f;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import okhttp3.Dns;
import okhttp3.Interceptor;
import p002a1.C0002a;
import p002a1.InterfaceC0004c;
import p108e1.C4110d;
import p108e1.InterfaceC4107a;
import p123f1.AbstractC4210b;
import p123f1.C4209a;
import p123f1.C4212d;
import p123f1.C4213e;
import p123f1.C4214f;
import p123f1.C4216h;
import p123f1.C4218j;
import p348u2.AbstractC7029f;
import p374w0.C7343a;
import p390x0.C7482a;
import p390x0.InterfaceC7483b;
import p406y0.AbstractC7656a;
import p421z0.C7734h;

/* renamed from: z0.h */
/* loaded from: classes.dex */
public final class C7734h {

    /* renamed from: q */
    public static final b f28449q = new b(null);

    /* renamed from: r */
    private static final InterfaceC1312h f28450r;

    /* renamed from: a */
    private String f28451a;

    /* renamed from: b */
    private Context f28452b;

    /* renamed from: c */
    private InterfaceC7483b f28453c;

    /* renamed from: d */
    private InterfaceC0004c f28454d;

    /* renamed from: e */
    private InterfaceC4107a f28455e;

    /* renamed from: f */
    private boolean f28456f;

    /* renamed from: g */
    private boolean f28457g;

    /* renamed from: h */
    private Activity f28458h;

    /* renamed from: i */
    private long f28459i;

    /* renamed from: j */
    private long f28460j;

    /* renamed from: k */
    private boolean f28461k;

    /* renamed from: l */
    private Dns f28462l;

    /* renamed from: m */
    private Interceptor f28463m;

    /* renamed from: n */
    private boolean f28464n;

    /* renamed from: o */
    private final d f28465o;

    /* renamed from: p */
    private c f28466p;

    /* renamed from: z0.h$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final a f28467a = new a();

        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7734h invoke() {
            return new C7734h(null);
        }
    }

    /* renamed from: z0.h$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final C7734h m29905a() {
            return (C7734h) C7734h.f28450r.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0.h$c */
    /* loaded from: classes.dex */
    public final class c extends BroadcastReceiver {

        /* renamed from: a */
        private String f28468a;

        /* renamed from: z0.h$c$a */
        /* loaded from: classes.dex */
        static final class a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            final /* synthetic */ C7734h f28470a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C7734h c7734h) {
                super(1);
                this.f28470a = c7734h;
            }

            /* renamed from: a */
            public final void m29910a(String str) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if ((elapsedRealtime - this.f28470a.f28460j) / 1000 >= C4209a.f18456a.m17586d()) {
                    this.f28470a.f28460j = elapsedRealtime;
                    C7729c c7729c = C7729c.f28423a;
                    c7729c.m29854h();
                    C7729c.m29847k(c7729c, 0L, 1, null);
                }
            }

            @Override // me.InterfaceC5660l
            /* renamed from: f */
            public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                m29910a((String) obj);
                return C1328x.f4998a;
            }
        }

        /* renamed from: z0.h$c$b */
        /* loaded from: classes.dex */
        static final class b extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            public static final b f28471a = new b();

            b() {
                super(1);
            }

            /* renamed from: a */
            public final void m29911a(Throwable th) {
                th.printStackTrace();
            }

            @Override // me.InterfaceC5660l
            /* renamed from: f */
            public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                m29911a((Throwable) obj);
                return C1328x.f4998a;
            }
        }

        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m29908c(InterfaceC5660l interfaceC5660l, Object obj) {
            AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
            interfaceC5660l.mo542f(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m29909d(InterfaceC5660l interfaceC5660l, Object obj) {
            AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
            interfaceC5660l.mo542f(obj);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            AbstractC5868k.m23674f(intent, "intent");
            String action = intent.getAction();
            this.f28468a = action;
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != -2128145023) {
                    if (hashCode != -1454123155) {
                        if (hashCode == 823795052 && action.equals("android.intent.action.USER_PRESENT")) {
                            Observable compose = Observable.just("ioSchedulers").compose(AbstractC7029f.m27122c());
                            final a aVar = new a(C7734h.this);
                            Consumer consumer = new Consumer() { // from class: z0.i
                                @Override // io.reactivex.functions.Consumer
                                public final void accept(Object obj) {
                                    C7734h.c.m29908c(InterfaceC5660l.this, obj);
                                }
                            };
                            final b bVar = b.f28471a;
                            compose.subscribe(consumer, new Consumer() { // from class: z0.j
                                @Override // io.reactivex.functions.Consumer
                                public final void accept(Object obj) {
                                    C7734h.c.m29909d(InterfaceC5660l.this, obj);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    action.equals("android.intent.action.SCREEN_ON");
                    return;
                }
                if (action.equals("android.intent.action.SCREEN_OFF")) {
                    C7734h.this.f28460j = SystemClock.elapsedRealtime();
                }
            }
        }
    }

    /* renamed from: z0.h$d */
    /* loaded from: classes.dex */
    public static final class d extends BroadcastReceiver {
        d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            InterfaceC4107a interfaceC4107a;
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            AbstractC5868k.m23674f(intent, "intent");
            intent.getAction();
            if (AbstractC5868k.m23669a(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
                Parcelable parcelableExtra = intent.getParcelableExtra("networkInfo");
                AbstractC5868k.m23672d(parcelableExtra, "null cannot be cast to non-null type android.net.NetworkInfo");
                NetworkInfo networkInfo = (NetworkInfo) parcelableExtra;
                if (NetworkInfo.State.CONNECTED == networkInfo.getState() && networkInfo.isAvailable() && (interfaceC4107a = C7734h.this.f28455e) != null) {
                    interfaceC4107a.mo17177b();
                }
            }
        }
    }

    /* renamed from: z0.h$e */
    /* loaded from: classes.dex */
    static final class e extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ Activity f28474b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Activity activity) {
            super(1);
            this.f28474b = activity;
        }

        /* renamed from: a */
        public final void m29912a(String str) {
            C7734h.this.m29886v(this.f28474b);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m29912a((String) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: z0.h$f */
    /* loaded from: classes.dex */
    static final class f extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final f f28475a = new f();

        f() {
            super(1);
        }

        /* renamed from: a */
        public final void m29913a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m29913a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: z0.h$g */
    /* loaded from: classes.dex */
    public static final class g implements C4218j.c {
        g() {
        }

        @Override // p123f1.C4218j.c
        /* renamed from: a */
        public void mo17628a() {
            C7734h.m29887y(C7734h.this, true, false, 2, null);
        }
    }

    /* renamed from: z0.h$h */
    /* loaded from: classes.dex */
    public static final class h implements C4212d.c {

        /* renamed from: b */
        final /* synthetic */ String f28478b;

        /* renamed from: c */
        final /* synthetic */ String f28479c;

        h(String str, String str2) {
            this.f28478b = str;
            this.f28479c = str2;
        }

        @Override // p123f1.C4212d.c
        /* renamed from: a */
        public void mo17607a() {
            C7734h.m29887y(C7734h.this, false, false, 2, null);
            C7734h.this.m29899t();
            C7737k.f28482a.m29918e(this.f28478b, this.f28479c);
            C7729c.m29847k(C7729c.f28423a, 0L, 1, null);
        }
    }

    static {
        InterfaceC1312h m5964a;
        m5964a = AbstractC1314j.m5964a(EnumC1316l.SYNCHRONIZED, a.f28467a);
        f28450r = m5964a;
    }

    public /* synthetic */ C7734h(AbstractC5864g abstractC5864g) {
        this();
    }

    /* renamed from: A */
    public static /* synthetic */ void m29870A(C7734h c7734h, boolean z10, DomainInfo domainInfo, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, boolean z11, int i11, Object obj) {
        boolean z12 = false;
        boolean z13 = false;
        if ((i11 & 1) != 0) {
            z12 = false;
        } else {
            z12 = z10;
        }
        if ((i11 & EventType.AUTH_FAIL) != 0) {
            z13 = false;
        } else {
            z13 = z11;
        }
        c7734h.m29903z(z12, domainInfo, str, i10, str2, str3, str4, str5, str6, str7, z13);
    }

    /* renamed from: C */
    private final void m29871C() {
        if (this.f28464n && !this.f28461k) {
            this.f28466p = new c();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            Context context = this.f28452b;
            if (context != null) {
                context.registerReceiver(this.f28466p, intentFilter);
            }
            this.f28457g = true;
        }
    }

    /* renamed from: D */
    private final void m29872D() {
        Context context;
        if (this.f28464n && this.f28457g && !this.f28461k && (context = this.f28452b) != null) {
            context.unregisterReceiver(this.f28466p);
        }
        this.f28457g = false;
    }

    /* renamed from: F */
    public static /* synthetic */ void m29873F(C7734h c7734h, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "";
        }
        c7734h.m29889E(str, str2);
    }

    /* renamed from: G */
    private final void m29874G() {
        Context context;
        if (this.f28464n && this.f28456f && (context = this.f28452b) != null) {
            context.unregisterReceiver(this.f28465o);
        }
        this.f28456f = false;
    }

    /* renamed from: l */
    public static /* synthetic */ void m29882l(C7734h c7734h, Context context, boolean z10, InterfaceC4107a interfaceC4107a, InterfaceC0004c interfaceC0004c, Dns dns, Interceptor interceptor, int i10, Object obj) {
        InterfaceC4107a interfaceC4107a2;
        InterfaceC0004c interfaceC0004c2;
        if ((i10 & 4) != 0) {
            interfaceC4107a2 = null;
        } else {
            interfaceC4107a2 = interfaceC4107a;
        }
        if ((i10 & 8) != 0) {
            interfaceC0004c2 = null;
        } else {
            interfaceC0004c2 = interfaceC0004c;
        }
        c7734h.m29894k(context, z10, interfaceC4107a2, interfaceC0004c2, dns, interceptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m29883q(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m29884r(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: s */
    private final void m29885s() {
        if (this.f28464n) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.DATE_CHANGED");
            Context context = this.f28452b;
            if (context != null) {
                context.registerReceiver(this.f28465o, intentFilter);
            }
            this.f28456f = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public final void m29886v(Activity activity) {
        if (AbstractC5868k.m23669a(activity, this.f28458h)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f28460j = elapsedRealtime;
            if ((elapsedRealtime - this.f28459i) / 1000 >= C4209a.f18456a.m17586d()) {
                C7729c c7729c = C7729c.f28423a;
                c7729c.m29854h();
                C7729c.m29847k(c7729c, 0L, 1, null);
                this.f28459i = 0L;
            }
        }
    }

    /* renamed from: y */
    public static /* synthetic */ void m29887y(C7734h c7734h, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        c7734h.m29902x(z10, z11);
    }

    /* renamed from: B */
    public final void m29888B(DomainInfo domainInfo) {
        AbstractC5868k.m23674f(domainInfo, "domainInfo");
        AbstractC7656a.f28098d = domainInfo;
        AbstractC7656a.f28099e = domainInfo.getFirst();
        AbstractC7656a.f28100f = domainInfo.getSecond();
    }

    /* renamed from: E */
    public final void m29889E(String str, String str2) {
        AbstractC5868k.m23674f(str, "uName");
        C4212d.f18470c.m17606a().m17604f(new h(str, str2));
    }

    /* renamed from: H */
    public final void m29890H(EventDbModel eventDbModel) {
        AbstractC5868k.m23674f(eventDbModel, "dbModel");
        InterfaceC0004c interfaceC0004c = this.f28454d;
        if (interfaceC0004c != null) {
            interfaceC0004c.mo9c(eventDbModel);
        }
    }

    /* renamed from: h */
    public final void m29891h() {
        C4218j.f18486c.m17627a().m17624c();
        C4212d.f18470c.m17606a().m17603e();
        m29887y(this, false, false, 2, null);
        m29874G();
        m29872D();
    }

    /* renamed from: i */
    public final void m29892i(String str) {
        long j10;
        C4209a c4209a = C4209a.f18456a;
        c4209a.m17593k(false);
        c4209a.m17595m(SystemClock.elapsedRealtime());
        if (!TextUtils.isEmpty(str) && TextUtils.isDigitsOnly(str)) {
            C4216h c4216h = C4216h.f18482a;
            if (str != null) {
                j10 = Long.parseLong(str);
            } else {
                j10 = 0;
            }
            c4216h.m17619b(j10);
        }
        if (this.f28464n) {
            C7729c.f28423a.m29857l(C4216h.f18482a.m17618a() - (c4209a.m17589g() - c4209a.m17588f()));
        }
    }

    /* renamed from: j */
    public final Context m29893j() {
        return this.f28452b;
    }

    /* renamed from: k */
    public final void m29894k(Context context, boolean z10, InterfaceC4107a interfaceC4107a, InterfaceC0004c interfaceC0004c, Dns dns, Interceptor interceptor) {
        AbstractC5868k.m23674f(context, "ctx");
        AbstractC5868k.m23674f(dns, BaseMonitor.COUNT_POINT_DNS);
        this.f28461k = z10;
        m29895m(context, interfaceC0004c, dns, interceptor);
        if (interfaceC4107a == null) {
            InterfaceC0004c interfaceC0004c2 = this.f28454d;
            AbstractC5868k.m23671c(interfaceC0004c2);
            interfaceC4107a = new C4110d(interfaceC0004c2, 0L, 2, null);
        }
        this.f28455e = interfaceC4107a;
    }

    /* renamed from: m */
    public final void m29895m(Context context, InterfaceC0004c interfaceC0004c, Dns dns, Interceptor interceptor) {
        AbstractC5868k.m23674f(context, "ctx");
        AbstractC5868k.m23674f(dns, BaseMonitor.COUNT_POINT_DNS);
        this.f28452b = context;
        C4209a c4209a = C4209a.f18456a;
        c4209a.m17594l(SystemClock.elapsedRealtime());
        c4209a.m17595m(c4209a.m17588f());
        this.f28460j = c4209a.m17588f();
        FlowManager.init(context);
        FlowLog.setMinimumLoggingLevel(FlowLog.Level.E);
        this.f28462l = dns;
        this.f28463m = interceptor;
        C7482a c7482a = new C7482a();
        this.f28453c = c7482a;
        if (interfaceC0004c == null) {
            AbstractC5868k.m23671c(c7482a);
            interfaceC0004c = new C0002a(c7482a, dns, interceptor);
        }
        this.f28454d = interfaceC0004c;
    }

    /* renamed from: n */
    public final void m29896n() {
        this.f28458h = null;
    }

    /* renamed from: o */
    public final void m29897o(Activity activity) {
        AbstractC5868k.m23674f(activity, "aty");
        this.f28459i = SystemClock.elapsedRealtime();
        Activity activity2 = this.f28458h;
        if (activity2 != null && AbstractC5868k.m23669a(activity2, activity)) {
            C7729c.f28423a.m29852f();
            C4218j.f18486c.m17627a().m17624c();
        }
        this.f28458h = activity;
    }

    /* renamed from: p */
    public final void m29898p(Activity activity) {
        AbstractC5868k.m23674f(activity, "aty");
        if (this.f28459i != 0) {
            if (AbstractC5868k.m23669a(Thread.currentThread().getName(), "main")) {
                Observable compose = Observable.just("ioSchedulers").compose(AbstractC7029f.m27122c());
                final e eVar = new e(activity);
                Consumer consumer = new Consumer() { // from class: z0.f
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C7734h.m29883q(InterfaceC5660l.this, obj);
                    }
                };
                final f fVar = f.f28475a;
                compose.subscribe(consumer, new Consumer() { // from class: z0.g
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C7734h.m29884r(InterfaceC5660l.this, obj);
                    }
                });
            } else {
                m29886v(activity);
            }
        }
        C4218j.b bVar = C4218j.f18486c;
        bVar.m17627a().m17624c();
        C4218j m17627a = bVar.m17627a();
        C4209a c4209a = C4209a.f18456a;
        m17627a.m17625d(c4209a.m17587e(), c4209a.m17587e(), new g());
    }

    /* renamed from: t */
    public final void m29899t() {
        InterfaceC4107a interfaceC4107a = this.f28455e;
        if (interfaceC4107a != null) {
            interfaceC4107a.mo17176a();
        }
    }

    /* renamed from: u */
    public final void m29900u() {
        C4213e.f18477b.m17613a().m17611c("server_time", 0L);
    }

    /* renamed from: w */
    public final void m29901w(EventDbModel eventDbModel) {
        AbstractC5868k.m23674f(eventDbModel, "dbModel");
        InterfaceC0004c interfaceC0004c = this.f28454d;
        if (interfaceC0004c != null) {
            interfaceC0004c.mo8b(eventDbModel);
        }
    }

    /* renamed from: x */
    public final void m29902x(boolean z10, boolean z11) {
        if (this.f28464n && z11) {
            C7729c.m29850p(C7729c.f28423a, z10, false, 2, null);
        }
    }

    /* renamed from: z */
    public final void m29903z(boolean z10, DomainInfo domainInfo, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, boolean z11) {
        AbstractC5868k.m23674f(domainInfo, "domainInfo");
        AbstractC5868k.m23674f(str, "appId");
        AbstractC5868k.m23674f(str2, "sysVer");
        AbstractC5868k.m23674f(str3, "macAddr");
        AbstractC5868k.m23674f(str4, "reserve1");
        AbstractC5868k.m23674f(str5, "sn");
        AbstractC5868k.m23674f(str6, "userId");
        AbstractC5868k.m23674f(str7, "userName");
        m29888B(domainInfo);
        if (z10) {
            AbstractC4210b.f18468a = 6;
        }
        C7737k c7737k = C7737k.f28482a;
        String valueOf = String.valueOf(i10);
        String str8 = Build.MODEL;
        AbstractC5868k.m23673e(str8, "MODEL");
        c7737k.m29916c(str, valueOf, str2, str8, str3, str4, str5, str6, str7);
        C4214f c4214f = C4214f.f18481a;
        Context context = this.f28452b;
        AbstractC5868k.m23671c(context);
        if (c4214f.m17615b(context)) {
            if (z11) {
                new C7343a().m28329a(this.f28462l, this.f28463m);
            }
            InterfaceC4107a interfaceC4107a = this.f28455e;
            if (interfaceC4107a != null) {
                interfaceC4107a.mo17177b();
            }
        } else {
            m29885s();
        }
        m29871C();
    }

    private C7734h() {
        this.f28451a = C7734h.class.getSimpleName();
        this.f28461k = true;
        Dns dns = Dns.SYSTEM;
        AbstractC5868k.m23673e(dns, "SYSTEM");
        this.f28462l = dns;
        this.f28464n = true;
        this.f28465o = new d();
    }
}
