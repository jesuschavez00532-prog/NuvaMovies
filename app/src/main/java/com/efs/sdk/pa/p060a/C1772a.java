package com.efs.sdk.pa.p060a;

import android.app.Application;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import com.efs.sdk.pa.PAANRListener;
import java.util.Map;
import java.util.Set;

/* renamed from: com.efs.sdk.pa.a.a */
/* loaded from: classes.dex */
public final class C1772a {

    /* renamed from: a */
    volatile boolean f7424a;

    /* renamed from: b */
    final Handler f7425b;

    /* renamed from: c */
    final Thread f7426c;

    /* renamed from: d */
    long f7427d;

    /* renamed from: e */
    long f7428e;

    /* renamed from: f */
    boolean f7429f;

    /* renamed from: g */
    Handler f7430g;

    /* renamed from: h */
    PAANRListener f7431h;

    /* renamed from: i */
    long f7432i;

    /* renamed from: j */
    long f7433j;

    /* renamed from: k */
    final long f7434k;

    /* renamed from: l */
    boolean f7435l;

    /* renamed from: m */
    final Runnable f7436m;

    /* renamed from: n */
    final Runnable f7437n;

    /* renamed from: o */
    private HandlerThread f7438o;

    /* renamed from: p */
    private Application f7439p;

    public C1772a(Application application, long j10) {
        this(application, j10, true);
    }

    /* renamed from: a */
    static boolean m7867a(StringBuilder sb2) {
        Set<Map.Entry<Thread, StackTraceElement[]>> entrySet = Thread.getAllStackTraces().entrySet();
        if (entrySet.size() == 0) {
            return false;
        }
        boolean z10 = false;
        for (Map.Entry<Thread, StackTraceElement[]> entry : entrySet) {
            Thread key = entry.getKey();
            StackTraceElement[] value = entry.getValue();
            if (key.getId() == Looper.getMainLooper().getThread().getId()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(key.getName());
                sb3.append(" ");
                sb3.append(key.getPriority());
                sb3.append(" ");
                sb3.append(key.getState());
                sb3.append("\n");
                for (StackTraceElement stackTraceElement : value) {
                    String stackTraceElement2 = stackTraceElement.toString();
                    sb3.append("  at  ");
                    sb3.append(stackTraceElement2);
                    sb3.append('\n');
                }
                sb3.append("\n");
                sb2.insert(0, (CharSequence) sb3);
                z10 = true;
            } else {
                sb2.append(key.getName());
                sb2.append(" ");
                sb2.append(key.getPriority());
                sb2.append(" ");
                sb2.append(key.getState());
                sb2.append("\n");
                for (StackTraceElement stackTraceElement3 : value) {
                    String stackTraceElement4 = stackTraceElement3.toString();
                    sb2.append("  at  ");
                    sb2.append(stackTraceElement4);
                    sb2.append('\n');
                }
                sb2.append("\n");
            }
        }
        if (!z10) {
            sb2.insert(0, m7866a(Looper.getMainLooper().getThread()));
        }
        return true;
    }

    public C1772a(Application application, long j10, boolean z10) {
        this.f7424a = true;
        this.f7428e = 4L;
        this.f7429f = true;
        this.f7432i = 0L;
        this.f7436m = new Runnable() { // from class: com.efs.sdk.pa.a.a.1
            /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
            
                if (com.efs.sdk.pa.p060a.C1772a.m7867a(r1) != false) goto L24;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r6 = this;
                    com.efs.sdk.pa.a.a r0 = com.efs.sdk.pa.p060a.C1772a.this
                    boolean r0 = r0.f7429f
                    if (r0 == 0) goto L7
                    return
                L7:
                    long r0 = android.os.SystemClock.uptimeMillis()
                    com.efs.sdk.pa.a.a r2 = com.efs.sdk.pa.p060a.C1772a.this
                    long r3 = r2.f7433j
                    long r0 = r0 - r3
                    long r3 = r2.f7434k
                    int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                    if (r5 <= 0) goto L21
                    com.efs.sdk.pa.PAANRListener r2 = r2.f7431h
                    if (r2 == 0) goto L21
                    java.lang.Long r0 = java.lang.Long.valueOf(r0)
                    r2.unexcept(r0)
                L21:
                    com.efs.sdk.pa.a.a r0 = com.efs.sdk.pa.p060a.C1772a.this
                    boolean r0 = r0.f7424a
                    if (r0 == 0) goto L3a
                    com.efs.sdk.pa.a.a r0 = com.efs.sdk.pa.p060a.C1772a.this
                    r1 = 0
                    r0.f7432i = r1
                    r1 = 0
                    r0.f7424a = r1
                    com.efs.sdk.pa.a.a r0 = com.efs.sdk.pa.p060a.C1772a.this
                    android.os.Handler r1 = r0.f7425b
                    java.lang.Runnable r0 = r0.f7437n
                    r1.postAtFrontOfQueue(r0)
                    goto L81
                L3a:
                    com.efs.sdk.pa.a.a r0 = com.efs.sdk.pa.p060a.C1772a.this
                    long r1 = r0.f7432i
                    r3 = 1
                    long r1 = r1 + r3
                    r0.f7432i = r1
                    boolean r0 = r0.f7424a
                    if (r0 != 0) goto L81
                    com.efs.sdk.pa.a.a r0 = com.efs.sdk.pa.p060a.C1772a.this
                    long r1 = r0.f7432i
                    long r3 = r0.f7428e
                    int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r5 < 0) goto L81
                    int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r5 != 0) goto L81
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    boolean r2 = r0.f7435l
                    if (r2 == 0) goto L68
                    java.lang.Thread r2 = r0.f7426c
                    java.lang.String r2 = com.efs.sdk.pa.p060a.C1772a.m7866a(r2)
                    r1.append(r2)
                    goto L6e
                L68:
                    boolean r2 = com.efs.sdk.pa.p060a.C1772a.m7867a(r1)
                    if (r2 == 0) goto L81
                L6e:
                    com.efs.sdk.pa.PAANRListener r2 = r0.f7431h
                    if (r2 == 0) goto L81
                    int r2 = r1.length()
                    if (r2 <= 0) goto L81
                    com.efs.sdk.pa.PAANRListener r0 = r0.f7431h
                    java.lang.String r1 = r1.toString()
                    r0.anrStack(r1)
                L81:
                    com.efs.sdk.pa.a.a r0 = com.efs.sdk.pa.p060a.C1772a.this
                    long r1 = android.os.SystemClock.uptimeMillis()
                    r0.f7433j = r1
                    com.efs.sdk.pa.a.a r0 = com.efs.sdk.pa.p060a.C1772a.this
                    android.os.Handler r1 = r0.f7430g
                    java.lang.Runnable r2 = r0.f7436m
                    long r3 = r0.f7427d
                    r1.postDelayed(r2, r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.pa.p060a.C1772a.AnonymousClass1.run():void");
            }
        };
        this.f7437n = new Runnable() { // from class: com.efs.sdk.pa.a.a.2
            @Override // java.lang.Runnable
            public final void run() {
                C1772a.this.f7424a = true;
            }
        };
        this.f7434k = j10;
        this.f7439p = application;
        this.f7435l = z10;
        long j11 = (((float) j10) * 0.8f) / this.f7428e;
        this.f7427d = j11;
        if (j11 < 100) {
            this.f7427d = 100L;
            this.f7428e = j10 / 100;
        }
        Log.i("Matrix.AnrTracer", "anrTrace, final mAnrBeatTime:" + this.f7427d + ", mAnrBeatRate:" + this.f7427d);
        this.f7426c = Looper.getMainLooper().getThread();
        this.f7425b = new Handler(Looper.getMainLooper());
        HandlerThread handlerThread = new HandlerThread("ANR HANDLER THREAD");
        this.f7438o = handlerThread;
        handlerThread.start();
        this.f7430g = new Handler(this.f7438o.getLooper());
    }

    /* renamed from: a */
    static String m7866a(Thread thread) {
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = thread.getStackTrace();
        sb2.append(thread.getName());
        sb2.append(" ");
        sb2.append(thread.getPriority());
        sb2.append(" ");
        sb2.append(thread.getState());
        sb2.append("\n");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String stackTraceElement2 = stackTraceElement.toString();
            sb2.append("  at  ");
            sb2.append(stackTraceElement2);
            sb2.append('\n');
        }
        sb2.append("\n");
        return sb2.toString();
    }
}
