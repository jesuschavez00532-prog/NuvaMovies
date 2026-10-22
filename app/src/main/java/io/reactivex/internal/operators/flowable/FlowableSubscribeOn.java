package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p197jf.InterfaceC5073b;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class FlowableSubscribeOn<T> extends AbstractFlowableWithUpstream<T, T> {
    final boolean nonScheduledRequests;
    final Scheduler scheduler;

    /* loaded from: classes3.dex */
    static final class SubscribeOnSubscriber<T> extends AtomicReference<Thread> implements FlowableSubscriber<T>, InterfaceC5075d, Runnable {
        private static final long serialVersionUID = 8094547886072529208L;
        final InterfaceC5074c downstream;
        final boolean nonScheduledRequests;
        InterfaceC5073b source;
        final Scheduler.Worker worker;
        final AtomicReference<InterfaceC5075d> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class Request implements Runnable {

            /* renamed from: n */
            final long f20609n;
            final InterfaceC5075d upstream;

            Request(InterfaceC5075d interfaceC5075d, long j10) {
                this.upstream = interfaceC5075d;
                this.f20609n = j10;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.upstream.request(this.f20609n);
            }
        }

        SubscribeOnSubscriber(InterfaceC5074c interfaceC5074c, Scheduler.Worker worker, InterfaceC5073b interfaceC5073b, boolean z10) {
            this.downstream = interfaceC5074c;
            this.worker = worker;
            this.source = interfaceC5073b;
            this.nonScheduledRequests = !z10;
        }

        @Override // p197jf.InterfaceC5075d
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onComplete() {
            this.downstream.onComplete();
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onError(Throwable th) {
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onNext(T t10) {
            this.downstream.onNext(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onSubscribe(InterfaceC5075d interfaceC5075d) {
            if (SubscriptionHelper.setOnce(this.upstream, interfaceC5075d)) {
                long andSet = this.requested.getAndSet(0L);
                if (andSet != 0) {
                    requestUpstream(andSet, interfaceC5075d);
                }
            }
        }

        @Override // p197jf.InterfaceC5075d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                InterfaceC5075d interfaceC5075d = this.upstream.get();
                if (interfaceC5075d != null) {
                    requestUpstream(j10, interfaceC5075d);
                    return;
                }
                BackpressureHelper.add(this.requested, j10);
                InterfaceC5075d interfaceC5075d2 = this.upstream.get();
                if (interfaceC5075d2 != null) {
                    long andSet = this.requested.getAndSet(0L);
                    if (andSet != 0) {
                        requestUpstream(andSet, interfaceC5075d2);
                    }
                }
            }
        }

        void requestUpstream(long j10, InterfaceC5075d interfaceC5075d) {
            if (!this.nonScheduledRequests && Thread.currentThread() != get()) {
                this.worker.schedule(new Request(interfaceC5075d, j10));
            } else {
                interfaceC5075d.request(j10);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            lazySet(Thread.currentThread());
            InterfaceC5073b interfaceC5073b = this.source;
            this.source = null;
            interfaceC5073b.subscribe(this);
        }
    }

    public FlowableSubscribeOn(Flowable<T> flowable, Scheduler scheduler, boolean z10) {
        super(flowable);
        this.scheduler = scheduler;
        this.nonScheduledRequests = z10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC5074c interfaceC5074c) {
        Scheduler.Worker createWorker = this.scheduler.createWorker();
        SubscribeOnSubscriber subscribeOnSubscriber = new SubscribeOnSubscriber(interfaceC5074c, createWorker, this.source, this.nonScheduledRequests);
        interfaceC5074c.onSubscribe(subscribeOnSubscriber);
        createWorker.schedule(subscribeOnSubscriber);
    }
}
