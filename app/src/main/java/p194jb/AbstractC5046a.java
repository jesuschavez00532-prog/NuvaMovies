package p194jb;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: jb.a */
/* loaded from: classes2.dex */
public abstract class AbstractC5046a {
    /* renamed from: a */
    public static void m20494a(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("DomainCache", 0).edit();
        edit.clear();
        edit.apply();
    }

    /* renamed from: b */
    public static int m20495b(Context context) {
        return context.getSharedPreferences("UMPushConfig", 0).getInt("versionCode", 0);
    }

    /* renamed from: c */
    public static String m20496c(Context context, String str) {
        return context.getSharedPreferences("DomainCache", 0).getString(str, "");
    }

    /* renamed from: d */
    public static void m20497d(Context context, String str, Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        SharedPreferences.Editor edit = context.getSharedPreferences("DomainCache", 0).edit();
        if ("Integer".equals(simpleName)) {
            edit.putInt(str, ((Integer) obj).intValue());
        } else if ("Boolean".equals(simpleName)) {
            edit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if ("String".equals(simpleName)) {
            edit.putString(str, (String) obj);
        } else if ("Float".equals(simpleName)) {
            edit.putFloat(str, ((Float) obj).floatValue());
        } else if ("Long".equals(simpleName)) {
            edit.putLong(str, ((Long) obj).longValue());
        }
        edit.apply();
    }

    /* renamed from: e */
    public static void m20498e(Context context, int i10) {
        SharedPreferences.Editor edit = context.getSharedPreferences("UMPushConfig", 0).edit();
        edit.putInt("versionCode", i10);
        edit.apply();
    }
}
