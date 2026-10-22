package com.taobao.accs.utl;

import android.content.Context;
import android.content.SharedPreferences;
import com.lzy.okgo.cache.CacheEntity;
import com.taobao.accs.common.Constants;

/* renamed from: com.taobao.accs.utl.t */
/* loaded from: classes.dex */
public class C3207t {

    /* renamed from: a */
    private static volatile Long f13220a;

    /* renamed from: b */
    private static volatile Integer f13221b;

    /* renamed from: a */
    public static boolean m13036a() {
        return true;
    }

    /* renamed from: b */
    public static boolean m13037b() {
        return true;
    }

    /* renamed from: c */
    public static boolean m13038c() {
        return true;
    }

    /* renamed from: d */
    public static long m13039d() {
        if (f13221b == null) {
            f13221b = 10000;
            ALog.m12938d("OrangeAdapter", "getConnectTimeout", "result", f13221b);
        }
        return f13221b.intValue();
    }

    /* renamed from: e */
    public static boolean m13040e() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static long m13033a(Context context) {
        if (f13220a == null) {
            try {
                f13220a = Long.valueOf(context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getLong(Constants.SP_KEY_LAST_LAUNCH_TIME, 0L));
            } catch (Throwable th) {
                ALog.m12939e("OrangeAdapter", "getLastActiveTime", th, new Object[0]);
            }
            ALog.m12938d("OrangeAdapter", "getLastActiveTime", "result", f13220a);
        }
        return f13220a.longValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m13034a(Context context, long j10) {
        try {
            f13220a = Long.valueOf(j10);
            SharedPreferences.Editor edit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
            edit.putLong(Constants.SP_KEY_LAST_LAUNCH_TIME, j10);
            edit.apply();
        } catch (Throwable th) {
            ALog.m12939e("OrangeAdapter", "saveLastActiveTime fail:", th, "lastLaunchTime", Long.valueOf(j10));
        }
    }

    /* renamed from: a */
    public static void m13035a(Context context, String str, int i10) {
        try {
        } catch (Exception e10) {
            ALog.m12939e("OrangeAdapter", "saveConfigToSP fail:", e10, CacheEntity.KEY, str, "value", Integer.valueOf(i10));
        }
        if (context == null) {
            ALog.m12940e("OrangeAdapter", "saveTLogOffToSP context null", new Object[0]);
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
        edit.putInt(str, i10);
        edit.apply();
        ALog.m12941i("OrangeAdapter", "saveConfigToSP", CacheEntity.KEY, str, "value", Integer.valueOf(i10));
    }
}
