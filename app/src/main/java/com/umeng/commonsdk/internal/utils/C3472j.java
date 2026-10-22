package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3309bd;

/* renamed from: com.umeng.commonsdk.internal.utils.j */
/* loaded from: classes3.dex */
public class C3472j {

    /* renamed from: a */
    private static final String f15342a = C3309bd.m13860b().m13863b(C3309bd.f14111r);

    /* renamed from: b */
    private static final String f15343b = "um_common_strength";

    /* renamed from: c */
    private static final String f15344c = "um_common_battery";

    /* renamed from: a */
    public static String m14684a(Context context) {
        SharedPreferences sharedPreferences;
        if (context == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(f15342a, 0)) == null) {
            return null;
        }
        return sharedPreferences.getString(f15344c, null);
    }

    /* renamed from: a */
    public static void m14685a(Context context, String str) {
        SharedPreferences sharedPreferences;
        if (context == null || TextUtils.isEmpty(str) || (sharedPreferences = context.getApplicationContext().getSharedPreferences(f15342a, 0)) == null) {
            return;
        }
        sharedPreferences.edit().putString(f15344c, str).commit();
    }
}
