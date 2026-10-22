package kotlinx.coroutines.internal;

import be.AbstractC1321q;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ne.AbstractC5864g;

/* renamed from: kotlinx.coroutines.internal.l */
/* loaded from: classes3.dex */
public final class C5273l {
    private volatile Object _next = null;
    private volatile long _state = 0;

    /* renamed from: a */
    private final int f21490a;

    /* renamed from: b */
    private AtomicReferenceArray f21491b;

    /* renamed from: c */
    private final int f21492c;

    /* renamed from: d */
    private final boolean f21493d;

    /* renamed from: h */
    public static final a f21489h = new a(null);

    /* renamed from: g */
    public static final C5280s f21488g = new C5280s("REMOVE_FROZEN");

    /* renamed from: e */
    private static final AtomicReferenceFieldUpdater f21486e = AtomicReferenceFieldUpdater.newUpdater(C5273l.class, Object.class, "_next");

    /* renamed from: f */
    private static final AtomicLongFieldUpdater f21487f = AtomicLongFieldUpdater.newUpdater(C5273l.class, "_state");

    /* renamed from: kotlinx.coroutines.internal.l$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final int m21226a(long j10) {
            return (j10 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: b */
        public final long m21227b(long j10, int i10) {
            return m21229d(j10, 1073741823L) | (i10 << 0);
        }

        /* renamed from: c */
        public final long m21228c(long j10, int i10) {
            return m21229d(j10, 1152921503533105152L) | (i10 << 30);
        }

        /* renamed from: d */
        public final long m21229d(long j10, long j11) {
            return j10 & (j11 ^ (-1));
        }
    }

    /* renamed from: kotlinx.coroutines.internal.l$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        public final int f21494a;

        public b(int i10) {
            this.f21494a = i10;
        }
    }

    public C5273l(int i10, boolean z10) {
        boolean z11;
        this.f21492c = i10;
        this.f21493d = z10;
        int i11 = i10 - 1;
        this.f21490a = i11;
        this.f21491b = new AtomicReferenceArray(i10);
        if (i11 <= 1073741823) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if ((i10 & i11) == 0) {
                return;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    private final C5273l m21215b(long j10) {
        C5273l c5273l = new C5273l(this.f21492c * 2, this.f21493d);
        int i10 = (int) ((1073741823 & j10) >> 0);
        int i11 = (int) ((1152921503533105152L & j10) >> 30);
        while (true) {
            int i12 = this.f21490a;
            if ((i10 & i12) != (i11 & i12)) {
                Object obj = this.f21491b.get(i12 & i10);
                if (obj == null) {
                    obj = new b(i10);
                }
                c5273l.f21491b.set(c5273l.f21490a & i10, obj);
                i10++;
            } else {
                c5273l._state = f21489h.m21229d(j10, 1152921504606846976L);
                return c5273l;
            }
        }
    }

    /* renamed from: c */
    private final C5273l m21216c(long j10) {
        while (true) {
            C5273l c5273l = (C5273l) this._next;
            if (c5273l != null) {
                return c5273l;
            }
            AbstractC1321q.m5977a(f21486e, this, null, m21215b(j10));
        }
    }

    /* renamed from: e */
    private final C5273l m21217e(int i10, Object obj) {
        Object obj2 = this.f21491b.get(this.f21490a & i10);
        if ((obj2 instanceof b) && ((b) obj2).f21494a == i10) {
            this.f21491b.set(i10 & this.f21490a, obj);
            return this;
        }
        return null;
    }

    /* renamed from: h */
    private final long m21218h() {
        long j10;
        long j11;
        do {
            j10 = this._state;
            if ((j10 & 1152921504606846976L) != 0) {
                return j10;
            }
            j11 = j10 | 1152921504606846976L;
        } while (!f21487f.compareAndSet(this, j10, j11));
        return j11;
    }

    /* renamed from: k */
    private final C5273l m21219k(int i10, int i11) {
        long j10;
        int i12;
        do {
            j10 = this._state;
            i12 = (int) ((1073741823 & j10) >> 0);
            if ((1152921504606846976L & j10) != 0) {
                return m21224i();
            }
        } while (!f21487f.compareAndSet(this, j10, f21489h.m21227b(j10, i11)));
        this.f21491b.set(i12 & this.f21490a, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
    
        return 1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m21220a(java.lang.Object r13) {
        /*
            r12 = this;
        L0:
            long r2 = r12._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 == 0) goto L12
            kotlinx.coroutines.internal.l$a r13 = kotlinx.coroutines.internal.C5273l.f21489h
            int r13 = r13.m21226a(r2)
            return r13
        L12:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            r8 = 0
            long r0 = r0 >> r8
            int r1 = (int) r0
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r0 = 30
            long r4 = r4 >> r0
            int r9 = (int) r4
            int r10 = r12.f21490a
            int r0 = r9 + 2
            r0 = r0 & r10
            r4 = r1 & r10
            r5 = 1
            if (r0 != r4) goto L2e
            return r5
        L2e:
            boolean r0 = r12.f21493d
            r4 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 != 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.f21491b
            r11 = r9 & r10
            java.lang.Object r0 = r0.get(r11)
            if (r0 == 0) goto L4d
            int r0 = r12.f21492c
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L4c
            int r9 = r9 - r1
            r1 = r9 & r4
            int r0 = r0 >> 1
            if (r1 <= r0) goto L0
        L4c:
            return r5
        L4d:
            int r0 = r9 + 1
            r0 = r0 & r4
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.internal.C5273l.f21487f
            kotlinx.coroutines.internal.l$a r4 = kotlinx.coroutines.internal.C5273l.f21489h
            long r4 = r4.m21228c(r2, r0)
            r0 = r1
            r1 = r12
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.f21491b
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r12
        L68:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L72
            goto L7d
        L72:
            kotlinx.coroutines.internal.l r0 = r0.m21224i()
            kotlinx.coroutines.internal.l r0 = r0.m21217e(r9, r13)
            if (r0 == 0) goto L7d
            goto L68
        L7d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C5273l.m21220a(java.lang.Object):int");
    }

    /* renamed from: d */
    public final boolean m21221d() {
        long j10;
        do {
            j10 = this._state;
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!f21487f.compareAndSet(this, j10, j10 | 2305843009213693952L));
        return true;
    }

    /* renamed from: f */
    public final int m21222f() {
        long j10 = this._state;
        return 1073741823 & (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j10) >> 0)));
    }

    /* renamed from: g */
    public final boolean m21223g() {
        long j10 = this._state;
        if (((int) ((1073741823 & j10) >> 0)) != ((int) ((j10 & 1152921503533105152L) >> 30))) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final C5273l m21224i() {
        return m21216c(m21218h());
    }

    /* renamed from: j */
    public final Object m21225j() {
        while (true) {
            long j10 = this._state;
            if ((1152921504606846976L & j10) != 0) {
                return f21488g;
            }
            int i10 = (int) ((1073741823 & j10) >> 0);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = this.f21490a;
            if ((i11 & i12) == (i10 & i12)) {
                return null;
            }
            Object obj = this.f21491b.get(i12 & i10);
            if (obj == null) {
                if (this.f21493d) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i13 = (i10 + 1) & 1073741823;
                if (f21487f.compareAndSet(this, j10, f21489h.m21227b(j10, i13))) {
                    this.f21491b.set(this.f21490a & i10, null);
                    return obj;
                }
                if (this.f21493d) {
                    C5273l c5273l = this;
                    do {
                        c5273l = c5273l.m21219k(i10, i13);
                    } while (c5273l != null);
                    return obj;
                }
            }
        }
    }
}
