package p216l1;

import p109e2.AbstractC4121k;
import p184j1.InterfaceC4975f;

/* renamed from: l1.p */
/* loaded from: classes.dex */
class C5329p implements InterfaceC5335v {

    /* renamed from: a */
    private final boolean f21816a;

    /* renamed from: b */
    private final boolean f21817b;

    /* renamed from: c */
    private final InterfaceC5335v f21818c;

    /* renamed from: d */
    private final a f21819d;

    /* renamed from: e */
    private final InterfaceC4975f f21820e;

    /* renamed from: f */
    private int f21821f;

    /* renamed from: g */
    private boolean f21822g;

    /* renamed from: l1.p$a */
    /* loaded from: classes.dex */
    interface a {
        /* renamed from: a */
        void mo21541a(InterfaceC4975f interfaceC4975f, C5329p c5329p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5329p(InterfaceC5335v interfaceC5335v, boolean z10, boolean z11, InterfaceC4975f interfaceC4975f, a aVar) {
        this.f21818c = (InterfaceC5335v) AbstractC4121k.m17226d(interfaceC5335v);
        this.f21816a = z10;
        this.f21817b = z11;
        this.f21820e = interfaceC4975f;
        this.f21819d = (a) AbstractC4121k.m17226d(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m21575a() {
        if (!this.f21822g) {
            this.f21821f++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    @Override // p216l1.InterfaceC5335v
    /* renamed from: b */
    public synchronized void mo21576b() {
        if (this.f21821f <= 0) {
            if (!this.f21822g) {
                this.f21822g = true;
                if (this.f21817b) {
                    this.f21818c.mo21576b();
                }
            } else {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
    }

    @Override // p216l1.InterfaceC5335v
    /* renamed from: c */
    public Class mo21577c() {
        return this.f21818c.mo21577c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public InterfaceC5335v m21578d() {
        return this.f21818c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m21579e() {
        return this.f21816a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m21580f() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f21821f;
            if (i10 > 0) {
                z10 = true;
                int i11 = i10 - 1;
                this.f21821f = i11;
                if (i11 != 0) {
                    z10 = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z10) {
            this.f21819d.mo21541a(this.f21820e, this);
        }
    }

    @Override // p216l1.InterfaceC5335v
    public Object get() {
        return this.f21818c.get();
    }

    @Override // p216l1.InterfaceC5335v
    public int getSize() {
        return this.f21818c.getSize();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f21816a + ", listener=" + this.f21819d + ", key=" + this.f21820e + ", acquired=" + this.f21821f + ", isRecycled=" + this.f21822g + ", resource=" + this.f21818c + '}';
    }
}
