package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p025b5.AbstractC1117o;
import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.m5 */
/* loaded from: classes.dex */
public final class C2372m5 {

    /* renamed from: A */
    private long f8803A;

    /* renamed from: B */
    private String f8804B;

    /* renamed from: C */
    private boolean f8805C;

    /* renamed from: D */
    private long f8806D;

    /* renamed from: E */
    private long f8807E;

    /* renamed from: a */
    private final C2415q4 f8808a;

    /* renamed from: b */
    private final String f8809b;

    /* renamed from: c */
    private String f8810c;

    /* renamed from: d */
    private String f8811d;

    /* renamed from: e */
    private String f8812e;

    /* renamed from: f */
    private String f8813f;

    /* renamed from: g */
    private long f8814g;

    /* renamed from: h */
    private long f8815h;

    /* renamed from: i */
    private long f8816i;

    /* renamed from: j */
    private String f8817j;

    /* renamed from: k */
    private long f8818k;

    /* renamed from: l */
    private String f8819l;

    /* renamed from: m */
    private long f8820m;

    /* renamed from: n */
    private long f8821n;

    /* renamed from: o */
    private boolean f8822o;

    /* renamed from: p */
    private boolean f8823p;

    /* renamed from: q */
    private String f8824q;

    /* renamed from: r */
    private Boolean f8825r;

    /* renamed from: s */
    private long f8826s;

    /* renamed from: t */
    private List f8827t;

    /* renamed from: u */
    private String f8828u;

    /* renamed from: v */
    private long f8829v;

    /* renamed from: w */
    private long f8830w;

    /* renamed from: x */
    private long f8831x;

    /* renamed from: y */
    private long f8832y;

    /* renamed from: z */
    private long f8833z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2372m5(C2415q4 c2415q4, String str) {
        AbstractC5391n.m21783i(c2415q4);
        AbstractC5391n.m21779e(str);
        this.f8808a = c2415q4;
        this.f8809b = str;
        c2415q4.mo9575a().mo9428h();
    }

    /* renamed from: A */
    public final long m9808A() {
        this.f8808a.mo9575a().mo9428h();
        return 0L;
    }

    /* renamed from: B */
    public final void m9809B(long j10) {
        boolean z10;
        boolean z11 = true;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC5391n.m21775a(z10);
        this.f8808a.mo9575a().mo9428h();
        boolean z12 = this.f8805C;
        if (this.f8814g == j10) {
            z11 = false;
        }
        this.f8805C = z12 | z11;
        this.f8814g = j10;
    }

    /* renamed from: C */
    public final void m9810C(long j10) {
        boolean z10;
        this.f8808a.mo9575a().mo9428h();
        boolean z11 = this.f8805C;
        if (this.f8815h != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f8805C = z11 | z10;
        this.f8815h = j10;
    }

    /* renamed from: D */
    public final void m9811D(boolean z10) {
        boolean z11;
        this.f8808a.mo9575a().mo9428h();
        boolean z12 = this.f8805C;
        if (this.f8822o != z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f8805C = z12 | z11;
        this.f8822o = z10;
    }

    /* renamed from: E */
    public final void m9812E(Boolean bool) {
        this.f8808a.mo9575a().mo9428h();
        this.f8805C |= !AbstractC1117o.m5084a(this.f8825r, bool);
        this.f8825r = bool;
    }

    /* renamed from: F */
    public final void m9813F(String str) {
        this.f8808a.mo9575a().mo9428h();
        this.f8805C |= !AbstractC1117o.m5084a(this.f8812e, str);
        this.f8812e = str;
    }

    /* renamed from: G */
    public final void m9814G(List list) {
        ArrayList arrayList;
        this.f8808a.mo9575a().mo9428h();
        if (!AbstractC1117o.m5084a(this.f8827t, list)) {
            this.f8805C = true;
            if (list != null) {
                arrayList = new ArrayList(list);
            } else {
                arrayList = null;
            }
            this.f8827t = arrayList;
        }
    }

    /* renamed from: H */
    public final void m9815H(String str) {
        this.f8808a.mo9575a().mo9428h();
        this.f8805C |= !AbstractC1117o.m5084a(this.f8828u, str);
        this.f8828u = str;
    }

    /* renamed from: I */
    public final boolean m9816I() {
        this.f8808a.mo9575a().mo9428h();
        return this.f8823p;
    }

    /* renamed from: J */
    public final boolean m9817J() {
        this.f8808a.mo9575a().mo9428h();
        return this.f8822o;
    }

    /* renamed from: K */
    public final boolean m9818K() {
        this.f8808a.mo9575a().mo9428h();
        return this.f8805C;
    }

    /* renamed from: L */
    public final long m9819L() {
        this.f8808a.mo9575a().mo9428h();
        return this.f8818k;
    }

    /* renamed from: M */
    public final long m9820M() {
        this.f8808a.mo9575a().mo9428h();
        return this.f8806D;
    }

    /* renamed from: N */
    public final long m9821N() {
        this.f8808a.mo9575a().mo9428h();
        return this.f8832y;
    }

    /* renamed from: O */
    public final long m9822O() {
        this.f8808a.mo9575a().mo9428h();
        return this.f8833z;
    }

    /* renamed from: P */
    public final long m9823P() {
        this.f8808a.mo9575a().mo9428h();
        return this.f8831x;
    }

    /* renamed from: Q */
    public final long m9824Q() {
        this.f8808a.mo9575a().mo9428h();
        return this.f8830w;
    }

    /* renamed from: R */
    public final long m9825R() {
        this.f8808a.mo9575a().mo9428h();
        return this.f8803A;
    }

    /* renamed from: S */
    public final long m9826S() {
        this.f8808a.mo9575a().mo9428h();
        return this.f8829v;
    }

    /* renamed from: T */
    public final long m9827T() {
        this.f8808a.mo9575a().mo9428h();
        return this.f8821n;
    }

    /* renamed from: U */
    public final long m9828U() {
        this.f8808a.mo9575a().mo9428h();
        return this.f8826s;
    }

    /* renamed from: V */
    public final long m9829V() {
        this.f8808a.mo9575a().mo9428h();
        return this.f8807E;
    }

    /* renamed from: W */
    public final long m9830W() {
        this.f8808a.mo9575a().mo9428h();
        return this.f8820m;
    }

    /* renamed from: X */
    public final long m9831X() {
        this.f8808a.mo9575a().mo9428h();
        return this.f8816i;
    }

    /* renamed from: Y */
    public final long m9832Y() {
        this.f8808a.mo9575a().mo9428h();
        return this.f8814g;
    }

    /* renamed from: Z */
    public final long m9833Z() {
        this.f8808a.mo9575a().mo9428h();
        return this.f8815h;
    }

    /* renamed from: a */
    public final String m9834a() {
        this.f8808a.mo9575a().mo9428h();
        return this.f8812e;
    }

    /* renamed from: a0 */
    public final Boolean m9835a0() {
        this.f8808a.mo9575a().mo9428h();
        return this.f8825r;
    }

    /* renamed from: b */
    public final String m9836b() {
        this.f8808a.mo9575a().mo9428h();
        return this.f8828u;
    }

    /* renamed from: b0 */
    public final String m9837b0() {
        this.f8808a.mo9575a().mo9428h();
        return this.f8824q;
    }

    /* renamed from: c */
    public final List m9838c() {
        this.f8808a.mo9575a().mo9428h();
        return this.f8827t;
    }

    /* renamed from: c0 */
    public final String m9839c0() {
        this.f8808a.mo9575a().mo9428h();
        String str = this.f8804B;
        m9868y(null);
        return str;
    }

    /* renamed from: d */
    public final void m9840d() {
        this.f8808a.mo9575a().mo9428h();
        this.f8805C = false;
    }

    /* renamed from: d0 */
    public final String m9841d0() {
        this.f8808a.mo9575a().mo9428h();
        return this.f8809b;
    }

    /* renamed from: e */
    public final void m9842e() {
        this.f8808a.mo9575a().mo9428h();
        long j10 = this.f8814g + 1;
        if (j10 > 2147483647L) {
            this.f8808a.mo9577b().m9805w().m9700b("Bundle index overflow. appId", C2370m3.m9796z(this.f8809b));
            j10 = 0;
        }
        this.f8805C = true;
        this.f8814g = j10;
    }

    /* renamed from: e0 */
    public final String m9843e0() {
        this.f8808a.mo9575a().mo9428h();
        return this.f8810c;
    }

    /* renamed from: f */
    public final void m9844f(String str) {
        this.f8808a.mo9575a().mo9428h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f8805C |= true ^ AbstractC1117o.m5084a(this.f8824q, str);
        this.f8824q = str;
    }

    /* renamed from: f0 */
    public final String m9845f0() {
        this.f8808a.mo9575a().mo9428h();
        return this.f8819l;
    }

    /* renamed from: g */
    public final void m9846g(boolean z10) {
        boolean z11;
        this.f8808a.mo9575a().mo9428h();
        boolean z12 = this.f8805C;
        if (this.f8823p != z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f8805C = z12 | z11;
        this.f8823p = z10;
    }

    /* renamed from: g0 */
    public final String m9847g0() {
        this.f8808a.mo9575a().mo9428h();
        return this.f8817j;
    }

    /* renamed from: h */
    public final void m9848h(String str) {
        this.f8808a.mo9575a().mo9428h();
        this.f8805C |= !AbstractC1117o.m5084a(this.f8810c, str);
        this.f8810c = str;
    }

    /* renamed from: h0 */
    public final String m9849h0() {
        this.f8808a.mo9575a().mo9428h();
        return this.f8813f;
    }

    /* renamed from: i */
    public final void m9850i(String str) {
        this.f8808a.mo9575a().mo9428h();
        this.f8805C |= !AbstractC1117o.m5084a(this.f8819l, str);
        this.f8819l = str;
    }

    /* renamed from: i0 */
    public final String m9851i0() {
        this.f8808a.mo9575a().mo9428h();
        return this.f8811d;
    }

    /* renamed from: j */
    public final void m9852j(String str) {
        this.f8808a.mo9575a().mo9428h();
        this.f8805C |= !AbstractC1117o.m5084a(this.f8817j, str);
        this.f8817j = str;
    }

    /* renamed from: j0 */
    public final String m9853j0() {
        this.f8808a.mo9575a().mo9428h();
        return this.f8804B;
    }

    /* renamed from: k */
    public final void m9854k(long j10) {
        boolean z10;
        this.f8808a.mo9575a().mo9428h();
        boolean z11 = this.f8805C;
        if (this.f8818k != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f8805C = z11 | z10;
        this.f8818k = j10;
    }

    /* renamed from: l */
    public final void m9855l(long j10) {
        boolean z10;
        this.f8808a.mo9575a().mo9428h();
        boolean z11 = this.f8805C;
        if (this.f8806D != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f8805C = z11 | z10;
        this.f8806D = j10;
    }

    /* renamed from: m */
    public final void m9856m(long j10) {
        boolean z10;
        this.f8808a.mo9575a().mo9428h();
        boolean z11 = this.f8805C;
        if (this.f8832y != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f8805C = z11 | z10;
        this.f8832y = j10;
    }

    /* renamed from: n */
    public final void m9857n(long j10) {
        boolean z10;
        this.f8808a.mo9575a().mo9428h();
        boolean z11 = this.f8805C;
        if (this.f8833z != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f8805C = z11 | z10;
        this.f8833z = j10;
    }

    /* renamed from: o */
    public final void m9858o(long j10) {
        boolean z10;
        this.f8808a.mo9575a().mo9428h();
        boolean z11 = this.f8805C;
        if (this.f8831x != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f8805C = z11 | z10;
        this.f8831x = j10;
    }

    /* renamed from: p */
    public final void m9859p(long j10) {
        boolean z10;
        this.f8808a.mo9575a().mo9428h();
        boolean z11 = this.f8805C;
        if (this.f8830w != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f8805C = z11 | z10;
        this.f8830w = j10;
    }

    /* renamed from: q */
    public final void m9860q(long j10) {
        boolean z10;
        this.f8808a.mo9575a().mo9428h();
        boolean z11 = this.f8805C;
        if (this.f8803A != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f8805C = z11 | z10;
        this.f8803A = j10;
    }

    /* renamed from: r */
    public final void m9861r(long j10) {
        boolean z10;
        this.f8808a.mo9575a().mo9428h();
        boolean z11 = this.f8805C;
        if (this.f8829v != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f8805C = z11 | z10;
        this.f8829v = j10;
    }

    /* renamed from: s */
    public final void m9862s(long j10) {
        boolean z10;
        this.f8808a.mo9575a().mo9428h();
        boolean z11 = this.f8805C;
        if (this.f8821n != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f8805C = z11 | z10;
        this.f8821n = j10;
    }

    /* renamed from: t */
    public final void m9863t(long j10) {
        boolean z10;
        this.f8808a.mo9575a().mo9428h();
        boolean z11 = this.f8805C;
        if (this.f8826s != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f8805C = z11 | z10;
        this.f8826s = j10;
    }

    /* renamed from: u */
    public final void m9864u(long j10) {
        boolean z10;
        this.f8808a.mo9575a().mo9428h();
        boolean z11 = this.f8805C;
        if (this.f8807E != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f8805C = z11 | z10;
        this.f8807E = j10;
    }

    /* renamed from: v */
    public final void m9865v(String str) {
        this.f8808a.mo9575a().mo9428h();
        this.f8805C |= !AbstractC1117o.m5084a(this.f8813f, str);
        this.f8813f = str;
    }

    /* renamed from: w */
    public final void m9866w(String str) {
        this.f8808a.mo9575a().mo9428h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f8805C |= true ^ AbstractC1117o.m5084a(this.f8811d, str);
        this.f8811d = str;
    }

    /* renamed from: x */
    public final void m9867x(long j10) {
        boolean z10;
        this.f8808a.mo9575a().mo9428h();
        boolean z11 = this.f8805C;
        if (this.f8820m != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f8805C = z11 | z10;
        this.f8820m = j10;
    }

    /* renamed from: y */
    public final void m9868y(String str) {
        this.f8808a.mo9575a().mo9428h();
        this.f8805C |= !AbstractC1117o.m5084a(this.f8804B, str);
        this.f8804B = str;
    }

    /* renamed from: z */
    public final void m9869z(long j10) {
        boolean z10;
        this.f8808a.mo9575a().mo9428h();
        boolean z11 = this.f8805C;
        if (this.f8816i != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f8805C = z11 | z10;
        this.f8816i = j10;
    }
}
