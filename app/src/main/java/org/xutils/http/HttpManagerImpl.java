package org.xutils.http;

import java.lang.reflect.Type;
import org.xutils.C6127x;
import org.xutils.HttpManager;
import org.xutils.common.Callback;

/* loaded from: classes3.dex */
public final class HttpManagerImpl implements HttpManager {
    private static volatile HttpManagerImpl instance;
    private static final Object lock = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: org.xutils.http.HttpManagerImpl$a */
    /* loaded from: classes3.dex */
    public class C6095a implements Callback.TypedCallback {

        /* renamed from: a */
        private final Class f24030a;

        public C6095a(Class<Object> cls) {
            this.f24030a = cls;
        }

        @Override // org.xutils.common.Callback.TypedCallback
        public Type getLoadType() {
            return this.f24030a;
        }

        @Override // org.xutils.common.Callback.CommonCallback
        public void onCancelled(Callback.CancelledException cancelledException) {
        }

        @Override // org.xutils.common.Callback.CommonCallback
        public void onError(Throwable th, boolean z10) {
        }

        @Override // org.xutils.common.Callback.CommonCallback
        public void onFinished() {
        }

        @Override // org.xutils.common.Callback.CommonCallback
        public void onSuccess(Object obj) {
        }
    }

    private HttpManagerImpl() {
    }

    public static void registerInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new HttpManagerImpl();
                }
            }
        }
        C6127x.Ext.setHttpManager(instance);
    }

    @Override // org.xutils.HttpManager
    public <T> Callback.Cancelable get(RequestParams requestParams, Callback.CommonCallback<T> commonCallback) {
        return request(HttpMethod.GET, requestParams, commonCallback);
    }

    @Override // org.xutils.HttpManager
    public <T> T getSync(RequestParams requestParams, Class<T> cls) {
        return (T) requestSync(HttpMethod.GET, requestParams, cls);
    }

    @Override // org.xutils.HttpManager
    public <T> Callback.Cancelable post(RequestParams requestParams, Callback.CommonCallback<T> commonCallback) {
        return request(HttpMethod.POST, requestParams, commonCallback);
    }

    @Override // org.xutils.HttpManager
    public <T> T postSync(RequestParams requestParams, Class<T> cls) {
        return (T) requestSync(HttpMethod.POST, requestParams, cls);
    }

    @Override // org.xutils.HttpManager
    public <T> Callback.Cancelable request(HttpMethod httpMethod, RequestParams requestParams, Callback.CommonCallback<T> commonCallback) {
        Callback.Cancelable cancelable;
        requestParams.setMethod(httpMethod);
        if (commonCallback instanceof Callback.Cancelable) {
            cancelable = (Callback.Cancelable) commonCallback;
        } else {
            cancelable = null;
        }
        return C6127x.task().start(new HttpTask(requestParams, cancelable, commonCallback));
    }

    @Override // org.xutils.HttpManager
    public <T> T requestSync(HttpMethod httpMethod, RequestParams requestParams, Class<T> cls) {
        return (T) requestSync(httpMethod, requestParams, new C6095a(cls));
    }

    @Override // org.xutils.HttpManager
    public <T> T requestSync(HttpMethod httpMethod, RequestParams requestParams, Callback.TypedCallback<T> typedCallback) {
        requestParams.setMethod(httpMethod);
        return (T) C6127x.task().startSync(new HttpTask(requestParams, null, typedCallback));
    }
}
