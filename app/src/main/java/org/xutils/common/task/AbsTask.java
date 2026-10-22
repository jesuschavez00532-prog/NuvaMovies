package org.xutils.common.task;

import android.os.Looper;
import java.util.concurrent.Executor;
import org.xutils.common.Callback;

/* loaded from: classes3.dex */
public abstract class AbsTask<ResultType> implements Callback.Cancelable {
    private final Callback.Cancelable cancelHandler;
    private volatile boolean isCancelled;
    private ResultType result;
    private volatile State state;
    private C6087b taskProxy;

    /* loaded from: classes3.dex */
    public enum State {
        IDLE(0),
        WAITING(1),
        STARTED(2),
        SUCCESS(3),
        CANCELLED(4),
        ERROR(5);

        private final int value;

        State(int i10) {
            this.value = i10;
        }

        public int value() {
            return this.value;
        }
    }

    public AbsTask() {
        this(null);
    }

    @Override // org.xutils.common.Callback.Cancelable
    public final void cancel() {
        if (this.isCancelled) {
            return;
        }
        synchronized (this) {
            if (this.isCancelled) {
                return;
            }
            this.isCancelled = true;
            cancelWorks();
            Callback.Cancelable cancelable = this.cancelHandler;
            if (cancelable != null && !cancelable.isCancelled()) {
                this.cancelHandler.cancel();
            }
            if (this.state == State.WAITING || (this.state == State.STARTED && isCancelFast())) {
                C6087b c6087b = this.taskProxy;
                if (c6087b != null) {
                    c6087b.onCancelled(new Callback.CancelledException("cancelled by user"));
                    this.taskProxy.onFinished();
                } else if (this instanceof C6087b) {
                    onCancelled(new Callback.CancelledException("cancelled by user"));
                    onFinished();
                }
            }
        }
    }

    protected void cancelWorks() {
    }

    public Looper customLooper() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract ResultType doBackground();

    public Executor getExecutor() {
        return null;
    }

    public Priority getPriority() {
        return null;
    }

    public final ResultType getResult() {
        return this.result;
    }

    public final State getState() {
        return this.state;
    }

    protected boolean isCancelFast() {
        return false;
    }

    @Override // org.xutils.common.Callback.Cancelable
    public final boolean isCancelled() {
        Callback.Cancelable cancelable;
        if (!this.isCancelled && this.state != State.CANCELLED && ((cancelable = this.cancelHandler) == null || !cancelable.isCancelled())) {
            return false;
        }
        return true;
    }

    public final boolean isFinished() {
        if (this.state.value() > State.STARTED.value()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onCancelled(Callback.CancelledException cancelledException) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void onError(Throwable th, boolean z10);

    /* JADX INFO: Access modifiers changed from: protected */
    public void onFinished() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onStarted() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void onSuccess(ResultType resulttype);

    /* JADX INFO: Access modifiers changed from: protected */
    public void onUpdate(int i10, Object... objArr) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onWaiting() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setResult(ResultType resulttype) {
        this.result = resulttype;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setState(State state) {
        this.state = state;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setTaskProxy(C6087b c6087b) {
        this.taskProxy = c6087b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void update(int i10, Object... objArr) {
        C6087b c6087b = this.taskProxy;
        if (c6087b != null) {
            c6087b.onUpdate(i10, objArr);
        }
    }

    public AbsTask(Callback.Cancelable cancelable) {
        this.taskProxy = null;
        this.isCancelled = false;
        this.state = State.IDLE;
        this.cancelHandler = cancelable;
    }
}
