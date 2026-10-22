package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class FlowableDelay<T> extends AbstractFlowableWithUpstream<T, T> {
    final long delay;
    final boolean delayError;
    final Scheduler scheduler;
    final TimeUnit unit;

    /* loaded from: classes3.dex */
    static final class DelaySubscriber<T> implements FlowableSubscriber<T>, InterfaceC5075d {
        final long delay;
        final boolean delayError;
        final InterfaceC5074c downstream;
        final TimeUnit unit;
        InterfaceC5075d upstream;

        /* renamed from: w */
        final Scheduler.Worker f20589w;

        /* loaded from: classes3.dex */
        final class OnComplete implements Runnable {
            OnComplete() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DelaySubscriber.this.downstream.onComplete();
                } finally {
                    DelaySubscriber.this.f20589w.dispose();
                }
            }
        }

        /* loaded from: classes3.dex */
        final class OnError implements Runnable {

            /* renamed from: t */
            private final Throwable f20590t;

            OnError(Throwable th) {
                this.f20590t = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DelaySubscriber.this.downstream.onError(this.f20590t);
                } finally {
                    DelaySubscriber.this.f20589w.dispose();
                }
            }
        }

        /* loaded from: classes3.dex */
        final class OnNext implements Runnable {

            /* renamed from: t */
            private final T f20591t;

            OnNext(T t10) {
                this.f20591t = t10;
            }

            @Override // java.lang.Runnable
            public void run() {
                DelaySubscriber.this.downstream.onNext(this.f20591t);
            }
        }

        DelaySubscriber(InterfaceC5074c interfaceC5074c, long j10, TimeUnit timeUnit, Scheduler.Worker worker, boolean z10) {
            this.downstream = interfaceC5074c;
            this.delay = j10;
            this.unit = timeUnit;
            this.f20589w = worker;
            this.delayError = z10;
        }

        @Override // p197jf.InterfaceC5075d
        public void cancel() {
            this.upstream.cancel();
            this.f20589w.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onComplete() {
            this.f20589w.schedule(new OnComplete(), this.delay, this.unit);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onError(Throwable th) {
            long j10;
            Scheduler.Worker worker = this.f20589w;
            OnError onError = new OnError(th);
            if (this.delayError) {
                j10 = this.delay;
            } else {
                j10 = 0;
            }
            worker.schedule(onError, j10, this.unit);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onNext(T t10) {
            this.f20589w.schedule(new OnNext(t10), this.delay, this.unit);
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

    public FlowableDelay(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
        super(flowable);
        this.delay = j10;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.delayError = z10;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(InterfaceC5074c interfaceC5074c) {
        InterfaceC5074c serializedSubscriber;
        if (this.delayError) {
            serializedSubscriber = interfaceC5074c;
        } else {
            serializedSubscriber = new SerializedSubscriber(interfaceC5074c);
        }
        this.source.subscribe((FlowableSubscriber) new DelaySubscriber(serializedSubscriber, this.delay, this.unit, this.scheduler.createWorker(), this.delayError));
    }
}
