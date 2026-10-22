package be;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: be.q */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC1321q {
    /* renamed from: a */
    public static /* synthetic */ boolean m5977a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }
}
