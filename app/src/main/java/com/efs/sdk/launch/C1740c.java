package com.efs.sdk.launch;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.efs.sdk.base.core.util.ProcessUtil;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.efs.sdk.launch.c */
/* loaded from: classes.dex */
public final class C1740c {

    /* renamed from: a */
    private static String f7269a = "";

    /* renamed from: a */
    public static String m7802a(Context context) {
        Class<UMConfigure> cls;
        Method method;
        if (context == null) {
            return null;
        }
        try {
            cls = UMConfigure.class;
            UMLog uMLog = UMConfigure.umDebugLog;
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                method = cls.getMethod("getUMIDString", Context.class);
            } catch (NoSuchMethodException unused2) {
                method = null;
            }
            if (method != null) {
                try {
                    Object invoke = method.invoke(null, context);
                    if (invoke != null) {
                        return invoke.toString();
                    }
                    return null;
                } catch (IllegalAccessException | InvocationTargetException unused3) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: b */
    public static String m7804b(Context context) {
        SharedPreferences sharedPreferences;
        if (context == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences("efs_launch", 0)) == null) {
            return null;
        }
        return sharedPreferences.getString("first_launch_cache", null);
    }

    /* renamed from: c */
    public static void m7805c(Context context) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        if (context == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences("efs_launch", 0)) == null || (edit = sharedPreferences.edit()) == null) {
            return;
        }
        edit.putString("first_launch_cache", null);
        edit.commit();
    }

    /* renamed from: d */
    public static boolean m7806d(Context context) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences2;
        if ((context == null || (sharedPreferences2 = context.getApplicationContext().getSharedPreferences("efs_launch", 0)) == null) ? false : sharedPreferences2.getBoolean("is_install", false)) {
            return false;
        }
        if (context != null && (sharedPreferences = context.getApplicationContext().getSharedPreferences("efs_launch", 0)) != null && (edit = sharedPreferences.edit()) != null) {
            edit.putBoolean("is_install", true);
            edit.commit();
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m7807e(Context context) {
        try {
            String currentProcessName = ProcessUtil.getCurrentProcessName();
            String packageName = context.getApplicationContext().getPackageName();
            if (TextUtils.isEmpty(currentProcessName) || TextUtils.isEmpty(packageName)) {
                return false;
            }
            return currentProcessName.equals(packageName);
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static void m7803a(Context context, String str) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        if (context == null || str == null || TextUtils.isEmpty(str) || (sharedPreferences = context.getApplicationContext().getSharedPreferences("efs_launch", 0)) == null || (edit = sharedPreferences.edit()) == null) {
            return;
        }
        edit.putString("first_launch_cache", str);
        edit.commit();
    }
}
