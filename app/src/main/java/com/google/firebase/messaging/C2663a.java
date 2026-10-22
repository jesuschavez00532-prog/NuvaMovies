package com.google.firebase.messaging;

import android.support.v4.media.session.AbstractC0272b;
import com.lzy.okgo.model.Progress;
import com.taobao.accs.common.Constants;
import p235m6.C5599c;
import p235m6.InterfaceC5600d;
import p235m6.InterfaceC5601e;
import p248n6.InterfaceC5746a;
import p248n6.InterfaceC5747b;
import p283p6.C6220a;
import p427z6.C7758a;
import p427z6.C7759b;

/* renamed from: com.google.firebase.messaging.a */
/* loaded from: classes.dex */
public final class C2663a implements InterfaceC5746a {

    /* renamed from: a */
    public static final InterfaceC5746a f10225a = new C2663a();

    /* renamed from: com.google.firebase.messaging.a$a */
    /* loaded from: classes.dex */
    private static final class a implements InterfaceC5600d {

        /* renamed from: a */
        static final a f10226a = new a();

        /* renamed from: b */
        private static final C5599c f10227b = C5599c.m22761a("projectNumber").m22766b(C6220a.m24809b().m24811c(1).m24810a()).m22765a();

        /* renamed from: c */
        private static final C5599c f10228c = C5599c.m22761a("messageId").m22766b(C6220a.m24809b().m24811c(2).m24810a()).m22765a();

        /* renamed from: d */
        private static final C5599c f10229d = C5599c.m22761a("instanceId").m22766b(C6220a.m24809b().m24811c(3).m24810a()).m22765a();

        /* renamed from: e */
        private static final C5599c f10230e = C5599c.m22761a("messageType").m22766b(C6220a.m24809b().m24811c(4).m24810a()).m22765a();

        /* renamed from: f */
        private static final C5599c f10231f = C5599c.m22761a("sdkPlatform").m22766b(C6220a.m24809b().m24811c(5).m24810a()).m22765a();

        /* renamed from: g */
        private static final C5599c f10232g = C5599c.m22761a(Constants.KEY_PACKAGE_NAME).m22766b(C6220a.m24809b().m24811c(6).m24810a()).m22765a();

        /* renamed from: h */
        private static final C5599c f10233h = C5599c.m22761a("collapseKey").m22766b(C6220a.m24809b().m24811c(7).m24810a()).m22765a();

        /* renamed from: i */
        private static final C5599c f10234i = C5599c.m22761a(Progress.PRIORITY).m22766b(C6220a.m24809b().m24811c(8).m24810a()).m22765a();

        /* renamed from: j */
        private static final C5599c f10235j = C5599c.m22761a("ttl").m22766b(C6220a.m24809b().m24811c(9).m24810a()).m22765a();

        /* renamed from: k */
        private static final C5599c f10236k = C5599c.m22761a("topic").m22766b(C6220a.m24809b().m24811c(10).m24810a()).m22765a();

        /* renamed from: l */
        private static final C5599c f10237l = C5599c.m22761a("bulkId").m22766b(C6220a.m24809b().m24811c(11).m24810a()).m22765a();

        /* renamed from: m */
        private static final C5599c f10238m = C5599c.m22761a("event").m22766b(C6220a.m24809b().m24811c(12).m24810a()).m22765a();

        /* renamed from: n */
        private static final C5599c f10239n = C5599c.m22761a("analyticsLabel").m22766b(C6220a.m24809b().m24811c(13).m24810a()).m22765a();

        /* renamed from: o */
        private static final C5599c f10240o = C5599c.m22761a("campaignId").m22766b(C6220a.m24809b().m24811c(14).m24810a()).m22765a();

        /* renamed from: p */
        private static final C5599c f10241p = C5599c.m22761a("composerLabel").m22766b(C6220a.m24809b().m24811c(15).m24810a()).m22765a();

        private a() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(C7758a c7758a, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22767a(f10227b, c7758a.m29973l());
            interfaceC5601e.mo22770f(f10228c, c7758a.m29969h());
            interfaceC5601e.mo22770f(f10229d, c7758a.m29968g());
            interfaceC5601e.mo22770f(f10230e, c7758a.m29970i());
            interfaceC5601e.mo22770f(f10231f, c7758a.m29974m());
            interfaceC5601e.mo22770f(f10232g, c7758a.m29971j());
            interfaceC5601e.mo22770f(f10233h, c7758a.m29965d());
            interfaceC5601e.mo22768b(f10234i, c7758a.m29972k());
            interfaceC5601e.mo22768b(f10235j, c7758a.m29976o());
            interfaceC5601e.mo22770f(f10236k, c7758a.m29975n());
            interfaceC5601e.mo22767a(f10237l, c7758a.m29963b());
            interfaceC5601e.mo22770f(f10238m, c7758a.m29967f());
            interfaceC5601e.mo22770f(f10239n, c7758a.m29962a());
            interfaceC5601e.mo22767a(f10240o, c7758a.m29964c());
            interfaceC5601e.mo22770f(f10241p, c7758a.m29966e());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$b */
    /* loaded from: classes.dex */
    private static final class b implements InterfaceC5600d {

        /* renamed from: a */
        static final b f10242a = new b();

        /* renamed from: b */
        private static final C5599c f10243b = C5599c.m22761a("messagingClientEvent").m22766b(C6220a.m24809b().m24811c(1).m24810a()).m22765a();

        private b() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(C7759b c7759b, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22770f(f10243b, c7759b.m29991a());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$c */
    /* loaded from: classes.dex */
    private static final class c implements InterfaceC5600d {

        /* renamed from: a */
        static final c f10244a = new c();

        /* renamed from: b */
        private static final C5599c f10245b = C5599c.m22762d("messagingClientEventExtension");

        private c() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo6142a(Object obj, Object obj2) {
            AbstractC0272b.m941a(obj);
            m11093b(null, (InterfaceC5601e) obj2);
        }

        /* renamed from: b */
        public void m11093b(AbstractC2685h0 abstractC2685h0, InterfaceC5601e interfaceC5601e) {
            throw null;
        }
    }

    private C2663a() {
    }

    @Override // p248n6.InterfaceC5746a
    /* renamed from: a */
    public void mo6141a(InterfaceC5747b interfaceC5747b) {
        interfaceC5747b.mo23161a(AbstractC2685h0.class, c.f10244a);
        interfaceC5747b.mo23161a(C7759b.class, b.f10242a);
        interfaceC5747b.mo23161a(C7758a.class, a.f10226a);
    }
}
