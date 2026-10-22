package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.AbstractC0272b;

/* renamed from: com.google.android.material.snackbar.e */
/* loaded from: classes.dex */
class C2595e {

    /* renamed from: c */
    private static C2595e f9831c;

    /* renamed from: a */
    private final Object f9832a = new Object();

    /* renamed from: b */
    private final Handler f9833b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: com.google.android.material.snackbar.e$a */
    /* loaded from: classes.dex */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C2595e c2595e = C2595e.this;
            AbstractC0272b.m941a(message.obj);
            c2595e.m10672c(null);
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.e$b */
    /* loaded from: classes.dex */
    interface b {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.snackbar.e$c */
    /* loaded from: classes.dex */
    public static class c {
    }

    private C2595e() {
    }

    /* renamed from: a */
    private boolean m10669a(c cVar, int i10) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C2595e m10670b() {
        if (f9831c == null) {
            f9831c = new C2595e();
        }
        return f9831c;
    }

    /* renamed from: d */
    private boolean m10671d(b bVar) {
        return false;
    }

    /* renamed from: c */
    void m10672c(c cVar) {
        synchronized (this.f9832a) {
            m10669a(cVar, 2);
        }
    }

    /* renamed from: e */
    public void m10673e(b bVar) {
        synchronized (this.f9832a) {
            if (m10671d(bVar)) {
                throw null;
            }
        }
    }

    /* renamed from: f */
    public void m10674f(b bVar) {
        synchronized (this.f9832a) {
            if (m10671d(bVar)) {
                throw null;
            }
        }
    }
}
