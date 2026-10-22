package kotlinx.coroutines.internal;

import be.AbstractC1321q;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: kotlinx.coroutines.internal.c */
/* loaded from: classes3.dex */
public abstract class AbstractC5264c extends AbstractC5277p {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f21467a = AtomicReferenceFieldUpdater.newUpdater(AbstractC5264c.class, Object.class, "_consensus");
    private volatile Object _consensus = AbstractC5263b.f21465a;

    @Override // kotlinx.coroutines.internal.AbstractC5277p
    /* renamed from: a */
    public AbstractC5264c mo21172a() {
        return this;
    }

    @Override // kotlinx.coroutines.internal.AbstractC5277p
    /* renamed from: c */
    public final Object mo21173c(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == AbstractC5263b.f21465a) {
            obj2 = m21175e(mo21177g(obj));
        }
        mo21174d(obj, obj2);
        return obj2;
    }

    /* renamed from: d */
    public abstract void mo21174d(Object obj, Object obj2);

    /* renamed from: e */
    public final Object m21175e(Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = AbstractC5263b.f21465a;
        if (obj2 != obj3) {
            return obj2;
        }
        if (AbstractC1321q.m5977a(f21467a, this, obj3, obj)) {
            return obj;
        }
        return this._consensus;
    }

    /* renamed from: f */
    public long m21176f() {
        return 0L;
    }

    /* renamed from: g */
    public abstract Object mo21177g(Object obj);
}
