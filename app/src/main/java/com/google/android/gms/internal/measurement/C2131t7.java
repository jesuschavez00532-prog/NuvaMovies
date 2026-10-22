package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.measurement.t7 */
/* loaded from: classes.dex */
final class C2131t7 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        AbstractC1873c8 abstractC1873c8 = (AbstractC1873c8) obj;
        AbstractC1873c8 abstractC1873c82 = (AbstractC1873c8) obj2;
        C2116s7 c2116s7 = new C2116s7(abstractC1873c8);
        C2116s7 c2116s72 = new C2116s7(abstractC1873c82);
        while (c2116s7.hasNext() && c2116s72.hasNext()) {
            int compareTo = Integer.valueOf(c2116s7.mo8912a() & 255).compareTo(Integer.valueOf(c2116s72.mo8912a() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(abstractC1873c8.mo8182i()).compareTo(Integer.valueOf(abstractC1873c82.mo8182i()));
    }
}
