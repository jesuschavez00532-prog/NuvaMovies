package io.reactivex.internal.operators.flowable;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class FlowableMergeWithCompletable<T> extends AbstractFlowableWithUpstream<T, T> {
    final CompletableSource other;

    /* loaded from: classes3.dex */
    static final class MergeWithSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC5075d {
        private static final long serialVersionUID = -4592979584110982903L;
        final InterfaceC5074c downstream;
        volatile boolean mainDone;
        volatile boolean otherDone;
        final AtomicReference<InterfaceC5075d> mainSubscription = new AtomicReference<>();
        final OtherObserver otherObserver = new OtherObserver(this);
        final AtomicThrowable error = new AtomicThrowable();
        final AtomicLong requested = new AtomicLong();

        /* loaded from: classes3.dex */
        static final class OtherObserver extends AtomicReference<Disposable> implements CompletableObserver {
            private static final long serialVersionUID = -2935427570954647017L;
            final MergeWithSubscriber<?> parent;

            OtherObserver(MergeWithSubscriber<?> mergeWithSubscriber) {
                this.parent = mergeWithSubscriber;
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                this.parent.otherComplete();
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th) {
                this.parent.otherError(th);
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        MergeWithSubscriber(InterfaceC5074c interfaceC5074c) {
            this.downstream = interfaceC5074c;
        }

        @Override // p197jf.InterfaceC5075d
        public void cancel() {
            SubscriptionHelper.cancel(this.mainSubscription);
            DisposableHelper.dispose(this.otherObserver);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onComplete() {
            this.mainDone = true;
            if (this.otherDone) {
                HalfSerializer.onComplete(this.downstream, this, this.error);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onError(Throwable th) {
            DisposableHelper.dispose(this.otherObserver);
            HalfSerializer.onError(this.downstream, th, this, this.error);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onNext(T t10) {
            HalfSerializer.onNext(this.downstream, t10, this, this.error);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onSubscribe(InterfaceC5075d interfaceC5075d) {
            SubscriptionHelper.deferredSetOnce(this.mainSubscription, this.requested, interfaceC5075d);
        }

        void otherComplete() {
            this.otherDone = true;
            if (this.mainDone) {
                HalfSerializer.onComplete(this.downstream, this, this.error);
            }
        }

        void otherError(Throwable th) {
            SubscriptionHelper.cancel(this.mainSubscription);
            HalfSerializer.onError(this.downstream, th, this, this.error);
        }

        @Override // p197jf.InterfaceC5075d
        public void request(long j10) {
            SubscriptionHelper.deferredRequest(this.mainSubscription, this.requested, j10);
        }
    }

    public FlowableMergeWithCompletable(Flowable<T> flowable, CompletableSource completableSource) {
        super(flowable);
        this.other = completableSource;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(InterfaceC5074c interfaceC5074c) {
        MergeWithSubscriber mergeWithSubscriber = new MergeWithSubscriber(interfaceC5074c);
        interfaceC5074c.onSubscribe(mergeWithSubscriber);
        this.source.subscribe((FlowableSubscriber) mergeWithSubscriber);
        this.other.subscribe(mergeWithSubscriber.otherObserver);
    }
}
