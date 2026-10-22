package com.alibaba.sdk.android.httpdns.p047d;

import android.text.TextUtils;
import com.alibaba.sdk.android.httpdns.C1544h;
import java.net.SocketTimeoutException;

/* renamed from: com.alibaba.sdk.android.httpdns.d.c */
/* loaded from: classes.dex */
public class C1539c {
    /* renamed from: a */
    public static int m7146a() {
        return 0;
    }

    /* renamed from: a */
    public static int m7147a(Throwable th) {
        return th instanceof C1544h ? ((C1544h) th).getErrorCode() : th instanceof SocketTimeoutException ? 10001 : 10000;
    }

    /* renamed from: a */
    public static String m7148a(Throwable th) {
        return (th == null || TextUtils.isEmpty(th.getMessage())) ? th instanceof SocketTimeoutException ? "time out exception" : "default error" : th.getMessage();
    }
}
