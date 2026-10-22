package retrofit2;

import okhttp3.Request;

/* loaded from: classes3.dex */
public interface Call<T> extends Cloneable {
    void cancel();

    /* renamed from: clone */
    Call mo30180clone();

    Response execute();

    boolean isCanceled();

    /* renamed from: n */
    void mo25686n(Callback callback);

    Request request();
}
