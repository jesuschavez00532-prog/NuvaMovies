package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.a0 */
/* loaded from: classes.dex */
public final class C1833a0 extends AbstractC2183x {
    /* JADX INFO: Access modifiers changed from: protected */
    public C1833a0() {
        this.f8243a.add(EnumC2034n0.APPLY);
        this.f8243a.add(EnumC2034n0.BLOCK);
        this.f8243a.add(EnumC2034n0.BREAK);
        this.f8243a.add(EnumC2034n0.CASE);
        this.f8243a.add(EnumC2034n0.DEFAULT);
        this.f8243a.add(EnumC2034n0.CONTINUE);
        this.f8243a.add(EnumC2034n0.DEFINE_FUNCTION);
        this.f8243a.add(EnumC2034n0.FN);
        this.f8243a.add(EnumC2034n0.IF);
        this.f8243a.add(EnumC2034n0.QUOTE);
        this.f8243a.add(EnumC2034n0.RETURN);
        this.f8243a.add(EnumC2034n0.SWITCH);
        this.f8243a.add(EnumC2034n0.TERNARY);
    }

    /* renamed from: c */
    private static InterfaceC2078q m8079c(C2158v4 c2158v4, List list) {
        AbstractC2174w5.m9079i(EnumC2034n0.FN.name(), 2, list);
        InterfaceC2078q m9027b = c2158v4.m9027b((InterfaceC2078q) list.get(0));
        InterfaceC2078q m9027b2 = c2158v4.m9027b((InterfaceC2078q) list.get(1));
        if (m9027b2 instanceof C1912f) {
            List m8362x = ((C1912f) m9027b2).m8362x();
            List arrayList = new ArrayList();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new C2063p(m9027b.mo8351i(), m8362x, arrayList, c2158v4);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", m9027b2.getClass().getCanonicalName()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0129, code lost:
    
        if (r8.equals("continue") == false) goto L64;
     */
    @Override // com.google.android.gms.internal.measurement.AbstractC2183x
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.InterfaceC2078q mo8080a(java.lang.String r8, com.google.android.gms.internal.measurement.C2158v4 r9, java.util.List r10) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1833a0.mo8080a(java.lang.String, com.google.android.gms.internal.measurement.v4, java.util.List):com.google.android.gms.internal.measurement.q");
    }
}
