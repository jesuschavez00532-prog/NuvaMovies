package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.v */
/* loaded from: classes.dex */
public class RunnableC2652v implements Runnable {

    /* renamed from: a */
    private final long f10136a;

    /* renamed from: b */
    private final PowerManager.WakeLock f10137b;

    /* renamed from: c */
    private final FirebaseInstanceId f10138c;

    /* renamed from: d */
    ExecutorService f10139d = AbstractC2632b.m10949b();

    /* renamed from: com.google.firebase.iid.v$a */
    /* loaded from: classes.dex */
    static class a extends BroadcastReceiver {

        /* renamed from: a */
        private RunnableC2652v f10140a;

        public a(RunnableC2652v runnableC2652v) {
            this.f10140a = runnableC2652v;
        }

        /* renamed from: a */
        public void m10992a() {
            if (FirebaseInstanceId.m10917r()) {
                Log.d("FirebaseInstanceId", "Connectivity change received registered");
            }
            this.f10140a.m10989b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            RunnableC2652v runnableC2652v = this.f10140a;
            if (runnableC2652v == null || !runnableC2652v.m10990c()) {
                return;
            }
            if (FirebaseInstanceId.m10917r()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            this.f10140a.f10138c.m10928f(this.f10140a, 0L);
            this.f10140a.m10989b().unregisterReceiver(this);
            this.f10140a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2652v(FirebaseInstanceId firebaseInstanceId, long j10) {
        this.f10138c = firebaseInstanceId;
        this.f10136a = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) m10989b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f10137b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: b */
    Context m10989b() {
        return this.f10138c.m10929g().m26867j();
    }

    /* renamed from: c */
    boolean m10990c() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) m10989b().getSystemService("connectivity");
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

    /* renamed from: d */
    boolean m10991d() {
        if (!this.f10138c.m10925F(this.f10138c.m10934p())) {
            return true;
        }
        try {
            if (this.f10138c.m10927d() == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            return true;
        } catch (IOException e10) {
            if (C2641k.m10954f(e10.getMessage())) {
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 52);
                sb2.append("Token retrieval failed: ");
                sb2.append(message);
                sb2.append(". Will retry token retrieval");
                Log.w("FirebaseInstanceId", sb2.toString());
                return false;
            }
            if (e10.getMessage() == null) {
                Log.w("FirebaseInstanceId", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            throw e10;
        } catch (SecurityException unused) {
            Log.w("FirebaseInstanceId", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C2650t.m10971a().m10973c(m10989b())) {
            this.f10137b.acquire();
        }
        try {
            try {
                this.f10138c.m10922C(true);
                if (!this.f10138c.m10936s()) {
                    this.f10138c.m10922C(false);
                    if (!C2650t.m10971a().m10973c(m10989b())) {
                        return;
                    }
                } else if (C2650t.m10971a().m10972b(m10989b()) && !m10990c()) {
                    new a(this).m10992a();
                    if (!C2650t.m10971a().m10973c(m10989b())) {
                        return;
                    }
                } else {
                    if (m10991d()) {
                        this.f10138c.m10922C(false);
                    } else {
                        this.f10138c.m10924E(this.f10136a);
                    }
                    if (!C2650t.m10971a().m10973c(m10989b())) {
                        return;
                    }
                }
            } catch (IOException e10) {
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 93);
                sb2.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb2.append(message);
                sb2.append(". Won't retry the operation.");
                Log.e("FirebaseInstanceId", sb2.toString());
                this.f10138c.m10922C(false);
                if (!C2650t.m10971a().m10973c(m10989b())) {
                    return;
                }
            }
            this.f10137b.release();
        } catch (Throwable th) {
            if (C2650t.m10971a().m10973c(m10989b())) {
                this.f10137b.release();
            }
            throw th;
        }
    }
}
