package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class FlowableScan<T> extends AbstractFlowableWithUpstream<T, T> {
    final BiFunction<T, T, T> accumulator;

    /* loaded from: classes3.dex */
    static final class ScanSubscriber<T> implements FlowableSubscriber<T>, InterfaceC5075d {
        final BiFunction<T, T, T> accumulator;
        boolean done;
        final InterfaceC5074c downstream;
        InterfaceC5075d upstream;
        T value;

        ScanSubscriber(InterfaceC5074c interfaceC5074c, BiFunction<T, T, T> biFunction) {
            this.downstream = interfaceC5074c;
            this.accumulator = biFunction;
        }

        @Override // p197jf.InterfaceC5075d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onNext(T t10) {
            if (this.done) {
                return;
            }
            InterfaceC5074c interfaceC5074c = this.downstream;
            T t11 = this.value;
            if (t11 == null) {
                this.value = t10;
                interfaceC5074c.onNext(t10);
                return;
            }
            try {
                T t12 = (T) ObjectHelper.requireNonNull(this.accumulator.apply(t11, t10), "The value returned by the accumulator is null");
                this.value = t12;
                interfaceC5074c.onNext(t12);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                onError(th);
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

    public FlowableScan(Flowable<T> flowable, BiFunction<T, T, T> biFunction) {
        super(flowable);
        this.accumulator = biFunction;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(InterfaceC5074c interfaceC5074c) {
        this.source.subscribe((FlowableSubscriber) new ScanSubscriber(interfaceC5074c, this.accumulator));
    }
}
