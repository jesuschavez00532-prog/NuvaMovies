package com.efs.sdk.base.http;

import com.efs.sdk.base.core.util.concurrent.InterfaceC1721b;
import com.efs.sdk.base.core.util.p056a.C1714a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class HttpEnv {
    private List<InterfaceC1721b<HttpResponse>> mHttpListenerList;
    private IHttpUtil mHttpUtil;

    /* loaded from: classes.dex */
    static class SingletonHolder {
        private static final HttpEnv INSTANCE = new HttpEnv();

        private SingletonHolder() {
        }
    }

    public static HttpEnv getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void addListener(AbsHttpListener absHttpListener) {
        this.mHttpListenerList.add(absHttpListener);
    }

    public List<InterfaceC1721b<HttpResponse>> getHttpListenerList() {
        return new ArrayList(this.mHttpListenerList);
    }

    public IHttpUtil getHttpUtil() {
        return this.mHttpUtil;
    }

    public void removeListener(AbsHttpListener absHttpListener) {
        this.mHttpListenerList.remove(absHttpListener);
    }

    public void setHttpUtil(IHttpUtil iHttpUtil) {
        this.mHttpUtil = iHttpUtil;
    }

    private HttpEnv() {
        this.mHttpUtil = C1714a.m7753a();
        this.mHttpListenerList = new ArrayList(1);
    }
}
