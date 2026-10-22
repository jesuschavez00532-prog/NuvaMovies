package com.umeng.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.pro.C3309bd;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;

/* renamed from: com.umeng.common.b */
/* loaded from: classes3.dex */
public final class C3422b {

    /* renamed from: a */
    private static C3422b f15067a;

    /* renamed from: b */
    private static Context f15068b;

    /* renamed from: c */
    private static String f15069c;

    /* renamed from: d */
    private static final String f15070d = C3309bd.m13860b().m13863b(C3309bd.f14106m);

    /* renamed from: com.umeng.common.b$a */
    /* loaded from: classes3.dex */
    private static final class a {

        /* renamed from: a */
        private static final C3422b f15071a = new C3422b();

        private a() {
        }
    }

    /* renamed from: a */
    public static synchronized C3422b m14516a(Context context) {
        C3422b c3422b;
        synchronized (C3422b.class) {
            if (f15068b == null && context != null) {
                f15068b = context.getApplicationContext();
            }
            if (f15068b != null) {
                f15069c = context.getPackageName();
            }
            c3422b = a.f15071a;
        }
        return c3422b;
    }

    /* renamed from: e */
    private SharedPreferences m14520e() {
        Context context = f15068b;
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences(f15070d + f15069c, 0);
    }

    /* renamed from: b */
    public void m14525b() {
        SharedPreferences m14520e = m14520e();
        if (m14520e != null) {
            m14520e.edit().remove("au_p").remove("au_u").commit();
        }
    }

    /* renamed from: c */
    public String m14526c() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f15068b);
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getString("st", null);
    }

    /* renamed from: d */
    public int m14527d() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f15068b);
        if (sharedPreferences == null) {
            return 0;
        }
        return sharedPreferences.getInt("vt", 0);
    }

    /* renamed from: a */
    public void m14523a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        SharedPreferences.Editor edit = m14520e().edit();
        edit.putString("au_p", str);
        edit.putString("au_u", str2);
        edit.commit();
    }

    /* renamed from: a */
    public String[] m14524a() {
        SharedPreferences m14520e = m14520e();
        if (m14520e != null) {
            String string = m14520e.getString("au_p", null);
            String string2 = m14520e.getString("au_u", null);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                return new String[]{string, string2};
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m14522a(String str) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f15068b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("st", str).commit();
        }
    }

    /* renamed from: a */
    public void m14521a(int i10) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f15068b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt("vt", i10).commit();
        }
    }

    /* renamed from: a */
    public static String m14517a(Context context, String str, String str2) {
        SharedPreferences sharedPreferences;
        return (context == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(str, 0)) == null) ? "" : sharedPreferences.getString(str2, "");
    }

    /* renamed from: a */
    public static void m14519a(Context context, String str, String str2, String str3) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        if (context == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(str, 0)) == null || (edit = sharedPreferences.edit()) == null) {
            return;
        }
        edit.putString(str2, str3);
        edit.commit();
    }

    /* renamed from: a */
    public static void m14518a(Context context, String str) {
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences(str, 0).edit();
        edit.remove("debugkey");
        edit.remove(AnalyticsConfig.RTD_PERIOD);
        edit.remove(AnalyticsConfig.RTD_START_TIME);
        edit.clear();
        edit.commit();
    }
}
