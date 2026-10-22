package org.xutils.http.body;

import org.xutils.http.ProgressHandler;

/* loaded from: classes3.dex */
public interface ProgressBody extends RequestBody {
    void setProgressHandler(ProgressHandler progressHandler);
}
