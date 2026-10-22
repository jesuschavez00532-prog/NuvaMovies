package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class BlockingSubscriber<T> extends AtomicReference<InterfaceC5075d> implements FlowableSubscriber<T>, InterfaceC5075d {
    public static final Object TERMINATED = new Object();
    private static final long serialVersionUID = -4875965440900746268L;
    final Queue<Object> queue;

    public BlockingSubscriber(Queue<Object> queue) {
        this.queue = queue;
    }

    @Override // p197jf.InterfaceC5075d
    public void cancel() {
        if (SubscriptionHelper.cancel(this)) {
            this.queue.offer(TERMINATED);
        }
    }

    public boolean isCancelled() {
        if (get() == SubscriptionHelper.CANCELLED) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public void onComplete() {
        this.queue.offer(NotificationLite.complete());
    }

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public void onError(Throwable th) {
        this.queue.offer(NotificationLite.error(th));
    }

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public void onNext(T t10) {
        this.queue.offer(NotificationLite.next(t10));
    }

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public void onSubscribe(InterfaceC5075d interfaceC5075d) {
        if (SubscriptionHelper.setOnce(this, interfaceC5075d)) {
            this.queue.offer(NotificationLite.subscription(this));
        }
    }

    @Override // p197jf.InterfaceC5075d
    public void request(long j10) {
        get().request(j10);
    }
}
