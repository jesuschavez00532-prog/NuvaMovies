package com.alibaba.sdk.android.httpdns;

import android.util.Log;
import com.alibaba.sdk.android.httpdns.p047d.C1538b;
import java.lang.Thread;

/* renamed from: com.alibaba.sdk.android.httpdns.k */
/* loaded from: classes.dex */
public class C1547k implements Thread.UncaughtExceptionHandler {
    /* renamed from: b */
    private void m7169b(Throwable th) {
        C1538b m7126a = C1538b.m7126a();
        if (m7126a != null) {
            m7126a.m7144k(th.getMessage());
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        try {
            Log.e("HttpDnsSDK", "Catch an uncaught exception, " + thread.getName() + ", error message: " + th.getMessage());
            m7169b(th);
            th.printStackTrace();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
