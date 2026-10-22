package io.reactivex.internal.operators.mixed;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p197jf.InterfaceC5073b;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class CompletableAndThenPublisher<R> extends Flowable<R> {
    final InterfaceC5073b other;
    final CompletableSource source;

    public CompletableAndThenPublisher(CompletableSource completableSource, InterfaceC5073b interfaceC5073b) {
        this.source = completableSource;
        this.other = interfaceC5073b;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(InterfaceC5074c interfaceC5074c) {
        this.source.subscribe(new AndThenPublisherSubscriber(interfaceC5074c, this.other));
    }

    /* loaded from: classes3.dex */
    static final class AndThenPublisherSubscriber<R> extends AtomicReference<InterfaceC5075d> implements FlowableSubscriber<R>, CompletableObserver, InterfaceC5075d {
        private static final long serialVersionUID = -8948264376121066672L;
        final InterfaceC5074c downstream;
        InterfaceC5073b other;
        final AtomicLong requested = new AtomicLong();
        Disposable upstream;

        AndThenPublisherSubscriber(InterfaceC5074c interfaceC5074c, InterfaceC5073b interfaceC5073b) {
            this.downstream = interfaceC5074c;
            this.other = interfaceC5073b;
        }

        @Override // p197jf.InterfaceC5075d
        public void cancel() {
            this.upstream.dispose();
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onComplete() {
            InterfaceC5073b interfaceC5073b = this.other;
            if (interfaceC5073b == null) {
                this.downstream.onComplete();
            } else {
                this.other = null;
                interfaceC5073b.subscribe(this);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onNext(R r10) {
            this.downstream.onNext(r10);
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // p197jf.InterfaceC5075d
        public void request(long j10) {
            SubscriptionHelper.deferredRequest(this, this.requested, j10);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onSubscribe(InterfaceC5075d interfaceC5075d) {
            SubscriptionHelper.deferredSetOnce(this, this.requested, interfaceC5075d);
        }
    }
}
