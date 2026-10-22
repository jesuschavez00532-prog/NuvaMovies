package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.C2406p6;
import com.google.android.gms.measurement.internal.C2415q4;
import java.util.List;
import java.util.Map;
import p219l4.AbstractC5391n;

/* renamed from: com.google.android.gms.measurement.b */
/* loaded from: classes.dex */
final class C2229b extends AbstractC2232e {

    /* renamed from: a */
    private final C2415q4 f8322a;

    /* renamed from: b */
    private final C2406p6 f8323b;

    public C2229b(C2415q4 c2415q4) {
        super(null);
        AbstractC5391n.m21783i(c2415q4);
        this.f8322a = c2415q4;
        this.f8323b = c2415q4.m10026I();
    }

    @Override // p025b5.InterfaceC1125w
    /* renamed from: e */
    public final long mo5091e() {
        return this.f8322a.m10031N().m9948r0();
    }

    @Override // p025b5.InterfaceC1125w
    /* renamed from: h */
    public final String mo5092h() {
        return this.f8323b.m9989V();
    }

    @Override // p025b5.InterfaceC1125w
    /* renamed from: i */
    public final String mo5093i() {
        return this.f8323b.m9990W();
    }

    @Override // p025b5.InterfaceC1125w
    /* renamed from: l */
    public final String mo5094l() {
        return this.f8323b.m9991X();
    }

    @Override // p025b5.InterfaceC1125w
    /* renamed from: m */
    public final String mo5095m() {
        return this.f8323b.m9989V();
    }

    @Override // p025b5.InterfaceC1125w
    /* renamed from: n */
    public final int mo5096n(String str) {
        this.f8323b.m9984Q(str);
        return 25;
    }

    @Override // p025b5.InterfaceC1125w
    /* renamed from: o */
    public final List mo5097o(String str, String str2) {
        return this.f8323b.m9993Z(str, str2);
    }

    @Override // p025b5.InterfaceC1125w
    /* renamed from: p */
    public final Map mo5098p(String str, String str2, boolean z10) {
        return this.f8323b.m9994a0(str, str2, z10);
    }

    @Override // p025b5.InterfaceC1125w
    /* renamed from: q */
    public final void mo5099q(Bundle bundle) {
        this.f8323b.m9973D(bundle);
    }

    @Override // p025b5.InterfaceC1125w
    /* renamed from: r */
    public final void mo5100r(String str, String str2, Bundle bundle) {
        this.f8323b.m9999r(str, str2, bundle);
    }

    @Override // p025b5.InterfaceC1125w
    /* renamed from: s */
    public final void mo5101s(String str) {
        this.f8322a.m10050y().m9425l(str, this.f8322a.mo9578c().mo24748b());
    }

    @Override // p025b5.InterfaceC1125w
    /* renamed from: t */
    public final void mo5102t(String str, String str2, Bundle bundle) {
        this.f8322a.m10026I().m9996o(str, str2, bundle);
    }

    @Override // p025b5.InterfaceC1125w
    /* renamed from: u */
    public final void mo5103u(String str) {
        this.f8322a.m10050y().m9426m(str, this.f8322a.mo9578c().mo24748b());
    }
}
