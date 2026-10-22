package com.alibaba.sdk.android.utils;

import android.util.Log;

/* renamed from: com.alibaba.sdk.android.utils.b */
/* loaded from: classes.dex */
public class C1568b {

    /* renamed from: b */
    private static boolean f6059b;

    /* renamed from: a */
    public static void m7241a(String str, String str2) {
        if (f6059b) {
            Log.d(str, str2);
        }
    }

    public static void setLogEnabled(boolean z10) {
        f6059b = z10;
    }
}
