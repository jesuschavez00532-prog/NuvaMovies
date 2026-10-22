package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.LongConsumer;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class FlowableDoOnLifecycle<T> extends AbstractFlowableWithUpstream<T, T> {
    private final Action onCancel;
    private final LongConsumer onRequest;
    private final Consumer<? super InterfaceC5075d> onSubscribe;

    /* loaded from: classes3.dex */
    static final class SubscriptionLambdaSubscriber<T> implements FlowableSubscriber<T>, InterfaceC5075d {
        final InterfaceC5074c downstream;
        final Action onCancel;
        final LongConsumer onRequest;
        final Consumer<? super InterfaceC5075d> onSubscribe;
        InterfaceC5075d upstream;

        SubscriptionLambdaSubscriber(InterfaceC5074c interfaceC5074c, Consumer<? super InterfaceC5075d> consumer, LongConsumer longConsumer, Action action) {
            this.downstream = interfaceC5074c;
            this.onSubscribe = consumer;
            this.onCancel = action;
            this.onRequest = longConsumer;
        }

        @Override // p197jf.InterfaceC5075d
        public void cancel() {
            InterfaceC5075d interfaceC5075d = this.upstream;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (interfaceC5075d != subscriptionHelper) {
                this.upstream = subscriptionHelper;
                try {
                    this.onCancel.run();
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    RxJavaPlugins.onError(th);
                }
                interfaceC5075d.cancel();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onComplete() {
            if (this.upstream != SubscriptionHelper.CANCELLED) {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onError(Throwable th) {
            if (this.upstream != SubscriptionHelper.CANCELLED) {
                this.downstream.onError(th);
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onNext(T t10) {
            this.downstream.onNext(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onSubscribe(InterfaceC5075d interfaceC5075d) {
            try {
                this.onSubscribe.accept(interfaceC5075d);
                if (SubscriptionHelper.validate(this.upstream, interfaceC5075d)) {
                    this.upstream = interfaceC5075d;
                    this.downstream.onSubscribe(this);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                interfaceC5075d.cancel();
                this.upstream = SubscriptionHelper.CANCELLED;
                EmptySubscription.error(th, this.downstream);
            }
        }

        @Override // p197jf.InterfaceC5075d
        public void request(long j10) {
            try {
                this.onRequest.accept(j10);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                RxJavaPlugins.onError(th);
            }
            this.upstream.request(j10);
        }
    }

    public FlowableDoOnLifecycle(Flowable<T> flowable, Consumer<? super InterfaceC5075d> consumer, LongConsumer longConsumer, Action action) {
        super(flowable);
        this.onSubscribe = consumer;
        this.onRequest = longConsumer;
        this.onCancel = action;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(InterfaceC5074c interfaceC5074c) {
        this.source.subscribe((FlowableSubscriber) new SubscriptionLambdaSubscriber(interfaceC5074c, this.onSubscribe, this.onRequest, this.onCancel));
    }
}
