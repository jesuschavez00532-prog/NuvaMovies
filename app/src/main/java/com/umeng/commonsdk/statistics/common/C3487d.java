package com.umeng.commonsdk.statistics.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3309bd;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;

/* renamed from: com.umeng.commonsdk.statistics.common.d */
/* loaded from: classes3.dex */
public final class C3487d {

    /* renamed from: a */
    private static C3487d f15425a;

    /* renamed from: b */
    private static Context f15426b;

    /* renamed from: c */
    private static String f15427c;

    /* renamed from: d */
    private static final String f15428d = C3309bd.m13860b().m13863b(C3309bd.f14106m);

    public C3487d(Context context) {
    }

    /* renamed from: a */
    public static synchronized C3487d m14834a(Context context) {
        C3487d c3487d;
        synchronized (C3487d.class) {
            f15426b = context.getApplicationContext();
            f15427c = context.getPackageName();
            if (f15425a == null) {
                f15425a = new C3487d(context);
            }
            c3487d = f15425a;
        }
        return c3487d;
    }

    /* renamed from: f */
    private SharedPreferences m14835f() {
        return f15426b.getSharedPreferences(f15428d + f15427c, 0);
    }

    /* renamed from: b */
    public String m14840b() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f15426b);
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getString("st", null);
    }

    /* renamed from: c */
    public boolean m14841c() {
        if (UMFrUtils.envelopeFileNumber(f15426b) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public String[] m14842d() {
        try {
            SharedPreferences m14835f = m14835f();
            String string = m14835f.getString("au_p", null);
            String string2 = m14835f.getString("au_u", null);
            if (string == null || string2 == null) {
                return null;
            }
            return new String[]{string, string2};
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    public void m14843e() {
        m14835f().edit().remove("au_p").remove("au_u").commit();
    }

    /* renamed from: a */
    public void m14837a(int i10) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f15426b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt("vt", i10).commit();
        }
    }

    /* renamed from: a */
    public int m14836a() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f15426b);
        if (sharedPreferences != null) {
            return sharedPreferences.getInt("vt", 0);
        }
        return 0;
    }

    /* renamed from: a */
    public void m14838a(String str) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f15426b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("st", str).commit();
        }
    }

    /* renamed from: a */
    public void m14839a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        SharedPreferences.Editor edit = m14835f().edit();
        edit.putString("au_p", str);
        edit.putString("au_u", str2);
        edit.commit();
    }
}
