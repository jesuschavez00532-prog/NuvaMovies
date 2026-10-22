package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.c0 */
/* loaded from: classes.dex */
public final class C1865c0 implements Comparator {

    /* renamed from: a */
    final /* synthetic */ AbstractC1973j f7685a;

    /* renamed from: b */
    final /* synthetic */ C2158v4 f7686b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1865c0(AbstractC1973j abstractC1973j, C2158v4 c2158v4) {
        this.f7685a = abstractC1973j;
        this.f7686b = c2158v4;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC2078q interfaceC2078q = (InterfaceC2078q) obj;
        InterfaceC2078q interfaceC2078q2 = (InterfaceC2078q) obj2;
        AbstractC1973j abstractC1973j = this.f7685a;
        C2158v4 c2158v4 = this.f7686b;
        if (interfaceC2078q instanceof C2153v) {
            if (!(interfaceC2078q2 instanceof C2153v)) {
                return 1;
            }
            return 0;
        }
        if (interfaceC2078q2 instanceof C2153v) {
            return -1;
        }
        if (abstractC1973j == null) {
            return interfaceC2078q.mo8351i().compareTo(interfaceC2078q2.mo8351i());
        }
        return (int) AbstractC2174w5.m9071a(abstractC1973j.mo8107a(c2158v4, Arrays.asList(interfaceC2078q, interfaceC2078q2)).mo8350h().doubleValue());
    }
}
