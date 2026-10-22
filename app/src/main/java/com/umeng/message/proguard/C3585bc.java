package com.umeng.message.proguard;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* renamed from: com.umeng.message.proguard.bc */
/* loaded from: classes3.dex */
public class C3585bc {

    /* renamed from: b */
    private static volatile C3585bc f16054b;

    /* renamed from: a */
    public final SharedPreferences f16055a = C3706y.m15840a().getSharedPreferences("umeng_push", 0);

    private C3585bc() {
    }

    /* renamed from: a */
    public static C3585bc m15386a() {
        if (f16054b == null) {
            synchronized (C3585bc.class) {
                if (f16054b == null) {
                    f16054b = new C3585bc();
                }
            }
        }
        return f16054b;
    }

    /* renamed from: a */
    public final void m15388a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f16055a.edit().putString(str, str2).apply();
    }

    /* renamed from: a */
    public final void m15387a(String str) {
        if (this.f16055a.contains(str)) {
            this.f16055a.edit().remove(str).apply();
        }
    }
}
