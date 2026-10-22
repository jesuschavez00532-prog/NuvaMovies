package com.umeng.message.proguard;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* renamed from: com.umeng.message.proguard.ds */
/* loaded from: classes3.dex */
public class C3657ds {

    /* renamed from: b */
    private static volatile C3657ds f16439b;

    /* renamed from: a */
    public final SharedPreferences f16440a = C3643de.m15638a().getSharedPreferences("um_push_union", 0);

    private C3657ds() {
    }

    /* renamed from: a */
    public static C3657ds m15679a() {
        if (f16439b == null) {
            synchronized (C3657ds.class) {
                if (f16439b == null) {
                    f16439b = new C3657ds();
                }
            }
        }
        return f16439b;
    }

    /* renamed from: b */
    public final String m15681b(String str, String str2) {
        return this.f16440a.getString(str, str2);
    }

    /* renamed from: a */
    public final void m15680a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f16440a.edit().putString(str, str2).apply();
    }
}
