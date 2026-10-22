package org.xutils.http.body;

import java.io.OutputStream;

/* loaded from: classes3.dex */
public interface RequestBody {
    long getContentLength();

    String getContentType();

    void setContentType(String str);

    void writeTo(OutputStream outputStream);
}
