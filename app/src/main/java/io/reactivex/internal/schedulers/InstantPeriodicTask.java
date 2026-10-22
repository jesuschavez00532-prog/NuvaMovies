package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p203k4.AbstractC5127x;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class InstantPeriodicTask implements Callable<Void>, Disposable {
    static final FutureTask<Void> CANCELLED = new FutureTask<>(Functions.EMPTY_RUNNABLE, null);
    final ExecutorService executor;
    final AtomicReference<Future<?>> first = new AtomicReference<>();
    final AtomicReference<Future<?>> rest = new AtomicReference<>();
    Thread runner;
    final Runnable task;

    /* JADX INFO: Access modifiers changed from: package-private */
    public InstantPeriodicTask(Runnable runnable, ExecutorService executorService) {
        this.task = runnable;
        this.executor = executorService;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        boolean z10;
        AtomicReference<Future<?>> atomicReference = this.first;
        FutureTask<Void> futureTask = CANCELLED;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        boolean z11 = true;
        if (andSet != null && andSet != futureTask) {
            if (this.runner != Thread.currentThread()) {
                z10 = true;
            } else {
                z10 = false;
            }
            andSet.cancel(z10);
        }
        Future<?> andSet2 = this.rest.getAndSet(futureTask);
        if (andSet2 != null && andSet2 != futureTask) {
            if (this.runner == Thread.currentThread()) {
                z11 = false;
            }
            andSet2.cancel(z11);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        if (this.first.get() == CANCELLED) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setFirst(Future<?> future) {
        Future<?> future2;
        boolean z10;
        do {
            future2 = this.first.get();
            if (future2 == CANCELLED) {
                if (this.runner != Thread.currentThread()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                future.cancel(z10);
                return;
            }
        } while (!AbstractC5127x.m20760a(this.first, future2, future));
    }

    void setRest(Future<?> future) {
        Future<?> future2;
        boolean z10;
        do {
            future2 = this.rest.get();
            if (future2 == CANCELLED) {
                if (this.runner != Thread.currentThread()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                future.cancel(z10);
                return;
            }
        } while (!AbstractC5127x.m20760a(this.rest, future2, future));
    }

    @Override // java.util.concurrent.Callable
    public Void call() {
        this.runner = Thread.currentThread();
        try {
            this.task.run();
            setRest(this.executor.submit(this));
            this.runner = null;
        } catch (Throwable th) {
            this.runner = null;
            RxJavaPlugins.onError(th);
        }
        return null;
    }
}
