package p216l1;

import p109e2.AbstractC4121k;
import p124f2.AbstractC4219a;
import p124f2.AbstractC4221c;
import p373w.InterfaceC7339d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l1.u */
/* loaded from: classes.dex */
public final class C5334u implements InterfaceC5335v, AbstractC4219a.f {

    /* renamed from: e */
    private static final InterfaceC7339d f21838e = AbstractC4219a.m17633d(20, new a());

    /* renamed from: a */
    private final AbstractC4221c f21839a = AbstractC4221c.m17647a();

    /* renamed from: b */
    private InterfaceC5335v f21840b;

    /* renamed from: c */
    private boolean f21841c;

    /* renamed from: d */
    private boolean f21842d;

    /* renamed from: l1.u$a */
    /* loaded from: classes.dex */
    class a implements AbstractC4219a.d {
        a() {
        }

        @Override // p124f2.AbstractC4219a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5334u mo17637a() {
            return new C5334u();
        }
    }

    C5334u() {
    }

    /* renamed from: a */
    private void m21600a(InterfaceC5335v interfaceC5335v) {
        this.f21842d = false;
        this.f21841c = true;
        this.f21840b = interfaceC5335v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C5334u m21601d(InterfaceC5335v interfaceC5335v) {
        C5334u c5334u = (C5334u) AbstractC4121k.m17226d((C5334u) f21838e.mo16818b());
        c5334u.m21600a(interfaceC5335v);
        return c5334u;
    }

    /* renamed from: f */
    private void m21602f() {
        this.f21840b = null;
        f21838e.mo16817a(this);
    }

    @Override // p216l1.InterfaceC5335v
    /* renamed from: b */
    public synchronized void mo21576b() {
        this.f21839a.mo17649c();
        this.f21842d = true;
        if (!this.f21841c) {
            this.f21840b.mo21576b();
            m21602f();
        }
    }

    @Override // p216l1.InterfaceC5335v
    /* renamed from: c */
    public Class mo21577c() {
        return this.f21840b.mo21577c();
    }

    @Override // p124f2.AbstractC4219a.f
    /* renamed from: e */
    public AbstractC4221c mo17640e() {
        return this.f21839a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized void m21603g() {
        this.f21839a.mo17649c();
        if (this.f21841c) {
            this.f21841c = false;
            if (this.f21842d) {
                mo21576b();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    @Override // p216l1.InterfaceC5335v
    public Object get() {
        return this.f21840b.get();
    }

    @Override // p216l1.InterfaceC5335v
    public int getSize() {
        return this.f21840b.getSize();
    }
}
