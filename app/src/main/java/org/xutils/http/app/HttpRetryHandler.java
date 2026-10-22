package org.xutils.http.app;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.HashSet;
import org.json.JSONException;
import org.xutils.common.Callback;
import org.xutils.common.util.LogUtil;
import org.xutils.http.HttpMethod;
import org.xutils.http.request.UriRequest;
import org.xutils.p275ex.HttpException;

/* loaded from: classes3.dex */
public class HttpRetryHandler {
    protected static HashSet<Class<?>> blackList;
    protected int maxRetryCount = 2;

    static {
        HashSet<Class<?>> hashSet = new HashSet<>();
        blackList = hashSet;
        hashSet.add(HttpException.class);
        blackList.add(Callback.CancelledException.class);
        blackList.add(MalformedURLException.class);
        blackList.add(URISyntaxException.class);
        blackList.add(NoRouteToHostException.class);
        blackList.add(PortUnreachableException.class);
        blackList.add(ProtocolException.class);
        blackList.add(NullPointerException.class);
        blackList.add(FileNotFoundException.class);
        blackList.add(JSONException.class);
        blackList.add(UnknownHostException.class);
        blackList.add(IllegalArgumentException.class);
    }

    public boolean canRetry(UriRequest uriRequest, Throwable th, int i10) {
        LogUtil.m24382w(th.getMessage(), th);
        if (i10 > this.maxRetryCount) {
            LogUtil.m24381w(uriRequest.toString());
            LogUtil.m24381w("The Max Retry times has been reached!");
            return false;
        }
        if (!HttpMethod.permitsRetry(uriRequest.getParams().getMethod())) {
            LogUtil.m24381w(uriRequest.toString());
            LogUtil.m24381w("The Request Method can not be retried.");
            return false;
        }
        if (blackList.contains(th.getClass())) {
            LogUtil.m24381w(uriRequest.toString());
            LogUtil.m24381w("The Exception can not be retried.");
            return false;
        }
        return true;
    }

    public void setMaxRetryCount(int i10) {
        this.maxRetryCount = i10;
    }
}
