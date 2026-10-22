package p203k4;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: k4.x */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC5127x {
    /* renamed from: a */
    public static /* synthetic */ boolean m20760a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
