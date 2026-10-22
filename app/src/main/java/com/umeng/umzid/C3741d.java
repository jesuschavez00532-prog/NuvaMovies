package com.umeng.umzid;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Base64;
import anet.channel.request.Request;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;

/* renamed from: com.umeng.umzid.d */
/* loaded from: classes3.dex */
public class C3741d {

    /* renamed from: a */
    public static String[] f16775a = {"com.bly.dkplat", "com.by.chaos", "com.lbe.parallel", "com.excelliance.dualaid", "com.excelliance.multiaccounts", "com.lody.virtual", "com.qihoo.magic"};

    /* renamed from: a */
    public static String m15906a(Context context) {
        try {
            String str = DeviceConfig.UNKNOW;
            Method declaredMethod = DeviceConfig.class.getDeclaredMethod("getAndroidId", Context.class);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(DeviceConfig.class, context);
                if (invoke != null && (invoke instanceof String)) {
                    return (String) invoke;
                }
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    /* renamed from: b */
    public static String m15909b(Context context) {
        SharedPreferences m15901a;
        if (context == null || (m15901a = C3738a.m15901a(context)) == null) {
            return "";
        }
        String string = m15901a.getString("inputDomain", "");
        return m15914c(string) ? m15907a(string) : string;
    }

    /* renamed from: c */
    public static String m15912c(Context context) {
        SharedPreferences m15901a;
        return (context == null || (m15901a = C3738a.m15901a(context)) == null) ? "" : m15901a.getString("uabc", "");
    }

    /* renamed from: d */
    public static String m15915d(Context context) {
        SharedPreferences m15901a;
        if (context == null || (m15901a = C3738a.m15901a(context)) == null) {
            return null;
        }
        return m15901a.getString("aaid", null);
    }

    /* renamed from: e */
    public static String m15917e(Context context) {
        try {
            String str = DeviceConfig.UNKNOW;
            Method declaredMethod = DeviceConfig.class.getDeclaredMethod("getMac", Context.class);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(DeviceConfig.class, context);
                if (invoke != null && (invoke instanceof String)) {
                    return (String) invoke;
                }
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    /* renamed from: f */
    public static String m15919f(Context context) {
        try {
            String str = DeviceConfig.UNKNOW;
            Method declaredMethod = DeviceConfig.class.getDeclaredMethod("getOaid", Context.class);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(DeviceConfig.class, context);
                if (invoke != null && (invoke instanceof String)) {
                    return (String) invoke;
                }
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    /* renamed from: g */
    public static boolean m15921g(Context context) {
        boolean z10;
        try {
            String path = context.getFilesDir().getPath();
            for (String str : f16775a) {
                if (path.contains(str)) {
                    z10 = true;
                    break;
                }
            }
        } catch (Throwable th) {
            try {
                th.printStackTrace();
            } catch (Throwable th2) {
                th2.printStackTrace();
                return false;
            }
        }
        z10 = false;
        if (z10) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m15922h(Context context) {
        try {
            String str = UMUtils.UNKNOW;
            Method declaredMethod = UMUtils.class.getDeclaredMethod("isMainProgress", Context.class);
            if (declaredMethod == null) {
                return true;
            }
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(UMUtils.class, context)).booleanValue();
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: i */
    public static boolean m15923i(Context context) {
        NetworkInfo networkInfo;
        if (context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && (networkInfo = connectivityManager.getNetworkInfo(17)) != null) {
                    return networkInfo.isConnected();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m15924j(Context context) {
        try {
            String property = System.getProperty("http.proxyHost");
            String property2 = System.getProperty("http.proxyPort");
            if (property2 == null) {
                property2 = "-1";
            }
            return (TextUtils.isEmpty(property) || Integer.parseInt(property2) == -1) ? false : true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static String m15907a(String str) {
        try {
            return new String(Base64.decode(str.getBytes(Request.DEFAULT_CHARSET), 2));
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static String m15910b(String str) {
        try {
            return Base64.encodeToString(str.getBytes(Request.DEFAULT_CHARSET), 2);
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* renamed from: c */
    public static void m15913c(Context context, String str) {
        SharedPreferences m15901a;
        SharedPreferences.Editor edit;
        if (context == null || TextUtils.isEmpty(str) || (m15901a = C3738a.m15901a(context)) == null || (edit = m15901a.edit()) == null) {
            return;
        }
        edit.putString("resetToken", str).commit();
    }

    /* renamed from: d */
    public static void m15916d(Context context, String str) {
        SharedPreferences m15901a;
        SharedPreferences.Editor edit;
        if (context == null || TextUtils.isEmpty(str) || (m15901a = C3738a.m15901a(context)) == null || (edit = m15901a.edit()) == null) {
            return;
        }
        edit.putString("uabc", str).commit();
    }

    /* renamed from: e */
    public static void m15918e(Context context, String str) {
        SharedPreferences m15901a;
        SharedPreferences.Editor edit;
        if (context == null || str == null || TextUtils.isEmpty(str) || (m15901a = C3738a.m15901a(context)) == null || (edit = m15901a.edit()) == null) {
            return;
        }
        edit.putString("aaid", str).commit();
    }

    /* renamed from: f */
    public static void m15920f(Context context, String str) {
        SharedPreferences m15901a;
        SharedPreferences.Editor edit;
        if (context == null || str == null || TextUtils.isEmpty(str) || (m15901a = C3738a.m15901a(context)) == null || (edit = m15901a.edit()) == null) {
            return;
        }
        edit.putString("zdata", str).commit();
    }

    /* renamed from: a */
    public static void m15908a(Context context, String str) {
        SharedPreferences m15901a;
        SharedPreferences.Editor edit;
        String m15910b = m15910b(str);
        if (context == null || m15910b == null || TextUtils.isEmpty(m15910b) || (m15901a = C3738a.m15901a(context)) == null || (edit = m15901a.edit()) == null) {
            return;
        }
        edit.putString("mac", m15910b).commit();
    }

    /* renamed from: b */
    public static void m15911b(Context context, String str) {
        SharedPreferences m15901a;
        SharedPreferences.Editor edit;
        String m15910b = m15910b(str);
        if (context == null || m15910b == null || TextUtils.isEmpty(m15910b) || (m15901a = C3738a.m15901a(context)) == null || (edit = m15901a.edit()) == null) {
            return;
        }
        edit.putString("oaid", m15910b).commit();
    }

    /* renamed from: c */
    public static boolean m15914c(String str) {
        return !TextUtils.isEmpty(str) && str.equals(m15910b(m15907a(str)));
    }
}
