package p026b6;

import anet.channel.entity.EventType;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import p007a6.AbstractC0074g;
import p007a6.C0076h;
import p026b6.C1137i;
import p128f6.C4270f;
import p203k4.AbstractC5127x;

/* renamed from: b6.i */
/* loaded from: classes.dex */
public class C1137i {

    /* renamed from: a */
    private final C1132d f4456a;

    /* renamed from: b */
    private final C0076h f4457b;

    /* renamed from: c */
    private final String f4458c;

    /* renamed from: d */
    private final a f4459d = new a(false);

    /* renamed from: e */
    private final a f4460e = new a(true);

    /* renamed from: f */
    private final AtomicMarkableReference f4461f = new AtomicMarkableReference(null, false);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b6.i$a */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a */
        final AtomicMarkableReference f4462a;

        /* renamed from: b */
        private final AtomicReference f4463b = new AtomicReference(null);

        /* renamed from: c */
        private final boolean f4464c;

        public a(boolean z10) {
            int i10;
            this.f4464c = z10;
            if (z10) {
                i10 = 8192;
            } else {
                i10 = EventType.AUTH_FAIL;
            }
            this.f4462a = new AtomicMarkableReference(new C1130b(64, i10), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ Void m5184c() {
            this.f4463b.set(null);
            m5186e();
            return null;
        }

        /* renamed from: d */
        private void m5185d() {
            Callable callable = new Callable() { // from class: b6.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void m5184c;
                    m5184c = C1137i.a.this.m5184c();
                    return m5184c;
                }
            };
            if (AbstractC5127x.m20760a(this.f4463b, null, callable)) {
                C1137i.this.f4457b.m286h(callable);
            }
        }

        /* renamed from: e */
        private void m5186e() {
            Map map;
            synchronized (this) {
                if (this.f4462a.isMarked()) {
                    map = ((C1130b) this.f4462a.getReference()).m5117a();
                    AtomicMarkableReference atomicMarkableReference = this.f4462a;
                    atomicMarkableReference.set((C1130b) atomicMarkableReference.getReference(), false);
                } else {
                    map = null;
                }
            }
            if (map != null) {
                C1137i.this.f4456a.m5138l(C1137i.this.f4458c, map, this.f4464c);
            }
        }

        /* renamed from: b */
        public Map m5187b() {
            return ((C1130b) this.f4462a.getReference()).m5117a();
        }

        /* renamed from: f */
        public boolean m5188f(String str, String str2) {
            synchronized (this) {
                if (!((C1130b) this.f4462a.getReference()).m5118d(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = this.f4462a;
                atomicMarkableReference.set((C1130b) atomicMarkableReference.getReference(), true);
                m5185d();
                return true;
            }
        }
    }

    public C1137i(String str, C4270f c4270f, C0076h c0076h) {
        this.f4458c = str;
        this.f4456a = new C1132d(c4270f);
        this.f4457b = c0076h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ Object m5174h() {
        m5177k();
        return null;
    }

    /* renamed from: i */
    public static C1137i m5175i(String str, C4270f c4270f, C0076h c0076h) {
        C1132d c1132d = new C1132d(c4270f);
        C1137i c1137i = new C1137i(str, c4270f, c0076h);
        ((C1130b) c1137i.f4459d.f4462a.getReference()).m5119e(c1132d.m5136g(str, false));
        ((C1130b) c1137i.f4460e.f4462a.getReference()).m5119e(c1132d.m5136g(str, true));
        c1137i.f4461f.set(c1132d.m5137h(str), false);
        return c1137i;
    }

    /* renamed from: j */
    public static String m5176j(String str, C4270f c4270f) {
        return new C1132d(c4270f).m5137h(str);
    }

    /* renamed from: k */
    private void m5177k() {
        boolean z10;
        String str;
        synchronized (this.f4461f) {
            z10 = false;
            if (this.f4461f.isMarked()) {
                str = m5180g();
                this.f4461f.set(str, false);
                z10 = true;
            } else {
                str = null;
            }
        }
        if (z10) {
            this.f4456a.m5139m(this.f4458c, str);
        }
    }

    /* renamed from: e */
    public Map m5178e() {
        return this.f4459d.m5187b();
    }

    /* renamed from: f */
    public Map m5179f() {
        return this.f4460e.m5187b();
    }

    /* renamed from: g */
    public String m5180g() {
        return (String) this.f4461f.getReference();
    }

    /* renamed from: l */
    public boolean m5181l(String str, String str2) {
        return this.f4459d.m5188f(str, str2);
    }

    /* renamed from: m */
    public void m5182m(String str) {
        String m5116c = C1130b.m5116c(str, EventType.AUTH_FAIL);
        synchronized (this.f4461f) {
            if (AbstractC0074g.m248A(m5116c, (String) this.f4461f.getReference())) {
                return;
            }
            this.f4461f.set(m5116c, true);
            this.f4457b.m286h(new Callable() { // from class: b6.g
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Object m5174h;
                    m5174h = C1137i.this.m5174h();
                    return m5174h;
                }
            });
        }
    }
}
