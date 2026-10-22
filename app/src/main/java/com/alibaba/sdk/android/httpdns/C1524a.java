package com.alibaba.sdk.android.httpdns;

import android.text.TextUtils;
import com.raizlabs.android.dbflow.sql.language.Operator;

/* renamed from: com.alibaba.sdk.android.httpdns.a */
/* loaded from: classes.dex */
class C1524a {

    /* renamed from: a */
    private static long f5865a;
    private static String sSecretKey;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m7054a(String str, String str2) {
        if (!C1548l.m7171b(str)) {
            return "";
        }
        try {
            return C1548l.m7170a(str + Operator.Operation.MINUS + sSecretKey + Operator.Operation.MINUS + str2);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getTimestamp() {
        return String.valueOf((System.currentTimeMillis() / 1000) + f5865a + 600);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setAuthCurrentTime(long j10) {
        f5865a = j10 - (System.currentTimeMillis() / 1000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setSecretKey(String str) {
        sSecretKey = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m7055a() {
        return !TextUtils.isEmpty(sSecretKey);
    }
}
