package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p197jf.InterfaceC5073b;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class FlowableDelaySubscriptionOther<T, U> extends Flowable<T> {
    final InterfaceC5073b main;
    final InterfaceC5073b other;

    /* loaded from: classes3.dex */
    static final class MainSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, InterfaceC5075d {
        private static final long serialVersionUID = 2259811067697317255L;
        final InterfaceC5074c downstream;
        final InterfaceC5073b main;
        final MainSubscriber<T>.OtherSubscriber other = new OtherSubscriber();
        final AtomicReference<InterfaceC5075d> upstream = new AtomicReference<>();

        /* loaded from: classes3.dex */
        final class OtherSubscriber extends AtomicReference<InterfaceC5075d> implements FlowableSubscriber<Object> {
            private static final long serialVersionUID = -3892798459447644106L;

            OtherSubscriber() {
            }

            @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
            public void onComplete() {
                if (get() != SubscriptionHelper.CANCELLED) {
                    MainSubscriber.this.next();
                }
            }

            @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
            public void onError(Throwable th) {
                if (get() != SubscriptionHelper.CANCELLED) {
                    MainSubscriber.this.downstream.onError(th);
                } else {
                    RxJavaPlugins.onError(th);
                }
            }

            @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
            public void onNext(Object obj) {
                InterfaceC5075d interfaceC5075d = get();
                SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
                if (interfaceC5075d != subscriptionHelper) {
                    lazySet(subscriptionHelper);
                    interfaceC5075d.cancel();
                    MainSubscriber.this.next();
                }
            }

            @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
            public void onSubscribe(InterfaceC5075d interfaceC5075d) {
                if (SubscriptionHelper.setOnce(this, interfaceC5075d)) {
                    interfaceC5075d.request(Long.MAX_VALUE);
                }
            }
        }

        MainSubscriber(InterfaceC5074c interfaceC5074c, InterfaceC5073b interfaceC5073b) {
            this.downstream = interfaceC5074c;
            this.main = interfaceC5073b;
        }

        @Override // p197jf.InterfaceC5075d
        public void cancel() {
            SubscriptionHelper.cancel(this.other);
            SubscriptionHelper.cancel(this.upstream);
        }

        void next() {
            this.main.subscribe(this);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onNext(T t10) {
            this.downstream.onNext(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onSubscribe(InterfaceC5075d interfaceC5075d) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this, interfaceC5075d);
        }

        @Override // p197jf.InterfaceC5075d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                SubscriptionHelper.deferredRequest(this.upstream, this, j10);
            }
        }
    }

    public FlowableDelaySubscriptionOther(InterfaceC5073b interfaceC5073b, InterfaceC5073b interfaceC5073b2) {
        this.main = interfaceC5073b;
        this.other = interfaceC5073b2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC5074c interfaceC5074c) {
        MainSubscriber mainSubscriber = new MainSubscriber(interfaceC5074c, this.main);
        interfaceC5074c.onSubscribe(mainSubscriber);
        this.other.subscribe(mainSubscriber.other);
    }
}
