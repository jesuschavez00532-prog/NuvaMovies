package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p197jf.InterfaceC5073b;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class FlowableAmb<T> extends Flowable<T> {
    final InterfaceC5073b[] sources;
    final Iterable<? extends InterfaceC5073b> sourcesIterable;

    /* loaded from: classes3.dex */
    static final class AmbCoordinator<T> implements InterfaceC5075d {
        final InterfaceC5074c downstream;
        final AmbInnerSubscriber<T>[] subscribers;
        final AtomicInteger winner = new AtomicInteger();

        AmbCoordinator(InterfaceC5074c interfaceC5074c, int i10) {
            this.downstream = interfaceC5074c;
            this.subscribers = new AmbInnerSubscriber[i10];
        }

        @Override // p197jf.InterfaceC5075d
        public void cancel() {
            if (this.winner.get() != -1) {
                this.winner.lazySet(-1);
                for (AmbInnerSubscriber<T> ambInnerSubscriber : this.subscribers) {
                    ambInnerSubscriber.cancel();
                }
            }
        }

        @Override // p197jf.InterfaceC5075d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                int i10 = this.winner.get();
                if (i10 > 0) {
                    this.subscribers[i10 - 1].request(j10);
                    return;
                }
                if (i10 == 0) {
                    for (AmbInnerSubscriber<T> ambInnerSubscriber : this.subscribers) {
                        ambInnerSubscriber.request(j10);
                    }
                }
            }
        }

        public void subscribe(InterfaceC5073b[] interfaceC5073bArr) {
            AmbInnerSubscriber<T>[] ambInnerSubscriberArr = this.subscribers;
            int length = ambInnerSubscriberArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                ambInnerSubscriberArr[i10] = new AmbInnerSubscriber<>(this, i11, this.downstream);
                i10 = i11;
            }
            this.winner.lazySet(0);
            this.downstream.onSubscribe(this);
            for (int i12 = 0; i12 < length && this.winner.get() == 0; i12++) {
                interfaceC5073bArr[i12].subscribe(ambInnerSubscriberArr[i12]);
            }
        }

        public boolean win(int i10) {
            int i11 = 0;
            if (this.winner.get() != 0 || !this.winner.compareAndSet(0, i10)) {
                return false;
            }
            AmbInnerSubscriber<T>[] ambInnerSubscriberArr = this.subscribers;
            int length = ambInnerSubscriberArr.length;
            while (i11 < length) {
                int i12 = i11 + 1;
                if (i12 != i10) {
                    ambInnerSubscriberArr[i11].cancel();
                }
                i11 = i12;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class AmbInnerSubscriber<T> extends AtomicReference<InterfaceC5075d> implements FlowableSubscriber<T>, InterfaceC5075d {
        private static final long serialVersionUID = -1185974347409665484L;
        final InterfaceC5074c downstream;
        final int index;
        final AtomicLong missedRequested = new AtomicLong();
        final AmbCoordinator<T> parent;
        boolean won;

        AmbInnerSubscriber(AmbCoordinator<T> ambCoordinator, int i10, InterfaceC5074c interfaceC5074c) {
            this.parent = ambCoordinator;
            this.index = i10;
            this.downstream = interfaceC5074c;
        }

        @Override // p197jf.InterfaceC5075d
        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onComplete() {
            if (this.won) {
                this.downstream.onComplete();
            } else if (this.parent.win(this.index)) {
                this.won = true;
                this.downstream.onComplete();
            } else {
                get().cancel();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onError(Throwable th) {
            if (this.won) {
                this.downstream.onError(th);
            } else if (this.parent.win(this.index)) {
                this.won = true;
                this.downstream.onError(th);
            } else {
                get().cancel();
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onNext(T t10) {
            if (this.won) {
                this.downstream.onNext(t10);
            } else if (this.parent.win(this.index)) {
                this.won = true;
                this.downstream.onNext(t10);
            } else {
                get().cancel();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onSubscribe(InterfaceC5075d interfaceC5075d) {
            SubscriptionHelper.deferredSetOnce(this, this.missedRequested, interfaceC5075d);
        }

        @Override // p197jf.InterfaceC5075d
        public void request(long j10) {
            SubscriptionHelper.deferredRequest(this, this.missedRequested, j10);
        }
    }

    public FlowableAmb(InterfaceC5073b[] interfaceC5073bArr, Iterable<? extends InterfaceC5073b> iterable) {
        this.sources = interfaceC5073bArr;
        this.sourcesIterable = iterable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC5074c interfaceC5074c) {
        int length;
        InterfaceC5073b[] interfaceC5073bArr = this.sources;
        if (interfaceC5073bArr == null) {
            interfaceC5073bArr = new InterfaceC5073b[8];
            try {
                length = 0;
                for (InterfaceC5073b interfaceC5073b : this.sourcesIterable) {
                    if (interfaceC5073b == null) {
                        EmptySubscription.error(new NullPointerException("One of the sources is null"), interfaceC5074c);
                        return;
                    }
                    if (length == interfaceC5073bArr.length) {
                        InterfaceC5073b[] interfaceC5073bArr2 = new InterfaceC5073b[(length >> 2) + length];
                        System.arraycopy(interfaceC5073bArr, 0, interfaceC5073bArr2, 0, length);
                        interfaceC5073bArr = interfaceC5073bArr2;
                    }
                    int i10 = length + 1;
                    interfaceC5073bArr[length] = interfaceC5073b;
                    length = i10;
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                EmptySubscription.error(th, interfaceC5074c);
                return;
            }
        } else {
            length = interfaceC5073bArr.length;
        }
        if (length == 0) {
            EmptySubscription.complete(interfaceC5074c);
        } else if (length == 1) {
            interfaceC5073bArr[0].subscribe(interfaceC5074c);
        } else {
            new AmbCoordinator(interfaceC5074c, length).subscribe(interfaceC5073bArr);
        }
    }
}
