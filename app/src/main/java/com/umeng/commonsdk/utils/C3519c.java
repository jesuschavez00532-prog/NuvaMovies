package com.umeng.commonsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3309bd;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.Calendar;
import java.util.Date;

/* renamed from: com.umeng.commonsdk.utils.c */
/* loaded from: classes3.dex */
public class C3519c {

    /* renamed from: b */
    private static final String f15620b = "lastReqTime";

    /* renamed from: c */
    private static final int f15621c = 48;

    /* renamed from: d */
    private static final int f15622d = 1;

    /* renamed from: e */
    private static final int f15623e = 720;

    /* renamed from: f */
    private static final String f15624f = "iss";

    /* renamed from: g */
    private static final String f15625g = "sinr";

    /* renamed from: h */
    private static final String f15626h = "clean";

    /* renamed from: i */
    private static boolean f15627i;

    /* renamed from: j */
    private static int f15628j;

    /* renamed from: a */
    private static final String f15619a = C3309bd.m13860b().m13863b(C3309bd.f14119z);

    /* renamed from: k */
    private static Object f15629k = new Object();

    static {
        f15627i = false;
        f15628j = f15623e;
        Context appContext = UMGlobalContext.getAppContext();
        if (appContext != null) {
            String imprintProperty = UMEnvelopeBuild.imprintProperty(appContext, f15624f, "");
            if (!TextUtils.isEmpty(imprintProperty) && "1".equals(imprintProperty)) {
                synchronized (f15629k) {
                    f15627i = true;
                }
                String imprintProperty2 = UMEnvelopeBuild.imprintProperty(appContext, f15625g, "");
                if (!TextUtils.isEmpty(imprintProperty)) {
                    try {
                        f15628j = m15119a(Integer.parseInt(imprintProperty2));
                        return;
                    } catch (Throwable unused) {
                        f15628j = 48;
                        return;
                    }
                }
                f15628j = 48;
            }
        }
    }

    /* renamed from: a */
    private static int m15119a(int i10) {
        if (i10 > f15623e) {
            return f15623e;
        }
        if (i10 < 1) {
            return 1;
        }
        return i10;
    }

    /* renamed from: b */
    public static long m15124b(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f15619a, 0);
        if (sharedPreferences == null) {
            return 0L;
        }
        return sharedPreferences.getLong(f15620b, 0L);
    }

    /* renamed from: c */
    public static void m15125c(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f15619a, 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean(f15626h, true).commit();
        }
    }

    /* renamed from: d */
    public static void m15126d(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f15619a, 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean(f15626h, false).commit();
        }
    }

    /* renamed from: e */
    public static boolean m15127e(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f15619a, 0);
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.getBoolean(f15626h, false);
    }

    /* renamed from: a */
    public static boolean m15122a() {
        boolean z10;
        synchronized (f15629k) {
            z10 = f15627i;
        }
        return z10;
    }

    /* renamed from: a */
    public static int m15120a(Context context) {
        int i10;
        synchronized (f15629k) {
            i10 = f15628j;
        }
        return i10;
    }

    /* renamed from: a */
    public static boolean m15123a(long j10, long j11, int i10) {
        Date date = new Date(j11);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j10));
        calendar.add(10, i10);
        return date.after(calendar.getTime());
    }

    /* renamed from: a */
    public static void m15121a(Context context, long j10) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f15619a, 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putLong(f15620b, j10).commit();
        }
    }
}
