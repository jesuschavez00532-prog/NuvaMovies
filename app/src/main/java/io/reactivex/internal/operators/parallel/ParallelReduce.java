package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscribers.DeferredScalarSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class ParallelReduce<T, R> extends ParallelFlowable<R> {
    final Callable<R> initialSupplier;
    final BiFunction<R, ? super T, R> reducer;
    final ParallelFlowable<? extends T> source;

    /* loaded from: classes3.dex */
    static final class ParallelReduceSubscriber<T, R> extends DeferredScalarSubscriber<T, R> {
        private static final long serialVersionUID = 8200530050639449080L;
        R accumulator;
        boolean done;
        final BiFunction<R, ? super T, R> reducer;

        ParallelReduceSubscriber(InterfaceC5074c interfaceC5074c, R r10, BiFunction<R, ? super T, R> biFunction) {
            super(interfaceC5074c);
            this.accumulator = r10;
            this.reducer = biFunction;
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.internal.subscriptions.DeferredScalarSubscription, io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p197jf.InterfaceC5075d
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                R r10 = this.accumulator;
                this.accumulator = null;
                complete(r10);
            }
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.accumulator = null;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onNext(T t10) {
            if (!this.done) {
                try {
                    this.accumulator = (R) ObjectHelper.requireNonNull(this.reducer.apply(this.accumulator, t10), "The reducer returned a null value");
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    onError(th);
                }
            }
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onSubscribe(InterfaceC5075d interfaceC5075d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC5075d)) {
                this.upstream = interfaceC5075d;
                this.downstream.onSubscribe(this);
                interfaceC5075d.request(Long.MAX_VALUE);
            }
        }
    }

    public ParallelReduce(ParallelFlowable<? extends T> parallelFlowable, Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        this.source = parallelFlowable;
        this.initialSupplier = callable;
        this.reducer = biFunction;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    void reportError(InterfaceC5074c[] interfaceC5074cArr, Throwable th) {
        for (InterfaceC5074c interfaceC5074c : interfaceC5074cArr) {
            EmptySubscription.error(th, interfaceC5074c);
        }
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(InterfaceC5074c[] interfaceC5074cArr) {
        if (!validate(interfaceC5074cArr)) {
            return;
        }
        int length = interfaceC5074cArr.length;
        InterfaceC5074c[] interfaceC5074cArr2 = new InterfaceC5074c[length];
        for (int i10 = 0; i10 < length; i10++) {
            try {
                interfaceC5074cArr2[i10] = new ParallelReduceSubscriber(interfaceC5074cArr[i10], ObjectHelper.requireNonNull(this.initialSupplier.call(), "The initialSupplier returned a null value"), this.reducer);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                reportError(interfaceC5074cArr, th);
                return;
            }
        }
        this.source.subscribe(interfaceC5074cArr2);
    }
}
