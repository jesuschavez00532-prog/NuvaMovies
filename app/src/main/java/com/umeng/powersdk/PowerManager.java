package com.umeng.powersdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
import com.umeng.powersdk.C3722c;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class PowerManager {
    public static final String TAG = "PowerManager";

    /* renamed from: a */
    private static Context f16731a = null;

    /* renamed from: b */
    private static boolean f16732b = false;

    /* renamed from: c */
    private static EfsReporter f16733c = null;

    /* renamed from: d */
    private static PowerConfigManager f16734d = null;
    public static boolean isDebug = true;

    public static Context getApplicationContext() {
        return f16731a;
    }

    public static PowerConfigManager getPowerConfigManager() {
        return f16734d;
    }

    public static EfsReporter getReporter() {
        return f16733c;
    }

    public static void init(Context context, EfsReporter efsReporter) {
        final C3722c c3722c;
        if (context == null || efsReporter == null) {
            try {
                if (isDebug) {
                    Log.e(TAG, "init power manager error! parameter is null!");
                    return;
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        if (isInit()) {
            if (isDebug) {
                Log.e(TAG, "invalid init ！");
                return;
            }
            return;
        }
        f16731a = context.getApplicationContext();
        f16733c = efsReporter;
        f16734d = new PowerConfigManager(context, efsReporter);
        f16732b = true;
        c3722c = C3722c.a.f16759a;
        try {
            if (getPowerConfigManager() == null || !getPowerConfigManager().enableTracer()) {
                return;
            }
            SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("efs_power", 0);
            if (sharedPreferences != null) {
                c3722c.f16744b = sharedPreferences.getInt("apm_powerperf_collect_interval", 5);
                c3722c.f16745c = sharedPreferences.getInt("apm_powerperf_collect_max_period_sec", 100);
            }
            final HandlerThread handlerThread = new HandlerThread("power-info");
            handlerThread.start();
            final Handler handler = new Handler(handlerThread.getLooper()) { // from class: com.umeng.powersdk.c.1
                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    super.handleMessage(message);
                    if (message.what == C3722c.this.f16743a) {
                        try {
                            handlerThread.quit();
                        } catch (Throwable unused) {
                        }
                    }
                }
            };
            handler.post(new Runnable() { // from class: com.umeng.powersdk.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        final C3722c c3722c2 = C3722c.this;
                        final Handler handler2 = handler;
                        final int i10 = c3722c2.f16744b;
                        final int i11 = c3722c2.f16745c;
                        final long elapsedRealtime = SystemClock.elapsedRealtime();
                        handler2.post(new Runnable() { // from class: com.umeng.powersdk.c.3
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (C3722c.this.f16747e) {
                                    if (SystemClock.elapsedRealtime() - elapsedRealtime > i11 * 1000) {
                                        handler2.sendEmptyMessage(C3722c.this.f16743a);
                                        return;
                                    }
                                    try {
                                        EfsJSONLog efsJSONLog = new EfsJSONLog("powerperf");
                                        efsJSONLog.put("power", C3722c.this.m15884a());
                                        EfsReporter reporter = PowerManager.getReporter();
                                        if (reporter != null) {
                                            reporter.send(efsJSONLog);
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                                handler2.postDelayed(this, i10 * 1000);
                            }
                        });
                    } catch (Throwable unused) {
                        handler.sendEmptyMessage(C3722c.this.f16743a);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static boolean isInit() {
        return f16732b;
    }

    public static void onActivityResumed(Activity activity) {
        C3722c c3722c;
        c3722c = C3722c.a.f16759a;
        try {
            if (getPowerConfigManager() != null && getPowerConfigManager().enableTracer()) {
                c3722c.f16746d = new WeakReference<>(activity);
            }
        } catch (Throwable unused) {
        }
    }

    public static void onActivityStarted(Activity activity) {
        C3722c c3722c;
        c3722c = C3722c.a.f16759a;
        try {
            if (getPowerConfigManager() == null || !getPowerConfigManager().enableTracer() || activity == null) {
                return;
            }
            if (c3722c.f16749g) {
                c3722c.f16749g = false;
                return;
            }
            int i10 = c3722c.f16748f + 1;
            c3722c.f16748f = i10;
            if (i10 == 1) {
                c3722c.f16747e = true;
            }
        } catch (Throwable unused) {
        }
    }

    public static void onActivityStopped(Activity activity) {
        C3722c c3722c;
        c3722c = C3722c.a.f16759a;
        try {
            if (getPowerConfigManager() == null || !getPowerConfigManager().enableTracer() || activity == null) {
                return;
            }
            if (activity.isChangingConfigurations()) {
                c3722c.f16749g = true;
                return;
            }
            int i10 = c3722c.f16748f - 1;
            c3722c.f16748f = i10;
            if (i10 == 0) {
                c3722c.f16747e = false;
            }
        } catch (Throwable unused) {
        }
    }
}
