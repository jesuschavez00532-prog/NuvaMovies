package io.reactivex.internal.operators.single;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p197jf.InterfaceC5073b;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class SingleFlatMapPublisher<T, R> extends Flowable<R> {
    final Function<? super T, ? extends InterfaceC5073b> mapper;
    final SingleSource<T> source;

    public SingleFlatMapPublisher(SingleSource<T> singleSource, Function<? super T, ? extends InterfaceC5073b> function) {
        this.source = singleSource;
        this.mapper = function;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(InterfaceC5074c interfaceC5074c) {
        this.source.subscribe(new SingleFlatMapPublisherObserver(interfaceC5074c, this.mapper));
    }

    /* loaded from: classes3.dex */
    static final class SingleFlatMapPublisherObserver<S, T> extends AtomicLong implements SingleObserver<S>, FlowableSubscriber<T>, InterfaceC5075d {
        private static final long serialVersionUID = 7759721921468635667L;
        Disposable disposable;
        final InterfaceC5074c downstream;
        final Function<? super S, ? extends InterfaceC5073b> mapper;
        final AtomicReference<InterfaceC5075d> parent = new AtomicReference<>();

        SingleFlatMapPublisherObserver(InterfaceC5074c interfaceC5074c, Function<? super S, ? extends InterfaceC5073b> function) {
            this.downstream = interfaceC5074c;
            this.mapper = function;
        }

        @Override // p197jf.InterfaceC5075d
        public void cancel() {
            this.disposable.dispose();
            SubscriptionHelper.cancel(this.parent);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onNext(T t10) {
            this.downstream.onNext(t10);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            this.disposable = disposable;
            this.downstream.onSubscribe(this);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(S s10) {
            try {
                ((InterfaceC5073b) ObjectHelper.requireNonNull(this.mapper.apply(s10), "the mapper returned a null Publisher")).subscribe(this);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }

        @Override // p197jf.InterfaceC5075d
        public void request(long j10) {
            SubscriptionHelper.deferredRequest(this.parent, this, j10);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onSubscribe(InterfaceC5075d interfaceC5075d) {
            SubscriptionHelper.deferredSetOnce(this.parent, this, interfaceC5075d);
        }
    }
}
