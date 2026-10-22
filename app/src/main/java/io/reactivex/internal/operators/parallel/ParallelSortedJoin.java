package io.reactivex.internal.operators.parallel;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;
import p203k4.AbstractC5127x;

/* loaded from: classes3.dex */
public final class ParallelSortedJoin<T> extends Flowable<T> {
    final Comparator<? super T> comparator;
    final ParallelFlowable<List<T>> source;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class SortedJoinInnerSubscriber<T> extends AtomicReference<InterfaceC5075d> implements FlowableSubscriber<List<T>> {
        private static final long serialVersionUID = 6751017204873808094L;
        final int index;
        final SortedJoinSubscription<T> parent;

        SortedJoinInnerSubscriber(SortedJoinSubscription<T> sortedJoinSubscription, int i10) {
            this.parent = sortedJoinSubscription;
            this.index = i10;
        }

        void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onComplete() {
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onError(Throwable th) {
            this.parent.innerError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onSubscribe(InterfaceC5075d interfaceC5075d) {
            SubscriptionHelper.setOnce(this, interfaceC5075d, Long.MAX_VALUE);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onNext(List<T> list) {
            this.parent.innerNext(list, this.index);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class SortedJoinSubscription<T> extends AtomicInteger implements InterfaceC5075d {
        private static final long serialVersionUID = 3481980673745556697L;
        volatile boolean cancelled;
        final Comparator<? super T> comparator;
        final InterfaceC5074c downstream;
        final int[] indexes;
        final List<T>[] lists;
        final SortedJoinInnerSubscriber<T>[] subscribers;
        final AtomicLong requested = new AtomicLong();
        final AtomicInteger remaining = new AtomicInteger();
        final AtomicReference<Throwable> error = new AtomicReference<>();

        SortedJoinSubscription(InterfaceC5074c interfaceC5074c, int i10, Comparator<? super T> comparator) {
            this.downstream = interfaceC5074c;
            this.comparator = comparator;
            SortedJoinInnerSubscriber<T>[] sortedJoinInnerSubscriberArr = new SortedJoinInnerSubscriber[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                sortedJoinInnerSubscriberArr[i11] = new SortedJoinInnerSubscriber<>(this, i11);
            }
            this.subscribers = sortedJoinInnerSubscriberArr;
            this.lists = new List[i10];
            this.indexes = new int[i10];
            this.remaining.lazySet(i10);
        }

        @Override // p197jf.InterfaceC5075d
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                cancelAll();
                if (getAndIncrement() == 0) {
                    Arrays.fill(this.lists, (Object) null);
                }
            }
        }

        void cancelAll() {
            for (SortedJoinInnerSubscriber<T> sortedJoinInnerSubscriber : this.subscribers) {
                sortedJoinInnerSubscriber.cancel();
            }
        }

        void drain() {
            boolean z10;
            boolean z11;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC5074c interfaceC5074c = this.downstream;
            List<T>[] listArr = this.lists;
            int[] iArr = this.indexes;
            int length = iArr.length;
            int i10 = 1;
            while (true) {
                long j10 = this.requested.get();
                long j11 = 0;
                while (j11 != j10) {
                    if (this.cancelled) {
                        Arrays.fill(listArr, (Object) null);
                        return;
                    }
                    Throwable th = this.error.get();
                    if (th != null) {
                        cancelAll();
                        Arrays.fill(listArr, (Object) null);
                        interfaceC5074c.onError(th);
                        return;
                    }
                    int i11 = -1;
                    T t10 = null;
                    for (int i12 = 0; i12 < length; i12++) {
                        List<T> list = listArr[i12];
                        int i13 = iArr[i12];
                        if (list.size() != i13) {
                            if (t10 == null) {
                                t10 = list.get(i13);
                            } else {
                                T t11 = list.get(i13);
                                try {
                                    if (this.comparator.compare(t10, t11) > 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        t10 = t11;
                                    }
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    cancelAll();
                                    Arrays.fill(listArr, (Object) null);
                                    if (!AbstractC5127x.m20760a(this.error, null, th2)) {
                                        RxJavaPlugins.onError(th2);
                                    }
                                    interfaceC5074c.onError(this.error.get());
                                    return;
                                }
                            }
                            i11 = i12;
                        }
                    }
                    if (t10 == null) {
                        Arrays.fill(listArr, (Object) null);
                        interfaceC5074c.onComplete();
                        return;
                    } else {
                        interfaceC5074c.onNext(t10);
                        iArr[i11] = iArr[i11] + 1;
                        j11++;
                    }
                }
                if (j11 == j10) {
                    if (this.cancelled) {
                        Arrays.fill(listArr, (Object) null);
                        return;
                    }
                    Throwable th3 = this.error.get();
                    if (th3 != null) {
                        cancelAll();
                        Arrays.fill(listArr, (Object) null);
                        interfaceC5074c.onError(th3);
                        return;
                    }
                    int i14 = 0;
                    while (true) {
                        if (i14 < length) {
                            if (iArr[i14] != listArr[i14].size()) {
                                z10 = false;
                                break;
                            }
                            i14++;
                        } else {
                            z10 = true;
                            break;
                        }
                    }
                    if (z10) {
                        Arrays.fill(listArr, (Object) null);
                        interfaceC5074c.onComplete();
                        return;
                    }
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j11);
                }
                int i15 = get();
                if (i15 == i10 && (i15 = addAndGet(-i10)) == 0) {
                    return;
                } else {
                    i10 = i15;
                }
            }
        }

        void innerError(Throwable th) {
            if (AbstractC5127x.m20760a(this.error, null, th)) {
                drain();
            } else if (th != this.error.get()) {
                RxJavaPlugins.onError(th);
            }
        }

        void innerNext(List<T> list, int i10) {
            this.lists[i10] = list;
            if (this.remaining.decrementAndGet() == 0) {
                drain();
            }
        }

        @Override // p197jf.InterfaceC5075d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                if (this.remaining.get() == 0) {
                    drain();
                }
            }
        }
    }

    public ParallelSortedJoin(ParallelFlowable<List<T>> parallelFlowable, Comparator<? super T> comparator) {
        this.source = parallelFlowable;
        this.comparator = comparator;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(InterfaceC5074c interfaceC5074c) {
        SortedJoinSubscription sortedJoinSubscription = new SortedJoinSubscription(interfaceC5074c, this.source.parallelism(), this.comparator);
        interfaceC5074c.onSubscribe(sortedJoinSubscription);
        this.source.subscribe(sortedJoinSubscription.subscribers);
    }
}
