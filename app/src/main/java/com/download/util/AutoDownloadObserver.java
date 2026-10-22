package com.download.util;

import androidx.lifecycle.AbstractC0749c;
import androidx.lifecycle.InterfaceC0751e;
import androidx.lifecycle.InterfaceC0758l;
import be.AbstractC1320p;
import be.C1328x;
import cc.C1466m0;
import ee.InterfaceC4181d;
import ge.AbstractC4445l;
import me.InterfaceC5664p;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p136fe.AbstractC4313d;
import p142g3.C4343e;
import p170i2.C4842a;
import p258o3.C5911g;
import ve.AbstractC7272e;
import ve.C7327w0;
import ve.InterfaceC7261a0;

/* loaded from: classes.dex */
public final class AutoDownloadObserver implements InterfaceC0751e {

    /* renamed from: a */
    public static final C1659a f6984a = new C1659a(null);

    /* renamed from: b */
    private static volatile boolean f6985b = true;

    /* renamed from: c */
    private static AutoDownloadObserver f6986c;

    /* renamed from: com.download.util.AutoDownloadObserver$a */
    /* loaded from: classes.dex */
    public static final class C1659a {

        /* renamed from: com.download.util.AutoDownloadObserver$a$a */
        /* loaded from: classes.dex */
        static final class a extends AbstractC4445l implements InterfaceC5664p {

            /* renamed from: e */
            int f6987e;

            a(InterfaceC4181d interfaceC4181d) {
                super(2, interfaceC4181d);
            }

            @Override // ge.AbstractC4434a
            /* renamed from: a */
            public final InterfaceC4181d mo2390a(Object obj, InterfaceC4181d interfaceC4181d) {
                return new a(interfaceC4181d);
            }

            @Override // ge.AbstractC4434a
            /* renamed from: l */
            public final Object mo2392l(Object obj) {
                AbstractC4313d.m18094c();
                if (this.f6987e == 0) {
                    AbstractC1320p.m5976b(obj);
                    C4343e.m18227a().m18233e();
                    return C1328x.f4998a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // me.InterfaceC5664p
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object mo2391h(InterfaceC7261a0 interfaceC7261a0, InterfaceC4181d interfaceC4181d) {
                return ((a) mo2390a(interfaceC7261a0, interfaceC4181d)).mo2392l(C1328x.f4998a);
            }
        }

        private C1659a() {
        }

        public /* synthetic */ C1659a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final AutoDownloadObserver m7593a() {
            return AutoDownloadObserver.f6986c;
        }

        /* renamed from: b */
        public final void m7594b() {
            AbstractC7272e.m28125b(C7327w0.f27234a, null, null, new a(null), 3, null);
        }

        /* renamed from: c */
        public final void m7595c(AbstractC0749c abstractC0749c) {
            AbstractC5868k.m23674f(abstractC0749c, "lifecycle");
            if (m7593a() == null) {
                synchronized (this) {
                    C1659a c1659a = AutoDownloadObserver.f6984a;
                    if (c1659a.m7593a() == null) {
                        c1659a.m7596d(new AutoDownloadObserver(null));
                    }
                    C1328x c1328x = C1328x.f4998a;
                }
            }
            if (C4842a.f20329a.m19920a().m19953b0()) {
                AutoDownloadObserver m7593a = m7593a();
                AbstractC5868k.m23671c(m7593a);
                abstractC0749c.mo3703a(m7593a);
            }
        }

        /* renamed from: d */
        public final void m7596d(AutoDownloadObserver autoDownloadObserver) {
            AutoDownloadObserver.f6986c = autoDownloadObserver;
        }
    }

    /* renamed from: com.download.util.AutoDownloadObserver$b */
    /* loaded from: classes.dex */
    static final class C1660b extends AbstractC4445l implements InterfaceC5664p {

        /* renamed from: e */
        int f6988e;

        C1660b(InterfaceC4181d interfaceC4181d) {
            super(2, interfaceC4181d);
        }

        @Override // ge.AbstractC4434a
        /* renamed from: a */
        public final InterfaceC4181d mo2390a(Object obj, InterfaceC4181d interfaceC4181d) {
            return new C1660b(interfaceC4181d);
        }

        @Override // ge.AbstractC4434a
        /* renamed from: l */
        public final Object mo2392l(Object obj) {
            AbstractC4313d.m18094c();
            if (this.f6988e == 0) {
                AbstractC1320p.m5976b(obj);
                C4343e.m18227a().m18233e();
                return C1328x.f4998a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // me.InterfaceC5664p
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object mo2391h(InterfaceC7261a0 interfaceC7261a0, InterfaceC4181d interfaceC4181d) {
            return ((C1660b) mo2390a(interfaceC7261a0, interfaceC4181d)).mo2392l(C1328x.f4998a);
        }
    }

    /* renamed from: com.download.util.AutoDownloadObserver$c */
    /* loaded from: classes.dex */
    static final class C1661c extends AbstractC4445l implements InterfaceC5664p {

        /* renamed from: e */
        int f6989e;

        C1661c(InterfaceC4181d interfaceC4181d) {
            super(2, interfaceC4181d);
        }

        @Override // ge.AbstractC4434a
        /* renamed from: a */
        public final InterfaceC4181d mo2390a(Object obj, InterfaceC4181d interfaceC4181d) {
            return new C1661c(interfaceC4181d);
        }

        @Override // ge.AbstractC4434a
        /* renamed from: l */
        public final Object mo2392l(Object obj) {
            AbstractC4313d.m18094c();
            if (this.f6989e == 0) {
                AbstractC1320p.m5976b(obj);
                C4343e.m18227a().m18235i();
                return C1328x.f4998a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // me.InterfaceC5664p
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object mo2391h(InterfaceC7261a0 interfaceC7261a0, InterfaceC4181d interfaceC4181d) {
            return ((C1661c) mo2390a(interfaceC7261a0, interfaceC4181d)).mo2392l(C1328x.f4998a);
        }
    }

    private AutoDownloadObserver() {
    }

    public /* synthetic */ AutoDownloadObserver(AbstractC5864g abstractC5864g) {
        this();
    }

    @InterfaceC0758l(AbstractC0749c.b.ON_START)
    public final synchronized void pauseDownload() {
        AbstractC7272e.m28125b(C7327w0.f27234a, null, null, new C1660b(null), 3, null);
    }

    @InterfaceC0758l(AbstractC0749c.b.ON_STOP)
    public final synchronized void startDownload() {
        if (C1466m0.f5627a.m6835H()) {
            return;
        }
        if (C5911g.f23514h.m23905a().m23900q()) {
            AbstractC7272e.m28125b(C7327w0.f27234a, null, null, new C1661c(null), 3, null);
        }
    }
}
