package com.umeng.message.proguard;

import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.umeng.message.proguard.dx */
/* loaded from: classes3.dex */
public final class C3662dx {

    /* renamed from: a */
    private static final AtomicBoolean f16446a;

    /* renamed from: b */
    private static volatile boolean f16447b;

    /* renamed from: c */
    private static long f16448c;

    /* renamed from: d */
    private static final C3633cw f16449d;

    static {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        f16446a = atomicBoolean;
        f16449d = new C3633cw(atomicBoolean);
    }

    /* renamed from: a */
    public static boolean m15702a() {
        AtomicBoolean atomicBoolean = f16446a;
        if (!atomicBoolean.get() && SystemClock.elapsedRealtime() - f16448c >= 12000) {
            f16448c = SystemClock.elapsedRealtime();
            m15704c();
        }
        return atomicBoolean.get();
    }

    /* renamed from: b */
    public static synchronized void m15703b() {
        synchronized (C3662dx.class) {
            if (f16447b) {
                return;
            }
            try {
                m15704c();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                C3643de.m15638a().registerReceiver(f16449d, intentFilter);
                f16447b = true;
            } catch (Throwable th) {
                C3615ce.m15509a("Screen", "screen state error:" + th.getMessage());
            }
        }
    }

    /* renamed from: c */
    private static void m15704c() {
        boolean isInteractive;
        try {
            PowerManager powerManager = (PowerManager) C3643de.m15638a().getSystemService("power");
            if (powerManager != null) {
                if (Build.VERSION.SDK_INT >= 20) {
                    AtomicBoolean atomicBoolean = f16446a;
                    isInteractive = powerManager.isInteractive();
                    atomicBoolean.set(isInteractive);
                    return;
                }
                f16446a.set(powerManager.isScreenOn());
            }
        } catch (Throwable th) {
            C3615ce.m15509a("Screen", "screen on state error:", th.getMessage());
        }
    }
}
