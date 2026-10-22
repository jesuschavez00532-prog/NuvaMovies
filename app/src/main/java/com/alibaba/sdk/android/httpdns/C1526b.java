package com.alibaba.sdk.android.httpdns;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.alibaba.sdk.android.httpdns.b */
/* loaded from: classes.dex */
public class C1526b {

    /* renamed from: a */
    private static SharedPreferences f5874a = null;

    /* renamed from: a */
    private static boolean f5875a = true;

    /* renamed from: b */
    private static boolean f5876b = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m7066a(Context context) {
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("httpdns_config_enable", 0);
            f5874a = sharedPreferences;
            if (sharedPreferences != null) {
                f5875a = sharedPreferences.getBoolean("key_enable", true);
            }
        }
    }

    /* renamed from: b */
    public static void m7069b(boolean z10) {
        f5876b = z10;
    }

    /* renamed from: a */
    public static void m7067a(boolean z10) {
        f5875a = z10;
        SharedPreferences sharedPreferences = f5874a;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("key_enable", z10);
            edit.apply();
        }
    }

    /* renamed from: a */
    public static boolean m7068a() {
        return f5875a && f5876b;
    }
}
