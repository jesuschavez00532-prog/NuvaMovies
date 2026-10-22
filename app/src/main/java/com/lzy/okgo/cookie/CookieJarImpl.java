package com.lzy.okgo.cookie;

import com.lzy.okgo.cookie.store.CookieStore;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public class CookieJarImpl implements CookieJar {
    private CookieStore cookieStore;

    public CookieJarImpl(CookieStore cookieStore) {
        if (cookieStore != null) {
            this.cookieStore = cookieStore;
            return;
        }
        throw new IllegalArgumentException("cookieStore can not be null!");
    }

    public CookieStore getCookieStore() {
        return this.cookieStore;
    }

    @Override // okhttp3.CookieJar
    public synchronized List<Cookie> loadForRequest(HttpUrl httpUrl) {
        return this.cookieStore.loadCookie(httpUrl);
    }

    @Override // okhttp3.CookieJar
    public synchronized void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        this.cookieStore.saveCookie(httpUrl, list);
    }
}
