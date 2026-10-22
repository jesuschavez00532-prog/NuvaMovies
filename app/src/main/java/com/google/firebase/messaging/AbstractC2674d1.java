package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import p112e5.C4131a;
import p127f5.AbstractC4245i;
import p127f5.InterfaceC4235d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.d1 */
/* loaded from: classes.dex */
public abstract class AbstractC2674d1 {

    /* renamed from: a */
    static final long f10283a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    private static final Object f10284b = new Object();

    /* renamed from: c */
    private static C4131a f10285c;

    /* renamed from: b */
    private static void m11166b(Context context) {
        if (f10285c == null) {
            C4131a c4131a = new C4131a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f10285c = c4131a;
            c4131a.m17322d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m11167c(Intent intent) {
        synchronized (f10284b) {
            if (f10285c != null && m11168d(intent)) {
                m11171g(intent, false);
                f10285c.m17321c();
            }
        }
    }

    /* renamed from: d */
    static boolean m11168d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m11170f(Context context, ServiceConnectionC2689i1 serviceConnectionC2689i1, final Intent intent) {
        synchronized (f10284b) {
            m11166b(context);
            boolean m11168d = m11168d(intent);
            m11171g(intent, true);
            if (!m11168d) {
                f10285c.m17319a(f10283a);
            }
            serviceConnectionC2689i1.m11250c(intent).mo17701c(new ExecutorC2681g(), new InterfaceC4235d() { // from class: com.google.firebase.messaging.c1
                @Override // p127f5.InterfaceC4235d
                /* renamed from: a */
                public final void mo488a(AbstractC4245i abstractC4245i) {
                    AbstractC2674d1.m11167c(intent);
                }
            });
        }
    }

    /* renamed from: g */
    private static void m11171g(Intent intent, boolean z10) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static ComponentName m11172h(Context context, Intent intent) {
        synchronized (f10284b) {
            m11166b(context);
            boolean m11168d = m11168d(intent);
            m11171g(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!m11168d) {
                f10285c.m17319a(f10283a);
            }
            return startService;
        }
    }
}
