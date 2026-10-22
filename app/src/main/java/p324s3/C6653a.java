package p324s3;

import android.support.v4.media.session.AbstractC0272b;
import p235m6.C5599c;
import p235m6.InterfaceC5600d;
import p235m6.InterfaceC5601e;
import p248n6.InterfaceC5746a;
import p248n6.InterfaceC5747b;
import p283p6.C6220a;
import p377w3.C7355a;
import p377w3.C7356b;
import p377w3.C7357c;
import p377w3.C7358d;
import p377w3.C7359e;
import p377w3.C7360f;

/* renamed from: s3.a */
/* loaded from: classes.dex */
public final class C6653a implements InterfaceC5746a {

    /* renamed from: a */
    public static final InterfaceC5746a f25508a = new C6653a();

    /* renamed from: s3.a$a */
    /* loaded from: classes.dex */
    private static final class a implements InterfaceC5600d {

        /* renamed from: a */
        static final a f25509a = new a();

        /* renamed from: b */
        private static final C5599c f25510b = C5599c.m22761a("window").m22766b(C6220a.m24809b().m24811c(1).m24810a()).m22765a();

        /* renamed from: c */
        private static final C5599c f25511c = C5599c.m22761a("logSourceMetrics").m22766b(C6220a.m24809b().m24811c(2).m24810a()).m22765a();

        /* renamed from: d */
        private static final C5599c f25512d = C5599c.m22761a("globalMetrics").m22766b(C6220a.m24809b().m24811c(3).m24810a()).m22765a();

        /* renamed from: e */
        private static final C5599c f25513e = C5599c.m22761a("appNamespace").m22766b(C6220a.m24809b().m24811c(4).m24810a()).m22765a();

        private a() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(C7355a c7355a, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22770f(f25510b, c7355a.m28389d());
            interfaceC5601e.mo22770f(f25511c, c7355a.m28388c());
            interfaceC5601e.mo22770f(f25512d, c7355a.m28387b());
            interfaceC5601e.mo22770f(f25513e, c7355a.m28386a());
        }
    }

    /* renamed from: s3.a$b */
    /* loaded from: classes.dex */
    private static final class b implements InterfaceC5600d {

        /* renamed from: a */
        static final b f25514a = new b();

        /* renamed from: b */
        private static final C5599c f25515b = C5599c.m22761a("storageMetrics").m22766b(C6220a.m24809b().m24811c(1).m24810a()).m22765a();

        private b() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(C7356b c7356b, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22770f(f25515b, c7356b.m28397a());
        }
    }

    /* renamed from: s3.a$c */
    /* loaded from: classes.dex */
    private static final class c implements InterfaceC5600d {

        /* renamed from: a */
        static final c f25516a = new c();

        /* renamed from: b */
        private static final C5599c f25517b = C5599c.m22761a("eventsDroppedCount").m22766b(C6220a.m24809b().m24811c(1).m24810a()).m22765a();

        /* renamed from: c */
        private static final C5599c f25518c = C5599c.m22761a("reason").m22766b(C6220a.m24809b().m24811c(3).m24810a()).m22765a();

        private c() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(C7357c c7357c, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22767a(f25517b, c7357c.m28401a());
            interfaceC5601e.mo22770f(f25518c, c7357c.m28402b());
        }
    }

    /* renamed from: s3.a$d */
    /* loaded from: classes.dex */
    private static final class d implements InterfaceC5600d {

        /* renamed from: a */
        static final d f25519a = new d();

        /* renamed from: b */
        private static final C5599c f25520b = C5599c.m22761a("logSource").m22766b(C6220a.m24809b().m24811c(1).m24810a()).m22765a();

        /* renamed from: c */
        private static final C5599c f25521c = C5599c.m22761a("logEventDropped").m22766b(C6220a.m24809b().m24811c(2).m24810a()).m22765a();

        private d() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(C7358d c7358d, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22770f(f25520b, c7358d.m28408b());
            interfaceC5601e.mo22770f(f25521c, c7358d.m28407a());
        }
    }

    /* renamed from: s3.a$e */
    /* loaded from: classes.dex */
    private static final class e implements InterfaceC5600d {

        /* renamed from: a */
        static final e f25522a = new e();

        /* renamed from: b */
        private static final C5599c f25523b = C5599c.m22762d("clientMetrics");

        private e() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo6142a(Object obj, Object obj2) {
            AbstractC0272b.m941a(obj);
            m25976b(null, (InterfaceC5601e) obj2);
        }

        /* renamed from: b */
        public void m25976b(AbstractC6664l abstractC6664l, InterfaceC5601e interfaceC5601e) {
            throw null;
        }
    }

    /* renamed from: s3.a$f */
    /* loaded from: classes.dex */
    private static final class f implements InterfaceC5600d {

        /* renamed from: a */
        static final f f25524a = new f();

        /* renamed from: b */
        private static final C5599c f25525b = C5599c.m22761a("currentCacheSizeBytes").m22766b(C6220a.m24809b().m24811c(1).m24810a()).m22765a();

        /* renamed from: c */
        private static final C5599c f25526c = C5599c.m22761a("maxCacheSizeBytes").m22766b(C6220a.m24809b().m24811c(2).m24810a()).m22765a();

        private f() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(C7359e c7359e, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22767a(f25525b, c7359e.m28413a());
            interfaceC5601e.mo22767a(f25526c, c7359e.m28414b());
        }
    }

    /* renamed from: s3.a$g */
    /* loaded from: classes.dex */
    private static final class g implements InterfaceC5600d {

        /* renamed from: a */
        static final g f25527a = new g();

        /* renamed from: b */
        private static final C5599c f25528b = C5599c.m22761a("startMs").m22766b(C6220a.m24809b().m24811c(1).m24810a()).m22765a();

        /* renamed from: c */
        private static final C5599c f25529c = C5599c.m22761a("endMs").m22766b(C6220a.m24809b().m24811c(2).m24810a()).m22765a();

        private g() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(C7360f c7360f, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22767a(f25528b, c7360f.m28420b());
            interfaceC5601e.mo22767a(f25529c, c7360f.m28419a());
        }
    }

    private C6653a() {
    }

    @Override // p248n6.InterfaceC5746a
    /* renamed from: a */
    public void mo6141a(InterfaceC5747b interfaceC5747b) {
        interfaceC5747b.mo23161a(AbstractC6664l.class, e.f25522a);
        interfaceC5747b.mo23161a(C7355a.class, a.f25509a);
        interfaceC5747b.mo23161a(C7360f.class, g.f25527a);
        interfaceC5747b.mo23161a(C7358d.class, d.f25519a);
        interfaceC5747b.mo23161a(C7357c.class, c.f25516a);
        interfaceC5747b.mo23161a(C7356b.class, b.f25514a);
        interfaceC5747b.mo23161a(C7359e.class, f.f25524a);
    }
}
