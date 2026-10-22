package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class FlowableUnsubscribeOn<T> extends AbstractFlowableWithUpstream<T, T> {
    final Scheduler scheduler;

    /* loaded from: classes3.dex */
    static final class UnsubscribeSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, InterfaceC5075d {
        private static final long serialVersionUID = 1015244841293359600L;
        final InterfaceC5074c downstream;
        final Scheduler scheduler;
        InterfaceC5075d upstream;

        /* loaded from: classes3.dex */
        final class Cancellation implements Runnable {
            Cancellation() {
            }

            @Override // java.lang.Runnable
            public void run() {
                UnsubscribeSubscriber.this.upstream.cancel();
            }
        }

        UnsubscribeSubscriber(InterfaceC5074c interfaceC5074c, Scheduler scheduler) {
            this.downstream = interfaceC5074c;
            this.scheduler = scheduler;
        }

        @Override // p197jf.InterfaceC5075d
        public void cancel() {
            if (compareAndSet(false, true)) {
                this.scheduler.scheduleDirect(new Cancellation());
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onComplete() {
            if (!get()) {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onError(Throwable th) {
            if (get()) {
                RxJavaPlugins.onError(th);
            } else {
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onNext(T t10) {
            if (!get()) {
                this.downstream.onNext(t10);
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
    }

    public FlowableUnsubscribeOn(Flowable<T> flowable, Scheduler scheduler) {
        super(flowable);
        this.scheduler = scheduler;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(InterfaceC5074c interfaceC5074c) {
        this.source.subscribe((FlowableSubscriber) new UnsubscribeSubscriber(interfaceC5074c, this.scheduler));
    }
}
