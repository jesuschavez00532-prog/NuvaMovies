package com.lzy.okgo.utils;

import android.text.TextUtils;
import com.lzy.okgo.cache.CacheEntity;
import com.lzy.okgo.cache.CacheMode;
import com.lzy.okgo.model.HttpHeaders;
import com.lzy.okgo.request.base.Request;
import java.util.Locale;
import java.util.StringTokenizer;
import okhttp3.Headers;

/* loaded from: classes2.dex */
public class HeaderParser {
    public static <T> void addCacheHeaders(Request request, CacheEntity<T> cacheEntity, CacheMode cacheMode) {
        HttpHeaders responseHeaders;
        if (cacheEntity != null && cacheMode == CacheMode.DEFAULT && (responseHeaders = cacheEntity.getResponseHeaders()) != null) {
            String str = responseHeaders.get(HttpHeaders.HEAD_KEY_E_TAG);
            if (str != null) {
                request.headers(HttpHeaders.HEAD_KEY_IF_NONE_MATCH, str);
            }
            long lastModified = HttpHeaders.getLastModified(responseHeaders.get(HttpHeaders.HEAD_KEY_LAST_MODIFIED));
            if (lastModified > 0) {
                request.headers(HttpHeaders.HEAD_KEY_IF_MODIFIED_SINCE, HttpHeaders.formatMillisToGMT(lastModified));
            }
        }
    }

    public static <T> CacheEntity<T> createCacheEntity(Headers headers, T t10, CacheMode cacheMode, String str) {
        long currentTimeMillis;
        long j10;
        if (cacheMode == CacheMode.DEFAULT) {
            long date = HttpHeaders.getDate(headers.get(HttpHeaders.HEAD_KEY_DATE));
            currentTimeMillis = HttpHeaders.getExpiration(headers.get(HttpHeaders.HEAD_KEY_EXPIRES));
            String cacheControl = HttpHeaders.getCacheControl(headers.get("Cache-Control"), headers.get(HttpHeaders.HEAD_KEY_PRAGMA));
            if (TextUtils.isEmpty(cacheControl) && currentTimeMillis <= 0) {
                return null;
            }
            if (!TextUtils.isEmpty(cacheControl)) {
                StringTokenizer stringTokenizer = new StringTokenizer(cacheControl, ",");
                j10 = 0;
                while (stringTokenizer.hasMoreTokens()) {
                    String lowerCase = stringTokenizer.nextToken().trim().toLowerCase(Locale.getDefault());
                    if (lowerCase.equals("no-cache") || lowerCase.equals("no-store")) {
                        return null;
                    }
                    if (lowerCase.startsWith("max-age=")) {
                        try {
                            j10 = Long.parseLong(lowerCase.substring(8));
                            if (j10 <= 0) {
                                return null;
                            }
                        } catch (Exception e10) {
                            OkLogger.printStackTrace(e10);
                        }
                    }
                }
            } else {
                j10 = 0;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            if (date <= 0) {
                date = currentTimeMillis2;
            }
            if (j10 > 0) {
                currentTimeMillis = date + (j10 * 1000);
            } else if (currentTimeMillis < 0) {
                currentTimeMillis = 0;
            }
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        HttpHeaders httpHeaders = new HttpHeaders();
        for (String str2 : headers.names()) {
            httpHeaders.put(str2, headers.get(str2));
        }
        CacheEntity<T> cacheEntity = new CacheEntity<>();
        cacheEntity.setKey(str);
        cacheEntity.setData(t10);
        cacheEntity.setLocalExpire(currentTimeMillis);
        cacheEntity.setResponseHeaders(httpHeaders);
        return cacheEntity;
    }
}
