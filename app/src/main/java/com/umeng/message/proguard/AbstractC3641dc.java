package com.umeng.message.proguard;

import android.app.Activity;
import android.os.SystemClock;
import com.umeng.message.proguard.InterfaceC3606bx;
import java.lang.ref.WeakReference;

/* renamed from: com.umeng.message.proguard.dc */
/* loaded from: classes3.dex */
public abstract class AbstractC3641dc {

    /* renamed from: a */
    public final C3636cz f16289a;

    /* renamed from: b */
    protected final InterfaceC3606bx.c f16290b;

    /* renamed from: c */
    public InterfaceC3606bx.b f16291c;

    /* renamed from: d */
    public WeakReference<Activity> f16292d;

    /* renamed from: e */
    protected int f16293e = 1500;

    /* renamed from: f */
    protected long f16294f;

    /* renamed from: g */
    long f16295g;

    public AbstractC3641dc(C3636cz c3636cz) {
        this.f16289a = c3636cz;
        this.f16290b = c3636cz.f16277b;
    }

    /* renamed from: a */
    public final void m15633a() {
        this.f16294f = SystemClock.elapsedRealtime();
        new Runnable() { // from class: com.umeng.message.proguard.dc.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    try {
                        C3621ck mo15636b = AbstractC3641dc.this.mo15636b();
                        if (mo15636b == null) {
                            C3615ce.m15509a("Load", "type:", AbstractC3641dc.this.f16290b, " consume:", Long.valueOf(SystemClock.elapsedRealtime() - AbstractC3641dc.this.f16294f));
                            return;
                        }
                        final InterfaceC3606bx.a mo15635b = AbstractC3641dc.this.mo15635b(mo15636b);
                        if (mo15635b == null) {
                            C3615ce.m15509a("Load", "type:", AbstractC3641dc.this.f16290b, " consume:", Long.valueOf(SystemClock.elapsedRealtime() - AbstractC3641dc.this.f16294f));
                            return;
                        }
                        AbstractC3641dc.this.f16295g = SystemClock.elapsedRealtime();
                        mo15636b.f16174j = System.currentTimeMillis();
                        final AbstractC3641dc abstractC3641dc = AbstractC3641dc.this;
                        final InterfaceC3606bx.c cVar = mo15636b.f16165a;
                        C3612cb.m15501c(new Runnable() { // from class: com.umeng.message.proguard.dc.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                InterfaceC3606bx.b bVar = AbstractC3641dc.this.f16291c;
                                if (bVar != null) {
                                    bVar.mo15453a(cVar, mo15635b);
                                }
                            }
                        });
                        C3615ce.m15509a("Load", "type:", AbstractC3641dc.this.f16290b, " consume:", Long.valueOf(SystemClock.elapsedRealtime() - AbstractC3641dc.this.f16294f));
                    } catch (C3614cd e10) {
                        final AbstractC3641dc abstractC3641dc2 = AbstractC3641dc.this;
                        final String message = e10.getMessage();
                        C3612cb.m15501c(new Runnable() { // from class: com.umeng.message.proguard.dc.3
                            @Override // java.lang.Runnable
                            public final void run() {
                                AbstractC3641dc abstractC3641dc3 = AbstractC3641dc.this;
                                InterfaceC3606bx.b bVar = abstractC3641dc3.f16291c;
                                if (bVar != null) {
                                    bVar.mo15454a(abstractC3641dc3.f16290b, message);
                                }
                            }
                        });
                        C3615ce.m15509a("Load", "type:", AbstractC3641dc.this.f16290b, " consume:", Long.valueOf(SystemClock.elapsedRealtime() - AbstractC3641dc.this.f16294f));
                    }
                } catch (Throwable th) {
                    C3615ce.m15509a("Load", "type:", AbstractC3641dc.this.f16290b, " consume:", Long.valueOf(SystemClock.elapsedRealtime() - AbstractC3641dc.this.f16294f));
                    throw th;
                }
            }
        }.run();
    }

    /* renamed from: b */
    protected abstract InterfaceC3606bx.a mo15635b(C3621ck c3621ck);

    /* renamed from: b */
    protected abstract C3621ck mo15636b();

    /* renamed from: a */
    public final boolean m15634a(C3621ck c3621ck) {
        return SystemClock.elapsedRealtime() - this.f16295g > ((long) c3621ck.m15528h());
    }
}
