package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class FlowableZipIterable<T, U, V> extends AbstractFlowableWithUpstream<T, V> {
    final Iterable<U> other;
    final BiFunction<? super T, ? super U, ? extends V> zipper;

    /* loaded from: classes3.dex */
    static final class ZipIterableSubscriber<T, U, V> implements FlowableSubscriber<T>, InterfaceC5075d {
        boolean done;
        final InterfaceC5074c downstream;
        final Iterator<U> iterator;
        InterfaceC5075d upstream;
        final BiFunction<? super T, ? super U, ? extends V> zipper;

        ZipIterableSubscriber(InterfaceC5074c interfaceC5074c, Iterator<U> it, BiFunction<? super T, ? super U, ? extends V> biFunction) {
            this.downstream = interfaceC5074c;
            this.iterator = it;
            this.zipper = biFunction;
        }

        @Override // p197jf.InterfaceC5075d
        public void cancel() {
            this.upstream.cancel();
        }

        void error(Throwable th) {
            Exceptions.throwIfFatal(th);
            this.done = true;
            this.upstream.cancel();
            this.downstream.onError(th);
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
            try {
                try {
                    this.downstream.onNext(ObjectHelper.requireNonNull(this.zipper.apply(t10, ObjectHelper.requireNonNull(this.iterator.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                    try {
                        if (!this.iterator.hasNext()) {
                            this.done = true;
                            this.upstream.cancel();
                            this.downstream.onComplete();
                        }
                    } catch (Throwable th) {
                        error(th);
                    }
                } catch (Throwable th2) {
                    error(th2);
                }
            } catch (Throwable th3) {
                error(th3);
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

    public FlowableZipIterable(Flowable<T> flowable, Iterable<U> iterable, BiFunction<? super T, ? super U, ? extends V> biFunction) {
        super(flowable);
        this.other = iterable;
        this.zipper = biFunction;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC5074c interfaceC5074c) {
        try {
            Iterator it = (Iterator) ObjectHelper.requireNonNull(this.other.iterator(), "The iterator returned by other is null");
            try {
                if (!it.hasNext()) {
                    EmptySubscription.complete(interfaceC5074c);
                } else {
                    this.source.subscribe((FlowableSubscriber) new ZipIterableSubscriber(interfaceC5074c, it, this.zipper));
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                EmptySubscription.error(th, interfaceC5074c);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, interfaceC5074c);
        }
    }
}
