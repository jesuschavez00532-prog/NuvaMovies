package ve;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import ne.AbstractC5864g;

/* renamed from: ve.r */
/* loaded from: classes3.dex */
public class C7311r {

    /* renamed from: b */
    private static final AtomicIntegerFieldUpdater f27214b = AtomicIntegerFieldUpdater.newUpdater(C7311r.class, "_handled");
    private volatile int _handled;

    /* renamed from: a */
    public final Throwable f27215a;

    public C7311r(Throwable th, boolean z10) {
        this.f27215a = th;
        this._handled = z10 ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    /* renamed from: a */
    public final boolean m28274a() {
        return this._handled;
    }

    /* renamed from: b */
    public final boolean m28275b() {
        return f27214b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return AbstractC7273e0.m28127a(this) + '[' + this.f27215a + ']';
    }

    public /* synthetic */ C7311r(Throwable th, boolean z10, int i10, AbstractC5864g abstractC5864g) {
        this(th, (i10 & 2) != 0 ? false : z10);
    }
}
