package p309r3;

import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C3325bt;
import p235m6.C5599c;
import p235m6.InterfaceC5600d;
import p235m6.InterfaceC5601e;
import p248n6.InterfaceC5746a;
import p248n6.InterfaceC5747b;

/* renamed from: r3.b */
/* loaded from: classes.dex */
public final class C6515b implements InterfaceC5746a {

    /* renamed from: a */
    public static final InterfaceC5746a f24981a = new C6515b();

    /* renamed from: r3.b$a */
    /* loaded from: classes.dex */
    private static final class a implements InterfaceC5600d {

        /* renamed from: a */
        static final a f24982a = new a();

        /* renamed from: b */
        private static final C5599c f24983b = C5599c.m22762d(Constants.KEY_SDK_VERSION);

        /* renamed from: c */
        private static final C5599c f24984c = C5599c.m22762d(Constants.KEY_MODEL);

        /* renamed from: d */
        private static final C5599c f24985d = C5599c.m22762d("hardware");

        /* renamed from: e */
        private static final C5599c f24986e = C5599c.m22762d("device");

        /* renamed from: f */
        private static final C5599c f24987f = C5599c.m22762d("product");

        /* renamed from: g */
        private static final C5599c f24988g = C5599c.m22762d("osBuild");

        /* renamed from: h */
        private static final C5599c f24989h = C5599c.m22762d("manufacturer");

        /* renamed from: i */
        private static final C5599c f24990i = C5599c.m22762d("fingerprint");

        /* renamed from: j */
        private static final C5599c f24991j = C5599c.m22762d("locale");

        /* renamed from: k */
        private static final C5599c f24992k = C5599c.m22762d(C3325bt.f14170O);

        /* renamed from: l */
        private static final C5599c f24993l = C5599c.m22762d("mccMnc");

        /* renamed from: m */
        private static final C5599c f24994m = C5599c.m22762d("applicationBuild");

        private a() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(AbstractC6514a abstractC6514a, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22770f(f24983b, abstractC6514a.mo25482m());
            interfaceC5601e.mo22770f(f24984c, abstractC6514a.mo25479j());
            interfaceC5601e.mo22770f(f24985d, abstractC6514a.mo25475f());
            interfaceC5601e.mo22770f(f24986e, abstractC6514a.mo25473d());
            interfaceC5601e.mo22770f(f24987f, abstractC6514a.mo25481l());
            interfaceC5601e.mo22770f(f24988g, abstractC6514a.mo25480k());
            interfaceC5601e.mo22770f(f24989h, abstractC6514a.mo25477h());
            interfaceC5601e.mo22770f(f24990i, abstractC6514a.mo25474e());
            interfaceC5601e.mo22770f(f24991j, abstractC6514a.mo25476g());
            interfaceC5601e.mo22770f(f24992k, abstractC6514a.mo25472c());
            interfaceC5601e.mo22770f(f24993l, abstractC6514a.mo25478i());
            interfaceC5601e.mo22770f(f24994m, abstractC6514a.mo25471b());
        }
    }

    /* renamed from: r3.b$b */
    /* loaded from: classes.dex */
    private static final class b implements InterfaceC5600d {

        /* renamed from: a */
        static final b f24995a = new b();

        /* renamed from: b */
        private static final C5599c f24996b = C5599c.m22762d("logRequest");

        private b() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(AbstractC6523j abstractC6523j, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22770f(f24996b, abstractC6523j.mo25502c());
        }
    }

    /* renamed from: r3.b$c */
    /* loaded from: classes.dex */
    private static final class c implements InterfaceC5600d {

        /* renamed from: a */
        static final c f24997a = new c();

        /* renamed from: b */
        private static final C5599c f24998b = C5599c.m22762d("clientType");

        /* renamed from: c */
        private static final C5599c f24999c = C5599c.m22762d("androidClientInfo");

        private c() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(AbstractC6524k abstractC6524k, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22770f(f24998b, abstractC6524k.mo25504c());
            interfaceC5601e.mo22770f(f24999c, abstractC6524k.mo25503b());
        }
    }

    /* renamed from: r3.b$d */
    /* loaded from: classes.dex */
    private static final class d implements InterfaceC5600d {

        /* renamed from: a */
        static final d f25000a = new d();

        /* renamed from: b */
        private static final C5599c f25001b = C5599c.m22762d("eventTimeMs");

        /* renamed from: c */
        private static final C5599c f25002c = C5599c.m22762d("eventCode");

        /* renamed from: d */
        private static final C5599c f25003d = C5599c.m22762d("eventUptimeMs");

        /* renamed from: e */
        private static final C5599c f25004e = C5599c.m22762d("sourceExtension");

        /* renamed from: f */
        private static final C5599c f25005f = C5599c.m22762d("sourceExtensionJsonProto3");

        /* renamed from: g */
        private static final C5599c f25006g = C5599c.m22762d("timezoneOffsetSeconds");

        /* renamed from: h */
        private static final C5599c f25007h = C5599c.m22762d("networkConnectionInfo");

        private d() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(AbstractC6525l abstractC6525l, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22767a(f25001b, abstractC6525l.mo25509c());
            interfaceC5601e.mo22770f(f25002c, abstractC6525l.mo25508b());
            interfaceC5601e.mo22767a(f25003d, abstractC6525l.mo25510d());
            interfaceC5601e.mo22770f(f25004e, abstractC6525l.mo25512f());
            interfaceC5601e.mo22770f(f25005f, abstractC6525l.mo25513g());
            interfaceC5601e.mo22767a(f25006g, abstractC6525l.mo25514h());
            interfaceC5601e.mo22770f(f25007h, abstractC6525l.mo25511e());
        }
    }

    /* renamed from: r3.b$e */
    /* loaded from: classes.dex */
    private static final class e implements InterfaceC5600d {

        /* renamed from: a */
        static final e f25008a = new e();

        /* renamed from: b */
        private static final C5599c f25009b = C5599c.m22762d("requestTimeMs");

        /* renamed from: c */
        private static final C5599c f25010c = C5599c.m22762d("requestUptimeMs");

        /* renamed from: d */
        private static final C5599c f25011d = C5599c.m22762d("clientInfo");

        /* renamed from: e */
        private static final C5599c f25012e = C5599c.m22762d("logSource");

        /* renamed from: f */
        private static final C5599c f25013f = C5599c.m22762d("logSourceName");

        /* renamed from: g */
        private static final C5599c f25014g = C5599c.m22762d("logEvent");

        /* renamed from: h */
        private static final C5599c f25015h = C5599c.m22762d("qosTier");

        private e() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(AbstractC6526m abstractC6526m, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22767a(f25009b, abstractC6526m.mo25528g());
            interfaceC5601e.mo22767a(f25010c, abstractC6526m.mo25529h());
            interfaceC5601e.mo22770f(f25011d, abstractC6526m.mo25523b());
            interfaceC5601e.mo22770f(f25012e, abstractC6526m.mo25525d());
            interfaceC5601e.mo22770f(f25013f, abstractC6526m.mo25526e());
            interfaceC5601e.mo22770f(f25014g, abstractC6526m.mo25524c());
            interfaceC5601e.mo22770f(f25015h, abstractC6526m.mo25527f());
        }
    }

    /* renamed from: r3.b$f */
    /* loaded from: classes.dex */
    private static final class f implements InterfaceC5600d {

        /* renamed from: a */
        static final f f25016a = new f();

        /* renamed from: b */
        private static final C5599c f25017b = C5599c.m22762d("networkType");

        /* renamed from: c */
        private static final C5599c f25018c = C5599c.m22762d("mobileSubtype");

        private f() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(AbstractC6528o abstractC6528o, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22770f(f25017b, abstractC6528o.mo25540c());
            interfaceC5601e.mo22770f(f25018c, abstractC6528o.mo25539b());
        }
    }

    private C6515b() {
    }

    @Override // p248n6.InterfaceC5746a
    /* renamed from: a */
    public void mo6141a(InterfaceC5747b interfaceC5747b) {
        b bVar = b.f24995a;
        interfaceC5747b.mo23161a(AbstractC6523j.class, bVar);
        interfaceC5747b.mo23161a(C6517d.class, bVar);
        e eVar = e.f25008a;
        interfaceC5747b.mo23161a(AbstractC6526m.class, eVar);
        interfaceC5747b.mo23161a(C6520g.class, eVar);
        c cVar = c.f24997a;
        interfaceC5747b.mo23161a(AbstractC6524k.class, cVar);
        interfaceC5747b.mo23161a(C6518e.class, cVar);
        a aVar = a.f24982a;
        interfaceC5747b.mo23161a(AbstractC6514a.class, aVar);
        interfaceC5747b.mo23161a(C6516c.class, aVar);
        d dVar = d.f25000a;
        interfaceC5747b.mo23161a(AbstractC6525l.class, dVar);
        interfaceC5747b.mo23161a(C6519f.class, dVar);
        f fVar = f.f25016a;
        interfaceC5747b.mo23161a(AbstractC6528o.class, fVar);
        interfaceC5747b.mo23161a(C6522i.class, fVar);
    }
}
