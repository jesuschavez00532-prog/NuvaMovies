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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p295q4.ThreadFactoryC6342a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.w0 */
/* loaded from: classes.dex */
public class RunnableC2717w0 implements Runnable {

    /* renamed from: a */
    private final long f10395a;

    /* renamed from: b */
    private final PowerManager.WakeLock f10396b;

    /* renamed from: c */
    private final FirebaseMessaging f10397c;

    /* renamed from: d */
    ExecutorService f10398d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC6342a("firebase-iid-executor"));

    /* renamed from: com.google.firebase.messaging.w0$a */
    /* loaded from: classes.dex */
    static class a extends BroadcastReceiver {

        /* renamed from: a */
        private RunnableC2717w0 f10399a;

        public a(RunnableC2717w0 runnableC2717w0) {
            this.f10399a = runnableC2717w0;
        }

        /* renamed from: a */
        public void m11340a() {
            if (RunnableC2717w0.m11336c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f10399a.m11337b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            RunnableC2717w0 runnableC2717w0 = this.f10399a;
            if (runnableC2717w0 == null || !runnableC2717w0.m11338d()) {
                return;
            }
            if (RunnableC2717w0.m11336c()) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            this.f10399a.f10397c.m11067j(this.f10399a, 0L);
            this.f10399a.m11337b().unregisterReceiver(this);
            this.f10399a = null;
        }
    }

    public RunnableC2717w0(FirebaseMessaging firebaseMessaging, long j10) {
        this.f10397c = firebaseMessaging;
        this.f10395a = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) m11337b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f10396b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: c */
    static boolean m11336c() {
        if (!Log.isLoggable("FirebaseMessaging", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    Context m11337b() {
        return this.f10397c.m11068k();
    }

    /* renamed from: d */
    boolean m11338d() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) m11337b().getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    boolean m11339e() {
        try {
            if (this.f10397c.m11066i() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            }
            return true;
        } catch (IOException e10) {
            if (C2664a0.m11099g(e10.getMessage())) {
                Log.w("FirebaseMessaging", "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval");
                return false;
            }
            if (e10.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            throw e10;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C2709s0.m11311b().m11315e(m11337b())) {
            this.f10396b.acquire();
        }
        try {
            try {
                this.f10397c.m11072y(true);
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
                this.f10397c.m11072y(false);
                if (!C2709s0.m11311b().m11315e(m11337b())) {
                    return;
                }
            }
            if (!this.f10397c.m11071r()) {
                this.f10397c.m11072y(false);
                if (C2709s0.m11311b().m11315e(m11337b())) {
                    this.f10396b.release();
                    return;
                }
                return;
            }
            if (C2709s0.m11311b().m11314d(m11337b()) && !m11338d()) {
                new a(this).m11340a();
                if (C2709s0.m11311b().m11315e(m11337b())) {
                    this.f10396b.release();
                    return;
                }
                return;
            }
            if (m11339e()) {
                this.f10397c.m11072y(false);
            } else {
                this.f10397c.m11064B(this.f10395a);
            }
            if (!C2709s0.m11311b().m11315e(m11337b())) {
                return;
            }
            this.f10396b.release();
        } catch (Throwable th) {
            if (C2709s0.m11311b().m11315e(m11337b())) {
                this.f10396b.release();
            }
            throw th;
        }
    }
}
