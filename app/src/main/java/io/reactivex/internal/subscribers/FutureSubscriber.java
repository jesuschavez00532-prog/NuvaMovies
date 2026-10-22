package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p197jf.InterfaceC5075d;
import p203k4.AbstractC5127x;

/* loaded from: classes3.dex */
public final class FutureSubscriber<T> extends CountDownLatch implements FlowableSubscriber<T>, Future<T>, InterfaceC5075d {
    Throwable error;
    final AtomicReference<InterfaceC5075d> upstream;
    T value;

    public FutureSubscriber() {
        super(1);
        this.upstream = new AtomicReference<>();
    }

    @Override // p197jf.InterfaceC5075d
    public void cancel() {
    }

    @Override // java.util.concurrent.Future
    public T get() {
        if (getCount() != 0) {
            BlockingHelper.verifyNonBlocking();
            await();
        }
        if (!isCancelled()) {
            Throwable th = this.error;
            if (th == null) {
                return this.value;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        if (this.upstream.get() == SubscriptionHelper.CANCELLED) {
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        if (getCount() == 0) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public void onComplete() {
        InterfaceC5075d interfaceC5075d;
        if (this.value == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            interfaceC5075d = this.upstream.get();
            if (interfaceC5075d == this || interfaceC5075d == SubscriptionHelper.CANCELLED) {
                return;
            }
        } while (!AbstractC5127x.m20760a(this.upstream, interfaceC5075d, this));
        countDown();
    }

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public void onError(Throwable th) {
        InterfaceC5075d interfaceC5075d;
        do {
            interfaceC5075d = this.upstream.get();
            if (interfaceC5075d != this && interfaceC5075d != SubscriptionHelper.CANCELLED) {
                this.error = th;
            } else {
                RxJavaPlugins.onError(th);
                return;
            }
        } while (!AbstractC5127x.m20760a(this.upstream, interfaceC5075d, this));
        countDown();
    }

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public void onNext(T t10) {
        if (this.value != null) {
            this.upstream.get().cancel();
            onError(new IndexOutOfBoundsException("More than one element received"));
        } else {
            this.value = t10;
        }
    }

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public void onSubscribe(InterfaceC5075d interfaceC5075d) {
        SubscriptionHelper.setOnce(this.upstream, interfaceC5075d, Long.MAX_VALUE);
    }

    @Override // p197jf.InterfaceC5075d
    public void request(long j10) {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        InterfaceC5075d interfaceC5075d;
        SubscriptionHelper subscriptionHelper;
        do {
            interfaceC5075d = this.upstream.get();
            if (interfaceC5075d == this || interfaceC5075d == (subscriptionHelper = SubscriptionHelper.CANCELLED)) {
                return false;
            }
        } while (!AbstractC5127x.m20760a(this.upstream, interfaceC5075d, subscriptionHelper));
        if (interfaceC5075d != null) {
            interfaceC5075d.cancel();
        }
        countDown();
        return true;
    }

    @Override // java.util.concurrent.Future
    public T get(long j10, TimeUnit timeUnit) {
        if (getCount() != 0) {
            BlockingHelper.verifyNonBlocking();
            if (!await(j10, timeUnit)) {
                throw new TimeoutException(ExceptionHelper.timeoutMessage(j10, timeUnit));
            }
        }
        if (!isCancelled()) {
            Throwable th = this.error;
            if (th == null) {
                return this.value;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }
}
