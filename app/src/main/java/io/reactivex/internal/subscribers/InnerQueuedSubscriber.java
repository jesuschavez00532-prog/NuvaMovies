package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import java.util.concurrent.atomic.AtomicReference;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class InnerQueuedSubscriber<T> extends AtomicReference<InterfaceC5075d> implements FlowableSubscriber<T>, InterfaceC5075d {
    private static final long serialVersionUID = 22876611072430776L;
    volatile boolean done;
    int fusionMode;
    final int limit;
    final InnerQueuedSubscriberSupport<T> parent;
    final int prefetch;
    long produced;
    volatile SimpleQueue<T> queue;

    public InnerQueuedSubscriber(InnerQueuedSubscriberSupport<T> innerQueuedSubscriberSupport, int i10) {
        this.parent = innerQueuedSubscriberSupport;
        this.prefetch = i10;
        this.limit = i10 - (i10 >> 2);
    }

    @Override // p197jf.InterfaceC5075d
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public boolean isDone() {
        return this.done;
    }

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public void onComplete() {
        this.parent.innerComplete(this);
    }

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public void onError(Throwable th) {
        this.parent.innerError(this, th);
    }

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public void onNext(T t10) {
        if (this.fusionMode == 0) {
            this.parent.innerNext(this, t10);
        } else {
            this.parent.drain();
        }
    }

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public void onSubscribe(InterfaceC5075d interfaceC5075d) {
        if (SubscriptionHelper.setOnce(this, interfaceC5075d)) {
            if (interfaceC5075d instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) interfaceC5075d;
                int requestFusion = queueSubscription.requestFusion(3);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = queueSubscription;
                    this.done = true;
                    this.parent.innerComplete(this);
                    return;
                }
                if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = queueSubscription;
                    QueueDrainHelper.request(interfaceC5075d, this.prefetch);
                    return;
                }
            }
            this.queue = QueueDrainHelper.createQueue(this.prefetch);
            QueueDrainHelper.request(interfaceC5075d, this.prefetch);
        }
    }

    public SimpleQueue<T> queue() {
        return this.queue;
    }

    @Override // p197jf.InterfaceC5075d
    public void request(long j10) {
        if (this.fusionMode != 1) {
            long j11 = this.produced + j10;
            if (j11 >= this.limit) {
                this.produced = 0L;
                get().request(j11);
            } else {
                this.produced = j11;
            }
        }
    }

    public void requestOne() {
        if (this.fusionMode != 1) {
            long j10 = this.produced + 1;
            if (j10 == this.limit) {
                this.produced = 0L;
                get().request(j10);
            } else {
                this.produced = j10;
            }
        }
    }

    public void setDone() {
        this.done = true;
    }
}
