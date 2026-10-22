package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p127f5.AbstractC4245i;
import p127f5.AbstractC4250l;
import p127f5.C4247j;
import p214l.C5303a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.a1 */
/* loaded from: classes.dex */
public class C2665a1 {

    /* renamed from: i */
    private static final long f10252i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a */
    private final Context f10253a;

    /* renamed from: b */
    private final C2679f0 f10254b;

    /* renamed from: c */
    private final C2664a0 f10255c;

    /* renamed from: d */
    private final FirebaseMessaging f10256d;

    /* renamed from: f */
    private final ScheduledExecutorService f10258f;

    /* renamed from: h */
    private final C2721y0 f10260h;

    /* renamed from: e */
    private final Map f10257e = new C5303a();

    /* renamed from: g */
    private boolean f10259g = false;

    private C2665a1(FirebaseMessaging firebaseMessaging, C2679f0 c2679f0, C2721y0 c2721y0, C2664a0 c2664a0, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f10256d = firebaseMessaging;
        this.f10254b = c2679f0;
        this.f10260h = c2721y0;
        this.f10255c = c2664a0;
        this.f10253a = context;
        this.f10258f = scheduledExecutorService;
    }

    /* renamed from: b */
    private static void m11107b(AbstractC4245i abstractC4245i) {
        try {
            AbstractC4250l.m17730b(abstractC4245i, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e11);
            }
            throw ((IOException) cause);
        } catch (TimeoutException e12) {
            e = e12;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    /* renamed from: c */
    private void m11108c(String str) {
        m11107b(this.f10255c.m11104k(this.f10256d.m11066i(), str));
    }

    /* renamed from: d */
    private void m11109d(String str) {
        m11107b(this.f10255c.m11105l(this.f10256d.m11066i(), str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static AbstractC4245i m11110e(final FirebaseMessaging firebaseMessaging, final C2679f0 c2679f0, final C2664a0 c2664a0, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return AbstractC4250l.m17731c(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.z0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C2665a1 m11112i;
                m11112i = C2665a1.m11112i(context, scheduledExecutorService, firebaseMessaging, c2679f0, c2664a0);
                return m11112i;
            }
        });
    }

    /* renamed from: g */
    static boolean m11111g() {
        if (!Log.isLoggable("FirebaseMessaging", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3))) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ C2665a1 m11112i(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, C2679f0 c2679f0, C2664a0 c2664a0) {
        return new C2665a1(firebaseMessaging, c2679f0, C2721y0.m11347a(context, scheduledExecutorService), c2664a0, context, scheduledExecutorService);
    }

    /* renamed from: j */
    private void m11113j(C2719x0 c2719x0) {
        synchronized (this.f10257e) {
            String m11346e = c2719x0.m11346e();
            if (!this.f10257e.containsKey(m11346e)) {
                return;
            }
            ArrayDeque arrayDeque = (ArrayDeque) this.f10257e.get(m11346e);
            C4247j c4247j = (C4247j) arrayDeque.poll();
            if (c4247j != null) {
                c4247j.m17726c(null);
            }
            if (arrayDeque.isEmpty()) {
                this.f10257e.remove(m11346e);
            }
        }
    }

    /* renamed from: n */
    private void m11114n() {
        if (!m11116h()) {
            m11122q(0L);
        }
    }

    /* renamed from: f */
    boolean m11115f() {
        if (this.f10260h.m11349b() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    synchronized boolean m11116h() {
        return this.f10259g;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079 A[Catch: IOException -> 0x00a2, TryCatch #0 {IOException -> 0x00a2, blocks: (B:3:0x0003, B:12:0x0030, B:14:0x0036, B:17:0x0050, B:19:0x005d, B:20:0x0079, B:22:0x0086, B:23:0x0015, B:26:0x001f), top: B:2:0x0003 }] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean m11117k(com.google.firebase.messaging.C2719x0 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 0
            java.lang.String r2 = r7.m11344b()     // Catch: java.io.IOException -> La2
            int r3 = r2.hashCode()     // Catch: java.io.IOException -> La2
            r4 = 83
            r5 = 1
            if (r3 == r4) goto L1f
            r4 = 85
            if (r3 == r4) goto L15
            goto L29
        L15:
            java.lang.String r3 = "U"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> La2
            if (r2 == 0) goto L29
            r2 = 1
            goto L2a
        L1f:
            java.lang.String r3 = "S"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> La2
            if (r2 == 0) goto L29
            r2 = 0
            goto L2a
        L29:
            r2 = -1
        L2a:
            java.lang.String r3 = " succeeded."
            if (r2 == 0) goto L79
            if (r2 == r5) goto L50
            boolean r2 = m11111g()     // Catch: java.io.IOException -> La2
            if (r2 == 0) goto La1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> La2
            r2.<init>()     // Catch: java.io.IOException -> La2
            java.lang.String r3 = "Unknown topic operation"
            r2.append(r3)     // Catch: java.io.IOException -> La2
            r2.append(r7)     // Catch: java.io.IOException -> La2
            java.lang.String r7 = "."
            r2.append(r7)     // Catch: java.io.IOException -> La2
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> La2
            android.util.Log.d(r0, r7)     // Catch: java.io.IOException -> La2
            goto La1
        L50:
            java.lang.String r2 = r7.m11345c()     // Catch: java.io.IOException -> La2
            r6.m11109d(r2)     // Catch: java.io.IOException -> La2
            boolean r2 = m11111g()     // Catch: java.io.IOException -> La2
            if (r2 == 0) goto La1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> La2
            r2.<init>()     // Catch: java.io.IOException -> La2
            java.lang.String r4 = "Unsubscribe from topic: "
            r2.append(r4)     // Catch: java.io.IOException -> La2
            java.lang.String r7 = r7.m11345c()     // Catch: java.io.IOException -> La2
            r2.append(r7)     // Catch: java.io.IOException -> La2
            r2.append(r3)     // Catch: java.io.IOException -> La2
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> La2
            android.util.Log.d(r0, r7)     // Catch: java.io.IOException -> La2
            goto La1
        L79:
            java.lang.String r2 = r7.m11345c()     // Catch: java.io.IOException -> La2
            r6.m11108c(r2)     // Catch: java.io.IOException -> La2
            boolean r2 = m11111g()     // Catch: java.io.IOException -> La2
            if (r2 == 0) goto La1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> La2
            r2.<init>()     // Catch: java.io.IOException -> La2
            java.lang.String r4 = "Subscribe to topic: "
            r2.append(r4)     // Catch: java.io.IOException -> La2
            java.lang.String r7 = r7.m11345c()     // Catch: java.io.IOException -> La2
            r2.append(r7)     // Catch: java.io.IOException -> La2
            r2.append(r3)     // Catch: java.io.IOException -> La2
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> La2
            android.util.Log.d(r0, r7)     // Catch: java.io.IOException -> La2
        La1:
            return r5
        La2:
            r7 = move-exception
            java.lang.String r2 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lc9
            java.lang.String r2 = "INTERNAL_SERVER_ERROR"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lbc
            goto Lc9
        Lbc:
            java.lang.String r2 = r7.getMessage()
            if (r2 != 0) goto Lc8
            java.lang.String r7 = "Topic operation failed without exception message. Will retry Topic operation."
            android.util.Log.e(r0, r7)
            return r1
        Lc8:
            throw r7
        Lc9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Topic operation failed: "
            r2.append(r3)
            java.lang.String r7 = r7.getMessage()
            r2.append(r7)
            java.lang.String r7 = ". Will retry Topic operation."
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            android.util.Log.e(r0, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C2665a1.m11117k(com.google.firebase.messaging.x0):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m11118l(Runnable runnable, long j10) {
        this.f10258f.schedule(runnable, j10, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public synchronized void m11119m(boolean z10) {
        this.f10259g = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m11120o() {
        if (m11115f()) {
            m11114n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x000d, code lost:
    
        if (m11111g() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x000f, code lost:
    
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0017, code lost:
    
        return true;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m11121p() {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            com.google.firebase.messaging.y0 r0 = r2.f10260h     // Catch: java.lang.Throwable -> L2b
            com.google.firebase.messaging.x0 r0 = r0.m11349b()     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L19
            boolean r0 = m11111g()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L16
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L2b
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            r0 = 1
            return r0
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r2.m11117k(r0)
            if (r1 != 0) goto L22
            r0 = 0
            return r0
        L22:
            com.google.firebase.messaging.y0 r1 = r2.f10260h
            r1.m11350d(r0)
            r2.m11113j(r0)
            goto L0
        L2b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            goto L2f
        L2e:
            throw r0
        L2f:
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C2665a1.m11121p():boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m11122q(long j10) {
        m11118l(new RunnableC2668b1(this, this.f10253a, this.f10254b, Math.min(Math.max(30L, 2 * j10), f10252i)), j10);
        m11119m(true);
    }
}
