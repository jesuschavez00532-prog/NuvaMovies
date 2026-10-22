package org.xutils.http.request;

import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.taobao.accs.common.Constants;
import java.lang.reflect.Type;
import java.util.HashMap;
import org.xutils.common.util.LogUtil;
import org.xutils.http.RequestParams;
import org.xutils.http.app.RequestTracker;

/* loaded from: classes3.dex */
public final class UriRequestFactory {
    private static final HashMap<String, Class<? extends UriRequest>> SCHEME_CLS_MAP = new HashMap<>();
    private static Class<? extends RequestTracker> defaultTrackerCls;

    private UriRequestFactory() {
    }

    public static RequestTracker getDefaultTracker() {
        try {
            Class<? extends RequestTracker> cls = defaultTrackerCls;
            if (cls == null) {
                return null;
            }
            return cls.newInstance();
        } catch (Throwable th) {
            LogUtil.m24376e(th.getMessage(), th);
            return null;
        }
    }

    public static UriRequest getUriRequest(RequestParams requestParams, Type type) {
        String str;
        String uri = requestParams.getUri();
        int indexOf = uri.indexOf(":");
        if (uri.startsWith(Operator.Operation.DIVISION)) {
            str = "file";
        } else if (indexOf > 0) {
            str = uri.substring(0, indexOf);
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            Class<? extends UriRequest> cls = SCHEME_CLS_MAP.get(lowerCase);
            if (cls != null) {
                return cls.getConstructor(RequestParams.class, Type.class).newInstance(requestParams, type);
            }
            if (lowerCase.startsWith(HttpConstant.HTTP)) {
                return new HttpRequest(requestParams, type);
            }
            if (lowerCase.equals("assets")) {
                return new AssetsRequest(requestParams, type);
            }
            if (lowerCase.equals("file")) {
                return new LocalFileRequest(requestParams, type);
            }
            if (lowerCase.equals(Constants.SEND_TYPE_RES)) {
                return new ResRequest(requestParams, type);
            }
            throw new IllegalArgumentException("The url not be support: " + uri);
        }
        throw new IllegalArgumentException("The url not be support: " + uri);
    }

    public static void registerDefaultTrackerClass(Class<? extends RequestTracker> cls) {
        defaultTrackerCls = cls;
    }

    public static void registerRequestClass(String str, Class<? extends UriRequest> cls) {
        SCHEME_CLS_MAP.put(str, cls);
    }
}
