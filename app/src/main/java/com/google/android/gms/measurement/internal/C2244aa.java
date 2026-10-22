package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1909ec;
import com.google.android.gms.internal.measurement.C1916f3;
import com.google.android.gms.internal.measurement.C1949h5;
import com.google.android.gms.internal.measurement.C2022m3;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.aa */
/* loaded from: classes.dex */
public final class C2244aa extends AbstractC2519z9 {

    /* renamed from: g */
    private final C2022m3 f8368g;

    /* renamed from: h */
    final /* synthetic */ C2245b f8369h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2244aa(C2245b c2245b, String str, int i10, C2022m3 c2022m3) {
        super(str, i10);
        this.f8369h = c2245b;
        this.f8368g = c2022m3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.AbstractC2519z9
    /* renamed from: a */
    public final int mo9448a() {
        return this.f8368g.m8678x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.AbstractC2519z9
    /* renamed from: b */
    public final boolean mo9449b() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.AbstractC2519z9
    /* renamed from: c */
    public final boolean mo9450c() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean m9451k(Long l10, Long l11, C1949h5 c1949h5, boolean z10) {
        boolean z11;
        Object obj;
        C1909ec.m8325c();
        boolean m9614B = this.f8369h.f8714a.m10051z().m9614B(this.f9261a, AbstractC2260c3.f8442W);
        boolean m8673D = this.f8368g.m8673D();
        boolean m8674E = this.f8368g.m8674E();
        boolean m8675F = this.f8368g.m8675F();
        if (!m8673D && !m8674E && !m8675F) {
            z11 = false;
        } else {
            z11 = true;
        }
        Boolean bool = null;
        Integer num = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z10 && !z11) {
            C2348k3 m9804v = this.f8369h.f8714a.mo9577b().m9804v();
            Integer valueOf = Integer.valueOf(this.f9262b);
            if (this.f8368g.m8676G()) {
                num = Integer.valueOf(this.f8368g.m8678x());
            }
            m9804v.m9701c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", valueOf, num);
            return true;
        }
        C1916f3 m8679y = this.f8368g.m8679y();
        boolean m8371D = m8679y.m8371D();
        if (c1949h5.m8492N()) {
            if (!m8679y.m8373F()) {
                this.f8369h.f8714a.mo9577b().m9805w().m9700b("No number filter for long property. property", this.f8369h.f8714a.m10022D().m9643f(c1949h5.m8489C()));
            } else {
                bool = AbstractC2519z9.m10123j(AbstractC2519z9.m10121h(c1949h5.m8496y(), m8679y.m8376z()), m8371D);
            }
        } else if (c1949h5.m8491M()) {
            if (!m8679y.m8373F()) {
                this.f8369h.f8714a.mo9577b().m9805w().m9700b("No number filter for double property. property", this.f8369h.f8714a.m10022D().m9643f(c1949h5.m8489C()));
            } else {
                bool = AbstractC2519z9.m10123j(AbstractC2519z9.m10120g(c1949h5.m8495x(), m8679y.m8376z()), m8371D);
            }
        } else if (c1949h5.m8494P()) {
            if (!m8679y.m8375H()) {
                if (!m8679y.m8373F()) {
                    this.f8369h.f8714a.mo9577b().m9805w().m9700b("No string or number filter defined. property", this.f8369h.f8714a.m10022D().m9643f(c1949h5.m8489C()));
                } else if (C2343j9.m9672N(c1949h5.m8490D())) {
                    bool = AbstractC2519z9.m10123j(AbstractC2519z9.m10122i(c1949h5.m8490D(), m8679y.m8376z()), m8371D);
                } else {
                    this.f8369h.f8714a.mo9577b().m9805w().m9701c("Invalid user property value for Numeric number filter. property, value", this.f8369h.f8714a.m10022D().m9643f(c1949h5.m8489C()), c1949h5.m8490D());
                }
            } else {
                bool = AbstractC2519z9.m10123j(AbstractC2519z9.m10119f(c1949h5.m8490D(), m8679y.m8369A(), this.f8369h.f8714a.mo9577b()), m8371D);
            }
        } else {
            this.f8369h.f8714a.mo9577b().m9805w().m9700b("User property has no value, property", this.f8369h.f8714a.m10022D().m9643f(c1949h5.m8489C()));
        }
        C2348k3 m9804v2 = this.f8369h.f8714a.mo9577b().m9804v();
        if (bool == null) {
            obj = "null";
        } else {
            obj = bool;
        }
        m9804v2.m9700b("Property filter result", obj);
        if (bool == null) {
            return false;
        }
        this.f9263c = Boolean.TRUE;
        if (m8675F && !bool.booleanValue()) {
            return true;
        }
        if (!z10 || this.f8368g.m8673D()) {
            this.f9264d = bool;
        }
        if (bool.booleanValue() && z11 && c1949h5.m8493O()) {
            long m8497z = c1949h5.m8497z();
            if (l10 != null) {
                m8497z = l10.longValue();
            }
            if (m9614B && this.f8368g.m8673D() && !this.f8368g.m8674E() && l11 != null) {
                m8497z = l11.longValue();
            }
            if (this.f8368g.m8674E()) {
                this.f9266f = Long.valueOf(m8497z);
            } else {
                this.f9265e = Long.valueOf(m8497z);
            }
        }
        return true;
    }
}
