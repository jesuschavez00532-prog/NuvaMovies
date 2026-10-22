package com.alibaba.sdk.android.httpdns.p046c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.alibaba.sdk.android.httpdns.c.a */
/* loaded from: classes.dex */
public class C1535a {

    /* renamed from: i */
    private int f5898i;

    /* renamed from: q */
    private String f5899q;

    /* renamed from: com.alibaba.sdk.android.httpdns.c.a$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: b */
        private static final C1535a f5900b = new C1535a();
    }

    private C1535a() {
        this.f5898i = 0;
        this.f5899q = "UNKNOWN";
    }

    /* renamed from: a */
    private int m7103a(Context context) {
        ConnectivityManager connectivityManager;
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception unused) {
        }
        if (connectivityManager == null) {
            return 0;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) {
            if (activeNetworkInfo.getType() == 1) {
                return 1;
            }
            if (activeNetworkInfo.getType() != 0) {
                return 0;
            }
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return 2;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 15:
                    return 3;
                case 12:
                case 14:
                default:
                    return 0;
                case 13:
                    return 4;
            }
        }
        return 255;
    }

    /* renamed from: d */
    private void m7105d(Context context) {
        int m7103a = m7103a(context);
        this.f5898i = m7103a;
        this.f5899q = "sp_" + m7103a;
    }

    /* renamed from: c */
    public void m7106c(Context context) {
        m7105d(context);
    }

    public int getNetworkType() {
        return this.f5898i;
    }

    /* renamed from: h */
    public boolean m7107h() {
        return this.f5898i == 1;
    }

    /* renamed from: i */
    public String m7108i() {
        return this.f5899q;
    }

    /* renamed from: a */
    public static C1535a m7104a() {
        return a.f5900b;
    }
}
