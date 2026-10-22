package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.ServiceConnectionC2689i1;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p127f5.AbstractC4245i;
import p127f5.C4247j;
import p127f5.InterfaceC4235d;
import p259o4.C5915b;
import p295q4.ThreadFactoryC6342a;

/* renamed from: com.google.firebase.messaging.i1 */
/* loaded from: classes.dex */
class ServiceConnectionC2689i1 implements ServiceConnection {

    /* renamed from: a */
    private final Context f10306a;

    /* renamed from: b */
    private final Intent f10307b;

    /* renamed from: c */
    private final ScheduledExecutorService f10308c;

    /* renamed from: d */
    private final Queue f10309d;

    /* renamed from: e */
    private BinderC2680f1 f10310e;

    /* renamed from: f */
    private boolean f10311f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.messaging.i1$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final Intent f10312a;

        /* renamed from: b */
        private final C4247j f10313b = new C4247j();

        a(Intent intent) {
            this.f10312a = intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m11253f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f10312a.getAction() + " Releasing WakeLock.");
            m11256d();
        }

        /* renamed from: c */
        void m11255c(ScheduledExecutorService scheduledExecutorService) {
            boolean z10;
            long j10;
            if ((this.f10312a.getFlags() & 268435456) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Runnable runnable = new Runnable() { // from class: com.google.firebase.messaging.g1
                @Override // java.lang.Runnable
                public final void run() {
                    ServiceConnectionC2689i1.a.this.m11253f();
                }
            };
            if (z10) {
                j10 = AbstractC2674d1.f10283a;
            } else {
                j10 = 9000;
            }
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
            m11257e().mo17701c(scheduledExecutorService, new InterfaceC4235d() { // from class: com.google.firebase.messaging.h1
                @Override // p127f5.InterfaceC4235d
                /* renamed from: a */
                public final void mo488a(AbstractC4245i abstractC4245i) {
                    schedule.cancel(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public void m11256d() {
            this.f10313b.m17728e(null);
        }

        /* renamed from: e */
        AbstractC4245i m11257e() {
            return this.f10313b.m17724a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ServiceConnectionC2689i1(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new ThreadFactoryC6342a("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    /* renamed from: a */
    private void m11247a() {
        while (!this.f10309d.isEmpty()) {
            ((a) this.f10309d.poll()).m11256d();
        }
    }

    /* renamed from: b */
    private synchronized void m11248b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f10309d.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            BinderC2680f1 binderC2680f1 = this.f10310e;
            if (binderC2680f1 != null && binderC2680f1.isBinderAlive()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f10310e.m11217c((a) this.f10309d.poll());
            } else {
                m11249d();
                return;
            }
        }
    }

    /* renamed from: d */
    private void m11249d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("binder is dead. start connection? ");
            sb2.append(!this.f10311f);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f10311f) {
            return;
        }
        this.f10311f = true;
        try {
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e10);
        }
        if (C5915b.m23917b().m23922a(this.f10306a, this.f10307b, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f10311f = false;
        m11247a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized AbstractC4245i m11250c(Intent intent) {
        a aVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        aVar = new a(intent);
        aVar.m11255c(this.f10308c);
        this.f10309d.add(aVar);
        m11248b();
        return aVar.m11257e();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f10311f = false;
        if (!(iBinder instanceof BinderC2680f1)) {
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            m11247a();
            return;
        }
        this.f10310e = (BinderC2680f1) iBinder;
        m11248b();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        m11248b();
    }

    ServiceConnectionC2689i1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f10309d = new ArrayDeque();
        this.f10311f = false;
        Context applicationContext = context.getApplicationContext();
        this.f10306a = applicationContext;
        this.f10307b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f10308c = scheduledExecutorService;
    }
}
