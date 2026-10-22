package kotlinx.coroutines.internal;

import be.AbstractC1321q;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: kotlinx.coroutines.internal.k */
/* loaded from: classes3.dex */
public class C5272k {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f21485a = AtomicReferenceFieldUpdater.newUpdater(C5272k.class, Object.class, "_cur");
    private volatile Object _cur;

    public C5272k(boolean z10) {
        this._cur = new C5273l(8, z10);
    }

    /* renamed from: a */
    public final boolean m21211a(Object obj) {
        while (true) {
            C5273l c5273l = (C5273l) this._cur;
            int m21220a = c5273l.m21220a(obj);
            if (m21220a == 0) {
                return true;
            }
            if (m21220a != 1) {
                if (m21220a == 2) {
                    return false;
                }
            } else {
                AbstractC1321q.m5977a(f21485a, this, c5273l, c5273l.m21224i());
            }
        }
    }

    /* renamed from: b */
    public final void m21212b() {
        while (true) {
            C5273l c5273l = (C5273l) this._cur;
            if (c5273l.m21221d()) {
                return;
            } else {
                AbstractC1321q.m5977a(f21485a, this, c5273l, c5273l.m21224i());
            }
        }
    }

    /* renamed from: c */
    public final int m21213c() {
        return ((C5273l) this._cur).m21222f();
    }

    /* renamed from: d */
    public final Object m21214d() {
        while (true) {
            C5273l c5273l = (C5273l) this._cur;
            Object m21225j = c5273l.m21225j();
            if (m21225j != C5273l.f21488g) {
                return m21225j;
            }
            AbstractC1321q.m5977a(f21485a, this, c5273l, c5273l.m21224i());
        }
    }
}
