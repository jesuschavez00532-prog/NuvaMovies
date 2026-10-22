package org.xutils.common;

import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public interface Callback {

    /* loaded from: classes3.dex */
    public interface CacheCallback<ResultType> extends CommonCallback<ResultType> {
        boolean onCache(ResultType resulttype);
    }

    /* loaded from: classes3.dex */
    public interface Callable<ResultType> {
        void call(ResultType resulttype);
    }

    /* loaded from: classes3.dex */
    public interface Cancelable {
        void cancel();

        boolean isCancelled();
    }

    /* loaded from: classes3.dex */
    public static class CancelledException extends RuntimeException {
        public CancelledException(String str) {
            super(str);
        }
    }

    /* loaded from: classes3.dex */
    public interface CommonCallback<ResultType> extends Callback {
        void onCancelled(CancelledException cancelledException);

        void onError(Throwable th, boolean z10);

        void onFinished();

        void onSuccess(ResultType resulttype);
    }

    /* loaded from: classes3.dex */
    public interface GroupCallback<ItemType> extends Callback {
        void onAllFinished();

        void onCancelled(ItemType itemtype, CancelledException cancelledException);

        void onError(ItemType itemtype, Throwable th, boolean z10);

        void onFinished(ItemType itemtype);

        void onSuccess(ItemType itemtype);
    }

    /* loaded from: classes3.dex */
    public interface PrepareCallback<PrepareType, ResultType> extends CommonCallback<ResultType> {
        ResultType prepare(PrepareType preparetype);
    }

    /* loaded from: classes3.dex */
    public interface ProgressCallback<ResultType> extends CommonCallback<ResultType> {
        void onLoading(long j10, long j11, boolean z10);

        void onStarted();

        void onWaiting();
    }

    /* loaded from: classes3.dex */
    public interface ProxyCacheCallback<ResultType> extends CacheCallback<ResultType> {
        boolean onlyCache();
    }

    /* loaded from: classes3.dex */
    public interface TypedCallback<ResultType> extends CommonCallback<ResultType> {
        Type getLoadType();
    }
}
