package p216l1;

import android.os.Build;
import android.util.Log;
import com.bumptech.glide.C1588e;
import com.bumptech.glide.C1592i;
import com.bumptech.glide.EnumC1591h;
import com.bumptech.glide.load.data.InterfaceC1604d;
import com.bumptech.glide.load.data.InterfaceC1605e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p109e2.AbstractC4117g;
import p124f2.AbstractC4219a;
import p124f2.AbstractC4220b;
import p124f2.AbstractC4221c;
import p184j1.C4976g;
import p184j1.C4977h;
import p184j1.EnumC4970a;
import p184j1.EnumC4972c;
import p184j1.InterfaceC4975f;
import p184j1.InterfaceC4980k;
import p184j1.InterfaceC4981l;
import p216l1.C5322i;
import p216l1.InterfaceC5319f;
import p243n1.InterfaceC5723a;
import p322s1.C6646u;
import p373w.InterfaceC7339d;

/* renamed from: l1.h */
/* loaded from: classes.dex */
class RunnableC5321h implements InterfaceC5319f.a, Runnable, Comparable, AbstractC4219a.f {

    /* renamed from: A */
    private EnumC4970a f21684A;

    /* renamed from: B */
    private InterfaceC1604d f21685B;

    /* renamed from: C */
    private volatile InterfaceC5319f f21686C;

    /* renamed from: D */
    private volatile boolean f21687D;

    /* renamed from: E */
    private volatile boolean f21688E;

    /* renamed from: F */
    private boolean f21689F;

    /* renamed from: d */
    private final e f21693d;

    /* renamed from: e */
    private final InterfaceC7339d f21694e;

    /* renamed from: h */
    private C1588e f21697h;

    /* renamed from: i */
    private InterfaceC4975f f21698i;

    /* renamed from: j */
    private EnumC1591h f21699j;

    /* renamed from: k */
    private C5327n f21700k;

    /* renamed from: l */
    private int f21701l;

    /* renamed from: m */
    private int f21702m;

    /* renamed from: n */
    private AbstractC5323j f21703n;

    /* renamed from: o */
    private C4977h f21704o;

    /* renamed from: p */
    private b f21705p;

    /* renamed from: q */
    private int f21706q;

    /* renamed from: r */
    private h f21707r;

    /* renamed from: s */
    private g f21708s;

    /* renamed from: t */
    private long f21709t;

    /* renamed from: u */
    private boolean f21710u;

    /* renamed from: v */
    private Object f21711v;

    /* renamed from: w */
    private Thread f21712w;

    /* renamed from: x */
    private InterfaceC4975f f21713x;

    /* renamed from: y */
    private InterfaceC4975f f21714y;

    /* renamed from: z */
    private Object f21715z;

    /* renamed from: a */
    private final C5320g f21690a = new C5320g();

    /* renamed from: b */
    private final List f21691b = new ArrayList();

    /* renamed from: c */
    private final AbstractC4221c f21692c = AbstractC4221c.m17647a();

    /* renamed from: f */
    private final d f21695f = new d();

    /* renamed from: g */
    private final f f21696g = new f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l1.h$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21716a;

        /* renamed from: b */
        static final /* synthetic */ int[] f21717b;

        /* renamed from: c */
        static final /* synthetic */ int[] f21718c;

        static {
            int[] iArr = new int[EnumC4972c.values().length];
            f21718c = iArr;
            try {
                iArr[EnumC4972c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21718c[EnumC4972c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[h.values().length];
            f21717b = iArr2;
            try {
                iArr2[h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21717b[h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21717b[h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21717b[h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21717b[h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f21716a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21716a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21716a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l1.h$b */
    /* loaded from: classes.dex */
    public class b {
        /* renamed from: a */
        void mo21512a(C5330q c5330q);

        /* renamed from: b */
        void mo21513b(RunnableC5321h runnableC5321h);

        /* renamed from: c */
        void mo21514c(InterfaceC5335v interfaceC5335v, EnumC4970a enumC4970a, boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l1.h$c */
    /* loaded from: classes.dex */
    public final class c implements C5322i.a {

        /* renamed from: a */
        private final EnumC4970a f21719a;

        c(EnumC4970a enumC4970a) {
            this.f21719a = enumC4970a;
        }

        @Override // p216l1.C5322i.a
        /* renamed from: a */
        public InterfaceC5335v mo21515a(InterfaceC5335v interfaceC5335v) {
            return RunnableC5321h.this.m21510v(this.f21719a, interfaceC5335v);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l1.h$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        private InterfaceC4975f f21721a;

        /* renamed from: b */
        private InterfaceC4980k f21722b;

        /* renamed from: c */
        private C5334u f21723c;

        d() {
        }

        /* renamed from: a */
        void m21516a() {
            this.f21721a = null;
            this.f21722b = null;
            this.f21723c = null;
        }

        /* renamed from: b */
        void m21517b(e eVar, C4977h c4977h) {
            AbstractC4220b.m17641a("DecodeJob.encode");
            try {
                eVar.mo21520a().mo23117a(this.f21721a, new C5318e(this.f21722b, this.f21723c, c4977h));
            } finally {
                this.f21723c.m21603g();
                AbstractC4220b.m17645e();
            }
        }

        /* renamed from: c */
        boolean m21518c() {
            if (this.f21723c != null) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        void m21519d(InterfaceC4975f interfaceC4975f, InterfaceC4980k interfaceC4980k, C5334u c5334u) {
            this.f21721a = interfaceC4975f;
            this.f21722b = interfaceC4980k;
            this.f21723c = c5334u;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l1.h$e */
    /* loaded from: classes.dex */
    public class e {
        /* renamed from: a */
        InterfaceC5723a mo21520a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l1.h$f */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a */
        private boolean f21724a;

        /* renamed from: b */
        private boolean f21725b;

        /* renamed from: c */
        private boolean f21726c;

        f() {
        }

        /* renamed from: a */
        private boolean m21521a(boolean z10) {
            if ((this.f21726c || z10 || this.f21725b) && this.f21724a) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        synchronized boolean m21522b() {
            this.f21725b = true;
            return m21521a(false);
        }

        /* renamed from: c */
        synchronized boolean m21523c() {
            this.f21726c = true;
            return m21521a(false);
        }

        /* renamed from: d */
        synchronized boolean m21524d(boolean z10) {
            this.f21724a = true;
            return m21521a(z10);
        }

        /* renamed from: e */
        synchronized void m21525e() {
            this.f21725b = false;
            this.f21724a = false;
            this.f21726c = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l1.h$g */
    /* loaded from: classes.dex */
    public enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l1.h$h */
    /* loaded from: classes.dex */
    public enum h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5321h(e eVar, InterfaceC7339d interfaceC7339d) {
        this.f21693d = eVar;
        this.f21694e = interfaceC7339d;
    }

    /* renamed from: A */
    private InterfaceC5335v m21486A(Object obj, EnumC4970a enumC4970a, C5333t c5333t) {
        C4977h m21494l = m21494l(enumC4970a);
        InterfaceC1605e m7332l = this.f21697h.m7315i().m7332l(obj);
        try {
            return c5333t.m21599a(m7332l, m21494l, this.f21701l, this.f21702m, new c(enumC4970a));
        } finally {
            m7332l.mo7413b();
        }
    }

    /* renamed from: B */
    private void m21487B() {
        int i10 = a.f21716a[this.f21708s.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    m21491i();
                    return;
                }
                throw new IllegalStateException("Unrecognized run reason: " + this.f21708s);
            }
            m21505z();
            return;
        }
        this.f21707r = m21493k(h.INITIALIZE);
        this.f21686C = m21492j();
        m21505z();
    }

    /* renamed from: C */
    private void m21488C() {
        Throwable th;
        this.f21692c.mo17649c();
        if (this.f21687D) {
            if (this.f21691b.isEmpty()) {
                th = null;
            } else {
                List list = this.f21691b;
                th = (Throwable) list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.f21687D = true;
    }

    /* renamed from: g */
    private InterfaceC5335v m21489g(InterfaceC1604d interfaceC1604d, Object obj, EnumC4970a enumC4970a) {
        if (obj == null) {
            interfaceC1604d.mo7423b();
            return null;
        }
        try {
            long m17210b = AbstractC4117g.m17210b();
            InterfaceC5335v m21490h = m21490h(obj, enumC4970a);
            if (Log.isLoggable("DecodeJob", 2)) {
                m21496o("Decoded result " + m21490h, m17210b);
            }
            return m21490h;
        } finally {
            interfaceC1604d.mo7423b();
        }
    }

    /* renamed from: h */
    private InterfaceC5335v m21490h(Object obj, EnumC4970a enumC4970a) {
        return m21486A(obj, enumC4970a, this.f21690a.m21468h(obj.getClass()));
    }

    /* renamed from: i */
    private void m21491i() {
        InterfaceC5335v interfaceC5335v;
        if (Log.isLoggable("DecodeJob", 2)) {
            m21497p("Retrieved data", this.f21709t, "data: " + this.f21715z + ", cache key: " + this.f21713x + ", fetcher: " + this.f21685B);
        }
        try {
            interfaceC5335v = m21489g(this.f21685B, this.f21715z, this.f21684A);
        } catch (C5330q e10) {
            e10.m21589i(this.f21714y, this.f21684A);
            this.f21691b.add(e10);
            interfaceC5335v = null;
        }
        if (interfaceC5335v != null) {
            m21499r(interfaceC5335v, this.f21684A, this.f21689F);
        } else {
            m21505z();
        }
    }

    /* renamed from: j */
    private InterfaceC5319f m21492j() {
        int i10 = a.f21717b[this.f21707r.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return null;
                    }
                    throw new IllegalStateException("Unrecognized stage: " + this.f21707r);
                }
                return new C5339z(this.f21690a, this);
            }
            return new C5316c(this.f21690a, this);
        }
        return new C5336w(this.f21690a, this);
    }

    /* renamed from: k */
    private h m21493k(h hVar) {
        int i10 = a.f21717b[hVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3 && i10 != 4) {
                    if (i10 == 5) {
                        if (this.f21703n.mo21532b()) {
                            return h.RESOURCE_CACHE;
                        }
                        return m21493k(h.RESOURCE_CACHE);
                    }
                    throw new IllegalArgumentException("Unrecognized stage: " + hVar);
                }
                return h.FINISHED;
            }
            if (this.f21710u) {
                return h.FINISHED;
            }
            return h.SOURCE;
        }
        if (this.f21703n.mo21531a()) {
            return h.DATA_CACHE;
        }
        return m21493k(h.DATA_CACHE);
    }

    /* renamed from: l */
    private C4977h m21494l(EnumC4970a enumC4970a) {
        boolean z10;
        C4977h c4977h = this.f21704o;
        if (Build.VERSION.SDK_INT < 26) {
            return c4977h;
        }
        if (enumC4970a != EnumC4970a.RESOURCE_DISK_CACHE && !this.f21690a.m21484x()) {
            z10 = false;
        } else {
            z10 = true;
        }
        C4976g c4976g = C6646u.f25485j;
        Boolean bool = (Boolean) c4977h.m20325c(c4976g);
        if (bool != null && (!bool.booleanValue() || z10)) {
            return c4977h;
        }
        C4977h c4977h2 = new C4977h();
        c4977h2.m20326d(this.f21704o);
        c4977h2.m20327e(c4976g, Boolean.valueOf(z10));
        return c4977h2;
    }

    /* renamed from: m */
    private int m21495m() {
        return this.f21699j.ordinal();
    }

    /* renamed from: o */
    private void m21496o(String str, long j10) {
        m21497p(str, j10, null);
    }

    /* renamed from: p */
    private void m21497p(String str, long j10, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" in ");
        sb2.append(AbstractC4117g.m17209a(j10));
        sb2.append(", load key: ");
        sb2.append(this.f21700k);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append(", thread: ");
        sb2.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb2.toString());
    }

    /* renamed from: q */
    private void m21498q(InterfaceC5335v interfaceC5335v, EnumC4970a enumC4970a, boolean z10) {
        m21488C();
        this.f21705p.mo21514c(interfaceC5335v, enumC4970a, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    private void m21499r(InterfaceC5335v interfaceC5335v, EnumC4970a enumC4970a, boolean z10) {
        C5334u c5334u;
        AbstractC4220b.m17641a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (interfaceC5335v instanceof InterfaceC5331r) {
                ((InterfaceC5331r) interfaceC5335v).mo21593a();
            }
            if (this.f21695f.m21518c()) {
                interfaceC5335v = C5334u.m21601d(interfaceC5335v);
                c5334u = interfaceC5335v;
            } else {
                c5334u = 0;
            }
            m21498q(interfaceC5335v, enumC4970a, z10);
            this.f21707r = h.ENCODE;
            try {
                if (this.f21695f.m21518c()) {
                    this.f21695f.m21517b(this.f21693d, this.f21704o);
                }
                m21501t();
            } finally {
                if (c5334u != 0) {
                    c5334u.m21603g();
                }
            }
        } finally {
            AbstractC4220b.m17645e();
        }
    }

    /* renamed from: s */
    private void m21500s() {
        m21488C();
        this.f21705p.mo21512a(new C5330q("Failed to load resource", new ArrayList(this.f21691b)));
        m21502u();
    }

    /* renamed from: t */
    private void m21501t() {
        if (this.f21696g.m21522b()) {
            m21503x();
        }
    }

    /* renamed from: u */
    private void m21502u() {
        if (this.f21696g.m21523c()) {
            m21503x();
        }
    }

    /* renamed from: x */
    private void m21503x() {
        this.f21696g.m21525e();
        this.f21695f.m21516a();
        this.f21690a.m21461a();
        this.f21687D = false;
        this.f21697h = null;
        this.f21698i = null;
        this.f21704o = null;
        this.f21699j = null;
        this.f21700k = null;
        this.f21705p = null;
        this.f21707r = null;
        this.f21686C = null;
        this.f21712w = null;
        this.f21713x = null;
        this.f21715z = null;
        this.f21684A = null;
        this.f21685B = null;
        this.f21709t = 0L;
        this.f21688E = false;
        this.f21711v = null;
        this.f21691b.clear();
        this.f21694e.mo16817a(this);
    }

    /* renamed from: y */
    private void m21504y(g gVar) {
        this.f21708s = gVar;
        this.f21705p.mo21513b(this);
    }

    /* renamed from: z */
    private void m21505z() {
        this.f21712w = Thread.currentThread();
        this.f21709t = AbstractC4117g.m17210b();
        boolean z10 = false;
        while (!this.f21688E && this.f21686C != null && !(z10 = this.f21686C.mo21456a())) {
            this.f21707r = m21493k(this.f21707r);
            this.f21686C = m21492j();
            if (this.f21707r == h.SOURCE) {
                m21504y(g.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f21707r == h.FINISHED || this.f21688E) && !z10) {
            m21500s();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean m21506D() {
        h m21493k = m21493k(h.INITIALIZE);
        if (m21493k != h.RESOURCE_CACHE && m21493k != h.DATA_CACHE) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void m21507a() {
        this.f21688E = true;
        InterfaceC5319f interfaceC5319f = this.f21686C;
        if (interfaceC5319f != null) {
            interfaceC5319f.cancel();
        }
    }

    @Override // p216l1.InterfaceC5319f.a
    /* renamed from: b */
    public void mo21458b(InterfaceC4975f interfaceC4975f, Exception exc, InterfaceC1604d interfaceC1604d, EnumC4970a enumC4970a) {
        interfaceC1604d.mo7423b();
        C5330q c5330q = new C5330q("Fetching data failed", exc);
        c5330q.m21590j(interfaceC4975f, enumC4970a, interfaceC1604d.mo7418a());
        this.f21691b.add(c5330q);
        if (Thread.currentThread() != this.f21712w) {
            m21504y(g.SWITCH_TO_SOURCE_SERVICE);
        } else {
            m21505z();
        }
    }

    @Override // p216l1.InterfaceC5319f.a
    /* renamed from: c */
    public void mo21459c() {
        m21504y(g.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // p216l1.InterfaceC5319f.a
    /* renamed from: d */
    public void mo21460d(InterfaceC4975f interfaceC4975f, Object obj, InterfaceC1604d interfaceC1604d, EnumC4970a enumC4970a, InterfaceC4975f interfaceC4975f2) {
        this.f21713x = interfaceC4975f;
        this.f21715z = obj;
        this.f21685B = interfaceC1604d;
        this.f21684A = enumC4970a;
        this.f21714y = interfaceC4975f2;
        boolean z10 = false;
        if (interfaceC4975f != this.f21690a.m21463c().get(0)) {
            z10 = true;
        }
        this.f21689F = z10;
        if (Thread.currentThread() != this.f21712w) {
            m21504y(g.DECODE_DATA);
            return;
        }
        AbstractC4220b.m17641a("DecodeJob.decodeFromRetrievedData");
        try {
            m21491i();
        } finally {
            AbstractC4220b.m17645e();
        }
    }

    @Override // p124f2.AbstractC4219a.f
    /* renamed from: e */
    public AbstractC4221c mo17640e() {
        return this.f21692c;
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(RunnableC5321h runnableC5321h) {
        int m21495m = m21495m() - runnableC5321h.m21495m();
        if (m21495m == 0) {
            return this.f21706q - runnableC5321h.f21706q;
        }
        return m21495m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public RunnableC5321h m21509n(C1588e c1588e, Object obj, C5327n c5327n, InterfaceC4975f interfaceC4975f, int i10, int i11, Class cls, Class cls2, EnumC1591h enumC1591h, AbstractC5323j abstractC5323j, Map map, boolean z10, boolean z11, boolean z12, C4977h c4977h, b bVar, int i12) {
        this.f21690a.m21482v(c1588e, obj, interfaceC4975f, i10, i11, abstractC5323j, cls, cls2, enumC1591h, c4977h, map, z10, z11, this.f21693d);
        this.f21697h = c1588e;
        this.f21698i = interfaceC4975f;
        this.f21699j = enumC1591h;
        this.f21700k = c5327n;
        this.f21701l = i10;
        this.f21702m = i11;
        this.f21703n = abstractC5323j;
        this.f21710u = z12;
        this.f21704o = c4977h;
        this.f21705p = bVar;
        this.f21706q = i12;
        this.f21708s = g.INITIALIZE;
        this.f21711v = obj;
        return this;
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC4220b.m17643c("DecodeJob#run(reason=%s, model=%s)", this.f21708s, this.f21711v);
        InterfaceC1604d interfaceC1604d = this.f21685B;
        try {
            try {
                if (this.f21688E) {
                    m21500s();
                    return;
                }
                m21487B();
                if (interfaceC1604d != null) {
                    interfaceC1604d.mo7423b();
                }
                AbstractC4220b.m17645e();
            } finally {
                if (interfaceC1604d != null) {
                    interfaceC1604d.mo7423b();
                }
                AbstractC4220b.m17645e();
            }
        } catch (C5315b e10) {
            throw e10;
        } catch (Throwable th) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f21688E + ", stage: " + this.f21707r, th);
            }
            if (this.f21707r != h.ENCODE) {
                this.f21691b.add(th);
                m21500s();
            }
            if (!this.f21688E) {
                throw th;
            }
            throw th;
        }
    }

    /* renamed from: v */
    InterfaceC5335v m21510v(EnumC4970a enumC4970a, InterfaceC5335v interfaceC5335v) {
        InterfaceC5335v interfaceC5335v2;
        InterfaceC4981l interfaceC4981l;
        EnumC4972c enumC4972c;
        InterfaceC4975f c5317d;
        Class<?> cls = interfaceC5335v.get().getClass();
        InterfaceC4980k interfaceC4980k = null;
        if (enumC4970a != EnumC4970a.RESOURCE_DISK_CACHE) {
            InterfaceC4981l m21479s = this.f21690a.m21479s(cls);
            interfaceC4981l = m21479s;
            interfaceC5335v2 = m21479s.mo20332b(this.f21697h, interfaceC5335v, this.f21701l, this.f21702m);
        } else {
            interfaceC5335v2 = interfaceC5335v;
            interfaceC4981l = null;
        }
        if (!interfaceC5335v.equals(interfaceC5335v2)) {
            interfaceC5335v.mo21576b();
        }
        if (this.f21690a.m21483w(interfaceC5335v2)) {
            interfaceC4980k = this.f21690a.m21474n(interfaceC5335v2);
            enumC4972c = interfaceC4980k.mo20331a(this.f21704o);
        } else {
            enumC4972c = EnumC4972c.NONE;
        }
        InterfaceC4980k interfaceC4980k2 = interfaceC4980k;
        if (this.f21703n.mo21534d(!this.f21690a.m21485y(this.f21713x), enumC4970a, enumC4972c)) {
            if (interfaceC4980k2 != null) {
                int i10 = a.f21718c[enumC4972c.ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        c5317d = new C5337x(this.f21690a.m21462b(), this.f21713x, this.f21698i, this.f21701l, this.f21702m, interfaceC4981l, cls, this.f21704o);
                    } else {
                        throw new IllegalArgumentException("Unknown strategy: " + enumC4972c);
                    }
                } else {
                    c5317d = new C5317d(this.f21713x, this.f21698i);
                }
                C5334u m21601d = C5334u.m21601d(interfaceC5335v2);
                this.f21695f.m21519d(c5317d, interfaceC4980k2, m21601d);
                return m21601d;
            }
            throw new C1592i.d(interfaceC5335v2.get().getClass());
        }
        return interfaceC5335v2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m21511w(boolean z10) {
        if (this.f21696g.m21524d(z10)) {
            m21503x();
        }
    }
}
