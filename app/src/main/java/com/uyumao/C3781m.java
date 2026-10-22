package com.uyumao;

import android.content.SharedPreferences;

/* renamed from: com.uyumao.m */
/* loaded from: classes3.dex */
public class C3781m {

    /* renamed from: a */
    public static volatile C3781m f16970a;

    /* renamed from: b */
    public final SharedPreferences f16971b = C3773e.m16002a().getSharedPreferences("um_social_azx", 0);

    /* renamed from: a */
    public static C3781m m16031a() {
        if (f16970a == null) {
            synchronized (C3781m.class) {
                if (f16970a == null) {
                    f16970a = new C3781m();
                }
            }
        }
        return f16970a;
    }
}
