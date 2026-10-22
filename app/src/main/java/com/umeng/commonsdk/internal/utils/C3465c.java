package com.umeng.commonsdk.internal.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.lzy.okgo.model.Progress;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.C3452a;
import com.umeng.commonsdk.internal.C3453b;
import com.umeng.commonsdk.internal.crash.UMCrashManager;

/* renamed from: com.umeng.commonsdk.internal.utils.c */
/* loaded from: classes3.dex */
public class C3465c {

    /* renamed from: a */
    private static final String f15319a = "BatteryUtils";

    /* renamed from: b */
    private static boolean f15320b;

    /* renamed from: c */
    private static Context f15321c;

    /* renamed from: d */
    private BroadcastReceiver f15322d;

    /* renamed from: com.umeng.commonsdk.internal.utils.c$a */
    /* loaded from: classes3.dex */
    private static class a {

        /* renamed from: a */
        private static final C3465c f15324a = new C3465c();

        private a() {
        }
    }

    /* renamed from: a */
    public static C3465c m14666a(Context context) {
        if (f15321c == null && context != null) {
            f15321c = context.getApplicationContext();
        }
        return a.f15324a;
    }

    /* renamed from: b */
    public synchronized void m14669b() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            f15321c.registerReceiver(this.f15322d, intentFilter);
            f15320b = true;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f15321c, th);
        }
    }

    /* renamed from: c */
    public synchronized void m14670c() {
        try {
            f15321c.unregisterReceiver(this.f15322d);
            f15320b = false;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f15321c, th);
        }
    }

    private C3465c() {
        this.f15322d = new BroadcastReceiver() { // from class: com.umeng.commonsdk.internal.utils.c.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                try {
                    if (intent.getAction().equals("android.intent.action.BATTERY_CHANGED")) {
                        UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "ACTION_BATTERY_CHANGED：battery info cc.");
                        int i10 = 0;
                        int intExtra = intent.getIntExtra("level", 0);
                        int intExtra2 = intent.getIntExtra("voltage", 0);
                        int intExtra3 = intent.getIntExtra("temperature", 0);
                        int intExtra4 = intent.getIntExtra(Progress.STATUS, 0);
                        int i11 = -1;
                        if (intExtra4 != 1) {
                            if (intExtra4 != 2) {
                                if (intExtra4 != 4) {
                                    if (intExtra4 == 5) {
                                        i11 = 2;
                                    }
                                } else {
                                    i11 = 0;
                                }
                            } else {
                                i11 = 1;
                            }
                        }
                        int intExtra5 = intent.getIntExtra("plugged", 0);
                        if (intExtra5 != 1) {
                            if (intExtra5 == 2) {
                                i10 = 2;
                            }
                        } else {
                            i10 = 1;
                        }
                        C3464b c3464b = new C3464b();
                        c3464b.f15313a = intExtra;
                        c3464b.f15314b = intExtra2;
                        c3464b.f15316d = i11;
                        c3464b.f15315c = intExtra3;
                        c3464b.f15317e = i10;
                        c3464b.f15318f = System.currentTimeMillis();
                        UMWorkDispatch.sendEvent(context, C3452a.f15268h, C3453b.m14605a(C3465c.f15321c).m14606a(), c3464b);
                        C3465c.this.m14670c();
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(C3465c.f15321c, th);
                }
            }
        };
    }

    /* renamed from: a */
    public synchronized boolean m14668a() {
        return f15320b;
    }
}
