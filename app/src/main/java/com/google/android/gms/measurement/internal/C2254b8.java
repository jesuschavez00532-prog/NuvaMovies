package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.internal.measurement.InterfaceC1990k1;
import com.lzy.okgo.OkGo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p025b5.InterfaceC1106f;
import p172i4.AbstractC4884q;
import p219l4.AbstractC5391n;
import p233m4.AbstractC5593a;
import p259o4.C5915b;

/* renamed from: com.google.android.gms.measurement.internal.b8 */
/* loaded from: classes.dex */
public final class C2254b8 extends AbstractC2491x3 {

    /* renamed from: c */
    private final ServiceConnectionC2242a8 f8404c;

    /* renamed from: d */
    private InterfaceC1106f f8405d;

    /* renamed from: e */
    private volatile Boolean f8406e;

    /* renamed from: f */
    private final AbstractC2388o f8407f;

    /* renamed from: g */
    private final C2441s8 f8408g;

    /* renamed from: h */
    private final List f8409h;

    /* renamed from: i */
    private final AbstractC2388o f8410i;

    /* JADX INFO: Access modifiers changed from: protected */
    public C2254b8(C2415q4 c2415q4) {
        super(c2415q4);
        this.f8409h = new ArrayList();
        this.f8408g = new C2441s8(c2415q4.mo9578c());
        this.f8404c = new ServiceConnectionC2242a8(this);
        this.f8407f = new C2363l7(this, c2415q4);
        this.f8410i = new C2385n7(this, c2415q4);
    }

    /* renamed from: C */
    private final C2453t9 m9478C(boolean z10) {
        Pair m10112a;
        this.f8714a.mo9580d();
        C2282e3 m10020B = this.f8714a.m10020B();
        String str = null;
        if (z10) {
            C2370m3 mo9577b = this.f8714a.mo9577b();
            if (mo9577b.f8714a.m10024F().f8337d != null && (m10112a = mo9577b.f8714a.m10024F().f8337d.m10112a()) != null && m10112a != C2238a4.f8335x) {
                str = String.valueOf(m10112a.second) + ":" + ((String) m10112a.first);
            }
        }
        return m10020B.m9526q(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public final void m9479D() {
        mo9428h();
        this.f8714a.mo9577b().m9804v().m9700b("Processing queued up service tasks", Integer.valueOf(this.f8409h.size()));
        Iterator it = this.f8409h.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e10) {
                this.f8714a.mo9577b().m9800r().m9700b("Task exception while flushing queue", e10);
            }
        }
        this.f8409h.clear();
        this.f8410i.m9879b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public final void m9480E() {
        mo9428h();
        this.f8408g.m10068b();
        AbstractC2388o abstractC2388o = this.f8407f;
        this.f8714a.m10051z();
        abstractC2388o.m9880d(((Long) AbstractC2260c3.f8430K.m9456a(null)).longValue());
    }

    /* renamed from: F */
    private final void m9481F(Runnable runnable) {
        mo9428h();
        if (m9512z()) {
            runnable.run();
            return;
        }
        int size = this.f8409h.size();
        this.f8714a.m10051z();
        if (size >= 1000) {
            this.f8714a.mo9577b().m9800r().m9699a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f8409h.add(runnable);
        this.f8410i.m9880d(OkGo.DEFAULT_MILLISECONDS);
        m9493P();
    }

    /* renamed from: G */
    private final boolean m9482G() {
        this.f8714a.mo9580d();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public static /* bridge */ /* synthetic */ void m9487M(C2254b8 c2254b8, ComponentName componentName) {
        c2254b8.mo9428h();
        if (c2254b8.f8405d != null) {
            c2254b8.f8405d = null;
            c2254b8.f8714a.mo9577b().m9804v().m9700b("Disconnected from device MeasurementService", componentName);
            c2254b8.mo9428h();
            c2254b8.m9493P();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public final boolean m9489A() {
        mo9428h();
        m10105i();
        if (!m9490B() || this.f8714a.m10031N().m9943o0() >= ((Integer) AbstractC2260c3.f8461h0.m9456a(null)).intValue()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012b  */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m9490B() {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2254b8.m9490B():boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public final Boolean m9491J() {
        return this.f8406e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: O */
    public final void m9492O() {
        mo9428h();
        m10105i();
        C2453t9 m9478C = m9478C(true);
        this.f8714a.m10021C().m9540r();
        m9481F(new RunnableC2319h7(this, m9478C));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public final void m9493P() {
        mo9428h();
        m10105i();
        if (m9512z()) {
            return;
        }
        if (!m9490B()) {
            if (!this.f8714a.m10051z().m9619G()) {
                this.f8714a.mo9580d();
                List<ResolveInfo> queryIntentServices = this.f8714a.mo9584f().getPackageManager().queryIntentServices(new Intent().setClassName(this.f8714a.mo9584f(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    Context mo9584f = this.f8714a.mo9584f();
                    this.f8714a.mo9580d();
                    intent.setComponent(new ComponentName(mo9584f, "com.google.android.gms.measurement.AppMeasurementService"));
                    this.f8404c.m9444e(intent);
                    return;
                }
                this.f8714a.mo9577b().m9800r().m9699a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                return;
            }
            return;
        }
        this.f8404c.m9445f();
    }

    /* renamed from: Q */
    public final void m9494Q() {
        mo9428h();
        m10105i();
        this.f8404c.m9446g();
        try {
            C5915b.m23917b().m23923c(this.f8714a.mo9584f(), this.f8404c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f8405d = null;
    }

    /* renamed from: R */
    public final void m9495R(InterfaceC1990k1 interfaceC1990k1) {
        mo9428h();
        m10105i();
        m9481F(new RunnableC2308g7(this, m9478C(false), interfaceC1990k1));
    }

    /* renamed from: S */
    public final void m9496S(AtomicReference atomicReference) {
        mo9428h();
        m10105i();
        m9481F(new RunnableC2297f7(this, atomicReference, m9478C(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: T */
    public final void m9497T(InterfaceC1990k1 interfaceC1990k1, String str, String str2) {
        mo9428h();
        m10105i();
        m9481F(new RunnableC2451t7(this, str, str2, m9478C(false), interfaceC1990k1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: U */
    public final void m9498U(AtomicReference atomicReference, String str, String str2, String str3) {
        mo9428h();
        m10105i();
        m9481F(new RunnableC2440s7(this, atomicReference, null, str2, str3, m9478C(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: V */
    public final void m9499V(InterfaceC1990k1 interfaceC1990k1, String str, String str2, boolean z10) {
        mo9428h();
        m10105i();
        m9481F(new RunnableC2264c7(this, str, str2, m9478C(false), z10, interfaceC1990k1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: W */
    public final void m9500W(AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        mo9428h();
        m10105i();
        m9481F(new RunnableC2462u7(this, atomicReference, null, str2, str3, m9478C(false), z10));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2491x3
    /* renamed from: n */
    protected final boolean mo9472n() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public final void m9501o(C2465v c2465v, String str) {
        AbstractC5391n.m21783i(c2465v);
        mo9428h();
        m10105i();
        m9482G();
        m9481F(new RunnableC2418q7(this, true, m9478C(true), this.f8714a.m10021C().m9544v(c2465v), c2465v, str));
    }

    /* renamed from: p */
    public final void m9502p(InterfaceC1990k1 interfaceC1990k1, C2465v c2465v, String str) {
        mo9428h();
        m10105i();
        if (this.f8714a.m10031N().m9945p0(AbstractC4884q.f20380a) != 0) {
            this.f8714a.mo9577b().m9805w().m9699a("Not bundling data. Service unavailable or out of date");
            this.f8714a.m10031N().m9919G(interfaceC1990k1, new byte[0]);
        } else {
            m9481F(new RunnableC2374m7(this, c2465v, str, interfaceC1990k1));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public final void m9503q() {
        mo9428h();
        m10105i();
        C2453t9 m9478C = m9478C(false);
        m9482G();
        this.f8714a.m10021C().m9539q();
        m9481F(new RunnableC2286e7(this, m9478C));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final void m9504r(InterfaceC1106f interfaceC1106f, AbstractC5593a abstractC5593a, C2453t9 c2453t9) {
        int i10;
        mo9428h();
        m10105i();
        m9482G();
        this.f8714a.m10051z();
        int i11 = 0;
        int i12 = 100;
        while (i11 < 1001 && i12 == 100) {
            ArrayList arrayList = new ArrayList();
            List m9538p = this.f8714a.m10021C().m9538p(100);
            if (m9538p != null) {
                arrayList.addAll(m9538p);
                i10 = m9538p.size();
            } else {
                i10 = 0;
            }
            if (abstractC5593a != null && i10 < 100) {
                arrayList.add(abstractC5593a);
            }
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                AbstractC5593a abstractC5593a2 = (AbstractC5593a) arrayList.get(i13);
                if (abstractC5593a2 instanceof C2465v) {
                    try {
                        interfaceC1106f.mo5076v((C2465v) abstractC5593a2, c2453t9);
                    } catch (RemoteException e10) {
                        this.f8714a.mo9577b().m9800r().m9700b("Failed to send event to the service", e10);
                    }
                } else if (abstractC5593a2 instanceof C2354k9) {
                    try {
                        interfaceC1106f.mo5063D((C2354k9) abstractC5593a2, c2453t9);
                    } catch (RemoteException e11) {
                        this.f8714a.mo9577b().m9800r().m9700b("Failed to send user property to the service", e11);
                    }
                } else if (abstractC5593a2 instanceof C2267d) {
                    try {
                        interfaceC1106f.mo5067I((C2267d) abstractC5593a2, c2453t9);
                    } catch (RemoteException e12) {
                        this.f8714a.mo9577b().m9800r().m9700b("Failed to send conditional user property to the service", e12);
                    }
                } else {
                    this.f8714a.mo9577b().m9800r().m9699a("Discarding data. Unrecognized parcel type.");
                }
            }
            i11++;
            i12 = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public final void m9505s(C2267d c2267d) {
        AbstractC5391n.m21783i(c2267d);
        mo9428h();
        m10105i();
        this.f8714a.mo9580d();
        m9481F(new RunnableC2429r7(this, true, m9478C(true), this.f8714a.m10021C().m9543u(c2267d), new C2267d(c2267d), c2267d));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public final void m9506t(boolean z10) {
        mo9428h();
        m10105i();
        if (z10) {
            m9482G();
            this.f8714a.m10021C().m9539q();
        }
        if (m9489A()) {
            m9481F(new RunnableC2407p7(this, m9478C(false)));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public final void m9507u(C2461u6 c2461u6) {
        mo9428h();
        m10105i();
        m9481F(new RunnableC2341j7(this, c2461u6));
    }

    /* renamed from: v */
    public final void m9508v(Bundle bundle) {
        mo9428h();
        m10105i();
        m9481F(new RunnableC2352k7(this, m9478C(false), bundle));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public final void m9509w() {
        mo9428h();
        m10105i();
        m9481F(new RunnableC2396o7(this, m9478C(true)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public final void m9510x(InterfaceC1106f interfaceC1106f) {
        mo9428h();
        AbstractC5391n.m21783i(interfaceC1106f);
        this.f8405d = interfaceC1106f;
        m9480E();
        m9479D();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public final void m9511y(C2354k9 c2354k9) {
        mo9428h();
        m10105i();
        m9482G();
        m9481F(new RunnableC2275d7(this, m9478C(true), this.f8714a.m10021C().m9545w(c2354k9), c2354k9));
    }

    /* renamed from: z */
    public final boolean m9512z() {
        mo9428h();
        m10105i();
        if (this.f8405d != null) {
            return true;
        }
        return false;
    }
}
