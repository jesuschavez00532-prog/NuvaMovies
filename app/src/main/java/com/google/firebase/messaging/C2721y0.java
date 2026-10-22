package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.y0 */
/* loaded from: classes.dex */
public final class C2721y0 {

    /* renamed from: d */
    private static WeakReference f10405d;

    /* renamed from: a */
    private final SharedPreferences f10406a;

    /* renamed from: b */
    private C2713u0 f10407b;

    /* renamed from: c */
    private final Executor f10408c;

    private C2721y0(SharedPreferences sharedPreferences, Executor executor) {
        this.f10408c = executor;
        this.f10406a = sharedPreferences;
    }

    /* renamed from: a */
    public static synchronized C2721y0 m11347a(Context context, Executor executor) {
        C2721y0 c2721y0;
        synchronized (C2721y0.class) {
            WeakReference weakReference = f10405d;
            if (weakReference != null) {
                c2721y0 = (C2721y0) weakReference.get();
            } else {
                c2721y0 = null;
            }
            if (c2721y0 == null) {
                c2721y0 = new C2721y0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                c2721y0.m11348c();
                f10405d = new WeakReference(c2721y0);
            }
        }
        return c2721y0;
    }

    /* renamed from: c */
    private synchronized void m11348c() {
        this.f10407b = C2713u0.m11319c(this.f10406a, "topic_operation_queue", ",", this.f10408c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized C2719x0 m11349b() {
        return C2719x0.m11342a(this.f10407b.m11323e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized boolean m11350d(C2719x0 c2719x0) {
        return this.f10407b.m11324f(c2719x0.m11346e());
    }
}
