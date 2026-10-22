package com.titan.thumbnail;

import android.util.Log;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;
import ne.AbstractC5868k;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import p213kf.C5260h;
import p227lf.C5555a;
import p432zc.AbstractC7782b;
import p432zc.AbstractC7784d;
import retrofit2.Retrofit;

/* loaded from: classes3.dex */
public final class ThumbnailRequest {
    private static Disposable mDisposable;
    private static ThumbnailCallback mthumbnailCallback;
    public static final ThumbnailRequest INSTANCE = new ThumbnailRequest();
    private static final String TAG = ThumbnailRequest.class.getSimpleName();
    private static final String baseUrl = baseUrl;
    private static final String baseUrl = baseUrl;
    private static long TIME_OUT = 15;
    private static final ConnectionPool sConnectionPool = new ConnectionPool(5, 2, TimeUnit.MINUTES);

    private ThumbnailRequest() {
    }

    private final Retrofit getRetrofit(String str) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        long j10 = TIME_OUT;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient build = builder.connectTimeout(j10, timeUnit).readTimeout(TIME_OUT, timeUnit).writeTimeout(TIME_OUT, timeUnit).connectionPool(sConnectionPool).build();
        AbstractC5868k.m23670b(build, "builder.build()");
        Retrofit m25779e = new Retrofit.Builder().m25777c(baseUrl).m25781g(build).m25775a(C5260h.m21165d()).m25776b(C5555a.m22516f()).m25779e();
        AbstractC5868k.m23670b(m25779e, "Retrofit.Builder()\n     …e())\n            .build()");
        return m25779e;
    }

    private final Observable<ThumbnailResult> getThumbnailResult(String str) {
        Observable compose = ((ThumbnailApi) getRetrofit(str).m25767b(ThumbnailApi.class)).getThumbnail(str).compose(AbstractC7782b.m30144a());
        AbstractC5868k.m23670b(compose, "getRetrofit(snapInfoUrl)…chedulerHelper.io2main())");
        return compose;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void request(String str) {
        if (AbstractC7784d.m30152a(str)) {
            ThumbnailCallback thumbnailCallback = mthumbnailCallback;
            if (thumbnailCallback != null) {
                thumbnailCallback.onGetThumbnail(false);
                return;
            }
            return;
        }
        Disposable disposable = mDisposable;
        if (disposable != null && !disposable.isDisposed()) {
            Disposable disposable2 = mDisposable;
            if (disposable2 != null) {
                disposable2.dispose();
            }
            mDisposable = null;
        }
        getThumbnailResult(str).subscribe(new Observer<ThumbnailResult>() { // from class: com.titan.thumbnail.ThumbnailRequest$request$1
            @Override // io.reactivex.Observer
            public void onComplete() {
            }

            @Override // io.reactivex.Observer
            public void onError(Throwable th) {
                ThumbnailCallback thumbnailCallback2;
                AbstractC5868k.m23675g(th, "e");
                ThumbnailRequest thumbnailRequest = ThumbnailRequest.INSTANCE;
                thumbnailCallback2 = ThumbnailRequest.mthumbnailCallback;
                if (thumbnailCallback2 != null) {
                    thumbnailCallback2.onGetThumbnail(false);
                }
            }

            @Override // io.reactivex.Observer
            public void onSubscribe(Disposable disposable3) {
                AbstractC5868k.m23675g(disposable3, "d");
                ThumbnailRequest thumbnailRequest = ThumbnailRequest.INSTANCE;
                ThumbnailRequest.mDisposable = disposable3;
            }

            @Override // io.reactivex.Observer
            public void onNext(ThumbnailResult thumbnailResult) {
                ThumbnailCallback thumbnailCallback2;
                ThumbnailCallback thumbnailCallback3;
                AbstractC5868k.m23675g(thumbnailResult, "t");
                if (AbstractC7784d.m30153b(thumbnailResult.getSource_url()) && thumbnailResult.getCombines() != null) {
                    if (thumbnailResult.getCombines() == null) {
                        AbstractC5868k.m23682n();
                    }
                    if (!r0.isEmpty()) {
                        ThumbnailUtil.INSTANCE.setData(thumbnailResult);
                        ThumbnailRequest thumbnailRequest = ThumbnailRequest.INSTANCE;
                        thumbnailCallback3 = ThumbnailRequest.mthumbnailCallback;
                        if (thumbnailCallback3 != null) {
                            thumbnailCallback3.onGetThumbnail(true);
                            return;
                        }
                        return;
                    }
                }
                ThumbnailRequest thumbnailRequest2 = ThumbnailRequest.INSTANCE;
                thumbnailCallback2 = ThumbnailRequest.mthumbnailCallback;
                if (thumbnailCallback2 != null) {
                    thumbnailCallback2.onGetThumbnail(false);
                }
            }
        });
    }

    public final void cancel() {
        Disposable disposable = mDisposable;
        if (disposable != null && !disposable.isDisposed()) {
            Disposable disposable2 = mDisposable;
            if (disposable2 != null) {
                disposable2.dispose();
            }
            Log.d(TAG, "cancel");
        }
        mDisposable = null;
    }

    public final void getThumbnail(final String str) {
        AbstractC5868k.m23675g(str, "snapInfoUrl");
        Observable.just("ioSchedulers").compose(AbstractC7782b.m30145b()).subscribe(new Consumer<String>() { // from class: com.titan.thumbnail.ThumbnailRequest$getThumbnail$1
            @Override // io.reactivex.functions.Consumer
            public final void accept(String str2) {
                ThumbnailRequest.INSTANCE.request(str);
            }
        }, new Consumer<Throwable>() { // from class: com.titan.thumbnail.ThumbnailRequest$getThumbnail$2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Throwable th) {
                th.printStackTrace();
            }
        });
    }

    public final void setThumbnailCallback(ThumbnailCallback thumbnailCallback) {
        mthumbnailCallback = thumbnailCallback;
    }
}
