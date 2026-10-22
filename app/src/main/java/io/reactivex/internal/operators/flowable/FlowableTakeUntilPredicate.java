package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class FlowableTakeUntilPredicate<T> extends AbstractFlowableWithUpstream<T, T> {
    final Predicate<? super T> predicate;

    /* loaded from: classes3.dex */
    static final class InnerSubscriber<T> implements FlowableSubscriber<T>, InterfaceC5075d {
        boolean done;
        final InterfaceC5074c downstream;
        final Predicate<? super T> predicate;
        InterfaceC5075d upstream;

        InnerSubscriber(InterfaceC5074c interfaceC5074c, Predicate<? super T> predicate) {
            this.downstream = interfaceC5074c;
            this.predicate = predicate;
        }

        @Override // p197jf.InterfaceC5075d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onError(Throwable th) {
            if (!this.done) {
                this.done = true;
                this.downstream.onError(th);
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onNext(T t10) {
            if (!this.done) {
                this.downstream.onNext(t10);
                try {
                    if (this.predicate.test(t10)) {
                        this.done = true;
                        this.upstream.cancel();
                        this.downstream.onComplete();
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.upstream.cancel();
                    onError(th);
                }
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

    public FlowableTakeUntilPredicate(Flowable<T> flowable, Predicate<? super T> predicate) {
        super(flowable);
        this.predicate = predicate;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(InterfaceC5074c interfaceC5074c) {
        this.source.subscribe((FlowableSubscriber) new InnerSubscriber(interfaceC5074c, this.predicate));
    }
}
