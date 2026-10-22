package io.reactivex.subjects;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p203k4.AbstractC5127x;

/* loaded from: classes3.dex */
public final class UnicastSubject<T> extends Subject<T> {
    final boolean delayError;
    volatile boolean disposed;
    volatile boolean done;
    final AtomicReference<Observer<? super T>> downstream;
    boolean enableOperatorFusion;
    Throwable error;
    final AtomicReference<Runnable> onTerminate;
    final AtomicBoolean once;
    final SpscLinkedArrayQueue<T> queue;
    final BasicIntQueueDisposable<T> wip;

    /* loaded from: classes3.dex */
    final class UnicastQueueDisposable extends BasicIntQueueDisposable<T> {
        private static final long serialVersionUID = 7926949470189395511L;

        UnicastQueueDisposable() {
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            UnicastSubject.this.queue.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!UnicastSubject.this.disposed) {
                UnicastSubject.this.disposed = true;
                UnicastSubject.this.doTerminate();
                UnicastSubject.this.downstream.lazySet(null);
                if (UnicastSubject.this.wip.getAndIncrement() == 0) {
                    UnicastSubject.this.downstream.lazySet(null);
                    UnicastSubject unicastSubject = UnicastSubject.this;
                    if (!unicastSubject.enableOperatorFusion) {
                        unicastSubject.queue.clear();
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return UnicastSubject.this.disposed;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return UnicastSubject.this.queue.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            return UnicastSubject.this.queue.poll();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i10) {
            if ((i10 & 2) != 0) {
                UnicastSubject.this.enableOperatorFusion = true;
                return 2;
            }
            return 0;
        }
    }

    UnicastSubject(int i10, boolean z10) {
        this.queue = new SpscLinkedArrayQueue<>(ObjectHelper.verifyPositive(i10, "capacityHint"));
        this.onTerminate = new AtomicReference<>();
        this.delayError = z10;
        this.downstream = new AtomicReference<>();
        this.once = new AtomicBoolean();
        this.wip = new UnicastQueueDisposable();
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastSubject<T> create() {
        return new UnicastSubject<>(Observable.bufferSize(), true);
    }

    void doTerminate() {
        Runnable runnable = this.onTerminate.get();
        if (runnable != null && AbstractC5127x.m20760a(this.onTerminate, runnable, null)) {
            runnable.run();
        }
    }

    void drain() {
        if (this.wip.getAndIncrement() != 0) {
            return;
        }
        Observer<? super T> observer = this.downstream.get();
        int i10 = 1;
        while (observer == null) {
            i10 = this.wip.addAndGet(-i10);
            if (i10 == 0) {
                return;
            } else {
                observer = this.downstream.get();
            }
        }
        if (this.enableOperatorFusion) {
            drainFused(observer);
        } else {
            drainNormal(observer);
        }
    }

    void drainFused(Observer<? super T> observer) {
        SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
        int i10 = 1;
        boolean z10 = !this.delayError;
        while (!this.disposed) {
            boolean z11 = this.done;
            if (z10 && z11 && failedFast(spscLinkedArrayQueue, observer)) {
                return;
            }
            observer.onNext(null);
            if (z11) {
                errorOrComplete(observer);
                return;
            } else {
                i10 = this.wip.addAndGet(-i10);
                if (i10 == 0) {
                    return;
                }
            }
        }
        this.downstream.lazySet(null);
    }

    void drainNormal(Observer<? super T> observer) {
        boolean z10;
        SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
        boolean z11 = !this.delayError;
        boolean z12 = true;
        int i10 = 1;
        while (!this.disposed) {
            boolean z13 = this.done;
            T poll = this.queue.poll();
            if (poll == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z13) {
                if (z11 && z12) {
                    if (failedFast(spscLinkedArrayQueue, observer)) {
                        return;
                    } else {
                        z12 = false;
                    }
                }
                if (z10) {
                    errorOrComplete(observer);
                    return;
                }
            }
            if (z10) {
                i10 = this.wip.addAndGet(-i10);
                if (i10 == 0) {
                    return;
                }
            } else {
                observer.onNext(poll);
            }
        }
        this.downstream.lazySet(null);
        spscLinkedArrayQueue.clear();
    }

    void errorOrComplete(Observer<? super T> observer) {
        this.downstream.lazySet(null);
        Throwable th = this.error;
        if (th != null) {
            observer.onError(th);
        } else {
            observer.onComplete();
        }
    }

    boolean failedFast(SimpleQueue<T> simpleQueue, Observer<? super T> observer) {
        Throwable th = this.error;
        if (th != null) {
            this.downstream.lazySet(null);
            simpleQueue.clear();
            observer.onError(th);
            return true;
        }
        return false;
    }

    @Override // io.reactivex.subjects.Subject
    @Nullable
    public Throwable getThrowable() {
        if (this.done) {
            return this.error;
        }
        return null;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasComplete() {
        if (this.done && this.error == null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasObservers() {
        if (this.downstream.get() != null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
        if (this.done && this.error != null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (!this.done && !this.disposed) {
            this.done = true;
            doTerminate();
            drain();
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.done && !this.disposed) {
            this.error = th;
            this.done = true;
            doTerminate();
            drain();
            return;
        }
        RxJavaPlugins.onError(th);
    }

    @Override // io.reactivex.Observer
    public void onNext(T t10) {
        ObjectHelper.requireNonNull(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.done && !this.disposed) {
            this.queue.offer(t10);
            drain();
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        if (this.done || this.disposed) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(Observer<? super T> observer) {
        if (!this.once.get() && this.once.compareAndSet(false, true)) {
            observer.onSubscribe(this.wip);
            this.downstream.lazySet(observer);
            if (this.disposed) {
                this.downstream.lazySet(null);
                return;
            } else {
                drain();
                return;
            }
        }
        EmptyDisposable.error(new IllegalStateException("Only a single observer allowed."), observer);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastSubject<T> create(int i10) {
        return new UnicastSubject<>(i10, true);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastSubject<T> create(int i10, Runnable runnable) {
        return new UnicastSubject<>(i10, runnable, true);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastSubject<T> create(int i10, Runnable runnable, boolean z10) {
        return new UnicastSubject<>(i10, runnable, z10);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastSubject<T> create(boolean z10) {
        return new UnicastSubject<>(Observable.bufferSize(), z10);
    }

    UnicastSubject(int i10, Runnable runnable) {
        this(i10, runnable, true);
    }

    UnicastSubject(int i10, Runnable runnable, boolean z10) {
        this.queue = new SpscLinkedArrayQueue<>(ObjectHelper.verifyPositive(i10, "capacityHint"));
        this.onTerminate = new AtomicReference<>(ObjectHelper.requireNonNull(runnable, "onTerminate"));
        this.delayError = z10;
        this.downstream = new AtomicReference<>();
        this.once = new AtomicBoolean();
        this.wip = new UnicastQueueDisposable();
    }
}
