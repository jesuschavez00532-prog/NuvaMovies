package com.alibaba.sdk.android.httpdns.p045b;

import android.text.TextUtils;
import java.text.SimpleDateFormat;

/* renamed from: com.alibaba.sdk.android.httpdns.b.c */
/* loaded from: classes.dex */
public class C1529c {

    /* renamed from: a */
    private static final SimpleDateFormat f5882a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /* renamed from: a */
    public static long m7083a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return Long.valueOf(str).longValue();
        } catch (Exception unused) {
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m7084c(String str) {
        try {
            return f5882a.format(Long.valueOf(m7083a(str) * 1000));
        } catch (Exception unused) {
            return f5882a.format(Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static String m7085d(String str) {
        try {
            return String.valueOf(f5882a.parse(str).getTime() / 1000);
        } catch (Exception unused) {
            return String.valueOf(System.currentTimeMillis() / 1000);
        }
    }
}
