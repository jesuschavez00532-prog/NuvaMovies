package p317rb;

import android.text.TextUtils;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import java.net.Proxy;
import java.util.List;
import java.util.Map;
import ne.AbstractC5868k;
import okhttp3.OkHttpClient;
import p135fd.C4307b;

/* renamed from: rb.a */
/* loaded from: classes2.dex */
public abstract class AbstractC6567a {
    /* renamed from: a */
    public static final Observable m25631a(Observable observable, C4307b c4307b) {
        AbstractC5868k.m23674f(observable, "<this>");
        if (c4307b != null) {
            Observable compose = observable.compose(c4307b);
            AbstractC5868k.m23673e(compose, "{\n        this.compose(life)\n    }");
            return compose;
        }
        return observable;
    }

    /* renamed from: b */
    public static final void m25632b(Disposable disposable) {
        if (disposable != null && !disposable.isDisposed()) {
            disposable.dispose();
        }
    }

    /* renamed from: c */
    public static final OkHttpClient.Builder m25633c(OkHttpClient.Builder builder, int i10) {
        AbstractC5868k.m23674f(builder, "<this>");
        OkHttpClient.Builder proxy = builder.proxy(Proxy.NO_PROXY);
        AbstractC5868k.m23673e(proxy, "this.proxy(Proxy.NO_PROXY)");
        return proxy;
    }

    /* renamed from: d */
    public static final boolean m25634d(String str) {
        return TextUtils.isEmpty(str);
    }

    /* renamed from: e */
    public static final boolean m25635e(List list) {
        if (list != null && !list.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static final boolean m25636f(Map map) {
        if (map != null && !map.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static final boolean m25637g(String str) {
        return !TextUtils.isEmpty(str);
    }

    /* renamed from: h */
    public static final boolean m25638h(List list) {
        if (list != null && (!list.isEmpty())) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static final int m25639i(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    /* renamed from: j */
    public static final long m25640j(String str) {
        if (str == null) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
            return 0L;
        }
    }
}
