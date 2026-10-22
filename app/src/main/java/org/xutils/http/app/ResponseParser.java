package org.xutils.http.app;

import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public interface ResponseParser<ResponseDataType> extends RequestInterceptListener {
    Object parse(Type type, Class<?> cls, ResponseDataType responsedatatype);
}
