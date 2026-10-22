package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class SerializedSubscriber<T> implements FlowableSubscriber<T>, InterfaceC5075d {
    static final int QUEUE_LINK_SIZE = 4;
    final boolean delayError;
    volatile boolean done;
    final InterfaceC5074c downstream;
    boolean emitting;
    AppendOnlyLinkedArrayList<Object> queue;
    InterfaceC5075d upstream;

    public SerializedSubscriber(InterfaceC5074c interfaceC5074c) {
        this(interfaceC5074c, false);
    }

    @Override // p197jf.InterfaceC5075d
    public void cancel() {
        this.upstream.cancel();
    }

    void emitLoop() {
        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList;
        do {
            synchronized (this) {
                appendOnlyLinkedArrayList = this.queue;
                if (appendOnlyLinkedArrayList == null) {
                    this.emitting = false;
                    return;
                }
                this.queue = null;
            }
        } while (!appendOnlyLinkedArrayList.accept(this.downstream));
    }

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public void onComplete() {
        if (this.done) {
            return;
        }
        synchronized (this) {
            if (this.done) {
                return;
            }
            if (this.emitting) {
                AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.queue;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                    this.queue = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.add(NotificationLite.complete());
                return;
            }
            this.done = true;
            this.emitting = true;
            this.downstream.onComplete();
        }
    }

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public void onError(Throwable th) {
        if (this.done) {
            RxJavaPlugins.onError(th);
            return;
        }
        synchronized (this) {
            boolean z10 = true;
            if (!this.done) {
                if (this.emitting) {
                    this.done = true;
                    AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.queue;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                        this.queue = appendOnlyLinkedArrayList;
                    }
                    Object error = NotificationLite.error(th);
                    if (this.delayError) {
                        appendOnlyLinkedArrayList.add(error);
                    } else {
                        appendOnlyLinkedArrayList.setFirst(error);
                    }
                    return;
                }
                this.done = true;
                this.emitting = true;
                z10 = false;
            }
            if (z10) {
                RxJavaPlugins.onError(th);
            } else {
                this.downstream.onError(th);
            }
        }
    }

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public void onNext(T t10) {
        if (this.done) {
            return;
        }
        if (t10 == null) {
            this.upstream.cancel();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.done) {
                return;
            }
            if (this.emitting) {
                AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.queue;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                    this.queue = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.add(NotificationLite.next(t10));
                return;
            }
            this.emitting = true;
            this.downstream.onNext(t10);
            emitLoop();
        }
    }

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public void onSubscribe(InterfaceC5075d interfaceC5075d) {
        if (SubscriptionHelper.validate(this.upstream, interfaceC5075d)) {
            this.upstream = interfaceC5075d;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // p197jf.InterfaceC5075d
    public void request(long j10) {
        this.upstream.request(j10);
    }

    public SerializedSubscriber(InterfaceC5074c interfaceC5074c, boolean z10) {
        this.downstream = interfaceC5074c;
        this.delayError = z10;
    }
}
