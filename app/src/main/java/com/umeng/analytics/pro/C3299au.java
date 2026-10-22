package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.umeng.analytics.pro.au */
/* loaded from: classes3.dex */
public class C3299au {

    /* renamed from: a */
    public static final String f14028a = "cl_count";

    /* renamed from: b */
    public static final String f14029b = "interval_";

    /* renamed from: c */
    public static final String f14030c = "config_ts";

    /* renamed from: d */
    public static final String f14031d = "iucc_s1";

    /* renamed from: e */
    public static final String f14032e = "iucc_s2";

    /* renamed from: f */
    public static final String f14033f = "sdk_type_ver";

    /* renamed from: g */
    public static final String f14034g = "should_fetch";

    /* renamed from: h */
    public static final String f14035h = "last_type_index";

    /* renamed from: i */
    private static final String f14036i = "ccg_sp_config_file";

    private C3299au() {
    }

    /* renamed from: a */
    public static SharedPreferences m13805a(Context context) {
        if (context != null) {
            try {
                return context.getSharedPreferences(f14036i, 0);
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }
}
