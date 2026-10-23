package p005a4;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p024b4.AbstractC1069k;
import p024b4.InterfaceC1053c;
import p024b4.InterfaceC1055d;
import p036c4.C1357a;
import p036c4.InterfaceC1358b;
import p095d4.InterfaceC3935a;
import p294q3.C6335b;
import p324s3.AbstractC6661i;
import p324s3.AbstractC6667o;
import p324s3.C6660h;
import p335t3.AbstractC6898f;
import p335t3.AbstractC6899g;
import p335t3.InterfaceC6897e;
import p335t3.InterfaceC6905m;
import p377w3.C7355a;
import p377w3.C7357c;
import p393x3.AbstractC7492a;

/* renamed from: a4.l0 */
/* loaded from: classes.dex */
public class C0040l0 {

    /* renamed from: a */
    private final Context f144a;

    /* renamed from: b */
    private final InterfaceC6897e f145b;

    /* renamed from: c */
    private final InterfaceC1055d f146c;

    /* renamed from: d */
    private final InterfaceC0052r0 f147d;

    /* renamed from: e */
    private final Executor f148e;

    /* renamed from: f */
    private final InterfaceC1358b f149f;

    /* renamed from: g */
    private final InterfaceC3935a f150g;

    /* renamed from: h */
    private final InterfaceC3935a f151h;

    /* renamed from: i */
    private final InterfaceC1053c f152i;

    public C0040l0(Context context, InterfaceC6897e interfaceC6897e, InterfaceC1055d interfaceC1055d, InterfaceC0052r0 interfaceC0052r0, Executor executor, InterfaceC1358b interfaceC1358b, InterfaceC3935a interfaceC3935a, InterfaceC3935a interfaceC3935a2, InterfaceC1053c interfaceC1053c) {
        this.f144a = context;
        this.f145b = interfaceC6897e;
        this.f146c = interfaceC1055d;
        this.f147d = interfaceC0052r0;
        this.f148e = executor;
        this.f149f = interfaceC1358b;
        this.f150g = interfaceC3935a;
        this.f151h = interfaceC3935a2;
        this.f152i = interfaceC1053c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ Boolean m167l(AbstractC6667o abstractC6667o) {
        return Boolean.valueOf(this.f146c.mo4927w(abstractC6667o));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Iterable m168m(AbstractC6667o abstractC6667o) {
        return this.f146c.mo4920i(abstractC6667o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m169n(Iterable iterable, AbstractC6667o abstractC6667o, long j10) {
        this.f146c.mo4925u(iterable);
        this.f146c.mo4924p(abstractC6667o, this.f150g.mo16762a() + j10);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object m170o(Iterable iterable) {
        this.f146c.mo4921j(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Object m171p() {
        this.f152i.mo4916a();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Object m172q(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.f152i.mo4918d(((Integer) r0.getValue()).intValue(), C7357c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Object m173r(AbstractC6667o abstractC6667o, long j10) {
        this.f146c.mo4924p(abstractC6667o, this.f150g.mo16762a() + j10);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ Object m174s(AbstractC6667o abstractC6667o, int i10) {
        this.f147d.mo139b(abstractC6667o, i10 + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m175t(final AbstractC6667o abstractC6667o, final int i10, Runnable runnable) {
        try {
            try {
                InterfaceC1358b interfaceC1358b = this.f149f;
                final InterfaceC1055d interfaceC1055d = this.f146c;
                Objects.requireNonNull(interfaceC1055d);
                interfaceC1358b.mo5022c(new InterfaceC1358b.a() { // from class: a4.c0
                    @Override // p036c4.InterfaceC1358b.a
                    public final Object execute() {
                        return Integer.valueOf(InterfaceC1055d.this.mo4919g());
                    }
                });
                if (!m177k()) {
                    this.f149f.mo5022c(new InterfaceC1358b.a() { // from class: a4.d0
                        @Override // p036c4.InterfaceC1358b.a
                        public final Object execute() {
                            Object m174s = null;
                            m174s = C0040l0.this.m174s(abstractC6667o, i10);
                            return m174s;
                        }
                    });
                } else {
                    m178u(abstractC6667o, i10);
                }
            } catch (C1357a unused) {
                this.f147d.mo139b(abstractC6667o, i10 + 1);
            }
        } finally {
            runnable.run();
        }
    }

    /* renamed from: j */
    public AbstractC6661i m176j(InterfaceC6905m interfaceC6905m) {
        InterfaceC1358b interfaceC1358b = this.f149f;
        final InterfaceC1053c interfaceC1053c = this.f152i;
        Objects.requireNonNull(interfaceC1053c);
        return interfaceC6905m.mo7891b(AbstractC6661i.m26020a().mo25990i(this.f150g.mo16762a()).mo25992k(this.f151h.mo16762a()).mo25991j("GDT_CLIENT_METRICS").mo25989h(new C6660h(C6335b.m25117b("proto"), ((C7355a) interfaceC1358b.mo5022c(new InterfaceC1358b.a() { // from class: a4.b0
            @Override // p036c4.InterfaceC1358b.a
            public final Object execute() {
                return InterfaceC1053c.this.mo4917b();
            }
        })).m28390f())).mo25985d());
    }

    /* renamed from: k */
    boolean m177k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f144a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    AbstractC6899g m178u(final AbstractC6667o abstractC6667o, int i10) {
        AbstractC6899g mo7890a;
        InterfaceC6905m mo26827a = this.f145b.mo26827a(abstractC6667o.mo26004b());
        long j10 = 0;
        AbstractC6899g m26831e = AbstractC6899g.m26831e(0L);
        while (true) {
            final long j11 = j10;
            while (((Boolean) this.f149f.mo5022c(new InterfaceC1358b.a() { // from class: a4.e0
                @Override // p036c4.InterfaceC1358b.a
                public final Object execute() {
                    Boolean m167l;
                    m167l = C0040l0.this.m167l(abstractC6667o);
                    return m167l;
                }
            })).booleanValue()) {
                final Iterable iterable = (Iterable) this.f149f.mo5022c(new InterfaceC1358b.a() { // from class: a4.f0
                    @Override // p036c4.InterfaceC1358b.a
                    public final Object execute() {
                        Iterable m168m;
                        m168m = C0040l0.this.m168m(abstractC6667o);
                        return m168m;
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return m26831e;
                }
                if (mo26827a == null) {
                    AbstractC7492a.m28688b("Uploader", "Unknown backend for %s, deleting event batch for it...", abstractC6667o);
                    mo7890a = AbstractC6899g.m26829a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((AbstractC1069k) it.next()).mo4913b());
                    }
                    if (abstractC6667o.m26038e()) {
                        arrayList.add(m176j(mo26827a));
                    }
                    mo7890a = mo26827a.mo7890a(AbstractC6898f.m26828a().mo26819b(arrayList).mo26820c(abstractC6667o.mo26005c()).mo26818a());
                }
                m26831e = mo7890a;
                if (m26831e.mo26822c() == AbstractC6899g.a.TRANSIENT_ERROR) {
                    this.f149f.mo5022c(new InterfaceC1358b.a() { // from class: a4.g0
                        @Override // p036c4.InterfaceC1358b.a
                        public final Object execute() {
                            Object m169n = null;
                            m169n = C0040l0.this.m169n(iterable, abstractC6667o, j11);
                            return m169n;
                        }
                    });
                    this.f147d.mo138a(abstractC6667o, i10 + 1, true);
                    return m26831e;
                }
                this.f149f.mo5022c(new InterfaceC1358b.a() { // from class: a4.h0
                    @Override // p036c4.InterfaceC1358b.a
                    public final Object execute() {
                        Object m170o = null;
                        m170o = C0040l0.this.m170o(iterable);
                        return m170o;
                    }
                });
                if (m26831e.mo26822c() == AbstractC6899g.a.OK) {
                    j10 = Math.max(j11, m26831e.mo26821b());
                    if (abstractC6667o.m26038e()) {
                        this.f149f.mo5022c(new InterfaceC1358b.a() { // from class: a4.i0
                            @Override // p036c4.InterfaceC1358b.a
                            public final Object execute() {
                                Object m171p = null;
                                m171p = C0040l0.this.m171p();
                                return m171p;
                            }
                        });
                    }
                } else if (m26831e.mo26822c() == AbstractC6899g.a.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String mo25983j = ((AbstractC1069k) it2.next()).mo4913b().mo25983j();
                        if (!hashMap.containsKey(mo25983j)) {
                            hashMap.put(mo25983j, 1);
                        } else {
                            hashMap.put(mo25983j, Integer.valueOf(((Integer) hashMap.get(mo25983j)).intValue() + 1));
                        }
                    }
                    this.f149f.mo5022c(new InterfaceC1358b.a() { // from class: a4.j0
                        @Override // p036c4.InterfaceC1358b.a
                        public final Object execute() {
                            Object m172q = null;
                            m172q = C0040l0.this.m172q(hashMap);
                            return m172q;
                        }
                    });
                }
            }
            this.f149f.mo5022c(new InterfaceC1358b.a() { // from class: a4.k0
                @Override // p036c4.InterfaceC1358b.a
                public final Object execute() {
                    Object m173r = null;
                    m173r = C0040l0.this.m173r(abstractC6667o, j11);
                    return m173r;
                }
            });
            return m26831e;
        }
    }

    /* renamed from: v */
    public void m179v(final AbstractC6667o abstractC6667o, final int i10, final Runnable runnable) {
        this.f148e.execute(new Runnable() { // from class: a4.a0
            @Override // java.lang.Runnable
            public final void run() {
                C0040l0.this.m175t(abstractC6667o, i10, runnable);
            }
        });
    }
}
