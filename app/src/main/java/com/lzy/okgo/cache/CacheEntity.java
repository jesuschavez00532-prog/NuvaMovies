package com.lzy.okgo.cache;

import android.content.ContentValues;
import android.database.Cursor;
import com.lzy.okgo.model.HttpHeaders;
import com.lzy.okgo.utils.IOUtils;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class CacheEntity<T> implements Serializable {
    public static final long CACHE_NEVER_EXPIRE = -1;
    public static final String DATA = "data";
    public static final String HEAD = "head";
    public static final String KEY = "key";
    public static final String LOCAL_EXPIRE = "localExpire";
    private static final long serialVersionUID = -4337711009801627866L;
    private T data;
    private boolean isExpire;
    private String key;
    private long localExpire;
    private HttpHeaders responseHeaders;

    public static <T> ContentValues getContentValues(CacheEntity<T> cacheEntity) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(KEY, cacheEntity.getKey());
        contentValues.put(LOCAL_EXPIRE, Long.valueOf(cacheEntity.getLocalExpire()));
        contentValues.put(HEAD, IOUtils.toByteArray(cacheEntity.getResponseHeaders()));
        contentValues.put("data", IOUtils.toByteArray(cacheEntity.getData()));
        return contentValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> CacheEntity<T> parseCursorToBean(Cursor cursor) {
        CacheEntity<T> cacheEntity = (CacheEntity<T>) new CacheEntity();
        cacheEntity.setKey(cursor.getString(cursor.getColumnIndex(KEY)));
        cacheEntity.setLocalExpire(cursor.getLong(cursor.getColumnIndex(LOCAL_EXPIRE)));
        cacheEntity.setResponseHeaders((HttpHeaders) IOUtils.toObject(cursor.getBlob(cursor.getColumnIndex(HEAD))));
        cacheEntity.setData(IOUtils.toObject(cursor.getBlob(cursor.getColumnIndex("data"))));
        return cacheEntity;
    }

    public boolean checkExpire(CacheMode cacheMode, long j10, long j11) {
        if (cacheMode == CacheMode.DEFAULT) {
            if (getLocalExpire() < j11) {
                return true;
            }
            return false;
        }
        if (j10 != -1 && getLocalExpire() + j10 < j11) {
            return true;
        }
        return false;
    }

    public T getData() {
        return this.data;
    }

    public String getKey() {
        return this.key;
    }

    public long getLocalExpire() {
        return this.localExpire;
    }

    public HttpHeaders getResponseHeaders() {
        return this.responseHeaders;
    }

    public boolean isExpire() {
        return this.isExpire;
    }

    public void setData(T t10) {
        this.data = t10;
    }

    public void setExpire(boolean z10) {
        this.isExpire = z10;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setLocalExpire(long j10) {
        this.localExpire = j10;
    }

    public void setResponseHeaders(HttpHeaders httpHeaders) {
        this.responseHeaders = httpHeaders;
    }

    public String toString() {
        return "CacheEntity{key='" + this.key + "', responseHeaders=" + this.responseHeaders + ", data=" + this.data + ", localExpire=" + this.localExpire + '}';
    }
}
