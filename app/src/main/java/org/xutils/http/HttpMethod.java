package org.xutils.http;

import anet.channel.request.Request;

/* loaded from: classes3.dex */
public enum HttpMethod {
    GET("GET"),
    POST("POST"),
    PUT(Request.Method.PUT),
    PATCH("PATCH"),
    HEAD(Request.Method.HEAD),
    MOVE("MOVE"),
    COPY("COPY"),
    DELETE("DELETE"),
    OPTIONS(Request.Method.OPTION),
    TRACE("TRACE"),
    CONNECT("CONNECT");

    private final String value;

    HttpMethod(String str) {
        this.value = str;
    }

    public static boolean permitsCache(HttpMethod httpMethod) {
        if (httpMethod != GET && httpMethod != POST) {
            return false;
        }
        return true;
    }

    public static boolean permitsRequestBody(HttpMethod httpMethod) {
        if (httpMethod != null && httpMethod != POST && httpMethod != PUT && httpMethod != PATCH && httpMethod != DELETE) {
            return false;
        }
        return true;
    }

    public static boolean permitsRetry(HttpMethod httpMethod) {
        if (httpMethod == GET) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
