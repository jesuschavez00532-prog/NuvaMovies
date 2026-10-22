package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class FlowableOnBackpressureLatest<T> extends AbstractFlowableWithUpstream<T, T> {

    /* loaded from: classes3.dex */
    static final class BackpressureLatestSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC5075d {
        private static final long serialVersionUID = 163080509307634843L;
        volatile boolean cancelled;
        volatile boolean done;
        final InterfaceC5074c downstream;
        Throwable error;
        InterfaceC5075d upstream;
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<T> current = new AtomicReference<>();

        BackpressureLatestSubscriber(InterfaceC5074c interfaceC5074c) {
            this.downstream = interfaceC5074c;
        }

        @Override // p197jf.InterfaceC5075d
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.current.lazySet(null);
                }
            }
        }

        boolean checkTerminated(boolean z10, boolean z11, InterfaceC5074c interfaceC5074c, AtomicReference<T> atomicReference) {
            if (this.cancelled) {
                atomicReference.lazySet(null);
                return true;
            }
            if (z10) {
                Throwable th = this.error;
                if (th != null) {
                    atomicReference.lazySet(null);
                    interfaceC5074c.onError(th);
                    return true;
                }
                if (z11) {
                    interfaceC5074c.onComplete();
                    return true;
                }
                return false;
            }
            return false;
        }

        void drain() {
            boolean z10;
            boolean z11;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC5074c interfaceC5074c = this.downstream;
            AtomicLong atomicLong = this.requested;
            AtomicReference<T> atomicReference = this.current;
            int i10 = 1;
            do {
                long j10 = 0;
                while (true) {
                    z10 = false;
                    if (j10 == atomicLong.get()) {
                        break;
                    }
                    boolean z12 = this.done;
                    T andSet = atomicReference.getAndSet(null);
                    if (andSet == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (checkTerminated(z12, z11, interfaceC5074c, atomicReference)) {
                        return;
                    }
                    if (z11) {
                        break;
                    }
                    interfaceC5074c.onNext(andSet);
                    j10++;
                }
                if (j10 == atomicLong.get()) {
                    boolean z13 = this.done;
                    if (atomicReference.get() == null) {
                        z10 = true;
                    }
                    if (checkTerminated(z13, z10, interfaceC5074c, atomicReference)) {
                        return;
                    }
                }
                if (j10 != 0) {
                    BackpressureHelper.produced(atomicLong, j10);
                }
                i10 = addAndGet(-i10);
            } while (i10 != 0);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onNext(T t10) {
            this.current.lazySet(t10);
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onSubscribe(InterfaceC5075d interfaceC5075d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC5075d)) {
                this.upstream = interfaceC5075d;
                this.downstream.onSubscribe(this);
                interfaceC5075d.request(Long.MAX_VALUE);
            }
        }

        @Override // p197jf.InterfaceC5075d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                drain();
            }
        }
    }

    public FlowableOnBackpressureLatest(Flowable<T> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(InterfaceC5074c interfaceC5074c) {
        this.source.subscribe((FlowableSubscriber) new BackpressureLatestSubscriber(interfaceC5074c));
    }
}
