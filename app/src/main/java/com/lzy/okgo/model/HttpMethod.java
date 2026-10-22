package com.lzy.okgo.model;

import anet.channel.request.Request;

/* loaded from: classes2.dex */
public enum HttpMethod {
    GET("GET"),
    POST("POST"),
    PUT(Request.Method.PUT),
    DELETE("DELETE"),
    HEAD(Request.Method.HEAD),
    PATCH("PATCH"),
    OPTIONS(Request.Method.OPTION),
    TRACE("TRACE");

    private final String value;

    /* renamed from: com.lzy.okgo.model.HttpMethod$1 */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C29251 {
        static final /* synthetic */ int[] $SwitchMap$com$lzy$okgo$model$HttpMethod;

        static {
            int[] iArr = new int[HttpMethod.values().length];
            $SwitchMap$com$lzy$okgo$model$HttpMethod = iArr;
            try {
                iArr[HttpMethod.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$lzy$okgo$model$HttpMethod[HttpMethod.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$lzy$okgo$model$HttpMethod[HttpMethod.PATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$lzy$okgo$model$HttpMethod[HttpMethod.DELETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$lzy$okgo$model$HttpMethod[HttpMethod.OPTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    HttpMethod(String str) {
        this.value = str;
    }

    public boolean hasBody() {
        int i10 = C29251.$SwitchMap$com$lzy$okgo$model$HttpMethod[ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
