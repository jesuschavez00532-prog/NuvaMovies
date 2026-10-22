package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class ParallelRunOn<T> extends ParallelFlowable<T> {
    final int prefetch;
    final Scheduler scheduler;
    final ParallelFlowable<? extends T> source;

    /* loaded from: classes3.dex */
    static abstract class BaseRunOnSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC5075d, Runnable {
        private static final long serialVersionUID = 9222303586456402150L;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        Throwable error;
        final int limit;
        final int prefetch;
        final SpscArrayQueue<T> queue;
        final AtomicLong requested = new AtomicLong();
        InterfaceC5075d upstream;
        final Scheduler.Worker worker;

        BaseRunOnSubscriber(int i10, SpscArrayQueue<T> spscArrayQueue, Scheduler.Worker worker) {
            this.prefetch = i10;
            this.queue = spscArrayQueue;
            this.limit = i10 - (i10 >> 2);
            this.worker = worker;
        }

        @Override // p197jf.InterfaceC5075d
        public final void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                this.worker.dispose();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            schedule();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            schedule();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public final void onNext(T t10) {
            if (this.done) {
                return;
            }
            if (!this.queue.offer(t10)) {
                this.upstream.cancel();
                onError(new MissingBackpressureException("Queue is full?!"));
            } else {
                schedule();
            }
        }

        @Override // p197jf.InterfaceC5075d
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                schedule();
            }
        }

        final void schedule() {
            if (getAndIncrement() == 0) {
                this.worker.schedule(this);
            }
        }
    }

    /* loaded from: classes3.dex */
    final class MultiWorkerCallback implements SchedulerMultiWorkerSupport.WorkerCallback {
        final InterfaceC5074c[] parents;
        final InterfaceC5074c[] subscribers;

        MultiWorkerCallback(InterfaceC5074c[] interfaceC5074cArr, InterfaceC5074c[] interfaceC5074cArr2) {
            this.subscribers = interfaceC5074cArr;
            this.parents = interfaceC5074cArr2;
        }

        @Override // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport.WorkerCallback
        public void onWorker(int i10, Scheduler.Worker worker) {
            ParallelRunOn.this.createSubscriber(i10, this.subscribers, this.parents, worker);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class RunOnConditionalSubscriber<T> extends BaseRunOnSubscriber<T> {
        private static final long serialVersionUID = 1075119423897941642L;
        final ConditionalSubscriber<? super T> downstream;

        RunOnConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, int i10, SpscArrayQueue<T> spscArrayQueue, Scheduler.Worker worker) {
            super(i10, spscArrayQueue, worker);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onSubscribe(InterfaceC5075d interfaceC5075d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC5075d)) {
                this.upstream = interfaceC5075d;
                this.downstream.onSubscribe(this);
                interfaceC5075d.request(this.prefetch);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            int i10;
            Throwable th;
            int i11 = this.consumed;
            SpscArrayQueue<T> spscArrayQueue = this.queue;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            int i12 = this.limit;
            int i13 = 1;
            while (true) {
                long j10 = this.requested.get();
                long j11 = 0;
                while (j11 != j10) {
                    if (this.cancelled) {
                        spscArrayQueue.clear();
                        return;
                    }
                    boolean z11 = this.done;
                    if (z11 && (th = this.error) != null) {
                        spscArrayQueue.clear();
                        conditionalSubscriber.onError(th);
                        this.worker.dispose();
                        return;
                    }
                    T poll = spscArrayQueue.poll();
                    if (poll == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z11 && z10) {
                        conditionalSubscriber.onComplete();
                        this.worker.dispose();
                        return;
                    } else {
                        if (z10) {
                            break;
                        }
                        if (conditionalSubscriber.tryOnNext(poll)) {
                            j11++;
                        }
                        i11++;
                        if (i11 == i12) {
                            i10 = i13;
                            this.upstream.request(i11);
                            i11 = 0;
                        } else {
                            i10 = i13;
                        }
                        i13 = i10;
                    }
                }
                int i14 = i13;
                if (j11 == j10) {
                    if (this.cancelled) {
                        spscArrayQueue.clear();
                        return;
                    }
                    if (this.done) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            spscArrayQueue.clear();
                            conditionalSubscriber.onError(th2);
                            this.worker.dispose();
                            return;
                        } else if (spscArrayQueue.isEmpty()) {
                            conditionalSubscriber.onComplete();
                            this.worker.dispose();
                            return;
                        }
                    }
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j11);
                }
                int i15 = get();
                if (i15 == i14) {
                    this.consumed = i11;
                    i15 = addAndGet(-i14);
                    if (i15 == 0) {
                        return;
                    }
                }
                i13 = i15;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class RunOnSubscriber<T> extends BaseRunOnSubscriber<T> {
        private static final long serialVersionUID = 1075119423897941642L;
        final InterfaceC5074c downstream;

        RunOnSubscriber(InterfaceC5074c interfaceC5074c, int i10, SpscArrayQueue<T> spscArrayQueue, Scheduler.Worker worker) {
            super(i10, spscArrayQueue, worker);
            this.downstream = interfaceC5074c;
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onSubscribe(InterfaceC5075d interfaceC5075d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC5075d)) {
                this.upstream = interfaceC5075d;
                this.downstream.onSubscribe(this);
                interfaceC5075d.request(this.prefetch);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            int i10;
            Throwable th;
            int i11 = this.consumed;
            SpscArrayQueue<T> spscArrayQueue = this.queue;
            InterfaceC5074c interfaceC5074c = this.downstream;
            int i12 = this.limit;
            int i13 = 1;
            while (true) {
                long j10 = this.requested.get();
                long j11 = 0;
                while (j11 != j10) {
                    if (this.cancelled) {
                        spscArrayQueue.clear();
                        return;
                    }
                    boolean z11 = this.done;
                    if (z11 && (th = this.error) != null) {
                        spscArrayQueue.clear();
                        interfaceC5074c.onError(th);
                        this.worker.dispose();
                        return;
                    }
                    T poll = spscArrayQueue.poll();
                    if (poll == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z11 && z10) {
                        interfaceC5074c.onComplete();
                        this.worker.dispose();
                        return;
                    } else {
                        if (z10) {
                            break;
                        }
                        interfaceC5074c.onNext(poll);
                        j11++;
                        i11++;
                        if (i11 == i12) {
                            i10 = i13;
                            this.upstream.request(i11);
                            i11 = 0;
                        } else {
                            i10 = i13;
                        }
                        i13 = i10;
                    }
                }
                int i14 = i13;
                if (j11 == j10) {
                    if (this.cancelled) {
                        spscArrayQueue.clear();
                        return;
                    }
                    if (this.done) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            spscArrayQueue.clear();
                            interfaceC5074c.onError(th2);
                            this.worker.dispose();
                            return;
                        } else if (spscArrayQueue.isEmpty()) {
                            interfaceC5074c.onComplete();
                            this.worker.dispose();
                            return;
                        }
                    }
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j11);
                }
                int i15 = get();
                if (i15 == i14) {
                    this.consumed = i11;
                    i15 = addAndGet(-i14);
                    if (i15 == 0) {
                        return;
                    }
                }
                i13 = i15;
            }
        }
    }

    public ParallelRunOn(ParallelFlowable<? extends T> parallelFlowable, Scheduler scheduler, int i10) {
        this.source = parallelFlowable;
        this.scheduler = scheduler;
        this.prefetch = i10;
    }

    void createSubscriber(int i10, InterfaceC5074c[] interfaceC5074cArr, InterfaceC5074c[] interfaceC5074cArr2, Scheduler.Worker worker) {
        InterfaceC5074c interfaceC5074c = interfaceC5074cArr[i10];
        SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.prefetch);
        if (interfaceC5074c instanceof ConditionalSubscriber) {
            interfaceC5074cArr2[i10] = new RunOnConditionalSubscriber((ConditionalSubscriber) interfaceC5074c, this.prefetch, spscArrayQueue, worker);
        } else {
            interfaceC5074cArr2[i10] = new RunOnSubscriber(interfaceC5074c, this.prefetch, spscArrayQueue, worker);
        }
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(InterfaceC5074c[] interfaceC5074cArr) {
        if (!validate(interfaceC5074cArr)) {
            return;
        }
        int length = interfaceC5074cArr.length;
        InterfaceC5074c[] interfaceC5074cArr2 = new InterfaceC5074c[length];
        Object obj = this.scheduler;
        if (obj instanceof SchedulerMultiWorkerSupport) {
            ((SchedulerMultiWorkerSupport) obj).createWorkers(length, new MultiWorkerCallback(interfaceC5074cArr, interfaceC5074cArr2));
        } else {
            for (int i10 = 0; i10 < length; i10++) {
                createSubscriber(i10, interfaceC5074cArr, interfaceC5074cArr2, this.scheduler.createWorker());
            }
        }
        this.source.subscribe(interfaceC5074cArr2);
    }
}
