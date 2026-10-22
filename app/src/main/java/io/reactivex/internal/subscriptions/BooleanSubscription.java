package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicBoolean;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class BooleanSubscription extends AtomicBoolean implements InterfaceC5075d {
    private static final long serialVersionUID = -8127758972444290902L;

    @Override // p197jf.InterfaceC5075d
    public void cancel() {
        lazySet(true);
    }

    public boolean isCancelled() {
        return get();
    }

    @Override // p197jf.InterfaceC5075d
    public void request(long j10) {
        SubscriptionHelper.validate(j10);
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "BooleanSubscription(cancelled=" + get() + ")";
    }
}
