package com.alibaba.sdk.android.httpdns.p048e;

import android.util.Log;
import com.alibaba.sdk.android.httpdns.p046c.C1535a;
import java.util.Random;

/* renamed from: com.alibaba.sdk.android.httpdns.e.a */
/* loaded from: classes.dex */
public class C1541a {

    /* renamed from: t */
    private String f5946t;

    /* renamed from: com.alibaba.sdk.android.httpdns.e.a$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        private static final C1541a f5947a = new C1541a();
    }

    private C1541a() {
        try {
            Random random = new Random();
            char[] cArr = new char[12];
            for (int i10 = 0; i10 < 12; i10++) {
                cArr[i10] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(random.nextInt(62));
            }
            this.f5946t = new String(cArr);
        } catch (Exception e10) {
            Log.d("SessionTrackMgr", e10.getMessage(), e10);
        }
    }

    /* renamed from: a */
    public static C1541a m7156a() {
        return a.f5947a;
    }

    public String getSessionId() {
        return this.f5946t;
    }

    /* renamed from: l */
    public String m7157l() {
        int networkType = C1535a.m7104a().getNetworkType();
        return networkType != 1 ? networkType != 2 ? networkType != 3 ? networkType != 4 ? "unknown" : "4g" : "3g" : "2g" : "wifi";
    }
}
