package io.reactivex.internal.subscriptions;

import io.reactivex.annotations.Nullable;
import p197jf.InterfaceC5074c;

/* loaded from: classes3.dex */
public class DeferredScalarSubscription<T> extends BasicIntQueueSubscription<T> {
    static final int CANCELLED = 4;
    static final int FUSED_CONSUMED = 32;
    static final int FUSED_EMPTY = 8;
    static final int FUSED_READY = 16;
    static final int HAS_REQUEST_HAS_VALUE = 3;
    static final int HAS_REQUEST_NO_VALUE = 2;
    static final int NO_REQUEST_HAS_VALUE = 1;
    static final int NO_REQUEST_NO_VALUE = 0;
    private static final long serialVersionUID = -2151279923272604993L;
    protected final InterfaceC5074c downstream;
    protected T value;

    public DeferredScalarSubscription(InterfaceC5074c interfaceC5074c) {
        this.downstream = interfaceC5074c;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p197jf.InterfaceC5075d
    public void cancel() {
        set(4);
        this.value = null;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    public final void complete(T t10) {
        int i10 = get();
        while (i10 != 8) {
            if ((i10 & (-3)) != 0) {
                return;
            }
            if (i10 == 2) {
                lazySet(3);
                InterfaceC5074c interfaceC5074c = this.downstream;
                interfaceC5074c.onNext(t10);
                if (get() != 4) {
                    interfaceC5074c.onComplete();
                    return;
                }
                return;
            }
            this.value = t10;
            if (compareAndSet(0, 1)) {
                return;
            }
            i10 = get();
            if (i10 == 4) {
                this.value = null;
                return;
            }
        }
        this.value = t10;
        lazySet(16);
        InterfaceC5074c interfaceC5074c2 = this.downstream;
        interfaceC5074c2.onNext(t10);
        if (get() != 4) {
            interfaceC5074c2.onComplete();
        }
    }

    public final boolean isCancelled() {
        if (get() == 4) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        if (get() != 16) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t10 = this.value;
        this.value = null;
        return t10;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p197jf.InterfaceC5075d
    public final void request(long j10) {
        T t10;
        if (!SubscriptionHelper.validate(j10)) {
            return;
        }
        do {
            int i10 = get();
            if ((i10 & (-2)) != 0) {
                return;
            }
            if (i10 == 1) {
                if (compareAndSet(1, 3) && (t10 = this.value) != null) {
                    this.value = null;
                    InterfaceC5074c interfaceC5074c = this.downstream;
                    interfaceC5074c.onNext(t10);
                    if (get() != 4) {
                        interfaceC5074c.onComplete();
                        return;
                    }
                    return;
                }
                return;
            }
        } while (!compareAndSet(0, 2));
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int i10) {
        if ((i10 & 2) != 0) {
            lazySet(8);
            return 2;
        }
        return 0;
    }

    public final boolean tryCancel() {
        if (getAndSet(4) != 4) {
            return true;
        }
        return false;
    }
}
