package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p197jf.InterfaceC5073b;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class FlowableConcatArray<T> extends Flowable<T> {
    final boolean delayError;
    final InterfaceC5073b[] sources;

    /* loaded from: classes3.dex */
    static final class ConcatArraySubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -8158322871608889516L;
        final boolean delayError;
        final InterfaceC5074c downstream;
        List<Throwable> errors;
        int index;
        long produced;
        final InterfaceC5073b[] sources;
        final AtomicInteger wip;

        ConcatArraySubscriber(InterfaceC5073b[] interfaceC5073bArr, boolean z10, InterfaceC5074c interfaceC5074c) {
            super(false);
            this.downstream = interfaceC5074c;
            this.sources = interfaceC5073bArr;
            this.delayError = z10;
            this.wip = new AtomicInteger();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onComplete() {
            if (this.wip.getAndIncrement() == 0) {
                InterfaceC5073b[] interfaceC5073bArr = this.sources;
                int length = interfaceC5073bArr.length;
                int i10 = this.index;
                while (i10 != length) {
                    InterfaceC5073b interfaceC5073b = interfaceC5073bArr[i10];
                    if (interfaceC5073b == null) {
                        NullPointerException nullPointerException = new NullPointerException("A Publisher entry is null");
                        if (this.delayError) {
                            List list = this.errors;
                            if (list == null) {
                                list = new ArrayList((length - i10) + 1);
                                this.errors = list;
                            }
                            list.add(nullPointerException);
                            i10++;
                        } else {
                            this.downstream.onError(nullPointerException);
                            return;
                        }
                    } else {
                        long j10 = this.produced;
                        if (j10 != 0) {
                            this.produced = 0L;
                            produced(j10);
                        }
                        interfaceC5073b.subscribe(this);
                        i10++;
                        this.index = i10;
                        if (this.wip.decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
                List<Throwable> list2 = this.errors;
                if (list2 != null) {
                    if (list2.size() == 1) {
                        this.downstream.onError(list2.get(0));
                        return;
                    } else {
                        this.downstream.onError(new CompositeException(list2));
                        return;
                    }
                }
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onError(Throwable th) {
            if (this.delayError) {
                List list = this.errors;
                if (list == null) {
                    list = new ArrayList((this.sources.length - this.index) + 1);
                    this.errors = list;
                }
                list.add(th);
                onComplete();
                return;
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onNext(T t10) {
            this.produced++;
            this.downstream.onNext(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onSubscribe(InterfaceC5075d interfaceC5075d) {
            setSubscription(interfaceC5075d);
        }
    }

    public FlowableConcatArray(InterfaceC5073b[] interfaceC5073bArr, boolean z10) {
        this.sources = interfaceC5073bArr;
        this.delayError = z10;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(InterfaceC5074c interfaceC5074c) {
        ConcatArraySubscriber concatArraySubscriber = new ConcatArraySubscriber(this.sources, this.delayError, interfaceC5074c);
        interfaceC5074c.onSubscribe(concatArraySubscriber);
        concatArraySubscriber.onComplete();
    }
}
