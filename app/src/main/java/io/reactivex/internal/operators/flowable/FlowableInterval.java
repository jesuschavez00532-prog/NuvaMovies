package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class FlowableInterval extends Flowable<Long> {
    final long initialDelay;
    final long period;
    final Scheduler scheduler;
    final TimeUnit unit;

    /* loaded from: classes3.dex */
    static final class IntervalSubscriber extends AtomicLong implements InterfaceC5075d, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        long count;
        final InterfaceC5074c downstream;
        final AtomicReference<Disposable> resource = new AtomicReference<>();

        IntervalSubscriber(InterfaceC5074c interfaceC5074c) {
            this.downstream = interfaceC5074c;
        }

        @Override // p197jf.InterfaceC5075d
        public void cancel() {
            DisposableHelper.dispose(this.resource);
        }

        @Override // p197jf.InterfaceC5075d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this, j10);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.resource.get() != DisposableHelper.DISPOSED) {
                if (get() != 0) {
                    InterfaceC5074c interfaceC5074c = this.downstream;
                    long j10 = this.count;
                    this.count = j10 + 1;
                    interfaceC5074c.onNext(Long.valueOf(j10));
                    BackpressureHelper.produced(this, 1L);
                    return;
                }
                this.downstream.onError(new MissingBackpressureException("Can't deliver value " + this.count + " due to lack of requests"));
                DisposableHelper.dispose(this.resource);
            }
        }

        public void setResource(Disposable disposable) {
            DisposableHelper.setOnce(this.resource, disposable);
        }
    }

    public FlowableInterval(long j10, long j11, TimeUnit timeUnit, Scheduler scheduler) {
        this.initialDelay = j10;
        this.period = j11;
        this.unit = timeUnit;
        this.scheduler = scheduler;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC5074c interfaceC5074c) {
        IntervalSubscriber intervalSubscriber = new IntervalSubscriber(interfaceC5074c);
        interfaceC5074c.onSubscribe(intervalSubscriber);
        Scheduler scheduler = this.scheduler;
        if (scheduler instanceof TrampolineScheduler) {
            Scheduler.Worker createWorker = scheduler.createWorker();
            intervalSubscriber.setResource(createWorker);
            createWorker.schedulePeriodically(intervalSubscriber, this.initialDelay, this.period, this.unit);
            return;
        }
        intervalSubscriber.setResource(scheduler.schedulePeriodicallyDirect(intervalSubscriber, this.initialDelay, this.period, this.unit));
    }
}
