package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C1835a2;
import com.google.android.gms.internal.measurement.C1848b;
import com.google.android.gms.internal.measurement.C1898e1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p025b5.AbstractBinderC1104e;
import p025b5.AbstractC1119q;
import p172i4.AbstractC4884q;
import p172i4.C4886r;
import p219l4.AbstractC5391n;
import p281p4.AbstractC6210n;

/* renamed from: com.google.android.gms.measurement.internal.i5 */
/* loaded from: classes.dex */
public final class BinderC2328i5 extends AbstractBinderC1104e {

    /* renamed from: a */
    private final C2310g9 f8683a;

    /* renamed from: b */
    private Boolean f8684b;

    /* renamed from: c */
    private String f8685c;

    public BinderC2328i5(C2310g9 c2310g9, String str) {
        AbstractC5391n.m21783i(c2310g9);
        this.f8683a = c2310g9;
        this.f8685c = null;
    }

    /* renamed from: Q */
    private final void m9661Q(C2453t9 c2453t9, boolean z10) {
        AbstractC5391n.m21783i(c2453t9);
        AbstractC5391n.m21779e(c2453t9.f9084a);
        m9662R(c2453t9.f9084a, false);
        this.f8683a.m9588h0().m9924L(c2453t9.f9085b, c2453t9.f9100q);
    }

    /* renamed from: R */
    private final void m9662R(String str, boolean z10) {
        boolean z11;
        if (!TextUtils.isEmpty(str)) {
            if (z10) {
                try {
                    if (this.f8684b == null) {
                        if (!"com.google.android.gms".equals(this.f8685c) && !AbstractC6210n.m24778a(this.f8683a.mo9584f(), Binder.getCallingUid()) && !C4886r.m20090a(this.f8683a.mo9584f()).m20095c(Binder.getCallingUid())) {
                            z11 = false;
                            this.f8684b = Boolean.valueOf(z11);
                        }
                        z11 = true;
                        this.f8684b = Boolean.valueOf(z11);
                    }
                    if (this.f8684b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e10) {
                    this.f8683a.mo9577b().m9800r().m9700b("Measurement Service called with invalid calling package. appId", C2370m3.m9796z(str));
                    throw e10;
                }
            }
            if (this.f8685c == null && AbstractC4884q.m20082i(this.f8683a.mo9584f(), Binder.getCallingUid(), str)) {
                this.f8685c = str;
            }
            if (str.equals(this.f8685c)) {
                return;
            } else {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
            }
        }
        this.f8683a.mo9577b().m9800r().m9699a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    /* renamed from: c */
    private final void m9663c(C2465v c2465v, C2453t9 c2453t9) {
        this.f8683a.m9582e();
        this.f8683a.m9591j(c2465v, c2453t9);
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: B */
    public final void mo5061B(long j10, String str, String str2, String str3) {
        m9666P(new RunnableC2317h5(this, str2, str3, str, j10));
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: C */
    public final void mo5062C(C2465v c2465v, String str, String str2) {
        AbstractC5391n.m21783i(c2465v);
        AbstractC5391n.m21779e(str);
        m9662R(str, true);
        m9666P(new RunnableC2262c5(this, c2465v, str));
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: D */
    public final void mo5063D(C2354k9 c2354k9, C2453t9 c2453t9) {
        AbstractC5391n.m21783i(c2354k9);
        m9661Q(c2453t9, false);
        m9666P(new RunnableC2284e5(this, c2354k9, c2453t9));
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: E */
    public final void mo5064E(C2453t9 c2453t9) {
        AbstractC5391n.m21779e(c2453t9.f9084a);
        AbstractC5391n.m21783i(c2453t9.f9105v);
        RunnableC2239a5 runnableC2239a5 = new RunnableC2239a5(this, c2453t9);
        AbstractC5391n.m21783i(runnableC2239a5);
        if (this.f8683a.mo9575a().m9892C()) {
            runnableC2239a5.run();
        } else {
            this.f8683a.mo9575a().m9891A(runnableC2239a5);
        }
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: F */
    public final List mo5065F(String str, String str2, boolean z10, C2453t9 c2453t9) {
        m9661Q(c2453t9, false);
        String str3 = c2453t9.f9084a;
        AbstractC5391n.m21783i(str3);
        try {
            List<C2376m9> list = (List) this.f8683a.mo9575a().m9894s(new CallableC2459u4(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C2376m9 c2376m9 : list) {
                if (z10 || !C2398o9.m9898W(c2376m9.f8845c)) {
                    arrayList.add(new C2354k9(c2376m9));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f8683a.mo9577b().m9800r().m9701c("Failed to query user properties. appId", C2370m3.m9796z(c2453t9.f9084a), e10);
            return Collections.emptyList();
        }
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: G */
    public final void mo5066G(C2453t9 c2453t9) {
        AbstractC5391n.m21779e(c2453t9.f9084a);
        m9662R(c2453t9.f9084a, false);
        m9666P(new RunnableC2503y4(this, c2453t9));
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: I */
    public final void mo5067I(C2267d c2267d, C2453t9 c2453t9) {
        AbstractC5391n.m21783i(c2267d);
        AbstractC5391n.m21783i(c2267d.f8523c);
        m9661Q(c2453t9, false);
        C2267d c2267d2 = new C2267d(c2267d);
        c2267d2.f8521a = c2453t9.f9084a;
        m9666P(new RunnableC2437s4(this, c2267d2, c2453t9));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public final void m9664N(C2465v c2465v, C2453t9 c2453t9) {
        C1898e1 c1898e1;
        if (!this.f8683a.m9576a0().m9712C(c2453t9.f9084a)) {
            m9663c(c2465v, c2453t9);
            return;
        }
        this.f8683a.mo9577b().m9804v().m9700b("EES config found for", c2453t9.f9084a);
        C2349k4 m9576a0 = this.f8683a.m9576a0();
        String str = c2453t9.f9084a;
        if (TextUtils.isEmpty(str)) {
            c1898e1 = null;
        } else {
            c1898e1 = (C1898e1) m9576a0.f8740j.m21407d(str);
        }
        if (c1898e1 != null) {
            try {
                Map m9691I = this.f8683a.m9586g0().m9691I(c2465v.f9138b.m10072j(), true);
                String m5087a = AbstractC1119q.m5087a(c2465v.f9137a);
                if (m5087a == null) {
                    m5087a = c2465v.f9137a;
                }
                if (c1898e1.m8281e(new C1848b(m5087a, c2465v.f9140d, m9691I))) {
                    if (c1898e1.m8283g()) {
                        this.f8683a.mo9577b().m9804v().m9700b("EES edited event", c2465v.f9137a);
                        m9663c(this.f8683a.m9586g0().m9685A(c1898e1.m8277a().m8154b()), c2453t9);
                    } else {
                        m9663c(c2465v, c2453t9);
                    }
                    if (c1898e1.m8282f()) {
                        for (C1848b c1848b : c1898e1.m8277a().m8155c()) {
                            this.f8683a.mo9577b().m9804v().m9700b("EES logging created event", c1848b.m8111d());
                            m9663c(this.f8683a.m9586g0().m9685A(c1848b), c2453t9);
                        }
                        return;
                    }
                    return;
                }
            } catch (C1835a2 unused) {
                this.f8683a.mo9577b().m9800r().m9701c("EES error. appId, eventName", c2453t9.f9085b, c2465v.f9137a);
            }
            this.f8683a.mo9577b().m9804v().m9700b("EES was not applied to event", c2465v.f9137a);
            m9663c(c2465v, c2453t9);
            return;
        }
        this.f8683a.mo9577b().m9804v().m9700b("EES not loaded for", c2453t9.f9084a);
        m9663c(c2465v, c2453t9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public final /* synthetic */ void m9665O(String str, Bundle bundle) {
        C2355l m9571W = this.f8683a.m9571W();
        m9571W.mo9428h();
        m9571W.m10099i();
        byte[] m8704j = m9571W.f9168b.m9586g0().m9686B(new C2410q(m9571W.f8714a, "", str, "dep", 0L, 0L, bundle)).m8704j();
        m9571W.f8714a.mo9577b().m9804v().m9701c("Saving default event parameters, appId, data size", m9571W.f8714a.m10022D().m9641d(str), Integer.valueOf(m8704j.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", m8704j);
        try {
            if (m9571W.m9754P().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                m9571W.f8714a.mo9577b().m9800r().m9700b("Failed to insert default event parameters (got -1). appId", C2370m3.m9796z(str));
            }
        } catch (SQLiteException e10) {
            m9571W.f8714a.mo9577b().m9800r().m9701c("Error storing default event parameters. appId", C2370m3.m9796z(str), e10);
        }
    }

    /* renamed from: P */
    final void m9666P(Runnable runnable) {
        AbstractC5391n.m21783i(runnable);
        if (this.f8683a.mo9575a().m9892C()) {
            runnable.run();
        } else {
            this.f8683a.mo9575a().m9897z(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final C2465v m9667d(C2465v c2465v, C2453t9 c2453t9) {
        C2443t c2443t;
        if ("_cmp".equals(c2465v.f9137a) && (c2443t = c2465v.f9138b) != null && c2443t.m10071g() != 0) {
            String m10076p = c2465v.f9138b.m10076p("_cis");
            if ("referrer broadcast".equals(m10076p) || "referrer API".equals(m10076p)) {
                this.f8683a.mo9577b().m9803u().m9700b("Event has been filtered ", c2465v.toString());
                return new C2465v("_cmpx", c2465v.f9138b, c2465v.f9139c, c2465v.f9140d);
            }
        }
        return c2465v;
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: j */
    public final void mo5068j(C2453t9 c2453t9) {
        m9661Q(c2453t9, false);
        m9666P(new RunnableC2514z4(this, c2453t9));
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: k */
    public final void mo5069k(final Bundle bundle, C2453t9 c2453t9) {
        m9661Q(c2453t9, false);
        final String str = c2453t9.f9084a;
        AbstractC5391n.m21783i(str);
        m9666P(new Runnable() { // from class: com.google.android.gms.measurement.internal.r4
            @Override // java.lang.Runnable
            public final void run() {
                BinderC2328i5.this.m9665O(str, bundle);
            }
        });
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: l */
    public final List mo5070l(String str, String str2, String str3, boolean z10) {
        m9662R(str, true);
        try {
            List<C2376m9> list = (List) this.f8683a.mo9575a().m9894s(new CallableC2470v4(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C2376m9 c2376m9 : list) {
                if (z10 || !C2398o9.m9898W(c2376m9.f8845c)) {
                    arrayList.add(new C2354k9(c2376m9));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f8683a.mo9577b().m9800r().m9701c("Failed to get user properties as. appId", C2370m3.m9796z(str), e10);
            return Collections.emptyList();
        }
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: m */
    public final void mo5071m(C2267d c2267d) {
        AbstractC5391n.m21783i(c2267d);
        AbstractC5391n.m21783i(c2267d.f8523c);
        AbstractC5391n.m21779e(c2267d.f8521a);
        m9662R(c2267d.f8521a, true);
        m9666P(new RunnableC2448t4(this, new C2267d(c2267d)));
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: n */
    public final List mo5072n(C2453t9 c2453t9, boolean z10) {
        m9661Q(c2453t9, false);
        String str = c2453t9.f9084a;
        AbstractC5391n.m21783i(str);
        try {
            List<C2376m9> list = (List) this.f8683a.mo9575a().m9894s(new CallableC2295f5(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C2376m9 c2376m9 : list) {
                if (z10 || !C2398o9.m9898W(c2376m9.f8845c)) {
                    arrayList.add(new C2354k9(c2376m9));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f8683a.mo9577b().m9800r().m9701c("Failed to get user properties. appId", C2370m3.m9796z(c2453t9.f9084a), e10);
            return null;
        }
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: p */
    public final byte[] mo5073p(C2465v c2465v, String str) {
        AbstractC5391n.m21779e(str);
        AbstractC5391n.m21783i(c2465v);
        m9662R(str, true);
        this.f8683a.mo9577b().m9799q().m9700b("Log and bundle. event", this.f8683a.m9572X().m9641d(c2465v.f9137a));
        long mo24749c = this.f8683a.mo9578c().mo24749c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f8683a.mo9575a().m9895t(new CallableC2273d5(this, c2465v, str)).get();
            if (bArr == null) {
                this.f8683a.mo9577b().m9800r().m9700b("Log and bundle returned null. appId", C2370m3.m9796z(str));
                bArr = new byte[0];
            }
            this.f8683a.mo9577b().m9799q().m9702d("Log and bundle processed. event, size, time_ms", this.f8683a.m9572X().m9641d(c2465v.f9137a), Integer.valueOf(bArr.length), Long.valueOf((this.f8683a.mo9578c().mo24749c() / 1000000) - mo24749c));
            return bArr;
        } catch (InterruptedException | ExecutionException e10) {
            this.f8683a.mo9577b().m9800r().m9702d("Failed to log and bundle. appId, event, error", C2370m3.m9796z(str), this.f8683a.m9572X().m9641d(c2465v.f9137a), e10);
            return null;
        }
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: r */
    public final String mo5074r(C2453t9 c2453t9) {
        m9661Q(c2453t9, false);
        return this.f8683a.m9592j0(c2453t9);
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: s */
    public final List mo5075s(String str, String str2, String str3) {
        m9662R(str, true);
        try {
            return (List) this.f8683a.mo9575a().m9894s(new CallableC2492x4(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f8683a.mo9577b().m9800r().m9700b("Failed to get conditional user properties as", e10);
            return Collections.emptyList();
        }
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: v */
    public final void mo5076v(C2465v c2465v, C2453t9 c2453t9) {
        AbstractC5391n.m21783i(c2465v);
        m9661Q(c2453t9, false);
        m9666P(new RunnableC2251b5(this, c2465v, c2453t9));
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: x */
    public final void mo5077x(C2453t9 c2453t9) {
        m9661Q(c2453t9, false);
        m9666P(new RunnableC2306g5(this, c2453t9));
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: y */
    public final List mo5078y(String str, String str2, C2453t9 c2453t9) {
        m9661Q(c2453t9, false);
        String str3 = c2453t9.f9084a;
        AbstractC5391n.m21783i(str3);
        try {
            return (List) this.f8683a.mo9575a().m9894s(new CallableC2481w4(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f8683a.mo9577b().m9800r().m9700b("Failed to get conditional user properties", e10);
            return Collections.emptyList();
        }
    }
}
