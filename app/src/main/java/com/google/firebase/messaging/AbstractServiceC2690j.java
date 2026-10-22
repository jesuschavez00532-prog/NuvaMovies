package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.BinderC2680f1;
import java.util.concurrent.ExecutorService;
import p127f5.AbstractC4245i;
import p127f5.AbstractC4250l;
import p127f5.C4247j;
import p127f5.InterfaceC4235d;

/* renamed from: com.google.firebase.messaging.j */
/* loaded from: classes.dex */
public abstract class AbstractServiceC2690j extends Service {

    /* renamed from: b */
    private Binder f10315b;

    /* renamed from: d */
    private int f10317d;

    /* renamed from: a */
    final ExecutorService f10314a = AbstractC2700o.m11295d();

    /* renamed from: c */
    private final Object f10316c = new Object();

    /* renamed from: e */
    private int f10318e = 0;

    /* renamed from: com.google.firebase.messaging.j$a */
    /* loaded from: classes.dex */
    class a implements BinderC2680f1.a {
        a() {
        }

        @Override // com.google.firebase.messaging.BinderC2680f1.a
        /* renamed from: a */
        public AbstractC4245i mo11218a(Intent intent) {
            return AbstractServiceC2690j.this.m11264j(intent);
        }
    }

    /* renamed from: d */
    private void m11261d(Intent intent) {
        if (intent != null) {
            AbstractC2674d1.m11167c(intent);
        }
        synchronized (this.f10316c) {
            int i10 = this.f10318e - 1;
            this.f10318e = i10;
            if (i10 == 0) {
                m11266k(this.f10317d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m11262h(Intent intent, AbstractC4245i abstractC4245i) {
        m11261d(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m11263i(Intent intent, C4247j c4247j) {
        try {
            mo11085f(intent);
        } finally {
            c4247j.m17726c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public AbstractC4245i m11264j(final Intent intent) {
        if (m11265g(intent)) {
            return AbstractC4250l.m17733e(null);
        }
        final C4247j c4247j = new C4247j();
        this.f10314a.execute(new Runnable() { // from class: com.google.firebase.messaging.i
            @Override // java.lang.Runnable
            public final void run() {
                AbstractServiceC2690j.this.m11263i(intent, c4247j);
            }
        });
        return c4247j.m17724a();
    }

    /* renamed from: e */
    protected abstract Intent mo11084e(Intent intent);

    /* renamed from: f */
    public abstract void mo11085f(Intent intent);

    /* renamed from: g */
    public boolean m11265g(Intent intent) {
        return false;
    }

    /* renamed from: k */
    boolean m11266k(int i10) {
        return stopSelfResult(i10);
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f10315b == null) {
            this.f10315b = new BinderC2680f1(new a());
        }
        return this.f10315b;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f10314a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i10, int i11) {
        synchronized (this.f10316c) {
            this.f10317d = i11;
            this.f10318e++;
        }
        Intent mo11084e = mo11084e(intent);
        if (mo11084e == null) {
            m11261d(intent);
            return 2;
        }
        AbstractC4245i m11264j = m11264j(mo11084e);
        if (m11264j.mo17711m()) {
            m11261d(intent);
            return 2;
        }
        m11264j.mo17701c(new ExecutorC2681g(), new InterfaceC4235d() { // from class: com.google.firebase.messaging.h
            @Override // p127f5.InterfaceC4235d
            /* renamed from: a */
            public final void mo488a(AbstractC4245i abstractC4245i) {
                AbstractServiceC2690j.this.m11262h(intent, abstractC4245i);
            }
        });
        return 3;
    }
}
