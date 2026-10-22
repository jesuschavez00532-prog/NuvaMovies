package org.android.agoo.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.utl.ALog;

/* loaded from: classes3.dex */
public class Config {
    public static final String AGOO_CLEAR_TIME = "agoo_clear_time";
    public static final String AGOO_UNREPORT_TIMES = "agoo_UnReport_times";
    public static final String KEY_DEVICE_TOKEN = "deviceId";
    public static final String PREFERENCES = "Agoo_AppStore";
    public static final String PROPERTY_APP_KEY = "agoo_app_key";
    public static final String PROPERTY_APP_VERSION = "app_version";
    public static final String PROPERTY_DEVICE_TOKEN = "app_device_token";
    public static final String PROPERTY_PUSH_USER_TOKEN = "app_push_user_token";
    public static final String PROPERTY_SECRET_KEY = "agoo_secret";
    public static final String PROPERTY_TT_ID = "app_tt_id";
    public static final String TAG = "Config";

    /* renamed from: a */
    public static String f23680a;

    /* renamed from: b */
    private static String f23681b;

    /* renamed from: c */
    private static boolean f23682c;

    /* renamed from: d */
    private static String f23683d;

    /* renamed from: e */
    private static String f23684e;

    /* renamed from: a */
    public static String m24181a(Context context) {
        String str = f23681b;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            str = context.getSharedPreferences(PREFERENCES, 4).getString(PROPERTY_APP_KEY, null);
        } catch (Throwable th) {
            ALog.m12939e(TAG, "getAgooAppKey", th, new Object[0]);
        }
        if (TextUtils.isEmpty(str)) {
            ALog.m12940e(TAG, "getAgooAppKey null!!", new Object[0]);
        } else {
            ALog.m12938d(TAG, "getAgooAppKey", "appkey", str);
        }
        return str;
    }

    /* renamed from: b */
    public static String m24186b(Context context) {
        String str = f23683d;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            str = context.getSharedPreferences(PREFERENCES, 4).getString(PROPERTY_SECRET_KEY, "");
        } catch (Throwable th) {
            ALog.m12939e(TAG, "getAgooMessageSecret", th, new Object[0]);
        }
        if (TextUtils.isEmpty(str)) {
            ALog.m12940e(TAG, "getAgooMessageSecret null!!", new Object[0]);
        } else {
            ALog.m12938d(TAG, "getAgooMessageSecret", "secret", str);
        }
        return str;
    }

    /* renamed from: c */
    public static String m24189c(Context context) {
        if (TextUtils.isEmpty(f23680a)) {
            return ACCSManager.getDefaultConfig(context);
        }
        return f23680a;
    }

    /* renamed from: d */
    public static boolean m24191d(Context context) {
        try {
            if (context.getSharedPreferences(PREFERENCES, 4).getInt(AGOO_UNREPORT_TIMES, 0) <= 0) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static void m24192e(Context context) {
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences(PREFERENCES, 4).edit();
            edit.putInt(AGOO_UNREPORT_TIMES, 0);
            edit.apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: f */
    public static int m24193f(Context context) {
        try {
            return context.getSharedPreferences(PREFERENCES, 4).getInt(AGOO_UNREPORT_TIMES, 0);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: g */
    public static String m24194g(Context context) {
        String str;
        try {
            str = context.getSharedPreferences(PREFERENCES, 4).getString("deviceId", f23684e);
        } catch (Throwable th) {
            ALog.m12939e(TAG, "getDeviceToken", th, new Object[0]);
            str = null;
        }
        ALog.m12941i(TAG, "getDeviceToken", "token", str);
        return str;
    }

    /* renamed from: h */
    public static String m24195h(Context context) {
        try {
            return context.getSharedPreferences(PREFERENCES, 4).getString(PROPERTY_PUSH_USER_TOKEN, "");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void setAgooAppKey(Context context, String str) {
        try {
        } catch (Throwable th) {
            ALog.m12939e(TAG, "setAgooAppKey", th, new Object[0]);
        }
        if (TextUtils.isEmpty(str)) {
            ALog.m12940e(TAG, "setAgooAppKey appkey null", new Object[0]);
            return;
        }
        if (!TextUtils.isEmpty(f23681b)) {
            if (!TextUtils.equals(str, f23681b)) {
                ALog.m12940e(TAG, "setAgooAppKey error!", "new", str, "old", f23681b);
                return;
            }
            return;
        }
        String m24181a = m24181a(context);
        f23681b = str;
        if (TextUtils.equals(m24181a, str)) {
            return;
        }
        f23682c = true;
        SharedPreferences.Editor edit = context.getSharedPreferences(PREFERENCES, 4).edit();
        edit.putString(PROPERTY_APP_KEY, str);
        edit.apply();
        ALog.m12938d(TAG, "setAgooAppKey", "appkey", str);
    }

    /* renamed from: c */
    public static void m24190c(Context context, String str) {
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences(PREFERENCES, 4).edit();
            if (!TextUtils.isEmpty(str)) {
                edit.putString(PROPERTY_PUSH_USER_TOKEN, str);
            }
            edit.apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m24184a(Context context, String str) {
        try {
        } catch (Throwable th) {
            ALog.m12939e(TAG, "setAgooMessageSecret", th, new Object[0]);
        }
        if (TextUtils.isEmpty(str)) {
            ALog.m12940e(TAG, "setAgooMessageSecret secret null", new Object[0]);
            return;
        }
        if (!TextUtils.isEmpty(f23683d)) {
            if (TextUtils.equals(str, f23683d)) {
                return;
            }
            ALog.m12940e(TAG, "setAgooMessageSecret error!", "new", str, "old", f23683d);
        } else {
            f23683d = str;
            SharedPreferences.Editor edit = context.getSharedPreferences(PREFERENCES, 4).edit();
            edit.putString(PROPERTY_SECRET_KEY, f23683d);
            edit.apply();
            ALog.m12938d(TAG, "setAgooMessageSecret", "secret", str);
        }
    }

    /* renamed from: b */
    public static void m24187b(Context context, String str) {
        ALog.m12941i(TAG, "setDeviceToken", "token", str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f23684e = str;
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences(PREFERENCES, 4).edit();
            edit.putString("deviceId", str);
            edit.apply();
        } catch (Throwable th) {
            ALog.m12939e(TAG, "setDeviceToken", th, new Object[0]);
        }
    }

    /* renamed from: b */
    public static boolean m24188b(Context context, long j10) {
        try {
            long j11 = context.getSharedPreferences(PREFERENCES, 4).getLong(AGOO_CLEAR_TIME, 0L);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("now=");
            sb2.append(j10);
            sb2.append(",now - lastTime=");
            long j12 = j10 - j11;
            sb2.append(j12);
            sb2.append(",istrue=");
            sb2.append(j12 > 86400000);
            ALog.m12938d("isClearTime", sb2.toString(), new Object[0]);
            return j10 != 0 && j12 > 86400000;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m24185a() {
        return f23682c;
    }

    /* renamed from: a */
    public static void m24182a(Context context, int i10) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES, 4);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(AGOO_UNREPORT_TIMES, sharedPreferences.getInt(AGOO_UNREPORT_TIMES, 0) + i10);
            edit.apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m24183a(Context context, long j10) {
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences(PREFERENCES, 4).edit();
            edit.putLong(AGOO_CLEAR_TIME, j10);
            edit.apply();
        } catch (Throwable unused) {
        }
    }
}
