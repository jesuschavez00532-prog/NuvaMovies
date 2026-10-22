package p411y5;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p395x5.C7503f;

/* renamed from: y5.c */
/* loaded from: classes.dex */
public class C7676c implements InterfaceC7675b, InterfaceC7674a {

    /* renamed from: a */
    private final C7678e f28107a;

    /* renamed from: b */
    private final int f28108b;

    /* renamed from: c */
    private final TimeUnit f28109c;

    /* renamed from: e */
    private CountDownLatch f28111e;

    /* renamed from: d */
    private final Object f28110d = new Object();

    /* renamed from: f */
    private boolean f28112f = false;

    public C7676c(C7678e c7678e, int i10, TimeUnit timeUnit) {
        this.f28107a = c7678e;
        this.f28108b = i10;
        this.f28109c = timeUnit;
    }

    @Override // p411y5.InterfaceC7674a
    /* renamed from: a */
    public void mo28427a(String str, Bundle bundle) {
        synchronized (this.f28110d) {
            C7503f.m28716f().m28723i("Logging event " + str + " to Firebase Analytics with params " + bundle);
            this.f28111e = new CountDownLatch(1);
            this.f28112f = false;
            this.f28107a.mo28427a(str, bundle);
            C7503f.m28716f().m28723i("Awaiting app exception callback from Analytics...");
            try {
                if (this.f28111e.await(this.f28108b, this.f28109c)) {
                    this.f28112f = true;
                    C7503f.m28716f().m28723i("App exception callback received from Analytics listener.");
                } else {
                    C7503f.m28716f().m28725k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                }
            } catch (InterruptedException unused) {
                C7503f.m28716f().m28719d("Interrupted while awaiting app exception callback from Analytics listener.");
            }
            this.f28111e = null;
        }
    }

    @Override // p411y5.InterfaceC7675b
    /* renamed from: b */
    public void mo29468b(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f28111e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
