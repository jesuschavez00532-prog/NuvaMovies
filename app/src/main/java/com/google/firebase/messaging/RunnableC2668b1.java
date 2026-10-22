package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.b1 */
/* loaded from: classes.dex */
public class RunnableC2668b1 implements Runnable {

    /* renamed from: f */
    private static final Object f10265f = new Object();

    /* renamed from: g */
    private static Boolean f10266g;

    /* renamed from: h */
    private static Boolean f10267h;

    /* renamed from: a */
    private final Context f10268a;

    /* renamed from: b */
    private final C2679f0 f10269b;

    /* renamed from: c */
    private final PowerManager.WakeLock f10270c;

    /* renamed from: d */
    private final C2665a1 f10271d;

    /* renamed from: e */
    private final long f10272e;

    /* renamed from: com.google.firebase.messaging.b1$a */
    /* loaded from: classes.dex */
    class a extends BroadcastReceiver {

        /* renamed from: a */
        private RunnableC2668b1 f10273a;

        public a(RunnableC2668b1 runnableC2668b1) {
            this.f10273a = runnableC2668b1;
        }

        /* renamed from: a */
        public void m11138a() {
            if (RunnableC2668b1.m11129b()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            RunnableC2668b1.this.f10268a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            RunnableC2668b1 runnableC2668b1 = this.f10273a;
            if (runnableC2668b1 == null) {
                return;
            }
            if (!runnableC2668b1.m11136i()) {
                return;
            }
            if (RunnableC2668b1.m11129b()) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            this.f10273a.f10271d.m11118l(this.f10273a, 0L);
            context.unregisterReceiver(this);
            this.f10273a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2668b1(C2665a1 c2665a1, Context context, C2679f0 c2679f0, long j10) {
        this.f10271d = c2665a1;
        this.f10268a = context;
        this.f10272e = j10;
        this.f10269b = c2679f0;
        this.f10270c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* renamed from: b */
    static /* synthetic */ boolean m11129b() {
        return m11137j();
    }

    /* renamed from: e */
    private static String m11132e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    /* renamed from: f */
    private static boolean m11133f(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f10265f) {
            Boolean bool = f10267h;
            if (bool == null) {
                booleanValue = m11134g(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            f10267h = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    /* renamed from: g */
    private static boolean m11134g(Context context, String str, Boolean bool) {
        boolean z10;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", m11132e(str));
        }
        return z10;
    }

    /* renamed from: h */
    private static boolean m11135h(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f10265f) {
            Boolean bool = f10266g;
            if (bool == null) {
                booleanValue = m11134g(context, "android.permission.WAKE_LOCK", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            f10266g = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public synchronized boolean m11136i() {
        NetworkInfo networkInfo;
        boolean z10;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f10268a.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null) {
            if (networkInfo.isConnected()) {
                z10 = true;
            }
        }
        z10 = false;
        return z10;
    }

    /* renamed from: j */
    private static boolean m11137j() {
        if (!Log.isLoggable("FirebaseMessaging", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3))) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (m11135h(this.f10268a)) {
            this.f10270c.acquire(AbstractC2675e.f10286a);
        }
        try {
            try {
                try {
                    this.f10271d.m11119m(true);
                } catch (Throwable th) {
                    if (m11135h(this.f10268a)) {
                        try {
                            this.f10270c.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th;
                }
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
                this.f10271d.m11119m(false);
                if (m11135h(this.f10268a)) {
                    wakeLock = this.f10270c;
                } else {
                    return;
                }
            }
            if (!this.f10269b.m11214g()) {
                this.f10271d.m11119m(false);
                if (m11135h(this.f10268a)) {
                    try {
                        this.f10270c.release();
                        return;
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (m11133f(this.f10268a) && !m11136i()) {
                new a(this).m11138a();
                if (m11135h(this.f10268a)) {
                    try {
                        this.f10270c.release();
                        return;
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (this.f10271d.m11121p()) {
                this.f10271d.m11119m(false);
            } else {
                this.f10271d.m11122q(this.f10272e);
            }
            if (m11135h(this.f10268a)) {
                wakeLock = this.f10270c;
                wakeLock.release();
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
