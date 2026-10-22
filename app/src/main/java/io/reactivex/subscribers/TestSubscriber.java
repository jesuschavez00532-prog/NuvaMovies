package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.BaseTestConsumer;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;
import p203k4.AbstractC5127x;

/* loaded from: classes3.dex */
public class TestSubscriber<T> extends BaseTestConsumer<T, TestSubscriber<T>> implements FlowableSubscriber<T>, InterfaceC5075d {
    private volatile boolean cancelled;
    private final InterfaceC5074c downstream;
    private final AtomicLong missedRequested;

    /* renamed from: qs */
    private QueueSubscription<T> f20674qs;
    private final AtomicReference<InterfaceC5075d> upstream;

    /* loaded from: classes3.dex */
    enum EmptySubscriber implements FlowableSubscriber<Object> {
        INSTANCE;

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onComplete() {
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onError(Throwable th) {
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onNext(Object obj) {
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onSubscribe(InterfaceC5075d interfaceC5075d) {
        }
    }

    public TestSubscriber() {
        this(EmptySubscriber.INSTANCE, Long.MAX_VALUE);
    }

    public static <T> TestSubscriber<T> create() {
        return new TestSubscriber<>();
    }

    static String fusionModeToString(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return "Unknown(" + i10 + ")";
                }
                return "ASYNC";
            }
            return "SYNC";
        }
        return "NONE";
    }

    final TestSubscriber<T> assertFuseable() {
        if (this.f20674qs != null) {
            return this;
        }
        throw new AssertionError("Upstream is not fuseable.");
    }

    final TestSubscriber<T> assertFusionMode(int i10) {
        int i11 = this.establishedFusionMode;
        if (i11 != i10) {
            if (this.f20674qs != null) {
                throw new AssertionError("Fusion mode different. Expected: " + fusionModeToString(i10) + ", actual: " + fusionModeToString(i11));
            }
            throw fail("Upstream is not fuseable");
        }
        return this;
    }

    final TestSubscriber<T> assertNotFuseable() {
        if (this.f20674qs == null) {
            return this;
        }
        throw new AssertionError("Upstream is fuseable.");
    }

    public final TestSubscriber<T> assertOf(Consumer<? super TestSubscriber<T>> consumer) {
        try {
            consumer.accept(this);
            return this;
        } catch (Throwable th) {
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    @Override // p197jf.InterfaceC5075d
    public final void cancel() {
        if (!this.cancelled) {
            this.cancelled = true;
            SubscriptionHelper.cancel(this.upstream);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        cancel();
    }

    public final boolean hasSubscription() {
        if (this.upstream.get() != null) {
            return true;
        }
        return false;
    }

    public final boolean isCancelled() {
        return this.cancelled;
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.cancelled;
    }

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public void onComplete() {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.upstream.get() == null) {
                this.errors.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.lastThread = Thread.currentThread();
            this.completions++;
            this.downstream.onComplete();
        } finally {
            this.done.countDown();
        }
    }

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public void onError(Throwable th) {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.upstream.get() == null) {
                this.errors.add(new NullPointerException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.lastThread = Thread.currentThread();
            this.errors.add(th);
            if (th == null) {
                this.errors.add(new IllegalStateException("onError received a null Throwable"));
            }
            this.downstream.onError(th);
        } finally {
            this.done.countDown();
        }
    }

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public void onNext(T t10) {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.upstream.get() == null) {
                this.errors.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.lastThread = Thread.currentThread();
        if (this.establishedFusionMode != 2) {
            this.values.add(t10);
            if (t10 == null) {
                this.errors.add(new NullPointerException("onNext received a null value"));
            }
            this.downstream.onNext(t10);
            return;
        }
        while (true) {
            try {
                T poll = this.f20674qs.poll();
                if (poll != null) {
                    this.values.add(poll);
                } else {
                    return;
                }
            } catch (Throwable th) {
                this.errors.add(th);
                this.f20674qs.cancel();
                return;
            }
        }
    }

    protected void onStart() {
    }

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public void onSubscribe(InterfaceC5075d interfaceC5075d) {
        this.lastThread = Thread.currentThread();
        if (interfaceC5075d == null) {
            this.errors.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (!AbstractC5127x.m20760a(this.upstream, null, interfaceC5075d)) {
            interfaceC5075d.cancel();
            if (this.upstream.get() != SubscriptionHelper.CANCELLED) {
                this.errors.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + interfaceC5075d));
                return;
            }
            return;
        }
        int i10 = this.initialFusionMode;
        if (i10 != 0 && (interfaceC5075d instanceof QueueSubscription)) {
            QueueSubscription<T> queueSubscription = (QueueSubscription) interfaceC5075d;
            this.f20674qs = queueSubscription;
            int requestFusion = queueSubscription.requestFusion(i10);
            this.establishedFusionMode = requestFusion;
            if (requestFusion == 1) {
                this.checkSubscriptionOnce = true;
                this.lastThread = Thread.currentThread();
                while (true) {
                    try {
                        T poll = this.f20674qs.poll();
                        if (poll != null) {
                            this.values.add(poll);
                        } else {
                            this.completions++;
                            return;
                        }
                    } catch (Throwable th) {
                        this.errors.add(th);
                        return;
                    }
                }
            }
        }
        this.downstream.onSubscribe(interfaceC5075d);
        long andSet = this.missedRequested.getAndSet(0L);
        if (andSet != 0) {
            interfaceC5075d.request(andSet);
        }
        onStart();
    }

    @Override // p197jf.InterfaceC5075d
    public final void request(long j10) {
        SubscriptionHelper.deferredRequest(this.upstream, this.missedRequested, j10);
    }

    public final TestSubscriber<T> requestMore(long j10) {
        request(j10);
        return this;
    }

    final TestSubscriber<T> setInitialFusionMode(int i10) {
        this.initialFusionMode = i10;
        return this;
    }

    public TestSubscriber(long j10) {
        this(EmptySubscriber.INSTANCE, j10);
    }

    public static <T> TestSubscriber<T> create(long j10) {
        return new TestSubscriber<>(j10);
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public final TestSubscriber<T> assertNotSubscribed() {
        if (this.upstream.get() == null) {
            if (this.errors.isEmpty()) {
                return this;
            }
            throw fail("Not subscribed but errors found");
        }
        throw fail("Subscribed!");
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public final TestSubscriber<T> assertSubscribed() {
        if (this.upstream.get() != null) {
            return this;
        }
        throw fail("Not subscribed!");
    }

    public TestSubscriber(InterfaceC5074c interfaceC5074c) {
        this(interfaceC5074c, Long.MAX_VALUE);
    }

    public static <T> TestSubscriber<T> create(InterfaceC5074c interfaceC5074c) {
        return new TestSubscriber<>(interfaceC5074c);
    }

    public TestSubscriber(InterfaceC5074c interfaceC5074c, long j10) {
        if (j10 >= 0) {
            this.downstream = interfaceC5074c;
            this.upstream = new AtomicReference<>();
            this.missedRequested = new AtomicLong(j10);
            return;
        }
        throw new IllegalArgumentException("Negative initial request not allowed");
    }
}
